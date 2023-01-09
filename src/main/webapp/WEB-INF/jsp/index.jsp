<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt_br">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Desafio Java</title>
      <link href="
      <c:url value="/static/node_modules/bootstrap/dist/css/bootstrap.min.css"/>
      "rel="stylesheet">
      <link href="
      <c:url value="/static/node_modules/datatables.net-bs5/css/dataTables.bootstrap5.min.css"/>
      "rel="stylesheet">
   </head>
   <body></body>
   <div class="container-fluid">
      <h2 class="text-center">Gerenciamento de Projetos</h2>
      <p class="datatable design text-center">Gerenciamento de Projetos</p>
      <div class="row">
         <div class="container">
            <div class="btnAdd">
               <a href="#!" data-id="" data-bs-toggle="modal" data-bs-target="#addProjectModal" class="btn btn-success btn-sm">Add Project</a>
            </div>
            <div class="row">
               <div class="col-md-2"></div>
               <div class="col-md-8">
                  <table id="example" class="table">
                     <thead>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Inicio</th>
                        <th>Gerente</th>
                        <th>Fim</th>
                        <th>Orçamento</th>
                        <th>Descriçao</th>
                        <th>Status</th>
                     </thead>
                     <tbody>
                        <tr>
                           <td>Tiger Nixon</td>
                           <td>System Architect</td>
                           <td>Edinburgh</td>
                           <td>61</td>
                           <td>2011-04-25</td>
                           <td>$320,800</td>
                           <td>System Architect</td>
                           <td>Edinburgh</td>
                        </tr>
                     </tbody>
                  </table>
               </div>
               <div class="col-md-2"></div>
            </div>
         </div>
      </div>
   </div>
   <!-- Add project Modal
      nome, dados de início, gerente responsável, previsão de termos, dados reais de termos, orçamento total, descrição e status
      -->
   <div class="modal fade" id="addProjectModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog">
         <div class="modal-content">
            <div class="modal-header">
               <h5 class="modal-title" id="exampleModalLabel">Adicionar Projeto</h5>
               <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
               <form id="addProject" action="projectServletController" method="post">
                  <div class="mb-3 row">
                     <label for="addNameField" class="col-md-3 form-label">Nome</label>
                     <div class="col-md-9">
                        <input type="text" class="form-control" id="addNameField" name="Name">
                     </div>
                  </div>
                  <div class="mb-3 row">
                     <label for="addInitialDateField" class="col-md-3">Data inicial</label>
                     <div class="col-md-9">
                        <input id="addInitialDateField" name="InitialDate" class="form-control" type="date" />
                     </div>
                  </div>
                  <div class="mb-3 row">
                     <label for="addResponsibleManagerField" class="col-md-3 form-label">Gerente</label>
                     <div class="col-md-9">
                        <input type="text" class="form-control" id="addResponsibleManagerField" name="ResponsibleManager">
                     </div>
                  </div>
                  <div class="mb-3 row">
                     <label for="addRealEndDateField" class="col-md-3">Data fim real</label>
                     <div class="col-md-9">
                        <input id="addRealEndDateField" name="RealEndDate" class="form-control" type="date" />
                     </div>
                  </div>
                  <div class="mb-3 row">
                     <label for="addTotalBudgetField" class="col-md-3 form-label">Orcamento total</label>
                     <div class="col-md-9">
                        <input type="text" class="form-control" id="addTotalBudgetField" name="TotalBudget">
                     </div>
                  </div>
                  <div class="mb-3 row">
                     <label for="addDescriptionField" class="col-md-3 form-label">Descricao</label>
                     <div class="col-md-9">
                        <input type="text" class="form-control" id="addDescriptionField" name="Description">
                     </div>
                  </div>
                  <div class="mb-3 row">
                     <label for="addStatusField" class="col-md-3 form-label">Status</label>
                     <div class="col-md-9">
                        <select class="form-select mb-3" id="addStatusField" name="Status" aria-label="Select example">
                           <option selected>Select a Status</option>
                           <option value="1">One</option>
                           <option value="2">Two</option>
                           <option value="3">Three</option>
                        </select>
                     </div>
                  </div>
                  <div class="text-center">
                     <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
               </form>
            </div>
            <div class="modal-footer">
               <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            </div>
         </div>
      </div>
   </div>
   <script type="text/javascript" src="static/node_modules/datatables.net-bs5/js/dataTables.bootstrap5.min.js"></script>
   <script src="
   <c:url value="/static/node_modules/bootstrap/dist/js/bootstrap.min.js"/>
   "></script>
</html>