package CC_ze;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Krypt
{
	
	static String base64Decode(String value)
	{
		
		
		try
		{
			byte[] decodedValue = Base64.getDecoder().decode(value);
			return new String(decodedValue, StandardCharsets.UTF_8.toString());
		}
		catch (UnsupportedEncodingException ex)
		{
			throw new RuntimeException(ex);
		}
		
		
	}
	
	static String base64Encode(String value)
	{
		
		
		try
		{
			return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));
		}
		catch (UnsupportedEncodingException ex)
		{
			throw new RuntimeException(ex);
		}
		
		
	}
}
