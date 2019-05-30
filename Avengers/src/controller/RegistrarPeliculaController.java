package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Clasificacion;
import entities.Estado;
import entities.Genero;
import entities.Heroe;
import entities.Pelicula;
import services.ClasificacionDao;
import services.EstadoDao;
import services.GeneroDao;
import services.HeroeDao;
import services.PeliculaDao;

/**
 * Servlet implementation class RegistrarPeliculaController
 */
@WebServlet("/RegistrarPeliculaController")
public class RegistrarPeliculaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarPeliculaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		String nombre=request.getParameter("nombre");
		String sinopsis=request.getParameter("sinopsis");
		String clasificacion=request.getParameter("clasificacion");

			
			int fechaL=Integer.parseInt(request.getParameter("fechaL"));
			int fechaS=Integer.parseInt(request.getParameter("fechaS"));
			Pelicula p= new Pelicula();
			PeliculaDao pDao = new PeliculaDao();
			ClasificacionDao cDao=new ClasificacionDao();
			
			Clasificacion c = cDao.find(clasificacion);
			
			p.setAnolanzamiento(fechaL);
			p.setAnosecuencia(fechaS);
			p.setNombre(nombre);
			p.setSinopsis(sinopsis);
			p.setClasificacionBean(c);
			
			pDao.insert(p);			
			response.sendRedirect("index.jsp");
	}

}
