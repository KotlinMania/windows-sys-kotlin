@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun CMP_WaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    0u

public actual fun CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Add_IDA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Add_IDW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Add_ID_ExA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Add_ID_ExW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Add_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Add_Res_Des(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Connect_MachineA(uncservername: PCSTR, phmachine: Long): CONFIGRET =
    0u

public actual fun CM_Connect_MachineW(uncservername: PCWSTR, phmachine: Long): CONFIGRET =
    0u

public actual fun CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Create_Range_List(prlh: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Delete_Class_Key(classguid: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Delete_Class_Key_Ex(classguid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Delete_DevNode_Key(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Delete_DevNode_Key_Ex(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Delete_Device_Interface_KeyA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Delete_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Delete_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Detect_Resource_Conflict(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Detect_Resource_Conflict_Ex(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Disable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Disable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Disconnect_Machine(hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Dup_Range_List(rlhold: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Enable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Enable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Enumerate_Classes(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS): CONFIGRET =
    0u

public actual fun CM_Enumerate_Classes_Ex(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Enumerate_EnumeratorsA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Enumerate_EnumeratorsW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Enumerate_Enumerators_ExA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Enumerate_Enumerators_ExW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Find_Range(pullstart: Long, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_First_Range(rlh: ULong, pullstart: Long, pullend: Long, preelement: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Free_Log_Conf(lclogconftobefreed: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Free_Log_Conf_Ex(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Free_Log_Conf_Handle(lclogconf: ULong): CONFIGRET =
    0u

public actual fun CM_Free_Range_List(rlh: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Free_Res_Des(prdresdes: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Free_Res_Des_Handle(rdresdes: ULong): CONFIGRET =
    0u

public actual fun CM_Free_Resource_Conflict_Handle(clconflictlist: ULong): CONFIGRET =
    0u

public actual fun CM_Get_Child(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Child_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_NameA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Class_NameW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Class_Name_ExA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_Name_ExW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Depth(puldepth: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Depth_Ex(puldepth: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Custom_PropertyA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Custom_PropertyW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Custom_Property_ExA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Custom_Property_ExW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Property_Keys(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Property_Keys_Ex(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_IDA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_IDW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_ExA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_ExW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_ListA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_ListW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_List_ExA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_List_ExW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: PCSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_Size(pullen: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_AliasA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_AliasW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF): CONFIGRET =
    0u

public actual fun CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Global_State(pulstate: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Global_State_Ex(pulstate: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_HW_Prof_FlagsA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Hardware_Profile_InfoA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Hardware_Profile_InfoW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Hardware_Profile_Info_ExA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Hardware_Profile_Info_ExW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Log_Conf_Priority(lclogconf: ULong, ppriority: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Log_Conf_Priority_Ex(lclogconf: ULong, ppriority: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Parent(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Res_Des_Data(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Res_Des_Data_Ex(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Resource_Conflict_Count(clconflictlist: ULong, pulcount: Long): CONFIGRET =
    0u

public actual fun CM_Get_Resource_Conflict_DetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    0u

public actual fun CM_Get_Resource_Conflict_DetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    0u

public actual fun CM_Get_Sibling(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Get_Version(): UShort =
    0u

public actual fun CM_Get_Version_Ex(hmachine: Long): UShort =
    0u

public actual fun CM_Intersect_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Invert_Range_List(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Is_Dock_Station_Present(pbpresent: Long): CONFIGRET =
    0u

public actual fun CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Is_Version_Available(wversion: UShort): BOOL =
    0

public actual fun CM_Is_Version_Available_Ex(wversion: UShort, hmachine: Long): BOOL =
    0

public actual fun CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    0u

public actual fun CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    0u

public actual fun CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_MapCrToWin32Err(cmreturncode: CONFIGRET, defaulterr: UInt): UInt =
    0u

public actual fun CM_Merge_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Modify_Res_Des(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Move_DevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Move_DevNode_Ex(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Open_Class_KeyA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Open_Class_KeyW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Open_Class_Key_ExA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Open_Class_Key_ExW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Open_DevNode_Key(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Open_DevNode_Key_Ex(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Open_Device_Interface_KeyA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Open_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Query_And_Remove_SubTreeA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Query_And_Remove_SubTreeW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Query_And_Remove_SubTree_ExA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Query_And_Remove_SubTree_ExW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Query_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Query_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: UInt, resourceid: CM_RESTYPE, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Reenumerate_DevNode(dndevinst: UInt, ulflags: CM_REENUMERATE_FLAGS): CONFIGRET =
    0u

public actual fun CM_Reenumerate_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Register_Device_Driver(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Register_Device_Driver_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Register_Device_InterfaceA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Register_Device_InterfaceW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Register_Device_Interface_ExA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Register_Device_Interface_ExW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: PCM_NOTIFY_CALLBACK, pnotifycontext: Long): CONFIGRET =
    0u

public actual fun CM_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Request_Device_EjectA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Request_Device_EjectW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Request_Device_Eject_ExA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Request_Device_Eject_ExW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Request_Eject_PC(): CONFIGRET =
    0u

public actual fun CM_Request_Eject_PC_Ex(hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Run_Detection(ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Run_Detection_Ex(ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Problem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Problem_Ex(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_HW_Prof(ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_HW_Prof_Ex(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_HW_Prof_FlagsA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Set_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Set_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Setup_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Setup_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Test_Range_Available(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Uninstall_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Uninstall_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Unregister_Device_InterfaceA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Unregister_Device_InterfaceW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    0u

public actual fun CM_Unregister_Device_Interface_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Unregister_Device_Interface_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    0u

public actual fun CM_Unregister_Notification(notifycontext: HCMNOTIFICATION): CONFIGRET =
    0u

public actual fun DiInstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, flags: DIINSTALLDEVICE_FLAGS, needreboot: Long): BOOL =
    0

public actual fun DiInstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    0

public actual fun DiInstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    0

public actual fun DiRollbackDriver(deviceinfoset: HDEVINFO, deviceinfodata: Long, hwndparent: HWND, flags: DIROLLBACKDRIVER_FLAGS, needreboot: Long): BOOL =
    0

public actual fun DiShowUpdateDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    0

public actual fun DiShowUpdateDriver(hwndparent: HWND, filepath: PCWSTR, flags: UInt, needreboot: Long): BOOL =
    0

public actual fun DiUninstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    0

public actual fun DiUninstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    0

public actual fun DiUninstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    0

public actual fun InstallHinfSectionA(window: HWND, modulehandle: HINSTANCE, commandline: PCSTR, showcommand: Int) {
}

public actual fun InstallHinfSectionW(window: HWND, modulehandle: HINSTANCE, commandline: PCWSTR, showcommand: Int) {
}

public actual fun SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAddToSourceListA(flags: UInt, source: PCSTR): BOOL =
    0

public actual fun SetupAddToSourceListW(flags: UInt, source: PCWSTR): BOOL =
    0

public actual fun SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: PCSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: PCWSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupBackupErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    0u

public actual fun SetupBackupErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    0u

public actual fun SetupCancelTemporarySourceList(): BOOL =
    0

public actual fun SetupCloseFileQueue(queuehandle: Long): BOOL =
    0

public actual fun SetupCloseInfFile(infhandle: Long) {
}

public actual fun SetupCloseLog() {
}

public actual fun SetupCommitFileQueueA(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    0

public actual fun SetupCommitFileQueueW(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    0

public actual fun SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: UInt): BOOL =
    0

public actual fun SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: UInt): BOOL =
    0

public actual fun SetupCopyErrorA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, sourcefile: PCSTR, targetpathfile: PCSTR, win32errorcode: UInt, style: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    0u

public actual fun SetupCopyErrorW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, sourcefile: PCWSTR, targetpathfile: PCWSTR, win32errorcode: UInt, style: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    0u

public actual fun SetupCopyOEMInfA(sourceinffilename: PCSTR, oemsourcemedialocation: PCSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    0

public actual fun SetupCopyOEMInfW(sourceinffilename: PCWSTR, oemsourcemedialocation: PCWSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PWSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    0

public actual fun SetupCreateDiskSpaceListA(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    0L

public actual fun SetupCreateDiskSpaceListW(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    0L

public actual fun SetupDecompressOrCopyFileA(sourcefilename: PCSTR, targetfilename: PCSTR, compressiontype: Long): UInt =
    0u

public actual fun SetupDecompressOrCopyFileW(sourcefilename: PCWSTR, targetfilename: PCWSTR, compressiontype: Long): UInt =
    0u

public actual fun SetupDefaultQueueCallbackA(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    0u

public actual fun SetupDefaultQueueCallbackW(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    0u

public actual fun SetupDeleteErrorA(hwndparent: HWND, dialogtitle: PCSTR, file: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    0u

public actual fun SetupDeleteErrorW(hwndparent: HWND, dialogtitle: PCWSTR, file: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    0u

public actual fun SetupDestroyDiskSpaceList(diskspace: Long): BOOL =
    0

public actual fun SetupDiAskForOEMDisk(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiBuildClassInfoList(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiBuildClassInfoListExA(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiBuildClassInfoListExW(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiBuildDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    0

public actual fun SetupDiCallClassInstaller(installfunction: DI_FUNCTION, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiCancelDriverInfoSearch(deviceinfoset: HDEVINFO): BOOL =
    0

public actual fun SetupDiChangeState(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiClassGuidsFromNameA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiClassGuidsFromNameExA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiClassGuidsFromNameExW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiClassGuidsFromNameW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiClassNameFromGuidA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiClassNameFromGuidExA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiClassNameFromGuidExW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiClassNameFromGuidW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiCreateDevRegKeyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    0L

public actual fun SetupDiCreateDevRegKeyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    0L

public actual fun SetupDiCreateDeviceInfoA(deviceinfoset: HDEVINFO, devicename: PCSTR, classguid: Long, devicedescription: PCSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: HWND): HDEVINFO =
    0L

public actual fun SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: HWND, machinename: PCSTR, reserved: Long): HDEVINFO =
    0L

public actual fun SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: HWND, machinename: PCWSTR, reserved: Long): HDEVINFO =
    0L

public actual fun SetupDiCreateDeviceInfoW(deviceinfoset: HDEVINFO, devicename: PCWSTR, classguid: Long, devicedescription: PCWSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiCreateDeviceInterfaceA(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    0L

public actual fun SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    0L

public actual fun SetupDiCreateDeviceInterfaceW(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCWSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiDeleteDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt): BOOL =
    0

public actual fun SetupDiDeleteDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiDeleteDeviceInterfaceData(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt): BOOL =
    0

public actual fun SetupDiDestroyClassImageList(classimagelistdata: Long): BOOL =
    0

public actual fun SetupDiDestroyDeviceInfoList(deviceinfoset: HDEVINFO): BOOL =
    0

public actual fun SetupDiDestroyDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    0

public actual fun SetupDiDrawMiniIcon(hdc: HDC, rc: RECT, miniiconindex: Int, flags: UInt): Int =
    0

public actual fun SetupDiEnumDeviceInfo(deviceinfoset: HDEVINFO, memberindex: UInt, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiEnumDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, memberindex: UInt, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiEnumDriverInfoA(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    0

public actual fun SetupDiEnumDriverInfoW(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    0

public actual fun SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    0

public actual fun SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    0

public actual fun SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: PCSTR, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    0

public actual fun SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: PCSTR, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    0

public actual fun SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: PCWSTR, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    0

public actual fun SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: PCWSTR, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    0

public actual fun SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): BOOL =
    0

public actual fun SetupDiGetClassDescriptionA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetClassDescriptionExA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassDescriptionExW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassDescriptionW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetClassDevPropertySheetsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    0

public actual fun SetupDiGetClassDevPropertySheetsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    0

public actual fun SetupDiGetClassDevsA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    0L

public actual fun SetupDiGetClassDevsExA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCSTR, reserved: Long): HDEVINFO =
    0L

public actual fun SetupDiGetClassDevsExW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCWSTR, reserved: Long): HDEVINFO =
    0L

public actual fun SetupDiGetClassDevsW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    0L

public actual fun SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): BOOL =
    0

public actual fun SetupDiGetClassImageList(classimagelistdata: Long): BOOL =
    0

public actual fun SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    0

public actual fun SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    0

public actual fun SetupDiGetClassRegistryPropertyA(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetClassRegistryPropertyW(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetCustomDevicePropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetCustomDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCWSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInfoListClass(deviceinfoset: HDEVINFO, classguid: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInfoListDetailA(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInfoListDetailW(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInstanceIdA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInstanceIdW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PWSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInterfaceAlias(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInterfaceDetailA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInterfaceDetailW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    0

public actual fun SetupDiGetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    0

public actual fun SetupDiGetDevicePropertyKeys(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    0

public actual fun SetupDiGetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    0

public actual fun SetupDiGetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDriverInfoDetailA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDriverInfoDetailW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    0

public actual fun SetupDiGetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiGetINFClassA(infname: PCSTR, classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetINFClassW(infname: PCWSTR, classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupDiGetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiGetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    0

public actual fun SetupDiGetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    0

public actual fun SetupDiGetWizardPage(deviceinfoset: HDEVINFO, deviceinfodata: Long, installwizarddata: Long, pagetype: UInt, flags: UInt): HPROPSHEETPAGE =
    0L

public actual fun SetupDiInstallClassA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long): BOOL =
    0

public actual fun SetupDiInstallClassExA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    0

public actual fun SetupDiInstallClassExW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    0

public actual fun SetupDiInstallClassW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long): BOOL =
    0

public actual fun SetupDiInstallDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiInstallDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiInstallDriverFiles(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): BOOL =
    0

public actual fun SetupDiLoadDeviceIcon(deviceinfoset: HDEVINFO, deviceinfodata: Long, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: Long): BOOL =
    0

public actual fun SetupDiOpenClassRegKey(classguid: Long, samdesired: UInt): HKEY =
    0L

public actual fun SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCSTR, reserved: Long): HKEY =
    0L

public actual fun SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): HKEY =
    0L

public actual fun SetupDiOpenDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): HKEY =
    0L

public actual fun SetupDiOpenDeviceInfoA(deviceinfoset: HDEVINFO, deviceinstanceid: PCSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiOpenDeviceInfoW(deviceinfoset: HDEVINFO, deviceinstanceid: PCWSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiOpenDeviceInterfaceA(deviceinfoset: HDEVINFO, devicepath: PCSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt): HKEY =
    0L

public actual fun SetupDiOpenDeviceInterfaceW(deviceinfoset: HDEVINFO, devicepath: PCWSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiRegisterCoDeviceInstallers(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiRegisterDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, compareproc: PSP_DETSIG_CMPPROC, comparecontext: Long, dupdeviceinfodata: Long): BOOL =
    0

public actual fun SetupDiRemoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiRemoveDeviceInterface(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    0

public actual fun SetupDiRestartDevices(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiSelectBestCompatDrv(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiSelectDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiSelectOEMDrv(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiSetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    0

public actual fun SetupDiSetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    0

public actual fun SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    0

public actual fun SetupDiSetClassRegistryPropertyA(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiSetClassRegistryPropertyW(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    0

public actual fun SetupDiSetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    0

public actual fun SetupDiSetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    0

public actual fun SetupDiSetDeviceInterfaceDefault(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, flags: UInt, reserved: Long): BOOL =
    0

public actual fun SetupDiSetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    0

public actual fun SetupDiSetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    0

public actual fun SetupDiSetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    0

public actual fun SetupDiSetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    0

public actual fun SetupDiSetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    0

public actual fun SetupDiSetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    0

public actual fun SetupDiSetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDiSetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    0

public actual fun SetupDiSetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    0

public actual fun SetupDiUnremoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    0L

public actual fun SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    0L

public actual fun SetupEnumInfSectionsA(infhandle: Long, index: UInt, buffer: PSTR, size: UInt, sizeneeded: Long): BOOL =
    0

public actual fun SetupEnumInfSectionsW(infhandle: Long, index: UInt, buffer: PWSTR, size: UInt, sizeneeded: Long): BOOL =
    0

public actual fun SetupFindFirstLineA(infhandle: Long, section: PCSTR, key: PCSTR, context: Long): BOOL =
    0

public actual fun SetupFindFirstLineW(infhandle: Long, section: PCWSTR, key: PCWSTR, context: Long): BOOL =
    0

public actual fun SetupFindNextLine(contextin: Long, contextout: Long): BOOL =
    0

public actual fun SetupFindNextMatchLineA(contextin: Long, key: PCSTR, contextout: Long): BOOL =
    0

public actual fun SetupFindNextMatchLineW(contextin: Long, key: PCWSTR, contextout: Long): BOOL =
    0

public actual fun SetupFreeSourceListA(list: Long, count: UInt): BOOL =
    0

public actual fun SetupFreeSourceListW(list: Long, count: UInt): BOOL =
    0

public actual fun SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): BOOL =
    0

public actual fun SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): BOOL =
    0

public actual fun SetupGetBinaryField(context: Long, fieldindex: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetFieldCount(context: Long): UInt =
    0u

public actual fun SetupGetFileCompressionInfoA(sourcefilename: PCSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    0u

public actual fun SetupGetFileCompressionInfoExA(sourcefilename: PCSTR, actualsourcefilenamebuffer: PCSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    0

public actual fun SetupGetFileCompressionInfoExW(sourcefilename: PCWSTR, actualsourcefilenamebuffer: PCWSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    0

public actual fun SetupGetFileCompressionInfoW(sourcefilename: PCWSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    0u

public actual fun SetupGetFileQueueCount(filequeue: Long, subqueuefileop: UInt, numoperations: Long): BOOL =
    0

public actual fun SetupGetFileQueueFlags(filequeue: Long, flags: Long): BOOL =
    0

public actual fun SetupGetInfDriverStoreLocationA(filename: PCSTR, alternateplatforminfo: Long, localename: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfDriverStoreLocationW(filename: PCWSTR, alternateplatforminfo: Long, localename: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfFileListA(directorypath: PCSTR, infstyle: INF_STYLE, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfFileListW(directorypath: PCWSTR, infstyle: INF_STYLE, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfInformationA(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfInformationW(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfPublishedNameA(driverstorelocation: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetInfPublishedNameW(driverstorelocation: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetIntField(context: Long, fieldindex: UInt, integervalue: Long): BOOL =
    0

public actual fun SetupGetLineByIndexA(infhandle: Long, section: PCSTR, index: UInt, context: Long): BOOL =
    0

public actual fun SetupGetLineByIndexW(infhandle: Long, section: PCWSTR, index: UInt, context: Long): BOOL =
    0

public actual fun SetupGetLineCountA(infhandle: Long, section: PCSTR): Int =
    0

public actual fun SetupGetLineCountW(infhandle: Long, section: PCWSTR): Int =
    0

public actual fun SetupGetLineTextA(context: Long, infhandle: Long, section: PCSTR, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetLineTextW(context: Long, infhandle: Long, section: PCWSTR, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetMultiSzFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetMultiSzFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetNonInteractiveMode(): BOOL =
    0

public actual fun SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: PCSTR, sourceid: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: PCWSTR, sourceid: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: PCSTR, section: PCSTR, filesize: Long, roundingfactor: UInt): BOOL =
    0

public actual fun SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: PCWSTR, section: PCWSTR, filesize: Long, roundingfactor: UInt): BOOL =
    0

public actual fun SetupGetSourceInfoA(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetSourceInfoW(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetStringFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetStringFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupGetThreadLogToken(): ULong =
    0uL

public actual fun SetupInitDefaultQueueCallback(ownerwindow: HWND): Long =
    0L

public actual fun SetupInitDefaultQueueCallbackEx(ownerwindow: HWND, alternateprogresswindow: HWND, progressmessage: UInt, reserved1: UInt, reserved2: Long): Long =
    0L

public actual fun SetupInitializeFileLogA(logfilename: PCSTR, flags: UInt): Long =
    0L

public actual fun SetupInitializeFileLogW(logfilename: PCWSTR, flags: UInt): Long =
    0L

public actual fun SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    0

public actual fun SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long, filewasinuse: Long): BOOL =
    0

public actual fun SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long, filewasinuse: Long): BOOL =
    0

public actual fun SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    0

public actual fun SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCSTR, sourcerootpath: PCSTR, copyflags: UInt): BOOL =
    0

public actual fun SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCWSTR, sourcerootpath: PCWSTR, copyflags: UInt): BOOL =
    0

public actual fun SetupInstallFromInfSectionA(owner: HWND, infhandle: Long, sectionname: PCSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupInstallFromInfSectionW(owner: HWND, infhandle: Long, sectionname: PCWSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCWSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    0

public actual fun SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS): BOOL =
    0

public actual fun SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    0

public actual fun SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    0

public actual fun SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS): BOOL =
    0

public actual fun SetupIterateCabinetA(cabinetfile: PCSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    0

public actual fun SetupIterateCabinetW(cabinetfile: PCWSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    0

public actual fun SetupLogErrorA(messagestring: PCSTR, severity: UInt): BOOL =
    0

public actual fun SetupLogErrorW(messagestring: PCWSTR, severity: UInt): BOOL =
    0

public actual fun SetupLogFileA(fileloghandle: Long, logsectionname: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, checksum: UInt, disktagfile: PCSTR, diskdescription: PCSTR, otherinfo: PCSTR, flags: UInt): BOOL =
    0

public actual fun SetupLogFileW(fileloghandle: Long, logsectionname: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, checksum: UInt, disktagfile: PCWSTR, diskdescription: PCWSTR, otherinfo: PCWSTR, flags: UInt): BOOL =
    0

public actual fun SetupOpenAppendInfFileA(filename: PCSTR, infhandle: Long, errorline: Long): BOOL =
    0

public actual fun SetupOpenAppendInfFileW(filename: PCWSTR, infhandle: Long, errorline: Long): BOOL =
    0

public actual fun SetupOpenFileQueue(): Long =
    0L

public actual fun SetupOpenInfFileA(filename: PCSTR, infclass: PCSTR, infstyle: INF_STYLE, errorline: Long): Long =
    0L

public actual fun SetupOpenInfFileW(filename: PCWSTR, infclass: PCWSTR, infstyle: INF_STYLE, errorline: Long): Long =
    0L

public actual fun SetupOpenLog(erase: BOOL): BOOL =
    0

public actual fun SetupOpenMasterInf(): Long =
    0L

public actual fun SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: PCSTR, restoreflags: UInt): BOOL =
    0

public actual fun SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: PCWSTR, restoreflags: UInt): BOOL =
    0

public actual fun SetupPromptForDiskA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, filesought: PCSTR, tagfile: PCSTR, diskpromptstyle: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    0u

public actual fun SetupPromptForDiskW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, filesought: PCWSTR, tagfile: PCWSTR, diskpromptstyle: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    0u

public actual fun SetupPromptReboot(filequeue: Long, owner: HWND, scanonly: BOOL): Int =
    0

public actual fun SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryFileLogA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR, desiredinfo: SetupFileLogInfo, dataout: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryFileLogW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR, desiredinfo: SetupFileLogInfo, dataout: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryInfFileInformationA(infinformation: Long, infindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryInfFileInformationW(infinformation: Long, infindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    0

public actual fun SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    0

public actual fun SetupQueryInfVersionInformationA(infinformation: Long, infindex: UInt, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQueryInfVersionInformationW(infinformation: Long, infindex: UInt, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    0

public actual fun SetupQuerySourceListA(flags: UInt, list: Long, count: Long): BOOL =
    0

public actual fun SetupQuerySourceListW(flags: UInt, list: Long, count: Long): BOOL =
    0

public actual fun SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: PCSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: PCWSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupQueueCopyA(queuehandle: Long, sourcerootpath: PCSTR, sourcepath: PCSTR, sourcefilename: PCSTR, sourcedescription: PCSTR, sourcetagfile: PCSTR, targetdirectory: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    0

public actual fun SetupQueueCopyIndirectA(copyparams: Long): BOOL =
    0

public actual fun SetupQueueCopyIndirectW(copyparams: Long): BOOL =
    0

public actual fun SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: PCSTR, infhandle: Long, listinfhandle: Long, section: PCSTR, copystyle: UInt): BOOL =
    0

public actual fun SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: PCWSTR, infhandle: Long, listinfhandle: Long, section: PCWSTR, copystyle: UInt): BOOL =
    0

public actual fun SetupQueueCopyW(queuehandle: Long, sourcerootpath: PCWSTR, sourcepath: PCWSTR, sourcefilename: PCWSTR, sourcedescription: PCWSTR, sourcetagfile: PCWSTR, targetdirectory: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    0

public actual fun SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    0

public actual fun SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    0

public actual fun SetupQueueDeleteA(queuehandle: Long, pathpart1: PCSTR, pathpart2: PCSTR): BOOL =
    0

public actual fun SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    0

public actual fun SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    0

public actual fun SetupQueueDeleteW(queuehandle: Long, pathpart1: PCWSTR, pathpart2: PCWSTR): BOOL =
    0

public actual fun SetupQueueRenameA(queuehandle: Long, sourcepath: PCSTR, sourcefilename: PCSTR, targetpath: PCSTR, targetfilename: PCSTR): BOOL =
    0

public actual fun SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    0

public actual fun SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    0

public actual fun SetupQueueRenameW(queuehandle: Long, sourcepath: PCWSTR, sourcefilename: PCWSTR, targetpath: PCWSTR, targetfilename: PCWSTR): BOOL =
    0

public actual fun SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR): BOOL =
    0

public actual fun SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR): BOOL =
    0

public actual fun SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupRemoveFromSourceListA(flags: UInt, source: PCSTR): BOOL =
    0

public actual fun SetupRemoveFromSourceListW(flags: UInt, source: PCWSTR): BOOL =
    0

public actual fun SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    0

public actual fun SetupRenameErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    0u

public actual fun SetupRenameErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    0u

public actual fun SetupScanFileQueueA(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_A, callbackcontext: Long, result: Long): BOOL =
    0

public actual fun SetupScanFileQueueW(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_W, callbackcontext: Long, result: Long): BOOL =
    0

public actual fun SetupSetDirectoryIdA(infhandle: Long, id: UInt, directory: PCSTR): BOOL =
    0

public actual fun SetupSetDirectoryIdExA(infhandle: Long, id: UInt, directory: PCSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    0

public actual fun SetupSetDirectoryIdExW(infhandle: Long, id: UInt, directory: PCWSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    0

public actual fun SetupSetDirectoryIdW(infhandle: Long, id: UInt, directory: PCWSTR): BOOL =
    0

public actual fun SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCSTR): BOOL =
    0

public actual fun SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCWSTR): BOOL =
    0

public actual fun SetupSetFileQueueFlags(filequeue: Long, flagmask: UInt, flags: UInt): BOOL =
    0

public actual fun SetupSetNonInteractiveMode(noninteractiveflag: BOOL): BOOL =
    0

public actual fun SetupSetPlatformPathOverrideA(override: PCSTR): BOOL =
    0

public actual fun SetupSetPlatformPathOverrideW(override: PCWSTR): BOOL =
    0

public actual fun SetupSetSourceListA(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    0

public actual fun SetupSetSourceListW(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    0

public actual fun SetupSetThreadLogToken(logtoken: ULong) {
}

public actual fun SetupTermDefaultQueueCallback(context: Long) {
}

public actual fun SetupTerminateFileLog(fileloghandle: Long): BOOL =
    0

public actual fun SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: UInt, reserved: Long): BOOL =
    0

public actual fun SetupUninstallOEMInfA(inffilename: PCSTR, flags: UInt, reserved: Long): BOOL =
    0

public actual fun SetupUninstallOEMInfW(inffilename: PCWSTR, flags: UInt, reserved: Long): BOOL =
    0

public actual fun SetupVerifyInfFileA(infname: PCSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    0

public actual fun SetupVerifyInfFileW(infname: PCWSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    0

public actual fun SetupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: Long, context: Long) {
}

public actual fun UpdateDriverForPlugAndPlayDevicesA(hwndparent: HWND, hardwareid: PCSTR, fullinfpath: PCSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    0

public actual fun UpdateDriverForPlugAndPlayDevicesW(hwndparent: HWND, hardwareid: PCWSTR, fullinfpath: PCWSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    0
