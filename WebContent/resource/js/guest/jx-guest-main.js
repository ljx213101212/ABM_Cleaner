 $("#menu-close").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Opens the sidebar menu
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });

    // Scrolls to the selected menu item on the page
    $(function() {
        $('a[href*=#]:not([href=#])').click(function() {
            if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {

                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });
    });
    
    $("#btnSubmit").click(function () {
    	
    	//alert("123");
        var userName = $("#username").val();
        var password = $("#password").val();
        //alert(userName);
        login(userName,password);
        
    });
    
    function login(userName, password) {
		
    	var email = userName;
    	var password = password;
    	var input = {};
    	//alert(email);
    	input.email = email;
    	input.password = password;
    	var inputStr = JSON.stringify(input);
    	inputStr = encodeURIComponent(inputStr);
    	
        $.ajax
        ({
            type: "POST",
            //the url where you want to sent the userName and password to
            url: 'LoginAdminServlet?input='+inputStr,
            dataType: 'json',
            async: false,
            //json object to sent to the authentication url
            //data: {"username": "' + userName + '", "password" : "' + password + '"},
            
            error : function(err){
            	console.log(err);
            	alert("System failed to login");
            },
            success: function (data) {
                //do any process for successful authentication here
               
            	console.log(data);
            	var status = data.status;
            	var message = data.message;
            	
            	if (status == 1) {
            		var adminMessage = message;
            		alert('Login status: ' + data.adminMessage);
            		window.location.href = 'http://www.mozilla.org';
            	}
                
            }
         });
    }