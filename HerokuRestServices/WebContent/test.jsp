<html>
<head>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- <script type="text/javascript" src="js/jquery.ajax-cross-origin.min.js"></script> -->
</head>

<body>

	<button id="ajax">ajax call</button>
	<button id="json">json</button>

	<script type="text/javascript">
		$('#json').click(
				function() {
					alert('json');
					$.get("http://samplewebapp1.herokuapp.com/rest/json/get")
							.done(function(data) {
								console.log(data);
							});
				});

		/* 	var xhr = new XMLHttpRequest();
			xhr.open("GET", "http://samplewebapp1.herokuapp.com/rest/json/get",
					true);
			xhr.setRequestHeader("Access-Control-Allow-Origin", "*");
			xhr.onload = function() {
				console.log(xhr.responseText);
			};
			xhr.send(); */

		/* $('#ajax').click(function() {
			alert('ajax');
			$.ajax({
				url : 'http://samplewebapp1.herokuapp.com/rest/json/get?callback=?',
				dataType : 'JSONP',
				jsonpCallback : 'callbackFnc',
				type : 'GET',
				async : false,
				crossDomain : true,
				success : function() {
					alert(data);
					
				},
				failure : function() {
				},
				complete : function(data) {
					if (data.readyState == '4' && data.status == '200') {
						 
					} else {
						alert('Failed');
					}
				}
			});
		}); */

		$('#ajax')
				.click(
						function() {
							alert('ajax');
							$
									.ajax({
										url : 'http://samplewebapp1.herokuapp.com/rest/json/get',
										crossOrigin : true,
										success : function(data) {
											console.log(data);
											console.log(data.appName);
											document.getElementById("appName").innerHTML = data.appName;
											document
													.getElementById("requestCreatedTime").innerHTML = data.requestCreatedTime;
											document.getElementById("language").innerHTML = data.language;
										}
									});
						});
	</script>
	<br> AppName:
	<span id="appName"></span>
	<br /> Language:
	<span id="language"></span>
	<br /> Request Time:
	<span id="requestCreatedTime"></span>
	<br />


</body>

</html>