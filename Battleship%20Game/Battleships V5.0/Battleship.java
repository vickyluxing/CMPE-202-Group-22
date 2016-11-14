import org.json.JSONObject ;
import org.restlet.resource.*;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.data.* ;


public class Battleship  
{
    // instance variables - replace the example below with your own
    private String URL = "http://aws.nguyenresearch.com:8181/gumball" ;
    ClientResource client ; 

    public Battleship()
    {
        client=new ClientResource(URL);
    }
    
    public void blueClick(int n){
        JSONObject json_blue_click = new JSONObject();
        json_blue_click.put("number", n);
        client.post(new JsonRepresentation(json_blue_click), MediaType.APPLICATION_JSON);
    }
    
    public void blackClick(int n){
        JSONObject json_black_click = new JSONObject();
        json_black_click.put("number", n);
        client.post(new JsonRepresentation(json_black_click), MediaType.APPLICATION_JSON);
    }
    
    public void sendTarget(int n){
        JSONObject json_target = new JSONObject();
        json_target.put("number", n);
        client.post(new JsonRepresentation(json_target), MediaType.APPLICATION_JSON);
    }
    
    public String toString() {
        String result = "" ;
        Representation result_string = client.get() ; //get method response from server
        try {
          JSONObject json = new JSONObject( result_string.getText() ) ;
          result = (String) json.get("banner") ;
        }
        catch (Exception e) {
          result = e.getMessage() ;
        }          
        return result ;
  }
        
}
