public class Consumo {
    private float km,tempo,litros,vMedia,pGas;
    
    public Consumo(){
        
    }
    public Consumo(float kml,float lt,float vM,float pG){
        km=kml;
        litros=lt;
        vMedia=vM;
        pGas=pG;
    }
    
    public void setKms(float kms){
        km=kms;
    }
    public void setLitros(float lt){
        litros=lt;
    }
    public void setVMed(float vM){
        vMedia=vM;
    }
    public void setPGas(float pG){
        pGas=pG;
    }
    public float getTempo (){
        tempo=km/vMedia;
        return tempo;
    }
    public float getCmedio(){
        float cmedio=(litros*100)/km;
        return cmedio;
    }
    public float getVmedia(){
        return vMedia;
    }
}
