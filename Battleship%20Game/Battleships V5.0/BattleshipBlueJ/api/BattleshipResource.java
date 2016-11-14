package api;
import org.json.* ;
import org.restlet.representation.* ;
import org.restlet.ext.json.* ;
import org.restlet.resource.* ;
import battlesrc.Battleship;

public class BattleshipResource extends ServerResource
{
    Battleship battleship=new Battleship();
    
    @Get
    public Representation get() throws JSONException{
        
        JSONObject json=new JSONObject();
        json.put("test","test");
        
        return new JsonRepresentation(json);
    }
}
