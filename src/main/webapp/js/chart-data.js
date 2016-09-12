
var randomScalingFactor = function(){ return Math.round(Math.random()*1000)};
	
	 !function(){
	laydate.skin('molv');//�л�Ƥ�����鿴skins����Ƥ���
	laydate({elem: '#demo'});//��Ԫ��
}();

//�Զ������ڸ�ʽ
var datas1,datas2;
laydate({
    elem: '#test1',
    format: 'YYYY.MM.DD',
    festival: true, //��ʾ����
    choose: function(datas){ //ѡ��������ϵĻص�
        datas1=datas;
    }
});
laydate({
    elem: '#test2',
    format: 'YYYY.MM.DD',
    festival: true, //��ʾ����
    choose: function(datas){ //ѡ��������ϵĻص�
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
										var a = data.xAxis;
										var b = data.series;
										$('#container-line').highcharts({
											title: {
												text: '航班销售情况曲线图',
												x: -20 //center
											},
											subtitle: {
												text: '',
												x: -20
											},
											xAxis: {
												categories: a
											},
											yAxis: {	
												title: {
													text: '销售量 /次'
												},
												plotLines: [{
													value: 0,
													width: 1,
													color: '#808080'
												}]
											},
											tooltip: {
												valueSuffix: '次'
											},
											legend: {
												layout: 'vertical',
												align: 'right',
												verticalAlign: 'middle',
												borderWidth: 0
											},
											series:b
    });
                                        },
								 error: function(data){
									//����������
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