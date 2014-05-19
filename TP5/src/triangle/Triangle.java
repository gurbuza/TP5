package triangle;

public class Triangle
{
    private int premierCoté;
    private int deuxiemeCoté;
    private int troisiemeCoté;

    public Triangle(int cote1, int cote2, int cote3) throws TriangleInvalide
    {
        this.premierCoté = cote1;
        this.deuxiemeCoté = cote2;
        this.troisiemeCoté = cote3;
    }

    public static boolean estUnTriangle(int cote1, int cote2, int cote3)
    {
        int test = (cote1 + cote2 + cote3) / 2;
        if ((test < cote1) || (test < cote2) || (test < cote3) || (cote1 <= 0)
                || (cote2 <= 0) || (cote3 <= 0))
        {
            return false;
        }
        return true;

    }

    public boolean estIsocele()
    {
        return ((this.premierCoté == this.deuxiemeCoté)
                || (this.premierCoté == this.troisiemeCoté) || (this.deuxiemeCoté == this.troisiemeCoté));
    }

    public boolean estEquilateral()
    {
        return ((this.premierCoté == this.deuxiemeCoté) && (this.premierCoté == this.troisiemeCoté));
    }

    public boolean estRectangle()
    {
        int hypothenus;
        int cote;
        if ((premierCoté > deuxiemeCoté) && (premierCoté > troisiemeCoté))
        {
            hypothenus = (premierCoté * premierCoté);
            cote = ((deuxiemeCoté * deuxiemeCoté) + (troisiemeCoté * troisiemeCoté));
            if (hypothenus == cote)
            {
                return true;
            }
        }

        if ((deuxiemeCoté > troisiemeCoté) && (deuxiemeCoté > premierCoté))
        {
            hypothenus = (deuxiemeCoté * deuxiemeCoté);
            cote = ((premierCoté * premierCoté) + (troisiemeCoté * troisiemeCoté));
            if (hypothenus == cote)
            {
                return true;
            }
        }

        if ((troisiemeCoté > deuxiemeCoté) && (troisiemeCoté > premierCoté))
        {
            hypothenus = (troisiemeCoté * troisiemeCoté);
            cote = ((deuxiemeCoté * deuxiemeCoté) + (premierCoté * premierCoté));
            if (hypothenus == cote)
            {
                return true;
            }
        }
        return false;
    }

    /* affiche valeur des 3 cotés */
    public String toString()
    {
        return "coté1=" + this.premierCoté + "coté2=" + this.deuxiemeCoté
                + "coté3=" + this.troisiemeCoté;
    }

}
