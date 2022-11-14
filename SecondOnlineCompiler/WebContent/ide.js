let editor;

window.onload = function() {
    editor = ace.edit("editor");
    editor.setTheme("ace/theme/monokai");
    editor.session.setMode("ace/mode/c_cpp");
}

function changeLanguage() {

    let language = $("#languages").val();

    if(language == 'c' || language == 'cpp')editor.session.setMode("ace/mode/c_cpp");
    else if(language == 'php')editor.session.setMode("ace/mode/php");
    else if(language == 'python')editor.session.setMode("ace/mode/python");
    else if(language == 'java')editor.session.setMode("ace/mode/java");
}

function executeCode() {

	const mg = document.getElementById('msg');
	let dd = ''+ mg.value;

    $.ajax({

        url: "ChekServlet",

        method: "POST",

        data: {
            language: $("#languages").val(),
            code: editor.getSession().getValue(),
            msg: $("#msg").val()
        },

        success: function(response) {
            $(".output").html(response)
            
        }
    })
//    $.post("ChekServlet",
//        {
//    	language: $("#languages").val(),
//        code: editor.getSession().getValue()
//    }, function(response, status) {
//    	 $(".output").text(response)
//        }
//)
	
}