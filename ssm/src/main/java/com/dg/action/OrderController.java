package com.dg.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dg.bean.OrderInfoBean;
import com.dg.service.IOrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Resource(name = "orderService")
	private IOrderService orderService;

	@RequestMapping("/showOrder")
	public ModelAndView showOrder(HttpServletRequest request, OrderInfoBean orderInfo, ModelMap model) {

		OrderInfoBean order = orderService.getOrderByPK(orderInfo.getOrdDate(), orderInfo.getOrdId());
		model.put("order", order);
		return new ModelAndView("showOrder", model);
	}

	@RequestMapping("/listOrders")
	public ModelAndView listOrders(HttpServletRequest request, ModelMap model) {

		String startDate = (String) request.getParameter("startDate");
		String endDate = (String) request.getParameter("endDate");

		List<OrderInfoBean> orderList = orderService.getOrdersByCond(startDate, endDate);
		model.put("orderList", orderList);
		return new ModelAndView("listOrders", model);
	}

	/**
	 * 执行删除操作时，redis缓存会执行 clear操作，将相应key的缓存清空
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/deleteOrder")
	public ModelAndView deleteOrder(HttpServletRequest request, ModelMap model) {

		String ordDate = (String) request.getParameter("ordDate");
		String ordId = (String) request.getParameter("ordId");

		orderService.removeOrder(ordDate, ordId);
		
		List<OrderInfoBean> orderList = orderService.getOrdersByCond("20160324", "20160326");
		model.put("orderList", orderList);
		return new ModelAndView("listOrders", model);
	}
}
