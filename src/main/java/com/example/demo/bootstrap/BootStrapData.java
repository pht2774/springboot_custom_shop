package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        if (partRepository.count() == 0 && productRepository.count() == 0) {

            // part 1
            OutsourcedPart o = new OutsourcedPart();
            o.setCompanyName("MediaTek");
            o.setName("Helio SOC");
            o.setInv(5);
            o.setPrice(20.0);
            o.setId(100L);
            o.setMinIvn(0);
            o.setMaxInv(50);
            outsourcedPartRepository.save(o);

            // part 2
            OutsourcedPart o1 = new OutsourcedPart();
            o1.setCompanyName("LG Display");
            o1.setName("LCD");
            o1.setInv(10);
            o1.setPrice(30.0);
            o1.setId(101L);
            o1.setMinIvn(0);
            o1.setMaxInv(100);
            outsourcedPartRepository.save(o1);

            // part 3
            OutsourcedPart o2 = new OutsourcedPart();
            o2.setCompanyName("LG Chem");
            o2.setName("Battery");
            o2.setInv(30);
            o2.setPrice(10.0);
            o2.setId(102L);
            o2.setMinIvn(0);
            o2.setMaxInv(60);
            outsourcedPartRepository.save(o2);

            // part 4
            OutsourcedPart o3 = new OutsourcedPart();
            o3.setCompanyName("PGC");
            o3.setName("Housing");
            o3.setInv(50);
            o3.setPrice(3.0);
            o3.setId(103L);
            o3.setMinIvn(0);
            o3.setMaxInv(150);
            outsourcedPartRepository.save(o3);

            // part 5
            OutsourcedPart o4 = new OutsourcedPart();
            o4.setCompanyName("Precise Composite");
            o4.setName("Screw");
            o4.setInv(100);
            o4.setPrice(1.0);
            o4.setId(104L);
            o4.setMinIvn(0);
            o4.setMaxInv(300);
            outsourcedPartRepository.save(o4);

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
            // products
            Product rg35xx= new Product("RG35XX",65.0,20);
            Product rg405v= new Product("RG405V",120.0,15);
            Product rgnano= new Product("RG Nano",59.0,10);
            Product rg405m= new Product("RG405M",200.0,25);
            Product rg353p= new Product("RG353P",150.0,25);
            productRepository.save(rg35xx);
            productRepository.save(rg405v);
            productRepository.save(rgnano);
            productRepository.save(rg405m);
            productRepository.save(rg353p);

            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());
        }
    }
}
