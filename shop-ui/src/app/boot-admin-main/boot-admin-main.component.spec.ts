import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BootAdminMainComponent } from './boot-admin-main.component';

describe('BootAdminMainComponent', () => {
  let component: BootAdminMainComponent;
  let fixture: ComponentFixture<BootAdminMainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BootAdminMainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BootAdminMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
