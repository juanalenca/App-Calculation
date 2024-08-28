//modulos agrupam conjuntos de pacotes e pacotes agrupam conjuntos de classes
module app.calculation {
	
	//requerendo o pacote logging
	//o transitive é para marcar que o pacote que foi requerido pode ser acessado para outros modulos terceirros
	requires transitive app_logging;
	
	//exportando o arquivo para acessar a partir de outros módulos
	//e não pode haver depedÊncia cíclica
	exports br.com.cod3r.app.calculation;
	
	/*
	Você não está dependendo do modulo financial, vocÊ está apenas
	abrindo a possibilidade do modulo financial acessar as classes internal
	dentro do modulo calculation. Se quiser colocar mais modulos que terão
	acesso a esse pacote basta separar por virgula
	*/
	exports br.com.cod3r.app.calculation.internal to app.financial;
	
}