import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BootAdminComponent } from './boot-admin.component';

describe('BootAdminComponent', () => {
  let component: BootAdminComponent;
  let fixture: ComponentFixture<BootAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BootAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BootAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
