import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BootAdminUsersComponent } from './boot-admin-users.component';

describe('BootAdminUsersComponent', () => {
  let component: BootAdminUsersComponent;
  let fixture: ComponentFixture<BootAdminUsersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BootAdminUsersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BootAdminUsersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
