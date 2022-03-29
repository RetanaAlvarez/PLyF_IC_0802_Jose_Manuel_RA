#include <stdio.h>
#include <stdlib.h>

float a,b,c,d,e,f,g,h,entero,decimal,i,j,k,l,total;
int main(int argc, char const *argv[])
{
	system("cls");
	printf("ingrese el valor de los entero (en binario) \n");
	printf("[15]:");
	scanf("%f",&a);//128
	printf("[14]:");
	scanf("%f",&b);//64
	printf("[13]:");
	scanf("%f",&c);//32
	printf("[12]:");
	scanf("%f",&d);//16
	printf("[11]:");
	scanf("%f",&e);//8
	printf("[10]:");
	scanf("%f",&f);//4
	printf("[9]:");	
	scanf("%f",&g);//2
	printf("[8]:");
	scanf("%f",&h);//1
	entero=(h*1+g*2+f*4+e*8+d*16+c*32+b*64+a*128);
	printf("los valor que colocaste son: %.0f %.0f %.0f %.0f %.0f %.0f %.0f \n",a,b,d,e,f,g,h );
	printf("ingresa los valores del decimal (en binario) \n");
	printf("[7]:");
	scanf("%f",&i);//.5
	printf("[6]:");
	scanf("%f",&j);//.25
	printf("[5]:");
	scanf("%f",&k);//.125
	printf("[4]:");	
	scanf("%f",&l);//.0625
	decimal=(i*.5+j*.25+k*.125+l*0.0625);
	printf("tu numero entero es: %.4f \n",entero );
	printf("tu numero decimal es: %.4f \n",decimal);	
	total=entero+decimal;
	printf("el total es:%f\n",total );
}