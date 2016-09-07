var randomScalingFactor = function(){ return Math.round(Math.random()*1000)};
	
	 !function(){
	laydate.skin('molv');//切换皮肤，请查看skins下面皮肤库
	laydate({elem: '#demo'});//绑定元素
}();

//自定义日期格式
var datas1,datas2;
laydate({
    elem: '#test1',
    format: 'YYYY.MM.DD',
    festival: true, //显示节日
    choose: function(datas){ //选择日期完毕的回调
        datas1=datas;
    }
});
laydate({
    elem: '#test2',
    format: 'YYYY.MM.DD',
    festival: true, //显示节日
    choose: function(datas){ //选择日期完毕的回调
        datas2=datas;
    }
});
var lineChartData;
    function find(){
           //alert(box[1].checked);
        var obj = document.getElementById("text0").value;
        alert(obj);
        alert(datas1);
        alert(datas2);
		var chart1=null;
			$.ajax({ 
                                        type: "get", 
                                        url: "http://localhost:8080/travel/getcount", 
										data:{"fights":obj,"start":datas1,"end":datas2},
										dataType : "json",
                                        success: function(data){
										//	alert("ok");
										//	alert(data.F);
										lineChartData=data;
										$('#line-chart').remove(); 
										$('#showChart').append('<canvas id="line-chart" width="600" height="200"></canvas>');
										var chart1 = document.getElementById('line-chart').getContext('2d');		
										window.myLine = new Chart(chart1).Line(lineChartData, {
										responsive: true
										}); 
										//myLine.destroy();
										lineChartData=null;
										// $("input#showTime").val(data[0].Xpoint); 
                                        },
								 error: function(data){
									//请求出错处理
									alert("123123");
								}     
								
		});
		
     }
	
	
		
	var barChartData = {
			labels : ["January","February","March","April","May","June","July","July","July"],
			datasets : [
				{
					fillColor : "rgba(220,220,220,0.5)",
					strokeColor : "rgba(220,220,220,0.8)",
					highlightFill: "rgba(220,220,220,0.75)",
					highlightStroke: "rgba(220,220,220,1)",
					data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
				},
				{
					fillColor : "rgba(48, 164, 255, 0.2)",
					strokeColor : "rgba(48, 164, 255, 0.8)",
					highlightFill : "rgba(48, 164, 255, 0.75)",
					highlightStroke : "rgba(48, 164, 255, 1)",
					data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
				}
			]
	
		}

	var pieData = [
				{
					value: 300,
					color:"#30a5ff",
					highlight: "#62b9fb",
					label: "Blue"
				},
				{
					value: 50,
					color: "#ffb53e",
					highlight: "#fac878",
					label: "Orange"
				},
				{
					value: 100,
					color: "#1ebfae",
					highlight: "#3cdfce",
					label: "Teal"
				},
				{
					value: 120,
					color: "#f9243f",
					highlight: "#f6495f",
					label: "Red"
				}

			];
			
	var doughnutData = [
					{
						value: 300,
						color:"#30a5ff",
						highlight: "#62b9fb",
						label: "Blue"
					},
					{
						value: 50,
						color: "#ffb53e",
						highlight: "#fac878",
						label: "Orange"
					},
					{
						value: 100,
						color: "#1ebfae",
						highlight: "#3cdfce",
						label: "Teal"
					},
					{
						value: 120,
						color: "#f9243f",
						highlight: "#f6495f",
						label: "Red"
					}
	
				];

window.onload = function(){
    
	
	var chart2 = document.getElementById("bar-chart").getContext("2d");
	window.myBar = new Chart(chart2).Bar(barChartData, {
		responsive : true
	});
	var chart3 = document.getElementById("doughnut-chart").getContext("2d");
	window.myDoughnut = new Chart(chart3).Doughnut(doughnutData, {responsive : true
	});
	var chart4 = document.getElementById("pie-chart").getContext("2d");
	window.myPie = new Chart(chart4).Pie(pieData, {responsive : true
	});

	
};