package com.shahrukh.autocare;
import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/queries") public class CarQueryController {
 private final CarQueryRepository repo; public CarQueryController(CarQueryRepository repo){this.repo=repo;}
 @PostMapping public ResponseEntity<?> create(@RequestBody CreateQueryRequest r){
  if(r.carModel()==null||r.carModel().isBlank()||r.serviceType()==null||r.serviceType().isBlank()||r.description()==null||r.description().isBlank())
   return ResponseEntity.badRequest().body(Map.of("message","Car, service and description are required."));
  CarQuery q=new CarQuery(); q.setCarModel(r.carModel().trim()); q.setServiceType(r.serviceType().trim()); q.setDescription(r.description().trim()); q.setPhotoName(r.photoName());
  return ResponseEntity.ok(repo.save(q));
 }
 @GetMapping public List<CarQuery> all(){return repo.findAll();}
}