// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynAcceptBusConnection(serverbushandle : super::super::Foundation:: HANDLE, abortevent : super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynCloseBusHandle(bushandle : super::super::Foundation:: HANDLE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynConnectToBus(connectionspec : windows_sys::core::PCWSTR) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Security")]
// windows_link::link!("msajapi.dll" "system" fn AllJoynCreateBus(outbuffersize : u32, inbuffersize : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynEnumEvents(connectedbushandle : super::super::Foundation:: HANDLE, eventtoreset : super::super::Foundation:: HANDLE, eventtypes : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynEventSelect(connectedbushandle : super::super::Foundation:: HANDLE, eventhandle : super::super::Foundation:: HANDLE, eventtypes : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynReceiveFromBus(connectedbushandle : super::super::Foundation:: HANDLE, buffer : *mut core::ffi::c_void, bytestoread : u32, bytestransferred : *mut u32, reserved : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn AllJoynSendToBus(connectedbushandle : super::super::Foundation:: HANDLE, buffer : *const core::ffi::c_void, bytestowrite : u32, bytestransferred : *mut u32, reserved : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn QCC_StatusText(status : QStatus) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_create(defaultlanguage : windows_sys::core::PCSTR) -> alljoyn_aboutdata);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_create_empty() -> alljoyn_aboutdata);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_create_full(arg : alljoyn_msgarg, language : windows_sys::core::PCSTR) -> alljoyn_aboutdata);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_createfrommsgarg(data : alljoyn_aboutdata, arg : alljoyn_msgarg, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_createfromxml(data : alljoyn_aboutdata, aboutdataxml : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_destroy(data : alljoyn_aboutdata));

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getaboutdata(data : alljoyn_aboutdata, msgarg : alljoyn_msgarg, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getajsoftwareversion(data : alljoyn_aboutdata, ajsoftwareversion : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getannouncedaboutdata(data : alljoyn_aboutdata, msgarg : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getappid(data : alljoyn_aboutdata, appid : *mut *mut u8, num : *mut usize) -> QStatus);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getappname(data : alljoyn_aboutdata, appname : *mut *mut i8, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getdateofmanufacture(data : alljoyn_aboutdata, dateofmanufacture : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getdefaultlanguage(data : alljoyn_aboutdata, defaultlanguage : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getdescription(data : alljoyn_aboutdata, description : *mut *mut i8, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getdeviceid(data : alljoyn_aboutdata, deviceid : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getdevicename(data : alljoyn_aboutdata, devicename : *mut *mut i8, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getfield(data : alljoyn_aboutdata, name : windows_sys::core::PCSTR, value : *mut alljoyn_msgarg, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getfields(data : alljoyn_aboutdata, fields : *const *const i8, num_fields : usize) -> usize);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getfieldsignature(data : alljoyn_aboutdata, fieldname : windows_sys::core::PCSTR) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_gethardwareversion(data : alljoyn_aboutdata, hardwareversion : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getmanufacturer(data : alljoyn_aboutdata, manufacturer : *mut *mut i8, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getmodelnumber(data : alljoyn_aboutdata, modelnumber : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getsoftwareversion(data : alljoyn_aboutdata, softwareversion : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getsupportedlanguages(data : alljoyn_aboutdata, languagetags : *const *const i8, num : usize) -> usize);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_getsupporturl(data : alljoyn_aboutdata, supporturl : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_isfieldannounced(data : alljoyn_aboutdata, fieldname : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_isfieldlocalized(data : alljoyn_aboutdata, fieldname : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_isfieldrequired(data : alljoyn_aboutdata, fieldname : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_isvalid(data : alljoyn_aboutdata, language : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setappid(data : alljoyn_aboutdata, appid : *const u8, num : usize) -> QStatus);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setappid_fromstring(data : alljoyn_aboutdata, appid : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setappname(data : alljoyn_aboutdata, appname : windows_sys::core::PCSTR, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setdateofmanufacture(data : alljoyn_aboutdata, dateofmanufacture : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setdefaultlanguage(data : alljoyn_aboutdata, defaultlanguage : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setdescription(data : alljoyn_aboutdata, description : windows_sys::core::PCSTR, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setdeviceid(data : alljoyn_aboutdata, deviceid : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setdevicename(data : alljoyn_aboutdata, devicename : windows_sys::core::PCSTR, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setfield(data : alljoyn_aboutdata, name : windows_sys::core::PCSTR, value : alljoyn_msgarg, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_sethardwareversion(data : alljoyn_aboutdata, hardwareversion : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setmanufacturer(data : alljoyn_aboutdata, manufacturer : windows_sys::core::PCSTR, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setmodelnumber(data : alljoyn_aboutdata, modelnumber : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setsoftwareversion(data : alljoyn_aboutdata, softwareversion : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setsupportedlanguage(data : alljoyn_aboutdata, language : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdata_setsupporturl(data : alljoyn_aboutdata, supporturl : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdatalistener_create(callbacks : *const alljoyn_aboutdatalistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_aboutdatalistener);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutdatalistener_destroy(listener : alljoyn_aboutdatalistener));

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_clear(icon : alljoyn_abouticon));

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_create() -> alljoyn_abouticon);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_destroy(icon : alljoyn_abouticon));

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_getcontent(icon : alljoyn_abouticon, data : *const *const u8, size : *mut usize));

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_geturl(icon : alljoyn_abouticon, r#type : *const *const i8, url : *const *const i8));

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_setcontent(icon : alljoyn_abouticon, r#type : windows_sys::core::PCSTR, data : *mut u8, csize : usize, ownsdata : u8) -> QStatus);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_setcontent_frommsgarg(icon : alljoyn_abouticon, arg : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticon_seturl(icon : alljoyn_abouticon, r#type : windows_sys::core::PCSTR, url : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticonobj_create(bus : alljoyn_busattachment, icon : alljoyn_abouticon) -> alljoyn_abouticonobj);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticonobj_destroy(icon : alljoyn_abouticonobj));

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticonproxy_create(bus : alljoyn_busattachment, busname : windows_sys::core::PCSTR, sessionid : u32) -> alljoyn_abouticonproxy);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticonproxy_destroy(proxy : alljoyn_abouticonproxy));

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticonproxy_geticon(proxy : alljoyn_abouticonproxy, icon : alljoyn_abouticon) -> QStatus);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_abouticonproxy_getversion(proxy : alljoyn_abouticonproxy, version : *mut u16) -> QStatus);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutlistener_create(callback : *const alljoyn_aboutlistener_callback, context : *const core::ffi::c_void) -> alljoyn_aboutlistener);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutlistener_destroy(listener : alljoyn_aboutlistener));

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobj_announce(obj : alljoyn_aboutobj, sessionport : u16, aboutdata : alljoyn_aboutdata) -> QStatus);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobj_announce_using_datalistener(obj : alljoyn_aboutobj, sessionport : u16, aboutlistener : alljoyn_aboutdatalistener) -> QStatus);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobj_create(bus : alljoyn_busattachment, isannounced : alljoyn_about_announceflag) -> alljoyn_aboutobj);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobj_destroy(obj : alljoyn_aboutobj));

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobj_unannounce(obj : alljoyn_aboutobj) -> QStatus);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_clear(description : alljoyn_aboutobjectdescription));

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_create() -> alljoyn_aboutobjectdescription);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_create_full(arg : alljoyn_msgarg) -> alljoyn_aboutobjectdescription);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_createfrommsgarg(description : alljoyn_aboutobjectdescription, arg : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_destroy(description : alljoyn_aboutobjectdescription));

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_getinterfacepaths(description : alljoyn_aboutobjectdescription, interfacename : windows_sys::core::PCSTR, paths : *const *const i8, numpaths : usize) -> usize);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_getinterfaces(description : alljoyn_aboutobjectdescription, path : windows_sys::core::PCSTR, interfaces : *const *const i8, numinterfaces : usize) -> usize);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_getmsgarg(description : alljoyn_aboutobjectdescription, msgarg : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_getpaths(description : alljoyn_aboutobjectdescription, paths : *const *const i8, numpaths : usize) -> usize);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_hasinterface(description : alljoyn_aboutobjectdescription, interfacename : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_hasinterfaceatpath(description : alljoyn_aboutobjectdescription, path : windows_sys::core::PCSTR, interfacename : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutobjectdescription_haspath(description : alljoyn_aboutobjectdescription, path : windows_sys::core::PCSTR) -> u8);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutproxy_create(bus : alljoyn_busattachment, busname : windows_sys::core::PCSTR, sessionid : u32) -> alljoyn_aboutproxy);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutproxy_destroy(proxy : alljoyn_aboutproxy));

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutproxy_getaboutdata(proxy : alljoyn_aboutproxy, language : windows_sys::core::PCSTR, data : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutproxy_getobjectdescription(proxy : alljoyn_aboutproxy, objectdesc : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_aboutproxy_getversion(proxy : alljoyn_aboutproxy, version : *mut u16) -> QStatus);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_applicationstatelistener_create(callbacks : *const alljoyn_applicationstatelistener_callbacks, context : *mut core::ffi::c_void) -> alljoyn_applicationstatelistener);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_applicationstatelistener_destroy(listener : alljoyn_applicationstatelistener));

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistener_create(callbacks : *const alljoyn_authlistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_authlistener);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistener_destroy(listener : alljoyn_authlistener));

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistener_requestcredentialsresponse(listener : alljoyn_authlistener, authcontext : *mut core::ffi::c_void, accept : i32, credentials : alljoyn_credentials) -> QStatus);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistener_setsharedsecret(listener : alljoyn_authlistener, sharedsecret : *const u8, sharedsecretsize : usize) -> QStatus);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistener_verifycredentialsresponse(listener : alljoyn_authlistener, authcontext : *mut core::ffi::c_void, accept : i32) -> QStatus);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistenerasync_create(callbacks : *const alljoyn_authlistenerasync_callbacks, context : *const core::ffi::c_void) -> alljoyn_authlistener);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_authlistenerasync_destroy(listener : alljoyn_authlistener));

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_adddestination(autopinger : alljoyn_autopinger, group : windows_sys::core::PCSTR, destination : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_addpinggroup(autopinger : alljoyn_autopinger, group : windows_sys::core::PCSTR, listener : alljoyn_pinglistener, pinginterval : u32));

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_create(bus : alljoyn_busattachment) -> alljoyn_autopinger);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_destroy(autopinger : alljoyn_autopinger));

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_pause(autopinger : alljoyn_autopinger));

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_removedestination(autopinger : alljoyn_autopinger, group : windows_sys::core::PCSTR, destination : windows_sys::core::PCSTR, removeall : i32) -> QStatus);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_removepinggroup(autopinger : alljoyn_autopinger, group : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_resume(autopinger : alljoyn_autopinger));

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_autopinger_setpinginterval(autopinger : alljoyn_autopinger, group : windows_sys::core::PCSTR, pinginterval : u32) -> QStatus);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_addlogonentry(bus : alljoyn_busattachment, authmechanism : windows_sys::core::PCSTR, username : windows_sys::core::PCSTR, password : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_addmatch(bus : alljoyn_busattachment, rule : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_advertisename(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, transports : u16) -> QStatus);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_bindsessionport(bus : alljoyn_busattachment, sessionport : *mut u16, opts : alljoyn_sessionopts, listener : alljoyn_sessionportlistener) -> QStatus);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_canceladvertisename(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, transports : u16) -> QStatus);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_cancelfindadvertisedname(bus : alljoyn_busattachment, nameprefix : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_cancelfindadvertisednamebytransport(bus : alljoyn_busattachment, nameprefix : windows_sys::core::PCSTR, transports : u16) -> QStatus);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_cancelwhoimplements_interface(bus : alljoyn_busattachment, implementsinterface : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_cancelwhoimplements_interfaces(bus : alljoyn_busattachment, implementsinterfaces : *const *const i8, numberinterfaces : usize) -> QStatus);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_clearkeys(bus : alljoyn_busattachment, guid : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_clearkeystore(bus : alljoyn_busattachment));

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_connect(bus : alljoyn_busattachment, connectspec : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_create(applicationname : windows_sys::core::PCSTR, allowremotemessages : i32) -> alljoyn_busattachment);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_create_concurrency(applicationname : windows_sys::core::PCSTR, allowremotemessages : i32, concurrency : u32) -> alljoyn_busattachment);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_createinterface(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, iface : *mut alljoyn_interfacedescription) -> QStatus);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_createinterface_secure(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, iface : *mut alljoyn_interfacedescription, secpolicy : alljoyn_interfacedescription_securitypolicy) -> QStatus);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_createinterfacesfromxml(bus : alljoyn_busattachment, xml : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_deletedefaultkeystore(applicationname : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_deleteinterface(bus : alljoyn_busattachment, iface : alljoyn_interfacedescription) -> QStatus);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_destroy(bus : alljoyn_busattachment));

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_disconnect(bus : alljoyn_busattachment, unused : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_enableconcurrentcallbacks(bus : alljoyn_busattachment));

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_enablepeersecurity(bus : alljoyn_busattachment, authmechanisms : windows_sys::core::PCSTR, listener : alljoyn_authlistener, keystorefilename : windows_sys::core::PCSTR, isshared : i32) -> QStatus);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_enablepeersecuritywithpermissionconfigurationlistener(bus : alljoyn_busattachment, authmechanisms : windows_sys::core::PCSTR, authlistener : alljoyn_authlistener, keystorefilename : windows_sys::core::PCSTR, isshared : i32, permissionconfigurationlistener : alljoyn_permissionconfigurationlistener) -> QStatus);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_findadvertisedname(bus : alljoyn_busattachment, nameprefix : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_findadvertisednamebytransport(bus : alljoyn_busattachment, nameprefix : windows_sys::core::PCSTR, transports : u16) -> QStatus);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getalljoyndebugobj(bus : alljoyn_busattachment) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getalljoynproxyobj(bus : alljoyn_busattachment) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getconcurrency(bus : alljoyn_busattachment) -> u32);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getconnectspec(bus : alljoyn_busattachment) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getdbusproxyobj(bus : alljoyn_busattachment) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getglobalguidstring(bus : alljoyn_busattachment) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getinterface(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR) -> alljoyn_interfacedescription);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getinterfaces(bus : alljoyn_busattachment, ifaces : *const alljoyn_interfacedescription, numifaces : usize) -> usize);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getkeyexpiration(bus : alljoyn_busattachment, guid : windows_sys::core::PCSTR, timeout : *mut u32) -> QStatus);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getpeerguid(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, guid : windows_sys::core::PCSTR, guidsz : *mut usize) -> QStatus);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getpermissionconfigurator(bus : alljoyn_busattachment) -> alljoyn_permissionconfigurator);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_gettimestamp() -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_getuniquename(bus : alljoyn_busattachment) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_isconnected(bus : alljoyn_busattachment) -> i32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_ispeersecurityenabled(bus : alljoyn_busattachment) -> i32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_isstarted(bus : alljoyn_busattachment) -> i32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_isstopping(bus : alljoyn_busattachment) -> i32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_join(bus : alljoyn_busattachment) -> QStatus);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_joinsession(bus : alljoyn_busattachment, sessionhost : windows_sys::core::PCSTR, sessionport : u16, listener : alljoyn_sessionlistener, sessionid : *mut u32, opts : alljoyn_sessionopts) -> QStatus);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_joinsessionasync(bus : alljoyn_busattachment, sessionhost : windows_sys::core::PCSTR, sessionport : u16, listener : alljoyn_sessionlistener, opts : alljoyn_sessionopts, callback : alljoyn_busattachment_joinsessioncb_ptr, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_leavesession(bus : alljoyn_busattachment, sessionid : u32) -> QStatus);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_namehasowner(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, hasowner : *mut i32) -> QStatus);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_ping(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, timeout : u32) -> QStatus);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registeraboutlistener(bus : alljoyn_busattachment, aboutlistener : alljoyn_aboutlistener));

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registerapplicationstatelistener(bus : alljoyn_busattachment, listener : alljoyn_applicationstatelistener) -> QStatus);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registerbuslistener(bus : alljoyn_busattachment, listener : alljoyn_buslistener));

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registerbusobject(bus : alljoyn_busattachment, obj : alljoyn_busobject) -> QStatus);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registerbusobject_secure(bus : alljoyn_busattachment, obj : alljoyn_busobject) -> QStatus);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registerkeystorelistener(bus : alljoyn_busattachment, listener : alljoyn_keystorelistener) -> QStatus);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registersignalhandler(bus : alljoyn_busattachment, signal_handler : alljoyn_messagereceiver_signalhandler_ptr, member : alljoyn_interfacedescription_member, srcpath : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_registersignalhandlerwithrule(bus : alljoyn_busattachment, signal_handler : alljoyn_messagereceiver_signalhandler_ptr, member : alljoyn_interfacedescription_member, matchrule : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_releasename(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_reloadkeystore(bus : alljoyn_busattachment) -> QStatus);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_removematch(bus : alljoyn_busattachment, rule : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_removesessionmember(bus : alljoyn_busattachment, sessionid : u32, membername : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_requestname(bus : alljoyn_busattachment, requestedname : windows_sys::core::PCSTR, flags : u32) -> QStatus);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_secureconnection(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, forceauth : i32) -> QStatus);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_secureconnectionasync(bus : alljoyn_busattachment, name : windows_sys::core::PCSTR, forceauth : i32) -> QStatus);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_setdaemondebug(bus : alljoyn_busattachment, module : windows_sys::core::PCSTR, level : u32) -> QStatus);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_setkeyexpiration(bus : alljoyn_busattachment, guid : windows_sys::core::PCSTR, timeout : u32) -> QStatus);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_setlinktimeout(bus : alljoyn_busattachment, sessionid : u32, linktimeout : *mut u32) -> QStatus);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_setlinktimeoutasync(bus : alljoyn_busattachment, sessionid : u32, linktimeout : u32, callback : alljoyn_busattachment_setlinktimeoutcb_ptr, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_setsessionlistener(bus : alljoyn_busattachment, sessionid : u32, listener : alljoyn_sessionlistener) -> QStatus);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_start(bus : alljoyn_busattachment) -> QStatus);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_stop(bus : alljoyn_busattachment) -> QStatus);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unbindsessionport(bus : alljoyn_busattachment, sessionport : u16) -> QStatus);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregisteraboutlistener(bus : alljoyn_busattachment, aboutlistener : alljoyn_aboutlistener));

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregisterallaboutlisteners(bus : alljoyn_busattachment));

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregisterallhandlers(bus : alljoyn_busattachment) -> QStatus);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregisterapplicationstatelistener(bus : alljoyn_busattachment, listener : alljoyn_applicationstatelistener) -> QStatus);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregisterbuslistener(bus : alljoyn_busattachment, listener : alljoyn_buslistener));

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregisterbusobject(bus : alljoyn_busattachment, object : alljoyn_busobject));

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregistersignalhandler(bus : alljoyn_busattachment, signal_handler : alljoyn_messagereceiver_signalhandler_ptr, member : alljoyn_interfacedescription_member, srcpath : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_unregistersignalhandlerwithrule(bus : alljoyn_busattachment, signal_handler : alljoyn_messagereceiver_signalhandler_ptr, member : alljoyn_interfacedescription_member, matchrule : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_whoimplements_interface(bus : alljoyn_busattachment, implementsinterface : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busattachment_whoimplements_interfaces(bus : alljoyn_busattachment, implementsinterfaces : *const *const i8, numberinterfaces : usize) -> QStatus);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_buslistener_create(callbacks : *const alljoyn_buslistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_buslistener);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_buslistener_destroy(listener : alljoyn_buslistener));

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_addinterface(bus : alljoyn_busobject, iface : alljoyn_interfacedescription) -> QStatus);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_addinterface_announced(bus : alljoyn_busobject, iface : alljoyn_interfacedescription) -> QStatus);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_addmethodhandler(bus : alljoyn_busobject, member : alljoyn_interfacedescription_member, handler : alljoyn_messagereceiver_methodhandler_ptr, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_addmethodhandlers(bus : alljoyn_busobject, entries : *const alljoyn_busobject_methodentry, numentries : usize) -> QStatus);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_cancelsessionlessmessage(bus : alljoyn_busobject, msg : alljoyn_message) -> QStatus);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_cancelsessionlessmessage_serial(bus : alljoyn_busobject, serialnumber : u32) -> QStatus);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_create(path : windows_sys::core::PCSTR, isplaceholder : i32, callbacks_in : *const alljoyn_busobject_callbacks, context_in : *const core::ffi::c_void) -> alljoyn_busobject);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_destroy(bus : alljoyn_busobject));

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_emitpropertieschanged(bus : alljoyn_busobject, ifcname : windows_sys::core::PCSTR, propnames : *const *const i8, numprops : usize, id : u32));

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_emitpropertychanged(bus : alljoyn_busobject, ifcname : windows_sys::core::PCSTR, propname : windows_sys::core::PCSTR, val : alljoyn_msgarg, id : u32));

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_getannouncedinterfacenames(bus : alljoyn_busobject, interfaces : *const *const i8, numinterfaces : usize) -> usize);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_getbusattachment(bus : alljoyn_busobject) -> alljoyn_busattachment);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_getname(bus : alljoyn_busobject, buffer : windows_sys::core::PCSTR, buffersz : usize) -> usize);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_getpath(bus : alljoyn_busobject) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_issecure(bus : alljoyn_busobject) -> i32);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_methodreply_args(bus : alljoyn_busobject, msg : alljoyn_message, args : alljoyn_msgarg, numargs : usize) -> QStatus);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_methodreply_err(bus : alljoyn_busobject, msg : alljoyn_message, error : windows_sys::core::PCSTR, errormessage : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_methodreply_status(bus : alljoyn_busobject, msg : alljoyn_message, status : QStatus) -> QStatus);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_setannounceflag(bus : alljoyn_busobject, iface : alljoyn_interfacedescription, isannounced : alljoyn_about_announceflag) -> QStatus);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_busobject_signal(bus : alljoyn_busobject, destination : windows_sys::core::PCSTR, sessionid : u32, signal : alljoyn_interfacedescription_member, args : alljoyn_msgarg, numargs : usize, timetolive : u16, flags : u8, msg : alljoyn_message) -> QStatus);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_clear(cred : alljoyn_credentials));

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_create() -> alljoyn_credentials);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_destroy(cred : alljoyn_credentials));

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_getcertchain(cred : alljoyn_credentials) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_getexpiration(cred : alljoyn_credentials) -> u32);

// UNSUPPORTED Rust 222:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_getlogonentry(cred : alljoyn_credentials) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_getpassword(cred : alljoyn_credentials) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_getprivateKey(cred : alljoyn_credentials) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_getusername(cred : alljoyn_credentials) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_isset(cred : alljoyn_credentials, creds : u16) -> i32);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_setcertchain(cred : alljoyn_credentials, certchain : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_setexpiration(cred : alljoyn_credentials, expiration : u32));

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_setlogonentry(cred : alljoyn_credentials, logonentry : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_setpassword(cred : alljoyn_credentials, pwd : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_setprivatekey(cred : alljoyn_credentials, pk : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_credentials_setusername(cred : alljoyn_credentials, username : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_getbuildinfo() -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_getnumericversion() -> u32);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_getversion() -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_init() -> QStatus);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_activate(iface : alljoyn_interfacedescription));

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addannotation(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addargannotation(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, argname : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addmember(iface : alljoyn_interfacedescription, r#type : alljoyn_messagetype, name : windows_sys::core::PCSTR, inputsig : windows_sys::core::PCSTR, outsig : windows_sys::core::PCSTR, argnames : windows_sys::core::PCSTR, annotation : u8) -> QStatus);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addmemberannotation(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addmethod(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, inputsig : windows_sys::core::PCSTR, outsig : windows_sys::core::PCSTR, argnames : windows_sys::core::PCSTR, annotation : u8, accessperms : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addproperty(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, signature : windows_sys::core::PCSTR, access : u8) -> QStatus);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addpropertyannotation(iface : alljoyn_interfacedescription, property : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_addsignal(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, sig : windows_sys::core::PCSTR, argnames : windows_sys::core::PCSTR, annotation : u8, accessperms : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_eql(one : alljoyn_interfacedescription, other : alljoyn_interfacedescription) -> i32);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getannotation(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, value_size : *mut usize) -> i32);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getannotationatindex(iface : alljoyn_interfacedescription, index : usize, name : windows_sys::core::PCSTR, name_size : *mut usize, value : windows_sys::core::PCSTR, value_size : *mut usize));

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getannotationscount(iface : alljoyn_interfacedescription) -> usize);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getargdescriptionforlanguage(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, arg : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR, maxlanguagelength : usize, languagetag : windows_sys::core::PCSTR) -> usize);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getdescriptionforlanguage(iface : alljoyn_interfacedescription, description : windows_sys::core::PCSTR, maxlanguagelength : usize, languagetag : windows_sys::core::PCSTR) -> usize);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getdescriptionlanguages(iface : alljoyn_interfacedescription, languages : *const *const i8, size : usize) -> usize);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getdescriptionlanguages2(iface : alljoyn_interfacedescription, languages : windows_sys::core::PCSTR, languagessize : usize) -> usize);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getdescriptiontranslationcallback(iface : alljoyn_interfacedescription) -> alljoyn_interfacedescription_translation_callback_ptr);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getmember(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, member : *mut alljoyn_interfacedescription_member) -> i32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getmemberannotation(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, value_size : *mut usize) -> i32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getmemberargannotation(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, argname : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, value_size : *mut usize) -> i32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getmemberdescriptionforlanguage(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR, maxlanguagelength : usize, languagetag : windows_sys::core::PCSTR) -> usize);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getmembers(iface : alljoyn_interfacedescription, members : *mut alljoyn_interfacedescription_member, nummembers : usize) -> usize);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getmethod(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, member : *mut alljoyn_interfacedescription_member) -> i32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getname(iface : alljoyn_interfacedescription) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getproperties(iface : alljoyn_interfacedescription, props : *mut alljoyn_interfacedescription_property, numprops : usize) -> usize);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getproperty(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, property : *mut alljoyn_interfacedescription_property) -> i32);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getpropertyannotation(iface : alljoyn_interfacedescription, property : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, str_size : *mut usize) -> i32);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getpropertydescriptionforlanguage(iface : alljoyn_interfacedescription, property : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR, maxlanguagelength : usize, languagetag : windows_sys::core::PCSTR) -> usize);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getsecuritypolicy(iface : alljoyn_interfacedescription) -> alljoyn_interfacedescription_securitypolicy);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_getsignal(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, member : *mut alljoyn_interfacedescription_member) -> i32);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_hasdescription(iface : alljoyn_interfacedescription) -> i32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_hasmember(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, insig : windows_sys::core::PCSTR, outsig : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_hasproperties(iface : alljoyn_interfacedescription) -> i32);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_hasproperty(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_introspect(iface : alljoyn_interfacedescription, str : windows_sys::core::PCSTR, buf : usize, indent : usize) -> usize);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_issecure(iface : alljoyn_interfacedescription) -> i32);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_eql(one : alljoyn_interfacedescription_member, other : alljoyn_interfacedescription_member) -> i32);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_getannotation(member : alljoyn_interfacedescription_member, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, value_size : *mut usize) -> i32);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_getannotationatindex(member : alljoyn_interfacedescription_member, index : usize, name : windows_sys::core::PCSTR, name_size : *mut usize, value : windows_sys::core::PCSTR, value_size : *mut usize));

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_getannotationscount(member : alljoyn_interfacedescription_member) -> usize);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_getargannotation(member : alljoyn_interfacedescription_member, argname : windows_sys::core::PCSTR, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, value_size : *mut usize) -> i32);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_getargannotationatindex(member : alljoyn_interfacedescription_member, argname : windows_sys::core::PCSTR, index : usize, name : windows_sys::core::PCSTR, name_size : *mut usize, value : windows_sys::core::PCSTR, value_size : *mut usize));

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_member_getargannotationscount(member : alljoyn_interfacedescription_member, argname : windows_sys::core::PCSTR) -> usize);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_property_eql(one : alljoyn_interfacedescription_property, other : alljoyn_interfacedescription_property) -> i32);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_property_getannotation(property : alljoyn_interfacedescription_property, name : windows_sys::core::PCSTR, value : windows_sys::core::PCSTR, value_size : *mut usize) -> i32);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_property_getannotationatindex(property : alljoyn_interfacedescription_property, index : usize, name : windows_sys::core::PCSTR, name_size : *mut usize, value : windows_sys::core::PCSTR, value_size : *mut usize));

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_property_getannotationscount(property : alljoyn_interfacedescription_property) -> usize);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setargdescription(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, argname : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setargdescriptionforlanguage(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, arg : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR, languagetag : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setdescription(iface : alljoyn_interfacedescription, description : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setdescriptionforlanguage(iface : alljoyn_interfacedescription, description : windows_sys::core::PCSTR, languagetag : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setdescriptionlanguage(iface : alljoyn_interfacedescription, language : windows_sys::core::PCSTR));

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setdescriptiontranslationcallback(iface : alljoyn_interfacedescription, translationcallback : alljoyn_interfacedescription_translation_callback_ptr));

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setmemberdescription(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setmemberdescriptionforlanguage(iface : alljoyn_interfacedescription, member : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR, languagetag : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setpropertydescription(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_interfacedescription_setpropertydescriptionforlanguage(iface : alljoyn_interfacedescription, name : windows_sys::core::PCSTR, description : windows_sys::core::PCSTR, languagetag : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_keystorelistener_create(callbacks : *const alljoyn_keystorelistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_keystorelistener);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_keystorelistener_destroy(listener : alljoyn_keystorelistener));

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_keystorelistener_getkeys(listener : alljoyn_keystorelistener, keystore : alljoyn_keystore, sink : windows_sys::core::PCSTR, sink_sz : *mut usize) -> QStatus);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_keystorelistener_putkeys(listener : alljoyn_keystorelistener, keystore : alljoyn_keystore, source : windows_sys::core::PCSTR, password : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_keystorelistener_with_synchronization_create(callbacks : *const alljoyn_keystorelistener_with_synchronization_callbacks, context : *mut core::ffi::c_void) -> alljoyn_keystorelistener);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_create(bus : alljoyn_busattachment) -> alljoyn_message);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_description(msg : alljoyn_message, str : windows_sys::core::PCSTR, buf : usize) -> usize);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_destroy(msg : alljoyn_message));

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_eql(one : alljoyn_message, other : alljoyn_message) -> i32);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getarg(msg : alljoyn_message, argn : usize) -> alljoyn_msgarg);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getargs(msg : alljoyn_message, numargs : *mut usize, args : *mut alljoyn_msgarg));

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getauthmechanism(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getcallserial(msg : alljoyn_message) -> u32);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getcompressiontoken(msg : alljoyn_message) -> u32);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getdestination(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_geterrorname(msg : alljoyn_message, errormessage : windows_sys::core::PCSTR, errormessage_size : *mut usize) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getflags(msg : alljoyn_message) -> u8);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getinterface(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getmembername(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getobjectpath(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getreceiveendpointname(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getreplyserial(msg : alljoyn_message) -> u32);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getsender(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getsessionid(msg : alljoyn_message) -> u32);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_getsignature(msg : alljoyn_message) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_gettimestamp(msg : alljoyn_message) -> u32);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_gettype(msg : alljoyn_message) -> alljoyn_messagetype);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_isbroadcastsignal(msg : alljoyn_message) -> i32);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_isencrypted(msg : alljoyn_message) -> i32);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_isexpired(msg : alljoyn_message, tillexpirems : *mut u32) -> i32);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_isglobalbroadcast(msg : alljoyn_message) -> i32);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_issessionless(msg : alljoyn_message) -> i32);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_isunreliable(msg : alljoyn_message) -> i32);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_message_parseargs(msg : alljoyn_message, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_setendianess(endian : i8));

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_message_tostring(msg : alljoyn_message, str : windows_sys::core::PCSTR, buf : usize) -> usize);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_array_create(size : usize) -> alljoyn_msgarg);

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_array_element(arg : alljoyn_msgarg, index : usize) -> alljoyn_msgarg);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_array_get(args : alljoyn_msgarg, numargs : usize, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_array_set(args : alljoyn_msgarg, numargs : *mut usize, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_array_set_offset(args : alljoyn_msgarg, argoffset : usize, numargs : *mut usize, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_array_signature(values : alljoyn_msgarg, numvalues : usize, str : windows_sys::core::PCSTR, buf : usize) -> usize);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_array_tostring(args : alljoyn_msgarg, numargs : usize, str : windows_sys::core::PCSTR, buf : usize, indent : usize) -> usize);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_clear(arg : alljoyn_msgarg));

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_clone(destination : alljoyn_msgarg, source : alljoyn_msgarg));

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_copy(source : alljoyn_msgarg) -> alljoyn_msgarg);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_create() -> alljoyn_msgarg);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_create_and_set(signature : windows_sys::core::PCSTR, ...) -> alljoyn_msgarg);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_destroy(arg : alljoyn_msgarg));

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_equal(lhv : alljoyn_msgarg, rhv : alljoyn_msgarg) -> i32);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_get(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_array_element(arg : alljoyn_msgarg, index : usize, element : *mut alljoyn_msgarg));

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_array_elementsignature(arg : alljoyn_msgarg, index : usize) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_array_numberofelements(arg : alljoyn_msgarg) -> usize);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_bool(arg : alljoyn_msgarg, b : *mut i32) -> QStatus);

// UNSUPPORTED Rust 350:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_bool_array(arg : alljoyn_msgarg, length : *mut usize, ab : *mut i32) -> QStatus);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_double(arg : alljoyn_msgarg, d : *mut f64) -> QStatus);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_double_array(arg : alljoyn_msgarg, length : *mut usize, ad : *mut f64) -> QStatus);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_int16(arg : alljoyn_msgarg, n : *mut i16) -> QStatus);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_int16_array(arg : alljoyn_msgarg, length : *mut usize, an : *mut i16) -> QStatus);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_int32(arg : alljoyn_msgarg, i : *mut i32) -> QStatus);

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_int32_array(arg : alljoyn_msgarg, length : *mut usize, ai : *mut i32) -> QStatus);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_int64(arg : alljoyn_msgarg, x : *mut i64) -> QStatus);

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_int64_array(arg : alljoyn_msgarg, length : *mut usize, ax : *mut i64) -> QStatus);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_objectpath(arg : alljoyn_msgarg, o : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 360:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_signature(arg : alljoyn_msgarg, g : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_string(arg : alljoyn_msgarg, s : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 362:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint16(arg : alljoyn_msgarg, q : *mut u16) -> QStatus);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint16_array(arg : alljoyn_msgarg, length : *mut usize, aq : *mut u16) -> QStatus);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint32(arg : alljoyn_msgarg, u : *mut u32) -> QStatus);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint32_array(arg : alljoyn_msgarg, length : *mut usize, au : *mut u32) -> QStatus);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint64(arg : alljoyn_msgarg, t : *mut u64) -> QStatus);

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint64_array(arg : alljoyn_msgarg, length : *mut usize, at : *mut u64) -> QStatus);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint8(arg : alljoyn_msgarg, y : *mut u8) -> QStatus);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_uint8_array(arg : alljoyn_msgarg, length : *mut usize, ay : *mut u8) -> QStatus);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_variant(arg : alljoyn_msgarg, v : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_get_variant_array(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, length : *mut usize, av : *mut alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_getdictelement(arg : alljoyn_msgarg, elemsig : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_getkey(arg : alljoyn_msgarg) -> alljoyn_msgarg);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_getmember(arg : alljoyn_msgarg, index : usize) -> alljoyn_msgarg);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_getnummembers(arg : alljoyn_msgarg) -> usize);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_gettype(arg : alljoyn_msgarg) -> alljoyn_typeid);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_getvalue(arg : alljoyn_msgarg) -> alljoyn_msgarg);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_hassignature(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_set(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "C" fn alljoyn_msgarg_set_and_stabilize(arg : alljoyn_msgarg, signature : windows_sys::core::PCSTR, ...) -> QStatus);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_bool(arg : alljoyn_msgarg, b : i32) -> QStatus);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_bool_array(arg : alljoyn_msgarg, length : usize, ab : *mut i32) -> QStatus);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_double(arg : alljoyn_msgarg, d : f64) -> QStatus);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_double_array(arg : alljoyn_msgarg, length : usize, ad : *mut f64) -> QStatus);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_int16(arg : alljoyn_msgarg, n : i16) -> QStatus);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_int16_array(arg : alljoyn_msgarg, length : usize, an : *mut i16) -> QStatus);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_int32(arg : alljoyn_msgarg, i : i32) -> QStatus);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_int32_array(arg : alljoyn_msgarg, length : usize, ai : *mut i32) -> QStatus);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_int64(arg : alljoyn_msgarg, x : i64) -> QStatus);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_int64_array(arg : alljoyn_msgarg, length : usize, ax : *mut i64) -> QStatus);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_objectpath(arg : alljoyn_msgarg, o : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_objectpath_array(arg : alljoyn_msgarg, length : usize, ao : *const *const i8) -> QStatus);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_signature(arg : alljoyn_msgarg, g : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_signature_array(arg : alljoyn_msgarg, length : usize, ag : *const *const i8) -> QStatus);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_string(arg : alljoyn_msgarg, s : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_string_array(arg : alljoyn_msgarg, length : usize, r#as : *const *const i8) -> QStatus);

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint16(arg : alljoyn_msgarg, q : u16) -> QStatus);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint16_array(arg : alljoyn_msgarg, length : usize, aq : *mut u16) -> QStatus);

// UNSUPPORTED Rust 399:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint32(arg : alljoyn_msgarg, u : u32) -> QStatus);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint32_array(arg : alljoyn_msgarg, length : usize, au : *mut u32) -> QStatus);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint64(arg : alljoyn_msgarg, t : u64) -> QStatus);

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint64_array(arg : alljoyn_msgarg, length : usize, at : *mut u64) -> QStatus);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint8(arg : alljoyn_msgarg, y : u8) -> QStatus);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_set_uint8_array(arg : alljoyn_msgarg, length : usize, ay : *mut u8) -> QStatus);

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_setdictentry(arg : alljoyn_msgarg, key : alljoyn_msgarg, value : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_setstruct(arg : alljoyn_msgarg, struct_members : alljoyn_msgarg, num_members : usize) -> QStatus);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_signature(arg : alljoyn_msgarg, str : windows_sys::core::PCSTR, buf : usize) -> usize);

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_stabilize(arg : alljoyn_msgarg));

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_msgarg_tostring(arg : alljoyn_msgarg, str : windows_sys::core::PCSTR, buf : usize, indent : usize) -> usize);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_create(bus : alljoyn_busattachment, mandatoryinterfaces : *const *const i8, nummandatoryinterfaces : usize) -> alljoyn_observer);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_destroy(observer : alljoyn_observer));

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_get(observer : alljoyn_observer, uniquebusname : windows_sys::core::PCSTR, objectpath : windows_sys::core::PCSTR) -> alljoyn_proxybusobject_ref);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_getfirst(observer : alljoyn_observer) -> alljoyn_proxybusobject_ref);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_getnext(observer : alljoyn_observer, proxyref : alljoyn_proxybusobject_ref) -> alljoyn_proxybusobject_ref);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_registerlistener(observer : alljoyn_observer, listener : alljoyn_observerlistener, triggeronexisting : i32));

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_unregisteralllisteners(observer : alljoyn_observer));

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observer_unregisterlistener(observer : alljoyn_observer, listener : alljoyn_observerlistener));

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observerlistener_create(callback : *const alljoyn_observerlistener_callback, context : *const core::ffi::c_void) -> alljoyn_observerlistener);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_observerlistener_destroy(listener : alljoyn_observerlistener));

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_passwordmanager_setcredentials(authmechanism : windows_sys::core::PCSTR, password : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurationlistener_create(callbacks : *const alljoyn_permissionconfigurationlistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_permissionconfigurationlistener);

// UNSUPPORTED Rust 422:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurationlistener_destroy(listener : alljoyn_permissionconfigurationlistener));

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_certificatechain_destroy(certificatechain : *mut i8));

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_certificateid_cleanup(certificateid : *mut alljoyn_certificateid));

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_certificateidarray_cleanup(certificateidarray : *mut alljoyn_certificateidarray));

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_claim(configurator : alljoyn_permissionconfigurator, cakey : *mut i8, identitycertificatechain : *mut i8, groupid : *const u8, groupsize : usize, groupauthority : *mut i8, manifestsxmls : *mut *mut i8, manifestscount : usize) -> QStatus);

// UNSUPPORTED Rust 427:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_endmanagement(configurator : alljoyn_permissionconfigurator) -> QStatus);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getapplicationstate(configurator : alljoyn_permissionconfigurator, state : *mut alljoyn_applicationstate) -> QStatus);

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getclaimcapabilities(configurator : alljoyn_permissionconfigurator, claimcapabilities : *mut u16) -> QStatus);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getclaimcapabilitiesadditionalinfo(configurator : alljoyn_permissionconfigurator, additionalinfo : *mut u16) -> QStatus);

// UNSUPPORTED Rust 431:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getdefaultclaimcapabilities() -> u16);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getdefaultpolicy(configurator : alljoyn_permissionconfigurator, policyxml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 433:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getidentity(configurator : alljoyn_permissionconfigurator, identitycertificatechain : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getidentitycertificateid(configurator : alljoyn_permissionconfigurator, certificateid : *mut alljoyn_certificateid) -> QStatus);

// UNSUPPORTED Rust 435:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getmanifests(configurator : alljoyn_permissionconfigurator, manifestarray : *mut alljoyn_manifestarray) -> QStatus);

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getmanifesttemplate(configurator : alljoyn_permissionconfigurator, manifesttemplatexml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 437:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getmembershipsummaries(configurator : alljoyn_permissionconfigurator, certificateids : *mut alljoyn_certificateidarray) -> QStatus);

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getpolicy(configurator : alljoyn_permissionconfigurator, policyxml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_getpublickey(configurator : alljoyn_permissionconfigurator, publickey : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_installmanifests(configurator : alljoyn_permissionconfigurator, manifestsxmls : *mut *mut i8, manifestscount : usize, append : i32) -> QStatus);

// UNSUPPORTED Rust 441:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_installmembership(configurator : alljoyn_permissionconfigurator, membershipcertificatechain : *mut i8) -> QStatus);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_manifestarray_cleanup(manifestarray : *mut alljoyn_manifestarray));

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_manifesttemplate_destroy(manifesttemplatexml : *mut i8));

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_policy_destroy(policyxml : *mut i8));

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_publickey_destroy(publickey : *mut i8));

// UNSUPPORTED Rust 446:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_removemembership(configurator : alljoyn_permissionconfigurator, serial : *const u8, seriallen : usize, issuerpublickey : *mut i8, issueraki : *const u8, issuerakilen : usize) -> QStatus);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_reset(configurator : alljoyn_permissionconfigurator) -> QStatus);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_resetpolicy(configurator : alljoyn_permissionconfigurator) -> QStatus);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_setapplicationstate(configurator : alljoyn_permissionconfigurator, state : alljoyn_applicationstate) -> QStatus);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_setclaimcapabilities(configurator : alljoyn_permissionconfigurator, claimcapabilities : u16) -> QStatus);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_setclaimcapabilitiesadditionalinfo(configurator : alljoyn_permissionconfigurator, additionalinfo : u16) -> QStatus);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_setmanifesttemplatefromxml(configurator : alljoyn_permissionconfigurator, manifesttemplatexml : *mut i8) -> QStatus);

// UNSUPPORTED Rust 453:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_startmanagement(configurator : alljoyn_permissionconfigurator) -> QStatus);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_updateidentity(configurator : alljoyn_permissionconfigurator, identitycertificatechain : *mut i8, manifestsxmls : *mut *mut i8, manifestscount : usize) -> QStatus);

// UNSUPPORTED Rust 455:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_permissionconfigurator_updatepolicy(configurator : alljoyn_permissionconfigurator, policyxml : *mut i8) -> QStatus);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_pinglistener_create(callback : *const alljoyn_pinglistener_callback, context : *const core::ffi::c_void) -> alljoyn_pinglistener);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_pinglistener_destroy(listener : alljoyn_pinglistener));

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_addchild(proxyobj : alljoyn_proxybusobject, child : alljoyn_proxybusobject) -> QStatus);

// UNSUPPORTED Rust 459:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_addinterface(proxyobj : alljoyn_proxybusobject, iface : alljoyn_interfacedescription) -> QStatus);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_addinterface_by_name(proxyobj : alljoyn_proxybusobject, name : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 461:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_copy(source : alljoyn_proxybusobject) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_create(bus : alljoyn_busattachment, service : windows_sys::core::PCSTR, path : windows_sys::core::PCSTR, sessionid : u32) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 463:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_create_secure(bus : alljoyn_busattachment, service : windows_sys::core::PCSTR, path : windows_sys::core::PCSTR, sessionid : u32) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 464:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_destroy(proxyobj : alljoyn_proxybusobject));

// UNSUPPORTED Rust 465:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_enablepropertycaching(proxyobj : alljoyn_proxybusobject));

// UNSUPPORTED Rust 466:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getallproperties(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, values : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 467:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getallpropertiesasync(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, callback : alljoyn_proxybusobject_listener_getallpropertiescb_ptr, timeout : u32, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 468:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getchild(proxyobj : alljoyn_proxybusobject, path : windows_sys::core::PCSTR) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 469:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getchildren(proxyobj : alljoyn_proxybusobject, children : *mut alljoyn_proxybusobject, numchildren : usize) -> usize);

// UNSUPPORTED Rust 470:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getinterface(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR) -> alljoyn_interfacedescription);

// UNSUPPORTED Rust 471:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getinterfaces(proxyobj : alljoyn_proxybusobject, ifaces : *const alljoyn_interfacedescription, numifaces : usize) -> usize);

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getpath(proxyobj : alljoyn_proxybusobject) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 473:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getproperty(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, property : windows_sys::core::PCSTR, value : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getpropertyasync(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, property : windows_sys::core::PCSTR, callback : alljoyn_proxybusobject_listener_getpropertycb_ptr, timeout : u32, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 475:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getservicename(proxyobj : alljoyn_proxybusobject) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getsessionid(proxyobj : alljoyn_proxybusobject) -> u32);

// UNSUPPORTED Rust 477:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_getuniquename(proxyobj : alljoyn_proxybusobject) -> windows_sys::core::PCSTR);

// UNSUPPORTED Rust 478:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_implementsinterface(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 479:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_introspectremoteobject(proxyobj : alljoyn_proxybusobject) -> QStatus);

// UNSUPPORTED Rust 480:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_introspectremoteobjectasync(proxyobj : alljoyn_proxybusobject, callback : alljoyn_proxybusobject_listener_introspectcb_ptr, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 481:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_issecure(proxyobj : alljoyn_proxybusobject) -> i32);

// UNSUPPORTED Rust 482:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_isvalid(proxyobj : alljoyn_proxybusobject) -> i32);

// UNSUPPORTED Rust 483:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_methodcall(proxyobj : alljoyn_proxybusobject, ifacename : windows_sys::core::PCSTR, methodname : windows_sys::core::PCSTR, args : alljoyn_msgarg, numargs : usize, replymsg : alljoyn_message, timeout : u32, flags : u8) -> QStatus);

// UNSUPPORTED Rust 484:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_methodcall_member(proxyobj : alljoyn_proxybusobject, method : alljoyn_interfacedescription_member, args : alljoyn_msgarg, numargs : usize, replymsg : alljoyn_message, timeout : u32, flags : u8) -> QStatus);

// UNSUPPORTED Rust 485:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_methodcall_member_noreply(proxyobj : alljoyn_proxybusobject, method : alljoyn_interfacedescription_member, args : alljoyn_msgarg, numargs : usize, flags : u8) -> QStatus);

// UNSUPPORTED Rust 486:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_methodcall_noreply(proxyobj : alljoyn_proxybusobject, ifacename : windows_sys::core::PCSTR, methodname : windows_sys::core::PCSTR, args : alljoyn_msgarg, numargs : usize, flags : u8) -> QStatus);

// UNSUPPORTED Rust 487:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_methodcallasync(proxyobj : alljoyn_proxybusobject, ifacename : windows_sys::core::PCSTR, methodname : windows_sys::core::PCSTR, replyfunc : alljoyn_messagereceiver_replyhandler_ptr, args : alljoyn_msgarg, numargs : usize, context : *mut core::ffi::c_void, timeout : u32, flags : u8) -> QStatus);

// UNSUPPORTED Rust 488:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_methodcallasync_member(proxyobj : alljoyn_proxybusobject, method : alljoyn_interfacedescription_member, replyfunc : alljoyn_messagereceiver_replyhandler_ptr, args : alljoyn_msgarg, numargs : usize, context : *mut core::ffi::c_void, timeout : u32, flags : u8) -> QStatus);

// UNSUPPORTED Rust 489:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_parsexml(proxyobj : alljoyn_proxybusobject, xml : windows_sys::core::PCSTR, identifier : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 490:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_ref_create(proxy : alljoyn_proxybusobject) -> alljoyn_proxybusobject_ref);

// UNSUPPORTED Rust 491:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_ref_decref(r#ref : alljoyn_proxybusobject_ref));

// UNSUPPORTED Rust 492:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_ref_get(r#ref : alljoyn_proxybusobject_ref) -> alljoyn_proxybusobject);

// UNSUPPORTED Rust 493:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_ref_incref(r#ref : alljoyn_proxybusobject_ref));

// UNSUPPORTED Rust 494:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_registerpropertieschangedlistener(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, properties : *const *const i8, numproperties : usize, callback : alljoyn_proxybusobject_listener_propertieschanged_ptr, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 495:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_removechild(proxyobj : alljoyn_proxybusobject, path : windows_sys::core::PCSTR) -> QStatus);

// UNSUPPORTED Rust 496:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_secureconnection(proxyobj : alljoyn_proxybusobject, forceauth : i32) -> QStatus);

// UNSUPPORTED Rust 497:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_secureconnectionasync(proxyobj : alljoyn_proxybusobject, forceauth : i32) -> QStatus);

// UNSUPPORTED Rust 498:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_setproperty(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, property : windows_sys::core::PCSTR, value : alljoyn_msgarg) -> QStatus);

// UNSUPPORTED Rust 499:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_setpropertyasync(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, property : windows_sys::core::PCSTR, value : alljoyn_msgarg, callback : alljoyn_proxybusobject_listener_setpropertycb_ptr, timeout : u32, context : *mut core::ffi::c_void) -> QStatus);

// UNSUPPORTED Rust 500:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_proxybusobject_unregisterpropertieschangedlistener(proxyobj : alljoyn_proxybusobject, iface : windows_sys::core::PCSTR, callback : alljoyn_proxybusobject_listener_propertieschanged_ptr) -> QStatus);

// UNSUPPORTED Rust 501:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_routerinit() -> QStatus);

// UNSUPPORTED Rust 502:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_routerinitwithconfig(configxml : *mut i8) -> QStatus);

// UNSUPPORTED Rust 503:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_routershutdown() -> QStatus);

// UNSUPPORTED Rust 504:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_claim(proxy : alljoyn_securityapplicationproxy, cakey : *mut i8, identitycertificatechain : *mut i8, groupid : *const u8, groupsize : usize, groupauthority : *mut i8, manifestsxmls : *mut *mut i8, manifestscount : usize) -> QStatus);

// UNSUPPORTED Rust 505:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_computemanifestdigest(unsignedmanifestxml : *mut i8, identitycertificatepem : *mut i8, digest : *mut *mut u8, digestsize : *mut usize) -> QStatus);

// UNSUPPORTED Rust 506:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_create(bus : alljoyn_busattachment, appbusname : *mut i8, sessionid : u32) -> alljoyn_securityapplicationproxy);

// UNSUPPORTED Rust 507:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_destroy(proxy : alljoyn_securityapplicationproxy));

// UNSUPPORTED Rust 508:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_digest_destroy(digest : *mut u8));

// UNSUPPORTED Rust 509:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_eccpublickey_destroy(eccpublickey : *mut i8));

// UNSUPPORTED Rust 510:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_endmanagement(proxy : alljoyn_securityapplicationproxy) -> QStatus);

// UNSUPPORTED Rust 511:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getapplicationstate(proxy : alljoyn_securityapplicationproxy, applicationstate : *mut alljoyn_applicationstate) -> QStatus);

// UNSUPPORTED Rust 512:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getclaimcapabilities(proxy : alljoyn_securityapplicationproxy, capabilities : *mut u16) -> QStatus);

// UNSUPPORTED Rust 513:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getclaimcapabilitiesadditionalinfo(proxy : alljoyn_securityapplicationproxy, additionalinfo : *mut u16) -> QStatus);

// UNSUPPORTED Rust 514:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getdefaultpolicy(proxy : alljoyn_securityapplicationproxy, policyxml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 515:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_geteccpublickey(proxy : alljoyn_securityapplicationproxy, eccpublickey : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 516:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getmanifesttemplate(proxy : alljoyn_securityapplicationproxy, manifesttemplatexml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 517:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getpermissionmanagementsessionport() -> u16);

// UNSUPPORTED Rust 518:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_getpolicy(proxy : alljoyn_securityapplicationproxy, policyxml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 519:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_installmembership(proxy : alljoyn_securityapplicationproxy, membershipcertificatechain : *mut i8) -> QStatus);

// UNSUPPORTED Rust 520:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_manifest_destroy(signedmanifestxml : *mut i8));

// UNSUPPORTED Rust 521:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_manifesttemplate_destroy(manifesttemplatexml : *mut i8));

// UNSUPPORTED Rust 522:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_policy_destroy(policyxml : *mut i8));

// UNSUPPORTED Rust 523:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_reset(proxy : alljoyn_securityapplicationproxy) -> QStatus);

// UNSUPPORTED Rust 524:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_resetpolicy(proxy : alljoyn_securityapplicationproxy) -> QStatus);

// UNSUPPORTED Rust 525:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_setmanifestsignature(unsignedmanifestxml : *mut i8, identitycertificatepem : *mut i8, signature : *const u8, signaturesize : usize, signedmanifestxml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 526:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_signmanifest(unsignedmanifestxml : *mut i8, identitycertificatepem : *mut i8, signingprivatekeypem : *mut i8, signedmanifestxml : *mut *mut i8) -> QStatus);

// UNSUPPORTED Rust 527:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_startmanagement(proxy : alljoyn_securityapplicationproxy) -> QStatus);

// UNSUPPORTED Rust 528:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_updateidentity(proxy : alljoyn_securityapplicationproxy, identitycertificatechain : *mut i8, manifestsxmls : *mut *mut i8, manifestscount : usize) -> QStatus);

// UNSUPPORTED Rust 529:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_securityapplicationproxy_updatepolicy(proxy : alljoyn_securityapplicationproxy, policyxml : *mut i8) -> QStatus);

// UNSUPPORTED Rust 530:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionlistener_create(callbacks : *const alljoyn_sessionlistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_sessionlistener);

// UNSUPPORTED Rust 531:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionlistener_destroy(listener : alljoyn_sessionlistener));

// UNSUPPORTED Rust 532:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_cmp(one : alljoyn_sessionopts, other : alljoyn_sessionopts) -> i32);

// UNSUPPORTED Rust 533:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_create(traffic : u8, ismultipoint : i32, proximity : u8, transports : u16) -> alljoyn_sessionopts);

// UNSUPPORTED Rust 534:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_destroy(opts : alljoyn_sessionopts));

// UNSUPPORTED Rust 535:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_get_multipoint(opts : alljoyn_sessionopts) -> i32);

// UNSUPPORTED Rust 536:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_get_proximity(opts : alljoyn_sessionopts) -> u8);

// UNSUPPORTED Rust 537:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_get_traffic(opts : alljoyn_sessionopts) -> u8);

// UNSUPPORTED Rust 538:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_get_transports(opts : alljoyn_sessionopts) -> u16);

// UNSUPPORTED Rust 539:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_iscompatible(one : alljoyn_sessionopts, other : alljoyn_sessionopts) -> i32);

// UNSUPPORTED Rust 540:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_set_multipoint(opts : alljoyn_sessionopts, ismultipoint : i32));

// UNSUPPORTED Rust 541:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_set_proximity(opts : alljoyn_sessionopts, proximity : u8));

// UNSUPPORTED Rust 542:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_set_traffic(opts : alljoyn_sessionopts, traffic : u8));

// UNSUPPORTED Rust 543:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionopts_set_transports(opts : alljoyn_sessionopts, transports : u16));

// UNSUPPORTED Rust 544:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionportlistener_create(callbacks : *const alljoyn_sessionportlistener_callbacks, context : *const core::ffi::c_void) -> alljoyn_sessionportlistener);

// UNSUPPORTED Rust 545:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_sessionportlistener_destroy(listener : alljoyn_sessionportlistener));

// UNSUPPORTED Rust 546:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_shutdown() -> QStatus);

// UNSUPPORTED Rust 547:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_unity_deferred_callbacks_process() -> i32);

// UNSUPPORTED Rust 548:1: declaration Macro has no candidate rule
// windows_link::link!("msajapi.dll" "system" fn alljoyn_unity_set_deferred_callback_mainthread_only(mainthread_only : i32));

public const val `AJ_IFC_SECURITY_INHERIT`: `alljoyn_interfacedescription_securitypolicy` = 0;
public const val `AJ_IFC_SECURITY_OFF`: `alljoyn_interfacedescription_securitypolicy` = 2;
public const val `AJ_IFC_SECURITY_REQUIRED`: `alljoyn_interfacedescription_securitypolicy` = 1;
public const val `ALLJOYN_ARRAY`: `alljoyn_typeid` = 97;
public const val `ALLJOYN_BIG_ENDIAN`: UByte = 66u;
public const val `ALLJOYN_BOOLEAN`: `alljoyn_typeid` = 98;
public const val `ALLJOYN_BOOLEAN_ARRAY`: `alljoyn_typeid` = 25185;
public const val `ALLJOYN_BYTE`: `alljoyn_typeid` = 121;
public const val `ALLJOYN_BYTE_ARRAY`: `alljoyn_typeid` = 31073;
public const val `ALLJOYN_CRED_CERT_CHAIN`: UShort = 4u;
public const val `ALLJOYN_CRED_EXPIRATION`: UShort = 32u;
public const val `ALLJOYN_CRED_LOGON_ENTRY`: UShort = 16u;
public const val `ALLJOYN_CRED_NEW_PASSWORD`: UShort = 4097u;
public const val `ALLJOYN_CRED_ONE_TIME_PWD`: UShort = 8193u;
public const val `ALLJOYN_CRED_PASSWORD`: UShort = 1u;
public const val `ALLJOYN_CRED_PRIVATE_KEY`: UShort = 8u;
public const val `ALLJOYN_CRED_USER_NAME`: UShort = 2u;
public const val `ALLJOYN_DICT_ENTRY`: `alljoyn_typeid` = 101;
public const val `ALLJOYN_DICT_ENTRY_CLOSE`: `alljoyn_typeid` = 125;
public const val `ALLJOYN_DICT_ENTRY_OPEN`: `alljoyn_typeid` = 123;
public const val `ALLJOYN_DISCONNECTED`: UInt = 4u;
public const val `ALLJOYN_DOUBLE`: `alljoyn_typeid` = 100;
public const val `ALLJOYN_DOUBLE_ARRAY`: `alljoyn_typeid` = 25697;
public const val `ALLJOYN_HANDLE`: `alljoyn_typeid` = 104;
public const val `ALLJOYN_INT16`: `alljoyn_typeid` = 110;
public const val `ALLJOYN_INT16_ARRAY`: `alljoyn_typeid` = 28257;
public const val `ALLJOYN_INT32`: `alljoyn_typeid` = 105;
public const val `ALLJOYN_INT32_ARRAY`: `alljoyn_typeid` = 26977;
public const val `ALLJOYN_INT64`: `alljoyn_typeid` = 120;
public const val `ALLJOYN_INT64_ARRAY`: `alljoyn_typeid` = 30817;
public const val `ALLJOYN_INVALID`: `alljoyn_typeid` = 0;
public const val `ALLJOYN_LITTLE_ENDIAN`: UByte = 108u;
public const val `ALLJOYN_MEMBER_ANNOTATE_DEPRECATED`: UByte = 2u;
public const val `ALLJOYN_MEMBER_ANNOTATE_GLOBAL_BROADCAST`: UByte = 32u;
public const val `ALLJOYN_MEMBER_ANNOTATE_NO_REPLY`: UByte = 1u;
public const val `ALLJOYN_MEMBER_ANNOTATE_SESSIONCAST`: UByte = 4u;
public const val `ALLJOYN_MEMBER_ANNOTATE_SESSIONLESS`: UByte = 8u;
public const val `ALLJOYN_MEMBER_ANNOTATE_UNICAST`: UByte = 16u;
public const val `ALLJOYN_MESSAGE_DEFAULT_TIMEOUT`: UInt = 25000u;
public const val `ALLJOYN_MESSAGE_ERROR`: `alljoyn_messagetype` = 3;
public const val `ALLJOYN_MESSAGE_FLAG_ALLOW_REMOTE_MSG`: UInt = 4u;
public const val `ALLJOYN_MESSAGE_FLAG_AUTO_START`: UInt = 2u;
public const val `ALLJOYN_MESSAGE_FLAG_ENCRYPTED`: UInt = 128u;
public const val `ALLJOYN_MESSAGE_FLAG_GLOBAL_BROADCAST`: UInt = 32u;
public const val `ALLJOYN_MESSAGE_FLAG_NO_REPLY_EXPECTED`: UInt = 1u;
public const val `ALLJOYN_MESSAGE_FLAG_SESSIONLESS`: UInt = 16u;
public const val `ALLJOYN_MESSAGE_INVALID`: `alljoyn_messagetype` = 0;
public const val `ALLJOYN_MESSAGE_METHOD_CALL`: `alljoyn_messagetype` = 1;
public const val `ALLJOYN_MESSAGE_METHOD_RET`: `alljoyn_messagetype` = 2;
public const val `ALLJOYN_MESSAGE_SIGNAL`: `alljoyn_messagetype` = 4;
// UNSUPPORTED Rust 599:1: non-scalar type Ptr unsupported
// pub const ALLJOYN_NAMED_PIPE_CONNECT_SPEC: windows_sys::core::PCWSTR = windows_sys::core::w!("npipe:");

public const val `ALLJOYN_OBJECT_PATH`: `alljoyn_typeid` = 111;
public const val `ALLJOYN_PROP_ACCESS_READ`: UByte = 1u;
public const val `ALLJOYN_PROP_ACCESS_RW`: UByte = 3u;
public const val `ALLJOYN_PROP_ACCESS_WRITE`: UByte = 2u;
public const val `ALLJOYN_PROXIMITY_ANY`: UInt = 255u;
public const val `ALLJOYN_PROXIMITY_NETWORK`: UInt = 2u;
public const val `ALLJOYN_PROXIMITY_PHYSICAL`: UInt = 1u;
public const val `ALLJOYN_READ_READY`: UInt = 1u;
public const val `ALLJOYN_SESSIONLOST_INVALID`: `alljoyn_sessionlostreason` = 0;
public const val `ALLJOYN_SESSIONLOST_LINK_TIMEOUT`: `alljoyn_sessionlostreason` = 4;
public const val `ALLJOYN_SESSIONLOST_REASON_OTHER`: `alljoyn_sessionlostreason` = 5;
public const val `ALLJOYN_SESSIONLOST_REMOTE_END_CLOSED_ABRUPTLY`: `alljoyn_sessionlostreason` = 2;
public const val `ALLJOYN_SESSIONLOST_REMOTE_END_LEFT_SESSION`: `alljoyn_sessionlostreason` = 1;
public const val `ALLJOYN_SESSIONLOST_REMOVED_BY_BINDER`: `alljoyn_sessionlostreason` = 3;
public const val `ALLJOYN_SIGNATURE`: `alljoyn_typeid` = 103;
public const val `ALLJOYN_STRING`: `alljoyn_typeid` = 115;
public const val `ALLJOYN_STRUCT`: `alljoyn_typeid` = 114;
public const val `ALLJOYN_STRUCT_CLOSE`: `alljoyn_typeid` = 41;
public const val `ALLJOYN_STRUCT_OPEN`: `alljoyn_typeid` = 40;
public const val `ALLJOYN_TRAFFIC_TYPE_MESSAGES`: UInt = 1u;
public const val `ALLJOYN_TRAFFIC_TYPE_RAW_RELIABLE`: UInt = 4u;
public const val `ALLJOYN_TRAFFIC_TYPE_RAW_UNRELIABLE`: UInt = 2u;
public const val `ALLJOYN_UINT16`: `alljoyn_typeid` = 113;
public const val `ALLJOYN_UINT16_ARRAY`: `alljoyn_typeid` = 29025;
public const val `ALLJOYN_UINT32`: `alljoyn_typeid` = 117;
public const val `ALLJOYN_UINT32_ARRAY`: `alljoyn_typeid` = 30049;
public const val `ALLJOYN_UINT64`: `alljoyn_typeid` = 116;
public const val `ALLJOYN_UINT64_ARRAY`: `alljoyn_typeid` = 29793;
public const val `ALLJOYN_VARIANT`: `alljoyn_typeid` = 118;
public const val `ALLJOYN_WILDCARD`: `alljoyn_typeid` = 42;
public const val `ALLJOYN_WRITE_READY`: UInt = 2u;
public const val `ANNOUNCED`: `alljoyn_about_announceflag` = 1;
public const val `CAPABLE_ECDHE_ECDSA`: `alljoyn_claimcapability_masks` = 4;
public const val `CAPABLE_ECDHE_NULL`: `alljoyn_claimcapability_masks` = 1;
public const val `CAPABLE_ECDHE_SPEKE`: `alljoyn_claimcapability_masks` = 8;
public const val `CLAIMABLE`: `alljoyn_applicationstate` = 1;
public const val `CLAIMED`: `alljoyn_applicationstate` = 2;
public const val `ER_ABOUT_ABOUTDATA_MISSING_REQUIRED_FIELD`: `QStatus` = 37157;
public const val `ER_ABOUT_DEFAULT_LANGUAGE_NOT_SPECIFIED`: `QStatus` = 37155;
public const val `ER_ABOUT_FIELD_ALREADY_SPECIFIED`: `QStatus` = 37147;
public const val `ER_ABOUT_INVALID_ABOUTDATA_FIELD_APPID_SIZE`: `QStatus` = 37163;
public const val `ER_ABOUT_INVALID_ABOUTDATA_FIELD_VALUE`: `QStatus` = 37162;
public const val `ER_ABOUT_INVALID_ABOUTDATA_LISTENER`: `QStatus` = 37158;
public const val `ER_ABOUT_SESSIONPORT_NOT_BOUND`: `QStatus` = 37156;
public const val `ER_ALERTED_THREAD`: `QStatus` = 4098;
public const val `ER_ALLJOYN_ACCESS_PERMISSION_ERROR`: `QStatus` = 37028;
public const val `ER_ALLJOYN_ACCESS_PERMISSION_WARNING`: `QStatus` = 37027;
public const val `ER_ALLJOYN_ADVERTISENAME_REPLY_ALREADY_ADVERTISING`: `QStatus` = 37005;
public const val `ER_ALLJOYN_ADVERTISENAME_REPLY_FAILED`: `QStatus` = 37006;
public const val `ER_ALLJOYN_ADVERTISENAME_REPLY_TRANSPORT_NOT_AVAILABLE`: `QStatus` = 37004;
public const val `ER_ALLJOYN_BINDSESSIONPORT_REPLY_ALREADY_EXISTS`: `QStatus` = 36992;
public const val `ER_ALLJOYN_BINDSESSIONPORT_REPLY_FAILED`: `QStatus` = 36993;
public const val `ER_ALLJOYN_BINDSESSIONPORT_REPLY_INVALID_OPTS`: `QStatus` = 37018;
public const val `ER_ALLJOYN_CANCELADVERTISENAME_REPLY_FAILED`: `QStatus` = 37008;
public const val `ER_ALLJOYN_CANCELFINDADVERTISEDNAME_REPLY_FAILED`: `QStatus` = 37013;
public const val `ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_ALREADY_DISCOVERING`: `QStatus` = 37010;
public const val `ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_FAILED`: `QStatus` = 37011;
public const val `ER_ALLJOYN_FINDADVERTISEDNAME_REPLY_TRANSPORT_NOT_AVAILABLE`: `QStatus` = 37009;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_ALREADY_JOINED`: `QStatus` = 37019;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_BAD_SESSION_OPTS`: `QStatus` = 36999;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_CONNECT_FAILED`: `QStatus` = 36997;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_FAILED`: `QStatus` = 37000;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_NO_SESSION`: `QStatus` = 36995;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_REJECTED`: `QStatus` = 36998;
public const val `ER_ALLJOYN_JOINSESSION_REPLY_UNREACHABLE`: `QStatus` = 36996;
public const val `ER_ALLJOYN_LEAVESESSION_REPLY_FAILED`: `QStatus` = 37003;
public const val `ER_ALLJOYN_LEAVESESSION_REPLY_NO_SESSION`: `QStatus` = 37002;
public const val `ER_ALLJOYN_ONAPPRESUME_REPLY_FAILED`: `QStatus` = 37100;
public const val `ER_ALLJOYN_ONAPPRESUME_REPLY_UNSUPPORTED`: `QStatus` = 37101;
public const val `ER_ALLJOYN_ONAPPSUSPEND_REPLY_FAILED`: `QStatus` = 37098;
public const val `ER_ALLJOYN_ONAPPSUSPEND_REPLY_UNSUPPORTED`: `QStatus` = 37099;
public const val `ER_ALLJOYN_PING_FAILED`: `QStatus` = 37111;
public const val `ER_ALLJOYN_PING_REPLY_FAILED`: `QStatus` = 37143;
public const val `ER_ALLJOYN_PING_REPLY_INCOMPATIBLE_REMOTE_ROUTING_NODE`: `QStatus` = 37140;
public const val `ER_ALLJOYN_PING_REPLY_IN_PROGRESS`: `QStatus` = 37145;
public const val `ER_ALLJOYN_PING_REPLY_TIMEOUT`: `QStatus` = 37141;
public const val `ER_ALLJOYN_PING_REPLY_UNKNOWN_NAME`: `QStatus` = 37142;
public const val `ER_ALLJOYN_PING_REPLY_UNREACHABLE`: `QStatus` = 37112;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_INCOMPATIBLE_REMOTE_DAEMON`: `QStatus` = 37107;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_BINDER`: `QStatus` = 37104;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_FOUND`: `QStatus` = 37106;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_NOT_MULTIPOINT`: `QStatus` = 37105;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_REPLY_FAILED`: `QStatus` = 37108;
public const val `ER_ALLJOYN_REMOVESESSIONMEMBER_REPLY_NO_SESSION`: `QStatus` = 37103;
public const val `ER_ALLJOYN_SETLINKTIMEOUT_REPLY_FAILED`: `QStatus` = 37026;
public const val `ER_ALLJOYN_SETLINKTIMEOUT_REPLY_NOT_SUPPORTED`: `QStatus` = 37024;
public const val `ER_ALLJOYN_SETLINKTIMEOUT_REPLY_NO_DEST_SUPPORT`: `QStatus` = 37025;
public const val `ER_ALLJOYN_UNBINDSESSIONPORT_REPLY_BAD_PORT`: `QStatus` = 37016;
public const val `ER_ALLJOYN_UNBINDSESSIONPORT_REPLY_FAILED`: `QStatus` = 37017;
public const val `ER_APPLICATION_STATE_LISTENER_ALREADY_EXISTS`: `QStatus` = 37184;
public const val `ER_APPLICATION_STATE_LISTENER_NO_SUCH_LISTENER`: `QStatus` = 37185;
public const val `ER_ARDP_BACKPRESSURE`: `QStatus` = 37122;
public const val `ER_ARDP_DISCONNECTING`: `QStatus` = 37139;
public const val `ER_ARDP_INVALID_CONNECTION`: `QStatus` = 37135;
public const val `ER_ARDP_INVALID_RESPONSE`: `QStatus` = 37134;
public const val `ER_ARDP_INVALID_STATE`: `QStatus` = 37124;
public const val `ER_ARDP_PERSIST_TIMEOUT`: `QStatus` = 37126;
public const val `ER_ARDP_PROBE_TIMEOUT`: `QStatus` = 37127;
public const val `ER_ARDP_REMOTE_CONNECTION_RESET`: `QStatus` = 37128;
public const val `ER_ARDP_TTL_EXPIRED`: `QStatus` = 37125;
public const val `ER_ARDP_VERSION_NOT_SUPPORTED`: `QStatus` = 37151;
public const val `ER_ARDP_WRITE_BLOCKED`: `QStatus` = 37153;
public const val `ER_AUTH_FAIL`: `QStatus` = 4100;
public const val `ER_AUTH_USER_REJECT`: `QStatus` = 4101;
public const val `ER_BAD_ARG_1`: `QStatus` = 12;
public const val `ER_BAD_ARG_2`: `QStatus` = 13;
public const val `ER_BAD_ARG_3`: `QStatus` = 14;
public const val `ER_BAD_ARG_4`: `QStatus` = 15;
public const val `ER_BAD_ARG_5`: `QStatus` = 16;
public const val `ER_BAD_ARG_6`: `QStatus` = 17;
public const val `ER_BAD_ARG_7`: `QStatus` = 18;
public const val `ER_BAD_ARG_8`: `QStatus` = 19;
public const val `ER_BAD_ARG_COUNT`: `QStatus` = 28;
public const val `ER_BAD_HOSTNAME`: `QStatus` = 4112;
public const val `ER_BAD_STRING_ENCODING`: `QStatus` = 4120;
public const val `ER_BAD_TRANSPORT_MASK`: `QStatus` = 37088;
public const val `ER_BUFFER_TOO_SMALL`: `QStatus` = 3;
public const val `ER_BUS_ALREADY_CONNECTED`: `QStatus` = 36932;
public const val `ER_BUS_ALREADY_LISTENING`: `QStatus` = 36934;
public const val `ER_BUS_ANNOTATION_ALREADY_EXISTS`: `QStatus` = 37082;
public const val `ER_BUS_AUTHENTICATION_PENDING`: `QStatus` = 37031;
public const val `ER_BUS_BAD_BODY_LEN`: `QStatus` = 36879;
public const val `ER_BUS_BAD_BUS_NAME`: `QStatus` = 36874;
public const val `ER_BUS_BAD_CHILD_PATH`: `QStatus` = 36927;
public const val `ER_BUS_BAD_ERROR_NAME`: `QStatus` = 36873;
public const val `ER_BUS_BAD_HDR_FLAGS`: `QStatus` = 36878;
public const val `ER_BUS_BAD_HEADER_FIELD`: `QStatus` = 36868;
public const val `ER_BUS_BAD_HEADER_LEN`: `QStatus` = 36880;
public const val `ER_BUS_BAD_INTERFACE_NAME`: `QStatus` = 36872;
public const val `ER_BUS_BAD_LENGTH`: `QStatus` = 36876;
public const val `ER_BUS_BAD_MEMBER_NAME`: `QStatus` = 36871;
public const val `ER_BUS_BAD_OBJ_PATH`: `QStatus` = 36870;
public const val `ER_BUS_BAD_SENDER_ID`: `QStatus` = 36908;
public const val `ER_BUS_BAD_SEND_PARAMETER`: `QStatus` = 36906;
public const val `ER_BUS_BAD_SESSION_OPTS`: `QStatus` = 36980;
public const val `ER_BUS_BAD_SIGNATURE`: `QStatus` = 36869;
public const val `ER_BUS_BAD_TRANSPORT_ARGS`: `QStatus` = 36903;
public const val `ER_BUS_BAD_VALUE`: `QStatus` = 36877;
public const val `ER_BUS_BAD_VALUE_TYPE`: `QStatus` = 36867;
public const val `ER_BUS_BAD_XML`: `QStatus` = 36926;
public const val `ER_BUS_BLOCKING_CALL_NOT_ALLOWED`: `QStatus` = 36960;
public const val `ER_BUS_BUS_ALREADY_STARTED`: `QStatus` = 36939;
public const val `ER_BUS_BUS_NOT_STARTED`: `QStatus` = 36940;
public const val `ER_BUS_CANNOT_ADD_HANDLER`: `QStatus` = 36965;
public const val `ER_BUS_CANNOT_ADD_INTERFACE`: `QStatus` = 36964;
public const val `ER_BUS_CANNOT_EXPAND_MESSAGE`: `QStatus` = 36930;
public const val `ER_BUS_CONNECTION_REJECTED`: `QStatus` = 36981;
public const val `ER_BUS_CONNECT_FAILED`: `QStatus` = 36913;
public const val `ER_BUS_CORRUPT_KEYSTORE`: `QStatus` = 36952;
public const val `ER_BUS_DESCRIPTION_ALREADY_EXISTS`: `QStatus` = 37188;
public const val `ER_BUS_DESTINATION_NOT_AUTHENTICATED`: `QStatus` = 37029;
public const val `ER_BUS_ELEMENT_NOT_FOUND`: `QStatus` = 36976;
public const val `ER_BUS_EMPTY_MESSAGE`: `QStatus` = 36910;
public const val `ER_BUS_ENDPOINT_CLOSING`: `QStatus` = 36920;
public const val `ER_BUS_ENDPOINT_REDIRECTED`: `QStatus` = 37030;
public const val `ER_BUS_ERRORS`: `QStatus` = 36864;
public const val `ER_BUS_ERROR_NAME_MISSING`: `QStatus` = 36890;
public const val `ER_BUS_ERROR_RESPONSE`: `QStatus` = 36925;
public const val `ER_BUS_ESTABLISH_FAILED`: `QStatus` = 36884;
public const val `ER_BUS_HANDLES_MISMATCH`: `QStatus` = 36973;
public const val `ER_BUS_HANDLES_NOT_ENABLED`: `QStatus` = 36972;
public const val `ER_BUS_HDR_EXPANSION_INVALID`: `QStatus` = 36946;
public const val `ER_BUS_IFACE_ALREADY_EXISTS`: `QStatus` = 36924;
public const val `ER_BUS_INCOMPATIBLE_DAEMON`: `QStatus` = 37094;
public const val `ER_BUS_INTERFACE_ACTIVATED`: `QStatus` = 37015;
public const val `ER_BUS_INTERFACE_MISMATCH`: `QStatus` = 36921;
public const val `ER_BUS_INTERFACE_MISSING`: `QStatus` = 36886;
public const val `ER_BUS_INTERFACE_NO_SUCH_MEMBER`: `QStatus` = 36891;
public const val `ER_BUS_INVALID_AUTH_MECHANISM`: `QStatus` = 36958;
public const val `ER_BUS_INVALID_HEADER_CHECKSUM`: `QStatus` = 36942;
public const val `ER_BUS_INVALID_HEADER_SERIAL`: `QStatus` = 36944;
public const val `ER_BUS_KEYBLOB_OP_INVALID`: `QStatus` = 36941;
public const val `ER_BUS_KEYSTORE_NOT_LOADED`: `QStatus` = 36966;
public const val `ER_BUS_KEYSTORE_VERSION_MISMATCH`: `QStatus` = 36959;
public const val `ER_BUS_KEY_EXPIRED`: `QStatus` = 36951;
public const val `ER_BUS_KEY_STORE_NOT_LOADED`: `QStatus` = 36937;
public const val `ER_BUS_KEY_UNAVAILABLE`: `QStatus` = 36935;
public const val `ER_BUS_LISTENER_ALREADY_SET`: `QStatus` = 37022;
public const val `ER_BUS_MATCH_RULE_NOT_FOUND`: `QStatus` = 37110;
public const val `ER_BUS_MEMBER_ALREADY_EXISTS`: `QStatus` = 36922;
public const val `ER_BUS_MEMBER_MISSING`: `QStatus` = 36888;
public const val `ER_BUS_MEMBER_NO_SUCH_SIGNATURE`: `QStatus` = 36896;
public const val `ER_BUS_MESSAGE_DECRYPTION_FAILED`: `QStatus` = 36949;
public const val `ER_BUS_MESSAGE_NOT_ENCRYPTED`: `QStatus` = 36943;
public const val `ER_BUS_METHOD_CALL_ABORTED`: `QStatus` = 36963;
public const val `ER_BUS_MISSING_COMPRESSION_TOKEN`: `QStatus` = 36947;
public const val `ER_BUS_NAME_TOO_LONG`: `QStatus` = 36875;
public const val `ER_BUS_NOT_ALLOWED`: `QStatus` = 36918;
public const val `ER_BUS_NOT_AUTHENTICATING`: `QStatus` = 36915;
public const val `ER_BUS_NOT_AUTHORIZED`: `QStatus` = 37032;
public const val `ER_BUS_NOT_A_COMPLETE_TYPE`: `QStatus` = 36954;
public const val `ER_BUS_NOT_A_DICTIONARY`: `QStatus` = 36977;
public const val `ER_BUS_NOT_COMPRESSED`: `QStatus` = 36931;
public const val `ER_BUS_NOT_CONNECTED`: `QStatus` = 36933;
public const val `ER_BUS_NOT_NUL_TERMINATED`: `QStatus` = 36897;
public const val `ER_BUS_NOT_OWNER`: `QStatus` = 36911;
public const val `ER_BUS_NO_AUTHENTICATION_MECHANISM`: `QStatus` = 36938;
public const val `ER_BUS_NO_CALL_FOR_REPLY`: `QStatus` = 36953;
public const val `ER_BUS_NO_ENDPOINT`: `QStatus` = 36905;
public const val `ER_BUS_NO_LISTENER`: `QStatus` = 36916;
public const val `ER_BUS_NO_PEER_GUID`: `QStatus` = 36948;
public const val `ER_BUS_NO_ROUTE`: `QStatus` = 36904;
public const val `ER_BUS_NO_SESSION`: `QStatus` = 36975;
public const val `ER_BUS_NO_SUCH_ANNOTATION`: `QStatus` = 37081;
public const val `ER_BUS_NO_SUCH_HANDLE`: `QStatus` = 36971;
public const val `ER_BUS_NO_SUCH_INTERFACE`: `QStatus` = 36895;
public const val `ER_BUS_NO_SUCH_MESSAGE`: `QStatus` = 37102;
public const val `ER_BUS_NO_SUCH_OBJECT`: `QStatus` = 36892;
public const val `ER_BUS_NO_SUCH_PROPERTY`: `QStatus` = 36898;
public const val `ER_BUS_NO_SUCH_SERVICE`: `QStatus` = 36956;
public const val `ER_BUS_NO_TRANSPORTS`: `QStatus` = 36902;
public const val `ER_BUS_OBJECT_NOT_REGISTERED`: `QStatus` = 37091;
public const val `ER_BUS_OBJECT_NO_SUCH_INTERFACE`: `QStatus` = 36894;
public const val `ER_BUS_OBJECT_NO_SUCH_MEMBER`: `QStatus` = 36893;
public const val `ER_BUS_OBJ_ALREADY_EXISTS`: `QStatus` = 36928;
public const val `ER_BUS_OBJ_NOT_FOUND`: `QStatus` = 36929;
public const val `ER_BUS_PATH_MISSING`: `QStatus` = 36887;
public const val `ER_BUS_PEER_AUTH_VERSION_MISMATCH`: `QStatus` = 37023;
public const val `ER_BUS_PING_GROUP_NOT_FOUND`: `QStatus` = 37159;
public const val `ER_BUS_POLICY_VIOLATION`: `QStatus` = 36955;
public const val `ER_BUS_PROPERTY_ACCESS_DENIED`: `QStatus` = 36901;
public const val `ER_BUS_PROPERTY_ALREADY_EXISTS`: `QStatus` = 36923;
public const val `ER_BUS_PROPERTY_VALUE_NOT_SET`: `QStatus` = 36900;
public const val `ER_BUS_READ_ERROR`: `QStatus` = 36865;
public const val `ER_BUS_REMOVED_BY_BINDER`: `QStatus` = 37109;
public const val `ER_BUS_REMOVED_BY_BINDER_SELF`: `QStatus` = 37160;
public const val `ER_BUS_REPLY_IS_ERROR_MESSAGE`: `QStatus` = 36914;
public const val `ER_BUS_REPLY_SERIAL_MISSING`: `QStatus` = 36889;
public const val `ER_BUS_SECURITY_FATAL`: `QStatus` = 36950;
public const val `ER_BUS_SECURITY_NOT_ENABLED`: `QStatus` = 37021;
public const val `ER_BUS_SELF_CONNECT`: `QStatus` = 37020;
public const val `ER_BUS_SET_PROPERTY_REJECTED`: `QStatus` = 36912;
public const val `ER_BUS_SET_WRONG_SIGNATURE`: `QStatus` = 36899;
public const val `ER_BUS_SIGNATURE_MISMATCH`: `QStatus` = 36961;
public const val `ER_BUS_STOPPING`: `QStatus` = 36962;
public const val `ER_BUS_TIME_TO_LIVE_EXPIRED`: `QStatus` = 36945;
public const val `ER_BUS_TRANSPORT_ACCESS_DENIED`: `QStatus` = 37164;
public const val `ER_BUS_TRANSPORT_NOT_AVAILABLE`: `QStatus` = 36957;
public const val `ER_BUS_TRANSPORT_NOT_STARTED`: `QStatus` = 36909;
public const val `ER_BUS_TRUNCATED`: `QStatus` = 36936;
public const val `ER_BUS_UNEXPECTED_DISPOSITION`: `QStatus` = 37014;
public const val `ER_BUS_UNEXPECTED_SIGNATURE`: `QStatus` = 36885;
public const val `ER_BUS_UNKNOWN_INTERFACE`: `QStatus` = 36883;
public const val `ER_BUS_UNKNOWN_PATH`: `QStatus` = 36882;
public const val `ER_BUS_UNKNOWN_SERIAL`: `QStatus` = 36881;
public const val `ER_BUS_UNMATCHED_REPLY_SERIAL`: `QStatus` = 36907;
public const val `ER_BUS_WAIT_FAILED`: `QStatus` = 36978;
public const val `ER_BUS_WRITE_ERROR`: `QStatus` = 36866;
public const val `ER_BUS_WRITE_QUEUE_FULL`: `QStatus` = 36919;
public const val `ER_CERTIFICATE_NOT_FOUND`: `QStatus` = 37166;
public const val `ER_COMMON_ERRORS`: `QStatus` = 4096;
public const val `ER_CONNECTION_LIMIT_EXCEEDED`: `QStatus` = 37152;
public const val `ER_CONN_REFUSED`: `QStatus` = 27;
public const val `ER_CORRUPT_KEYBLOB`: `QStatus` = 4115;
public const val `ER_CRYPTO_ERROR`: `QStatus` = 4109;
public const val `ER_CRYPTO_HASH_UNINITIALIZED`: `QStatus` = 4123;
public const val `ER_CRYPTO_ILLEGAL_PARAMETERS`: `QStatus` = 4122;
public const val `ER_CRYPTO_INSUFFICIENT_SECURITY`: `QStatus` = 4121;
public const val `ER_CRYPTO_KEY_UNAVAILABLE`: `QStatus` = 4111;
public const val `ER_CRYPTO_KEY_UNUSABLE`: `QStatus` = 4113;
public const val `ER_CRYPTO_TRUNCATED`: `QStatus` = 4110;
public const val `ER_DBUS_RELEASE_NAME_REPLY_NON_EXISTENT`: `QStatus` = 36987;
public const val `ER_DBUS_RELEASE_NAME_REPLY_NOT_OWNER`: `QStatus` = 36988;
public const val `ER_DBUS_RELEASE_NAME_REPLY_RELEASED`: `QStatus` = 36986;
public const val `ER_DBUS_REQUEST_NAME_REPLY_ALREADY_OWNER`: `QStatus` = 36985;
public const val `ER_DBUS_REQUEST_NAME_REPLY_EXISTS`: `QStatus` = 36984;
public const val `ER_DBUS_REQUEST_NAME_REPLY_IN_QUEUE`: `QStatus` = 36983;
public const val `ER_DBUS_REQUEST_NAME_REPLY_PRIMARY_OWNER`: `QStatus` = 36982;
public const val `ER_DBUS_START_REPLY_ALREADY_RUNNING`: `QStatus` = 36990;
public const val `ER_DEADLOCK`: `QStatus` = 31;
public const val `ER_DEAD_THREAD`: `QStatus` = 4117;
public const val `ER_DIGEST_MISMATCH`: `QStatus` = 37170;
public const val `ER_DUPLICATE_CERTIFICATE`: `QStatus` = 37167;
public const val `ER_DUPLICATE_KEY`: `QStatus` = 37171;
public const val `ER_EMPTY_KEY_BLOB`: `QStatus` = 4114;
public const val `ER_END_OF_DATA`: `QStatus` = 26;
public const val `ER_EOF`: `QStatus` = 30;
public const val `ER_EXTERNAL_THREAD`: `QStatus` = 4108;
public const val `ER_FAIL`: `QStatus` = 1;
public const val `ER_FEATURE_NOT_AVAILABLE`: `QStatus` = 37177;
public const val `ER_INIT_FAILED`: `QStatus` = 7;
public const val `ER_INVALID_ADDRESS`: `QStatus` = 20;
public const val `ER_INVALID_APPLICATION_STATE`: `QStatus` = 37176;
public const val `ER_INVALID_CERTIFICATE`: `QStatus` = 37165;
public const val `ER_INVALID_CERTIFICATE_USAGE`: `QStatus` = 37182;
public const val `ER_INVALID_CERT_CHAIN`: `QStatus` = 37174;
public const val `ER_INVALID_CONFIG`: `QStatus` = 37161;
public const val `ER_INVALID_DATA`: `QStatus` = 21;
public const val `ER_INVALID_GUID`: `QStatus` = 4126;
public const val `ER_INVALID_HTTP_METHOD_USED_FOR_RENDEZVOUS_SERVER_INTERFACE_MESSAGE`: `QStatus` = 37075;
public const val `ER_INVALID_KEY_ENCODING`: `QStatus` = 4116;
public const val `ER_INVALID_ON_DEMAND_CONNECTION_MESSAGE_RESPONSE`: `QStatus` = 37074;
public const val `ER_INVALID_PERSISTENT_CONNECTION_MESSAGE_RESPONSE`: `QStatus` = 37073;
public const val `ER_INVALID_RENDEZVOUS_SERVER_INTERFACE_MESSAGE`: `QStatus` = 37072;
public const val `ER_INVALID_SIGNAL_EMISSION_TYPE`: `QStatus` = 37183;
public const val `ER_INVALID_STREAM`: `QStatus` = 4129;
public const val `ER_IODISPATCH_STOPPING`: `QStatus` = 4131;
public const val `ER_KEY_STORE_ALREADY_INITIALIZED`: `QStatus` = 37178;
public const val `ER_KEY_STORE_ID_NOT_YET_SET`: `QStatus` = 37179;
public const val `ER_LANGUAGE_NOT_SUPPORTED`: `QStatus` = 37146;
public const val `ER_MANAGEMENT_ALREADY_STARTED`: `QStatus` = 37186;
public const val `ER_MANAGEMENT_NOT_STARTED`: `QStatus` = 37187;
public const val `ER_MANIFEST_NOT_FOUND`: `QStatus` = 37173;
public const val `ER_MANIFEST_REJECTED`: `QStatus` = 37181;
public const val `ER_MISSING_DIGEST_IN_CERTIFICATE`: `QStatus` = 37169;
public const val `ER_NONE`: `QStatus` = 65535;
public const val `ER_NOT_CONN`: `QStatus` = 4141;
public const val `ER_NOT_CONNECTED_TO_RENDEZVOUS_SERVER`: `QStatus` = 37070;
public const val `ER_NOT_IMPLEMENTED`: `QStatus` = 9;
public const val `ER_NO_COMMON_TRUST`: `QStatus` = 37172;
public const val `ER_NO_SUCH_ALARM`: `QStatus` = 4102;
public const val `ER_NO_SUCH_DEVICE`: `QStatus` = 37084;
public const val `ER_NO_TRUST_ANCHOR`: `QStatus` = 37175;
public const val `ER_OK`: `QStatus` = 0;
public const val `ER_OPEN_FAILED`: `QStatus` = 24;
public const val `ER_OS_ERROR`: `QStatus` = 4;
public const val `ER_OUT_OF_MEMORY`: `QStatus` = 5;
public const val `ER_P2P`: `QStatus` = 37085;
public const val `ER_P2P_BUSY`: `QStatus` = 37093;
public const val `ER_P2P_DISABLED`: `QStatus` = 37092;
public const val `ER_P2P_FORBIDDEN`: `QStatus` = 37097;
public const val `ER_P2P_NOT_CONNECTED`: `QStatus` = 37087;
public const val `ER_P2P_NO_GO`: `QStatus` = 37095;
public const val `ER_P2P_NO_STA`: `QStatus` = 37096;
public const val `ER_P2P_TIMEOUT`: `QStatus` = 37086;
public const val `ER_PACKET_BAD_CRC`: `QStatus` = 37039;
public const val `ER_PACKET_BAD_FORMAT`: `QStatus` = 37034;
public const val `ER_PACKET_BAD_PARAMETER`: `QStatus` = 37038;
public const val `ER_PACKET_BUS_NO_SUCH_CHANNEL`: `QStatus` = 37033;
public const val `ER_PACKET_CHANNEL_FAIL`: `QStatus` = 37036;
public const val `ER_PACKET_CONNECT_TIMEOUT`: `QStatus` = 37035;
public const val `ER_PACKET_TOO_LARGE`: `QStatus` = 37037;
public const val `ER_PARSE_ERROR`: `QStatus` = 25;
public const val `ER_PERMISSION_DENIED`: `QStatus` = 37154;
public const val `ER_POLICY_NOT_NEWER`: `QStatus` = 37180;
public const val `ER_PROXIMITY_CONNECTION_ESTABLISH_FAIL`: `QStatus` = 37089;
public const val `ER_PROXIMITY_NO_PEERS_FOUND`: `QStatus` = 37090;
public const val `ER_READ_ERROR`: `QStatus` = 22;
public const val `ER_RENDEZVOUS_SERVER_DEACTIVATED_USER`: `QStatus` = 37067;
public const val `ER_RENDEZVOUS_SERVER_ERR401_UNAUTHORIZED_REQUEST`: `QStatus` = 37078;
public const val `ER_RENDEZVOUS_SERVER_ERR500_INTERNAL_ERROR`: `QStatus` = 37076;
public const val `ER_RENDEZVOUS_SERVER_ERR503_STATUS_UNAVAILABLE`: `QStatus` = 37077;
public const val `ER_RENDEZVOUS_SERVER_ROOT_CERTIFICATE_UNINITIALIZED`: `QStatus` = 37080;
public const val `ER_RENDEZVOUS_SERVER_UNKNOWN_USER`: `QStatus` = 37068;
public const val `ER_RENDEZVOUS_SERVER_UNRECOVERABLE_ERROR`: `QStatus` = 37079;
public const val `ER_SLAP_CRC_ERROR`: `QStatus` = 4137;
public const val `ER_SLAP_ERROR`: `QStatus` = 4138;
public const val `ER_SLAP_HDR_CHECKSUM_ERROR`: `QStatus` = 4133;
public const val `ER_SLAP_INVALID_PACKET_LEN`: `QStatus` = 4132;
public const val `ER_SLAP_INVALID_PACKET_TYPE`: `QStatus` = 4134;
public const val `ER_SLAP_LEN_MISMATCH`: `QStatus` = 4135;
public const val `ER_SLAP_OTHER_END_CLOSED`: `QStatus` = 4139;
public const val `ER_SLAP_PACKET_TYPE_MISMATCH`: `QStatus` = 4136;
public const val `ER_SOCKET_BIND_ERROR`: `QStatus` = 6;
public const val `ER_SOCK_CLOSING`: `QStatus` = 37083;
public const val `ER_SOCK_OTHER_END_CLOSED`: `QStatus` = 11;
public const val `ER_SSL_CONNECT`: `QStatus` = 4106;
public const val `ER_SSL_ERRORS`: `QStatus` = 4104;
public const val `ER_SSL_INIT`: `QStatus` = 4105;
public const val `ER_SSL_VERIFY`: `QStatus` = 4107;
public const val `ER_STOPPING_THREAD`: `QStatus` = 4097;
public const val `ER_TCP_MAX_UNTRUSTED`: `QStatus` = 37144;
public const val `ER_THREADPOOL_EXHAUSTED`: `QStatus` = 4127;
public const val `ER_THREADPOOL_STOPPING`: `QStatus` = 4128;
public const val `ER_THREAD_NO_WAIT`: `QStatus` = 4124;
public const val `ER_THREAD_RUNNING`: `QStatus` = 4118;
public const val `ER_THREAD_STOPPING`: `QStatus` = 4119;
public const val `ER_TIMEOUT`: `QStatus` = 10;
public const val `ER_TIMER_EXITING`: `QStatus` = 4125;
public const val `ER_TIMER_FALLBEHIND`: `QStatus` = 4103;
public const val `ER_TIMER_FULL`: `QStatus` = 4130;
public const val `ER_TIMER_NOT_ALLOWED`: `QStatus` = 4140;
public const val `ER_UDP_BACKPRESSURE`: `QStatus` = 37123;
public const val `ER_UDP_BUSHELLO`: `QStatus` = 37129;
public const val `ER_UDP_DEMUX_NO_ENDPOINT`: `QStatus` = 37114;
public const val `ER_UDP_DISCONNECT`: `QStatus` = 37118;
public const val `ER_UDP_EARLY_EXIT`: `QStatus` = 37137;
public const val `ER_UDP_ENDPOINT_NOT_STARTED`: `QStatus` = 37149;
public const val `ER_UDP_ENDPOINT_REMOVED`: `QStatus` = 37150;
public const val `ER_UDP_ENDPOINT_STALLED`: `QStatus` = 37133;
public const val `ER_UDP_INVALID`: `QStatus` = 37131;
public const val `ER_UDP_LOCAL_DISCONNECT`: `QStatus` = 37136;
public const val `ER_UDP_LOCAL_DISCONNECT_FAIL`: `QStatus` = 37138;
public const val `ER_UDP_MESSAGE`: `QStatus` = 37130;
public const val `ER_UDP_MSG_TOO_LONG`: `QStatus` = 37113;
public const val `ER_UDP_NOT_DISCONNECTED`: `QStatus` = 37148;
public const val `ER_UDP_NOT_IMPLEMENTED`: `QStatus` = 37119;
public const val `ER_UDP_NO_LISTENER`: `QStatus` = 37120;
public const val `ER_UDP_NO_NETWORK`: `QStatus` = 37115;
public const val `ER_UDP_STOPPING`: `QStatus` = 37121;
public const val `ER_UDP_UNEXPECTED_FLOW`: `QStatus` = 37117;
public const val `ER_UDP_UNEXPECTED_LENGTH`: `QStatus` = 37116;
public const val `ER_UDP_UNSUPPORTED`: `QStatus` = 37132;
public const val `ER_UNABLE_TO_CONNECT_TO_RENDEZVOUS_SERVER`: `QStatus` = 37069;
public const val `ER_UNABLE_TO_SEND_MESSAGE_TO_RENDEZVOUS_SERVER`: `QStatus` = 37071;
public const val `ER_UNKNOWN_CERTIFICATE`: `QStatus` = 37168;
public const val `ER_UTF_CONVERSION_FAILED`: `QStatus` = 2;
public const val `ER_WARNING`: `QStatus` = 29;
public const val `ER_WOULDBLOCK`: `QStatus` = 8;
public const val `ER_WRITE_ERROR`: `QStatus` = 23;
public const val `ER_XML_ACLS_MISSING`: `QStatus` = 8211;
public const val `ER_XML_ACL_ALL_TYPE_PEER_WITH_OTHERS`: `QStatus` = 8207;
public const val `ER_XML_ACL_PEERS_MISSING`: `QStatus` = 8212;
public const val `ER_XML_ACL_PEER_NOT_UNIQUE`: `QStatus` = 8209;
public const val `ER_XML_ACL_PEER_PUBLIC_KEY_SET`: `QStatus` = 8210;
public const val `ER_XML_ANNOTATION_NOT_UNIQUE`: `QStatus` = 8222;
public const val `ER_XML_CONVERTER_ERROR`: `QStatus` = 8192;
public const val `ER_XML_INTERFACE_MEMBERS_MISSING`: `QStatus` = 8194;
public const val `ER_XML_INTERFACE_NAME_NOT_UNIQUE`: `QStatus` = 8219;
public const val `ER_XML_INVALID_ACL_PEER_CHILDREN_COUNT`: `QStatus` = 8206;
public const val `ER_XML_INVALID_ACL_PEER_PUBLIC_KEY`: `QStatus` = 8208;
public const val `ER_XML_INVALID_ACL_PEER_TYPE`: `QStatus` = 8205;
public const val `ER_XML_INVALID_ANNOTATIONS_COUNT`: `QStatus` = 8198;
public const val `ER_XML_INVALID_ATTRIBUTE_VALUE`: `QStatus` = 8200;
public const val `ER_XML_INVALID_BASE64`: `QStatus` = 8218;
public const val `ER_XML_INVALID_ELEMENT_CHILDREN_COUNT`: `QStatus` = 8202;
public const val `ER_XML_INVALID_ELEMENT_NAME`: `QStatus` = 8199;
public const val `ER_XML_INVALID_INTERFACE_NAME`: `QStatus` = 8214;
public const val `ER_XML_INVALID_MANIFEST_VERSION`: `QStatus` = 8216;
public const val `ER_XML_INVALID_MEMBER_ACTION`: `QStatus` = 8196;
public const val `ER_XML_INVALID_MEMBER_NAME`: `QStatus` = 8215;
public const val `ER_XML_INVALID_MEMBER_TYPE`: `QStatus` = 8195;
public const val `ER_XML_INVALID_OBJECT_PATH`: `QStatus` = 8213;
public const val `ER_XML_INVALID_OID`: `QStatus` = 8217;
public const val `ER_XML_INVALID_POLICY_SERIAL_NUMBER`: `QStatus` = 8204;
public const val `ER_XML_INVALID_POLICY_VERSION`: `QStatus` = 8203;
public const val `ER_XML_INVALID_RULES_COUNT`: `QStatus` = 8193;
public const val `ER_XML_INVALID_SECURITY_LEVEL_ANNOTATION_VALUE`: `QStatus` = 8201;
public const val `ER_XML_MALFORMED`: `QStatus` = 4099;
public const val `ER_XML_MEMBER_DENY_ACTION_WITH_OTHER`: `QStatus` = 8197;
public const val `ER_XML_MEMBER_NAME_NOT_UNIQUE`: `QStatus` = 8220;
public const val `ER_XML_OBJECT_PATH_NOT_UNIQUE`: `QStatus` = 8221;
public const val `NEED_UPDATE`: `alljoyn_applicationstate` = 3;
public const val `NOT_CLAIMABLE`: `alljoyn_applicationstate` = 0;
public const val `PASSWORD_GENERATED_BY_APPLICATION`: `alljoyn_claimcapabilityadditionalinfo_masks` = 2;
public const val `PASSWORD_GENERATED_BY_SECURITY_MANAGER`: `alljoyn_claimcapabilityadditionalinfo_masks` = 1;
public const val `QCC_FALSE`: UInt = 0u;
public const val `QCC_TRUE`: UInt = 1u;
public typealias `QStatus` = Int;
public const val `UNANNOUNCED`: `alljoyn_about_announceflag` = 0;
// UNSUPPORTED Rust 1040:1: generic scalar type unsupported
// pub type alljoyn_about_announced_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, busname: windows_sys::core::PCSTR, version: u16, port: u16, objectdescriptionarg: alljoyn_msgarg, aboutdataarg: alljoyn_msgarg)>;

public typealias `alljoyn_about_announceflag` = Int;
public typealias `alljoyn_aboutdata` = Long;
public typealias `alljoyn_aboutdatalistener` = Long;
// UNSUPPORTED Rust 1044:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_aboutdatalistener_callbacks {
//     pub about_datalistener_getaboutdata: alljoyn_aboutdatalistener_getaboutdata_ptr,
//     pub about_datalistener_getannouncedaboutdata: alljoyn_aboutdatalistener_getannouncedaboutdata_ptr,
// }

// UNSUPPORTED Rust 1050:1: generic scalar type unsupported
// pub type alljoyn_aboutdatalistener_getaboutdata_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, msgarg: alljoyn_msgarg, language: windows_sys::core::PCSTR) -> QStatus>;

// UNSUPPORTED Rust 1051:1: generic scalar type unsupported
// pub type alljoyn_aboutdatalistener_getannouncedaboutdata_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, msgarg: alljoyn_msgarg) -> QStatus>;

public typealias `alljoyn_abouticon` = Long;
public typealias `alljoyn_abouticonobj` = Long;
public typealias `alljoyn_abouticonproxy` = Long;
public typealias `alljoyn_aboutlistener` = Long;
// UNSUPPORTED Rust 1056:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_aboutlistener_callback {
//     pub about_listener_announced: alljoyn_about_announced_ptr,
// }

public typealias `alljoyn_aboutobj` = Long;
public typealias `alljoyn_aboutobjectdescription` = Long;
public typealias `alljoyn_aboutproxy` = Long;
public typealias `alljoyn_applicationstate` = Int;
public typealias `alljoyn_applicationstatelistener` = Long;
// UNSUPPORTED Rust 1066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_applicationstatelistener_callbacks {
//     pub state: alljoyn_applicationstatelistener_state_ptr,
// }

// UNSUPPORTED Rust 1071:1: generic scalar type unsupported
// pub type alljoyn_applicationstatelistener_state_ptr = Option<unsafe extern "system" fn(busname: *mut i8, publickey: *mut i8, applicationstate: alljoyn_applicationstate, context: *mut core::ffi::c_void)>;

public typealias `alljoyn_authlistener` = Long;
// UNSUPPORTED Rust 1073:1: generic scalar type unsupported
// pub type alljoyn_authlistener_authenticationcomplete_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, authmechanism: windows_sys::core::PCSTR, peername: windows_sys::core::PCSTR, success: i32)>;

// UNSUPPORTED Rust 1074:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_authlistener_callbacks {
//     pub request_credentials: alljoyn_authlistener_requestcredentials_ptr,
//     pub verify_credentials: alljoyn_authlistener_verifycredentials_ptr,
//     pub security_violation: alljoyn_authlistener_securityviolation_ptr,
//     pub authentication_complete: alljoyn_authlistener_authenticationcomplete_ptr,
// }

// UNSUPPORTED Rust 1082:1: generic scalar type unsupported
// pub type alljoyn_authlistener_requestcredentials_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, authmechanism: windows_sys::core::PCSTR, peername: windows_sys::core::PCSTR, authcount: u16, username: windows_sys::core::PCSTR, credmask: u16, credentials: alljoyn_credentials) -> i32>;

// UNSUPPORTED Rust 1083:1: generic scalar type unsupported
// pub type alljoyn_authlistener_requestcredentialsasync_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, listener: alljoyn_authlistener, authmechanism: windows_sys::core::PCSTR, peername: windows_sys::core::PCSTR, authcount: u16, username: windows_sys::core::PCSTR, credmask: u16, authcontext: *mut core::ffi::c_void) -> QStatus>;

// UNSUPPORTED Rust 1084:1: generic scalar type unsupported
// pub type alljoyn_authlistener_securityviolation_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, status: QStatus, msg: alljoyn_message)>;

// UNSUPPORTED Rust 1085:1: generic scalar type unsupported
// pub type alljoyn_authlistener_verifycredentials_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, authmechanism: windows_sys::core::PCSTR, peername: windows_sys::core::PCSTR, credentials: alljoyn_credentials) -> i32>;

// UNSUPPORTED Rust 1086:1: generic scalar type unsupported
// pub type alljoyn_authlistener_verifycredentialsasync_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, listener: alljoyn_authlistener, authmechanism: windows_sys::core::PCSTR, peername: windows_sys::core::PCSTR, credentials: alljoyn_credentials, authcontext: *mut core::ffi::c_void) -> QStatus>;

// UNSUPPORTED Rust 1087:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_authlistenerasync_callbacks {
//     pub request_credentials: alljoyn_authlistener_requestcredentialsasync_ptr,
//     pub verify_credentials: alljoyn_authlistener_verifycredentialsasync_ptr,
//     pub security_violation: alljoyn_authlistener_securityviolation_ptr,
//     pub authentication_complete: alljoyn_authlistener_authenticationcomplete_ptr,
// }

public typealias `alljoyn_autopinger` = Long;
// UNSUPPORTED Rust 1096:1: generic scalar type unsupported
// pub type alljoyn_autopinger_destination_found_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, group: windows_sys::core::PCSTR, destination: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 1097:1: generic scalar type unsupported
// pub type alljoyn_autopinger_destination_lost_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, group: windows_sys::core::PCSTR, destination: windows_sys::core::PCSTR)>;

public typealias `alljoyn_busattachment` = Long;
// UNSUPPORTED Rust 1099:1: generic scalar type unsupported
// pub type alljoyn_busattachment_joinsessioncb_ptr = Option<unsafe extern "system" fn(status: QStatus, sessionid: u32, opts: alljoyn_sessionopts, context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1100:1: generic scalar type unsupported
// pub type alljoyn_busattachment_setlinktimeoutcb_ptr = Option<unsafe extern "system" fn(status: QStatus, timeout: u32, context: *mut core::ffi::c_void)>;

public typealias `alljoyn_buslistener` = Long;
// UNSUPPORTED Rust 1102:1: generic scalar type unsupported
// pub type alljoyn_buslistener_bus_disconnected_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1103:1: generic scalar type unsupported
// pub type alljoyn_buslistener_bus_prop_changed_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, prop_name: windows_sys::core::PCSTR, prop_value: alljoyn_msgarg)>;

// UNSUPPORTED Rust 1104:1: generic scalar type unsupported
// pub type alljoyn_buslistener_bus_stopping_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_buslistener_callbacks {
//     pub listener_registered: alljoyn_buslistener_listener_registered_ptr,
//     pub listener_unregistered: alljoyn_buslistener_listener_unregistered_ptr,
//     pub found_advertised_name: alljoyn_buslistener_found_advertised_name_ptr,
//     pub lost_advertised_name: alljoyn_buslistener_lost_advertised_name_ptr,
//     pub name_owner_changed: alljoyn_buslistener_name_owner_changed_ptr,
//     pub bus_stopping: alljoyn_buslistener_bus_stopping_ptr,
//     pub bus_disconnected: alljoyn_buslistener_bus_disconnected_ptr,
//     pub property_changed: alljoyn_buslistener_bus_prop_changed_ptr,
// }

// UNSUPPORTED Rust 1117:1: generic scalar type unsupported
// pub type alljoyn_buslistener_found_advertised_name_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, name: windows_sys::core::PCSTR, transport: u16, nameprefix: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 1118:1: generic scalar type unsupported
// pub type alljoyn_buslistener_listener_registered_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, bus: alljoyn_busattachment)>;

// UNSUPPORTED Rust 1119:1: generic scalar type unsupported
// pub type alljoyn_buslistener_listener_unregistered_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1120:1: generic scalar type unsupported
// pub type alljoyn_buslistener_lost_advertised_name_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, name: windows_sys::core::PCSTR, transport: u16, nameprefix: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 1121:1: generic scalar type unsupported
// pub type alljoyn_buslistener_name_owner_changed_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, busname: windows_sys::core::PCSTR, previousowner: windows_sys::core::PCSTR, newowner: windows_sys::core::PCSTR)>;

public typealias `alljoyn_busobject` = Long;
// UNSUPPORTED Rust 1123:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_busobject_callbacks {
//     pub property_get: alljoyn_busobject_prop_get_ptr,
//     pub property_set: alljoyn_busobject_prop_set_ptr,
//     pub object_registered: alljoyn_busobject_object_registration_ptr,
//     pub object_unregistered: alljoyn_busobject_object_registration_ptr,
// }

// UNSUPPORTED Rust 1131:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct alljoyn_busobject_methodentry {
//     pub member: *const alljoyn_interfacedescription_member,
//     pub method_handler: alljoyn_messagereceiver_methodhandler_ptr,
// }

// UNSUPPORTED Rust 1137:1: declaration Impl has no candidate rule
// impl Default for alljoyn_busobject_methodentry {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1142:1: generic scalar type unsupported
// pub type alljoyn_busobject_object_registration_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1143:1: generic scalar type unsupported
// pub type alljoyn_busobject_prop_get_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, ifcname: windows_sys::core::PCSTR, propname: windows_sys::core::PCSTR, val: alljoyn_msgarg) -> QStatus>;

// UNSUPPORTED Rust 1144:1: generic scalar type unsupported
// pub type alljoyn_busobject_prop_set_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, ifcname: windows_sys::core::PCSTR, propname: windows_sys::core::PCSTR, val: alljoyn_msgarg) -> QStatus>;

// UNSUPPORTED Rust 1145:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct alljoyn_certificateid {
//     pub serial: *mut u8,
//     pub serialLen: usize,
//     pub issuerPublicKey: *mut i8,
//     pub issuerAki: *mut u8,
//     pub issuerAkiLen: usize,
// }

// UNSUPPORTED Rust 1154:1: declaration Impl has no candidate rule
// impl Default for alljoyn_certificateid {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1159:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct alljoyn_certificateidarray {
//     pub count: usize,
//     pub ids: *mut alljoyn_certificateid,
// }

// UNSUPPORTED Rust 1165:1: declaration Impl has no candidate rule
// impl Default for alljoyn_certificateidarray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `alljoyn_claimcapability_masks` = Int;
public typealias `alljoyn_claimcapabilityadditionalinfo_masks` = Int;
public typealias `alljoyn_credentials` = Long;
public typealias `alljoyn_interfacedescription` = Long;
// UNSUPPORTED Rust 1174:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct alljoyn_interfacedescription_member {
//     pub iface: alljoyn_interfacedescription,
//     pub memberType: alljoyn_messagetype,
//     pub name: windows_sys::core::PCSTR,
//     pub signature: windows_sys::core::PCSTR,
//     pub returnSignature: windows_sys::core::PCSTR,
//     pub argNames: windows_sys::core::PCSTR,
//     pub internal_member: *const core::ffi::c_void,
// }

// UNSUPPORTED Rust 1185:1: declaration Impl has no candidate rule
// impl Default for alljoyn_interfacedescription_member {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1190:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct alljoyn_interfacedescription_property {
//     pub name: windows_sys::core::PCSTR,
//     pub signature: windows_sys::core::PCSTR,
//     pub access: u8,
//     pub internal_property: *const core::ffi::c_void,
// }

// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule
// impl Default for alljoyn_interfacedescription_property {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `alljoyn_interfacedescription_securitypolicy` = Int;
// UNSUPPORTED Rust 1204:1: generic scalar type unsupported
// pub type alljoyn_interfacedescription_translation_callback_ptr = Option<unsafe extern "system" fn(sourcelanguage: windows_sys::core::PCSTR, targetlanguage: windows_sys::core::PCSTR, sourcetext: windows_sys::core::PCSTR) -> windows_sys::core::PCSTR>;

public typealias `alljoyn_keystore` = Long;
public typealias `alljoyn_keystorelistener` = Long;
// UNSUPPORTED Rust 1207:1: generic scalar type unsupported
// pub type alljoyn_keystorelistener_acquireexclusivelock_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, listener: alljoyn_keystorelistener) -> QStatus>;

// UNSUPPORTED Rust 1208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_keystorelistener_callbacks {
//     pub load_request: alljoyn_keystorelistener_loadrequest_ptr,
//     pub store_request: alljoyn_keystorelistener_storerequest_ptr,
// }

// UNSUPPORTED Rust 1214:1: generic scalar type unsupported
// pub type alljoyn_keystorelistener_loadrequest_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, listener: alljoyn_keystorelistener, keystore: alljoyn_keystore) -> QStatus>;

// UNSUPPORTED Rust 1215:1: generic scalar type unsupported
// pub type alljoyn_keystorelistener_releaseexclusivelock_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, listener: alljoyn_keystorelistener)>;

// UNSUPPORTED Rust 1216:1: generic scalar type unsupported
// pub type alljoyn_keystorelistener_storerequest_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, listener: alljoyn_keystorelistener, keystore: alljoyn_keystore) -> QStatus>;

// UNSUPPORTED Rust 1217:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_keystorelistener_with_synchronization_callbacks {
//     pub load_request: alljoyn_keystorelistener_loadrequest_ptr,
//     pub store_request: alljoyn_keystorelistener_storerequest_ptr,
//     pub acquire_exclusive_lock: alljoyn_keystorelistener_acquireexclusivelock_ptr,
//     pub release_exclusive_lock: alljoyn_keystorelistener_releaseexclusivelock_ptr,
// }

// UNSUPPORTED Rust 1225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct alljoyn_manifestarray {
//     pub count: usize,
//     pub xmls: *mut *mut i8,
// }

// UNSUPPORTED Rust 1231:1: declaration Impl has no candidate rule
// impl Default for alljoyn_manifestarray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `alljoyn_message` = Long;
// UNSUPPORTED Rust 1237:1: generic scalar type unsupported
// pub type alljoyn_messagereceiver_methodhandler_ptr = Option<unsafe extern "system" fn(bus: alljoyn_busobject, member: *const alljoyn_interfacedescription_member, message: alljoyn_message)>;

// UNSUPPORTED Rust 1238:1: generic scalar type unsupported
// pub type alljoyn_messagereceiver_replyhandler_ptr = Option<unsafe extern "system" fn(message: alljoyn_message, context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1239:1: generic scalar type unsupported
// pub type alljoyn_messagereceiver_signalhandler_ptr = Option<unsafe extern "system" fn(member: *const alljoyn_interfacedescription_member, srcpath: windows_sys::core::PCSTR, message: alljoyn_message)>;

public typealias `alljoyn_messagetype` = Int;
public typealias `alljoyn_msgarg` = Long;
public typealias `alljoyn_observer` = Long;
// UNSUPPORTED Rust 1243:1: generic scalar type unsupported
// pub type alljoyn_observer_object_discovered_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, proxyref: alljoyn_proxybusobject_ref)>;

// UNSUPPORTED Rust 1244:1: generic scalar type unsupported
// pub type alljoyn_observer_object_lost_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, proxyref: alljoyn_proxybusobject_ref)>;

public typealias `alljoyn_observerlistener` = Long;
// UNSUPPORTED Rust 1246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_observerlistener_callback {
//     pub object_discovered: alljoyn_observer_object_discovered_ptr,
//     pub object_lost: alljoyn_observer_object_lost_ptr,
// }

public typealias `alljoyn_permissionconfigurationlistener` = Long;
// UNSUPPORTED Rust 1253:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_permissionconfigurationlistener_callbacks {
//     pub factory_reset: alljoyn_permissionconfigurationlistener_factoryreset_ptr,
//     pub policy_changed: alljoyn_permissionconfigurationlistener_policychanged_ptr,
//     pub start_management: alljoyn_permissionconfigurationlistener_startmanagement_ptr,
//     pub end_management: alljoyn_permissionconfigurationlistener_endmanagement_ptr,
// }

// UNSUPPORTED Rust 1261:1: generic scalar type unsupported
// pub type alljoyn_permissionconfigurationlistener_endmanagement_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1262:1: generic scalar type unsupported
// pub type alljoyn_permissionconfigurationlistener_factoryreset_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void) -> QStatus>;

// UNSUPPORTED Rust 1263:1: generic scalar type unsupported
// pub type alljoyn_permissionconfigurationlistener_policychanged_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 1264:1: generic scalar type unsupported
// pub type alljoyn_permissionconfigurationlistener_startmanagement_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void)>;

public typealias `alljoyn_permissionconfigurator` = Long;
public typealias `alljoyn_pinglistener` = Long;
// UNSUPPORTED Rust 1267:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_pinglistener_callback {
//     pub destination_found: alljoyn_autopinger_destination_found_ptr,
//     pub destination_lost: alljoyn_autopinger_destination_lost_ptr,
// }

public typealias `alljoyn_proxybusobject` = Long;
// UNSUPPORTED Rust 1274:1: generic scalar type unsupported
// pub type alljoyn_proxybusobject_listener_getallpropertiescb_ptr = Option<unsafe extern "system" fn(status: QStatus, obj: alljoyn_proxybusobject, values: alljoyn_msgarg, context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1275:1: generic scalar type unsupported
// pub type alljoyn_proxybusobject_listener_getpropertycb_ptr = Option<unsafe extern "system" fn(status: QStatus, obj: alljoyn_proxybusobject, value: alljoyn_msgarg, context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1276:1: generic scalar type unsupported
// pub type alljoyn_proxybusobject_listener_introspectcb_ptr = Option<unsafe extern "system" fn(status: QStatus, obj: alljoyn_proxybusobject, context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1277:1: generic scalar type unsupported
// pub type alljoyn_proxybusobject_listener_propertieschanged_ptr = Option<unsafe extern "system" fn(obj: alljoyn_proxybusobject, ifacename: windows_sys::core::PCSTR, changed: alljoyn_msgarg, invalidated: alljoyn_msgarg, context: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 1278:1: generic scalar type unsupported
// pub type alljoyn_proxybusobject_listener_setpropertycb_ptr = Option<unsafe extern "system" fn(status: QStatus, obj: alljoyn_proxybusobject, context: *mut core::ffi::c_void)>;

public typealias `alljoyn_proxybusobject_ref` = Long;
public typealias `alljoyn_securityapplicationproxy` = Long;
public typealias `alljoyn_sessionlistener` = Long;
// UNSUPPORTED Rust 1282:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_sessionlistener_callbacks {
//     pub session_lost: alljoyn_sessionlistener_sessionlost_ptr,
//     pub session_member_added: alljoyn_sessionlistener_sessionmemberadded_ptr,
//     pub session_member_removed: alljoyn_sessionlistener_sessionmemberremoved_ptr,
// }

// UNSUPPORTED Rust 1289:1: generic scalar type unsupported
// pub type alljoyn_sessionlistener_sessionlost_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, sessionid: u32, reason: alljoyn_sessionlostreason)>;

// UNSUPPORTED Rust 1290:1: generic scalar type unsupported
// pub type alljoyn_sessionlistener_sessionmemberadded_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, sessionid: u32, uniquename: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 1291:1: generic scalar type unsupported
// pub type alljoyn_sessionlistener_sessionmemberremoved_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, sessionid: u32, uniquename: windows_sys::core::PCSTR)>;

public typealias `alljoyn_sessionlostreason` = Int;
public typealias `alljoyn_sessionopts` = Long;
public typealias `alljoyn_sessionportlistener` = Long;
// UNSUPPORTED Rust 1295:1: generic scalar type unsupported
// pub type alljoyn_sessionportlistener_acceptsessionjoiner_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, sessionport: u16, joiner: windows_sys::core::PCSTR, opts: alljoyn_sessionopts) -> i32>;

// UNSUPPORTED Rust 1296:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct alljoyn_sessionportlistener_callbacks {
//     pub accept_session_joiner: alljoyn_sessionportlistener_acceptsessionjoiner_ptr,
//     pub session_joined: alljoyn_sessionportlistener_sessionjoined_ptr,
// }

// UNSUPPORTED Rust 1302:1: generic scalar type unsupported
// pub type alljoyn_sessionportlistener_sessionjoined_ptr = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, sessionport: u16, id: u32, joiner: windows_sys::core::PCSTR)>;

public typealias `alljoyn_typeid` = Int;
