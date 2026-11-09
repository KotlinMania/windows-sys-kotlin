package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.PRIORITY
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.DEVPROPTYPE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HPROPSHEETPAGE

public expect fun CMP_WaitNoPendingInstallEvents(dwtimeout: UInt): UInt

public expect fun CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt): CONFIGRET

public expect fun CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Add_IDA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Add_IDW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Add_ID_ExA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Add_ID_ExW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Add_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Add_Res_Des(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Connect_MachineA(uncservername: PCSTR, phmachine: Long): CONFIGRET

public expect fun CM_Connect_MachineW(uncservername: PCWSTR, phmachine: Long): CONFIGRET

public expect fun CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Create_Range_List(prlh: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Delete_Class_Key(classguid: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Delete_Class_Key_Ex(classguid: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Delete_DevNode_Key(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Delete_DevNode_Key_Ex(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Delete_Device_Interface_KeyA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Delete_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Delete_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Detect_Resource_Conflict(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Detect_Resource_Conflict_Ex(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Disable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Disable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Disconnect_Machine(hmachine: Long): CONFIGRET

public expect fun CM_Dup_Range_List(rlhold: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Enable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Enable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Enumerate_Classes(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS): CONFIGRET

public expect fun CM_Enumerate_Classes_Ex(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS, hmachine: Long): CONFIGRET

public expect fun CM_Enumerate_EnumeratorsA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Enumerate_EnumeratorsW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Enumerate_Enumerators_ExA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Enumerate_Enumerators_ExW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Find_Range(pullstart: Long, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_First_Range(rlh: ULong, pullstart: Long, pullend: Long, preelement: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Free_Log_Conf(lclogconftobefreed: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Free_Log_Conf_Ex(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Free_Log_Conf_Handle(lclogconf: ULong): CONFIGRET

public expect fun CM_Free_Range_List(rlh: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Free_Res_Des(prdresdes: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Free_Res_Des_Handle(rdresdes: ULong): CONFIGRET

public expect fun CM_Free_Resource_Conflict_Handle(clconflictlist: ULong): CONFIGRET

public expect fun CM_Get_Child(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Child_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_NameA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Class_NameW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Class_Name_ExA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_Name_ExW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Depth(puldepth: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Depth_Ex(puldepth: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_Custom_PropertyA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Custom_PropertyW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Custom_Property_ExA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_Custom_Property_ExW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_Property_Keys(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Property_Keys_Ex(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_IDA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_IDW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_ID_ExA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_ID_ExW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_ID_ListA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_ID_ListW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_ID_List_ExA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_ID_List_ExW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: PCSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_ID_Size(pullen: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_AliasA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_Interface_AliasW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET

public expect fun CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET

public expect fun CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET

public expect fun CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET

public expect fun CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF): CONFIGRET

public expect fun CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF, hmachine: Long): CONFIGRET

public expect fun CM_Get_Global_State(pulstate: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Global_State_Ex(pulstate: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_HW_Prof_FlagsA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Hardware_Profile_InfoA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Hardware_Profile_InfoW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Hardware_Profile_Info_ExA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Hardware_Profile_Info_ExW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Log_Conf_Priority(lclogconf: ULong, ppriority: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Log_Conf_Priority_Ex(lclogconf: ULong, ppriority: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: ULong, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Parent(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Res_Des_Data(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Res_Des_Data_Ex(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Resource_Conflict_Count(clconflictlist: ULong, pulcount: Long): CONFIGRET

public expect fun CM_Get_Resource_Conflict_DetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET

public expect fun CM_Get_Resource_Conflict_DetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET

public expect fun CM_Get_Sibling(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Get_Version(): UShort

public expect fun CM_Get_Version_Ex(hmachine: Long): UShort

public expect fun CM_Intersect_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Invert_Range_List(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Is_Dock_Station_Present(pbpresent: Long): CONFIGRET

public expect fun CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): CONFIGRET

public expect fun CM_Is_Version_Available(wversion: UShort): BOOL

public expect fun CM_Is_Version_Available_Ex(wversion: UShort, hmachine: Long): BOOL

public expect fun CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET

public expect fun CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET

public expect fun CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_MapCrToWin32Err(cmreturncode: CONFIGRET, defaulterr: UInt): UInt

public expect fun CM_Merge_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Modify_Res_Des(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Move_DevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Move_DevNode_Ex(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Open_Class_KeyA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Open_Class_KeyW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Open_Class_Key_ExA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Open_Class_Key_ExW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Open_DevNode_Key(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Open_DevNode_Key_Ex(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Open_Device_Interface_KeyA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Open_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Query_And_Remove_SubTreeA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Query_And_Remove_SubTreeW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Query_And_Remove_SubTree_ExA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Query_And_Remove_SubTree_ExW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Query_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Query_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: UInt, resourceid: CM_RESTYPE, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Reenumerate_DevNode(dndevinst: UInt, ulflags: CM_REENUMERATE_FLAGS): CONFIGRET

public expect fun CM_Reenumerate_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Register_Device_Driver(dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Register_Device_Driver_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Register_Device_InterfaceA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Register_Device_InterfaceW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET

public expect fun CM_Register_Device_Interface_ExA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Register_Device_Interface_ExW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: PCM_NOTIFY_CALLBACK, pnotifycontext: Long): CONFIGRET

public expect fun CM_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Request_Device_EjectA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Request_Device_EjectW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Request_Device_Eject_ExA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Request_Device_Eject_ExW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Request_Eject_PC(): CONFIGRET

public expect fun CM_Request_Eject_PC_Ex(hmachine: Long): CONFIGRET

public expect fun CM_Run_Detection(ulflags: UInt): CONFIGRET

public expect fun CM_Run_Detection_Ex(ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_DevNode_Problem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_DevNode_Problem_Ex(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_HW_Prof(ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_HW_Prof_Ex(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_HW_Prof_FlagsA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Set_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Set_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Setup_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Setup_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Test_Range_Available(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET

public expect fun CM_Uninstall_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET

public expect fun CM_Uninstall_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Unregister_Device_InterfaceA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Unregister_Device_InterfaceW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET

public expect fun CM_Unregister_Device_Interface_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Unregister_Device_Interface_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET

public expect fun CM_Unregister_Notification(notifycontext: HCMNOTIFICATION): CONFIGRET

public expect fun DiInstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, flags: DIINSTALLDEVICE_FLAGS, needreboot: Long): BOOL

public expect fun DiInstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL

public expect fun DiInstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL

public expect fun DiRollbackDriver(deviceinfoset: HDEVINFO, deviceinfodata: Long, hwndparent: HWND, flags: DIROLLBACKDRIVER_FLAGS, needreboot: Long): BOOL

public expect fun DiShowUpdateDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL

public expect fun DiShowUpdateDriver(hwndparent: HWND, filepath: PCWSTR, flags: UInt, needreboot: Long): BOOL

public expect fun DiUninstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL

public expect fun DiUninstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL

public expect fun DiUninstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL

public expect fun InstallHinfSectionA(window: HWND, modulehandle: HINSTANCE, commandline: PCSTR, showcommand: Int)

public expect fun InstallHinfSectionW(window: HWND, modulehandle: HINSTANCE, commandline: PCWSTR, showcommand: Int)

public expect fun SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAddToSourceListA(flags: UInt, source: PCSTR): BOOL

public expect fun SetupAddToSourceListW(flags: UInt, source: PCWSTR): BOOL

public expect fun SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: PCSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: PCWSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL

public expect fun SetupBackupErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt

public expect fun SetupBackupErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt

public expect fun SetupCancelTemporarySourceList(): BOOL

public expect fun SetupCloseFileQueue(queuehandle: Long): BOOL

public expect fun SetupCloseInfFile(infhandle: Long)

public expect fun SetupCloseLog()

public expect fun SetupCommitFileQueueA(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL

public expect fun SetupCommitFileQueueW(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL

public expect fun SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: UInt): BOOL

public expect fun SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: UInt): BOOL

public expect fun SetupCopyErrorA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, sourcefile: PCSTR, targetpathfile: PCSTR, win32errorcode: UInt, style: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt

public expect fun SetupCopyErrorW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, sourcefile: PCWSTR, targetpathfile: PCWSTR, win32errorcode: UInt, style: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt

public expect fun SetupCopyOEMInfA(sourceinffilename: PCSTR, oemsourcemedialocation: PCSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL

public expect fun SetupCopyOEMInfW(sourceinffilename: PCWSTR, oemsourcemedialocation: PCWSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PWSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL

public expect fun SetupCreateDiskSpaceListA(reserved1: Long, reserved2: UInt, flags: UInt): Long

public expect fun SetupCreateDiskSpaceListW(reserved1: Long, reserved2: UInt, flags: UInt): Long

public expect fun SetupDecompressOrCopyFileA(sourcefilename: PCSTR, targetfilename: PCSTR, compressiontype: Long): UInt

public expect fun SetupDecompressOrCopyFileW(sourcefilename: PCWSTR, targetfilename: PCWSTR, compressiontype: Long): UInt

public expect fun SetupDefaultQueueCallbackA(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun SetupDefaultQueueCallbackW(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun SetupDeleteErrorA(hwndparent: HWND, dialogtitle: PCSTR, file: PCSTR, win32errorcode: UInt, style: UInt): UInt

public expect fun SetupDeleteErrorW(hwndparent: HWND, dialogtitle: PCWSTR, file: PCWSTR, win32errorcode: UInt, style: UInt): UInt

public expect fun SetupDestroyDiskSpaceList(diskspace: Long): BOOL

public expect fun SetupDiAskForOEMDisk(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiBuildClassInfoList(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiBuildClassInfoListExA(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiBuildClassInfoListExW(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiBuildDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL

public expect fun SetupDiCallClassInstaller(installfunction: DI_FUNCTION, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiCancelDriverInfoSearch(deviceinfoset: HDEVINFO): BOOL

public expect fun SetupDiChangeState(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiClassGuidsFromNameA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiClassGuidsFromNameExA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiClassGuidsFromNameExW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiClassGuidsFromNameW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiClassNameFromGuidA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiClassNameFromGuidExA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiClassNameFromGuidExW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiClassNameFromGuidW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiCreateDevRegKeyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCSTR): HKEY

public expect fun SetupDiCreateDevRegKeyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY

public expect fun SetupDiCreateDeviceInfoA(deviceinfoset: HDEVINFO, devicename: PCSTR, classguid: Long, devicedescription: PCSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL

public expect fun SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: HWND): HDEVINFO

public expect fun SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: HWND, machinename: PCSTR, reserved: Long): HDEVINFO

public expect fun SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: HWND, machinename: PCWSTR, reserved: Long): HDEVINFO

public expect fun SetupDiCreateDeviceInfoW(deviceinfoset: HDEVINFO, devicename: PCWSTR, classguid: Long, devicedescription: PCWSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL

public expect fun SetupDiCreateDeviceInterfaceA(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL

public expect fun SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCSTR): HKEY

public expect fun SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY

public expect fun SetupDiCreateDeviceInterfaceW(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCWSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL

public expect fun SetupDiDeleteDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt): BOOL

public expect fun SetupDiDeleteDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiDeleteDeviceInterfaceData(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL

public expect fun SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt): BOOL

public expect fun SetupDiDestroyClassImageList(classimagelistdata: Long): BOOL

public expect fun SetupDiDestroyDeviceInfoList(deviceinfoset: HDEVINFO): BOOL

public expect fun SetupDiDestroyDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL

public expect fun SetupDiDrawMiniIcon(hdc: HDC, rc: RECT, miniiconindex: Int, flags: UInt): Int

public expect fun SetupDiEnumDeviceInfo(deviceinfoset: HDEVINFO, memberindex: UInt, deviceinfodata: Long): BOOL

public expect fun SetupDiEnumDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, memberindex: UInt, deviceinterfacedata: Long): BOOL

public expect fun SetupDiEnumDriverInfoA(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL

public expect fun SetupDiEnumDriverInfoW(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL

public expect fun SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL

public expect fun SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL

public expect fun SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: PCSTR, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL

public expect fun SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: PCSTR, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL

public expect fun SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: PCWSTR, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL

public expect fun SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: PCWSTR, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL

public expect fun SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): BOOL

public expect fun SetupDiGetClassDescriptionA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetClassDescriptionExA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassDescriptionExW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassDescriptionW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetClassDevPropertySheetsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL

public expect fun SetupDiGetClassDevPropertySheetsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL

public expect fun SetupDiGetClassDevsA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO

public expect fun SetupDiGetClassDevsExA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCSTR, reserved: Long): HDEVINFO

public expect fun SetupDiGetClassDevsExW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCWSTR, reserved: Long): HDEVINFO

public expect fun SetupDiGetClassDevsW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO

public expect fun SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): BOOL

public expect fun SetupDiGetClassImageList(classimagelistdata: Long): BOOL

public expect fun SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL

public expect fun SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL

public expect fun SetupDiGetClassRegistryPropertyA(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiGetClassRegistryPropertyW(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetCustomDevicePropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetCustomDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCWSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDeviceInfoListClass(deviceinfoset: HDEVINFO, classguid: Long): BOOL

public expect fun SetupDiGetDeviceInfoListDetailA(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL

public expect fun SetupDiGetDeviceInfoListDetailW(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL

public expect fun SetupDiGetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL

public expect fun SetupDiGetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL

public expect fun SetupDiGetDeviceInstanceIdA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDeviceInstanceIdW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PWSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDeviceInterfaceAlias(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): BOOL

public expect fun SetupDiGetDeviceInterfaceDetailA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL

public expect fun SetupDiGetDeviceInterfaceDetailW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL

public expect fun SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL

public expect fun SetupDiGetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL

public expect fun SetupDiGetDevicePropertyKeys(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL

public expect fun SetupDiGetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL

public expect fun SetupDiGetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDriverInfoDetailA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDriverInfoDetailW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL

public expect fun SetupDiGetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL

public expect fun SetupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long): BOOL

public expect fun SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiGetINFClassA(infname: PCSTR, classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetINFClassW(infname: PCWSTR, classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL

public expect fun SetupDiGetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiGetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL

public expect fun SetupDiGetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL

public expect fun SetupDiGetWizardPage(deviceinfoset: HDEVINFO, deviceinfodata: Long, installwizarddata: Long, pagetype: UInt, flags: UInt): HPROPSHEETPAGE

public expect fun SetupDiInstallClassA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long): BOOL

public expect fun SetupDiInstallClassExA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL

public expect fun SetupDiInstallClassExW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL

public expect fun SetupDiInstallClassW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long): BOOL

public expect fun SetupDiInstallDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiInstallDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiInstallDriverFiles(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): BOOL

public expect fun SetupDiLoadDeviceIcon(deviceinfoset: HDEVINFO, deviceinfodata: Long, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: Long): BOOL

public expect fun SetupDiOpenClassRegKey(classguid: Long, samdesired: UInt): HKEY

public expect fun SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCSTR, reserved: Long): HKEY

public expect fun SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): HKEY

public expect fun SetupDiOpenDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): HKEY

public expect fun SetupDiOpenDeviceInfoA(deviceinfoset: HDEVINFO, deviceinstanceid: PCSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL

public expect fun SetupDiOpenDeviceInfoW(deviceinfoset: HDEVINFO, deviceinstanceid: PCWSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL

public expect fun SetupDiOpenDeviceInterfaceA(deviceinfoset: HDEVINFO, devicepath: PCSTR, openflags: UInt, deviceinterfacedata: Long): BOOL

public expect fun SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt): HKEY

public expect fun SetupDiOpenDeviceInterfaceW(deviceinfoset: HDEVINFO, devicepath: PCWSTR, openflags: UInt, deviceinterfacedata: Long): BOOL

public expect fun SetupDiRegisterCoDeviceInstallers(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiRegisterDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, compareproc: PSP_DETSIG_CMPPROC, comparecontext: Long, dupdeviceinfodata: Long): BOOL

public expect fun SetupDiRemoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiRemoveDeviceInterface(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL

public expect fun SetupDiRestartDevices(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiSelectBestCompatDrv(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiSelectDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiSelectOEMDrv(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiSetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL

public expect fun SetupDiSetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL

public expect fun SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL

public expect fun SetupDiSetClassRegistryPropertyA(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCSTR, reserved: Long): BOOL

public expect fun SetupDiSetClassRegistryPropertyW(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCWSTR, reserved: Long): BOOL

public expect fun SetupDiSetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL

public expect fun SetupDiSetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL

public expect fun SetupDiSetDeviceInterfaceDefault(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, flags: UInt, reserved: Long): BOOL

public expect fun SetupDiSetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL

public expect fun SetupDiSetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL

public expect fun SetupDiSetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL

public expect fun SetupDiSetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL

public expect fun SetupDiSetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL

public expect fun SetupDiSetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL

public expect fun SetupDiSetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDiSetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL

public expect fun SetupDiSetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL

public expect fun SetupDiUnremoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long

public expect fun SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long

public expect fun SetupEnumInfSectionsA(infhandle: Long, index: UInt, buffer: PSTR, size: UInt, sizeneeded: Long): BOOL

public expect fun SetupEnumInfSectionsW(infhandle: Long, index: UInt, buffer: PWSTR, size: UInt, sizeneeded: Long): BOOL

public expect fun SetupFindFirstLineA(infhandle: Long, section: PCSTR, key: PCSTR, context: Long): BOOL

public expect fun SetupFindFirstLineW(infhandle: Long, section: PCWSTR, key: PCWSTR, context: Long): BOOL

public expect fun SetupFindNextLine(contextin: Long, contextout: Long): BOOL

public expect fun SetupFindNextMatchLineA(contextin: Long, key: PCSTR, contextout: Long): BOOL

public expect fun SetupFindNextMatchLineW(contextin: Long, key: PCWSTR, contextout: Long): BOOL

public expect fun SetupFreeSourceListA(list: Long, count: UInt): BOOL

public expect fun SetupFreeSourceListW(list: Long, count: UInt): BOOL

public expect fun SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): BOOL

public expect fun SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): BOOL

public expect fun SetupGetBinaryField(context: Long, fieldindex: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetFieldCount(context: Long): UInt

public expect fun SetupGetFileCompressionInfoA(sourcefilename: PCSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt

public expect fun SetupGetFileCompressionInfoExA(sourcefilename: PCSTR, actualsourcefilenamebuffer: PCSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL

public expect fun SetupGetFileCompressionInfoExW(sourcefilename: PCWSTR, actualsourcefilenamebuffer: PCWSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL

public expect fun SetupGetFileCompressionInfoW(sourcefilename: PCWSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt

public expect fun SetupGetFileQueueCount(filequeue: Long, subqueuefileop: UInt, numoperations: Long): BOOL

public expect fun SetupGetFileQueueFlags(filequeue: Long, flags: Long): BOOL

public expect fun SetupGetInfDriverStoreLocationA(filename: PCSTR, alternateplatforminfo: Long, localename: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfDriverStoreLocationW(filename: PCWSTR, alternateplatforminfo: Long, localename: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfFileListA(directorypath: PCSTR, infstyle: INF_STYLE, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfFileListW(directorypath: PCWSTR, infstyle: INF_STYLE, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfInformationA(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfInformationW(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfPublishedNameA(driverstorelocation: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetInfPublishedNameW(driverstorelocation: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetIntField(context: Long, fieldindex: UInt, integervalue: Long): BOOL

public expect fun SetupGetLineByIndexA(infhandle: Long, section: PCSTR, index: UInt, context: Long): BOOL

public expect fun SetupGetLineByIndexW(infhandle: Long, section: PCWSTR, index: UInt, context: Long): BOOL

public expect fun SetupGetLineCountA(infhandle: Long, section: PCSTR): Int

public expect fun SetupGetLineCountW(infhandle: Long, section: PCWSTR): Int

public expect fun SetupGetLineTextA(context: Long, infhandle: Long, section: PCSTR, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetLineTextW(context: Long, infhandle: Long, section: PCWSTR, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetMultiSzFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetMultiSzFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetNonInteractiveMode(): BOOL

public expect fun SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: PCSTR, sourceid: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: PCWSTR, sourceid: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: PCSTR, section: PCSTR, filesize: Long, roundingfactor: UInt): BOOL

public expect fun SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: PCWSTR, section: PCWSTR, filesize: Long, roundingfactor: UInt): BOOL

public expect fun SetupGetSourceInfoA(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetSourceInfoW(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetStringFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetStringFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL

public expect fun SetupGetThreadLogToken(): ULong

public expect fun SetupInitDefaultQueueCallback(ownerwindow: HWND): Long

public expect fun SetupInitDefaultQueueCallbackEx(ownerwindow: HWND, alternateprogresswindow: HWND, progressmessage: UInt, reserved1: UInt, reserved2: Long): Long

public expect fun SetupInitializeFileLogA(logfilename: PCSTR, flags: UInt): Long

public expect fun SetupInitializeFileLogW(logfilename: PCWSTR, flags: UInt): Long

public expect fun SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL

public expect fun SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long, filewasinuse: Long): BOOL

public expect fun SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long, filewasinuse: Long): BOOL

public expect fun SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL

public expect fun SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCSTR, sourcerootpath: PCSTR, copyflags: UInt): BOOL

public expect fun SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCWSTR, sourcerootpath: PCWSTR, copyflags: UInt): BOOL

public expect fun SetupInstallFromInfSectionA(owner: HWND, infhandle: Long, sectionname: PCSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupInstallFromInfSectionW(owner: HWND, infhandle: Long, sectionname: PCWSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCWSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL

public expect fun SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS): BOOL

public expect fun SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL

public expect fun SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL

public expect fun SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS): BOOL

public expect fun SetupIterateCabinetA(cabinetfile: PCSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL

public expect fun SetupIterateCabinetW(cabinetfile: PCWSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL

public expect fun SetupLogErrorA(messagestring: PCSTR, severity: UInt): BOOL

public expect fun SetupLogErrorW(messagestring: PCWSTR, severity: UInt): BOOL

public expect fun SetupLogFileA(fileloghandle: Long, logsectionname: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, checksum: UInt, disktagfile: PCSTR, diskdescription: PCSTR, otherinfo: PCSTR, flags: UInt): BOOL

public expect fun SetupLogFileW(fileloghandle: Long, logsectionname: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, checksum: UInt, disktagfile: PCWSTR, diskdescription: PCWSTR, otherinfo: PCWSTR, flags: UInt): BOOL

public expect fun SetupOpenAppendInfFileA(filename: PCSTR, infhandle: Long, errorline: Long): BOOL

public expect fun SetupOpenAppendInfFileW(filename: PCWSTR, infhandle: Long, errorline: Long): BOOL

public expect fun SetupOpenFileQueue(): Long

public expect fun SetupOpenInfFileA(filename: PCSTR, infclass: PCSTR, infstyle: INF_STYLE, errorline: Long): Long

public expect fun SetupOpenInfFileW(filename: PCWSTR, infclass: PCWSTR, infstyle: INF_STYLE, errorline: Long): Long

public expect fun SetupOpenLog(erase: BOOL): BOOL
