����   = M  poo/Exfuncionario  java/lang/Object funcionarioContratar Ljava/lang/String; setorAtuacao horasMensais I salario <init> :(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V Code
     ()V	    	    	    		   
  LineNumberTable LocalVariableTable this Lpoo/Exfuncionario; getFuncionarioContratar ()Ljava/lang/String; setFuncionarioContratar (Ljava/lang/String;)V getSetorAtuacao setSetorAtuacao getHorasMensais ()I setHorasMensais (I)V 
getSalario 
setSalario imprimirInfo	 + - , java/lang/System . / out Ljava/io/PrintStream; 1 java/lang/StringBuilder 3 
Nome: 
 0 5   
 0 7 8 9 append -(Ljava/lang/String;)Ljava/lang/StringBuilder; ;  
Profissão:  =  
Horas trabahadas: 
 0 ? 8 @ (I)Ljava/lang/StringBuilder; B  
horas Salário: 
 0 D E  toString
 G I H java/io/PrintStream J   println 
SourceFile Exfuncionario.java !                  	    
    
        �     *� *+� *,� *� *� �              	           4                         	     
          /     *� �                                >     *+� �       
                          !      /     *� �                         "       >     *+� �       
    #  $                    # $     /     *� �           (              % &     >     *� �       
    -  .                 	   '      /     *� �           2              (       >     *+� �       
    7  8                
    )      l     >� *� 0Y2� 4*� � 6:� 6*� � 6<� 6*� � >A� 6*� � 6� C� F�       
    = = >        >      K    L