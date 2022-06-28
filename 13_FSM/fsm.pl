evento(irnote,"00",irnorte).
evento(irnorte,"10",irnorte).
evento(irnorte,"01",esperarnorte).
evento(irnorte,"11",esperarnorte).

evento(esperarnorte,"00",ireste).
evento(esperarnorte,"01",ireste).
evento(esperarnorte,"10",ireste).
evento(esperarnorte,"11",ireste).

evento(ireste,"00",ireste).
evento(ireste,"01",ireste).
evento(ireste,"10",esperareste).
evento(ireste,"11",esperareste).

evento(esperareste,"00",irnorte).
evento(esperareste,"01",irnorte).
evento(esperareste,"10",irnorte).
evento(esperareste,"11",irnorte).

%primero(irnorte,X,esperarnorte):-segundo(esperarnorte,write(" "),ireste).

%mover(01,gonorte,waitnort
trans(estado, entradas, X):- evento(estado,entrada, X).





