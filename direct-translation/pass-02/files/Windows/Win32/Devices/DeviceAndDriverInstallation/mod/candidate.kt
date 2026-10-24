// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CMP_WaitNoPendingInstallEvents(dwtimeout : u32) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Data_HtmlHelp")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_Empty_Log_Conf(plclogconf : *mut usize, dndevinst : u32, priority : super::super::Data::HtmlHelp:: PRIORITY, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Data_HtmlHelp")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_Empty_Log_Conf_Ex(plclogconf : *mut usize, dndevinst : u32, priority : super::super::Data::HtmlHelp:: PRIORITY, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_IDA(dndevinst : u32, pszid : windows_sys::core::PCSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_IDW(dndevinst : u32, pszid : windows_sys::core::PCWSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_ID_ExA(dndevinst : u32, pszid : windows_sys::core::PCSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_ID_ExW(dndevinst : u32, pszid : windows_sys::core::PCWSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_Range(ullstartvalue : u64, ullendvalue : u64, rlh : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_Res_Des(prdresdes : *mut usize, lclogconf : usize, resourceid : u32, resourcedata : *const core::ffi::c_void, resourcelen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Add_Res_Des_Ex(prdresdes : *mut usize, lclogconf : usize, resourceid : u32, resourcedata : *const core::ffi::c_void, resourcelen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Connect_MachineA(uncservername : windows_sys::core::PCSTR, phmachine : *mut isize) -> CONFIGRET);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Connect_MachineW(uncservername : windows_sys::core::PCWSTR, phmachine : *mut isize) -> CONFIGRET);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Create_DevNodeA(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCSTR, dnparent : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Create_DevNodeW(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCWSTR, dnparent : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Create_DevNode_ExA(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCSTR, dnparent : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Create_DevNode_ExW(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCWSTR, dnparent : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Create_Range_List(prlh : *mut usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Class_Key(classguid : *const windows_sys::core::GUID, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Class_Key_Ex(classguid : *const windows_sys::core::GUID, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_DevNode_Key(dndevnode : u32, ulhardwareprofile : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_DevNode_Key_Ex(dndevnode : u32, ulhardwareprofile : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Device_Interface_KeyA(pszdeviceinterface : windows_sys::core::PCSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Device_Interface_KeyW(pszdeviceinterface : windows_sys::core::PCWSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface : windows_sys::core::PCSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Delete_Range(ullstartvalue : u64, ullendvalue : u64, rlh : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Detect_Resource_Conflict(dndevinst : u32, resourceid : u32, resourcedata : *const core::ffi::c_void, resourcelen : u32, pbconflictdetected : *mut windows_sys::core::BOOL, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Detect_Resource_Conflict_Ex(dndevinst : u32, resourceid : u32, resourcedata : *const core::ffi::c_void, resourcelen : u32, pbconflictdetected : *mut windows_sys::core::BOOL, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Disable_DevNode(dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Disable_DevNode_Ex(dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Disconnect_Machine(hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Dup_Range_List(rlhold : usize, rlhnew : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enable_DevNode(dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enable_DevNode_Ex(dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enumerate_Classes(ulclassindex : u32, classguid : *mut windows_sys::core::GUID, ulflags : CM_ENUMERATE_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enumerate_Classes_Ex(ulclassindex : u32, classguid : *mut windows_sys::core::GUID, ulflags : CM_ENUMERATE_FLAGS, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enumerate_EnumeratorsA(ulenumindex : u32, buffer : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enumerate_EnumeratorsW(ulenumindex : u32, buffer : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enumerate_Enumerators_ExA(ulenumindex : u32, buffer : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Enumerate_Enumerators_ExW(ulenumindex : u32, buffer : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Find_Range(pullstart : *mut u64, ullstart : u64, ullength : u32, ullalignment : u64, ullend : u64, rlh : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_First_Range(rlh : usize, pullstart : *mut u64, pullend : *mut u64, preelement : *mut usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Log_Conf(lclogconftobefreed : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Log_Conf_Ex(lclogconftobefreed : usize, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Log_Conf_Handle(lclogconf : usize) -> CONFIGRET);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Range_List(rlh : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Res_Des(prdresdes : *mut usize, rdresdes : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Res_Des_Ex(prdresdes : *mut usize, rdresdes : usize, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Res_Des_Handle(rdresdes : usize) -> CONFIGRET);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Free_Resource_Conflict_Handle(clconflictlist : usize) -> CONFIGRET);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Child(pdndevinst : *mut u32, dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Child_Ex(pdndevinst : *mut u32, dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Key_NameA(classguid : *const windows_sys::core::GUID, pszkeyname : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Key_NameW(classguid : *const windows_sys::core::GUID, pszkeyname : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Key_Name_ExA(classguid : *const windows_sys::core::GUID, pszkeyname : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Key_Name_ExW(classguid : *const windows_sys::core::GUID, pszkeyname : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_NameA(classguid : *const windows_sys::core::GUID, buffer : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_NameW(classguid : *const windows_sys::core::GUID, buffer : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Name_ExA(classguid : *const windows_sys::core::GUID, buffer : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Name_ExW(classguid : *const windows_sys::core::GUID, buffer : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_PropertyW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Property_ExW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Property_Keys(classguid : *const windows_sys::core::GUID, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Property_Keys_Ex(classguid : *const windows_sys::core::GUID, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Registry_PropertyA(classguid : *const windows_sys::core::GUID, ulproperty : u32, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Class_Registry_PropertyW(classguid : *const windows_sys::core::GUID, ulproperty : u32, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Depth(puldepth : *mut u32, dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Depth_Ex(puldepth : *mut u32, dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Custom_PropertyA(dndevinst : u32, pszcustompropertyname : windows_sys::core::PCSTR, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Custom_PropertyW(dndevinst : u32, pszcustompropertyname : windows_sys::core::PCWSTR, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Custom_Property_ExA(dndevinst : u32, pszcustompropertyname : windows_sys::core::PCSTR, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Custom_Property_ExW(dndevinst : u32, pszcustompropertyname : windows_sys::core::PCWSTR, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_PropertyW(dndevinst : u32, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Property_ExW(dndevinst : u32, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Property_Keys(dndevinst : u32, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Property_Keys_Ex(dndevinst : u32, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Registry_PropertyA(dndevinst : u32, ulproperty : u32, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Registry_PropertyW(dndevinst : u32, ulproperty : u32, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Registry_Property_ExA(dndevinst : u32, ulproperty : u32, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Registry_Property_ExW(dndevinst : u32, ulproperty : u32, pulregdatatype : *mut u32, buffer : *mut core::ffi::c_void, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Status(pulstatus : *mut CM_DEVNODE_STATUS_FLAGS, pulproblemnumber : *mut CM_PROB, dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_DevNode_Status_Ex(pulstatus : *mut CM_DEVNODE_STATUS_FLAGS, pulproblemnumber : *mut CM_PROB, dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_IDA(dndevinst : u32, buffer : windows_sys::core::PSTR, bufferlen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_IDW(dndevinst : u32, buffer : windows_sys::core::PWSTR, bufferlen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_ExA(dndevinst : u32, buffer : windows_sys::core::PSTR, bufferlen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_ExW(dndevinst : u32, buffer : windows_sys::core::PWSTR, bufferlen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_ListA(pszfilter : windows_sys::core::PCSTR, buffer : windows_sys::core::PSTR, bufferlen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_ListW(pszfilter : windows_sys::core::PCWSTR, buffer : windows_sys::core::PWSTR, bufferlen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_List_ExA(pszfilter : windows_sys::core::PCSTR, buffer : windows_sys::core::PSTR, bufferlen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_List_ExW(pszfilter : windows_sys::core::PCWSTR, buffer : windows_sys::core::PWSTR, bufferlen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_List_SizeA(pullen : *mut u32, pszfilter : windows_sys::core::PCSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_List_SizeW(pullen : *mut u32, pszfilter : windows_sys::core::PCWSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_List_Size_ExA(pullen : *mut u32, pszfilter : windows_sys::core::PCSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_List_Size_ExW(pullen : *mut u32, pszfilter : windows_sys::core::PCWSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_Size(pullen : *mut u32, dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_ID_Size_Ex(pullen : *mut u32, dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_AliasA(pszdeviceinterface : windows_sys::core::PCSTR, aliasinterfaceguid : *const windows_sys::core::GUID, pszaliasdeviceinterface : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_AliasW(pszdeviceinterface : windows_sys::core::PCWSTR, aliasinterfaceguid : *const windows_sys::core::GUID, pszaliasdeviceinterface : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface : windows_sys::core::PCSTR, aliasinterfaceguid : *const windows_sys::core::GUID, pszaliasdeviceinterface : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, aliasinterfaceguid : *const windows_sys::core::GUID, pszaliasdeviceinterface : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_ListA(interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCSTR, buffer : windows_sys::core::PSTR, bufferlen : u32, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_ListW(interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCWSTR, buffer : windows_sys::core::PWSTR, bufferlen : u32, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_List_ExA(interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCSTR, buffer : windows_sys::core::PSTR, bufferlen : u32, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_List_ExW(interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCWSTR, buffer : windows_sys::core::PWSTR, bufferlen : u32, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_List_SizeA(pullen : *mut u32, interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCSTR, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_List_SizeW(pullen : *mut u32, interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCWSTR, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_List_Size_ExA(pullen : *mut u32, interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCSTR, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_List_Size_ExW(pullen : *mut u32, interfaceclassguid : *const windows_sys::core::GUID, pdeviceid : windows_sys::core::PCWSTR, ulflags : CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_PropertyW(pszdeviceinterface : windows_sys::core::PCWSTR, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 117:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_Property_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface : windows_sys::core::PCWSTR, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_First_Log_Conf(plclogconf : *mut usize, dndevinst : u32, ulflags : CM_LOG_CONF) -> CONFIGRET);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_First_Log_Conf_Ex(plclogconf : *mut usize, dndevinst : u32, ulflags : CM_LOG_CONF, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Global_State(pulstate : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Global_State_Ex(pulstate : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_HW_Prof_FlagsA(pdeviceid : windows_sys::core::PCSTR, ulhardwareprofile : u32, pulvalue : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_HW_Prof_FlagsW(pdeviceid : windows_sys::core::PCWSTR, ulhardwareprofile : u32, pulvalue : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_HW_Prof_Flags_ExA(pdeviceid : windows_sys::core::PCSTR, ulhardwareprofile : u32, pulvalue : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_HW_Prof_Flags_ExW(pdeviceid : windows_sys::core::PCWSTR, ulhardwareprofile : u32, pulvalue : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Hardware_Profile_InfoA(ulindex : u32, phwprofileinfo : *mut HWPROFILEINFO_A, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Hardware_Profile_InfoW(ulindex : u32, phwprofileinfo : *mut HWPROFILEINFO_W, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 131:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Hardware_Profile_Info_ExA(ulindex : u32, phwprofileinfo : *mut HWPROFILEINFO_A, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Hardware_Profile_Info_ExW(ulindex : u32, phwprofileinfo : *mut HWPROFILEINFO_W, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 133:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Log_Conf_Priority(lclogconf : usize, ppriority : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Log_Conf_Priority_Ex(lclogconf : usize, ppriority : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Next_Log_Conf(plclogconf : *mut usize, lclogconf : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 136:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Next_Log_Conf_Ex(plclogconf : *mut usize, lclogconf : usize, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Next_Res_Des(prdresdes : *mut usize, rdresdes : usize, forresource : CM_RESTYPE, presourceid : *mut CM_RESTYPE, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 138:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Next_Res_Des_Ex(prdresdes : *mut usize, rdresdes : usize, forresource : CM_RESTYPE, presourceid : *mut CM_RESTYPE, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Parent(pdndevinst : *mut u32, dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 140:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Parent_Ex(pdndevinst : *mut u32, dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Res_Des_Data(rdresdes : usize, buffer : *mut core::ffi::c_void, bufferlen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 142:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Res_Des_Data_Ex(rdresdes : usize, buffer : *mut core::ffi::c_void, bufferlen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Res_Des_Data_Size(pulsize : *mut u32, rdresdes : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Res_Des_Data_Size_Ex(pulsize : *mut u32, rdresdes : usize, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Resource_Conflict_Count(clconflictlist : usize, pulcount : *mut u32) -> CONFIGRET);

// UNSUPPORTED Rust 146:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Resource_Conflict_DetailsA(clconflictlist : usize, ulindex : u32, pconflictdetails : *mut CONFLICT_DETAILS_A) -> CONFIGRET);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Resource_Conflict_DetailsW(clconflictlist : usize, ulindex : u32, pconflictdetails : *mut CONFLICT_DETAILS_W) -> CONFIGRET);

// UNSUPPORTED Rust 148:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Sibling(pdndevinst : *mut u32, dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Sibling_Ex(pdndevinst : *mut u32, dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 150:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Version() -> u16);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Get_Version_Ex(hmachine : isize) -> u16);

// UNSUPPORTED Rust 152:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Intersect_Range_List(rlhold1 : usize, rlhold2 : usize, rlhnew : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Invert_Range_List(rlhold : usize, rlhnew : usize, ullmaxvalue : u64, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Is_Dock_Station_Present(pbpresent : *mut windows_sys::core::BOOL) -> CONFIGRET);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Is_Dock_Station_Present_Ex(pbpresent : *mut windows_sys::core::BOOL, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Is_Version_Available(wversion : u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Is_Version_Available_Ex(wversion : u16, hmachine : isize) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Locate_DevNodeA(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCSTR, ulflags : CM_LOCATE_DEVNODE_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Locate_DevNodeW(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCWSTR, ulflags : CM_LOCATE_DEVNODE_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Locate_DevNode_ExA(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Locate_DevNode_ExW(pdndevinst : *mut u32, pdeviceid : windows_sys::core::PCWSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_MapCrToWin32Err(cmreturncode : CONFIGRET, defaulterr : u32) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Merge_Range_List(rlhold1 : usize, rlhold2 : usize, rlhnew : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Modify_Res_Des(prdresdes : *mut usize, rdresdes : usize, resourceid : u32, resourcedata : *const core::ffi::c_void, resourcelen : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Modify_Res_Des_Ex(prdresdes : *mut usize, rdresdes : usize, resourceid : u32, resourcedata : *const core::ffi::c_void, resourcelen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Move_DevNode(dnfromdevinst : u32, dntodevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Move_DevNode_Ex(dnfromdevinst : u32, dntodevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Next_Range(preelement : *mut usize, pullstart : *mut u64, pullend : *mut u64, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Class_KeyA(classguid : *const windows_sys::core::GUID, pszclassname : windows_sys::core::PCSTR, samdesired : u32, disposition : u32, phkclass : *mut super::super::System::Registry:: HKEY, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Class_KeyW(classguid : *const windows_sys::core::GUID, pszclassname : windows_sys::core::PCWSTR, samdesired : u32, disposition : u32, phkclass : *mut super::super::System::Registry:: HKEY, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Class_Key_ExA(classguid : *const windows_sys::core::GUID, pszclassname : windows_sys::core::PCSTR, samdesired : u32, disposition : u32, phkclass : *mut super::super::System::Registry:: HKEY, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Class_Key_ExW(classguid : *const windows_sys::core::GUID, pszclassname : windows_sys::core::PCWSTR, samdesired : u32, disposition : u32, phkclass : *mut super::super::System::Registry:: HKEY, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_DevNode_Key(dndevnode : u32, samdesired : u32, ulhardwareprofile : u32, disposition : u32, phkdevice : *mut super::super::System::Registry:: HKEY, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_DevNode_Key_Ex(dndevnode : u32, samdesired : u32, ulhardwareprofile : u32, disposition : u32, phkdevice : *mut super::super::System::Registry:: HKEY, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Device_Interface_KeyA(pszdeviceinterface : windows_sys::core::PCSTR, samdesired : u32, disposition : u32, phkdeviceinterface : *mut super::super::System::Registry:: HKEY, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Device_Interface_KeyW(pszdeviceinterface : windows_sys::core::PCWSTR, samdesired : u32, disposition : u32, phkdeviceinterface : *mut super::super::System::Registry:: HKEY, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Device_Interface_Key_ExA(pszdeviceinterface : windows_sys::core::PCSTR, samdesired : u32, disposition : u32, phkdeviceinterface : *mut super::super::System::Registry:: HKEY, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Open_Device_Interface_Key_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, samdesired : u32, disposition : u32, phkdeviceinterface : *mut super::super::System::Registry:: HKEY, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_And_Remove_SubTreeA(dnancestor : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PSTR, ulnamelength : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_And_Remove_SubTreeW(dnancestor : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PWSTR, ulnamelength : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_And_Remove_SubTree_ExA(dnancestor : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PSTR, ulnamelength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_And_Remove_SubTree_ExW(dnancestor : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PWSTR, ulnamelength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Arbitrator_Free_Data(pdata : *mut core::ffi::c_void, datalen : u32, dndevinst : u32, resourceid : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Arbitrator_Free_Data_Ex(pdata : *mut core::ffi::c_void, datalen : u32, dndevinst : u32, resourceid : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Arbitrator_Free_Size(pulsize : *mut u32, dndevinst : u32, resourceid : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Arbitrator_Free_Size_Ex(pulsize : *mut u32, dndevinst : u32, resourceid : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Remove_SubTree(dnancestor : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Remove_SubTree_Ex(dnancestor : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Query_Resource_Conflict_List(pclconflictlist : *mut usize, dndevinst : u32, resourceid : CM_RESTYPE, resourcedata : *const core::ffi::c_void, resourcelen : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Reenumerate_DevNode(dndevinst : u32, ulflags : CM_REENUMERATE_FLAGS) -> CONFIGRET);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Reenumerate_DevNode_Ex(dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Device_Driver(dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Device_Driver_Ex(dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Device_InterfaceA(dndevinst : u32, interfaceclassguid : *const windows_sys::core::GUID, pszreference : windows_sys::core::PCSTR, pszdeviceinterface : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Device_InterfaceW(dndevinst : u32, interfaceclassguid : *const windows_sys::core::GUID, pszreference : windows_sys::core::PCWSTR, pszdeviceinterface : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Device_Interface_ExA(dndevinst : u32, interfaceclassguid : *const windows_sys::core::GUID, pszreference : windows_sys::core::PCSTR, pszdeviceinterface : windows_sys::core::PSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Device_Interface_ExW(dndevinst : u32, interfaceclassguid : *const windows_sys::core::GUID, pszreference : windows_sys::core::PCWSTR, pszdeviceinterface : windows_sys::core::PWSTR, pullength : *mut u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Register_Notification(pfilter : *const CM_NOTIFY_FILTER, pcontext : *const core::ffi::c_void, pcallback : PCM_NOTIFY_CALLBACK, pnotifycontext : *mut HCMNOTIFICATION) -> CONFIGRET);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Remove_SubTree(dnancestor : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Remove_SubTree_Ex(dnancestor : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Request_Device_EjectA(dndevinst : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PSTR, ulnamelength : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Request_Device_EjectW(dndevinst : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PWSTR, ulnamelength : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Request_Device_Eject_ExA(dndevinst : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PSTR, ulnamelength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Request_Device_Eject_ExW(dndevinst : u32, pvetotype : *mut PNP_VETO_TYPE, pszvetoname : windows_sys::core::PWSTR, ulnamelength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Request_Eject_PC() -> CONFIGRET);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Request_Eject_PC_Ex(hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Run_Detection(ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Run_Detection_Ex(ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_Class_PropertyW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_Class_Property_ExW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_Class_Registry_PropertyA(classguid : *const windows_sys::core::GUID, ulproperty : u32, buffer : *const core::ffi::c_void, ullength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_Class_Registry_PropertyW(classguid : *const windows_sys::core::GUID, ulproperty : u32, buffer : *const core::ffi::c_void, ullength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Problem(dndevinst : u32, ulproblem : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 226:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Problem_Ex(dndevinst : u32, ulproblem : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_PropertyW(dndevinst : u32, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 229:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Property_ExW(dndevinst : u32, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Registry_PropertyA(dndevinst : u32, ulproperty : u32, buffer : *const core::ffi::c_void, ullength : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Registry_PropertyW(dndevinst : u32, ulproperty : u32, buffer : *const core::ffi::c_void, ullength : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 233:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Registry_Property_ExA(dndevinst : u32, ulproperty : u32, buffer : *const core::ffi::c_void, ullength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_DevNode_Registry_Property_ExW(dndevinst : u32, ulproperty : u32, buffer : *const core::ffi::c_void, ullength : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_Device_Interface_PropertyW(pszdeviceinterface : windows_sys::core::PCWSTR, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 237:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_Device_Interface_Property_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_HW_Prof(ulhardwareprofile : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_HW_Prof_Ex(ulhardwareprofile : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_HW_Prof_FlagsA(pdeviceid : windows_sys::core::PCSTR, ulconfig : u32, ulvalue : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_HW_Prof_FlagsW(pdeviceid : windows_sys::core::PCWSTR, ulconfig : u32, ulvalue : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_HW_Prof_Flags_ExA(pdeviceid : windows_sys::core::PCSTR, ulconfig : u32, ulvalue : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 244:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Set_HW_Prof_Flags_ExW(pdeviceid : windows_sys::core::PCWSTR, ulconfig : u32, ulvalue : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Setup_DevNode(dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Setup_DevNode_Ex(dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Test_Range_Available(ullstartvalue : u64, ullendvalue : u64, rlh : usize, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 248:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Uninstall_DevNode(dndevinst : u32, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Uninstall_DevNode_Ex(dndevinst : u32, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Unregister_Device_InterfaceA(pszdeviceinterface : windows_sys::core::PCSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Unregister_Device_InterfaceW(pszdeviceinterface : windows_sys::core::PCWSTR, ulflags : u32) -> CONFIGRET);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Unregister_Device_Interface_ExA(pszdeviceinterface : windows_sys::core::PCSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Unregister_Device_Interface_ExW(pszdeviceinterface : windows_sys::core::PCWSTR, ulflags : u32, hmachine : isize) -> CONFIGRET);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("cfgmgr32.dll" "system" fn CM_Unregister_Notification(notifycontext : HCMNOTIFICATION) -> CONFIGRET);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiInstallDevice(hwndparent : super::super::Foundation:: HWND, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_W, flags : DIINSTALLDEVICE_FLAGS, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiInstallDriverA(hwndparent : super::super::Foundation:: HWND, infpath : windows_sys::core::PCSTR, flags : DIINSTALLDRIVER_FLAGS, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiInstallDriverW(hwndparent : super::super::Foundation:: HWND, infpath : windows_sys::core::PCWSTR, flags : DIINSTALLDRIVER_FLAGS, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiRollbackDriver(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, hwndparent : super::super::Foundation:: HWND, flags : DIROLLBACKDRIVER_FLAGS, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiShowUpdateDevice(hwndparent : super::super::Foundation:: HWND, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, flags : u32, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiShowUpdateDriver(hwndparent : super::super::Foundation:: HWND, filepath : windows_sys::core::PCWSTR, flags : u32, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiUninstallDevice(hwndparent : super::super::Foundation:: HWND, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, flags : u32, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiUninstallDriverA(hwndparent : super::super::Foundation:: HWND, infpath : windows_sys::core::PCSTR, flags : DIUNINSTALLDRIVER_FLAGS, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn DiUninstallDriverW(hwndparent : super::super::Foundation:: HWND, infpath : windows_sys::core::PCWSTR, flags : DIUNINSTALLDRIVER_FLAGS, needreboot : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn InstallHinfSectionA(window : super::super::Foundation:: HWND, modulehandle : super::super::Foundation:: HINSTANCE, commandline : windows_sys::core::PCSTR, showcommand : i32));

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn InstallHinfSectionW(window : super::super::Foundation:: HWND, modulehandle : super::super::Foundation:: HINSTANCE, commandline : windows_sys::core::PCWSTR, showcommand : i32));

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddInstallSectionToDiskSpaceListA(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, layoutinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddInstallSectionToDiskSpaceListW(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, layoutinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddSectionToDiskSpaceListA(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddSectionToDiskSpaceListW(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddToDiskSpaceListA(diskspace : *const core::ffi::c_void, targetfilespec : windows_sys::core::PCSTR, filesize : i64, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddToDiskSpaceListW(diskspace : *const core::ffi::c_void, targetfilespec : windows_sys::core::PCWSTR, filesize : i64, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddToSourceListA(flags : u32, source : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAddToSourceListW(flags : u32, source : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAdjustDiskSpaceListA(diskspace : *const core::ffi::c_void, driveroot : windows_sys::core::PCSTR, amount : i64, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupAdjustDiskSpaceListW(diskspace : *const core::ffi::c_void, driveroot : windows_sys::core::PCWSTR, amount : i64, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupBackupErrorA(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCSTR, sourcefile : windows_sys::core::PCSTR, targetfile : windows_sys::core::PCSTR, win32errorcode : u32, style : u32) -> u32);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupBackupErrorW(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCWSTR, sourcefile : windows_sys::core::PCWSTR, targetfile : windows_sys::core::PCWSTR, win32errorcode : u32, style : u32) -> u32);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCancelTemporarySourceList() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCloseFileQueue(queuehandle : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCloseInfFile(infhandle : *const core::ffi::c_void));

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCloseLog());

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCommitFileQueueA(owner : super::super::Foundation:: HWND, queuehandle : *const core::ffi::c_void, msghandler : PSP_FILE_CALLBACK_A, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCommitFileQueueW(owner : super::super::Foundation:: HWND, queuehandle : *const core::ffi::c_void, msghandler : PSP_FILE_CALLBACK_W, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupConfigureWmiFromInfSectionA(infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupConfigureWmiFromInfSectionW(infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCopyErrorA(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCSTR, diskname : windows_sys::core::PCSTR, pathtosource : windows_sys::core::PCSTR, sourcefile : windows_sys::core::PCSTR, targetpathfile : windows_sys::core::PCSTR, win32errorcode : u32, style : u32, pathbuffer : windows_sys::core::PSTR, pathbuffersize : u32, pathrequiredsize : *mut u32) -> u32);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCopyErrorW(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCWSTR, diskname : windows_sys::core::PCWSTR, pathtosource : windows_sys::core::PCWSTR, sourcefile : windows_sys::core::PCWSTR, targetpathfile : windows_sys::core::PCWSTR, win32errorcode : u32, style : u32, pathbuffer : windows_sys::core::PWSTR, pathbuffersize : u32, pathrequiredsize : *mut u32) -> u32);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCopyOEMInfA(sourceinffilename : windows_sys::core::PCSTR, oemsourcemedialocation : windows_sys::core::PCSTR, oemsourcemediatype : OEM_SOURCE_MEDIA_TYPE, copystyle : SP_COPY_STYLE, destinationinffilename : windows_sys::core::PSTR, destinationinffilenamesize : u32, requiredsize : *mut u32, destinationinffilenamecomponent : *mut windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCopyOEMInfW(sourceinffilename : windows_sys::core::PCWSTR, oemsourcemedialocation : windows_sys::core::PCWSTR, oemsourcemediatype : OEM_SOURCE_MEDIA_TYPE, copystyle : SP_COPY_STYLE, destinationinffilename : windows_sys::core::PWSTR, destinationinffilenamesize : u32, requiredsize : *mut u32, destinationinffilenamecomponent : *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCreateDiskSpaceListA(reserved1 : *const core::ffi::c_void, reserved2 : u32, flags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupCreateDiskSpaceListW(reserved1 : *const core::ffi::c_void, reserved2 : u32, flags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDecompressOrCopyFileA(sourcefilename : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR, compressiontype : *const FILE_COMPRESSION_TYPE) -> u32);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDecompressOrCopyFileW(sourcefilename : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR, compressiontype : *const FILE_COMPRESSION_TYPE) -> u32);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDefaultQueueCallbackA(context : *const core::ffi::c_void, notification : u32, param1 : usize, param2 : usize) -> u32);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDefaultQueueCallbackW(context : *const core::ffi::c_void, notification : u32, param1 : usize, param2 : usize) -> u32);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDeleteErrorA(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCSTR, file : windows_sys::core::PCSTR, win32errorcode : u32, style : u32) -> u32);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDeleteErrorW(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCWSTR, file : windows_sys::core::PCWSTR, win32errorcode : u32, style : u32) -> u32);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDestroyDiskSpaceList(diskspace : *mut core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiAskForOEMDisk(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiBuildClassInfoList(flags : u32, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiBuildClassInfoListExA(flags : u32, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiBuildClassInfoListExW(flags : u32, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiBuildDriverInfoList(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA, drivertype : SETUP_DI_DRIVER_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCallClassInstaller(installfunction : DI_FUNCTION, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCancelDriverInfoSearch(deviceinfoset : HDEVINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiChangeState(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassGuidsFromNameA(classname : windows_sys::core::PCSTR, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassGuidsFromNameExA(classname : windows_sys::core::PCSTR, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassGuidsFromNameExW(classname : windows_sys::core::PCWSTR, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 310:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassGuidsFromNameW(classname : windows_sys::core::PCWSTR, classguidlist : *mut windows_sys::core::GUID, classguidlistsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassNameFromGuidA(classguid : *const windows_sys::core::GUID, classname : windows_sys::core::PSTR, classnamesize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassNameFromGuidExA(classguid : *const windows_sys::core::GUID, classname : windows_sys::core::PSTR, classnamesize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassNameFromGuidExW(classguid : *const windows_sys::core::GUID, classname : windows_sys::core::PWSTR, classnamesize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiClassNameFromGuidW(classguid : *const windows_sys::core::GUID, classname : windows_sys::core::PWSTR, classnamesize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDevRegKeyA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, scope : u32, hwprofile : u32, keytype : u32, infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCSTR) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDevRegKeyW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, scope : u32, hwprofile : u32, keytype : u32, infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCWSTR) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 319:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInfoA(deviceinfoset : HDEVINFO, devicename : windows_sys::core::PCSTR, classguid : *const windows_sys::core::GUID, devicedescription : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND, creationflags : SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInfoList(classguid : *const windows_sys::core::GUID, hwndparent : super::super::Foundation:: HWND) -> HDEVINFO);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInfoListExA(classguid : *const windows_sys::core::GUID, hwndparent : super::super::Foundation:: HWND, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> HDEVINFO);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInfoListExW(classguid : *const windows_sys::core::GUID, hwndparent : super::super::Foundation:: HWND, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> HDEVINFO);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInfoW(deviceinfoset : HDEVINFO, devicename : windows_sys::core::PCWSTR, classguid : *const windows_sys::core::GUID, devicedescription : windows_sys::core::PCWSTR, hwndparent : super::super::Foundation:: HWND, creationflags : SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInterfaceA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, interfaceclassguid : *const windows_sys::core::GUID, referencestring : windows_sys::core::PCSTR, creationflags : u32, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, reserved : u32, samdesired : u32, infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCSTR) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, reserved : u32, samdesired : u32, infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCWSTR) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiCreateDeviceInterfaceW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, interfaceclassguid : *const windows_sys::core::GUID, referencestring : windows_sys::core::PCWSTR, creationflags : u32, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiDeleteDevRegKey(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, scope : u32, hwprofile : u32, keytype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiDeleteDeviceInfo(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiDeleteDeviceInterfaceData(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, reserved : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiDestroyClassImageList(classimagelistdata : *const SP_CLASSIMAGELIST_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiDestroyDeviceInfoList(deviceinfoset : HDEVINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiDestroyDriverInfoList(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, drivertype : SETUP_DI_DRIVER_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 338:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Graphics_Gdi")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiDrawMiniIcon(hdc : super::super::Graphics::Gdi:: HDC, rc : super::super::Foundation:: RECT, miniiconindex : i32, flags : u32) -> i32);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiEnumDeviceInfo(deviceinfoset : HDEVINFO, memberindex : u32, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 341:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiEnumDeviceInterfaces(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, interfaceclassguid : *const windows_sys::core::GUID, memberindex : u32, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiEnumDriverInfoA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, drivertype : SETUP_DI_DRIVER_TYPE, memberindex : u32, driverinfodata : *mut SP_DRVINFO_DATA_V2_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiEnumDriverInfoW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, drivertype : SETUP_DI_DRIVER_TYPE, memberindex : u32, driverinfodata : *mut SP_DRVINFO_DATA_V2_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetActualModelsSectionA(context : *const INFCONTEXT, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, infsectionwithext : windows_sys::core::PSTR, infsectionwithextsize : u32, requiredsize : *mut u32, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetActualModelsSectionW(context : *const INFCONTEXT, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, infsectionwithext : windows_sys::core::PWSTR, infsectionwithextsize : u32, requiredsize : *mut u32, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetActualSectionToInstallA(infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCSTR, infsectionwithext : windows_sys::core::PSTR, infsectionwithextsize : u32, requiredsize : *mut u32, extension : *mut windows_sys::core::PSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetActualSectionToInstallExA(infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCSTR, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, infsectionwithext : windows_sys::core::PSTR, infsectionwithextsize : u32, requiredsize : *mut u32, extension : *mut windows_sys::core::PSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetActualSectionToInstallExW(infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCWSTR, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, infsectionwithext : windows_sys::core::PWSTR, infsectionwithextsize : u32, requiredsize : *mut u32, extension : *mut windows_sys::core::PWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetActualSectionToInstallW(infhandle : *const core::ffi::c_void, infsectionname : windows_sys::core::PCWSTR, infsectionwithext : windows_sys::core::PWSTR, infsectionwithextsize : u32, requiredsize : *mut u32, extension : *mut windows_sys::core::PWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassBitmapIndex(classguid : *const windows_sys::core::GUID, miniiconindex : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDescriptionA(classguid : *const windows_sys::core::GUID, classdescription : windows_sys::core::PSTR, classdescriptionsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 356:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDescriptionExA(classguid : *const windows_sys::core::GUID, classdescription : windows_sys::core::PSTR, classdescriptionsize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDescriptionExW(classguid : *const windows_sys::core::GUID, classdescription : windows_sys::core::PWSTR, classdescriptionsize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 358:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDescriptionW(classguid : *const windows_sys::core::GUID, classdescription : windows_sys::core::PWSTR, classdescriptionsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDevPropertySheetsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, propertysheetheader : *const super::super::UI::Controls:: PROPSHEETHEADERA_V2, propertysheetheaderpagelistsize : u32, requiredsize : *mut u32, propertysheettype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_UI_Controls", feature = "Win32_UI_WindowsAndMessaging"))]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDevPropertySheetsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, propertysheetheader : *const super::super::UI::Controls:: PROPSHEETHEADERW_V2, propertysheetheaderpagelistsize : u32, requiredsize : *mut u32, propertysheettype : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDevsA(classguid : *const windows_sys::core::GUID, enumerator : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND, flags : SETUP_DI_GET_CLASS_DEVS_FLAGS) -> HDEVINFO);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDevsExA(classguid : *const windows_sys::core::GUID, enumerator : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND, flags : SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset : HDEVINFO, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> HDEVINFO);

// UNSUPPORTED Rust 365:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDevsExW(classguid : *const windows_sys::core::GUID, enumerator : windows_sys::core::PCWSTR, hwndparent : super::super::Foundation:: HWND, flags : SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset : HDEVINFO, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> HDEVINFO);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassDevsW(classguid : *const windows_sys::core::GUID, enumerator : windows_sys::core::PCWSTR, hwndparent : super::super::Foundation:: HWND, flags : SETUP_DI_GET_CLASS_DEVS_FLAGS) -> HDEVINFO);

// UNSUPPORTED Rust 367:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassImageIndex(classimagelistdata : *const SP_CLASSIMAGELIST_DATA, classguid : *const windows_sys::core::GUID, imageindex : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassImageList(classimagelistdata : *mut SP_CLASSIMAGELIST_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassImageListExA(classimagelistdata : *mut SP_CLASSIMAGELIST_DATA, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassImageListExW(classimagelistdata : *mut SP_CLASSIMAGELIST_DATA, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassInstallParamsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, classinstallparams : *mut SP_CLASSINSTALL_HEADER, classinstallparamssize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassInstallParamsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, classinstallparams : *mut SP_CLASSINSTALL_HEADER, classinstallparamssize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassPropertyExW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32, flags : u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassPropertyKeys(classguid : *const windows_sys::core::GUID, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : u32, requiredpropertykeycount : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 380:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassPropertyKeysExW(classguid : *const windows_sys::core::GUID, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : u32, requiredpropertykeycount : *mut u32, flags : u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassPropertyW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassRegistryPropertyA(classguid : *const windows_sys::core::GUID, property : u32, propertyregdatatype : *mut u32, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetClassRegistryPropertyW(classguid : *const windows_sys::core::GUID, property : u32, propertyregdatatype : *mut u32, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetCustomDevicePropertyA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, custompropertyname : windows_sys::core::PCSTR, flags : u32, propertyregdatatype : *mut u32, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetCustomDevicePropertyW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, custompropertyname : windows_sys::core::PCWSTR, flags : u32, propertyregdatatype : *mut u32, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInfoListClass(deviceinfoset : HDEVINFO, classguid : *mut windows_sys::core::GUID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInfoListDetailA(deviceinfoset : HDEVINFO, deviceinfosetdetaildata : *mut SP_DEVINFO_LIST_DETAIL_DATA_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInfoListDetailW(deviceinfoset : HDEVINFO, deviceinfosetdetaildata : *mut SP_DEVINFO_LIST_DETAIL_DATA_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInstallParamsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, deviceinstallparams : *mut SP_DEVINSTALL_PARAMS_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInstallParamsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, deviceinstallparams : *mut SP_DEVINSTALL_PARAMS_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInstanceIdA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, deviceinstanceid : windows_sys::core::PSTR, deviceinstanceidsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 393:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInstanceIdW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, deviceinstanceid : windows_sys::core::PWSTR, deviceinstanceidsize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInterfaceAlias(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, aliasinterfaceclassguid : *const windows_sys::core::GUID, aliasdeviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 395:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInterfaceDetailA(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, deviceinterfacedetaildata : *mut SP_DEVICE_INTERFACE_DETAIL_DATA_A, deviceinterfacedetaildatasize : u32, requiredsize : *mut u32, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInterfaceDetailW(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, deviceinterfacedetaildata : *mut SP_DEVICE_INTERFACE_DETAIL_DATA_W, deviceinterfacedetaildatasize : u32, requiredsize : *mut u32, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 397:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : u32, requiredpropertykeycount : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceInterfacePropertyW(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDevicePropertyKeys(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, propertykeyarray : *mut super::super::Foundation:: DEVPROPKEY, propertykeycount : u32, requiredpropertykeycount : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 401:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDevicePropertyW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : *mut super::Properties:: DEVPROPTYPE, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 403:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceRegistryPropertyA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, property : SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype : *mut u32, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDeviceRegistryPropertyW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, property : SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype : *mut u32, propertybuffer : *mut u8, propertybuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 405:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDriverInfoDetailA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_A, driverinfodetaildata : *mut SP_DRVINFO_DETAIL_DATA_A, driverinfodetaildatasize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDriverInfoDetailW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_W, driverinfodetaildata : *mut SP_DRVINFO_DETAIL_DATA_W, driverinfodetaildatasize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 407:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDriverInstallParamsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_A, driverinstallparams : *mut SP_DRVINSTALL_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetDriverInstallParamsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_W, driverinstallparams : *mut SP_DRVINSTALL_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 409:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileFriendlyNameA(hwprofile : u32, friendlyname : windows_sys::core::PSTR, friendlynamesize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileFriendlyNameExA(hwprofile : u32, friendlyname : windows_sys::core::PSTR, friendlynamesize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 411:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileFriendlyNameExW(hwprofile : u32, friendlyname : windows_sys::core::PWSTR, friendlynamesize : u32, requiredsize : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileFriendlyNameW(hwprofile : u32, friendlyname : windows_sys::core::PWSTR, friendlynamesize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileList(hwprofilelist : *mut u32, hwprofilelistsize : u32, requiredsize : *mut u32, currentlyactiveindex : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 414:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileListExA(hwprofilelist : *mut u32, hwprofilelistsize : u32, requiredsize : *mut u32, currentlyactiveindex : *mut u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetHwProfileListExW(hwprofilelist : *mut u32, hwprofilelistsize : u32, requiredsize : *mut u32, currentlyactiveindex : *mut u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 416:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetINFClassA(infname : windows_sys::core::PCSTR, classguid : *mut windows_sys::core::GUID, classname : windows_sys::core::PSTR, classnamesize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetINFClassW(infname : windows_sys::core::PCWSTR, classguid : *mut windows_sys::core::GUID, classname : windows_sys::core::PWSTR, classnamesize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 418:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetSelectedDevice(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetSelectedDriverA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *mut SP_DRVINFO_DATA_V2_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 420:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetSelectedDriverW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *mut SP_DRVINFO_DATA_V2_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_Controls")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiGetWizardPage(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, installwizarddata : *const SP_INSTALLWIZARD_DATA, pagetype : u32, flags : u32) -> super::super::UI::Controls:: HPROPSHEETPAGE);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallClassA(hwndparent : super::super::Foundation:: HWND, inffilename : windows_sys::core::PCSTR, flags : u32, filequeue : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 424:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallClassExA(hwndparent : super::super::Foundation:: HWND, inffilename : windows_sys::core::PCSTR, flags : u32, filequeue : *const core::ffi::c_void, interfaceclassguid : *const windows_sys::core::GUID, reserved1 : *const core::ffi::c_void, reserved2 : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallClassExW(hwndparent : super::super::Foundation:: HWND, inffilename : windows_sys::core::PCWSTR, flags : u32, filequeue : *const core::ffi::c_void, interfaceclassguid : *const windows_sys::core::GUID, reserved1 : *const core::ffi::c_void, reserved2 : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallClassW(hwndparent : super::super::Foundation:: HWND, inffilename : windows_sys::core::PCWSTR, flags : u32, filequeue : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 427:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallDevice(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallDeviceInterfaces(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiInstallDriverFiles(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiLoadClassIcon(classguid : *const windows_sys::core::GUID, largeicon : *mut super::super::UI::WindowsAndMessaging:: HICON, miniiconindex : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiLoadDeviceIcon(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, cxicon : u32, cyicon : u32, flags : u32, hicon : *mut super::super::UI::WindowsAndMessaging:: HICON) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenClassRegKey(classguid : *const windows_sys::core::GUID, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 436:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenClassRegKeyExA(classguid : *const windows_sys::core::GUID, samdesired : u32, flags : u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenClassRegKeyExW(classguid : *const windows_sys::core::GUID, samdesired : u32, flags : u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenDevRegKey(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, scope : u32, hwprofile : u32, keytype : u32, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenDeviceInfoA(deviceinfoset : HDEVINFO, deviceinstanceid : windows_sys::core::PCSTR, hwndparent : super::super::Foundation:: HWND, openflags : u32, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenDeviceInfoW(deviceinfoset : HDEVINFO, deviceinstanceid : windows_sys::core::PCWSTR, hwndparent : super::super::Foundation:: HWND, openflags : u32, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenDeviceInterfaceA(deviceinfoset : HDEVINFO, devicepath : windows_sys::core::PCSTR, openflags : u32, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenDeviceInterfaceRegKey(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, reserved : u32, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiOpenDeviceInterfaceW(deviceinfoset : HDEVINFO, devicepath : windows_sys::core::PCWSTR, openflags : u32, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiRegisterCoDeviceInstallers(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiRegisterDeviceInfo(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA, flags : u32, compareproc : PSP_DETSIG_CMPPROC, comparecontext : *const core::ffi::c_void, dupdeviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiRemoveDevice(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiRemoveDeviceInterface(deviceinfoset : HDEVINFO, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiRestartDevices(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 453:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSelectBestCompatDrv(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSelectDevice(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 455:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSelectOEMDrv(hwndparent : super::super::Foundation:: HWND, deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetClassInstallParamsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, classinstallparams : *const SP_CLASSINSTALL_HEADER, classinstallparamssize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetClassInstallParamsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, classinstallparams : *const SP_CLASSINSTALL_HEADER, classinstallparamssize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetClassPropertyExW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, flags : u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetClassPropertyW(classguid : *const windows_sys::core::GUID, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetClassRegistryPropertyA(classguid : *const windows_sys::core::GUID, property : u32, propertybuffer : *const u8, propertybuffersize : u32, machinename : windows_sys::core::PCSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 463:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetClassRegistryPropertyW(classguid : *const windows_sys::core::GUID, property : u32, propertybuffer : *const u8, propertybuffersize : u32, machinename : windows_sys::core::PCWSTR, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 464:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDeviceInstallParamsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, deviceinstallparams : *const SP_DEVINSTALL_PARAMS_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 465:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDeviceInstallParamsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, deviceinstallparams : *const SP_DEVINSTALL_PARAMS_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 466:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDeviceInterfaceDefault(deviceinfoset : HDEVINFO, deviceinterfacedata : *mut SP_DEVICE_INTERFACE_DATA, flags : u32, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 467:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDeviceInterfacePropertyW(deviceinfoset : HDEVINFO, deviceinterfacedata : *const SP_DEVICE_INTERFACE_DATA, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 469:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_Devices_Properties")]
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDevicePropertyW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, propertykey : *const super::super::Foundation:: DEVPROPKEY, propertytype : super::Properties:: DEVPROPTYPE, propertybuffer : *const u8, propertybuffersize : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 471:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDeviceRegistryPropertyA(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA, property : SETUP_DI_REGISTRY_PROPERTY, propertybuffer : *const u8, propertybuffersize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 472:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDeviceRegistryPropertyW(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA, property : SETUP_DI_REGISTRY_PROPERTY, propertybuffer : *const u8, propertybuffersize : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 473:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDriverInstallParamsA(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_A, driverinstallparams : *const SP_DRVINSTALL_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 474:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetDriverInstallParamsW(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, driverinfodata : *const SP_DRVINFO_DATA_V2_W, driverinstallparams : *const SP_DRVINSTALL_PARAMS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 475:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetSelectedDevice(deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 476:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetSelectedDriverA(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA, driverinfodata : *mut SP_DRVINFO_DATA_V2_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 477:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiSetSelectedDriverW(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA, driverinfodata : *mut SP_DRVINFO_DATA_V2_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 478:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDiUnremoveDevice(deviceinfoset : HDEVINFO, deviceinfodata : *mut SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 479:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDuplicateDiskSpaceListA(diskspace : *const core::ffi::c_void, reserved1 : *const core::ffi::c_void, reserved2 : u32, flags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 480:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupDuplicateDiskSpaceListW(diskspace : *const core::ffi::c_void, reserved1 : *const core::ffi::c_void, reserved2 : u32, flags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 481:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupEnumInfSectionsA(infhandle : *const core::ffi::c_void, index : u32, buffer : windows_sys::core::PSTR, size : u32, sizeneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 482:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupEnumInfSectionsW(infhandle : *const core::ffi::c_void, index : u32, buffer : windows_sys::core::PWSTR, size : u32, sizeneeded : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 483:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFindFirstLineA(infhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR, key : windows_sys::core::PCSTR, context : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 484:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFindFirstLineW(infhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR, key : windows_sys::core::PCWSTR, context : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 485:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFindNextLine(contextin : *const INFCONTEXT, contextout : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 486:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFindNextMatchLineA(contextin : *const INFCONTEXT, key : windows_sys::core::PCSTR, contextout : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 487:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFindNextMatchLineW(contextin : *const INFCONTEXT, key : windows_sys::core::PCWSTR, contextout : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 488:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFreeSourceListA(list : *mut *mut windows_sys::core::PCSTR, count : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 489:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupFreeSourceListW(list : *mut *mut windows_sys::core::PCWSTR, count : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 490:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetBackupInformationA(queuehandle : *const core::ffi::c_void, backupparams : *mut SP_BACKUP_QUEUE_PARAMS_V2_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 491:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetBackupInformationW(queuehandle : *const core::ffi::c_void, backupparams : *mut SP_BACKUP_QUEUE_PARAMS_V2_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 492:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetBinaryField(context : *const INFCONTEXT, fieldindex : u32, returnbuffer : *mut u8, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 493:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFieldCount(context : *const INFCONTEXT) -> u32);

// UNSUPPORTED Rust 494:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFileCompressionInfoA(sourcefilename : windows_sys::core::PCSTR, actualsourcefilename : *mut windows_sys::core::PSTR, sourcefilesize : *mut u32, targetfilesize : *mut u32, compressiontype : *mut FILE_COMPRESSION_TYPE) -> u32);

// UNSUPPORTED Rust 495:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFileCompressionInfoExA(sourcefilename : windows_sys::core::PCSTR, actualsourcefilenamebuffer : windows_sys::core::PCSTR, actualsourcefilenamebufferlen : u32, requiredbufferlen : *mut u32, sourcefilesize : *mut u32, targetfilesize : *mut u32, compressiontype : *mut FILE_COMPRESSION_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 496:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFileCompressionInfoExW(sourcefilename : windows_sys::core::PCWSTR, actualsourcefilenamebuffer : windows_sys::core::PCWSTR, actualsourcefilenamebufferlen : u32, requiredbufferlen : *mut u32, sourcefilesize : *mut u32, targetfilesize : *mut u32, compressiontype : *mut FILE_COMPRESSION_TYPE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 497:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFileCompressionInfoW(sourcefilename : windows_sys::core::PCWSTR, actualsourcefilename : *mut windows_sys::core::PWSTR, sourcefilesize : *mut u32, targetfilesize : *mut u32, compressiontype : *mut FILE_COMPRESSION_TYPE) -> u32);

// UNSUPPORTED Rust 498:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFileQueueCount(filequeue : *const core::ffi::c_void, subqueuefileop : u32, numoperations : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 499:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetFileQueueFlags(filequeue : *const core::ffi::c_void, flags : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 500:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfDriverStoreLocationA(filename : windows_sys::core::PCSTR, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, localename : windows_sys::core::PCSTR, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 502:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfDriverStoreLocationW(filename : windows_sys::core::PCWSTR, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, localename : windows_sys::core::PCWSTR, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 504:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfFileListA(directorypath : windows_sys::core::PCSTR, infstyle : INF_STYLE, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 505:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfFileListW(directorypath : windows_sys::core::PCWSTR, infstyle : INF_STYLE, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 506:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfInformationA(infspec : *const core::ffi::c_void, searchcontrol : u32, returnbuffer : *mut SP_INF_INFORMATION, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 507:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfInformationW(infspec : *const core::ffi::c_void, searchcontrol : u32, returnbuffer : *mut SP_INF_INFORMATION, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 508:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfPublishedNameA(driverstorelocation : windows_sys::core::PCSTR, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 509:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetInfPublishedNameW(driverstorelocation : windows_sys::core::PCWSTR, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 510:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetIntField(context : *const INFCONTEXT, fieldindex : u32, integervalue : *mut i32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 511:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetLineByIndexA(infhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR, index : u32, context : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 512:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetLineByIndexW(infhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR, index : u32, context : *mut INFCONTEXT) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 513:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetLineCountA(infhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR) -> i32);

// UNSUPPORTED Rust 514:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetLineCountW(infhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 515:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetLineTextA(context : *const INFCONTEXT, infhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR, key : windows_sys::core::PCSTR, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 516:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetLineTextW(context : *const INFCONTEXT, infhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR, key : windows_sys::core::PCWSTR, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 517:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetMultiSzFieldA(context : *const INFCONTEXT, fieldindex : u32, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 518:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetMultiSzFieldW(context : *const INFCONTEXT, fieldindex : u32, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 519:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetNonInteractiveMode() -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 520:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetSourceFileLocationA(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, filename : windows_sys::core::PCSTR, sourceid : *mut u32, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 521:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetSourceFileLocationW(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, filename : windows_sys::core::PCWSTR, sourceid : *mut u32, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 522:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetSourceFileSizeA(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, filename : windows_sys::core::PCSTR, section : windows_sys::core::PCSTR, filesize : *mut u32, roundingfactor : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 523:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetSourceFileSizeW(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, filename : windows_sys::core::PCWSTR, section : windows_sys::core::PCWSTR, filesize : *mut u32, roundingfactor : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 524:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetSourceInfoA(infhandle : *const core::ffi::c_void, sourceid : u32, infodesired : u32, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 525:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetSourceInfoW(infhandle : *const core::ffi::c_void, sourceid : u32, infodesired : u32, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 526:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetStringFieldA(context : *const INFCONTEXT, fieldindex : u32, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 527:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetStringFieldW(context : *const INFCONTEXT, fieldindex : u32, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 528:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetTargetPathA(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, section : windows_sys::core::PCSTR, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 529:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetTargetPathW(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, section : windows_sys::core::PCWSTR, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 530:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupGetThreadLogToken() -> u64);

// UNSUPPORTED Rust 531:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInitDefaultQueueCallback(ownerwindow : super::super::Foundation:: HWND) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 532:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInitDefaultQueueCallbackEx(ownerwindow : super::super::Foundation:: HWND, alternateprogresswindow : super::super::Foundation:: HWND, progressmessage : u32, reserved1 : u32, reserved2 : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 533:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInitializeFileLogA(logfilename : windows_sys::core::PCSTR, flags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 534:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInitializeFileLogW(logfilename : windows_sys::core::PCWSTR, flags : u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 535:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFileA(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, sourcefile : windows_sys::core::PCSTR, sourcepathroot : windows_sys::core::PCSTR, destinationname : windows_sys::core::PCSTR, copystyle : SP_COPY_STYLE, copymsghandler : PSP_FILE_CALLBACK_A, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 536:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFileExA(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, sourcefile : windows_sys::core::PCSTR, sourcepathroot : windows_sys::core::PCSTR, destinationname : windows_sys::core::PCSTR, copystyle : SP_COPY_STYLE, copymsghandler : PSP_FILE_CALLBACK_A, context : *const core::ffi::c_void, filewasinuse : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 537:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFileExW(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, sourcefile : windows_sys::core::PCWSTR, sourcepathroot : windows_sys::core::PCWSTR, destinationname : windows_sys::core::PCWSTR, copystyle : SP_COPY_STYLE, copymsghandler : PSP_FILE_CALLBACK_W, context : *const core::ffi::c_void, filewasinuse : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 538:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFileW(infhandle : *const core::ffi::c_void, infcontext : *const INFCONTEXT, sourcefile : windows_sys::core::PCWSTR, sourcepathroot : windows_sys::core::PCWSTR, destinationname : windows_sys::core::PCWSTR, copystyle : SP_COPY_STYLE, copymsghandler : PSP_FILE_CALLBACK_W, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 539:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFilesFromInfSectionA(infhandle : *const core::ffi::c_void, layoutinfhandle : *const core::ffi::c_void, filequeue : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, sourcerootpath : windows_sys::core::PCSTR, copyflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 540:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFilesFromInfSectionW(infhandle : *const core::ffi::c_void, layoutinfhandle : *const core::ffi::c_void, filequeue : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, sourcerootpath : windows_sys::core::PCWSTR, copyflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 541:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFromInfSectionA(owner : super::super::Foundation:: HWND, infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, flags : u32, relativekeyroot : super::super::System::Registry:: HKEY, sourcerootpath : windows_sys::core::PCSTR, copyflags : u32, msghandler : PSP_FILE_CALLBACK_A, context : *const core::ffi::c_void, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 543:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("setupapi.dll" "system" fn SetupInstallFromInfSectionW(owner : super::super::Foundation:: HWND, infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, flags : u32, relativekeyroot : super::super::System::Registry:: HKEY, sourcerootpath : windows_sys::core::PCWSTR, copyflags : u32, msghandler : PSP_FILE_CALLBACK_W, context : *const core::ffi::c_void, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 545:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallServicesFromInfSectionA(infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, flags : SPSVCINST_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 546:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallServicesFromInfSectionExA(infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, flags : SPSVCINST_FLAGS, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, reserved1 : *const core::ffi::c_void, reserved2 : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 547:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallServicesFromInfSectionExW(infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, flags : SPSVCINST_FLAGS, deviceinfoset : HDEVINFO, deviceinfodata : *const SP_DEVINFO_DATA, reserved1 : *const core::ffi::c_void, reserved2 : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 548:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupInstallServicesFromInfSectionW(infhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, flags : SPSVCINST_FLAGS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 549:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupIterateCabinetA(cabinetfile : windows_sys::core::PCSTR, reserved : u32, msghandler : PSP_FILE_CALLBACK_A, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 550:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupIterateCabinetW(cabinetfile : windows_sys::core::PCWSTR, reserved : u32, msghandler : PSP_FILE_CALLBACK_W, context : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 551:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupLogErrorA(messagestring : windows_sys::core::PCSTR, severity : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 552:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupLogErrorW(messagestring : windows_sys::core::PCWSTR, severity : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 553:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupLogFileA(fileloghandle : *const core::ffi::c_void, logsectionname : windows_sys::core::PCSTR, sourcefilename : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR, checksum : u32, disktagfile : windows_sys::core::PCSTR, diskdescription : windows_sys::core::PCSTR, otherinfo : windows_sys::core::PCSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 554:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupLogFileW(fileloghandle : *const core::ffi::c_void, logsectionname : windows_sys::core::PCWSTR, sourcefilename : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR, checksum : u32, disktagfile : windows_sys::core::PCWSTR, diskdescription : windows_sys::core::PCWSTR, otherinfo : windows_sys::core::PCWSTR, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 555:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenAppendInfFileA(filename : windows_sys::core::PCSTR, infhandle : *const core::ffi::c_void, errorline : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 556:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenAppendInfFileW(filename : windows_sys::core::PCWSTR, infhandle : *const core::ffi::c_void, errorline : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 557:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenFileQueue() -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 558:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenInfFileA(filename : windows_sys::core::PCSTR, infclass : windows_sys::core::PCSTR, infstyle : INF_STYLE, errorline : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 559:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenInfFileW(filename : windows_sys::core::PCWSTR, infclass : windows_sys::core::PCWSTR, infstyle : INF_STYLE, errorline : *mut u32) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 560:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenLog(erase : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 561:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupOpenMasterInf() -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 562:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupPrepareQueueForRestoreA(queuehandle : *const core::ffi::c_void, backuppath : windows_sys::core::PCSTR, restoreflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 563:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupPrepareQueueForRestoreW(queuehandle : *const core::ffi::c_void, backuppath : windows_sys::core::PCWSTR, restoreflags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 564:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupPromptForDiskA(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCSTR, diskname : windows_sys::core::PCSTR, pathtosource : windows_sys::core::PCSTR, filesought : windows_sys::core::PCSTR, tagfile : windows_sys::core::PCSTR, diskpromptstyle : u32, pathbuffer : windows_sys::core::PSTR, pathbuffersize : u32, pathrequiredsize : *mut u32) -> u32);

// UNSUPPORTED Rust 565:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupPromptForDiskW(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCWSTR, diskname : windows_sys::core::PCWSTR, pathtosource : windows_sys::core::PCWSTR, filesought : windows_sys::core::PCWSTR, tagfile : windows_sys::core::PCWSTR, diskpromptstyle : u32, pathbuffer : windows_sys::core::PWSTR, pathbuffersize : u32, pathrequiredsize : *mut u32) -> u32);

// UNSUPPORTED Rust 566:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupPromptReboot(filequeue : *const core::ffi::c_void, owner : super::super::Foundation:: HWND, scanonly : windows_sys::core::BOOL) -> i32);

// UNSUPPORTED Rust 567:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryDrivesInDiskSpaceListA(diskspace : *const core::ffi::c_void, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 568:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryDrivesInDiskSpaceListW(diskspace : *const core::ffi::c_void, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 569:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryFileLogA(fileloghandle : *const core::ffi::c_void, logsectionname : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR, desiredinfo : SetupFileLogInfo, dataout : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 570:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryFileLogW(fileloghandle : *const core::ffi::c_void, logsectionname : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR, desiredinfo : SetupFileLogInfo, dataout : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 571:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryInfFileInformationA(infinformation : *const SP_INF_INFORMATION, infindex : u32, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 572:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryInfFileInformationW(infinformation : *const SP_INF_INFORMATION, infindex : u32, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 573:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupQueryInfOriginalFileInformationA(infinformation : *const SP_INF_INFORMATION, infindex : u32, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, originalfileinfo : *mut SP_ORIGINAL_FILE_INFO_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 575:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupQueryInfOriginalFileInformationW(infinformation : *const SP_INF_INFORMATION, infindex : u32, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, originalfileinfo : *mut SP_ORIGINAL_FILE_INFO_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 577:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryInfVersionInformationA(infinformation : *const SP_INF_INFORMATION, infindex : u32, key : windows_sys::core::PCSTR, returnbuffer : windows_sys::core::PSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 578:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueryInfVersionInformationW(infinformation : *const SP_INF_INFORMATION, infindex : u32, key : windows_sys::core::PCWSTR, returnbuffer : windows_sys::core::PWSTR, returnbuffersize : u32, requiredsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 579:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQuerySourceListA(flags : u32, list : *mut *mut windows_sys::core::PCSTR, count : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 580:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQuerySourceListW(flags : u32, list : *mut *mut windows_sys::core::PCWSTR, count : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 581:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQuerySpaceRequiredOnDriveA(diskspace : *const core::ffi::c_void, drivespec : windows_sys::core::PCSTR, spacerequired : *mut i64, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 582:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQuerySpaceRequiredOnDriveW(diskspace : *const core::ffi::c_void, drivespec : windows_sys::core::PCWSTR, spacerequired : *mut i64, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 583:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueCopyA(queuehandle : *const core::ffi::c_void, sourcerootpath : windows_sys::core::PCSTR, sourcepath : windows_sys::core::PCSTR, sourcefilename : windows_sys::core::PCSTR, sourcedescription : windows_sys::core::PCSTR, sourcetagfile : windows_sys::core::PCSTR, targetdirectory : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR, copystyle : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 584:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueCopyIndirectA(copyparams : *const SP_FILE_COPY_PARAMS_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 585:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueCopyIndirectW(copyparams : *const SP_FILE_COPY_PARAMS_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 586:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueCopySectionA(queuehandle : *const core::ffi::c_void, sourcerootpath : windows_sys::core::PCSTR, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR, copystyle : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 587:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueCopySectionW(queuehandle : *const core::ffi::c_void, sourcerootpath : windows_sys::core::PCWSTR, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR, copystyle : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 588:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueCopyW(queuehandle : *const core::ffi::c_void, sourcerootpath : windows_sys::core::PCWSTR, sourcepath : windows_sys::core::PCWSTR, sourcefilename : windows_sys::core::PCWSTR, sourcedescription : windows_sys::core::PCWSTR, sourcetagfile : windows_sys::core::PCWSTR, targetdirectory : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR, copystyle : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 589:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueDefaultCopyA(queuehandle : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, sourcerootpath : windows_sys::core::PCSTR, sourcefilename : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR, copystyle : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 590:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueDefaultCopyW(queuehandle : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, sourcerootpath : windows_sys::core::PCWSTR, sourcefilename : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR, copystyle : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 591:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueDeleteA(queuehandle : *const core::ffi::c_void, pathpart1 : windows_sys::core::PCSTR, pathpart2 : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 592:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueDeleteSectionA(queuehandle : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 593:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueDeleteSectionW(queuehandle : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 594:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueDeleteW(queuehandle : *const core::ffi::c_void, pathpart1 : windows_sys::core::PCWSTR, pathpart2 : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 595:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueRenameA(queuehandle : *const core::ffi::c_void, sourcepath : windows_sys::core::PCSTR, sourcefilename : windows_sys::core::PCSTR, targetpath : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 596:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueRenameSectionA(queuehandle : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, section : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 597:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueRenameSectionW(queuehandle : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, section : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 598:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupQueueRenameW(queuehandle : *const core::ffi::c_void, sourcepath : windows_sys::core::PCWSTR, sourcefilename : windows_sys::core::PCWSTR, targetpath : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 599:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveFileLogEntryA(fileloghandle : *const core::ffi::c_void, logsectionname : windows_sys::core::PCSTR, targetfilename : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 600:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveFileLogEntryW(fileloghandle : *const core::ffi::c_void, logsectionname : windows_sys::core::PCWSTR, targetfilename : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 601:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveFromDiskSpaceListA(diskspace : *const core::ffi::c_void, targetfilespec : windows_sys::core::PCSTR, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 602:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveFromDiskSpaceListW(diskspace : *const core::ffi::c_void, targetfilespec : windows_sys::core::PCWSTR, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 603:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveFromSourceListA(flags : u32, source : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 604:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveFromSourceListW(flags : u32, source : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 605:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveInstallSectionFromDiskSpaceListA(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, layoutinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 606:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveInstallSectionFromDiskSpaceListW(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, layoutinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 607:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveSectionFromDiskSpaceListA(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCSTR, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 608:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRemoveSectionFromDiskSpaceListW(diskspace : *const core::ffi::c_void, infhandle : *const core::ffi::c_void, listinfhandle : *const core::ffi::c_void, sectionname : windows_sys::core::PCWSTR, operation : SETUP_FILE_OPERATION, reserved1 : *const core::ffi::c_void, reserved2 : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 609:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRenameErrorA(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCSTR, sourcefile : windows_sys::core::PCSTR, targetfile : windows_sys::core::PCSTR, win32errorcode : u32, style : u32) -> u32);

// UNSUPPORTED Rust 610:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupRenameErrorW(hwndparent : super::super::Foundation:: HWND, dialogtitle : windows_sys::core::PCWSTR, sourcefile : windows_sys::core::PCWSTR, targetfile : windows_sys::core::PCWSTR, win32errorcode : u32, style : u32) -> u32);

// UNSUPPORTED Rust 611:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupScanFileQueueA(filequeue : *const core::ffi::c_void, flags : SETUPSCANFILEQUEUE_FLAGS, window : super::super::Foundation:: HWND, callbackroutine : PSP_FILE_CALLBACK_A, callbackcontext : *const core::ffi::c_void, result : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 612:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupScanFileQueueW(filequeue : *const core::ffi::c_void, flags : SETUPSCANFILEQUEUE_FLAGS, window : super::super::Foundation:: HWND, callbackroutine : PSP_FILE_CALLBACK_W, callbackcontext : *const core::ffi::c_void, result : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 613:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetDirectoryIdA(infhandle : *const core::ffi::c_void, id : u32, directory : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 614:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetDirectoryIdExA(infhandle : *const core::ffi::c_void, id : u32, directory : windows_sys::core::PCSTR, flags : u32, reserved1 : u32, reserved2 : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 615:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetDirectoryIdExW(infhandle : *const core::ffi::c_void, id : u32, directory : windows_sys::core::PCWSTR, flags : u32, reserved1 : u32, reserved2 : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 616:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetDirectoryIdW(infhandle : *const core::ffi::c_void, id : u32, directory : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 617:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupSetFileQueueAlternatePlatformA(queuehandle : *const core::ffi::c_void, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, alternatedefaultcatalogfile : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 619:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupSetFileQueueAlternatePlatformW(queuehandle : *const core::ffi::c_void, alternateplatforminfo : *const SP_ALTPLATFORM_INFO_V2, alternatedefaultcatalogfile : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 621:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetFileQueueFlags(filequeue : *const core::ffi::c_void, flagmask : u32, flags : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 622:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetNonInteractiveMode(noninteractiveflag : windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 623:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetPlatformPathOverrideA(r#override : windows_sys::core::PCSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 624:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetPlatformPathOverrideW(r#override : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 625:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetSourceListA(flags : u32, sourcelist : *const windows_sys::core::PCSTR, sourcecount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 626:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetSourceListW(flags : u32, sourcelist : *const windows_sys::core::PCWSTR, sourcecount : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 627:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupSetThreadLogToken(logtoken : u64));

// UNSUPPORTED Rust 628:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupTermDefaultQueueCallback(context : *const core::ffi::c_void));

// UNSUPPORTED Rust 629:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupTerminateFileLog(fileloghandle : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 630:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupUninstallNewlyCopiedInfs(filequeue : *const core::ffi::c_void, flags : u32, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 631:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupUninstallOEMInfA(inffilename : windows_sys::core::PCSTR, flags : u32, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 632:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupUninstallOEMInfW(inffilename : windows_sys::core::PCWSTR, flags : u32, reserved : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 633:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupVerifyInfFileA(infname : windows_sys::core::PCSTR, altplatforminfo : *const SP_ALTPLATFORM_INFO_V2, infsignerinfo : *mut SP_INF_SIGNER_INFO_V2_A) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 635:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// windows_link::link!("setupapi.dll" "system" fn SetupVerifyInfFileW(infname : windows_sys::core::PCWSTR, altplatforminfo : *const SP_ALTPLATFORM_INFO_V2, infsignerinfo : *mut SP_INF_SIGNER_INFO_V2_W) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 637:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "C" fn SetupWriteTextLog(logtoken : u64, category : u32, flags : u32, messagestr : windows_sys::core::PCSTR, ...));

// UNSUPPORTED Rust 638:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "C" fn SetupWriteTextLogError(logtoken : u64, category : u32, logflags : u32, error : u32, messagestr : windows_sys::core::PCSTR, ...));

// UNSUPPORTED Rust 639:1: declaration Macro has no candidate rule
// windows_link::link!("setupapi.dll" "system" fn SetupWriteTextLogInfLine(logtoken : u64, flags : u32, infhandle : *const core::ffi::c_void, context : *const INFCONTEXT));

// UNSUPPORTED Rust 640:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn UpdateDriverForPlugAndPlayDevicesA(hwndparent : super::super::Foundation:: HWND, hardwareid : windows_sys::core::PCSTR, fullinfpath : windows_sys::core::PCSTR, installflags : UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 641:1: declaration Macro has no candidate rule
// windows_link::link!("newdev.dll" "system" fn UpdateDriverForPlugAndPlayDevicesW(hwndparent : super::super::Foundation:: HWND, hardwareid : windows_sys::core::PCWSTR, fullinfpath : windows_sys::core::PCWSTR, installflags : UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired : *mut windows_sys::core::BOOL) -> windows_sys::core::BOOL);

public const val `ALLOC_LOG_CONF`: `CM_LOG_CONF` = 2u;
public const val `BASIC_LOG_CONF`: `CM_LOG_CONF` = 0u;
public const val `BOOT_LOG_CONF`: `CM_LOG_CONF` = 3u;
// UNSUPPORTED Rust 645:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct BUSNUMBER_DES {
//     pub BUSD_Count: u32,
//     pub BUSD_Type: u32,
//     pub BUSD_Flags: u32,
//     pub BUSD_Alloc_Base: u32,
//     pub BUSD_Alloc_End: u32,
// }

// UNSUPPORTED Rust 654:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct BUSNUMBER_RANGE {
//     pub BUSR_Min: u32,
//     pub BUSR_Max: u32,
//     pub BUSR_nBusNumbers: u32,
//     pub BUSR_Flags: u32,
// }

// UNSUPPORTED Rust 662:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct BUSNUMBER_RESOURCE {
//     pub BusNumber_Header: BUSNUMBER_DES,
//     pub BusNumber_Data: [BUSNUMBER_RANGE; 1],
// }

// UNSUPPORTED Rust 668:1: declaration Impl has no candidate rule
// impl Default for BUSNUMBER_RESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 673:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct CABINET_INFO_A {
//     pub CabinetPath: windows_sys::core::PCSTR,
//     pub CabinetFile: windows_sys::core::PCSTR,
//     pub DiskName: windows_sys::core::PCSTR,
//     pub SetId: u16,
//     pub CabinetNumber: u16,
// }

// UNSUPPORTED Rust 683:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for CABINET_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 689:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct CABINET_INFO_A {
//     pub CabinetPath: windows_sys::core::PCSTR,
//     pub CabinetFile: windows_sys::core::PCSTR,
//     pub DiskName: windows_sys::core::PCSTR,
//     pub SetId: u16,
//     pub CabinetNumber: u16,
// }

// UNSUPPORTED Rust 699:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CABINET_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 705:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct CABINET_INFO_W {
//     pub CabinetPath: windows_sys::core::PCWSTR,
//     pub CabinetFile: windows_sys::core::PCWSTR,
//     pub DiskName: windows_sys::core::PCWSTR,
//     pub SetId: u16,
//     pub CabinetNumber: u16,
// }

// UNSUPPORTED Rust 715:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for CABINET_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct CABINET_INFO_W {
//     pub CabinetPath: windows_sys::core::PCWSTR,
//     pub CabinetFile: windows_sys::core::PCWSTR,
//     pub DiskName: windows_sys::core::PCWSTR,
//     pub SetId: u16,
//     pub CabinetNumber: u16,
// }

// UNSUPPORTED Rust 731:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for CABINET_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CM_ADD_ID_BITS`: UInt = 1u;
public const val `CM_ADD_ID_COMPATIBLE`: UInt = 1u;
public const val `CM_ADD_ID_HARDWARE`: UInt = 0u;
public const val `CM_ADD_RANGE_ADDIFCONFLICT`: UInt = 0u;
public const val `CM_ADD_RANGE_BITS`: UInt = 1u;
public const val `CM_ADD_RANGE_DONOTADDIFCONFLICT`: UInt = 1u;
public typealias `CM_CDFLAGS` = UInt;
public const val `CM_CDFLAGS_DRIVER`: `CM_CDFLAGS` = 1u;
public const val `CM_CDFLAGS_RESERVED`: `CM_CDFLAGS` = 4u;
public const val `CM_CDFLAGS_ROOT_OWNED`: `CM_CDFLAGS` = 2u;
public typealias `CM_CDMASK` = UInt;
public const val `CM_CDMASK_DESCRIPTION`: `CM_CDMASK` = 8u;
public const val `CM_CDMASK_DEVINST`: `CM_CDMASK` = 1u;
public const val `CM_CDMASK_FLAGS`: `CM_CDMASK` = 4u;
public const val `CM_CDMASK_RESDES`: `CM_CDMASK` = 2u;
public const val `CM_CDMASK_VALID`: `CM_CDMASK` = 15u;
public const val `CM_CLASS_PROPERTY_BITS`: UInt = 1u;
public const val `CM_CLASS_PROPERTY_INSTALLER`: UInt = 0u;
public const val `CM_CLASS_PROPERTY_INTERFACE`: UInt = 1u;
public const val `CM_CREATE_DEVINST_BITS`: UInt = 15u;
public const val `CM_CREATE_DEVINST_DO_NOT_INSTALL`: UInt = 8u;
public const val `CM_CREATE_DEVINST_GENERATE_ID`: UInt = 4u;
public const val `CM_CREATE_DEVINST_NORMAL`: UInt = 0u;
public const val `CM_CREATE_DEVINST_NO_WAIT_INSTALL`: UInt = 1u;
public const val `CM_CREATE_DEVINST_PHANTOM`: UInt = 2u;
public const val `CM_CREATE_DEVNODE_BITS`: UInt = 15u;
public const val `CM_CREATE_DEVNODE_DO_NOT_INSTALL`: UInt = 8u;
public const val `CM_CREATE_DEVNODE_GENERATE_ID`: UInt = 4u;
public const val `CM_CREATE_DEVNODE_NORMAL`: UInt = 0u;
public const val `CM_CREATE_DEVNODE_NO_WAIT_INSTALL`: UInt = 1u;
public const val `CM_CREATE_DEVNODE_PHANTOM`: UInt = 2u;
public const val `CM_CRP_CHARACTERISTICS`: UInt = 28u;
public const val `CM_CRP_DEVTYPE`: UInt = 26u;
public const val `CM_CRP_EXCLUSIVE`: UInt = 27u;
public const val `CM_CRP_LOWERFILTERS`: UInt = 19u;
public const val `CM_CRP_MAX`: UInt = 37u;
public const val `CM_CRP_MIN`: UInt = 1u;
public const val `CM_CRP_SECURITY`: UInt = 24u;
public const val `CM_CRP_SECURITY_SDS`: UInt = 25u;
public const val `CM_CRP_UPPERFILTERS`: UInt = 18u;
public const val `CM_CUSTOMDEVPROP_BITS`: UInt = 1u;
public const val `CM_CUSTOMDEVPROP_MERGE_MULTISZ`: UInt = 1u;
public const val `CM_DELETE_CLASS_BITS`: UInt = 3u;
public const val `CM_DELETE_CLASS_INTERFACE`: UInt = 2u;
public const val `CM_DELETE_CLASS_ONLY`: UInt = 0u;
public const val `CM_DELETE_CLASS_SUBKEYS`: UInt = 1u;
public const val `CM_DETECT_BITS`: UInt = 2147483655u;
public const val `CM_DETECT_CRASHED`: UInt = 2u;
public const val `CM_DETECT_HWPROF_FIRST_BOOT`: UInt = 4u;
public const val `CM_DETECT_NEW_PROFILE`: UInt = 1u;
public const val `CM_DETECT_RUN`: UInt = 2147483648u;
public typealias `CM_DEVCAP` = UInt;
public const val `CM_DEVCAP_DOCKDEVICE`: `CM_DEVCAP` = 8u;
public const val `CM_DEVCAP_EJECTSUPPORTED`: `CM_DEVCAP` = 2u;
public const val `CM_DEVCAP_HARDWAREDISABLED`: `CM_DEVCAP` = 256u;
public const val `CM_DEVCAP_LOCKSUPPORTED`: `CM_DEVCAP` = 1u;
public const val `CM_DEVCAP_NONDYNAMIC`: `CM_DEVCAP` = 512u;
public const val `CM_DEVCAP_RAWDEVICEOK`: `CM_DEVCAP` = 64u;
public const val `CM_DEVCAP_REMOVABLE`: `CM_DEVCAP` = 4u;
public const val `CM_DEVCAP_SECUREDEVICE`: `CM_DEVCAP` = 1024u;
public const val `CM_DEVCAP_SILENTINSTALL`: `CM_DEVCAP` = 32u;
public const val `CM_DEVCAP_SURPRISEREMOVALOK`: `CM_DEVCAP` = 128u;
public const val `CM_DEVCAP_UNIQUEID`: `CM_DEVCAP` = 16u;
public const val `CM_DEVICE_PANEL_EDGE_BOTTOM`: UInt = 2u;
public const val `CM_DEVICE_PANEL_EDGE_LEFT`: UInt = 3u;
public const val `CM_DEVICE_PANEL_EDGE_RIGHT`: UInt = 4u;
public const val `CM_DEVICE_PANEL_EDGE_TOP`: UInt = 1u;
public const val `CM_DEVICE_PANEL_EDGE_UNKNOWN`: UInt = 0u;
public const val `CM_DEVICE_PANEL_JOINT_TYPE_HINGE`: UInt = 2u;
public const val `CM_DEVICE_PANEL_JOINT_TYPE_PIVOT`: UInt = 3u;
public const val `CM_DEVICE_PANEL_JOINT_TYPE_PLANAR`: UInt = 1u;
public const val `CM_DEVICE_PANEL_JOINT_TYPE_SWIVEL`: UInt = 4u;
public const val `CM_DEVICE_PANEL_JOINT_TYPE_UNKNOWN`: UInt = 0u;
public const val `CM_DEVICE_PANEL_ORIENTATION_HORIZONTAL`: UInt = 0u;
public const val `CM_DEVICE_PANEL_ORIENTATION_VERTICAL`: UInt = 1u;
public const val `CM_DEVICE_PANEL_SHAPE_OVAL`: UInt = 2u;
public const val `CM_DEVICE_PANEL_SHAPE_RECTANGLE`: UInt = 1u;
public const val `CM_DEVICE_PANEL_SHAPE_UNKNOWN`: UInt = 0u;
public const val `CM_DEVICE_PANEL_SIDE_BACK`: UInt = 6u;
public const val `CM_DEVICE_PANEL_SIDE_BOTTOM`: UInt = 2u;
public const val `CM_DEVICE_PANEL_SIDE_FRONT`: UInt = 5u;
public const val `CM_DEVICE_PANEL_SIDE_LEFT`: UInt = 3u;
public const val `CM_DEVICE_PANEL_SIDE_RIGHT`: UInt = 4u;
public const val `CM_DEVICE_PANEL_SIDE_TOP`: UInt = 1u;
public const val `CM_DEVICE_PANEL_SIDE_UNKNOWN`: UInt = 0u;
public typealias `CM_DEVNODE_STATUS_FLAGS` = UInt;
public const val `CM_DISABLE_ABSOLUTE`: UInt = 1u;
public const val `CM_DISABLE_BITS`: UInt = 15u;
public const val `CM_DISABLE_HARDWARE`: UInt = 2u;
public const val `CM_DISABLE_PERSIST`: UInt = 8u;
public const val `CM_DISABLE_POLITE`: UInt = 0u;
public const val `CM_DISABLE_UI_NOT_OK`: UInt = 4u;
public const val `CM_DRP_ADDRESS`: UInt = 29u;
public const val `CM_DRP_BASE_CONTAINERID`: UInt = 37u;
public const val `CM_DRP_BUSNUMBER`: UInt = 22u;
public const val `CM_DRP_BUSTYPEGUID`: UInt = 20u;
public const val `CM_DRP_CAPABILITIES`: UInt = 16u;
public const val `CM_DRP_CHARACTERISTICS`: UInt = 28u;
public const val `CM_DRP_CLASS`: UInt = 8u;
public const val `CM_DRP_CLASSGUID`: UInt = 9u;
public const val `CM_DRP_COMPATIBLEIDS`: UInt = 3u;
public const val `CM_DRP_CONFIGFLAGS`: UInt = 11u;
public const val `CM_DRP_DEVICEDESC`: UInt = 1u;
public const val `CM_DRP_DEVICE_POWER_DATA`: UInt = 31u;
public const val `CM_DRP_DEVTYPE`: UInt = 26u;
public const val `CM_DRP_DRIVER`: UInt = 10u;
public const val `CM_DRP_ENUMERATOR_NAME`: UInt = 23u;
public const val `CM_DRP_EXCLUSIVE`: UInt = 27u;
public const val `CM_DRP_FRIENDLYNAME`: UInt = 13u;
public const val `CM_DRP_HARDWAREID`: UInt = 2u;
public const val `CM_DRP_INSTALL_STATE`: UInt = 35u;
public const val `CM_DRP_LEGACYBUSTYPE`: UInt = 21u;
public const val `CM_DRP_LOCATION_INFORMATION`: UInt = 14u;
public const val `CM_DRP_LOCATION_PATHS`: UInt = 36u;
public const val `CM_DRP_LOWERFILTERS`: UInt = 19u;
public const val `CM_DRP_MAX`: UInt = 37u;
public const val `CM_DRP_MFG`: UInt = 12u;
public const val `CM_DRP_MIN`: UInt = 1u;
public const val `CM_DRP_PHYSICAL_DEVICE_OBJECT_NAME`: UInt = 15u;
public const val `CM_DRP_REMOVAL_POLICY`: UInt = 32u;
public const val `CM_DRP_REMOVAL_POLICY_HW_DEFAULT`: UInt = 33u;
public const val `CM_DRP_REMOVAL_POLICY_OVERRIDE`: UInt = 34u;
public const val `CM_DRP_SECURITY`: UInt = 24u;
public const val `CM_DRP_SECURITY_SDS`: UInt = 25u;
public const val `CM_DRP_SERVICE`: UInt = 5u;
public const val `CM_DRP_UI_NUMBER`: UInt = 17u;
public const val `CM_DRP_UI_NUMBER_DESC_FORMAT`: UInt = 30u;
public const val `CM_DRP_UNUSED0`: UInt = 4u;
public const val `CM_DRP_UNUSED1`: UInt = 6u;
public const val `CM_DRP_UNUSED2`: UInt = 7u;
public const val `CM_DRP_UPPERFILTERS`: UInt = 18u;
public const val `CM_ENUMERATE_CLASSES_BITS`: `CM_ENUMERATE_FLAGS` = 1u;
public const val `CM_ENUMERATE_CLASSES_INSTALLER`: `CM_ENUMERATE_FLAGS` = 0u;
public const val `CM_ENUMERATE_CLASSES_INTERFACE`: `CM_ENUMERATE_FLAGS` = 1u;
public typealias `CM_ENUMERATE_FLAGS` = UInt;
public const val `CM_GETIDLIST_DONOTGENERATE`: UInt = 268435520u;
public const val `CM_GETIDLIST_FILTER_BITS`: UInt = 268435583u;
public const val `CM_GETIDLIST_FILTER_BUSRELATIONS`: UInt = 32u;
public const val `CM_GETIDLIST_FILTER_CLASS`: UInt = 512u;
public const val `CM_GETIDLIST_FILTER_EJECTRELATIONS`: UInt = 4u;
public const val `CM_GETIDLIST_FILTER_ENUMERATOR`: UInt = 1u;
public const val `CM_GETIDLIST_FILTER_NONE`: UInt = 0u;
public const val `CM_GETIDLIST_FILTER_POWERRELATIONS`: UInt = 16u;
public const val `CM_GETIDLIST_FILTER_PRESENT`: UInt = 256u;
public const val `CM_GETIDLIST_FILTER_REMOVALRELATIONS`: UInt = 8u;
public const val `CM_GETIDLIST_FILTER_SERVICE`: UInt = 2u;
public const val `CM_GETIDLIST_FILTER_TRANSPORTRELATIONS`: UInt = 128u;
public const val `CM_GET_DEVICE_INTERFACE_LIST_ALL_DEVICES`: `CM_GET_DEVICE_INTERFACE_LIST_FLAGS` = 1u;
public const val `CM_GET_DEVICE_INTERFACE_LIST_BITS`: `CM_GET_DEVICE_INTERFACE_LIST_FLAGS` = 1u;
public typealias `CM_GET_DEVICE_INTERFACE_LIST_FLAGS` = UInt;
public const val `CM_GET_DEVICE_INTERFACE_LIST_PRESENT`: `CM_GET_DEVICE_INTERFACE_LIST_FLAGS` = 0u;
public const val `CM_GLOBAL_STATE_CAN_DO_UI`: UInt = 1u;
public const val `CM_GLOBAL_STATE_DETECTION_PENDING`: UInt = 16u;
public const val `CM_GLOBAL_STATE_ON_BIG_STACK`: UInt = 2u;
public const val `CM_GLOBAL_STATE_REBOOT_REQUIRED`: UInt = 32u;
public const val `CM_GLOBAL_STATE_SERVICES_AVAILABLE`: UInt = 4u;
public const val `CM_GLOBAL_STATE_SHUTTING_DOWN`: UInt = 8u;
public const val `CM_HWPI_DOCKED`: UInt = 2u;
public const val `CM_HWPI_NOT_DOCKABLE`: UInt = 0u;
public const val `CM_HWPI_UNDOCKED`: UInt = 1u;
public typealias `CM_INSTALL_STATE` = UInt;
public const val `CM_INSTALL_STATE_FAILED_INSTALL`: `CM_INSTALL_STATE` = 2u;
public const val `CM_INSTALL_STATE_FINISH_INSTALL`: `CM_INSTALL_STATE` = 3u;
public const val `CM_INSTALL_STATE_INSTALLED`: `CM_INSTALL_STATE` = 0u;
public const val `CM_INSTALL_STATE_NEEDS_REINSTALL`: `CM_INSTALL_STATE` = 1u;
public const val `CM_LOCATE_DEVNODE_BITS`: `CM_LOCATE_DEVNODE_FLAGS` = 7u;
public const val `CM_LOCATE_DEVNODE_CANCELREMOVE`: `CM_LOCATE_DEVNODE_FLAGS` = 2u;
public typealias `CM_LOCATE_DEVNODE_FLAGS` = UInt;
public const val `CM_LOCATE_DEVNODE_NORMAL`: `CM_LOCATE_DEVNODE_FLAGS` = 0u;
public const val `CM_LOCATE_DEVNODE_NOVALIDATION`: `CM_LOCATE_DEVNODE_FLAGS` = 4u;
public const val `CM_LOCATE_DEVNODE_PHANTOM`: `CM_LOCATE_DEVNODE_FLAGS` = 1u;
public typealias `CM_LOG_CONF` = UInt;
public const val `CM_NAME_ATTRIBUTE_NAME_RETRIEVED_FROM_DEVICE`: UInt = 1u;
public const val `CM_NAME_ATTRIBUTE_USER_ASSIGNED_NAME`: UInt = 2u;
public typealias `CM_NOTIFY_ACTION` = Int;
public const val `CM_NOTIFY_ACTION_DEVICECUSTOMEVENT`: `CM_NOTIFY_ACTION` = 6;
public const val `CM_NOTIFY_ACTION_DEVICEINSTANCEENUMERATED`: `CM_NOTIFY_ACTION` = 7;
public const val `CM_NOTIFY_ACTION_DEVICEINSTANCEREMOVED`: `CM_NOTIFY_ACTION` = 9;
public const val `CM_NOTIFY_ACTION_DEVICEINSTANCESTARTED`: `CM_NOTIFY_ACTION` = 8;
public const val `CM_NOTIFY_ACTION_DEVICEINTERFACEARRIVAL`: `CM_NOTIFY_ACTION` = 0;
public const val `CM_NOTIFY_ACTION_DEVICEINTERFACEREMOVAL`: `CM_NOTIFY_ACTION` = 1;
public const val `CM_NOTIFY_ACTION_DEVICEQUERYREMOVE`: `CM_NOTIFY_ACTION` = 2;
public const val `CM_NOTIFY_ACTION_DEVICEQUERYREMOVEFAILED`: `CM_NOTIFY_ACTION` = 3;
public const val `CM_NOTIFY_ACTION_DEVICEREMOVECOMPLETE`: `CM_NOTIFY_ACTION` = 5;
public const val `CM_NOTIFY_ACTION_DEVICEREMOVEPENDING`: `CM_NOTIFY_ACTION` = 4;
public const val `CM_NOTIFY_ACTION_MAX`: `CM_NOTIFY_ACTION` = 10;
// UNSUPPORTED Rust 923:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_EVENT_DATA {
//     pub FilterType: CM_NOTIFY_FILTER_TYPE,
//     pub Reserved: u32,
//     pub u: CM_NOTIFY_EVENT_DATA_0,
// }

// UNSUPPORTED Rust 930:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_EVENT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 935:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CM_NOTIFY_EVENT_DATA_0 {
//     pub DeviceInterface: CM_NOTIFY_EVENT_DATA_0_0,
//     pub DeviceHandle: CM_NOTIFY_EVENT_DATA_0_1,
//     pub DeviceInstance: CM_NOTIFY_EVENT_DATA_0_2,
// }

// UNSUPPORTED Rust 942:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_EVENT_DATA_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 947:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_EVENT_DATA_0_1 {
//     pub EventGuid: windows_sys::core::GUID,
//     pub NameOffset: i32,
//     pub DataSize: u32,
//     pub Data: [u8; 1],
// }

// UNSUPPORTED Rust 955:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_EVENT_DATA_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 960:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_EVENT_DATA_0_2 {
//     pub InstanceId: [u16; 1],
// }

// UNSUPPORTED Rust 965:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_EVENT_DATA_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 970:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_EVENT_DATA_0_0 {
//     pub ClassGuid: windows_sys::core::GUID,
//     pub SymbolicLink: [u16; 1],
// }

// UNSUPPORTED Rust 976:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_EVENT_DATA_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 981:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_FILTER {
//     pub cbSize: u32,
//     pub Flags: u32,
//     pub FilterType: CM_NOTIFY_FILTER_TYPE,
//     pub Reserved: u32,
//     pub u: CM_NOTIFY_FILTER_0,
// }

// UNSUPPORTED Rust 990:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_FILTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 995:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CM_NOTIFY_FILTER_0 {
//     pub DeviceInterface: CM_NOTIFY_FILTER_0_0,
//     pub DeviceHandle: CM_NOTIFY_FILTER_0_1,
//     pub DeviceInstance: CM_NOTIFY_FILTER_0_2,
// }

// UNSUPPORTED Rust 1002:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_FILTER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1007:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_FILTER_0_1 {
//     pub hTarget: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 1012:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_FILTER_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1017:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CM_NOTIFY_FILTER_0_2 {
//     pub InstanceId: [u16; 200],
// }

// UNSUPPORTED Rust 1022:1: declaration Impl has no candidate rule
// impl Default for CM_NOTIFY_FILTER_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1027:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CM_NOTIFY_FILTER_0_0 {
//     pub ClassGuid: windows_sys::core::GUID,
// }

public const val `CM_NOTIFY_FILTER_FLAG_ALL_DEVICE_INSTANCES`: UInt = 2u;
public const val `CM_NOTIFY_FILTER_FLAG_ALL_INTERFACE_CLASSES`: UInt = 1u;
public typealias `CM_NOTIFY_FILTER_TYPE` = Int;
public const val `CM_NOTIFY_FILTER_TYPE_DEVICEHANDLE`: `CM_NOTIFY_FILTER_TYPE` = 1;
public const val `CM_NOTIFY_FILTER_TYPE_DEVICEINSTANCE`: `CM_NOTIFY_FILTER_TYPE` = 2;
public const val `CM_NOTIFY_FILTER_TYPE_DEVICEINTERFACE`: `CM_NOTIFY_FILTER_TYPE` = 0;
public const val `CM_NOTIFY_FILTER_TYPE_MAX`: `CM_NOTIFY_FILTER_TYPE` = 3;
public const val `CM_OPEN_CLASS_KEY_BITS`: UInt = 1u;
public const val `CM_OPEN_CLASS_KEY_INSTALLER`: UInt = 0u;
public const val `CM_OPEN_CLASS_KEY_INTERFACE`: UInt = 1u;
public typealias `CM_PROB` = UInt;
public const val `CM_PROB_BIOS_TABLE`: `CM_PROB` = 35u;
public const val `CM_PROB_BOOT_CONFIG_CONFLICT`: `CM_PROB` = 6u;
public const val `CM_PROB_CANT_SHARE_IRQ`: `CM_PROB` = 30u;
public const val `CM_PROB_CONSOLE_LOCKED`: `CM_PROB` = 55u;
public const val `CM_PROB_DEVICE_NOT_THERE`: `CM_PROB` = 24u;
public const val `CM_PROB_DEVICE_RESET`: `CM_PROB` = 54u;
public const val `CM_PROB_DEVLOADER_FAILED`: `CM_PROB` = 2u;
public const val `CM_PROB_DEVLOADER_NOT_FOUND`: `CM_PROB` = 8u;
public const val `CM_PROB_DEVLOADER_NOT_READY`: `CM_PROB` = 23u;
public const val `CM_PROB_DISABLED`: `CM_PROB` = 22u;
public const val `CM_PROB_DISABLED_SERVICE`: `CM_PROB` = 32u;
public const val `CM_PROB_DRIVER_BLOCKED`: `CM_PROB` = 48u;
public const val `CM_PROB_DRIVER_FAILED_LOAD`: `CM_PROB` = 39u;
public const val `CM_PROB_DRIVER_FAILED_PRIOR_UNLOAD`: `CM_PROB` = 38u;
public const val `CM_PROB_DRIVER_SERVICE_KEY_INVALID`: `CM_PROB` = 40u;
public const val `CM_PROB_DUPLICATE_DEVICE`: `CM_PROB` = 42u;
public const val `CM_PROB_ENTRY_IS_WRONG_TYPE`: `CM_PROB` = 4u;
public const val `CM_PROB_FAILED_ADD`: `CM_PROB` = 31u;
public const val `CM_PROB_FAILED_DRIVER_ENTRY`: `CM_PROB` = 37u;
public const val `CM_PROB_FAILED_FILTER`: `CM_PROB` = 7u;
public const val `CM_PROB_FAILED_INSTALL`: `CM_PROB` = 28u;
public const val `CM_PROB_FAILED_POST_START`: `CM_PROB` = 43u;
public const val `CM_PROB_FAILED_START`: `CM_PROB` = 10u;
public const val `CM_PROB_GUEST_ASSIGNMENT_FAILED`: `CM_PROB` = 57u;
public const val `CM_PROB_HALTED`: `CM_PROB` = 44u;
public const val `CM_PROB_HARDWARE_DISABLED`: `CM_PROB` = 29u;
public const val `CM_PROB_HELD_FOR_EJECT`: `CM_PROB` = 47u;
public const val `CM_PROB_INVALID_DATA`: `CM_PROB` = 9u;
public const val `CM_PROB_IRQ_TRANSLATION_FAILED`: `CM_PROB` = 36u;
public const val `CM_PROB_LACKED_ARBITRATOR`: `CM_PROB` = 5u;
public const val `CM_PROB_LEGACY_SERVICE_NO_DEVICES`: `CM_PROB` = 41u;
public const val `CM_PROB_LIAR`: `CM_PROB` = 11u;
public const val `CM_PROB_MOVED`: `CM_PROB` = 25u;
public const val `CM_PROB_NEED_CLASS_CONFIG`: `CM_PROB` = 56u;
public const val `CM_PROB_NEED_RESTART`: `CM_PROB` = 14u;
public const val `CM_PROB_NORMAL_CONFLICT`: `CM_PROB` = 12u;
public const val `CM_PROB_NOT_CONFIGURED`: `CM_PROB` = 1u;
public const val `CM_PROB_NOT_VERIFIED`: `CM_PROB` = 13u;
public const val `CM_PROB_NO_SOFTCONFIG`: `CM_PROB` = 34u;
public const val `CM_PROB_NO_VALID_LOG_CONF`: `CM_PROB` = 27u;
public const val `CM_PROB_OUT_OF_MEMORY`: `CM_PROB` = 3u;
public const val `CM_PROB_PARTIAL_LOG_CONF`: `CM_PROB` = 16u;
public const val `CM_PROB_PHANTOM`: `CM_PROB` = 45u;
public const val `CM_PROB_REENUMERATION`: `CM_PROB` = 15u;
public const val `CM_PROB_REGISTRY`: `CM_PROB` = 19u;
public const val `CM_PROB_REGISTRY_TOO_LARGE`: `CM_PROB` = 49u;
public const val `CM_PROB_REINSTALL`: `CM_PROB` = 18u;
public const val `CM_PROB_SETPROPERTIES_FAILED`: `CM_PROB` = 50u;
public const val `CM_PROB_SYSTEM_SHUTDOWN`: `CM_PROB` = 46u;
public const val `CM_PROB_TOO_EARLY`: `CM_PROB` = 26u;
public const val `CM_PROB_TRANSLATION_FAILED`: `CM_PROB` = 33u;
public const val `CM_PROB_UNKNOWN_RESOURCE`: `CM_PROB` = 17u;
public const val `CM_PROB_UNSIGNED_DRIVER`: `CM_PROB` = 52u;
public const val `CM_PROB_USED_BY_DEBUGGER`: `CM_PROB` = 53u;
public const val `CM_PROB_VXDLDR`: `CM_PROB` = 20u;
public const val `CM_PROB_WAITING_ON_DEPENDENCY`: `CM_PROB` = 51u;
public const val `CM_PROB_WILL_BE_REMOVED`: `CM_PROB` = 21u;
public const val `CM_QUERY_ARBITRATOR_BITS`: UInt = 1u;
public const val `CM_QUERY_ARBITRATOR_RAW`: UInt = 0u;
public const val `CM_QUERY_ARBITRATOR_TRANSLATED`: UInt = 1u;
public const val `CM_QUERY_REMOVE_UI_NOT_OK`: UInt = 1u;
public const val `CM_QUERY_REMOVE_UI_OK`: UInt = 0u;
public const val `CM_REENUMERATE_ASYNCHRONOUS`: `CM_REENUMERATE_FLAGS` = 4u;
public const val `CM_REENUMERATE_BITS`: `CM_REENUMERATE_FLAGS` = 7u;
public typealias `CM_REENUMERATE_FLAGS` = UInt;
public const val `CM_REENUMERATE_NORMAL`: `CM_REENUMERATE_FLAGS` = 0u;
public const val `CM_REENUMERATE_RETRY_INSTALLATION`: `CM_REENUMERATE_FLAGS` = 2u;
public const val `CM_REENUMERATE_SYNCHRONOUS`: `CM_REENUMERATE_FLAGS` = 1u;
public const val `CM_REGISTER_DEVICE_DRIVER_BITS`: UInt = 3u;
public const val `CM_REGISTER_DEVICE_DRIVER_DISABLEABLE`: UInt = 1u;
public const val `CM_REGISTER_DEVICE_DRIVER_REMOVABLE`: UInt = 2u;
public const val `CM_REGISTER_DEVICE_DRIVER_STATIC`: UInt = 0u;
public const val `CM_REGISTRY_BITS`: UInt = 769u;
public const val `CM_REGISTRY_CONFIG`: UInt = 512u;
public const val `CM_REGISTRY_HARDWARE`: UInt = 0u;
public const val `CM_REGISTRY_SOFTWARE`: UInt = 1u;
public const val `CM_REGISTRY_USER`: UInt = 256u;
public typealias `CM_REMOVAL_POLICY` = UInt;
public const val `CM_REMOVAL_POLICY_EXPECT_NO_REMOVAL`: `CM_REMOVAL_POLICY` = 1u;
public const val `CM_REMOVAL_POLICY_EXPECT_ORDERLY_REMOVAL`: `CM_REMOVAL_POLICY` = 2u;
public const val `CM_REMOVAL_POLICY_EXPECT_SURPRISE_REMOVAL`: `CM_REMOVAL_POLICY` = 3u;
public const val `CM_REMOVE_BITS`: UInt = 7u;
public const val `CM_REMOVE_DISABLE`: UInt = 4u;
public const val `CM_REMOVE_NO_RESTART`: UInt = 2u;
public const val `CM_REMOVE_UI_NOT_OK`: UInt = 1u;
public const val `CM_REMOVE_UI_OK`: UInt = 0u;
public const val `CM_RESDES_WIDTH_32`: UInt = 1u;
public const val `CM_RESDES_WIDTH_64`: UInt = 2u;
public const val `CM_RESDES_WIDTH_BITS`: UInt = 3u;
public const val `CM_RESDES_WIDTH_DEFAULT`: UInt = 0u;
public typealias `CM_RESTYPE` = UInt;
public const val `CM_SETUP_BITS`: UInt = 15u;
public const val `CM_SETUP_DEVINST_CONFIG`: UInt = 5u;
public const val `CM_SETUP_DEVINST_CONFIG_CLASS`: UInt = 6u;
public const val `CM_SETUP_DEVINST_CONFIG_EXTENSIONS`: UInt = 7u;
public const val `CM_SETUP_DEVINST_CONFIG_RESET`: UInt = 8u;
public const val `CM_SETUP_DEVINST_READY`: UInt = 0u;
public const val `CM_SETUP_DEVINST_RESET`: UInt = 4u;
public const val `CM_SETUP_DEVNODE_CONFIG`: UInt = 5u;
public const val `CM_SETUP_DEVNODE_CONFIG_CLASS`: UInt = 6u;
public const val `CM_SETUP_DEVNODE_CONFIG_EXTENSIONS`: UInt = 7u;
public const val `CM_SETUP_DEVNODE_CONFIG_RESET`: UInt = 8u;
public const val `CM_SETUP_DEVNODE_READY`: UInt = 0u;
public const val `CM_SETUP_DEVNODE_RESET`: UInt = 4u;
public const val `CM_SETUP_DOWNLOAD`: UInt = 1u;
public const val `CM_SETUP_PROP_CHANGE`: UInt = 3u;
public const val `CM_SETUP_WRITE_LOG_CONFS`: UInt = 2u;
public const val `CM_SET_DEVINST_PROBLEM_BITS`: UInt = 1u;
public const val `CM_SET_DEVINST_PROBLEM_NORMAL`: UInt = 0u;
public const val `CM_SET_DEVINST_PROBLEM_OVERRIDE`: UInt = 1u;
public const val `CM_SET_DEVNODE_PROBLEM_BITS`: UInt = 1u;
public const val `CM_SET_DEVNODE_PROBLEM_NORMAL`: UInt = 0u;
public const val `CM_SET_DEVNODE_PROBLEM_OVERRIDE`: UInt = 1u;
public const val `CM_SET_HW_PROF_FLAGS_BITS`: UInt = 1u;
public const val `CM_SET_HW_PROF_FLAGS_UI_NOT_OK`: UInt = 1u;
// UNSUPPORTED Rust 1158:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct COINSTALLER_CONTEXT_DATA {
//     pub PostProcessing: windows_sys::core::BOOL,
//     pub InstallResult: u32,
//     pub PrivateData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1166:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for COINSTALLER_CONTEXT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct COINSTALLER_CONTEXT_DATA {
//     pub PostProcessing: windows_sys::core::BOOL,
//     pub InstallResult: u32,
//     pub PrivateData: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1180:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for COINSTALLER_CONTEXT_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CONFIGFLAG_BOOT_DEVICE`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 262144u;
public const val `CONFIGFLAG_CANTSTOPACHILD`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 128u;
public const val `CONFIGFLAG_DISABLED`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 1u;
public const val `CONFIGFLAG_FAILEDINSTALL`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 64u;
public const val `CONFIGFLAG_FINISHINSTALL_ACTION`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 131072u;
public const val `CONFIGFLAG_FINISHINSTALL_UI`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 65536u;
public const val `CONFIGFLAG_FINISH_INSTALL`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 1024u;
public const val `CONFIGFLAG_IGNORE_BOOT_LC`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 8u;
public const val `CONFIGFLAG_MANUAL_INSTALL`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 4u;
public const val `CONFIGFLAG_NEEDS_CLASS_CONFIG`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 524288u;
public const val `CONFIGFLAG_NEEDS_FORCED_CONFIG`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 2048u;
public const val `CONFIGFLAG_NETBOOT_CARD`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 4096u;
public const val `CONFIGFLAG_NET_BOOT`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 16u;
public const val `CONFIGFLAG_NOREMOVEEXIT`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 512u;
public const val `CONFIGFLAG_OKREMOVEROM`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 256u;
public const val `CONFIGFLAG_PARTIAL_LOG_CONF`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 8192u;
public const val `CONFIGFLAG_REINSTALL`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 32u;
public const val `CONFIGFLAG_REMOVED`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 2u;
public const val `CONFIGFLAG_SUPPRESS_SURPRISE`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 16384u;
public const val `CONFIGFLAG_VERIFY_HARDWARE`: `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = 32768u;
public const val `CONFIGMG_VERSION`: UInt = 1024u;
public typealias `CONFIGRET` = UInt;
// UNSUPPORTED Rust 1208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONFLICT_DETAILS_A {
//     pub CD_ulSize: u32,
//     pub CD_ulMask: CM_CDMASK,
//     pub CD_dnDevInst: u32,
//     pub CD_rdResDes: usize,
//     pub CD_ulFlags: CM_CDFLAGS,
//     pub CD_szDescription: [i8; 260],
// }

// UNSUPPORTED Rust 1218:1: declaration Impl has no candidate rule
// impl Default for CONFLICT_DETAILS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1223:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CONFLICT_DETAILS_W {
//     pub CD_ulSize: u32,
//     pub CD_ulMask: CM_CDMASK,
//     pub CD_dnDevInst: u32,
//     pub CD_rdResDes: usize,
//     pub CD_ulFlags: CM_CDFLAGS,
//     pub CD_szDescription: [u16; 260],
// }

// UNSUPPORTED Rust 1233:1: declaration Impl has no candidate rule
// impl Default for CONFLICT_DETAILS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1238:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct CONNECTION_DES {
//     pub COND_Type: u32,
//     pub COND_Flags: u32,
//     pub COND_Class: u8,
//     pub COND_ClassType: u8,
//     pub COND_Reserved1: u8,
//     pub COND_Reserved2: u8,
//     pub COND_Id: i64,
// }

// UNSUPPORTED Rust 1249:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct CONNECTION_RESOURCE {
//     pub Connection_Header: CONNECTION_DES,
// }

public const val `COPYFLG_FORCE_FILE_IN_USE`: UInt = 8u;
public const val `COPYFLG_IN_USE_TRY_RENAME`: UInt = 16384u;
public const val `COPYFLG_NODECOMP`: UInt = 2048u;
public const val `COPYFLG_NOPRUNE`: UInt = 8192u;
public const val `COPYFLG_NOSKIP`: UInt = 2u;
public const val `COPYFLG_NOVERSIONCHECK`: UInt = 4u;
public const val `COPYFLG_NO_OVERWRITE`: UInt = 16u;
public const val `COPYFLG_NO_VERSION_DIALOG`: UInt = 32u;
public const val `COPYFLG_OVERWRITE_OLDER_ONLY`: UInt = 64u;
public const val `COPYFLG_PROTECTED_WINDOWS_DRIVER_FILE`: UInt = 256u;
public const val `COPYFLG_REPLACEONLY`: UInt = 1024u;
public const val `COPYFLG_REPLACE_BOOT_FILE`: UInt = 4096u;
public const val `COPYFLG_WARN_IF_SKIP`: UInt = 1u;
public const val `CR_ACCESS_DENIED`: `CONFIGRET` = 51u;
public const val `CR_ALREADY_SUCH_DEVINST`: `CONFIGRET` = 16u;
public const val `CR_ALREADY_SUCH_DEVNODE`: `CONFIGRET` = 16u;
public const val `CR_APM_VETOED`: `CONFIGRET` = 24u;
public const val `CR_BUFFER_SMALL`: `CONFIGRET` = 26u;
public const val `CR_CALL_NOT_IMPLEMENTED`: `CONFIGRET` = 52u;
public const val `CR_CANT_SHARE_IRQ`: `CONFIGRET` = 43u;
public const val `CR_CREATE_BLOCKED`: `CONFIGRET` = 21u;
public const val `CR_DEFAULT`: `CONFIGRET` = 1u;
public const val `CR_DEVICE_INTERFACE_ACTIVE`: `CONFIGRET` = 54u;
public const val `CR_DEVICE_NOT_THERE`: `CONFIGRET` = 36u;
public const val `CR_DEVINST_HAS_REQS`: `CONFIGRET` = 10u;
public const val `CR_DEVLOADER_NOT_READY`: `CONFIGRET` = 33u;
public const val `CR_DEVNODE_HAS_REQS`: `CONFIGRET` = 10u;
public const val `CR_DLVXD_NOT_FOUND`: `CONFIGRET` = 12u;
public const val `CR_FAILURE`: `CONFIGRET` = 19u;
public const val `CR_FREE_RESOURCES`: `CONFIGRET` = 41u;
public const val `CR_INVALID_API`: `CONFIGRET` = 32u;
public const val `CR_INVALID_ARBITRATOR`: `CONFIGRET` = 8u;
public const val `CR_INVALID_CONFLICT_LIST`: `CONFIGRET` = 57u;
public const val `CR_INVALID_DATA`: `CONFIGRET` = 31u;
public const val `CR_INVALID_DEVICE_ID`: `CONFIGRET` = 30u;
public const val `CR_INVALID_DEVINST`: `CONFIGRET` = 5u;
public const val `CR_INVALID_DEVNODE`: `CONFIGRET` = 5u;
public const val `CR_INVALID_FLAG`: `CONFIGRET` = 4u;
public const val `CR_INVALID_INDEX`: `CONFIGRET` = 58u;
public const val `CR_INVALID_LOAD_TYPE`: `CONFIGRET` = 25u;
public const val `CR_INVALID_LOG_CONF`: `CONFIGRET` = 7u;
public const val `CR_INVALID_MACHINENAME`: `CONFIGRET` = 47u;
public const val `CR_INVALID_NODELIST`: `CONFIGRET` = 9u;
public const val `CR_INVALID_POINTER`: `CONFIGRET` = 3u;
public const val `CR_INVALID_PRIORITY`: `CONFIGRET` = 39u;
public const val `CR_INVALID_PROPERTY`: `CONFIGRET` = 53u;
public const val `CR_INVALID_RANGE`: `CONFIGRET` = 18u;
public const val `CR_INVALID_RANGE_LIST`: `CONFIGRET` = 17u;
public const val `CR_INVALID_REFERENCE_STRING`: `CONFIGRET` = 56u;
public const val `CR_INVALID_RESOURCEID`: `CONFIGRET` = 11u;
public const val `CR_INVALID_RES_DES`: `CONFIGRET` = 6u;
public const val `CR_INVALID_STRUCTURE_SIZE`: `CONFIGRET` = 59u;
public const val `CR_MACHINE_UNAVAILABLE`: `CONFIGRET` = 49u;
public const val `CR_NEED_RESTART`: `CONFIGRET` = 34u;
public const val `CR_NOT_DISABLEABLE`: `CONFIGRET` = 40u;
public const val `CR_NOT_SYSTEM_VM`: `CONFIGRET` = 22u;
public const val `CR_NO_ARBITRATOR`: `CONFIGRET` = 27u;
public const val `CR_NO_CM_SERVICES`: `CONFIGRET` = 50u;
public const val `CR_NO_DEPENDENT`: `CONFIGRET` = 44u;
public const val `CR_NO_MORE_HW_PROFILES`: `CONFIGRET` = 35u;
public const val `CR_NO_MORE_LOG_CONF`: `CONFIGRET` = 14u;
public const val `CR_NO_MORE_RES_DES`: `CONFIGRET` = 15u;
public const val `CR_NO_REGISTRY_HANDLE`: `CONFIGRET` = 28u;
public const val `CR_NO_SUCH_DEVICE_INTERFACE`: `CONFIGRET` = 55u;
public const val `CR_NO_SUCH_DEVINST`: `CONFIGRET` = 13u;
public const val `CR_NO_SUCH_DEVNODE`: `CONFIGRET` = 13u;
public const val `CR_NO_SUCH_LOGICAL_DEV`: `CONFIGRET` = 20u;
public const val `CR_NO_SUCH_REGISTRY_KEY`: `CONFIGRET` = 46u;
public const val `CR_NO_SUCH_VALUE`: `CONFIGRET` = 37u;
public const val `CR_OUT_OF_MEMORY`: `CONFIGRET` = 2u;
public const val `CR_QUERY_VETOED`: `CONFIGRET` = 42u;
public const val `CR_REGISTRY_ERROR`: `CONFIGRET` = 29u;
public const val `CR_REMOTE_COMM_FAILURE`: `CONFIGRET` = 48u;
public const val `CR_REMOVE_VETOED`: `CONFIGRET` = 23u;
public const val `CR_SAME_RESOURCES`: `CONFIGRET` = 45u;
public const val `CR_SUCCESS`: `CONFIGRET` = 0u;
public const val `CR_WRONG_TYPE`: `CONFIGRET` = 38u;
// UNSUPPORTED Rust 1331:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct CS_DES {
//     pub CSD_SignatureLength: u32,
//     pub CSD_LegacyDataOffset: u32,
//     pub CSD_LegacyDataSize: u32,
//     pub CSD_Flags: u32,
//     pub CSD_ClassGuid: windows_sys::core::GUID,
//     pub CSD_Signature: [u8; 1],
// }

// UNSUPPORTED Rust 1341:1: declaration Impl has no candidate rule
// impl Default for CS_DES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1346:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct CS_RESOURCE {
//     pub CS_Header: CS_DES,
// }

public typealias `DD_FLAGS` = UInt;
public const val `DELFLG_IN_USE`: UInt = 1u;
public const val `DELFLG_IN_USE1`: UInt = 65536u;
// UNSUPPORTED Rust 1354:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DEVPRIVATE_DES {
//     pub PD_Count: u32,
//     pub PD_Type: u32,
//     pub PD_Data1: u32,
//     pub PD_Data2: u32,
//     pub PD_Data3: u32,
//     pub PD_Flags: u32,
// }

// UNSUPPORTED Rust 1364:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DEVPRIVATE_RANGE {
//     pub PR_Data1: u32,
//     pub PR_Data2: u32,
//     pub PR_Data3: u32,
// }

// UNSUPPORTED Rust 1371:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DEVPRIVATE_RESOURCE {
//     pub PRV_Header: DEVPRIVATE_DES,
//     pub PRV_Data: [DEVPRIVATE_RANGE; 1],
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule
// impl Default for DEVPRIVATE_RESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DIBCI_NODISPLAYCLASS`: UInt = 2u;
public const val `DIBCI_NOINSTALLCLASS`: UInt = 1u;
public const val `DICD_GENERATE_ID`: `SETUP_DI_DEVICE_CREATION_FLAGS` = 1u;
public const val `DICD_INHERIT_CLASSDRVS`: `SETUP_DI_DEVICE_CREATION_FLAGS` = 2u;
public const val `DICLASSPROP_INSTALLER`: UInt = 1u;
public const val `DICLASSPROP_INTERFACE`: UInt = 2u;
public const val `DICS_DISABLE`: `SETUP_DI_STATE_CHANGE` = 2u;
public const val `DICS_ENABLE`: `SETUP_DI_STATE_CHANGE` = 1u;
public const val `DICS_FLAG_CONFIGGENERAL`: `SETUP_DI_PROPERTY_CHANGE_SCOPE` = 4u;
public const val `DICS_FLAG_CONFIGSPECIFIC`: `SETUP_DI_PROPERTY_CHANGE_SCOPE` = 2u;
public const val `DICS_FLAG_GLOBAL`: `SETUP_DI_PROPERTY_CHANGE_SCOPE` = 1u;
public const val `DICS_PROPCHANGE`: `SETUP_DI_STATE_CHANGE` = 3u;
public const val `DICS_START`: `SETUP_DI_STATE_CHANGE` = 4u;
public const val `DICS_STOP`: `SETUP_DI_STATE_CHANGE` = 5u;
public const val `DICUSTOMDEVPROP_MERGE_MULTISZ`: UInt = 1u;
public const val `DIF_ADDPROPERTYPAGE_ADVANCED`: `DI_FUNCTION` = 35u;
public const val `DIF_ADDPROPERTYPAGE_BASIC`: `DI_FUNCTION` = 36u;
public const val `DIF_ADDREMOTEPROPERTYPAGE_ADVANCED`: `DI_FUNCTION` = 40u;
public const val `DIF_ALLOW_INSTALL`: `DI_FUNCTION` = 24u;
public const val `DIF_ASSIGNRESOURCES`: `DI_FUNCTION` = 3u;
public const val `DIF_CALCDISKSPACE`: `DI_FUNCTION` = 11u;
public const val `DIF_DESTROYPRIVATEDATA`: `DI_FUNCTION` = 12u;
public const val `DIF_DESTROYWIZARDDATA`: `DI_FUNCTION` = 17u;
public const val `DIF_DETECT`: `DI_FUNCTION` = 15u;
public const val `DIF_DETECTCANCEL`: `DI_FUNCTION` = 33u;
public const val `DIF_DETECTVERIFY`: `DI_FUNCTION` = 20u;
public const val `DIF_ENABLECLASS`: `DI_FUNCTION` = 19u;
public const val `DIF_FINISHINSTALL_ACTION`: `DI_FUNCTION` = 42u;
public const val `DIF_FIRSTTIMESETUP`: `DI_FUNCTION` = 6u;
public const val `DIF_FOUNDDEVICE`: `DI_FUNCTION` = 7u;
public const val `DIF_INSTALLCLASSDRIVERS`: `DI_FUNCTION` = 10u;
public const val `DIF_INSTALLDEVICE`: `DI_FUNCTION` = 2u;
public const val `DIF_INSTALLDEVICEFILES`: `DI_FUNCTION` = 21u;
public const val `DIF_INSTALLINTERFACES`: `DI_FUNCTION` = 32u;
public const val `DIF_INSTALLWIZARD`: `DI_FUNCTION` = 16u;
public const val `DIF_MOVEDEVICE`: `DI_FUNCTION` = 14u;
public const val `DIF_NEWDEVICEWIZARD_FINISHINSTALL`: `DI_FUNCTION` = 30u;
public const val `DIF_NEWDEVICEWIZARD_POSTANALYZE`: `DI_FUNCTION` = 29u;
public const val `DIF_NEWDEVICEWIZARD_PREANALYZE`: `DI_FUNCTION` = 28u;
public const val `DIF_NEWDEVICEWIZARD_PRESELECT`: `DI_FUNCTION` = 26u;
public const val `DIF_NEWDEVICEWIZARD_SELECT`: `DI_FUNCTION` = 27u;
public const val `DIF_POWERMESSAGEWAKE`: `DI_FUNCTION` = 39u;
public const val `DIF_PROPERTIES`: `DI_FUNCTION` = 4u;
public const val `DIF_PROPERTYCHANGE`: `DI_FUNCTION` = 18u;
public const val `DIF_REGISTERDEVICE`: `DI_FUNCTION` = 25u;
public const val `DIF_REGISTER_COINSTALLERS`: `DI_FUNCTION` = 34u;
public const val `DIF_REMOVE`: `DI_FUNCTION` = 5u;
public const val `DIF_RESERVED1`: `DI_FUNCTION` = 37u;
public const val `DIF_RESERVED2`: `DI_FUNCTION` = 48u;
public const val `DIF_SELECTBESTCOMPATDRV`: `DI_FUNCTION` = 23u;
public const val `DIF_SELECTCLASSDRIVERS`: `DI_FUNCTION` = 8u;
public const val `DIF_SELECTDEVICE`: `DI_FUNCTION` = 1u;
public const val `DIF_TROUBLESHOOTER`: `DI_FUNCTION` = 38u;
public const val `DIF_UNREMOVE`: `DI_FUNCTION` = 22u;
public const val `DIF_UNUSED1`: `DI_FUNCTION` = 31u;
public const val `DIF_UPDATEDRIVER_UI`: `DI_FUNCTION` = 41u;
public const val `DIF_VALIDATECLASSDRIVERS`: `DI_FUNCTION` = 9u;
public const val `DIF_VALIDATEDRIVER`: `DI_FUNCTION` = 13u;
public const val `DIGCDP_FLAG_ADVANCED`: UInt = 2u;
public const val `DIGCDP_FLAG_BASIC`: UInt = 1u;
public const val `DIGCDP_FLAG_REMOTE_ADVANCED`: UInt = 4u;
public const val `DIGCDP_FLAG_REMOTE_BASIC`: UInt = 3u;
public const val `DIGCF_ALLCLASSES`: `SETUP_DI_GET_CLASS_DEVS_FLAGS` = 4u;
public const val `DIGCF_DEFAULT`: `SETUP_DI_GET_CLASS_DEVS_FLAGS` = 1u;
public const val `DIGCF_DEVICEINTERFACE`: `SETUP_DI_GET_CLASS_DEVS_FLAGS` = 16u;
public const val `DIGCF_INTERFACEDEVICE`: `SETUP_DI_GET_CLASS_DEVS_FLAGS` = 16u;
public const val `DIGCF_PRESENT`: `SETUP_DI_GET_CLASS_DEVS_FLAGS` = 2u;
public const val `DIGCF_PROFILE`: `SETUP_DI_GET_CLASS_DEVS_FLAGS` = 8u;
public const val `DIIDFLAG_BITS`: `DIINSTALLDEVICE_FLAGS` = 15u;
public const val `DIIDFLAG_INSTALLCOPYINFDRIVERS`: `DIINSTALLDEVICE_FLAGS` = 8u;
public const val `DIIDFLAG_INSTALLNULLDRIVER`: `DIINSTALLDEVICE_FLAGS` = 4u;
public const val `DIIDFLAG_NOFINISHINSTALLUI`: `DIINSTALLDEVICE_FLAGS` = 2u;
public const val `DIIDFLAG_SHOWSEARCHUI`: `DIINSTALLDEVICE_FLAGS` = 1u;
public typealias `DIINSTALLDEVICE_FLAGS` = UInt;
public typealias `DIINSTALLDRIVER_FLAGS` = UInt;
public const val `DIIRFLAG_BITS`: `DIINSTALLDRIVER_FLAGS` = 106u;
public const val `DIIRFLAG_FORCE_INF`: `DIINSTALLDRIVER_FLAGS` = 2u;
public const val `DIIRFLAG_HOTPATCH`: `DIINSTALLDRIVER_FLAGS` = 8u;
public const val `DIIRFLAG_HW_USING_THE_INF`: `DIINSTALLDRIVER_FLAGS` = 4u;
public const val `DIIRFLAG_INF_ALREADY_COPIED`: `DIINSTALLDRIVER_FLAGS` = 1u;
public const val `DIIRFLAG_INSTALL_AS_SET`: `DIINSTALLDRIVER_FLAGS` = 64u;
public const val `DIIRFLAG_NOBACKUP`: `DIINSTALLDRIVER_FLAGS` = 16u;
public const val `DIIRFLAG_PRE_CONFIGURE_INF`: `DIINSTALLDRIVER_FLAGS` = 32u;
public const val `DIIRFLAG_SYSTEM_BITS`: `DIINSTALLDRIVER_FLAGS` = 127u;
public const val `DIOCR_INSTALLER`: UInt = 1u;
public const val `DIOCR_INTERFACE`: UInt = 2u;
public const val `DIODI_NO_ADD`: UInt = 1u;
public const val `DIOD_CANCEL_REMOVE`: UInt = 4u;
public const val `DIOD_INHERIT_CLASSDRVS`: UInt = 2u;
public const val `DIREG_BOTH`: UInt = 4u;
public const val `DIREG_DEV`: UInt = 1u;
public const val `DIREG_DRV`: UInt = 2u;
public const val `DIRID_ABSOLUTE`: Int = -1;
public const val `DIRID_ABSOLUTE_16BIT`: UInt = 65535u;
public const val `DIRID_APPS`: UInt = 24u;
public const val `DIRID_BOOT`: UInt = 30u;
public const val `DIRID_COLOR`: UInt = 23u;
public const val `DIRID_COMMON_APPDATA`: UInt = 16419u;
public const val `DIRID_COMMON_DESKTOPDIRECTORY`: UInt = 16409u;
public const val `DIRID_COMMON_DOCUMENTS`: UInt = 16430u;
public const val `DIRID_COMMON_FAVORITES`: UInt = 16415u;
public const val `DIRID_COMMON_PROGRAMS`: UInt = 16407u;
public const val `DIRID_COMMON_STARTMENU`: UInt = 16406u;
public const val `DIRID_COMMON_STARTUP`: UInt = 16408u;
public const val `DIRID_COMMON_TEMPLATES`: UInt = 16429u;
public const val `DIRID_DEFAULT`: UInt = 11u;
public const val `DIRID_DRIVERS`: UInt = 12u;
public const val `DIRID_DRIVER_STORE`: UInt = 13u;
public const val `DIRID_FONTS`: UInt = 20u;
public const val `DIRID_HELP`: UInt = 18u;
public const val `DIRID_INF`: UInt = 17u;
public const val `DIRID_IOSUBSYS`: UInt = 12u;
public const val `DIRID_LOADER`: UInt = 54u;
public const val `DIRID_NULL`: UInt = 0u;
public const val `DIRID_PRINTPROCESSOR`: UInt = 55u;
public const val `DIRID_PROGRAM_FILES`: UInt = 16422u;
public const val `DIRID_PROGRAM_FILES_COMMON`: UInt = 16427u;
public const val `DIRID_PROGRAM_FILES_COMMONX86`: UInt = 16428u;
public const val `DIRID_PROGRAM_FILES_X86`: UInt = 16426u;
public const val `DIRID_SHARED`: UInt = 25u;
public const val `DIRID_SPOOL`: UInt = 51u;
public const val `DIRID_SPOOLDRIVERS`: UInt = 52u;
public const val `DIRID_SRCPATH`: UInt = 1u;
public const val `DIRID_SYSTEM`: UInt = 11u;
public const val `DIRID_SYSTEM16`: UInt = 50u;
public const val `DIRID_SYSTEM_X86`: UInt = 16425u;
public const val `DIRID_USER`: UInt = 32768u;
public const val `DIRID_USERPROFILE`: UInt = 53u;
public const val `DIRID_VIEWERS`: UInt = 21u;
public const val `DIRID_WINDOWS`: UInt = 10u;
public typealias `DIROLLBACKDRIVER_FLAGS` = UInt;
public typealias `DIUNINSTALLDRIVER_FLAGS` = UInt;
public const val `DIURFLAG_NO_REMOVE_INF`: `DIUNINSTALLDRIVER_FLAGS` = 1u;
public const val `DIURFLAG_RESERVED`: `DIUNINSTALLDRIVER_FLAGS` = 2u;
public const val `DIURFLAG_VALID`: `DIUNINSTALLDRIVER_FLAGS` = 3u;
public const val `DI_AUTOASSIGNRES`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 64u;
public const val `DI_CLASSINSTALLPARAMS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 1048576u;
public const val `DI_COMPAT_FROM_CLASS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 524288u;
public const val `DI_DIDCLASS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 32u;
public const val `DI_DIDCOMPAT`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 16u;
public const val `DI_DISABLED`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 2048u;
public const val `DI_DONOTCALLCONFIGMG`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 131072u;
public const val `DI_DRIVERPAGE_ADDED`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 67108864u;
public const val `DI_ENUMSINGLEINF`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 65536u;
public const val `DI_FLAGSEX_ALLOWEXCLUDEDDRVS`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 2048u;
public const val `DI_FLAGSEX_ALTPLATFORM_DRVSEARCH`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 268435456u;
public const val `DI_FLAGSEX_ALWAYSWRITEIDS`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 512u;
public const val `DI_FLAGSEX_APPENDDRIVERLIST`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 262144u;
public const val `DI_FLAGSEX_BACKUPONREPLACE`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 1048576u;
public const val `DI_FLAGSEX_CI_FAILED`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 4u;
public const val `DI_FLAGSEX_DEVICECHANGE`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 256u;
public const val `DI_FLAGSEX_DIDCOMPATINFO`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 32u;
public const val `DI_FLAGSEX_DIDINFOLIST`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 16u;
public const val `DI_FLAGSEX_DRIVERLIST_FROM_URL`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 2097152u;
public const val `DI_FLAGSEX_EXCLUDE_OLD_INET_DRIVERS`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 8388608u;
public const val `DI_FLAGSEX_FILTERCLASSES`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 64u;
public const val `DI_FLAGSEX_FILTERSIMILARDRIVERS`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 33554432u;
public const val `DI_FLAGSEX_FINISHINSTALL_ACTION`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 8u;
public const val `DI_FLAGSEX_INET_DRIVER`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 131072u;
public const val `DI_FLAGSEX_INSTALLEDDRIVER`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 67108864u;
public const val `DI_FLAGSEX_IN_SYSTEM_SETUP`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 65536u;
public const val `DI_FLAGSEX_NOUIONQUERYREMOVE`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 4096u;
public const val `DI_FLAGSEX_NO_CLASSLIST_NODE_MERGE`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 134217728u;
public const val `DI_FLAGSEX_NO_DRVREG_MODIFY`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 32768u;
public const val `DI_FLAGSEX_POWERPAGE_ADDED`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 16777216u;
public const val `DI_FLAGSEX_PREINSTALLBACKUP`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 524288u;
public const val `DI_FLAGSEX_PROPCHANGE_PENDING`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 1024u;
public const val `DI_FLAGSEX_RECURSIVESEARCH`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 1073741824u;
public const val `DI_FLAGSEX_RESERVED1`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 4194304u;
public const val `DI_FLAGSEX_RESERVED2`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 1u;
public const val `DI_FLAGSEX_RESERVED3`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 2u;
public const val `DI_FLAGSEX_RESERVED4`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 16384u;
public const val `DI_FLAGSEX_RESTART_DEVICE_ONLY`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 536870912u;
public const val `DI_FLAGSEX_SEARCH_PUBLISHED_INFS`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 2147483648u;
public const val `DI_FLAGSEX_SETFAILEDINSTALL`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 128u;
public const val `DI_FLAGSEX_USECLASSFORCOMPAT`: `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = 8192u;
public const val `DI_FORCECOPY`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 33554432u;
public typealias `DI_FUNCTION` = UInt;
public const val `DI_GENERALPAGE_ADDED`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 4096u;
public const val `DI_INF_IS_SORTED`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 32768u;
public const val `DI_INSTALLDISABLED`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 262144u;
public const val `DI_MULTMFGS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 1024u;
public const val `DI_NEEDREBOOT`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 256u;
public const val `DI_NEEDRESTART`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 128u;
public const val `DI_NOBROWSE`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 512u;
public const val `DI_NODI_DEFAULTACTION`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 2097152u;
public const val `DI_NOFILECOPY`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 16777216u;
public const val `DI_NOSELECTICONS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 1073741824u;
public const val `DI_NOVCP`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 8u;
public const val `DI_NOWRITE_IDS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 2147483648u;
public const val `DI_OVERRIDE_INFFLAGS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 268435456u;
public const val `DI_PROPERTIES_CHANGE`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 16384u;
public const val `DI_PROPS_NOCHANGEUSAGE`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 536870912u;
public const val `DI_QUIETINSTALL`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 8388608u;
public const val `DI_REMOVEDEVICE_CONFIGSPECIFIC`: `SETUP_DI_REMOVE_DEVICE_SCOPE` = 2u;
public const val `DI_REMOVEDEVICE_GLOBAL`: `SETUP_DI_REMOVE_DEVICE_SCOPE` = 1u;
public const val `DI_RESOURCEPAGE_ADDED`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 8192u;
public const val `DI_SHOWALL`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 7u;
public const val `DI_SHOWCLASS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 4u;
public const val `DI_SHOWCOMPAT`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 2u;
public const val `DI_SHOWOEM`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 1u;
public const val `DI_UNREMOVEDEVICE_CONFIGSPECIFIC`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 2u;
public const val `DI_USECI_SELECTSTRINGS`: `SETUP_DI_DEVICE_INSTALL_FLAGS` = 134217728u;
// UNSUPPORTED Rust 1585:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DMA_DES {
//     pub DD_Count: u32,
//     pub DD_Type: u32,
//     pub DD_Flags: DD_FLAGS,
//     pub DD_Alloc_Chan: u32,
// }

// UNSUPPORTED Rust 1593:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct DMA_RANGE {
//     pub DR_Min: u32,
//     pub DR_Max: u32,
//     pub DR_Flags: DD_FLAGS,
// }

// UNSUPPORTED Rust 1600:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct DMA_RESOURCE {
//     pub DMA_Header: DMA_DES,
//     pub DMA_Data: [DMA_RANGE; 1],
// }

// UNSUPPORTED Rust 1606:1: declaration Impl has no candidate rule
// impl Default for DMA_RESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DMI_BKCOLOR`: UInt = 2u;
public const val `DMI_MASK`: UInt = 1u;
public const val `DMI_USERECT`: UInt = 4u;
public const val `DNF_ALWAYSEXCLUDEFROMLIST`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 524288u;
public const val `DNF_AUTHENTICODE_SIGNED`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 131072u;
public const val `DNF_BAD_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 2048u;
public const val `DNF_BASIC_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 65536u;
public const val `DNF_CLASS_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 32u;
public const val `DNF_COMPATIBLE_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 64u;
public const val `DNF_DUPDESC`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 1u;
public const val `DNF_DUPDRIVERVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 32768u;
public const val `DNF_DUPPROVIDER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 4096u;
public const val `DNF_EXCLUDEFROMLIST`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 4u;
public const val `DNF_INBOX_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 1048576u;
public const val `DNF_INET_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 128u;
public const val `DNF_INF_IS_SIGNED`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 8192u;
public const val `DNF_INSTALLEDDRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 262144u;
public const val `DNF_LEGACYINF`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 16u;
public const val `DNF_NODRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 8u;
public const val `DNF_OEM_F6_INF`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 16384u;
public const val `DNF_OLDDRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 2u;
public const val `DNF_OLD_INET_DRIVER`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 1024u;
public const val `DNF_REQUESTADDITIONALSOFTWARE`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 2097152u;
public const val `DNF_UNUSED1`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 256u;
public const val `DNF_UNUSED2`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 512u;
public const val `DNF_UNUSED_22`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 4194304u;
public const val `DNF_UNUSED_23`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 8388608u;
public const val `DNF_UNUSED_24`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 16777216u;
public const val `DNF_UNUSED_25`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 33554432u;
public const val `DNF_UNUSED_26`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 67108864u;
public const val `DNF_UNUSED_27`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 134217728u;
public const val `DNF_UNUSED_28`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 268435456u;
public const val `DNF_UNUSED_29`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 536870912u;
public const val `DNF_UNUSED_30`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 1073741824u;
public const val `DNF_UNUSED_31`: `SETUP_DI_DRIVER_INSTALL_FLAGS` = 2147483648u;
public const val `DN_APM_DRIVER`: `CM_DEVNODE_STATUS_FLAGS` = 268435456u;
public const val `DN_APM_ENUMERATOR`: `CM_DEVNODE_STATUS_FLAGS` = 134217728u;
public const val `DN_ARM_WAKEUP`: `CM_DEVNODE_STATUS_FLAGS` = 67108864u;
public const val `DN_BAD_PARTIAL`: `CM_DEVNODE_STATUS_FLAGS` = 4194304u;
public const val `DN_BOOT_LOG_PROB`: `CM_DEVNODE_STATUS_FLAGS` = 2147483648u;
public const val `DN_CHANGEABLE_FLAGS`: `CM_DEVNODE_STATUS_FLAGS` = 1639670464u;
public const val `DN_CHILD_WITH_INVALID_ID`: `CM_DEVNODE_STATUS_FLAGS` = 512u;
public const val `DN_DEVICE_DISCONNECTED`: `CM_DEVNODE_STATUS_FLAGS` = 33554432u;
public const val `DN_DISABLEABLE`: `CM_DEVNODE_STATUS_FLAGS` = 8192u;
public const val `DN_DRIVER_BLOCKED`: `CM_DEVNODE_STATUS_FLAGS` = 64u;
public const val `DN_DRIVER_LOADED`: `CM_DEVNODE_STATUS_FLAGS` = 2u;
public const val `DN_ENUM_LOADED`: `CM_DEVNODE_STATUS_FLAGS` = 4u;
public const val `DN_FILTERED`: `CM_DEVNODE_STATUS_FLAGS` = 2048u;
public const val `DN_HARDWARE_ENUM`: `CM_DEVNODE_STATUS_FLAGS` = 128u;
public const val `DN_HAS_MARK`: `CM_DEVNODE_STATUS_FLAGS` = 512u;
public const val `DN_HAS_PROBLEM`: `CM_DEVNODE_STATUS_FLAGS` = 1024u;
public const val `DN_LEGACY_DRIVER`: `CM_DEVNODE_STATUS_FLAGS` = 4096u;
public const val `DN_LIAR`: `CM_DEVNODE_STATUS_FLAGS` = 256u;
public const val `DN_MANUAL`: `CM_DEVNODE_STATUS_FLAGS` = 16u;
public const val `DN_MF_CHILD`: `CM_DEVNODE_STATUS_FLAGS` = 131072u;
public const val `DN_MF_PARENT`: `CM_DEVNODE_STATUS_FLAGS` = 65536u;
public const val `DN_MOVED`: `CM_DEVNODE_STATUS_FLAGS` = 4096u;
public const val `DN_NEEDS_LOCKING`: `CM_DEVNODE_STATUS_FLAGS` = 33554432u;
public const val `DN_NEED_RESTART`: `CM_DEVNODE_STATUS_FLAGS` = 256u;
public const val `DN_NEED_TO_ENUM`: `CM_DEVNODE_STATUS_FLAGS` = 32u;
public const val `DN_NOT_FIRST_TIME`: `CM_DEVNODE_STATUS_FLAGS` = 64u;
public const val `DN_NOT_FIRST_TIMEE`: `CM_DEVNODE_STATUS_FLAGS` = 524288u;
public const val `DN_NO_SHOW_IN_DM`: `CM_DEVNODE_STATUS_FLAGS` = 1073741824u;
public const val `DN_NT_DRIVER`: `CM_DEVNODE_STATUS_FLAGS` = 16777216u;
public const val `DN_NT_ENUMERATOR`: `CM_DEVNODE_STATUS_FLAGS` = 8388608u;
public const val `DN_PRIVATE_PROBLEM`: `CM_DEVNODE_STATUS_FLAGS` = 32768u;
public const val `DN_QUERY_REMOVE_ACTIVE`: `CM_DEVNODE_STATUS_FLAGS` = 131072u;
public const val `DN_QUERY_REMOVE_PENDING`: `CM_DEVNODE_STATUS_FLAGS` = 65536u;
public const val `DN_REBAL_CANDIDATE`: `CM_DEVNODE_STATUS_FLAGS` = 2097152u;
public const val `DN_REMOVABLE`: `CM_DEVNODE_STATUS_FLAGS` = 16384u;
public const val `DN_ROOT_ENUMERATED`: `CM_DEVNODE_STATUS_FLAGS` = 1u;
public const val `DN_SILENT_INSTALL`: `CM_DEVNODE_STATUS_FLAGS` = 536870912u;
public const val `DN_STARTED`: `CM_DEVNODE_STATUS_FLAGS` = 8u;
public const val `DN_STOP_FREE_RES`: `CM_DEVNODE_STATUS_FLAGS` = 1048576u;
public const val `DN_WILL_BE_REMOVED`: `CM_DEVNODE_STATUS_FLAGS` = 262144u;
public const val `DPROMPT_BUFFERTOOSMALL`: UInt = 3u;
public const val `DPROMPT_CANCEL`: UInt = 1u;
public const val `DPROMPT_OUTOFMEMORY`: UInt = 4u;
public const val `DPROMPT_SKIPFILE`: UInt = 2u;
public const val `DPROMPT_SUCCESS`: UInt = 0u;
public const val `DRIVER_COMPATID_RANK`: UInt = 16383u;
public const val `DRIVER_HARDWAREID_MASK`: UInt = 2147487743u;
public const val `DRIVER_HARDWAREID_RANK`: UInt = 4095u;
public const val `DRIVER_UNTRUSTED_COMPATID_RANK`: UInt = 49151u;
public const val `DRIVER_UNTRUSTED_HARDWAREID_RANK`: UInt = 36863u;
public const val `DRIVER_UNTRUSTED_RANK`: UInt = 2147483648u;
public const val `DRIVER_W9X_SUSPECT_COMPATID_RANK`: UInt = 65535u;
public const val `DRIVER_W9X_SUSPECT_HARDWAREID_RANK`: UInt = 53247u;
public const val `DRIVER_W9X_SUSPECT_RANK`: UInt = 3221225472u;
public const val `DWORD_MAX`: UInt = 4294967295u;
public const val `DYNAWIZ_FLAG_ANALYZE_HANDLECONFLICT`: UInt = 8u;
public const val `DYNAWIZ_FLAG_INSTALLDET_NEXT`: UInt = 2u;
public const val `DYNAWIZ_FLAG_INSTALLDET_PREV`: UInt = 4u;
public const val `DYNAWIZ_FLAG_PAGESADDED`: UInt = 1u;
public const val `ENABLECLASS_FAILURE`: UInt = 2u;
public const val `ENABLECLASS_QUERY`: UInt = 0u;
public const val `ENABLECLASS_SUCCESS`: UInt = 1u;
public const val `FILEOP_ABORT`: UInt = 0u;
public const val `FILEOP_BACKUP`: UInt = 3u;
public const val `FILEOP_COPY`: `SETUP_FILE_OPERATION` = 0u;
public const val `FILEOP_DELETE`: `SETUP_FILE_OPERATION` = 2u;
public const val `FILEOP_DOIT`: UInt = 1u;
public const val `FILEOP_NEWPATH`: UInt = 4u;
public const val `FILEOP_RENAME`: UInt = 1u;
public const val `FILEOP_RETRY`: UInt = 1u;
public const val `FILEOP_SKIP`: UInt = 2u;
// UNSUPPORTED Rust 1717:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_A {
//     pub Target: windows_sys::core::PCSTR,
//     pub Source: windows_sys::core::PCSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1726:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FILEPATHS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1732:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_A {
//     pub Target: windows_sys::core::PCSTR,
//     pub Source: windows_sys::core::PCSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1741:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FILEPATHS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1747:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_SIGNERINFO_A {
//     pub Target: windows_sys::core::PCSTR,
//     pub Source: windows_sys::core::PCSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
//     pub DigitalSigner: windows_sys::core::PCSTR,
//     pub Version: windows_sys::core::PCSTR,
//     pub CatalogFile: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 1759:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FILEPATHS_SIGNERINFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1765:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_SIGNERINFO_A {
//     pub Target: windows_sys::core::PCSTR,
//     pub Source: windows_sys::core::PCSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
//     pub DigitalSigner: windows_sys::core::PCSTR,
//     pub Version: windows_sys::core::PCSTR,
//     pub CatalogFile: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 1777:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FILEPATHS_SIGNERINFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1783:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_SIGNERINFO_W {
//     pub Target: windows_sys::core::PCWSTR,
//     pub Source: windows_sys::core::PCWSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
//     pub DigitalSigner: windows_sys::core::PCWSTR,
//     pub Version: windows_sys::core::PCWSTR,
//     pub CatalogFile: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1795:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FILEPATHS_SIGNERINFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1801:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_SIGNERINFO_W {
//     pub Target: windows_sys::core::PCWSTR,
//     pub Source: windows_sys::core::PCWSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
//     pub DigitalSigner: windows_sys::core::PCWSTR,
//     pub Version: windows_sys::core::PCWSTR,
//     pub CatalogFile: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 1813:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FILEPATHS_SIGNERINFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1819:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_W {
//     pub Target: windows_sys::core::PCWSTR,
//     pub Source: windows_sys::core::PCWSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1828:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FILEPATHS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1834:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FILEPATHS_W {
//     pub Target: windows_sys::core::PCWSTR,
//     pub Source: windows_sys::core::PCWSTR,
//     pub Win32Error: u32,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 1843:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FILEPATHS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILE_COMPRESSION_MSZIP`: `FILE_COMPRESSION_TYPE` = 2u;
public const val `FILE_COMPRESSION_NONE`: `FILE_COMPRESSION_TYPE` = 0u;
public const val `FILE_COMPRESSION_NTCAB`: `FILE_COMPRESSION_TYPE` = 3u;
public typealias `FILE_COMPRESSION_TYPE` = UInt;
public const val `FILE_COMPRESSION_WINLZA`: `FILE_COMPRESSION_TYPE` = 1u;
// UNSUPPORTED Rust 1854:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FILE_IN_CABINET_INFO_A {
//     pub NameInCabinet: windows_sys::core::PCSTR,
//     pub FileSize: u32,
//     pub Win32Error: u32,
//     pub DosDate: u16,
//     pub DosTime: u16,
//     pub DosAttribs: u16,
//     pub FullTargetName: [i8; 260],
// }

// UNSUPPORTED Rust 1866:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FILE_IN_CABINET_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1872:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FILE_IN_CABINET_INFO_A {
//     pub NameInCabinet: windows_sys::core::PCSTR,
//     pub FileSize: u32,
//     pub Win32Error: u32,
//     pub DosDate: u16,
//     pub DosTime: u16,
//     pub DosAttribs: u16,
//     pub FullTargetName: [i8; 260],
// }

// UNSUPPORTED Rust 1884:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FILE_IN_CABINET_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1890:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FILE_IN_CABINET_INFO_W {
//     pub NameInCabinet: windows_sys::core::PCWSTR,
//     pub FileSize: u32,
//     pub Win32Error: u32,
//     pub DosDate: u16,
//     pub DosTime: u16,
//     pub DosAttribs: u16,
//     pub FullTargetName: [u16; 260],
// }

// UNSUPPORTED Rust 1902:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FILE_IN_CABINET_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1908:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FILE_IN_CABINET_INFO_W {
//     pub NameInCabinet: windows_sys::core::PCWSTR,
//     pub FileSize: u32,
//     pub Win32Error: u32,
//     pub DosDate: u16,
//     pub DosTime: u16,
//     pub DosAttribs: u16,
//     pub FullTargetName: [u16; 260],
// }

// UNSUPPORTED Rust 1920:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FILE_IN_CABINET_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILTERED_LOG_CONF`: `CM_LOG_CONF` = 1u;
public const val `FLG_ADDPROPERTY_AND`: UInt = 16u;
public const val `FLG_ADDPROPERTY_APPEND`: UInt = 4u;
public const val `FLG_ADDPROPERTY_NOCLOBBER`: UInt = 1u;
public const val `FLG_ADDPROPERTY_OR`: UInt = 8u;
public const val `FLG_ADDPROPERTY_OVERWRITEONLY`: UInt = 2u;
public const val `FLG_ADDREG_32BITKEY`: UInt = 16384u;
public const val `FLG_ADDREG_64BITKEY`: UInt = 4096u;
public const val `FLG_ADDREG_APPEND`: UInt = 8u;
public const val `FLG_ADDREG_BINVALUETYPE`: UInt = 1u;
public const val `FLG_ADDREG_DELREG_BIT`: UInt = 32768u;
public const val `FLG_ADDREG_DELVAL`: UInt = 4u;
public const val `FLG_ADDREG_KEYONLY`: UInt = 16u;
public const val `FLG_ADDREG_KEYONLY_COMMON`: UInt = 8192u;
public const val `FLG_ADDREG_NOCLOBBER`: UInt = 2u;
public const val `FLG_ADDREG_OVERWRITEONLY`: UInt = 32u;
public const val `FLG_ADDREG_TYPE_EXPAND_SZ`: UInt = 131072u;
public const val `FLG_ADDREG_TYPE_MULTI_SZ`: UInt = 65536u;
public const val `FLG_ADDREG_TYPE_SZ`: UInt = 0u;
public const val `FLG_BITREG_32BITKEY`: UInt = 16384u;
public const val `FLG_BITREG_64BITKEY`: UInt = 4096u;
public const val `FLG_BITREG_CLEARBITS`: UInt = 0u;
public const val `FLG_BITREG_SETBITS`: UInt = 1u;
public const val `FLG_DELPROPERTY_MULTI_SZ_DELSTRING`: UInt = 1u;
public const val `FLG_DELREG_32BITKEY`: UInt = 16384u;
public const val `FLG_DELREG_64BITKEY`: UInt = 4096u;
public const val `FLG_DELREG_KEYONLY_COMMON`: UInt = 8192u;
public const val `FLG_DELREG_OPERATION_MASK`: UInt = 254u;
public const val `FLG_DELREG_TYPE_EXPAND_SZ`: UInt = 131072u;
public const val `FLG_DELREG_TYPE_MULTI_SZ`: UInt = 65536u;
public const val `FLG_DELREG_TYPE_SZ`: UInt = 0u;
public const val `FLG_DELREG_VALUE`: UInt = 0u;
public const val `FLG_INI2REG_32BITKEY`: UInt = 16384u;
public const val `FLG_INI2REG_64BITKEY`: UInt = 4096u;
public const val `FLG_PROFITEM_CSIDL`: UInt = 8u;
public const val `FLG_PROFITEM_CURRENTUSER`: UInt = 1u;
public const val `FLG_PROFITEM_DELETE`: UInt = 2u;
public const val `FLG_PROFITEM_GROUP`: UInt = 4u;
public const val `FLG_REGSVR_DLLINSTALL`: UInt = 2u;
public const val `FLG_REGSVR_DLLREGISTER`: UInt = 1u;
public const val `FORCED_LOG_CONF`: `CM_LOG_CONF` = 4u;
// UNSUPPORTED Rust 1967:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ACPI_CMOS_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a8d0384_6505_40ca_bc39_56c15f8c5fed);

// UNSUPPORTED Rust 1968:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ACPI_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb091a08a_ba97_11d0_bd14_00aa00b7b32a);

// UNSUPPORTED Rust 1969:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ACPI_INTERFACE_STANDARD2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8695f63_1831_4870_a8cf_9c2f03f9dcb5);

// UNSUPPORTED Rust 1970:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ACPI_PORT_RANGES_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf14f609b_cbbd_4957_a674_bc00213f1c97);

// UNSUPPORTED Rust 1971:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ACPI_REGS_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06141966_7245_6369_462e_4e656c736f6e);

// UNSUPPORTED Rust 1972:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_AGP_TARGET_BUS_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb15cfce8_06d1_4d37_9d4c_bedde0c2a6ff);

// UNSUPPORTED Rust 1973:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_ARBITER_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe644f185_8c0e_11d0_becf_08002be2092f);

// UNSUPPORTED Rust 1974:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x496b8280_6f25_11d0_beaf_08002be2092f);

// UNSUPPORTED Rust 1975:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_RESOURCE_UPDATE_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x27d0102d_bfb2_4164_81dd_dbb82f968b48);

// UNSUPPORTED Rust 1976:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_1394: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf74e73eb_9ac5_45eb_be4d_772cc71ddfb3);

// UNSUPPORTED Rust 1977:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_ACPI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd7b46895_001a_4942_891f_a7d46610a843);

// UNSUPPORTED Rust 1978:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_AVC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc06ff265_ae09_48f0_812c_16753d7cba83);

// UNSUPPORTED Rust 1979:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_DOT4PRT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x441ee001_4342_11d5_a184_00c04f60524d);

// UNSUPPORTED Rust 1980:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_EISA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xddc35509_f3fc_11d0_a537_0000f8753ed1);

// UNSUPPORTED Rust 1981:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_HID: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeeaf37d0_1963_47c4_aa48_72476db7cf49);

// UNSUPPORTED Rust 1982:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_INTERNAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1530ea73_086b_11d1_a09f_00c04fc340b1);

// UNSUPPORTED Rust 1983:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_IRDA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ae17dc1_c944_44d6_881f_4c2e61053bc1);

// UNSUPPORTED Rust 1984:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_ISAPNP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe676f854_d87d_11d0_92b2_00a0c9055fc5);

// UNSUPPORTED Rust 1985:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_LPTENUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc4ca1000_2ddc_11d5_a17a_00c04f60524d);

// UNSUPPORTED Rust 1986:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_MCA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c75997a_dc33_11d0_92b2_00a0c9055fc5);

// UNSUPPORTED Rust 1987:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_PCI: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc8ebdfb0_b510_11d0_80e5_00a0c92542e3);

// UNSUPPORTED Rust 1988:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_PCMCIA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x09343630_af9f_11d0_92e9_0000f81e1b30);

// UNSUPPORTED Rust 1989:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_SCM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x375a5912_804c_45aa_bdc2_fdd25a1d9512);

// UNSUPPORTED Rust 1990:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_SD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe700cc04_4036_4e89_9579_89ebf45f00cd);

// UNSUPPORTED Rust 1991:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_SERENUM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x77114a87_8944_11d1_bd90_00a0c906be2d);

// UNSUPPORTED Rust 1992:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_SW_DEVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06d10322_7de0_4cef_8e25_197d0e7442e2);

// UNSUPPORTED Rust 1993:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_USB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9d7debbc_c85d_11d1_9eb4_006008c3a19a);

// UNSUPPORTED Rust 1994:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_BUS_TYPE_USBPRINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x441ee000_4342_11d5_a184_00c04f60524d);

// UNSUPPORTED Rust 1995:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_D3COLD_AUX_POWER_AND_TIMING_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0044d8aa_f664_4588_9ffc_2afeaf5950b9);

// UNSUPPORTED Rust 1996:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_D3COLD_SUPPORT_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb38290e5_3cd0_4f9d_9937_f5fe2b44d47a);

// UNSUPPORTED Rust 1997:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_1394: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bdd1fc1_810f_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 1998:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_1394DEBUG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66f250d6_7801_4a64_b139_eea80a450b24);

// UNSUPPORTED Rust 1999:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_61883: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7ebefbc0_3200_11d2_b4c2_00a0c9697d07);

// UNSUPPORTED Rust 2000:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_ADAPTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e964_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2001:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_APMSUPPORT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd45b1c18_c8fa_11d1_9f77_0000f805f530);

// UNSUPPORTED Rust 2002:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_AVC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc06ff265_ae09_48f0_812c_16753d7cba83);

// UNSUPPORTED Rust 2003:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_BATTERY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x72631e54_78a4_11d0_bcf7_00aa00b7b32a);

// UNSUPPORTED Rust 2004:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_BIOMETRIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53d29ef7_377c_4d14_864b_eb3a85769359);

// UNSUPPORTED Rust 2005:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_BLUETOOTH: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe0cbf06c_cd8b_4647_bb8a_263b43f0f974);

// UNSUPPORTED Rust 2006:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_CAMERA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xca3e7ab9_b4c3_4ae6_8251_579ef933890f);

// UNSUPPORTED Rust 2007:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_CDROM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e965_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2008:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_COMPUTEACCELERATOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf01a9d53_3ff6_48d2_9f97_c8a7004be10c);

// UNSUPPORTED Rust 2009:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_COMPUTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e966_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2010:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_DECODER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bdd1fc2_810f_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 2011:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_DISKDRIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e967_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2012:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_DISPLAY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e968_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2013:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_DOT4: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48721b56_6795_11d2_b1a8_0080c72e74a2);

// UNSUPPORTED Rust 2014:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_DOT4PRINT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49ce6ac8_6f86_11d2_b1e5_0080c72e74a2);

// UNSUPPORTED Rust 2015:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_EHSTORAGESILO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9da2b80f_f89f_4a49_a5c2_511b085b9e8a);

// UNSUPPORTED Rust 2016:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_ENUM1394: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc459df55_db08_11d1_b009_00a0c9081ff6);

// UNSUPPORTED Rust 2017:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_EXTENSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2f84ce7_8efa_411c_aa69_97454ca4cb57);

// UNSUPPORTED Rust 2018:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FDC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e969_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2019:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FIRMWARE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e7dd72_6468_4e36_b6f1_6488f42c1b52);

// UNSUPPORTED Rust 2020:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FLOPPYDISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e980_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2021:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_ACTIVITYMONITOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb86dff51_a31e_4bac_b3cf_e8cfe75c9fc2);

// UNSUPPORTED Rust 2022:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_ANTIVIRUS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb1d1a169_c54f_4379_81db_bee7d88d7454);

// UNSUPPORTED Rust 2023:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_BOTTOM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37765ea0_5958_4fc9_b04b_2fdfef97e59e);

// UNSUPPORTED Rust 2024:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_CFSMETADATASERVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcdcf0939_b75b_4630_bf76_80f7ba655884);

// UNSUPPORTED Rust 2025:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_COMPRESSION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf3586baf_b5aa_49b5_8d6c_0569284c639f);

// UNSUPPORTED Rust 2026:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_CONTENTSCREENER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3e3f0674_c83c_4558_bb26_9820e1eba5c5);

// UNSUPPORTED Rust 2027:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_CONTINUOUSBACKUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71aa14f8_6fad_4622_ad77_92bb9d7e6947);

// UNSUPPORTED Rust 2028:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_COPYPROTECTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x89786ff1_9c12_402f_9c9e_17753c7f4375);

// UNSUPPORTED Rust 2029:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_ENCRYPTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa0a701c0_a511_42ff_aa6c_06dc0395576f);

// UNSUPPORTED Rust 2030:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_HSM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd546500a_2aeb_45f6_9482_f4b1799c3177);

// UNSUPPORTED Rust 2031:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_INFRASTRUCTURE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe55fa6f9_128c_4d04_abab_630c74b1453a);

// UNSUPPORTED Rust 2032:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_OPENFILEBACKUP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf8ecafa6_66d1_41a5_899b_66585d7216b7);

// UNSUPPORTED Rust 2033:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_PHYSICALQUOTAMANAGEMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6a0a8e78_bba6_4fc4_a709_1e33cd09d67e);

// UNSUPPORTED Rust 2034:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_QUOTAMANAGEMENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8503c911_a6c7_4919_8f79_5028f5866b0c);

// UNSUPPORTED Rust 2035:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_REPLICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x48d3ebc4_4cf8_48ff_b869_9c68ad42eb9f);

// UNSUPPORTED Rust 2036:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_SECURITYENHANCER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd02bc3da_0c8e_4945_9bd5_f1883c226c8c);

// UNSUPPORTED Rust 2037:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_SYSTEM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5d1b9aaa_01e2_46af_849f_272b3f324c46);

// UNSUPPORTED Rust 2038:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_SYSTEMRECOVERY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2db15374_706e_4131_a0c7_d7c78eb0289a);

// UNSUPPORTED Rust 2039:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_TOP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb369baf4_5568_4e82_a87e_a93eb16bca87);

// UNSUPPORTED Rust 2040:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_UNDELETE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfe8f1572_c67a_48c0_bbac_0b5c6d66cafb);

// UNSUPPORTED Rust 2041:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_FSFILTER_VIRTUALIZATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf75a86c0_10d8_4c3a_b233_ed60e4cdfaac);

// UNSUPPORTED Rust 2042:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_GENERIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xff494df1_c4ed_4fac_9b3f_3786f6e91e7e);

// UNSUPPORTED Rust 2043:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_GPS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bdd1fc3_810f_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 2044:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_HDC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96a_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2045:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_HIDCLASS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x745a17a0_74d3_11d0_b6fe_00a0c90f57da);

// UNSUPPORTED Rust 2046:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_HOLOGRAPHIC: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd612553d_06b1_49ca_8938_e39ef80eb16f);

// UNSUPPORTED Rust 2047:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_IMAGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bdd1fc6_810f_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 2048:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_INFINIBAND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x30ef7132_d858_4a0c_ac24_b9028a5cca3f);

// UNSUPPORTED Rust 2049:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_INFRARED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6bdd1fc5_810f_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 2050:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_KEYBOARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96b_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2051:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_LEGACYDRIVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8ecc055d_047f_11d1_a537_0000f8753ed1);

// UNSUPPORTED Rust 2052:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MEDIA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96c_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2053:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MEDIUM_CHANGER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce5939ae_ebde_11d0_b181_0000f8753ec4);

// UNSUPPORTED Rust 2054:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MEMORY: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5099944a_f6b9_4057_a056_8c550228544c);

// UNSUPPORTED Rust 2055:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MODEM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96d_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2056:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MONITOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96e_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2057:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MOUSE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e96f_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2058:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MTD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e970_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2059:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MULTIFUNCTION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e971_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2060:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_MULTIPORTSERIAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50906cb8_ba12_11d1_bf5d_0000f805f530);

// UNSUPPORTED Rust 2061:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NET: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e972_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2062:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NETCLIENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e973_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2063:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NETDRIVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x87ef9ad1_8f70_49ee_b215_ab1fcadcbe3c);

// UNSUPPORTED Rust 2064:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NETSERVICE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e974_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2065:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NETTRANS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e975_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2066:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NETUIO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x78912bc1_cb8e_4b28_a329_f322ebadbe0f);

// UNSUPPORTED Rust 2067:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_NODRIVER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e976_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2068:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PCMCIA: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e977_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2069:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PNPPRINTERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4658ee7e_f050_11d1_b6bd_00c04fa372a7);

// UNSUPPORTED Rust 2070:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PORTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e978_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2071:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PRIMITIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x242681d1_eed3_41d2_a1ef_1468fc843106);

// UNSUPPORTED Rust 2072:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PRINTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e979_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2073:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PRINTERUPGRADE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e97a_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2074:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PRINTQUEUE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1ed2bbf9_11f0_4084_b21f_ad83a8e6dcdc);

// UNSUPPORTED Rust 2075:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_PROCESSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50127dc3_0f36_415e_a6cc_4cb3be910b65);

// UNSUPPORTED Rust 2076:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SBP2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd48179be_ec20_11d1_b6b8_00c04fa372a7);

// UNSUPPORTED Rust 2077:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SCMDISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53966cb1_4d46_4166_bf23_c522403cd495);

// UNSUPPORTED Rust 2078:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SCMVOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53ccb149_e543_4c84_b6e0_bce4f6b7e806);

// UNSUPPORTED Rust 2079:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SCSIADAPTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e97b_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2080:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SECURITYACCELERATOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x268c95a1_edfe_11d3_95c3_0010dc4050a5);

// UNSUPPORTED Rust 2081:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SENSOR: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5175d334_c371_4806_b3ba_71fd53c9258d);

// UNSUPPORTED Rust 2082:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SIDESHOW: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x997b5d8d_c442_4f2e_baf3_9c8e671e9e21);

// UNSUPPORTED Rust 2083:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SMARTCARDREADER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50dd5230_ba8a_11d1_bf5d_0000f805f530);

// UNSUPPORTED Rust 2084:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SMRDISK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53487c23_680f_4585_acc3_1f10d6777e82);

// UNSUPPORTED Rust 2085:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SMRVOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53b3cf03_8f5a_4788_91b6_d19ed9fcccbf);

// UNSUPPORTED Rust 2086:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SOFTWARECOMPONENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5c4c3332_344d_483c_8739_259e934c9cc8);

// UNSUPPORTED Rust 2087:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SOUND: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e97c_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2088:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_SYSTEM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e97d_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2089:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_TAPEDRIVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d807884_7d21_11cf_801c_08002be10318);

// UNSUPPORTED Rust 2090:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_UCM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe6f1aa1c_7f3b_4473_b2e8_c97d8ac71d53);

// UNSUPPORTED Rust 2091:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_UNKNOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d36e97e_e325_11ce_bfc1_08002be10318);

// UNSUPPORTED Rust 2092:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_USB: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36fc9e60_c465_11cf_8056_444553540000);

// UNSUPPORTED Rust 2093:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_VOLUME: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x71a27cdd_812a_11d0_bec7_08002be2092f);

// UNSUPPORTED Rust 2094:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_VOLUMESNAPSHOT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x533c5b84_ec70_11d2_9505_00c04f79deaf);

// UNSUPPORTED Rust 2095:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_WCEUSBS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25dbce51_6c8f_4a72_8a6d_b54c2b4fc835);

// UNSUPPORTED Rust 2096:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVCLASS_WPD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xeec5ad98_8080_425f_922a_dabf3de3f69a);

// UNSUPPORTED Rust 2097:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVICE_INTERFACE_ARRIVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4004_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2098:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVICE_INTERFACE_REMOVAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4005_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2099:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DEVICE_RESET_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x649fdf26_3bc0_4813_ad24_7e0c1eda3fa3);

// UNSUPPORTED Rust 2100:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_DMA_CACHE_COHERENCY_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb520f7fa_8a5a_4e40_a3f6_6be1e162d935);

// UNSUPPORTED Rust 2101:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_HWPROFILE_CHANGE_CANCELLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4002_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2102:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_HWPROFILE_CHANGE_COMPLETE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4003_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2103:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_HWPROFILE_QUERY_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4001_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2104:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_INT_ROUTE_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70941bf4_0073_11d1_a09e_00c04fc340b1);

// UNSUPPORTED Rust 2105:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_IOMMU_BUS_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1efee0b2_d278_4ae4_bddc_1b34dd648043);

// UNSUPPORTED Rust 2106:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_KERNEL_SOFT_RESTART_CANCEL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x31d737e7_8c0b_468a_956e_9f433ec358fb);

// UNSUPPORTED Rust 2107:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_KERNEL_SOFT_RESTART_FINALIZE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x20e91abd_350a_4d4f_8577_99c81507473a);

// UNSUPPORTED Rust 2108:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_KERNEL_SOFT_RESTART_PREPARE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde373def_a85c_4f76_8cbf_f96bea8bd10f);

// UNSUPPORTED Rust 2109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_LEGACY_DEVICE_DETECTION_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50feb0de_596a_11d2_a5b8_0000f81a4619);

// UNSUPPORTED Rust 2110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_MF_ENUMERATION_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaeb895f0_5586_11d1_8d84_00a0c906b244);

// UNSUPPORTED Rust 2111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_MSIX_TABLE_CONFIG_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1a6a460b_194f_455d_b34b_b84c5b05712b);

// UNSUPPORTED Rust 2112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_NPEM_CONTROL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4d95573d_b774_488a_b120_4f284a9eff51);

// UNSUPPORTED Rust 2113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PARTITION_UNIT_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x52363f5b_d891_429b_8195_aec5fef6853c);

// UNSUPPORTED Rust 2114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCC_INTERFACE_INTERNAL: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7cce62ce_c189_4814_a6a7_12112089e938);

// UNSUPPORTED Rust 2115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCC_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ee8ba63_0f59_4a24_8a45_35808bdd1249);

// UNSUPPORTED Rust 2116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_ATS_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x010a7fe8_96f5_4943_bedf_95e651b93412);

// UNSUPPORTED Rust 2117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_BUS_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x496b8281_6f25_11d0_beaf_08002be2092f);

// UNSUPPORTED Rust 2118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_BUS_INTERFACE_STANDARD2: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde94e966_fdff_4c9c_9998_6747b150e74c);

// UNSUPPORTED Rust 2119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_DEVICE_PRESENT_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd1b82c26_bf49_45ef_b216_71cbd7889b57);

// UNSUPPORTED Rust 2120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_EXPRESS_LINK_QUIESCENT_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x146cd41c_dae3_4437_8aff_2af3f038099b);

// UNSUPPORTED Rust 2121:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_EXPRESS_ROOT_PORT_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x83a7734a_84c7_4161_9a98_6000ed0c4a33);

// UNSUPPORTED Rust 2122:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_FPGA_CONTROL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2df3f7a8_b9b3_4063_9215_b5d14a0b266e);

// UNSUPPORTED Rust 2123:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_PTM_CONTROL_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x348a5ebb_ba24_44b7_9916_285687735117);

// UNSUPPORTED Rust 2124:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_SECURITY_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6e7f1451_199e_4acc_ba2d_762b4edf4674);

// UNSUPPORTED Rust 2125:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCI_VIRTUALIZATION_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x64897b47_3a4a_4d75_bc74_89dd6c078293);

// UNSUPPORTED Rust 2126:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PCMCIA_BUS_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x76173af0_c504_11d1_947f_00c04fb960ee);

// UNSUPPORTED Rust 2127:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PNP_CUSTOM_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaca73f8e_8d23_11d1_ac7d_0000f87571d0);

// UNSUPPORTED Rust 2128:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PNP_EXTENDED_ADDRESS_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb8e992ec_a797_4dc4_8846_84d041707446);

// UNSUPPORTED Rust 2129:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PNP_LOCATION_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70211b0e_0afb_47db_afc1_410bf842497a);

// UNSUPPORTED Rust 2130:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PNP_POWER_NOTIFICATION: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc2cf0660_eb7a_11d1_bd7f_0000f87571d0);

// UNSUPPORTED Rust 2131:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PNP_POWER_SETTING_CHANGE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x29c69b3e_c79a_43bf_bbde_a932fa1bea7e);

// UNSUPPORTED Rust 2132:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_POWER_DEVICE_ENABLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x827c0a6f_feb0_11d0_bd26_00aa00b7b32a);

// UNSUPPORTED Rust 2133:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_POWER_DEVICE_TIMEOUTS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa45da735_feb0_11d0_bd26_00aa00b7b32a);

// UNSUPPORTED Rust 2134:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_POWER_DEVICE_WAKE_ENABLE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9546a82_feb0_11d0_bd26_00aa00b7b32a);

// UNSUPPORTED Rust 2135:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_PROCESSOR_PCC_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x37b17e9a_c21c_4296_972d_11c4b32b28f0);

// UNSUPPORTED Rust 2136:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_QUERY_CRASHDUMP_FUNCTIONS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9cc6b8ff_32e2_4834_b1de_b32ef8880a4b);

// UNSUPPORTED Rust 2137:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_RECOVERY_NVMED_PREPARE_SHUTDOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4b9770ea_bde7_400b_a9b9_4f684f54cc2a);

// UNSUPPORTED Rust 2138:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_RECOVERY_PCI_PREPARE_SHUTDOWN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90d889de_8704_44cf_8115_ed8528d2b2da);

// UNSUPPORTED Rust 2139:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_REENUMERATE_SELF_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x2aeb0243_6a6e_486b_82fc_d815f6b97006);

// UNSUPPORTED Rust 2140:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_SCM_BUS_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x25944783_ce79_4232_815e_4a30014e8eb4);

// UNSUPPORTED Rust 2141:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_SCM_BUS_LD_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9b89307d_d76b_4f48_b186_54041ae92e8d);

// UNSUPPORTED Rust 2142:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_SCM_BUS_NVD_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8de064ff_b630_42e4_88ea_6f24c8641175);

// UNSUPPORTED Rust 2143:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_SCM_PHYSICAL_NVDIMM_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x0079c21b_917e_405e_a9ce_0732b5bbcebd);

// UNSUPPORTED Rust 2144:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_SDEV_IDENTIFIER_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x49d67af8_916c_4ee8_9df1_889f17d21e91);

// UNSUPPORTED Rust 2145:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_SECURE_DRIVER_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x370f67e1_4ff5_4a94_9a35_06c5d9cc30e2);

// UNSUPPORTED Rust 2146:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_TARGET_DEVICE_QUERY_REMOVE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4006_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2147:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_TARGET_DEVICE_REMOVE_CANCELLED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4007_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2148:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_TARGET_DEVICE_REMOVE_COMPLETE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xcb3a4008_46f0_11d0_b08f_00609713053f);

// UNSUPPORTED Rust 2149:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_TARGET_DEVICE_TRANSPORT_RELATIONS_CHANGED: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfcf528f6_a82f_47b1_ad3a_8050594cad28);

// UNSUPPORTED Rust 2150:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_THERMAL_COOLING_INTERFACE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xecbe47a8_c498_4bb9_bd70_e867e0940d22);

// UNSUPPORTED Rust 2151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_TRANSLATOR_INTERFACE_STANDARD: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6c154a92_aacf_11d0_8d2a_00a0c906b244);

// UNSUPPORTED Rust 2152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const GUID_WUDF_DEVICE_HOST_PROBLEM: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xc43d25bd_9346_40ee_a2d2_d70c15f8b75b);

// UNSUPPORTED Rust 2153:1: non-scalar type Ptr unsupported
// pub type HCMNOTIFICATION = *mut core::ffi::c_void;

public typealias `HDEVINFO` = Long;
// UNSUPPORTED Rust 2155:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct HWPROFILEINFO_A {
//     pub HWPI_ulHWProfile: u32,
//     pub HWPI_szFriendlyName: [i8; 80],
//     pub HWPI_dwFlags: u32,
// }

// UNSUPPORTED Rust 2162:1: declaration Impl has no candidate rule
// impl Default for HWPROFILEINFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2167:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct HWPROFILEINFO_W {
//     pub HWPI_ulHWProfile: u32,
//     pub HWPI_szFriendlyName: [u16; 80],
//     pub HWPI_dwFlags: u32,
// }

// UNSUPPORTED Rust 2174:1: declaration Impl has no candidate rule
// impl Default for HWPROFILEINFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `IDD_DYNAWIZ_ANALYZEDEV_PAGE`: UInt = 10010u;
public const val `IDD_DYNAWIZ_ANALYZE_NEXTPAGE`: UInt = 10004u;
public const val `IDD_DYNAWIZ_ANALYZE_PREVPAGE`: UInt = 10003u;
public const val `IDD_DYNAWIZ_FIRSTPAGE`: UInt = 10000u;
public const val `IDD_DYNAWIZ_INSTALLDETECTEDDEVS_PAGE`: UInt = 10011u;
public const val `IDD_DYNAWIZ_INSTALLDETECTED_NEXTPAGE`: UInt = 10007u;
public const val `IDD_DYNAWIZ_INSTALLDETECTED_NODEVS`: UInt = 10008u;
public const val `IDD_DYNAWIZ_INSTALLDETECTED_PREVPAGE`: UInt = 10006u;
public const val `IDD_DYNAWIZ_SELECTCLASS_PAGE`: UInt = 10012u;
public const val `IDD_DYNAWIZ_SELECTDEV_PAGE`: UInt = 10009u;
public const val `IDD_DYNAWIZ_SELECT_NEXTPAGE`: UInt = 10002u;
public const val `IDD_DYNAWIZ_SELECT_PREVPAGE`: UInt = 10001u;
public const val `IDF_CHECKFIRST`: UInt = 256u;
public const val `IDF_NOBEEP`: UInt = 512u;
public const val `IDF_NOBROWSE`: UInt = 1u;
public const val `IDF_NOCOMPRESSED`: UInt = 8u;
public const val `IDF_NODETAILS`: UInt = 4u;
public const val `IDF_NOFOREGROUND`: UInt = 1024u;
public const val `IDF_NOREMOVABLEMEDIAPROMPT`: UInt = 4096u;
public const val `IDF_NOSKIP`: UInt = 2u;
public const val `IDF_OEMDISK`: UInt = 2147483648u;
public const val `IDF_USEDISKNAMEASPROMPT`: UInt = 8192u;
public const val `IDF_WARNIFSKIP`: UInt = 2048u;
public const val `IDI_CLASSICON_OVERLAYFIRST`: UInt = 500u;
public const val `IDI_CLASSICON_OVERLAYLAST`: UInt = 502u;
public const val `IDI_CONFLICT`: UInt = 161u;
public const val `IDI_DISABLED_OVL`: UInt = 501u;
public const val `IDI_FORCED_OVL`: UInt = 502u;
public const val `IDI_PROBLEM_OVL`: UInt = 500u;
public const val `IDI_RESOURCE`: UInt = 159u;
public const val `IDI_RESOURCEFIRST`: UInt = 159u;
public const val `IDI_RESOURCELAST`: UInt = 161u;
public const val `IDI_RESOURCEOVERLAYFIRST`: UInt = 161u;
public const val `IDI_RESOURCEOVERLAYLAST`: UInt = 161u;
// UNSUPPORTED Rust 2213:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct INFCONTEXT {
//     pub Inf: *mut core::ffi::c_void,
//     pub CurrentInf: *mut core::ffi::c_void,
//     pub Section: u32,
//     pub Line: u32,
// }

// UNSUPPORTED Rust 2222:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for INFCONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2228:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct INFCONTEXT {
//     pub Inf: *mut core::ffi::c_void,
//     pub CurrentInf: *mut core::ffi::c_void,
//     pub Section: u32,
//     pub Line: u32,
// }

// UNSUPPORTED Rust 2237:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for INFCONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INFINFO_DEFAULT_SEARCH`: UInt = 3u;
public const val `INFINFO_INF_NAME_IS_ABSOLUTE`: UInt = 2u;
public const val `INFINFO_INF_PATH_LIST_SEARCH`: UInt = 5u;
public const val `INFINFO_INF_SPEC_IS_HINF`: UInt = 1u;
public const val `INFINFO_REVERSE_DEFAULT_SEARCH`: UInt = 4u;
// UNSUPPORTED Rust 2248:1: non-scalar type Ptr unsupported
// pub const INFSTR_BUS_ALL: windows_sys::core::PCWSTR = windows_sys::core::w!("BUS_ALL");

// UNSUPPORTED Rust 2249:1: non-scalar type Ptr unsupported
// pub const INFSTR_BUS_EISA: windows_sys::core::PCWSTR = windows_sys::core::w!("BUS_EISA");

// UNSUPPORTED Rust 2250:1: non-scalar type Ptr unsupported
// pub const INFSTR_BUS_ISA: windows_sys::core::PCWSTR = windows_sys::core::w!("BUS_ISA");

// UNSUPPORTED Rust 2251:1: non-scalar type Ptr unsupported
// pub const INFSTR_BUS_MCA: windows_sys::core::PCWSTR = windows_sys::core::w!("BUS_MCA");

// UNSUPPORTED Rust 2252:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_DESIRED: windows_sys::core::PCWSTR = windows_sys::core::w!("DESIRED");

// UNSUPPORTED Rust 2253:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_DISABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("DISABLED");

// UNSUPPORTED Rust 2254:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_FORCECONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("FORCECONFIG");

// UNSUPPORTED Rust 2255:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_HARDRECONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("HARDRECONFIG");

// UNSUPPORTED Rust 2256:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_HARDWIRED: windows_sys::core::PCWSTR = windows_sys::core::w!("HARDWIRED");

// UNSUPPORTED Rust 2257:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_NORMAL: windows_sys::core::PCWSTR = windows_sys::core::w!("NORMAL");

// UNSUPPORTED Rust 2258:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_POWEROFF: windows_sys::core::PCWSTR = windows_sys::core::w!("POWEROFF");

// UNSUPPORTED Rust 2259:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_REBOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("REBOOT");

// UNSUPPORTED Rust 2260:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_RESTART: windows_sys::core::PCWSTR = windows_sys::core::w!("RESTART");

// UNSUPPORTED Rust 2261:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGPRI_SUBOPTIMAL: windows_sys::core::PCWSTR = windows_sys::core::w!("SUBOPTIMAL");

// UNSUPPORTED Rust 2262:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGTYPE_BASIC: windows_sys::core::PCWSTR = windows_sys::core::w!("BASIC");

// UNSUPPORTED Rust 2263:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGTYPE_FORCED: windows_sys::core::PCWSTR = windows_sys::core::w!("FORCED");

// UNSUPPORTED Rust 2264:1: non-scalar type Ptr unsupported
// pub const INFSTR_CFGTYPE_OVERRIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("OVERRIDE");

// UNSUPPORTED Rust 2265:1: non-scalar type Ptr unsupported
// pub const INFSTR_CLASS_SAFEEXCL: windows_sys::core::PCWSTR = windows_sys::core::w!("SAFE_EXCL");

// UNSUPPORTED Rust 2266:1: non-scalar type Ptr unsupported
// pub const INFSTR_CONTROLFLAGS_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("ControlFlags");

// UNSUPPORTED Rust 2267:1: non-scalar type Ptr unsupported
// pub const INFSTR_DRIVERSELECT_FUNCTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverSelectFunctions");

// UNSUPPORTED Rust 2268:1: non-scalar type Ptr unsupported
// pub const INFSTR_DRIVERSELECT_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverSelect");

// UNSUPPORTED Rust 2269:1: non-scalar type Ptr unsupported
// pub const INFSTR_DRIVERVERSION_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverVer");

// UNSUPPORTED Rust 2270:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Action");

// UNSUPPORTED Rust 2271:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ALWAYSEXCLUDEFROMSELECT: windows_sys::core::PCWSTR = windows_sys::core::w!("AlwaysExcludeFromSelect");

// UNSUPPORTED Rust 2272:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_BUFFER_SIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("BufferSize");

// UNSUPPORTED Rust 2273:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CATALOGFILE: windows_sys::core::PCWSTR = windows_sys::core::w!("CatalogFile");

// UNSUPPORTED Rust 2274:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CHANNEL_ACCESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Access");

// UNSUPPORTED Rust 2275:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CHANNEL_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled");

// UNSUPPORTED Rust 2276:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CHANNEL_ISOLATION: windows_sys::core::PCWSTR = windows_sys::core::w!("Isolation");

// UNSUPPORTED Rust 2277:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CHANNEL_VALUE: windows_sys::core::PCWSTR = windows_sys::core::w!("Value");

// UNSUPPORTED Rust 2278:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Class");

// UNSUPPORTED Rust 2279:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CLASSGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("ClassGUID");

// UNSUPPORTED Rust 2280:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CLOCK_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ClockType");

// UNSUPPORTED Rust 2281:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_CONFIGPRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigPriority");

// UNSUPPORTED Rust 2282:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_COPYFILESONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("CopyFilesOnly");

// UNSUPPORTED Rust 2283:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DATA_ITEM: windows_sys::core::PCWSTR = windows_sys::core::w!("DataItem");

// UNSUPPORTED Rust 2284:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DELAYEDAUTOSTART: windows_sys::core::PCWSTR = windows_sys::core::w!("DelayedAutoStart");

// UNSUPPORTED Rust 2285:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DEPENDENCIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Dependencies");

// UNSUPPORTED Rust 2286:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 2287:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DETECTLIST: windows_sys::core::PCWSTR = windows_sys::core::w!("DetectList");

// UNSUPPORTED Rust 2288:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DETPARAMS: windows_sys::core::PCWSTR = windows_sys::core::w!("Params");

// UNSUPPORTED Rust 2289:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DISABLE_REALTIME_PERSISTENCE: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableRealtimePersistence");

// UNSUPPORTED Rust 2290:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DISPLAYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DisplayName");

// UNSUPPORTED Rust 2291:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DMA: windows_sys::core::PCWSTR = windows_sys::core::w!("DMA");

// UNSUPPORTED Rust 2292:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DMACONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("DMAConfig");

// UNSUPPORTED Rust 2293:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_DRIVERSET: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverSet");

// UNSUPPORTED Rust 2294:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled");

// UNSUPPORTED Rust 2295:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ENABLE_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableFlags");

// UNSUPPORTED Rust 2296:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ENABLE_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableLevel");

// UNSUPPORTED Rust 2297:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ENABLE_PROPERTY: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableProperty");

// UNSUPPORTED Rust 2298:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_ERRORCONTROL: windows_sys::core::PCWSTR = windows_sys::core::w!("ErrorControl");

// UNSUPPORTED Rust 2299:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_EXCLUDEFROMSELECT: windows_sys::core::PCWSTR = windows_sys::core::w!("ExcludeFromSelect");

// UNSUPPORTED Rust 2300:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_EXCLUDERES: windows_sys::core::PCWSTR = windows_sys::core::w!("ExcludeRes");

// UNSUPPORTED Rust 2301:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_EXTENSIONID: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtensionId");

// UNSUPPORTED Rust 2302:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_FAILURE_ACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("Action");

// UNSUPPORTED Rust 2303:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_FILE_MAX: windows_sys::core::PCWSTR = windows_sys::core::w!("FileMax");

// UNSUPPORTED Rust 2304:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_FILE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("FileName");

// UNSUPPORTED Rust 2305:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_FLUSH_TIMER: windows_sys::core::PCWSTR = windows_sys::core::w!("FlushTimer");

// UNSUPPORTED Rust 2306:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_FROMINET: windows_sys::core::PCWSTR = windows_sys::core::w!("FromINet");

// UNSUPPORTED Rust 2307:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_HARDWARE_CLASS: windows_sys::core::PCWSTR = windows_sys::core::w!("Class");

// UNSUPPORTED Rust 2308:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_HARDWARE_CLASSGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("ClassGUID");

// UNSUPPORTED Rust 2309:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_INTERACTIVEINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("InteractiveInstall");

// UNSUPPORTED Rust 2310:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_IO: windows_sys::core::PCWSTR = windows_sys::core::w!("IO");

// UNSUPPORTED Rust 2311:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_IOCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("IOConfig");

// UNSUPPORTED Rust 2312:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_IRQ: windows_sys::core::PCWSTR = windows_sys::core::w!("IRQ");

// UNSUPPORTED Rust 2313:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_IRQCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("IRQConfig");

// UNSUPPORTED Rust 2314:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_LOADORDERGROUP: windows_sys::core::PCWSTR = windows_sys::core::w!("LoadOrderGroup");

// UNSUPPORTED Rust 2315:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_LOGGING_AUTOBACKUP: windows_sys::core::PCWSTR = windows_sys::core::w!("LoggingAutoBackup");

// UNSUPPORTED Rust 2316:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_LOGGING_MAXSIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("LoggingMaxSize");

// UNSUPPORTED Rust 2317:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_LOGGING_RETENTION: windows_sys::core::PCWSTR = windows_sys::core::w!("LoggingRetention");

// UNSUPPORTED Rust 2318:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_LOG_FILE_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("LogFileMode");

// UNSUPPORTED Rust 2319:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MATCH_ALL_KEYWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("MatchAllKeyword");

// UNSUPPORTED Rust 2320:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MATCH_ANY_KEYWORD: windows_sys::core::PCWSTR = windows_sys::core::w!("MatchAnyKeyword");

// UNSUPPORTED Rust 2321:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MAXIMUM_BUFFERS: windows_sys::core::PCWSTR = windows_sys::core::w!("MaximumBuffers");

// UNSUPPORTED Rust 2322:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MAX_FILE_SIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxFileSize");

// UNSUPPORTED Rust 2323:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MEM: windows_sys::core::PCWSTR = windows_sys::core::w!("Mem");

// UNSUPPORTED Rust 2324:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MEMCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("MemConfig");

// UNSUPPORTED Rust 2325:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MEMLARGECONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("MemLargeConfig");

// UNSUPPORTED Rust 2326:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MESSAGE_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("MessageFile");

// UNSUPPORTED Rust 2327:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MFCARDCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("MfCardConfig");

// UNSUPPORTED Rust 2328:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_MINIMUM_BUFFERS: windows_sys::core::PCWSTR = windows_sys::core::w!("MinimumBuffers");

// UNSUPPORTED Rust 2329:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 2330:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_NON_CRASH_FAILURES: windows_sys::core::PCWSTR = windows_sys::core::w!("NonCrashFailures");

// UNSUPPORTED Rust 2331:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_NOSETUPINF: windows_sys::core::PCWSTR = windows_sys::core::w!("NoSetupInf");

// UNSUPPORTED Rust 2332:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_PARAMETER_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("ParameterFile");

// UNSUPPORTED Rust 2333:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Path");

// UNSUPPORTED Rust 2334:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_PCCARDCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("PcCardConfig");

// UNSUPPORTED Rust 2335:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_PNPLOCKDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("PnpLockDown");

// UNSUPPORTED Rust 2336:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_PROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider");

// UNSUPPORTED Rust 2337:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_PROVIDER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ProviderName");

// UNSUPPORTED Rust 2338:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_REQUESTADDITIONALSOFTWARE: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestAdditionalSoftware");

// UNSUPPORTED Rust 2339:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_REQUIREDPRIVILEGES: windows_sys::core::PCWSTR = windows_sys::core::w!("RequiredPrivileges");

// UNSUPPORTED Rust 2340:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_RESET_PERIOD: windows_sys::core::PCWSTR = windows_sys::core::w!("ResetPeriod");

// UNSUPPORTED Rust 2341:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_RESOURCE_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceFile");

// UNSUPPORTED Rust 2342:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SECURITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Security");

// UNSUPPORTED Rust 2343:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SERVICEBINARY: windows_sys::core::PCWSTR = windows_sys::core::w!("ServiceBinary");

// UNSUPPORTED Rust 2344:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SERVICESIDTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ServiceSidType");

// UNSUPPORTED Rust 2345:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SERVICETYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ServiceType");

// UNSUPPORTED Rust 2346:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SIGNATURE: windows_sys::core::PCWSTR = windows_sys::core::w!("Signature");

// UNSUPPORTED Rust 2347:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SKIPLIST: windows_sys::core::PCWSTR = windows_sys::core::w!("SkipList");

// UNSUPPORTED Rust 2348:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_START: windows_sys::core::PCWSTR = windows_sys::core::w!("Start");

// UNSUPPORTED Rust 2349:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_STARTNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("StartName");

// UNSUPPORTED Rust 2350:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_STARTTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("StartType");

// UNSUPPORTED Rust 2351:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_SUB_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("SubType");

// UNSUPPORTED Rust 2352:1: non-scalar type Ptr unsupported
// pub const INFSTR_KEY_TRIGGER_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("TriggerType");

// UNSUPPORTED Rust 2353:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NT: windows_sys::core::PCWSTR = windows_sys::core::w!("NT");

// UNSUPPORTED Rust 2354:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTALPHA: windows_sys::core::PCWSTR = windows_sys::core::w!("NTAlpha");

// UNSUPPORTED Rust 2355:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTAMD64: windows_sys::core::PCWSTR = windows_sys::core::w!("NTAMD64");

// UNSUPPORTED Rust 2356:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTARM: windows_sys::core::PCWSTR = windows_sys::core::w!("NTARM");

// UNSUPPORTED Rust 2357:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTARM64: windows_sys::core::PCWSTR = windows_sys::core::w!("NTARM64");

// UNSUPPORTED Rust 2358:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTAXP64: windows_sys::core::PCWSTR = windows_sys::core::w!("NTAXP64");

// UNSUPPORTED Rust 2359:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTIA64: windows_sys::core::PCWSTR = windows_sys::core::w!("NTIA64");

// UNSUPPORTED Rust 2360:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTMIPS: windows_sys::core::PCWSTR = windows_sys::core::w!("NTMIPS");

// UNSUPPORTED Rust 2361:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTPPC: windows_sys::core::PCWSTR = windows_sys::core::w!("NTPPC");

// UNSUPPORTED Rust 2362:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_NTX86: windows_sys::core::PCWSTR = windows_sys::core::w!("NTx86");

// UNSUPPORTED Rust 2363:1: non-scalar type Ptr unsupported
// pub const INFSTR_PLATFORM_WIN: windows_sys::core::PCWSTR = windows_sys::core::w!("Win");

// UNSUPPORTED Rust 2364:1: non-scalar type Ptr unsupported
// pub const INFSTR_REBOOT: windows_sys::core::PCWSTR = windows_sys::core::w!("Reboot");

// UNSUPPORTED Rust 2365:1: non-scalar type Ptr unsupported
// pub const INFSTR_RESTART: windows_sys::core::PCWSTR = windows_sys::core::w!("Restart");

// UNSUPPORTED Rust 2366:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_BIOSROMRD: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_BIOSROMRD");

// UNSUPPORTED Rust 2367:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_DELICATE: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_DELICATE");

// UNSUPPORTED Rust 2368:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_IORD: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_IORD");

// UNSUPPORTED Rust 2369:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_IOWR: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_IOWR");

// UNSUPPORTED Rust 2370:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_LOW: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_LOW");

// UNSUPPORTED Rust 2371:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_MEMRD: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_MEMRD");

// UNSUPPORTED Rust 2372:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_MEMWR: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_MEMWR");

// UNSUPPORTED Rust 2373:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_NONE: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_NONE");

// UNSUPPORTED Rust 2374:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_QUERYDRV: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_QUERYDRV");

// UNSUPPORTED Rust 2375:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_SWINT: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_SWINT");

// UNSUPPORTED Rust 2376:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_UNRELIABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_UNRELIABLE");

// UNSUPPORTED Rust 2377:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_VERYHIGH: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_VERYHIGH");

// UNSUPPORTED Rust 2378:1: non-scalar type Ptr unsupported
// pub const INFSTR_RISK_VERYLOW: windows_sys::core::PCWSTR = windows_sys::core::w!("RISK_VERYLOW");

// UNSUPPORTED Rust 2379:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_AUTOEXECBAT: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoexecBatDrivers");

// UNSUPPORTED Rust 2380:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_AVOIDCFGSYSDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.AvoidCfgSysDev");

// UNSUPPORTED Rust 2381:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_AVOIDENVDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.AvoidEnvDev");

// UNSUPPORTED Rust 2382:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_AVOIDINIDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.AvoidIniDev");

// UNSUPPORTED Rust 2383:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADACPIBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadACPIBios");

// UNSUPPORTED Rust 2384:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADDISKBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadDiskBios");

// UNSUPPORTED Rust 2385:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADDSBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadDSBios");

// UNSUPPORTED Rust 2386:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADPMCALLBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadProtectedModeCallBios");

// UNSUPPORTED Rust 2387:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADPNPBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadPnpBios");

// UNSUPPORTED Rust 2388:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADRMCALLBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadRealModeCallBios");

// UNSUPPORTED Rust 2389:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_BADROUTINGTABLEBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("BadPCIIRQRoutingTableBios");

// UNSUPPORTED Rust 2390:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_CFGSYS: windows_sys::core::PCWSTR = windows_sys::core::w!("ConfigSysDrivers");

// UNSUPPORTED Rust 2391:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_CLASS_INSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("ClassInstall");

// UNSUPPORTED Rust 2392:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_CLASS_INSTALL_32: windows_sys::core::PCWSTR = windows_sys::core::w!("ClassInstall32");

// UNSUPPORTED Rust 2393:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DEFAULT_INSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultInstall");

// UNSUPPORTED Rust 2394:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DEFAULT_UNINSTALL: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultUninstall");

// UNSUPPORTED Rust 2395:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DETCLASSINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.ClassInfo");

// UNSUPPORTED Rust 2396:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DETMODULES: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.Modules");

// UNSUPPORTED Rust 2397:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DETOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.Options");

// UNSUPPORTED Rust 2398:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DEVINFS: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.DevINFs");

// UNSUPPORTED Rust 2399:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_DISPLAY_CLEANUP: windows_sys::core::PCWSTR = windows_sys::core::w!("DisplayCleanup");

// UNSUPPORTED Rust 2400:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_EXTENSIONCONTRACTS: windows_sys::core::PCWSTR = windows_sys::core::w!("ExtensionContracts");

// UNSUPPORTED Rust 2401:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_FORCEHWVERIFY: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.ForceHWVerify");

// UNSUPPORTED Rust 2402:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_GOODACPIBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("GoodACPIBios");

// UNSUPPORTED Rust 2403:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_HPOMNIBOOK: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.HPOmnibook");

// UNSUPPORTED Rust 2404:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_INTERFACE_INSTALL_32: windows_sys::core::PCWSTR = windows_sys::core::w!("InterfaceInstall32");

// UNSUPPORTED Rust 2405:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_MACHINEIDBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("MachineIDBios");

// UNSUPPORTED Rust 2406:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_MANUALDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.ManualDev");

// UNSUPPORTED Rust 2407:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_MFG: windows_sys::core::PCWSTR = windows_sys::core::w!("Manufacturer");

// UNSUPPORTED Rust 2408:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_REGCFGSYSDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.RegCfgSysDev");

// UNSUPPORTED Rust 2409:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_REGENVDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.RegEnvDev");

// UNSUPPORTED Rust 2410:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_REGINIDEV: windows_sys::core::PCWSTR = windows_sys::core::w!("Det.RegIniDev");

// UNSUPPORTED Rust 2411:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_SYSINI: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemIniDrivers");

// UNSUPPORTED Rust 2412:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_SYSINIDRV: windows_sys::core::PCWSTR = windows_sys::core::w!("SystemIniDriversLine");

// UNSUPPORTED Rust 2413:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_TARGETCOMPUTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("TargetComputers");

// UNSUPPORTED Rust 2414:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("Version");

// UNSUPPORTED Rust 2415:1: non-scalar type Ptr unsupported
// pub const INFSTR_SECT_WININIRUN: windows_sys::core::PCWSTR = windows_sys::core::w!("WinIniRunLine");

// UNSUPPORTED Rust 2416:1: non-scalar type Ptr unsupported
// pub const INFSTR_SOFTWAREVERSION_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("SoftwareVersion");

// UNSUPPORTED Rust 2417:1: non-scalar type Ptr unsupported
// pub const INFSTR_STRKEY_DRVDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("DriverDesc");

// UNSUPPORTED Rust 2418:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_COINSTALLERS: windows_sys::core::PCWSTR = windows_sys::core::w!("CoInstallers");

// UNSUPPORTED Rust 2419:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_CTL: windows_sys::core::PCWSTR = windows_sys::core::w!("CTL");

// UNSUPPORTED Rust 2420:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_DET: windows_sys::core::PCWSTR = windows_sys::core::w!("Det");

// UNSUPPORTED Rust 2421:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_EVENTS: windows_sys::core::PCWSTR = windows_sys::core::w!("Events");

// UNSUPPORTED Rust 2422:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_FACTDEF: windows_sys::core::PCWSTR = windows_sys::core::w!("FactDef");

// UNSUPPORTED Rust 2423:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_FILTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("Filters");

// UNSUPPORTED Rust 2424:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_HW: windows_sys::core::PCWSTR = windows_sys::core::w!("Hw");

// UNSUPPORTED Rust 2425:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_INTERFACES: windows_sys::core::PCWSTR = windows_sys::core::w!("Interfaces");

// UNSUPPORTED Rust 2426:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_LOGCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("LogConfig");

// UNSUPPORTED Rust 2427:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_LOGCONFIGOVERRIDE: windows_sys::core::PCWSTR = windows_sys::core::w!("LogConfigOverride");

// UNSUPPORTED Rust 2428:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_NORESOURCEDUPS: windows_sys::core::PCWSTR = windows_sys::core::w!("NoResDup");

// UNSUPPORTED Rust 2429:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_POSSIBLEDUPS: windows_sys::core::PCWSTR = windows_sys::core::w!("PosDup");

// UNSUPPORTED Rust 2430:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_SERVICES: windows_sys::core::PCWSTR = windows_sys::core::w!("Services");

// UNSUPPORTED Rust 2431:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_SOFTWARE: windows_sys::core::PCWSTR = windows_sys::core::w!("Software");

// UNSUPPORTED Rust 2432:1: non-scalar type Ptr unsupported
// pub const INFSTR_SUBKEY_WMI: windows_sys::core::PCWSTR = windows_sys::core::w!("WMI");

public typealias `INF_STYLE` = UInt;
public const val `INF_STYLE_CACHE_DISABLE`: `INF_STYLE` = 32u;
public const val `INF_STYLE_CACHE_ENABLE`: `INF_STYLE` = 16u;
public const val `INF_STYLE_CACHE_IGNORE`: `INF_STYLE` = 64u;
public const val `INF_STYLE_NONE`: `INF_STYLE` = 0u;
public const val `INF_STYLE_OLDNT`: `INF_STYLE` = 1u;
public const val `INF_STYLE_WIN4`: `INF_STYLE` = 2u;
public const val `INSTALLFLAG_BITS`: `UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS` = 7u;
public const val `INSTALLFLAG_FORCE`: `UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS` = 1u;
public const val `INSTALLFLAG_NONINTERACTIVE`: `UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS` = 4u;
public const val `INSTALLFLAG_READONLY`: `UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS` = 2u;
public const val `IOA_Local`: UInt = 255u;
public typealias `IOD_DESFLAGS` = UInt;
public const val `IO_ALIAS_10_BIT_DECODE`: UInt = 4u;
public const val `IO_ALIAS_12_BIT_DECODE`: UInt = 16u;
public const val `IO_ALIAS_16_BIT_DECODE`: UInt = 0u;
public const val `IO_ALIAS_POSITIVE_DECODE`: UInt = 255u;
// UNSUPPORTED Rust 2450:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct IO_DES {
//     pub IOD_Count: u32,
//     pub IOD_Type: u32,
//     pub IOD_Alloc_Base: u64,
//     pub IOD_Alloc_End: u64,
//     pub IOD_DesFlags: IOD_DESFLAGS,
// }

// UNSUPPORTED Rust 2459:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct IO_RANGE {
//     pub IOR_Align: u64,
//     pub IOR_nPorts: u32,
//     pub IOR_Min: u64,
//     pub IOR_Max: u64,
//     pub IOR_RangeFlags: IOD_DESFLAGS,
//     pub IOR_Alias: u64,
// }

// UNSUPPORTED Rust 2469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct IO_RESOURCE {
//     pub IO_Header: IO_DES,
//     pub IO_Data: [IO_RANGE; 1],
// }

// UNSUPPORTED Rust 2475:1: declaration Impl has no candidate rule
// impl Default for IO_RESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `IRQD_FLAGS` = UInt;
// UNSUPPORTED Rust 2481:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct IRQ_DES_32 {
//     pub IRQD_Count: u32,
//     pub IRQD_Type: u32,
//     pub IRQD_Flags: IRQD_FLAGS,
//     pub IRQD_Alloc_Num: u32,
//     pub IRQD_Affinity: u32,
// }

// UNSUPPORTED Rust 2490:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct IRQ_DES_64 {
//     pub IRQD_Count: u32,
//     pub IRQD_Type: u32,
//     pub IRQD_Flags: IRQD_FLAGS,
//     pub IRQD_Alloc_Num: u32,
//     pub IRQD_Affinity: u64,
// }

// UNSUPPORTED Rust 2499:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct IRQ_RANGE {
//     pub IRQR_Min: u32,
//     pub IRQR_Max: u32,
//     pub IRQR_Flags: IRQD_FLAGS,
// }

// UNSUPPORTED Rust 2506:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct IRQ_RESOURCE_32 {
//     pub IRQ_Header: IRQ_DES_32,
//     pub IRQ_Data: [IRQ_RANGE; 1],
// }

// UNSUPPORTED Rust 2512:1: declaration Impl has no candidate rule
// impl Default for IRQ_RESOURCE_32 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2517:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct IRQ_RESOURCE_64 {
//     pub IRQ_Header: IRQ_DES_64,
//     pub IRQ_Data: [IRQ_RANGE; 1],
// }

// UNSUPPORTED Rust 2523:1: declaration Impl has no candidate rule
// impl Default for IRQ_RESOURCE_64 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `LCPRI_BOOTCONFIG`: UInt = 1u;
public const val `LCPRI_DESIRED`: UInt = 8192u;
public const val `LCPRI_DISABLED`: UInt = 65535u;
public const val `LCPRI_FORCECONFIG`: UInt = 0u;
public const val `LCPRI_HARDRECONFIG`: UInt = 49152u;
public const val `LCPRI_HARDWIRED`: UInt = 57344u;
public const val `LCPRI_IMPOSSIBLE`: UInt = 61440u;
public const val `LCPRI_LASTBESTCONFIG`: UInt = 16383u;
public const val `LCPRI_LASTSOFTCONFIG`: UInt = 32767u;
public const val `LCPRI_NORMAL`: UInt = 12288u;
public const val `LCPRI_POWEROFF`: UInt = 40960u;
public const val `LCPRI_REBOOT`: UInt = 36864u;
public const val `LCPRI_RESTART`: UInt = 32768u;
public const val `LCPRI_SUBOPTIMAL`: UInt = 20480u;
public const val `LINE_LEN`: UInt = 256u;
public const val `LOG_CONF_BITS`: UInt = 7u;
public const val `LogSevError`: UInt = 2u;
public const val `LogSevFatalError`: UInt = 3u;
public const val `LogSevInformation`: UInt = 0u;
public const val `LogSevMaximum`: UInt = 4u;
public const val `LogSevWarning`: UInt = 1u;
public const val `MAX_CLASS_NAME_LEN`: UInt = 32u;
public const val `MAX_CONFIG_VALUE`: UInt = 9999u;
public const val `MAX_DEVICE_ID_LEN`: UInt = 200u;
public const val `MAX_DEVNODE_ID_LEN`: UInt = 200u;
public const val `MAX_DMA_CHANNELS`: UInt = 7u;
public const val `MAX_GUID_STRING_LEN`: UInt = 39u;
public const val `MAX_IDD_DYNAWIZ_RESOURCE_ID`: UInt = 11000u;
public const val `MAX_INFSTR_STRKEY_LEN`: UInt = 32u;
public const val `MAX_INF_FLAG`: UInt = 20u;
public const val `MAX_INF_SECTION_NAME_LENGTH`: UInt = 255u;
public const val `MAX_INF_STRING_LENGTH`: UInt = 4096u;
public const val `MAX_INSTALLWIZARD_DYNAPAGES`: UInt = 20u;
public const val `MAX_INSTANCE_VALUE`: UInt = 9999u;
public const val `MAX_INSTRUCTION_LEN`: UInt = 256u;
public const val `MAX_IO_PORTS`: UInt = 20u;
public const val `MAX_IRQS`: UInt = 7u;
public const val `MAX_KEY_LEN`: UInt = 100u;
public const val `MAX_LABEL_LEN`: UInt = 30u;
public const val `MAX_LCPRI`: UInt = 65535u;
public const val `MAX_MEM_REGISTERS`: UInt = 9u;
public const val `MAX_PRIORITYSTR_LEN`: UInt = 16u;
public const val `MAX_PROFILE_LEN`: UInt = 80u;
public const val `MAX_SERVICE_NAME_LEN`: UInt = 256u;
public const val `MAX_SUBTITLE_LEN`: UInt = 256u;
public const val `MAX_TITLE_LEN`: UInt = 60u;
public typealias `MD_FLAGS` = UInt;
// UNSUPPORTED Rust 2575:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MEM_DES {
//     pub MD_Count: u32,
//     pub MD_Type: u32,
//     pub MD_Alloc_Base: u64,
//     pub MD_Alloc_End: u64,
//     pub MD_Flags: MD_FLAGS,
//     pub MD_Reserved: u32,
// }

// UNSUPPORTED Rust 2585:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MEM_LARGE_DES {
//     pub MLD_Count: u32,
//     pub MLD_Type: u32,
//     pub MLD_Alloc_Base: u64,
//     pub MLD_Alloc_End: u64,
//     pub MLD_Flags: u32,
//     pub MLD_Reserved: u32,
// }

// UNSUPPORTED Rust 2595:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MEM_LARGE_RANGE {
//     pub MLR_Align: u64,
//     pub MLR_nBytes: u64,
//     pub MLR_Min: u64,
//     pub MLR_Max: u64,
//     pub MLR_Flags: u32,
//     pub MLR_Reserved: u32,
// }

// UNSUPPORTED Rust 2605:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MEM_LARGE_RESOURCE {
//     pub MEM_LARGE_Header: MEM_LARGE_DES,
//     pub MEM_LARGE_Data: [MEM_LARGE_RANGE; 1],
// }

// UNSUPPORTED Rust 2611:1: declaration Impl has no candidate rule
// impl Default for MEM_LARGE_RESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2616:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MEM_RANGE {
//     pub MR_Align: u64,
//     pub MR_nBytes: u32,
//     pub MR_Min: u64,
//     pub MR_Max: u64,
//     pub MR_Flags: MD_FLAGS,
//     pub MR_Reserved: u32,
// }

// UNSUPPORTED Rust 2626:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MEM_RESOURCE {
//     pub MEM_Header: MEM_DES,
//     pub MEM_Data: [MEM_RANGE; 1],
// }

// UNSUPPORTED Rust 2632:1: declaration Impl has no candidate rule
// impl Default for MEM_RESOURCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2637:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct MFCARD_DES {
//     pub PMF_Count: u32,
//     pub PMF_Type: u32,
//     pub PMF_Flags: PMF_FLAGS,
//     pub PMF_ConfigOptions: u8,
//     pub PMF_IoResourceIndex: u8,
//     pub PMF_Reserved: [u8; 2],
//     pub PMF_ConfigRegisterBase: u32,
// }

// UNSUPPORTED Rust 2648:1: declaration Impl has no candidate rule
// impl Default for MFCARD_DES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2653:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct MFCARD_RESOURCE {
//     pub MfCard_Header: MFCARD_DES,
// }

public const val `MIN_IDD_DYNAWIZ_RESOURCE_ID`: UInt = 10000u;
public const val `NDW_INSTALLFLAG_CI_PICKED_OEM`: UInt = 32768u;
public const val `NDW_INSTALLFLAG_DIDFACTDEFS`: UInt = 1u;
public const val `NDW_INSTALLFLAG_EXPRESSINTRO`: UInt = 1024u;
public const val `NDW_INSTALLFLAG_HARDWAREALLREADYIN`: UInt = 2u;
public const val `NDW_INSTALLFLAG_INSTALLSPECIFIC`: UInt = 8192u;
public const val `NDW_INSTALLFLAG_KNOWNCLASS`: UInt = 524288u;
public const val `NDW_INSTALLFLAG_NEEDSHUTDOWN`: UInt = 512u;
public const val `NDW_INSTALLFLAG_NODETECTEDDEVS`: UInt = 4096u;
public const val `NDW_INSTALLFLAG_PCMCIADEVICE`: UInt = 131072u;
public const val `NDW_INSTALLFLAG_PCMCIAMODE`: UInt = 65536u;
public const val `NDW_INSTALLFLAG_SKIPCLASSLIST`: UInt = 16384u;
public const val `NDW_INSTALLFLAG_SKIPISDEVINSTALLED`: UInt = 2048u;
public const val `NDW_INSTALLFLAG_USERCANCEL`: UInt = 262144u;
public const val `NUM_CM_PROB`: UInt = 58u;
public const val `NUM_CM_PROB_V1`: UInt = 37u;
public const val `NUM_CM_PROB_V2`: UInt = 50u;
public const val `NUM_CM_PROB_V3`: UInt = 51u;
public const val `NUM_CM_PROB_V4`: UInt = 52u;
public const val `NUM_CM_PROB_V5`: UInt = 53u;
public const val `NUM_CM_PROB_V6`: UInt = 54u;
public const val `NUM_CM_PROB_V7`: UInt = 55u;
public const val `NUM_CM_PROB_V8`: UInt = 57u;
public const val `NUM_CM_PROB_V9`: UInt = 58u;
public const val `NUM_CR_RESULTS`: `CONFIGRET` = 60u;
public const val `NUM_LOG_CONF`: `CM_LOG_CONF` = 6u;
public typealias `OEM_SOURCE_MEDIA_TYPE` = UInt;
public const val `OVERRIDE_LOG_CONF`: `CM_LOG_CONF` = 5u;
// UNSUPPORTED Rust 2686:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub struct PCCARD_DES {
//     pub PCD_Count: u32,
//     pub PCD_Type: u32,
//     pub PCD_Flags: PCD_FLAGS,
//     pub PCD_ConfigIndex: u8,
//     pub PCD_Reserved: [u8; 3],
//     pub PCD_MemoryCardBase1: u32,
//     pub PCD_MemoryCardBase2: u32,
//     pub PCD_MemoryCardBase: [u32; 2],
//     pub PCD_MemoryFlags: [u16; 2],
//     pub PCD_IoFlags: [u8; 2],
// }

// UNSUPPORTED Rust 2700:1: declaration Impl has no candidate rule
// impl Default for PCCARD_DES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2705:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[derive(Clone, Copy, Default)]
// pub struct PCCARD_RESOURCE {
//     pub PcCard_Header: PCCARD_DES,
// }

public typealias `PCD_FLAGS` = UInt;
public const val `PCD_MAX_IO`: UInt = 2u;
public const val `PCD_MAX_MEMORY`: UInt = 2u;
// UNSUPPORTED Rust 2713:1: generic scalar type unsupported
// pub type PCM_NOTIFY_CALLBACK = Option<unsafe extern "system" fn(hnotify: HCMNOTIFICATION, context: *const core::ffi::c_void, action: CM_NOTIFY_ACTION, eventdata: *const CM_NOTIFY_EVENT_DATA, eventdatasize: u32) -> u32>;

// UNSUPPORTED Rust 2714:1: generic scalar type unsupported
// pub type PDETECT_PROGRESS_NOTIFY = Option<unsafe extern "system" fn(progressnotifyparam: *const core::ffi::c_void, detectcomplete: u32) -> windows_sys::core::BOOL>;

public typealias `PMF_FLAGS` = UInt;
public typealias `PNP_VETO_TYPE` = Int;
public const val `PNP_VetoAlreadyRemoved`: `PNP_VETO_TYPE` = 13;
public const val `PNP_VetoDevice`: `PNP_VETO_TYPE` = 6;
public const val `PNP_VetoDriver`: `PNP_VETO_TYPE` = 7;
public const val `PNP_VetoIllegalDeviceRequest`: `PNP_VETO_TYPE` = 8;
public const val `PNP_VetoInsufficientPower`: `PNP_VETO_TYPE` = 9;
public const val `PNP_VetoInsufficientRights`: `PNP_VETO_TYPE` = 12;
public const val `PNP_VetoLegacyDevice`: `PNP_VETO_TYPE` = 1;
public const val `PNP_VetoLegacyDriver`: `PNP_VETO_TYPE` = 11;
public const val `PNP_VetoNonDisableable`: `PNP_VETO_TYPE` = 10;
public const val `PNP_VetoOutstandingOpen`: `PNP_VETO_TYPE` = 5;
public const val `PNP_VetoPendingClose`: `PNP_VETO_TYPE` = 2;
public const val `PNP_VetoTypeUnknown`: `PNP_VETO_TYPE` = 0;
public const val `PNP_VetoWindowsApp`: `PNP_VETO_TYPE` = 3;
public const val `PNP_VetoWindowsService`: `PNP_VETO_TYPE` = 4;
public const val `PRIORITY_BIT`: UInt = 8u;
public const val `PRIORITY_EQUAL_FIRST`: UInt = 8u;
public const val `PRIORITY_EQUAL_LAST`: UInt = 0u;
// UNSUPPORTED Rust 2734:1: generic scalar type unsupported
// pub type PSP_DETSIG_CMPPROC = Option<unsafe extern "system" fn(deviceinfoset: HDEVINFO, newdevicedata: *const SP_DEVINFO_DATA, existingdevicedata: *const SP_DEVINFO_DATA, comparecontext: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 2735:1: generic scalar type unsupported
// pub type PSP_FILE_CALLBACK_A = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, notification: u32, param1: usize, param2: usize) -> u32>;

// UNSUPPORTED Rust 2736:1: generic scalar type unsupported
// pub type PSP_FILE_CALLBACK_W = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, notification: u32, param1: usize, param2: usize) -> u32>;

public const val `ROLLBACK_BITS`: `DIROLLBACKDRIVER_FLAGS` = 1u;
public const val `ROLLBACK_FLAG_NO_UI`: `DIROLLBACKDRIVER_FLAGS` = 1u;
public const val `RegDisposition_Bits`: UInt = 1u;
public const val `RegDisposition_OpenAlways`: UInt = 0u;
public const val `RegDisposition_OpenExisting`: UInt = 1u;
public const val `ResType_All`: `CM_RESTYPE` = 0u;
public const val `ResType_BusNumber`: `CM_RESTYPE` = 6u;
public const val `ResType_ClassSpecific`: `CM_RESTYPE` = 65535u;
public const val `ResType_Connection`: `CM_RESTYPE` = 32772u;
public const val `ResType_DMA`: `CM_RESTYPE` = 3u;
public const val `ResType_DevicePrivate`: `CM_RESTYPE` = 32769u;
public const val `ResType_DoNotUse`: `CM_RESTYPE` = 5u;
public const val `ResType_IO`: `CM_RESTYPE` = 2u;
public const val `ResType_IRQ`: `CM_RESTYPE` = 4u;
public const val `ResType_Ignored_Bit`: `CM_RESTYPE` = 32768u;
public const val `ResType_MAX`: `CM_RESTYPE` = 7u;
public const val `ResType_Mem`: `CM_RESTYPE` = 1u;
public const val `ResType_MemLarge`: `CM_RESTYPE` = 7u;
public const val `ResType_MfCardConfig`: `CM_RESTYPE` = 32771u;
public const val `ResType_None`: `CM_RESTYPE` = 0u;
public const val `ResType_PcCardConfig`: `CM_RESTYPE` = 32770u;
public const val `ResType_Reserved`: `CM_RESTYPE` = 32768u;
public const val `SCWMI_CLOBBER_SECURITY`: UInt = 1u;
public const val `SETDIRID_NOT_FULL_PATH`: UInt = 1u;
public typealias `SETUPSCANFILEQUEUE_FLAGS` = UInt;
public typealias `SETUP_DI_DEVICE_CONFIGURATION_FLAGS` = UInt;
public typealias `SETUP_DI_DEVICE_CREATION_FLAGS` = UInt;
public typealias `SETUP_DI_DEVICE_INSTALL_FLAGS` = UInt;
public typealias `SETUP_DI_DEVICE_INSTALL_FLAGS_EX` = UInt;
public typealias `SETUP_DI_DRIVER_INSTALL_FLAGS` = UInt;
public typealias `SETUP_DI_DRIVER_TYPE` = UInt;
public typealias `SETUP_DI_GET_CLASS_DEVS_FLAGS` = UInt;
public typealias `SETUP_DI_PROPERTY_CHANGE_SCOPE` = UInt;
public typealias `SETUP_DI_REGISTRY_PROPERTY` = UInt;
public typealias `SETUP_DI_REMOVE_DEVICE_SCOPE` = UInt;
public typealias `SETUP_DI_STATE_CHANGE` = UInt;
public typealias `SETUP_FILE_OPERATION` = UInt;
public const val `SIGNERSCORE_AUTHENTICODE`: UInt = 251658240u;
public const val `SIGNERSCORE_INBOX`: UInt = 218103811u;
public const val `SIGNERSCORE_LOGO_PREMIUM`: UInt = 218103809u;
public const val `SIGNERSCORE_LOGO_STANDARD`: UInt = 218103810u;
public const val `SIGNERSCORE_MASK`: UInt = 4278190080u;
public const val `SIGNERSCORE_SIGNED_MASK`: UInt = 4026531840u;
public const val `SIGNERSCORE_UNCLASSIFIED`: UInt = 218103812u;
public const val `SIGNERSCORE_UNKNOWN`: UInt = 4278190080u;
public const val `SIGNERSCORE_UNSIGNED`: UInt = 2147483648u;
public const val `SIGNERSCORE_W9X_SUSPECT`: UInt = 3221225472u;
public const val `SIGNERSCORE_WHQL`: UInt = 218103813u;
// UNSUPPORTED Rust 2785:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SOURCE_MEDIA_A {
//     pub Reserved: windows_sys::core::PCSTR,
//     pub Tagfile: windows_sys::core::PCSTR,
//     pub Description: windows_sys::core::PCSTR,
//     pub SourcePath: windows_sys::core::PCSTR,
//     pub SourceFile: windows_sys::core::PCSTR,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2796:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SOURCE_MEDIA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2802:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SOURCE_MEDIA_A {
//     pub Reserved: windows_sys::core::PCSTR,
//     pub Tagfile: windows_sys::core::PCSTR,
//     pub Description: windows_sys::core::PCSTR,
//     pub SourcePath: windows_sys::core::PCSTR,
//     pub SourceFile: windows_sys::core::PCSTR,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2813:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SOURCE_MEDIA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2819:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SOURCE_MEDIA_W {
//     pub Reserved: windows_sys::core::PCWSTR,
//     pub Tagfile: windows_sys::core::PCWSTR,
//     pub Description: windows_sys::core::PCWSTR,
//     pub SourcePath: windows_sys::core::PCWSTR,
//     pub SourceFile: windows_sys::core::PCWSTR,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2830:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SOURCE_MEDIA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2836:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SOURCE_MEDIA_W {
//     pub Reserved: windows_sys::core::PCWSTR,
//     pub Tagfile: windows_sys::core::PCWSTR,
//     pub Description: windows_sys::core::PCWSTR,
//     pub SourcePath: windows_sys::core::PCWSTR,
//     pub SourceFile: windows_sys::core::PCWSTR,
//     pub Flags: u32,
// }

// UNSUPPORTED Rust 2847:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SOURCE_MEDIA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SPCRP_CHARACTERISTICS`: UInt = 27u;
public const val `SPCRP_DEVTYPE`: UInt = 25u;
public const val `SPCRP_EXCLUSIVE`: UInt = 26u;
public const val `SPCRP_LOWERFILTERS`: UInt = 18u;
public const val `SPCRP_MAXIMUM_PROPERTY`: UInt = 28u;
public const val `SPCRP_SECURITY`: UInt = 23u;
public const val `SPCRP_SECURITY_SDS`: UInt = 24u;
public const val `SPCRP_UPPERFILTERS`: UInt = 17u;
public const val `SPDIT_CLASSDRIVER`: `SETUP_DI_DRIVER_TYPE` = 1u;
public const val `SPDIT_COMPATDRIVER`: `SETUP_DI_DRIVER_TYPE` = 2u;
public const val `SPDIT_NODRIVER`: UInt = 0u;
public const val `SPDRP_ADDRESS`: `SETUP_DI_REGISTRY_PROPERTY` = 28u;
public const val `SPDRP_BASE_CONTAINERID`: `SETUP_DI_REGISTRY_PROPERTY` = 36u;
public const val `SPDRP_BUSNUMBER`: `SETUP_DI_REGISTRY_PROPERTY` = 21u;
public const val `SPDRP_BUSTYPEGUID`: `SETUP_DI_REGISTRY_PROPERTY` = 19u;
public const val `SPDRP_CAPABILITIES`: `SETUP_DI_REGISTRY_PROPERTY` = 15u;
public const val `SPDRP_CHARACTERISTICS`: `SETUP_DI_REGISTRY_PROPERTY` = 27u;
public const val `SPDRP_CLASS`: `SETUP_DI_REGISTRY_PROPERTY` = 7u;
public const val `SPDRP_CLASSGUID`: `SETUP_DI_REGISTRY_PROPERTY` = 8u;
public const val `SPDRP_COMPATIBLEIDS`: `SETUP_DI_REGISTRY_PROPERTY` = 2u;
public const val `SPDRP_CONFIGFLAGS`: `SETUP_DI_REGISTRY_PROPERTY` = 10u;
public const val `SPDRP_DEVICEDESC`: `SETUP_DI_REGISTRY_PROPERTY` = 0u;
public const val `SPDRP_DEVICE_POWER_DATA`: `SETUP_DI_REGISTRY_PROPERTY` = 30u;
public const val `SPDRP_DEVTYPE`: `SETUP_DI_REGISTRY_PROPERTY` = 25u;
public const val `SPDRP_DRIVER`: `SETUP_DI_REGISTRY_PROPERTY` = 9u;
public const val `SPDRP_ENUMERATOR_NAME`: `SETUP_DI_REGISTRY_PROPERTY` = 22u;
public const val `SPDRP_EXCLUSIVE`: `SETUP_DI_REGISTRY_PROPERTY` = 26u;
public const val `SPDRP_FRIENDLYNAME`: `SETUP_DI_REGISTRY_PROPERTY` = 12u;
public const val `SPDRP_HARDWAREID`: `SETUP_DI_REGISTRY_PROPERTY` = 1u;
public const val `SPDRP_INSTALL_STATE`: `SETUP_DI_REGISTRY_PROPERTY` = 34u;
public const val `SPDRP_LEGACYBUSTYPE`: `SETUP_DI_REGISTRY_PROPERTY` = 20u;
public const val `SPDRP_LOCATION_INFORMATION`: `SETUP_DI_REGISTRY_PROPERTY` = 13u;
public const val `SPDRP_LOCATION_PATHS`: `SETUP_DI_REGISTRY_PROPERTY` = 35u;
public const val `SPDRP_LOWERFILTERS`: `SETUP_DI_REGISTRY_PROPERTY` = 18u;
public const val `SPDRP_MAXIMUM_PROPERTY`: `SETUP_DI_REGISTRY_PROPERTY` = 37u;
public const val `SPDRP_MFG`: `SETUP_DI_REGISTRY_PROPERTY` = 11u;
public const val `SPDRP_PHYSICAL_DEVICE_OBJECT_NAME`: `SETUP_DI_REGISTRY_PROPERTY` = 14u;
public const val `SPDRP_REMOVAL_POLICY`: `SETUP_DI_REGISTRY_PROPERTY` = 31u;
public const val `SPDRP_REMOVAL_POLICY_HW_DEFAULT`: `SETUP_DI_REGISTRY_PROPERTY` = 32u;
public const val `SPDRP_REMOVAL_POLICY_OVERRIDE`: `SETUP_DI_REGISTRY_PROPERTY` = 33u;
public const val `SPDRP_SECURITY`: `SETUP_DI_REGISTRY_PROPERTY` = 23u;
public const val `SPDRP_SECURITY_SDS`: `SETUP_DI_REGISTRY_PROPERTY` = 24u;
public const val `SPDRP_SERVICE`: `SETUP_DI_REGISTRY_PROPERTY` = 4u;
public const val `SPDRP_UI_NUMBER`: `SETUP_DI_REGISTRY_PROPERTY` = 16u;
public const val `SPDRP_UI_NUMBER_DESC_FORMAT`: `SETUP_DI_REGISTRY_PROPERTY` = 29u;
public const val `SPDRP_UNUSED0`: `SETUP_DI_REGISTRY_PROPERTY` = 3u;
public const val `SPDRP_UNUSED1`: `SETUP_DI_REGISTRY_PROPERTY` = 5u;
public const val `SPDRP_UNUSED2`: `SETUP_DI_REGISTRY_PROPERTY` = 6u;
public const val `SPDRP_UPPERFILTERS`: `SETUP_DI_REGISTRY_PROPERTY` = 17u;
public const val `SPDSL_DISALLOW_NEGATIVE_ADJUST`: UInt = 2u;
public const val `SPDSL_IGNORE_DISK`: UInt = 1u;
public const val `SPFILELOG_FORCENEW`: UInt = 2u;
public const val `SPFILELOG_OEMFILE`: UInt = 1u;
public const val `SPFILELOG_QUERYONLY`: UInt = 4u;
public const val `SPFILELOG_SYSTEMLOG`: UInt = 1u;
public const val `SPFILENOTIFY_BACKUPERROR`: UInt = 22u;
public const val `SPFILENOTIFY_CABINETINFO`: UInt = 16u;
public const val `SPFILENOTIFY_COPYERROR`: UInt = 13u;
public const val `SPFILENOTIFY_DELETEERROR`: UInt = 7u;
public const val `SPFILENOTIFY_ENDBACKUP`: UInt = 23u;
public const val `SPFILENOTIFY_ENDCOPY`: UInt = 12u;
public const val `SPFILENOTIFY_ENDDELETE`: UInt = 6u;
public const val `SPFILENOTIFY_ENDQUEUE`: UInt = 2u;
public const val `SPFILENOTIFY_ENDREGISTRATION`: UInt = 32u;
public const val `SPFILENOTIFY_ENDRENAME`: UInt = 9u;
public const val `SPFILENOTIFY_ENDSUBQUEUE`: UInt = 4u;
public const val `SPFILENOTIFY_FILEEXTRACTED`: UInt = 19u;
public const val `SPFILENOTIFY_FILEINCABINET`: UInt = 17u;
public const val `SPFILENOTIFY_FILEOPDELAYED`: UInt = 20u;
public const val `SPFILENOTIFY_LANGMISMATCH`: UInt = 65536u;
public const val `SPFILENOTIFY_NEEDMEDIA`: UInt = 14u;
public const val `SPFILENOTIFY_NEEDNEWCABINET`: UInt = 18u;
public const val `SPFILENOTIFY_QUEUESCAN`: UInt = 15u;
public const val `SPFILENOTIFY_QUEUESCAN_EX`: UInt = 24u;
public const val `SPFILENOTIFY_QUEUESCAN_SIGNERINFO`: UInt = 64u;
public const val `SPFILENOTIFY_RENAMEERROR`: UInt = 10u;
public const val `SPFILENOTIFY_STARTBACKUP`: UInt = 21u;
public const val `SPFILENOTIFY_STARTCOPY`: UInt = 11u;
public const val `SPFILENOTIFY_STARTDELETE`: UInt = 5u;
public const val `SPFILENOTIFY_STARTQUEUE`: UInt = 1u;
public const val `SPFILENOTIFY_STARTREGISTRATION`: UInt = 25u;
public const val `SPFILENOTIFY_STARTRENAME`: UInt = 8u;
public const val `SPFILENOTIFY_STARTSUBQUEUE`: UInt = 3u;
public const val `SPFILENOTIFY_TARGETEXISTS`: UInt = 131072u;
public const val `SPFILENOTIFY_TARGETNEWER`: UInt = 262144u;
public const val `SPFILEQ_FILE_IN_USE`: UInt = 1u;
public const val `SPFILEQ_REBOOT_IN_PROGRESS`: UInt = 4u;
public const val `SPFILEQ_REBOOT_RECOMMENDED`: UInt = 2u;
public const val `SPID_ACTIVE`: UInt = 1u;
public const val `SPID_DEFAULT`: UInt = 2u;
public const val `SPID_REMOVED`: UInt = 4u;
public const val `SPINST_ALL`: UInt = 2047u;
public const val `SPINST_BITREG`: UInt = 32u;
public const val `SPINST_COPYINF`: UInt = 512u;
public const val `SPINST_DEVICEINSTALL`: UInt = 1048576u;
public const val `SPINST_FILES`: UInt = 16u;
public const val `SPINST_INI2REG`: UInt = 8u;
public const val `SPINST_INIFILES`: UInt = 2u;
public const val `SPINST_LOGCONFIG`: UInt = 1u;
public const val `SPINST_LOGCONFIGS_ARE_OVERRIDES`: UInt = 262144u;
public const val `SPINST_LOGCONFIG_IS_FORCED`: UInt = 131072u;
public const val `SPINST_PROFILEITEMS`: UInt = 256u;
public const val `SPINST_PROPERTIES`: UInt = 1024u;
public const val `SPINST_REGISTERCALLBACKAWARE`: UInt = 524288u;
public const val `SPINST_REGISTRY`: UInt = 4u;
public const val `SPINST_REGSVR`: UInt = 64u;
public const val `SPINST_SINGLESECTION`: UInt = 65536u;
public const val `SPINST_UNREGSVR`: UInt = 128u;
public const val `SPINT_ACTIVE`: UInt = 1u;
public const val `SPINT_DEFAULT`: UInt = 2u;
public const val `SPINT_REMOVED`: UInt = 4u;
public const val `SPOST_MAX`: UInt = 3u;
public const val `SPOST_NONE`: `OEM_SOURCE_MEDIA_TYPE` = 0u;
public const val `SPOST_PATH`: `OEM_SOURCE_MEDIA_TYPE` = 1u;
public const val `SPOST_URL`: `OEM_SOURCE_MEDIA_TYPE` = 2u;
public const val `SPPSR_ENUM_ADV_DEVICE_PROPERTIES`: UInt = 3u;
public const val `SPPSR_ENUM_BASIC_DEVICE_PROPERTIES`: UInt = 2u;
public const val `SPPSR_SELECT_DEVICE_RESOURCES`: UInt = 1u;
public const val `SPQ_DELAYED_COPY`: UInt = 1u;
public const val `SPQ_FLAG_ABORT_IF_UNSIGNED`: UInt = 2u;
public const val `SPQ_FLAG_BACKUP_AWARE`: UInt = 1u;
public const val `SPQ_FLAG_DO_SHUFFLEMOVE`: UInt = 8u;
public const val `SPQ_FLAG_FILES_MODIFIED`: UInt = 4u;
public const val `SPQ_FLAG_VALID`: UInt = 15u;
public const val `SPQ_SCAN_ACTIVATE_DRP`: `SETUPSCANFILEQUEUE_FLAGS` = 1024u;
public const val `SPQ_SCAN_FILE_COMPARISON`: `SETUPSCANFILEQUEUE_FLAGS` = 512u;
public const val `SPQ_SCAN_FILE_PRESENCE`: `SETUPSCANFILEQUEUE_FLAGS` = 1u;
public const val `SPQ_SCAN_FILE_PRESENCE_WITHOUT_SOURCE`: `SETUPSCANFILEQUEUE_FLAGS` = 256u;
public const val `SPQ_SCAN_FILE_VALIDITY`: `SETUPSCANFILEQUEUE_FLAGS` = 2u;
public const val `SPQ_SCAN_INFORM_USER`: `SETUPSCANFILEQUEUE_FLAGS` = 16u;
public const val `SPQ_SCAN_PRUNE_COPY_QUEUE`: `SETUPSCANFILEQUEUE_FLAGS` = 32u;
public const val `SPQ_SCAN_PRUNE_DELREN`: `SETUPSCANFILEQUEUE_FLAGS` = 128u;
public const val `SPQ_SCAN_USE_CALLBACK`: `SETUPSCANFILEQUEUE_FLAGS` = 4u;
public const val `SPQ_SCAN_USE_CALLBACKEX`: `SETUPSCANFILEQUEUE_FLAGS` = 8u;
public const val `SPQ_SCAN_USE_CALLBACK_SIGNERINFO`: `SETUPSCANFILEQUEUE_FLAGS` = 64u;
public const val `SPRDI_FIND_DUPS`: UInt = 1u;
public const val `SPREG_DLLINSTALL`: UInt = 4u;
public const val `SPREG_GETPROCADDR`: UInt = 2u;
public const val `SPREG_LOADLIBRARY`: UInt = 1u;
public const val `SPREG_REGSVR`: UInt = 3u;
public const val `SPREG_SUCCESS`: UInt = 0u;
public const val `SPREG_TIMEOUT`: UInt = 5u;
public const val `SPREG_UNKNOWN`: UInt = 4294967295u;
public const val `SPSVCINST_ASSOCSERVICE`: `SPSVCINST_FLAGS` = 2u;
public const val `SPSVCINST_CLOBBER_SECURITY`: `SPSVCINST_FLAGS` = 1024u;
public const val `SPSVCINST_DELETEEVENTLOGENTRY`: `SPSVCINST_FLAGS` = 4u;
public typealias `SPSVCINST_FLAGS` = UInt;
public const val `SPSVCINST_NOCLOBBER_DELAYEDAUTOSTART`: `SPSVCINST_FLAGS` = 32768u;
public const val `SPSVCINST_NOCLOBBER_DEPENDENCIES`: `SPSVCINST_FLAGS` = 128u;
public const val `SPSVCINST_NOCLOBBER_DESCRIPTION`: `SPSVCINST_FLAGS` = 256u;
public const val `SPSVCINST_NOCLOBBER_DISPLAYNAME`: `SPSVCINST_FLAGS` = 8u;
public const val `SPSVCINST_NOCLOBBER_ERRORCONTROL`: `SPSVCINST_FLAGS` = 32u;
public const val `SPSVCINST_NOCLOBBER_FAILUREACTIONS`: `SPSVCINST_FLAGS` = 131072u;
public const val `SPSVCINST_NOCLOBBER_LOADORDERGROUP`: `SPSVCINST_FLAGS` = 64u;
public const val `SPSVCINST_NOCLOBBER_REQUIREDPRIVILEGES`: `SPSVCINST_FLAGS` = 4096u;
public const val `SPSVCINST_NOCLOBBER_SERVICESIDTYPE`: `SPSVCINST_FLAGS` = 16384u;
public const val `SPSVCINST_NOCLOBBER_STARTTYPE`: `SPSVCINST_FLAGS` = 16u;
public const val `SPSVCINST_NOCLOBBER_TRIGGERS`: `SPSVCINST_FLAGS` = 8192u;
public const val `SPSVCINST_STARTSERVICE`: `SPSVCINST_FLAGS` = 2048u;
public const val `SPSVCINST_STOPSERVICE`: `SPSVCINST_FLAGS` = 512u;
public const val `SPSVCINST_TAGTOFRONT`: `SPSVCINST_FLAGS` = 1u;
public const val `SPSVCINST_UNIQUE_NAME`: `SPSVCINST_FLAGS` = 65536u;
public const val `SPWPT_SELECTDEVICE`: UInt = 1u;
public const val `SPWP_USE_DEVINFO_DATA`: UInt = 1u;
public const val `SP_ALTPLATFORM_FLAGS_SUITE_MASK`: UInt = 2u;
public const val `SP_ALTPLATFORM_FLAGS_VERSION_RANGE`: UInt = 1u;
// UNSUPPORTED Rust 3019:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_System_Diagnostics_Debug")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_ALTPLATFORM_INFO_V1 {
//     pub cbSize: u32,
//     pub Platform: super::super::System::Diagnostics::Debug::VER_PLATFORM,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub ProcessorArchitecture: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 3031:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_System_Diagnostics_Debug")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_ALTPLATFORM_INFO_V1 {
//     pub cbSize: u32,
//     pub Platform: super::super::System::Diagnostics::Debug::VER_PLATFORM,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub ProcessorArchitecture: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 3043:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// #[derive(Clone, Copy)]
// pub struct SP_ALTPLATFORM_INFO_V2 {
//     pub cbSize: u32,
//     pub Platform: super::super::System::Diagnostics::Debug::VER_PLATFORM,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub ProcessorArchitecture: super::super::System::SystemInformation::PROCESSOR_ARCHITECTURE,
//     pub Anonymous: SP_ALTPLATFORM_INFO_V2_0,
//     pub FirstValidatedMajorVersion: u32,
//     pub FirstValidatedMinorVersion: u32,
// }

// UNSUPPORTED Rust 3057:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// impl Default for SP_ALTPLATFORM_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3064:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// #[derive(Clone, Copy)]
// pub union SP_ALTPLATFORM_INFO_V2_0 {
//     pub Reserved: u16,
//     pub Flags: u16,
// }

// UNSUPPORTED Rust 3072:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// impl Default for SP_ALTPLATFORM_INFO_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3079:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// #[derive(Clone, Copy)]
// pub struct SP_ALTPLATFORM_INFO_V2 {
//     pub cbSize: u32,
//     pub Platform: super::super::System::Diagnostics::Debug::VER_PLATFORM,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub ProcessorArchitecture: super::super::System::SystemInformation::PROCESSOR_ARCHITECTURE,
//     pub Anonymous: SP_ALTPLATFORM_INFO_V2_0,
//     pub FirstValidatedMajorVersion: u32,
//     pub FirstValidatedMinorVersion: u32,
// }

// UNSUPPORTED Rust 3093:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// impl Default for SP_ALTPLATFORM_INFO_V2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3100:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// #[derive(Clone, Copy)]
// pub union SP_ALTPLATFORM_INFO_V2_0 {
//     pub Reserved: u16,
//     pub Flags: u16,
// }

// UNSUPPORTED Rust 3108:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(all(feature = "Win32_System_Diagnostics_Debug", feature = "Win32_System_SystemInformation"))]
// impl Default for SP_ALTPLATFORM_INFO_V2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3115:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_ALTPLATFORM_INFO_V3 {
//     pub cbSize: u32,
//     pub Platform: u32,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub ProcessorArchitecture: u16,
//     pub Anonymous: SP_ALTPLATFORM_INFO_V3_0,
//     pub FirstValidatedMajorVersion: u32,
//     pub FirstValidatedMinorVersion: u32,
//     pub ProductType: u8,
//     pub SuiteMask: u16,
//     pub BuildNumber: u32,
// }

// UNSUPPORTED Rust 3131:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_ALTPLATFORM_INFO_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3137:1: declaration Union has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub union SP_ALTPLATFORM_INFO_V3_0 {
//     pub Reserved: u16,
//     pub Flags: u16,
// }

// UNSUPPORTED Rust 3144:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_ALTPLATFORM_INFO_V3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3150:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_ALTPLATFORM_INFO_V3 {
//     pub cbSize: u32,
//     pub Platform: u32,
//     pub MajorVersion: u32,
//     pub MinorVersion: u32,
//     pub ProcessorArchitecture: u16,
//     pub Anonymous: SP_ALTPLATFORM_INFO_V3_0,
//     pub FirstValidatedMajorVersion: u32,
//     pub FirstValidatedMinorVersion: u32,
//     pub ProductType: u8,
//     pub SuiteMask: u16,
//     pub BuildNumber: u32,
// }

// UNSUPPORTED Rust 3166:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_ALTPLATFORM_INFO_V3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3172:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub union SP_ALTPLATFORM_INFO_V3_0 {
//     pub Reserved: u16,
//     pub Flags: u16,
// }

// UNSUPPORTED Rust 3179:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_ALTPLATFORM_INFO_V3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SP_BACKUP_BACKUPPASS`: UInt = 1u;
public const val `SP_BACKUP_BOOTFILE`: UInt = 8u;
public const val `SP_BACKUP_DEMANDPASS`: UInt = 2u;
// UNSUPPORTED Rust 3188:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V1_A {
//     pub cbSize: u32,
//     pub FullInfPath: [i8; 260],
//     pub FilenameOffset: i32,
// }

// UNSUPPORTED Rust 3196:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V1_A {
//     pub cbSize: u32,
//     pub FullInfPath: [i8; 260],
//     pub FilenameOffset: i32,
// }

// UNSUPPORTED Rust 3210:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3216:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V1_W {
//     pub cbSize: u32,
//     pub FullInfPath: [u16; 260],
//     pub FilenameOffset: i32,
// }

// UNSUPPORTED Rust 3224:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3230:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V1_W {
//     pub cbSize: u32,
//     pub FullInfPath: [u16; 260],
//     pub FilenameOffset: i32,
// }

// UNSUPPORTED Rust 3238:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3244:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V2_A {
//     pub cbSize: u32,
//     pub FullInfPath: [i8; 260],
//     pub FilenameOffset: i32,
//     pub ReinstallInstance: [i8; 260],
// }

// UNSUPPORTED Rust 3253:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3259:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V2_A {
//     pub cbSize: u32,
//     pub FullInfPath: [i8; 260],
//     pub FilenameOffset: i32,
//     pub ReinstallInstance: [i8; 260],
// }

// UNSUPPORTED Rust 3268:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3274:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V2_W {
//     pub cbSize: u32,
//     pub FullInfPath: [u16; 260],
//     pub FilenameOffset: i32,
//     pub ReinstallInstance: [u16; 260],
// }

// UNSUPPORTED Rust 3283:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_BACKUP_QUEUE_PARAMS_V2_W {
//     pub cbSize: u32,
//     pub FullInfPath: [u16; 260],
//     pub FilenameOffset: i32,
//     pub ReinstallInstance: [u16; 260],
// }

// UNSUPPORTED Rust 3298:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_BACKUP_QUEUE_PARAMS_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SP_BACKUP_SPECIAL`: UInt = 4u;
// UNSUPPORTED Rust 3305:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_UI_Controls")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_CLASSIMAGELIST_DATA {
//     pub cbSize: u32,
//     pub ImageList: super::super::UI::Controls::HIMAGELIST,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 3314:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_UI_Controls")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_CLASSIMAGELIST_DATA {
//     pub cbSize: u32,
//     pub ImageList: super::super::UI::Controls::HIMAGELIST,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 3323:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_CLASSINSTALL_HEADER {
//     pub cbSize: u32,
//     pub InstallFunction: DI_FUNCTION,
// }

// UNSUPPORTED Rust 3330:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_CLASSINSTALL_HEADER {
//     pub cbSize: u32,
//     pub InstallFunction: DI_FUNCTION,
// }

public const val `SP_COPY_ALREADYDECOMP`: `SP_COPY_STYLE` = 4194304u;
public const val `SP_COPY_DELETESOURCE`: `SP_COPY_STYLE` = 1u;
public const val `SP_COPY_FORCE_IN_USE`: `SP_COPY_STYLE` = 512u;
public const val `SP_COPY_FORCE_NEWER`: `SP_COPY_STYLE` = 8192u;
public const val `SP_COPY_FORCE_NOOVERWRITE`: `SP_COPY_STYLE` = 4096u;
public const val `SP_COPY_HARDLINK`: `SP_COPY_STYLE` = 268435456u;
public const val `SP_COPY_INBOX_INF`: `SP_COPY_STYLE` = 134217728u;
public const val `SP_COPY_IN_USE_NEEDS_REBOOT`: `SP_COPY_STYLE` = 256u;
public const val `SP_COPY_IN_USE_TRY_RENAME`: `SP_COPY_STYLE` = 67108864u;
public const val `SP_COPY_LANGUAGEAWARE`: `SP_COPY_STYLE` = 32u;
public const val `SP_COPY_NEWER`: `SP_COPY_STYLE` = 4u;
public const val `SP_COPY_NEWER_ONLY`: `SP_COPY_STYLE` = 65536u;
public const val `SP_COPY_NEWER_OR_SAME`: `SP_COPY_STYLE` = 4u;
public const val `SP_COPY_NOBROWSE`: `SP_COPY_STYLE` = 32768u;
public const val `SP_COPY_NODECOMP`: `SP_COPY_STYLE` = 16u;
public const val `SP_COPY_NOOVERWRITE`: `SP_COPY_STYLE` = 8u;
public const val `SP_COPY_NOPRUNE`: `SP_COPY_STYLE` = 1048576u;
public const val `SP_COPY_NOSKIP`: `SP_COPY_STYLE` = 1024u;
public const val `SP_COPY_OEMINF_CATALOG_ONLY`: `SP_COPY_STYLE` = 262144u;
public const val `SP_COPY_OEM_F6_INF`: `SP_COPY_STYLE` = 2097152u;
public const val `SP_COPY_PNPLOCKED`: `SP_COPY_STYLE` = 33554432u;
public const val `SP_COPY_REPLACEONLY`: `SP_COPY_STYLE` = 2u;
public const val `SP_COPY_REPLACE_BOOT_FILE`: `SP_COPY_STYLE` = 524288u;
public const val `SP_COPY_RESERVED`: `SP_COPY_STYLE` = 131072u;
public const val `SP_COPY_SOURCEPATH_ABSOLUTE`: `SP_COPY_STYLE` = 128u;
public const val `SP_COPY_SOURCE_ABSOLUTE`: `SP_COPY_STYLE` = 64u;
public typealias `SP_COPY_STYLE` = UInt;
public const val `SP_COPY_WARNIFSKIP`: `SP_COPY_STYLE` = 16384u;
public const val `SP_COPY_WINDOWS_SIGNED`: `SP_COPY_STYLE` = 16777216u;
// UNSUPPORTED Rust 3366:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DETECTDEVICE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub DetectProgressNotify: PDETECT_PROGRESS_NOTIFY,
//     pub ProgressNotifyParam: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3374:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DETECTDEVICE_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3380:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DETECTDEVICE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub DetectProgressNotify: PDETECT_PROGRESS_NOTIFY,
//     pub ProgressNotifyParam: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 3388:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DETECTDEVICE_PARAMS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3394:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_DEVICE_INTERFACE_DATA {
//     pub cbSize: u32,
//     pub InterfaceClassGuid: windows_sys::core::GUID,
//     pub Flags: u32,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 3403:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_DEVICE_INTERFACE_DATA {
//     pub cbSize: u32,
//     pub InterfaceClassGuid: windows_sys::core::GUID,
//     pub Flags: u32,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 3412:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DEVICE_INTERFACE_DETAIL_DATA_A {
//     pub cbSize: u32,
//     pub DevicePath: [i8; 1],
// }

// UNSUPPORTED Rust 3419:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DEVICE_INTERFACE_DETAIL_DATA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3425:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DEVICE_INTERFACE_DETAIL_DATA_A {
//     pub cbSize: u32,
//     pub DevicePath: [i8; 1],
// }

// UNSUPPORTED Rust 3432:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DEVICE_INTERFACE_DETAIL_DATA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3438:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DEVICE_INTERFACE_DETAIL_DATA_W {
//     pub cbSize: u32,
//     pub DevicePath: [u16; 1],
// }

// UNSUPPORTED Rust 3445:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DEVICE_INTERFACE_DETAIL_DATA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DEVICE_INTERFACE_DETAIL_DATA_W {
//     pub cbSize: u32,
//     pub DevicePath: [u16; 1],
// }

// UNSUPPORTED Rust 3458:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DEVICE_INTERFACE_DETAIL_DATA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3464:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_DEVINFO_DATA {
//     pub cbSize: u32,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub DevInst: u32,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 3473:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_DEVINFO_DATA {
//     pub cbSize: u32,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub DevInst: u32,
//     pub Reserved: usize,
// }

// UNSUPPORTED Rust 3482:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINFO_LIST_DETAIL_DATA_A {
//     pub cbSize: u32,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub RemoteMachineHandle: super::super::Foundation::HANDLE,
//     pub RemoteMachineName: [i8; 263],
// }

// UNSUPPORTED Rust 3491:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DEVINFO_LIST_DETAIL_DATA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3497:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINFO_LIST_DETAIL_DATA_A {
//     pub cbSize: u32,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub RemoteMachineHandle: super::super::Foundation::HANDLE,
//     pub RemoteMachineName: [i8; 263],
// }

// UNSUPPORTED Rust 3506:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DEVINFO_LIST_DETAIL_DATA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3512:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINFO_LIST_DETAIL_DATA_W {
//     pub cbSize: u32,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub RemoteMachineHandle: super::super::Foundation::HANDLE,
//     pub RemoteMachineName: [u16; 263],
// }

// UNSUPPORTED Rust 3521:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DEVINFO_LIST_DETAIL_DATA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3527:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINFO_LIST_DETAIL_DATA_W {
//     pub cbSize: u32,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub RemoteMachineHandle: super::super::Foundation::HANDLE,
//     pub RemoteMachineName: [u16; 263],
// }

// UNSUPPORTED Rust 3536:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DEVINFO_LIST_DETAIL_DATA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3542:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINSTALL_PARAMS_A {
//     pub cbSize: u32,
//     pub Flags: SETUP_DI_DEVICE_INSTALL_FLAGS,
//     pub FlagsEx: SETUP_DI_DEVICE_INSTALL_FLAGS_EX,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub InstallMsgHandler: PSP_FILE_CALLBACK_A,
//     pub InstallMsgHandlerContext: *mut core::ffi::c_void,
//     pub FileQueue: *mut core::ffi::c_void,
//     pub ClassInstallReserved: usize,
//     pub Reserved: u32,
//     pub DriverPath: [i8; 260],
// }

// UNSUPPORTED Rust 3557:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DEVINSTALL_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3563:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINSTALL_PARAMS_A {
//     pub cbSize: u32,
//     pub Flags: SETUP_DI_DEVICE_INSTALL_FLAGS,
//     pub FlagsEx: SETUP_DI_DEVICE_INSTALL_FLAGS_EX,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub InstallMsgHandler: PSP_FILE_CALLBACK_A,
//     pub InstallMsgHandlerContext: *mut core::ffi::c_void,
//     pub FileQueue: *mut core::ffi::c_void,
//     pub ClassInstallReserved: usize,
//     pub Reserved: u32,
//     pub DriverPath: [i8; 260],
// }

// UNSUPPORTED Rust 3578:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DEVINSTALL_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3584:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINSTALL_PARAMS_W {
//     pub cbSize: u32,
//     pub Flags: SETUP_DI_DEVICE_INSTALL_FLAGS,
//     pub FlagsEx: SETUP_DI_DEVICE_INSTALL_FLAGS_EX,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub InstallMsgHandler: PSP_FILE_CALLBACK_W,
//     pub InstallMsgHandlerContext: *mut core::ffi::c_void,
//     pub FileQueue: *mut core::ffi::c_void,
//     pub ClassInstallReserved: usize,
//     pub Reserved: u32,
//     pub DriverPath: [u16; 260],
// }

// UNSUPPORTED Rust 3599:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DEVINSTALL_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3605:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DEVINSTALL_PARAMS_W {
//     pub cbSize: u32,
//     pub Flags: SETUP_DI_DEVICE_INSTALL_FLAGS,
//     pub FlagsEx: SETUP_DI_DEVICE_INSTALL_FLAGS_EX,
//     pub hwndParent: super::super::Foundation::HWND,
//     pub InstallMsgHandler: PSP_FILE_CALLBACK_W,
//     pub InstallMsgHandlerContext: *mut core::ffi::c_void,
//     pub FileQueue: *mut core::ffi::c_void,
//     pub ClassInstallReserved: usize,
//     pub Reserved: u32,
//     pub DriverPath: [u16; 260],
// }

// UNSUPPORTED Rust 3620:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DEVINSTALL_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3626:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V1_A {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [i8; 256],
//     pub MfgName: [i8; 256],
//     pub ProviderName: [i8; 256],
// }

// UNSUPPORTED Rust 3637:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DRVINFO_DATA_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3643:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V1_A {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [i8; 256],
//     pub MfgName: [i8; 256],
//     pub ProviderName: [i8; 256],
// }

// UNSUPPORTED Rust 3654:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DRVINFO_DATA_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3660:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V1_W {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [u16; 256],
//     pub MfgName: [u16; 256],
//     pub ProviderName: [u16; 256],
// }

// UNSUPPORTED Rust 3671:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DRVINFO_DATA_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V1_W {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [u16; 256],
//     pub MfgName: [u16; 256],
//     pub ProviderName: [u16; 256],
// }

// UNSUPPORTED Rust 3688:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DRVINFO_DATA_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3694:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V2_A {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [i8; 256],
//     pub MfgName: [i8; 256],
//     pub ProviderName: [i8; 256],
//     pub DriverDate: super::super::Foundation::FILETIME,
//     pub DriverVersion: u64,
// }

// UNSUPPORTED Rust 3707:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DRVINFO_DATA_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3713:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V2_A {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [i8; 256],
//     pub MfgName: [i8; 256],
//     pub ProviderName: [i8; 256],
//     pub DriverDate: super::super::Foundation::FILETIME,
//     pub DriverVersion: u64,
// }

// UNSUPPORTED Rust 3726:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DRVINFO_DATA_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3732:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V2_W {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [u16; 256],
//     pub MfgName: [u16; 256],
//     pub ProviderName: [u16; 256],
//     pub DriverDate: super::super::Foundation::FILETIME,
//     pub DriverVersion: u64,
// }

// UNSUPPORTED Rust 3745:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DRVINFO_DATA_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3751:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DATA_V2_W {
//     pub cbSize: u32,
//     pub DriverType: u32,
//     pub Reserved: usize,
//     pub Description: [u16; 256],
//     pub MfgName: [u16; 256],
//     pub ProviderName: [u16; 256],
//     pub DriverDate: super::super::Foundation::FILETIME,
//     pub DriverVersion: u64,
// }

// UNSUPPORTED Rust 3764:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DRVINFO_DATA_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3770:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DETAIL_DATA_A {
//     pub cbSize: u32,
//     pub InfDate: super::super::Foundation::FILETIME,
//     pub CompatIDsOffset: u32,
//     pub CompatIDsLength: u32,
//     pub Reserved: usize,
//     pub SectionName: [i8; 256],
//     pub InfFileName: [i8; 260],
//     pub DrvDescription: [i8; 256],
//     pub HardwareID: [i8; 1],
// }

// UNSUPPORTED Rust 3784:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DRVINFO_DETAIL_DATA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3790:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DETAIL_DATA_A {
//     pub cbSize: u32,
//     pub InfDate: super::super::Foundation::FILETIME,
//     pub CompatIDsOffset: u32,
//     pub CompatIDsLength: u32,
//     pub Reserved: usize,
//     pub SectionName: [i8; 256],
//     pub InfFileName: [i8; 260],
//     pub DrvDescription: [i8; 256],
//     pub HardwareID: [i8; 1],
// }

// UNSUPPORTED Rust 3804:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DRVINFO_DETAIL_DATA_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3810:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DETAIL_DATA_W {
//     pub cbSize: u32,
//     pub InfDate: super::super::Foundation::FILETIME,
//     pub CompatIDsOffset: u32,
//     pub CompatIDsLength: u32,
//     pub Reserved: usize,
//     pub SectionName: [u16; 256],
//     pub InfFileName: [u16; 260],
//     pub DrvDescription: [u16; 256],
//     pub HardwareID: [u16; 1],
// }

// UNSUPPORTED Rust 3824:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_DRVINFO_DETAIL_DATA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3830:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_DRVINFO_DETAIL_DATA_W {
//     pub cbSize: u32,
//     pub InfDate: super::super::Foundation::FILETIME,
//     pub CompatIDsOffset: u32,
//     pub CompatIDsLength: u32,
//     pub Reserved: usize,
//     pub SectionName: [u16; 256],
//     pub InfFileName: [u16; 260],
//     pub DrvDescription: [u16; 256],
//     pub HardwareID: [u16; 1],
// }

// UNSUPPORTED Rust 3844:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_DRVINFO_DETAIL_DATA_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3850:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_DRVINSTALL_PARAMS {
//     pub cbSize: u32,
//     pub Rank: u32,
//     pub Flags: SETUP_DI_DRIVER_INSTALL_FLAGS,
//     pub PrivateData: usize,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_DRVINSTALL_PARAMS {
//     pub cbSize: u32,
//     pub Rank: u32,
//     pub Flags: SETUP_DI_DRIVER_INSTALL_FLAGS,
//     pub PrivateData: usize,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 3870:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_ENABLECLASS_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub EnableMessage: u32,
// }

// UNSUPPORTED Rust 3878:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_ENABLECLASS_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub ClassGuid: windows_sys::core::GUID,
//     pub EnableMessage: u32,
// }

// UNSUPPORTED Rust 3886:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_FILE_COPY_PARAMS_A {
//     pub cbSize: u32,
//     pub QueueHandle: *mut core::ffi::c_void,
//     pub SourceRootPath: windows_sys::core::PCSTR,
//     pub SourcePath: windows_sys::core::PCSTR,
//     pub SourceFilename: windows_sys::core::PCSTR,
//     pub SourceDescription: windows_sys::core::PCSTR,
//     pub SourceTagfile: windows_sys::core::PCSTR,
//     pub TargetDirectory: windows_sys::core::PCSTR,
//     pub TargetFilename: windows_sys::core::PCSTR,
//     pub CopyStyle: u32,
//     pub LayoutInf: *mut core::ffi::c_void,
//     pub SecurityDescriptor: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 3903:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_FILE_COPY_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3909:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_FILE_COPY_PARAMS_A {
//     pub cbSize: u32,
//     pub QueueHandle: *mut core::ffi::c_void,
//     pub SourceRootPath: windows_sys::core::PCSTR,
//     pub SourcePath: windows_sys::core::PCSTR,
//     pub SourceFilename: windows_sys::core::PCSTR,
//     pub SourceDescription: windows_sys::core::PCSTR,
//     pub SourceTagfile: windows_sys::core::PCSTR,
//     pub TargetDirectory: windows_sys::core::PCSTR,
//     pub TargetFilename: windows_sys::core::PCSTR,
//     pub CopyStyle: u32,
//     pub LayoutInf: *mut core::ffi::c_void,
//     pub SecurityDescriptor: windows_sys::core::PCSTR,
// }

// UNSUPPORTED Rust 3926:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_FILE_COPY_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3932:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_FILE_COPY_PARAMS_W {
//     pub cbSize: u32,
//     pub QueueHandle: *mut core::ffi::c_void,
//     pub SourceRootPath: windows_sys::core::PCWSTR,
//     pub SourcePath: windows_sys::core::PCWSTR,
//     pub SourceFilename: windows_sys::core::PCWSTR,
//     pub SourceDescription: windows_sys::core::PCWSTR,
//     pub SourceTagfile: windows_sys::core::PCWSTR,
//     pub TargetDirectory: windows_sys::core::PCWSTR,
//     pub TargetFilename: windows_sys::core::PCWSTR,
//     pub CopyStyle: u32,
//     pub LayoutInf: *mut core::ffi::c_void,
//     pub SecurityDescriptor: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 3949:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_FILE_COPY_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3955:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_FILE_COPY_PARAMS_W {
//     pub cbSize: u32,
//     pub QueueHandle: *mut core::ffi::c_void,
//     pub SourceRootPath: windows_sys::core::PCWSTR,
//     pub SourcePath: windows_sys::core::PCWSTR,
//     pub SourceFilename: windows_sys::core::PCWSTR,
//     pub SourceDescription: windows_sys::core::PCWSTR,
//     pub SourceTagfile: windows_sys::core::PCWSTR,
//     pub TargetDirectory: windows_sys::core::PCWSTR,
//     pub TargetFilename: windows_sys::core::PCWSTR,
//     pub CopyStyle: u32,
//     pub LayoutInf: *mut core::ffi::c_void,
//     pub SecurityDescriptor: windows_sys::core::PCWSTR,
// }

// UNSUPPORTED Rust 3972:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_FILE_COPY_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SP_FLAG_CABINETCONTINUATION`: UInt = 2048u;
// UNSUPPORTED Rust 3979:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_INF_INFORMATION {
//     pub InfStyle: INF_STYLE,
//     pub InfCount: u32,
//     pub VersionData: [u8; 1],
// }

// UNSUPPORTED Rust 3987:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_INF_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3993:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_INF_INFORMATION {
//     pub InfStyle: INF_STYLE,
//     pub InfCount: u32,
//     pub VersionData: [u8; 1],
// }

// UNSUPPORTED Rust 4001:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_INF_INFORMATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4007:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V1_A {
//     pub cbSize: u32,
//     pub CatalogFile: [i8; 260],
//     pub DigitalSigner: [i8; 260],
//     pub DigitalSignerVersion: [i8; 260],
// }

// UNSUPPORTED Rust 4016:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_INF_SIGNER_INFO_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4022:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V1_A {
//     pub cbSize: u32,
//     pub CatalogFile: [i8; 260],
//     pub DigitalSigner: [i8; 260],
//     pub DigitalSignerVersion: [i8; 260],
// }

// UNSUPPORTED Rust 4031:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_INF_SIGNER_INFO_V1_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4037:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V1_W {
//     pub cbSize: u32,
//     pub CatalogFile: [u16; 260],
//     pub DigitalSigner: [u16; 260],
//     pub DigitalSignerVersion: [u16; 260],
// }

// UNSUPPORTED Rust 4046:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_INF_SIGNER_INFO_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V1_W {
//     pub cbSize: u32,
//     pub CatalogFile: [u16; 260],
//     pub DigitalSigner: [u16; 260],
//     pub DigitalSignerVersion: [u16; 260],
// }

// UNSUPPORTED Rust 4061:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_INF_SIGNER_INFO_V1_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4067:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V2_A {
//     pub cbSize: u32,
//     pub CatalogFile: [i8; 260],
//     pub DigitalSigner: [i8; 260],
//     pub DigitalSignerVersion: [i8; 260],
//     pub SignerScore: u32,
// }

// UNSUPPORTED Rust 4077:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_INF_SIGNER_INFO_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4083:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V2_A {
//     pub cbSize: u32,
//     pub CatalogFile: [i8; 260],
//     pub DigitalSigner: [i8; 260],
//     pub DigitalSignerVersion: [i8; 260],
//     pub SignerScore: u32,
// }

// UNSUPPORTED Rust 4093:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_INF_SIGNER_INFO_V2_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4099:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V2_W {
//     pub cbSize: u32,
//     pub CatalogFile: [u16; 260],
//     pub DigitalSigner: [u16; 260],
//     pub DigitalSignerVersion: [u16; 260],
//     pub SignerScore: u32,
// }

// UNSUPPORTED Rust 4109:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_INF_SIGNER_INFO_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4115:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_INF_SIGNER_INFO_V2_W {
//     pub cbSize: u32,
//     pub CatalogFile: [u16; 260],
//     pub DigitalSigner: [u16; 260],
//     pub DigitalSignerVersion: [u16; 260],
//     pub SignerScore: u32,
// }

// UNSUPPORTED Rust 4125:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_INF_SIGNER_INFO_V2_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4131:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_UI_Controls")]
// #[derive(Clone, Copy)]
// pub struct SP_INSTALLWIZARD_DATA {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Flags: u32,
//     pub DynamicPages: [super::super::UI::Controls::HPROPSHEETPAGE; 20],
//     pub NumDynamicPages: u32,
//     pub DynamicPageFlags: u32,
//     pub PrivateFlags: u32,
//     pub PrivateData: super::super::Foundation::LPARAM,
//     pub hwndWizardDlg: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 4145:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_UI_Controls")]
// impl Default for SP_INSTALLWIZARD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4152:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_UI_Controls")]
// #[derive(Clone, Copy)]
// pub struct SP_INSTALLWIZARD_DATA {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Flags: u32,
//     pub DynamicPages: [super::super::UI::Controls::HPROPSHEETPAGE; 20],
//     pub NumDynamicPages: u32,
//     pub DynamicPageFlags: u32,
//     pub PrivateFlags: u32,
//     pub PrivateData: super::super::Foundation::LPARAM,
//     pub hwndWizardDlg: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 4166:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_UI_Controls")]
// impl Default for SP_INSTALLWIZARD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SP_MAX_MACHINENAME_LENGTH`: UInt = 263u;
// UNSUPPORTED Rust 4174:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_UI_Controls")]
// #[derive(Clone, Copy)]
// pub struct SP_NEWDEVICEWIZARD_DATA {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Flags: u32,
//     pub DynamicPages: [super::super::UI::Controls::HPROPSHEETPAGE; 20],
//     pub NumDynamicPages: u32,
//     pub hwndWizardDlg: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 4185:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// #[cfg(feature = "Win32_UI_Controls")]
// impl Default for SP_NEWDEVICEWIZARD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4192:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_UI_Controls")]
// #[derive(Clone, Copy)]
// pub struct SP_NEWDEVICEWIZARD_DATA {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Flags: u32,
//     pub DynamicPages: [super::super::UI::Controls::HPROPSHEETPAGE; 20],
//     pub NumDynamicPages: u32,
//     pub hwndWizardDlg: super::super::Foundation::HWND,
// }

// UNSUPPORTED Rust 4203:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[cfg(feature = "Win32_UI_Controls")]
// impl Default for SP_NEWDEVICEWIZARD_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4210:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_ORIGINAL_FILE_INFO_A {
//     pub cbSize: u32,
//     pub OriginalInfName: [i8; 260],
//     pub OriginalCatalogName: [i8; 260],
// }

// UNSUPPORTED Rust 4218:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_ORIGINAL_FILE_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4224:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_ORIGINAL_FILE_INFO_A {
//     pub cbSize: u32,
//     pub OriginalInfName: [i8; 260],
//     pub OriginalCatalogName: [i8; 260],
// }

// UNSUPPORTED Rust 4232:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_ORIGINAL_FILE_INFO_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4238:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_ORIGINAL_FILE_INFO_W {
//     pub cbSize: u32,
//     pub OriginalInfName: [u16; 260],
//     pub OriginalCatalogName: [u16; 260],
// }

// UNSUPPORTED Rust 4246:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_ORIGINAL_FILE_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4252:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_ORIGINAL_FILE_INFO_W {
//     pub cbSize: u32,
//     pub OriginalInfName: [u16; 260],
//     pub OriginalCatalogName: [u16; 260],
// }

// UNSUPPORTED Rust 4260:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_ORIGINAL_FILE_INFO_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4266:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SP_POWERMESSAGEWAKE_PARAMS_A {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub PowerMessageWake: [i8; 512],
// }

// UNSUPPORTED Rust 4272:1: declaration Impl has no candidate rule
// impl Default for SP_POWERMESSAGEWAKE_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4277:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_POWERMESSAGEWAKE_PARAMS_W {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub PowerMessageWake: [u16; 512],
// }

// UNSUPPORTED Rust 4284:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_POWERMESSAGEWAKE_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4290:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_POWERMESSAGEWAKE_PARAMS_W {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub PowerMessageWake: [u16; 512],
// }

// UNSUPPORTED Rust 4297:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_POWERMESSAGEWAKE_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4303:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_PROPCHANGE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub StateChange: SETUP_DI_STATE_CHANGE,
//     pub Scope: SETUP_DI_PROPERTY_CHANGE_SCOPE,
//     pub HwProfile: u32,
// }

// UNSUPPORTED Rust 4312:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_PROPCHANGE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub StateChange: SETUP_DI_STATE_CHANGE,
//     pub Scope: SETUP_DI_PROPERTY_CHANGE_SCOPE,
//     pub HwProfile: u32,
// }

// UNSUPPORTED Rust 4321:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_PROPSHEETPAGE_REQUEST {
//     pub cbSize: u32,
//     pub PageRequested: u32,
//     pub DeviceInfoSet: HDEVINFO,
//     pub DeviceInfoData: *mut SP_DEVINFO_DATA,
// }

// UNSUPPORTED Rust 4330:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_PROPSHEETPAGE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4336:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_PROPSHEETPAGE_REQUEST {
//     pub cbSize: u32,
//     pub PageRequested: u32,
//     pub DeviceInfoSet: HDEVINFO,
//     pub DeviceInfoData: *mut SP_DEVINFO_DATA,
// }

// UNSUPPORTED Rust 4345:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_PROPSHEETPAGE_REQUEST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4351:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_REGISTER_CONTROL_STATUSA {
//     pub cbSize: u32,
//     pub FileName: windows_sys::core::PCSTR,
//     pub Win32Error: u32,
//     pub FailureCode: u32,
// }

// UNSUPPORTED Rust 4360:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_REGISTER_CONTROL_STATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4366:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_REGISTER_CONTROL_STATUSA {
//     pub cbSize: u32,
//     pub FileName: windows_sys::core::PCSTR,
//     pub Win32Error: u32,
//     pub FailureCode: u32,
// }

// UNSUPPORTED Rust 4375:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_REGISTER_CONTROL_STATUSA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4381:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_REGISTER_CONTROL_STATUSW {
//     pub cbSize: u32,
//     pub FileName: windows_sys::core::PCWSTR,
//     pub Win32Error: u32,
//     pub FailureCode: u32,
// }

// UNSUPPORTED Rust 4390:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_REGISTER_CONTROL_STATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4396:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_REGISTER_CONTROL_STATUSW {
//     pub cbSize: u32,
//     pub FileName: windows_sys::core::PCWSTR,
//     pub Win32Error: u32,
//     pub FailureCode: u32,
// }

// UNSUPPORTED Rust 4405:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_REGISTER_CONTROL_STATUSW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4411:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_REMOVEDEVICE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Scope: SETUP_DI_REMOVE_DEVICE_SCOPE,
//     pub HwProfile: u32,
// }

// UNSUPPORTED Rust 4419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_REMOVEDEVICE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Scope: SETUP_DI_REMOVE_DEVICE_SCOPE,
//     pub HwProfile: u32,
// }

// UNSUPPORTED Rust 4427:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SP_SELECTDEVICE_PARAMS_A {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Title: [i8; 60],
//     pub Instructions: [i8; 256],
//     pub ListLabel: [i8; 30],
//     pub SubTitle: [i8; 256],
//     pub Reserved: [u8; 2],
// }

// UNSUPPORTED Rust 4437:1: declaration Impl has no candidate rule
// impl Default for SP_SELECTDEVICE_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4442:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_SELECTDEVICE_PARAMS_W {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Title: [u16; 60],
//     pub Instructions: [u16; 256],
//     pub ListLabel: [u16; 30],
//     pub SubTitle: [u16; 256],
// }

// UNSUPPORTED Rust 4452:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_SELECTDEVICE_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_SELECTDEVICE_PARAMS_W {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Title: [u16; 60],
//     pub Instructions: [u16; 256],
//     pub ListLabel: [u16; 30],
//     pub SubTitle: [u16; 256],
// }

// UNSUPPORTED Rust 4468:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_SELECTDEVICE_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4474:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SP_TROUBLESHOOTER_PARAMS_A {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub ChmFile: [i8; 260],
//     pub HtmlTroubleShooter: [i8; 260],
// }

// UNSUPPORTED Rust 4481:1: declaration Impl has no candidate rule
// impl Default for SP_TROUBLESHOOTER_PARAMS_A {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4486:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct SP_TROUBLESHOOTER_PARAMS_W {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub ChmFile: [u16; 260],
//     pub HtmlTroubleShooter: [u16; 260],
// }

// UNSUPPORTED Rust 4494:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for SP_TROUBLESHOOTER_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4500:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct SP_TROUBLESHOOTER_PARAMS_W {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub ChmFile: [u16; 260],
//     pub HtmlTroubleShooter: [u16; 260],
// }

// UNSUPPORTED Rust 4508:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for SP_TROUBLESHOOTER_PARAMS_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4514:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy, Default)]
// pub struct SP_UNREMOVEDEVICE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Scope: u32,
//     pub HwProfile: u32,
// }

// UNSUPPORTED Rust 4522:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy, Default)]
// pub struct SP_UNREMOVEDEVICE_PARAMS {
//     pub ClassInstallHeader: SP_CLASSINSTALL_HEADER,
//     pub Scope: u32,
//     pub HwProfile: u32,
// }

public const val `SRCINFO_DESCRIPTION`: UInt = 3u;
public const val `SRCINFO_FLAGS`: UInt = 4u;
public const val `SRCINFO_PATH`: UInt = 1u;
public const val `SRCINFO_TAGFILE`: UInt = 2u;
public const val `SRCINFO_TAGFILE2`: UInt = 5u;
public const val `SRCLIST_APPEND`: UInt = 512u;
public const val `SRCLIST_NOBROWSE`: UInt = 2u;
public const val `SRCLIST_NOSTRIPPLATFORM`: UInt = 1024u;
public const val `SRCLIST_SUBDIRS`: UInt = 256u;
public const val `SRCLIST_SYSIFADMIN`: UInt = 64u;
public const val `SRCLIST_SYSTEM`: UInt = 16u;
public const val `SRCLIST_TEMPORARY`: UInt = 1u;
public const val `SRCLIST_USER`: UInt = 32u;
public const val `SRC_FLAGS_CABFILE`: UInt = 16u;
public const val `SUOI_FORCEDELETE`: UInt = 1u;
public const val `SUOI_INTERNAL1`: UInt = 2u;
// UNSUPPORTED Rust 4546:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDAUTOLOGGER: windows_sys::core::PCWSTR = windows_sys::core::w!("AddAutoLogger");

// UNSUPPORTED Rust 4547:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDAUTOLOGGERPROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("AddAutoLoggerProvider");

// UNSUPPORTED Rust 4548:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDCHANNEL: windows_sys::core::PCWSTR = windows_sys::core::w!("AddChannel");

// UNSUPPORTED Rust 4549:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDEVENTPROVIDER: windows_sys::core::PCWSTR = windows_sys::core::w!("AddEventProvider");

// UNSUPPORTED Rust 4550:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDFILTER: windows_sys::core::PCWSTR = windows_sys::core::w!("AddFilter");

// UNSUPPORTED Rust 4551:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDIME: windows_sys::core::PCWSTR = windows_sys::core::w!("AddIme");

// UNSUPPORTED Rust 4552:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDINTERFACE: windows_sys::core::PCWSTR = windows_sys::core::w!("AddInterface");

// UNSUPPORTED Rust 4553:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDPOWERSETTING: windows_sys::core::PCWSTR = windows_sys::core::w!("AddPowerSetting");

// UNSUPPORTED Rust 4554:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDPROP: windows_sys::core::PCWSTR = windows_sys::core::w!("AddProperty");

// UNSUPPORTED Rust 4555:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDREG: windows_sys::core::PCWSTR = windows_sys::core::w!("AddReg");

// UNSUPPORTED Rust 4556:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDREGNOCLOBBER: windows_sys::core::PCWSTR = windows_sys::core::w!("AddRegNoClobber");

// UNSUPPORTED Rust 4557:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDSERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("AddService");

// UNSUPPORTED Rust 4558:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_ADDTRIGGER: windows_sys::core::PCWSTR = windows_sys::core::w!("AddTrigger");

// UNSUPPORTED Rust 4559:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_BITREG: windows_sys::core::PCWSTR = windows_sys::core::w!("BitReg");

// UNSUPPORTED Rust 4560:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_CLEANONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("CleanOnly");

// UNSUPPORTED Rust 4561:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_COPYFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("CopyFiles");

// UNSUPPORTED Rust 4562:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_COPYINF: windows_sys::core::PCWSTR = windows_sys::core::w!("CopyINF");

// UNSUPPORTED Rust 4563:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DEFAULTOPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultOption");

// UNSUPPORTED Rust 4564:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DEFDESTDIR: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultDestDir");

// UNSUPPORTED Rust 4565:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DELFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("DelFiles");

// UNSUPPORTED Rust 4566:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DELIME: windows_sys::core::PCWSTR = windows_sys::core::w!("DelIme");

// UNSUPPORTED Rust 4567:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DELPROP: windows_sys::core::PCWSTR = windows_sys::core::w!("DelProperty");

// UNSUPPORTED Rust 4568:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DELREG: windows_sys::core::PCWSTR = windows_sys::core::w!("DelReg");

// UNSUPPORTED Rust 4569:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DELSERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("DelService");

// UNSUPPORTED Rust 4570:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_DESTDIRS: windows_sys::core::PCWSTR = windows_sys::core::w!("DestinationDirs");

// UNSUPPORTED Rust 4571:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_EXCLUDEID: windows_sys::core::PCWSTR = windows_sys::core::w!("ExcludeId");

// UNSUPPORTED Rust 4572:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_FAILUREACTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("FailureActions");

// UNSUPPORTED Rust 4573:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_FEATURESCORE: windows_sys::core::PCWSTR = windows_sys::core::w!("FeatureScore");

// UNSUPPORTED Rust 4574:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_FILTERLEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("FilterLevel");

// UNSUPPORTED Rust 4575:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_FILTERPOSITION: windows_sys::core::PCWSTR = windows_sys::core::w!("FilterPosition");

// UNSUPPORTED Rust 4576:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_HARDWARE: windows_sys::core::PCWSTR = windows_sys::core::w!("Hardware");

// UNSUPPORTED Rust 4577:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_IMPORTCHANNEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ImportChannel");

// UNSUPPORTED Rust 4578:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_INI2REG: windows_sys::core::PCWSTR = windows_sys::core::w!("Ini2Reg");

// UNSUPPORTED Rust 4579:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_LAYOUT_FILE: windows_sys::core::PCWSTR = windows_sys::core::w!("LayoutFile");

// UNSUPPORTED Rust 4580:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_LDIDOEM: windows_sys::core::PCWSTR = windows_sys::core::w!("LdidOEM");

// UNSUPPORTED Rust 4581:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_LFN_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("VarLDID.LFN");

// UNSUPPORTED Rust 4582:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_LISTOPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("ListOptions");

// UNSUPPORTED Rust 4583:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_LOGCONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("LogConfig");

// UNSUPPORTED Rust 4584:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_MODULES: windows_sys::core::PCWSTR = windows_sys::core::w!("Modules");

// UNSUPPORTED Rust 4585:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_OPTIONDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("OptionDesc");

// UNSUPPORTED Rust 4586:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_PHASE1: windows_sys::core::PCWSTR = windows_sys::core::w!("Phase1");

// UNSUPPORTED Rust 4587:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_PROFILEITEMS: windows_sys::core::PCWSTR = windows_sys::core::w!("ProfileItems");

// UNSUPPORTED Rust 4588:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_REGSVR: windows_sys::core::PCWSTR = windows_sys::core::w!("RegisterDlls");

// UNSUPPORTED Rust 4589:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_RENFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("RenFiles");

// UNSUPPORTED Rust 4590:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_SFN_SECTION: windows_sys::core::PCWSTR = windows_sys::core::w!("VarLDID.SFN");

// UNSUPPORTED Rust 4591:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_SRCDISKFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceDisksFiles");

// UNSUPPORTED Rust 4592:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_SRCDISKNAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceDisksNames");

// UNSUPPORTED Rust 4593:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_STRINGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Strings");

// UNSUPPORTED Rust 4594:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_UNREGSVR: windows_sys::core::PCWSTR = windows_sys::core::w!("UnregisterDlls");

// UNSUPPORTED Rust 4595:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_UPDATEAUTOLOGGER: windows_sys::core::PCWSTR = windows_sys::core::w!("UpdateAutoLogger");

// UNSUPPORTED Rust 4596:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_UPDATEINIFIELDS: windows_sys::core::PCWSTR = windows_sys::core::w!("UpdateIniFields");

// UNSUPPORTED Rust 4597:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_UPDATEINIS: windows_sys::core::PCWSTR = windows_sys::core::w!("UpdateInis");

// UNSUPPORTED Rust 4598:1: non-scalar type Ptr unsupported
// pub const SZ_KEY_UPGRADEONLY: windows_sys::core::PCWSTR = windows_sys::core::w!("UpgradeOnly");

public const val `SetupFileLogChecksum`: `SetupFileLogInfo` = 1;
public const val `SetupFileLogDiskDescription`: `SetupFileLogInfo` = 3;
public const val `SetupFileLogDiskTagfile`: `SetupFileLogInfo` = 2;
public typealias `SetupFileLogInfo` = Int;
public const val `SetupFileLogMax`: `SetupFileLogInfo` = 5;
public const val `SetupFileLogOtherInfo`: `SetupFileLogInfo` = 4;
public const val `SetupFileLogSourceFilename`: `SetupFileLogInfo` = 0;
public typealias `UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS` = UInt;
public const val `fDD_BYTE`: `DD_FLAGS` = 0u;
public const val `fDD_BYTE_AND_WORD`: `DD_FLAGS` = 3u;
public const val `fDD_BusMaster`: `DD_FLAGS` = 4u;
public const val `fDD_DWORD`: `DD_FLAGS` = 2u;
public const val `fDD_NoBusMaster`: `DD_FLAGS` = 0u;
public const val `fDD_TypeA`: `DD_FLAGS` = 8u;
public const val `fDD_TypeB`: `DD_FLAGS` = 16u;
public const val `fDD_TypeF`: `DD_FLAGS` = 24u;
public const val `fDD_TypeStandard`: `DD_FLAGS` = 0u;
public const val `fDD_WORD`: `DD_FLAGS` = 1u;
public const val `fIOD_10_BIT_DECODE`: `IOD_DESFLAGS` = 4u;
public const val `fIOD_12_BIT_DECODE`: `IOD_DESFLAGS` = 8u;
public const val `fIOD_16_BIT_DECODE`: `IOD_DESFLAGS` = 16u;
public const val `fIOD_DECODE`: `IOD_DESFLAGS` = 252u;
public const val `fIOD_IO`: `IOD_DESFLAGS` = 1u;
public const val `fIOD_Memory`: `IOD_DESFLAGS` = 0u;
public const val `fIOD_PASSIVE_DECODE`: `IOD_DESFLAGS` = 64u;
public const val `fIOD_PORT_BAR`: `IOD_DESFLAGS` = 256u;
public const val `fIOD_POSITIVE_DECODE`: `IOD_DESFLAGS` = 32u;
public const val `fIOD_PortType`: `IOD_DESFLAGS` = 1u;
public const val `fIOD_WINDOW_DECODE`: `IOD_DESFLAGS` = 128u;
public const val `fIRQD_Edge`: `IRQD_FLAGS` = 2u;
public const val `fIRQD_Exclusive`: `IRQD_FLAGS` = 0u;
public const val `fIRQD_Level`: `IRQD_FLAGS` = 0u;
public const val `fIRQD_Level_Bit`: `IRQD_FLAGS` = 1u;
public const val `fIRQD_Share`: `IRQD_FLAGS` = 1u;
public const val `fIRQD_Share_Bit`: `IRQD_FLAGS` = 0u;
public const val `fMD_24`: `MD_FLAGS` = 0u;
public const val `fMD_32`: `MD_FLAGS` = 2u;
public const val `fMD_32_24`: `MD_FLAGS` = 2u;
public const val `fMD_Cacheable`: `MD_FLAGS` = 32u;
public const val `fMD_CombinedWrite`: `MD_FLAGS` = 16u;
public const val `fMD_CombinedWriteAllowed`: `MD_FLAGS` = 16u;
public const val `fMD_CombinedWriteDisallowed`: `MD_FLAGS` = 0u;
public const val `fMD_MEMORY_BAR`: `MD_FLAGS` = 128u;
public const val `fMD_MemoryType`: `MD_FLAGS` = 1u;
public const val `fMD_NonCacheable`: `MD_FLAGS` = 0u;
public const val `fMD_Pref`: `MD_FLAGS` = 4u;
public const val `fMD_PrefetchAllowed`: `MD_FLAGS` = 4u;
public const val `fMD_PrefetchDisallowed`: `MD_FLAGS` = 0u;
public const val `fMD_Prefetchable`: `MD_FLAGS` = 4u;
public const val `fMD_RAM`: `MD_FLAGS` = 1u;
public const val `fMD_ROM`: `MD_FLAGS` = 0u;
public const val `fMD_ReadAllowed`: `MD_FLAGS` = 0u;
public const val `fMD_ReadDisallowed`: `MD_FLAGS` = 8u;
public const val `fMD_Readable`: `MD_FLAGS` = 8u;
public const val `fMD_WINDOW_DECODE`: `MD_FLAGS` = 64u;
public const val `fPCD_ATTRIBUTES_PER_WINDOW`: `PCD_FLAGS` = 32768u;
public const val `fPCD_IO1_16`: `PCD_FLAGS` = 65536u;
public const val `fPCD_IO1_SRC_16`: `PCD_FLAGS` = 262144u;
public const val `fPCD_IO1_WS_16`: `PCD_FLAGS` = 524288u;
public const val `fPCD_IO1_ZW_8`: `PCD_FLAGS` = 131072u;
public const val `fPCD_IO2_16`: `PCD_FLAGS` = 1048576u;
public const val `fPCD_IO2_SRC_16`: `PCD_FLAGS` = 4194304u;
public const val `fPCD_IO2_WS_16`: `PCD_FLAGS` = 8388608u;
public const val `fPCD_IO2_ZW_8`: `PCD_FLAGS` = 2097152u;
public const val `fPCD_IO_16`: `PCD_FLAGS` = 1u;
public const val `fPCD_IO_8`: `PCD_FLAGS` = 0u;
public const val `fPCD_IO_SRC_16`: `PCD_FLAGS` = 32u;
public const val `fPCD_IO_WS_16`: `PCD_FLAGS` = 64u;
public const val `fPCD_IO_ZW_8`: `PCD_FLAGS` = 16u;
public const val `fPCD_MEM1_16`: `PCD_FLAGS` = 67108864u;
public const val `fPCD_MEM1_A`: `PCD_FLAGS` = 4u;
public const val `fPCD_MEM1_WS_ONE`: `PCD_FLAGS` = 16777216u;
public const val `fPCD_MEM1_WS_THREE`: `PCD_FLAGS` = 50331648u;
public const val `fPCD_MEM1_WS_TWO`: `PCD_FLAGS` = 33554432u;
public const val `fPCD_MEM2_16`: `PCD_FLAGS` = 1073741824u;
public const val `fPCD_MEM2_A`: `PCD_FLAGS` = 8u;
public const val `fPCD_MEM2_WS_ONE`: `PCD_FLAGS` = 268435456u;
public const val `fPCD_MEM2_WS_THREE`: `PCD_FLAGS` = 805306368u;
public const val `fPCD_MEM2_WS_TWO`: `PCD_FLAGS` = 536870912u;
public const val `fPCD_MEM_16`: `PCD_FLAGS` = 2u;
public const val `fPCD_MEM_8`: `PCD_FLAGS` = 0u;
public const val `fPCD_MEM_A`: `PCD_FLAGS` = 4u;
public const val `fPCD_MEM_WS_ONE`: `PCD_FLAGS` = 256u;
public const val `fPCD_MEM_WS_THREE`: `PCD_FLAGS` = 768u;
public const val `fPCD_MEM_WS_TWO`: `PCD_FLAGS` = 512u;
public const val `fPMF_AUDIO_ENABLE`: `PMF_FLAGS` = 8u;
public const val `mDD_BusMaster`: `DD_FLAGS` = 4u;
public const val `mDD_Type`: `DD_FLAGS` = 24u;
public const val `mDD_Width`: `DD_FLAGS` = 3u;
public const val `mIRQD_Edge_Level`: `IRQD_FLAGS` = 2u;
public const val `mIRQD_Share`: `IRQD_FLAGS` = 1u;
public const val `mMD_32_24`: `MD_FLAGS` = 2u;
public const val `mMD_Cacheable`: `MD_FLAGS` = 32u;
public const val `mMD_CombinedWrite`: `MD_FLAGS` = 16u;
public const val `mMD_MemoryType`: `MD_FLAGS` = 1u;
public const val `mMD_Prefetchable`: `MD_FLAGS` = 4u;
public const val `mMD_Readable`: `MD_FLAGS` = 8u;
public const val `mPCD_IO_8_16`: `PCD_FLAGS` = 1u;
public const val `mPCD_MEM1_WS`: `PCD_FLAGS` = 50331648u;
public const val `mPCD_MEM2_WS`: `PCD_FLAGS` = 805306368u;
public const val `mPCD_MEM_8_16`: `PCD_FLAGS` = 2u;
public const val `mPCD_MEM_A_C`: `PCD_FLAGS` = 12u;
public const val `mPCD_MEM_WS`: `PCD_FLAGS` = 768u;
public const val `mPMF_AUDIO_ENABLE`: UInt = 8u;
