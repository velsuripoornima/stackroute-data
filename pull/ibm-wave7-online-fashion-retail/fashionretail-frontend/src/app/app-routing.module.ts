import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { ContactComponent } from './contact/contact.component';
import { HeroComponent } from './hero/hero.component';
import { AboutComponent } from './about/about.component';
import { ProfilebuttonComponent } from './profilebutton/profilebutton.component';
import { ManufactureviewprofileComponent } from './manufactureviewprofile/manufactureviewprofile.component';
import { AddmaterialsbuttonComponent } from './addmaterialsbutton/addmaterialsbutton.component';
import { SupplierviewprofileComponent } from './supplierviewprofile/supplierviewprofile.component';
import { BodyComponent } from './body/body.component';
import { DesignerprofileComponent } from './designerprofile/designerprofile.component';
import { DesignerviewprofileComponent } from './designerviewprofile/designerviewprofile.component';
import { DesignereditdialogueComponent } from './designereditdialogue/designereditdialogue.component';
import { DesignerHomePageComponent } from './designer-home-page/designer-home-page.component';
import { AddmaterialPageComponent } from './addmaterial-page/addmaterial-page.component';
import {ConsumerDashboardComponent} from './consumer-dashboard/consumer-dashboard.component';




const routes: Routes = [
  {path:'',component:HeroComponent},
  {path:'contact',component:ContactComponent},
  {path:'about', component:AboutComponent},
  {path:'edit', component:ProfilebuttonComponent},
  {path:'edit/manufactureviewprofile', component:ManufactureviewprofileComponent},
  // {path:'login',component:LoginComponent}
   {path:'addMaterial',component:AddmaterialsbuttonComponent},
  {path: 'designer',component: DesignerHomePageComponent
  },
  {path: 'edit', component:ProfilebuttonComponent},
  {path: 'edit/supplierviewprofile', component:SupplierviewprofileComponent},
  {path: 'supplier/home', component: BodyComponent},
  {path:'edit',component:DesignerprofileComponent},
  {path:'edit/designerviewprofile',component:DesignerviewprofileComponent},
  {path:'edit/designerviewprofile/designerEdit',component:DesignereditdialogueComponent},
  {
    path: 'materials' , component:AddmaterialPageComponent
  },
  {
    path: 'consumer' , component: ConsumerDashboardComponent
  },
  {
      path: '', component: BodyComponent
  },
  { path : '**/LogOut' ,component: HeroComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
