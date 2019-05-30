package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.Estado;
import entities.Genero;
import entities.Heroe;
import services.EstadoDao;
import services.GeneroDao;
import services.HeroeDao;

/**
 * Servlet implementation class EditarHeroeController
 */
@WebServlet("/EditarHeroeController")
public class EditarHeroeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarHeroeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//System.out.println(id);
		//response.sendRedirect("Editar.jsp?id="+request.getParameter("id"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
      	
      	int id=Integer.parseInt(request.getParameter("id"));    	
		String nombre=request.getParameter("nombre");
		String heroe=request.getParameter("heroe");
		String genero=request.getParameter("genero");
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
		String arma=request.getParameter("arma");
		GeneroDao gDao= new GeneroDao();
		Genero g= gDao.find(genero);
		EstadoDao eDao= new EstadoDao();
		Estado e= eDao.find(estado);
		
		HeroeDao hDao=new HeroeDao();		
		if(hDao.find(id)!=null) {
			
		Heroe h=hDao.find(id);
		h.setNombre(nombre);
		h.setHeroe(heroe);
		h.setGeneroBean(g);
		h.setEstadoBean(e);
		h.setDescripcion(descripcion);
		h.setArma(arma);
		Date fechaN=h.getFechanacimiento();
		Date fechaA=h.getFechaaparicion();
		h.setFechanacimiento(fechaN);
		h.setFechaaparicion(fechaA);
		
		hDao.update(h);
		
//		request.setAttribute("nombre", h.getNombre());
//		request.setAttribute("heroe", h.getHeroe());
//		request.setAttribute("genero", h.getGeneroBean());
//		request.setAttribute("estado", h.getEstadoBean());
//		request.setAttribute("descripcion", h.getDescripcion());
//		request.setAttribute("arma", h.getArma());
//		request.getRequestDispatcher("Editar.jsp").forward(request, response);
		
		response.sendRedirect("index.jsp");
		}
}
}