<!DOCTYPE html>
<!--
All rights Reserved - Luis CARVALHIDO
veronic@ Project
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        if(isset($_POST['values'])){
            echo "inside";
            print_r($_POST);
            
            
             print_r($_POST);
            
            $values=$_POST['values'];
            
            $values= json_decode($values, true);
            echo "<hr>";
            print_r($values);
            
            $api_temp_k=$values['main']['temp'];
            $api_hum=$values['main']['humidity'];
            
            //the temperature returned is in Kelvin, so i need to convert-it on CElsius
            $tempC=$api_temp_k - 273.15;
            echo intval($tempC);
            
            
            
        }
        ?>
        
        <div id="api_results">
            
        </div>
        
    </body>
    
    <script>
    const Http = new XMLHttpRequest();
        const url="http://api.openweathermap.org/data/2.5/weather?q=Gien,fr&APPID=af9c0125feb370c68eb81689ef7f5966";
        Http.open("GET", url);
        Http.send();
        Http.onreadystatechange=(e)=>{
            var response=Http.responseText;
            showvalues(response);
        }
    
    
    function showvalues(response){
        
        var ajaxRequest;
    
        try{
            ajaxRequest=new XMLHttpRequest();
        }
        catch(e){
            try{
                ajaxRequest=new ActiveXObject("Msxml2.XMLHTTP");
            }
            catch(e){
                //something went wrong
                alert("Your browser broke!!")
                return false;
            }
        }

        
        var url="meteo.php";
        var values="values="+response;
        ajaxRequest.open("POST",url,true);
        ajaxRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

        ajaxRequest.onreadystatechange = function(){ //call a function when the state changes
            if(ajaxRequest.readyState == 4 && ajaxRequest.status==200){
                //get variable to write ajax results
                var formcomponent=document.getElementById("api_results");
                //write results on html code
                formcomponent.innerHTML=ajaxRequest.responseText;
            }
        }
        ajaxRequest.send(values);
        
        
    }
    </script>
</html>
