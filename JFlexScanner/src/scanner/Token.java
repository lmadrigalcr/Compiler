package scanner;

/**
 * Represent a Token read by the scanner.
 * 
 * @author Leo
 */
public class Token {
    
    /**
     * The token itself.
     */
    private final String token;
    
    /**
     * The token category or type.
     */
    private final String type;
    
    /**
     * The line in which the token was read.
     */
    private final int line;
    
    /**
     * The column in which the token was read.
     */
    private final int column;
    
    /**
     * Instantiates a new Token.
     * 
     * @param token The token itself.
     * @param type The token category or type.
     * @param line The line in which the token was read.
     * @param column The column in which the token was read.
     */
    public Token (String token, String type, int line, int column)
    {
        this.token = token;
        this.type = type;
        this.line = line;
        this.column = column;
    }

    /**
     * Get the token.
     * 
     * @return The token.
     */
    public String getToken()
    {
        return token;
    }

    /**
     * Get the token type.
     * 
     * @return The token type.
     */
    public String getType()
    {
        return type;
    }

    /**
     * Get the token line.
     * 
     * @return The token line.
     */
    public int getLine()
    {
        return line;
    }

    /**
     * Get the token column.
     * 
     * @return The token column.
     */
    public int getColumn()
    {
        return column;
    }

    @Override
    public String toString()
    {
        return "Token {" + "token=" + token + ", type=" + type + ", line=" + line + ", column=" + column + '}';
    }
    
}