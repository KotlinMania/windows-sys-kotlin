package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(hnotify: HCMNOTIFICATION, context: Long, action: CM_NOTIFY_ACTION, eventdata: Long, eventdatasize: UInt): UInt
}

public fun interface FnCallback1 {
    public operator fun invoke(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(deviceinfoset: HDEVINFO, newdevicedata: Long, existingdevicedata: Long, comparecontext: Long): UInt
}

public fun CMP_WaitNoPendingInstallEvents(dwtimeout: UInt): UInt {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CMP_WaitNoPendingInstallEvents", longArrayOf(dwtimeout.toLong())).toUInt()
}

public fun CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: UInt, priority: Data.HtmlHelp.PRIORITY, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_Empty_Log_Conf", longArrayOf(plclogconf, dndevinst.toLong(), Win32DynamicFfi.objectSlot(priority), ulflags.toLong())).toUInt()
}

public fun CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, priority: Data.HtmlHelp.PRIORITY, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_Empty_Log_Conf_Ex", longArrayOf(plclogconf, dndevinst.toLong(), Win32DynamicFfi.objectSlot(priority), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Add_IDA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_IDA", longArrayOf(dndevinst.toLong(), pszid, ulflags.toLong())).toUInt()
}

public fun CM_Add_IDW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_IDW", longArrayOf(dndevinst.toLong(), pszid, ulflags.toLong())).toUInt()
}

public fun CM_Add_ID_ExA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_ID_ExA", longArrayOf(dndevinst.toLong(), pszid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Add_ID_ExW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_ID_ExW", longArrayOf(dndevinst.toLong(), pszid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Add_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_Range", longArrayOf(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Add_Res_Des(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_Res_Des", longArrayOf(prdresdes, lclogconf.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Add_Res_Des_Ex", longArrayOf(prdresdes, lclogconf.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Connect_MachineA(uncservername: PCSTR, phmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Connect_MachineA", longArrayOf(uncservername, phmachine)).toUInt()
}

public fun CM_Connect_MachineW(uncservername: PCWSTR, phmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Connect_MachineW", longArrayOf(uncservername, phmachine)).toUInt()
}

public fun CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Create_DevNodeA", longArrayOf(pdndevinst, pdeviceid, dnparent.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Create_DevNodeW", longArrayOf(pdndevinst, pdeviceid, dnparent.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Create_DevNode_ExA", longArrayOf(pdndevinst, pdeviceid, dnparent.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Create_DevNode_ExW", longArrayOf(pdndevinst, pdeviceid, dnparent.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Create_Range_List(prlh: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Create_Range_List", longArrayOf(prlh, ulflags.toLong())).toUInt()
}

public fun CM_Delete_Class_Key(classguid: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Class_Key", longArrayOf(classguid, ulflags.toLong())).toUInt()
}

public fun CM_Delete_Class_Key_Ex(classguid: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Class_Key_Ex", longArrayOf(classguid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Delete_DevNode_Key(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_DevNode_Key", longArrayOf(dndevnode.toLong(), ulhardwareprofile.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Delete_DevNode_Key_Ex(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_DevNode_Key_Ex", longArrayOf(dndevnode.toLong(), ulhardwareprofile.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Delete_Device_Interface_KeyA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Device_Interface_KeyA", longArrayOf(pszdeviceinterface, ulflags.toLong())).toUInt()
}

public fun CM_Delete_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Device_Interface_KeyW", longArrayOf(pszdeviceinterface, ulflags.toLong())).toUInt()
}

public fun CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Device_Interface_Key_ExA", longArrayOf(pszdeviceinterface, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Device_Interface_Key_ExW", longArrayOf(pszdeviceinterface, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Delete_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Delete_Range", longArrayOf(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Detect_Resource_Conflict(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Detect_Resource_Conflict", longArrayOf(dndevinst.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), pbconflictdetected, ulflags.toLong())).toUInt()
}

public fun CM_Detect_Resource_Conflict_Ex(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Detect_Resource_Conflict_Ex", longArrayOf(dndevinst.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), pbconflictdetected, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Disable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Disable_DevNode", longArrayOf(dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Disable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Disable_DevNode_Ex", longArrayOf(dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Disconnect_Machine(hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Disconnect_Machine", longArrayOf(hmachine)).toUInt()
}

public fun CM_Dup_Range_List(rlhold: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Dup_Range_List", longArrayOf(rlhold.toLong(), rlhnew.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Enable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enable_DevNode", longArrayOf(dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Enable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enable_DevNode_Ex", longArrayOf(dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Enumerate_Classes(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enumerate_Classes", longArrayOf(ulclassindex.toLong(), classguid, ulflags.toLong())).toUInt()
}

public fun CM_Enumerate_Classes_Ex(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enumerate_Classes_Ex", longArrayOf(ulclassindex.toLong(), classguid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Enumerate_EnumeratorsA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enumerate_EnumeratorsA", longArrayOf(ulenumindex.toLong(), buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Enumerate_EnumeratorsW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enumerate_EnumeratorsW", longArrayOf(ulenumindex.toLong(), buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Enumerate_Enumerators_ExA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enumerate_Enumerators_ExA", longArrayOf(ulenumindex.toLong(), buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Enumerate_Enumerators_ExW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Enumerate_Enumerators_ExW", longArrayOf(ulenumindex.toLong(), buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Find_Range(pullstart: Long, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Find_Range", longArrayOf(pullstart, ullstart.toLong(), ullength.toLong(), ullalignment.toLong(), ullend.toLong(), rlh.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_First_Range(rlh: ULong, pullstart: Long, pullend: Long, preelement: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_First_Range", longArrayOf(rlh.toLong(), pullstart, pullend, preelement, ulflags.toLong())).toUInt()
}

public fun CM_Free_Log_Conf(lclogconftobefreed: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Log_Conf", longArrayOf(lclogconftobefreed.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Free_Log_Conf_Ex(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Log_Conf_Ex", longArrayOf(lclogconftobefreed.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Free_Log_Conf_Handle(lclogconf: ULong): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Log_Conf_Handle", longArrayOf(lclogconf.toLong())).toUInt()
}

public fun CM_Free_Range_List(rlh: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Range_List", longArrayOf(rlh.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Free_Res_Des(prdresdes: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Res_Des", longArrayOf(prdresdes, rdresdes.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Res_Des_Ex", longArrayOf(prdresdes, rdresdes.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Free_Res_Des_Handle(rdresdes: ULong): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Res_Des_Handle", longArrayOf(rdresdes.toLong())).toUInt()
}

public fun CM_Free_Resource_Conflict_Handle(clconflictlist: ULong): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Free_Resource_Conflict_Handle", longArrayOf(clconflictlist.toLong())).toUInt()
}

public fun CM_Get_Child(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Child", longArrayOf(pdndevinst, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Child_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Child_Ex", longArrayOf(pdndevinst, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Key_NameA", longArrayOf(classguid, pszkeyname, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Key_NameW", longArrayOf(classguid, pszkeyname, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Key_Name_ExA", longArrayOf(classguid, pszkeyname, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Key_Name_ExW", longArrayOf(classguid, pszkeyname, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_NameA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_NameA", longArrayOf(classguid, buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_Class_NameW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_NameW", longArrayOf(classguid, buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_Class_Name_ExA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Name_ExA", longArrayOf(classguid, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_Name_ExW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Name_ExW", longArrayOf(classguid, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_PropertyW", longArrayOf(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toLong())).toUInt()
}

public fun CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Property_ExW", longArrayOf(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Property_Keys", longArrayOf(classguid, propertykeyarray, propertykeycount, ulflags.toLong())).toUInt()
}

public fun CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Property_Keys_Ex", longArrayOf(classguid, propertykeyarray, propertykeycount, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Registry_PropertyA", longArrayOf(classguid, ulproperty.toLong(), pulregdatatype, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Class_Registry_PropertyW", longArrayOf(classguid, ulproperty.toLong(), pulregdatatype, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Depth(puldepth: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Depth", longArrayOf(puldepth, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Depth_Ex(puldepth: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Depth_Ex", longArrayOf(puldepth, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_Custom_PropertyA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Custom_PropertyA", longArrayOf(dndevinst.toLong(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Custom_PropertyW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Custom_PropertyW", longArrayOf(dndevinst.toLong(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Custom_Property_ExA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Custom_Property_ExA", longArrayOf(dndevinst.toLong(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_Custom_Property_ExW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Custom_Property_ExW", longArrayOf(dndevinst.toLong(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_PropertyW", longArrayOf(dndevinst.toLong(), propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Property_ExW", longArrayOf(dndevinst.toLong(), propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_Property_Keys(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Property_Keys", longArrayOf(dndevinst.toLong(), propertykeyarray, propertykeycount, ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Property_Keys_Ex(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Property_Keys_Ex", longArrayOf(dndevinst.toLong(), propertykeyarray, propertykeycount, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Registry_PropertyA", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), pulregdatatype, buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Registry_PropertyW", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), pulregdatatype, buffer, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Registry_Property_ExA", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), pulregdatatype, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Registry_Property_ExW", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), pulregdatatype, buffer, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Status", longArrayOf(pulstatus, pulproblemnumber, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_DevNode_Status_Ex", longArrayOf(pulstatus, pulproblemnumber, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_IDA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_IDA", longArrayOf(dndevinst.toLong(), buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_IDW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_IDW", longArrayOf(dndevinst.toLong(), buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_ID_ExA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_ExA", longArrayOf(dndevinst.toLong(), buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_ID_ExW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_ExW", longArrayOf(dndevinst.toLong(), buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_ID_ListA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_ListA", longArrayOf(pszfilter, buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_ID_ListW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_ListW", longArrayOf(pszfilter, buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_ID_List_ExA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_List_ExA", longArrayOf(pszfilter, buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_ID_List_ExW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_List_ExW", longArrayOf(pszfilter, buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: PCSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_List_SizeA", longArrayOf(pullen, pszfilter, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_List_SizeW", longArrayOf(pullen, pszfilter, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_List_Size_ExA", longArrayOf(pullen, pszfilter, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_List_Size_ExW", longArrayOf(pullen, pszfilter, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_ID_Size(pullen: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_Size", longArrayOf(pullen, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_ID_Size_Ex", longArrayOf(pullen, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_AliasA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_AliasA", longArrayOf(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_AliasW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_AliasW", longArrayOf(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_Alias_ExA", longArrayOf(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_Alias_ExW", longArrayOf(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_ListA", longArrayOf(interfaceclassguid, pdeviceid, buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_ListW", longArrayOf(interfaceclassguid, pdeviceid, buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_List_ExA", longArrayOf(interfaceclassguid, pdeviceid, buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_List_ExW", longArrayOf(interfaceclassguid, pdeviceid, buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_List_SizeA", longArrayOf(pullen, interfaceclassguid, pdeviceid, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_List_SizeW", longArrayOf(pullen, interfaceclassguid, pdeviceid, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_List_Size_ExA", longArrayOf(pullen, interfaceclassguid, pdeviceid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_List_Size_ExW", longArrayOf(pullen, interfaceclassguid, pdeviceid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_PropertyW", longArrayOf(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_Property_ExW", longArrayOf(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_Property_KeysW", longArrayOf(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags.toLong())).toUInt()
}

public fun CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Device_Interface_Property_Keys_ExW", longArrayOf(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_First_Log_Conf", longArrayOf(plclogconf, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_First_Log_Conf_Ex", longArrayOf(plclogconf, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Global_State(pulstate: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Global_State", longArrayOf(pulstate, ulflags.toLong())).toUInt()
}

public fun CM_Get_Global_State_Ex(pulstate: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Global_State_Ex", longArrayOf(pulstate, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_HW_Prof_FlagsA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_HW_Prof_FlagsA", longArrayOf(pdeviceid, ulhardwareprofile.toLong(), pulvalue, ulflags.toLong())).toUInt()
}

public fun CM_Get_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_HW_Prof_FlagsW", longArrayOf(pdeviceid, ulhardwareprofile.toLong(), pulvalue, ulflags.toLong())).toUInt()
}

public fun CM_Get_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_HW_Prof_Flags_ExA", longArrayOf(pdeviceid, ulhardwareprofile.toLong(), pulvalue, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_HW_Prof_Flags_ExW", longArrayOf(pdeviceid, ulhardwareprofile.toLong(), pulvalue, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Hardware_Profile_InfoA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Hardware_Profile_InfoA", longArrayOf(ulindex.toLong(), phwprofileinfo, ulflags.toLong())).toUInt()
}

public fun CM_Get_Hardware_Profile_InfoW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Hardware_Profile_InfoW", longArrayOf(ulindex.toLong(), phwprofileinfo, ulflags.toLong())).toUInt()
}

public fun CM_Get_Hardware_Profile_Info_ExA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Hardware_Profile_Info_ExA", longArrayOf(ulindex.toLong(), phwprofileinfo, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Hardware_Profile_Info_ExW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Hardware_Profile_Info_ExW", longArrayOf(ulindex.toLong(), phwprofileinfo, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Log_Conf_Priority(lclogconf: ULong, ppriority: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Log_Conf_Priority", longArrayOf(lclogconf.toLong(), ppriority, ulflags.toLong())).toUInt()
}

public fun CM_Get_Log_Conf_Priority_Ex(lclogconf: ULong, ppriority: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Log_Conf_Priority_Ex", longArrayOf(lclogconf.toLong(), ppriority, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Next_Log_Conf", longArrayOf(plclogconf, lclogconf.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: ULong, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Next_Log_Conf_Ex", longArrayOf(plclogconf, lclogconf.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Next_Res_Des", longArrayOf(prdresdes, rdresdes.toLong(), forresource.toLong(), presourceid, ulflags.toLong())).toUInt()
}

public fun CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Next_Res_Des_Ex", longArrayOf(prdresdes, rdresdes.toLong(), forresource.toLong(), presourceid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Parent(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Parent", longArrayOf(pdndevinst, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Parent_Ex", longArrayOf(pdndevinst, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Res_Des_Data(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Res_Des_Data", longArrayOf(rdresdes.toLong(), buffer, bufferlen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Res_Des_Data_Ex(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Res_Des_Data_Ex", longArrayOf(rdresdes.toLong(), buffer, bufferlen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Res_Des_Data_Size", longArrayOf(pulsize, rdresdes.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Res_Des_Data_Size_Ex", longArrayOf(pulsize, rdresdes.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Resource_Conflict_Count(clconflictlist: ULong, pulcount: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Resource_Conflict_Count", longArrayOf(clconflictlist.toLong(), pulcount)).toUInt()
}

public fun CM_Get_Resource_Conflict_DetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Resource_Conflict_DetailsA", longArrayOf(clconflictlist.toLong(), ulindex.toLong(), pconflictdetails)).toUInt()
}

public fun CM_Get_Resource_Conflict_DetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Resource_Conflict_DetailsW", longArrayOf(clconflictlist.toLong(), ulindex.toLong(), pconflictdetails)).toUInt()
}

public fun CM_Get_Sibling(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Sibling", longArrayOf(pdndevinst, dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Sibling_Ex", longArrayOf(pdndevinst, dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Get_Version(): UShort {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Version", longArrayOf()).toUShort()
}

public fun CM_Get_Version_Ex(hmachine: Long): UShort {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Get_Version_Ex", longArrayOf(hmachine)).toUShort()
}

public fun CM_Intersect_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Intersect_Range_List", longArrayOf(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Invert_Range_List(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Invert_Range_List", longArrayOf(rlhold.toLong(), rlhnew.toLong(), ullmaxvalue.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Is_Dock_Station_Present(pbpresent: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Is_Dock_Station_Present", longArrayOf(pbpresent)).toUInt()
}

public fun CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Is_Dock_Station_Present_Ex", longArrayOf(pbpresent, hmachine)).toUInt()
}

public fun CM_Is_Version_Available(wversion: UShort): BOOL {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Is_Version_Available", longArrayOf(wversion.toLong())).toInt()
}

public fun CM_Is_Version_Available_Ex(wversion: UShort, hmachine: Long): BOOL {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Is_Version_Available_Ex", longArrayOf(wversion.toLong(), hmachine)).toInt()
}

public fun CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Locate_DevNodeA", longArrayOf(pdndevinst, pdeviceid, ulflags.toLong())).toUInt()
}

public fun CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Locate_DevNodeW", longArrayOf(pdndevinst, pdeviceid, ulflags.toLong())).toUInt()
}

public fun CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Locate_DevNode_ExA", longArrayOf(pdndevinst, pdeviceid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Locate_DevNode_ExW", longArrayOf(pdndevinst, pdeviceid, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_MapCrToWin32Err(cmreturncode: CONFIGRET, defaulterr: UInt): UInt {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_MapCrToWin32Err", longArrayOf(cmreturncode.toLong(), defaulterr.toLong())).toUInt()
}

public fun CM_Merge_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Merge_Range_List", longArrayOf(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Modify_Res_Des(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Modify_Res_Des", longArrayOf(prdresdes, rdresdes.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Modify_Res_Des_Ex", longArrayOf(prdresdes, rdresdes.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Move_DevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Move_DevNode", longArrayOf(dnfromdevinst.toLong(), dntodevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Move_DevNode_Ex(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Move_DevNode_Ex", longArrayOf(dnfromdevinst.toLong(), dntodevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Next_Range", longArrayOf(preelement, pullstart, pullend, ulflags.toLong())).toUInt()
}

public fun CM_Open_Class_KeyA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Class_KeyA", longArrayOf(classguid, pszclassname, samdesired.toLong(), disposition.toLong(), phkclass, ulflags.toLong())).toUInt()
}

public fun CM_Open_Class_KeyW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Class_KeyW", longArrayOf(classguid, pszclassname, samdesired.toLong(), disposition.toLong(), phkclass, ulflags.toLong())).toUInt()
}

public fun CM_Open_Class_Key_ExA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Class_Key_ExA", longArrayOf(classguid, pszclassname, samdesired.toLong(), disposition.toLong(), phkclass, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Open_Class_Key_ExW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Class_Key_ExW", longArrayOf(classguid, pszclassname, samdesired.toLong(), disposition.toLong(), phkclass, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Open_DevNode_Key(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_DevNode_Key", longArrayOf(dndevnode.toLong(), samdesired.toLong(), ulhardwareprofile.toLong(), disposition.toLong(), phkdevice, ulflags.toLong())).toUInt()
}

public fun CM_Open_DevNode_Key_Ex(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_DevNode_Key_Ex", longArrayOf(dndevnode.toLong(), samdesired.toLong(), ulhardwareprofile.toLong(), disposition.toLong(), phkdevice, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Open_Device_Interface_KeyA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Device_Interface_KeyA", longArrayOf(pszdeviceinterface, samdesired.toLong(), disposition.toLong(), phkdeviceinterface, ulflags.toLong())).toUInt()
}

public fun CM_Open_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Device_Interface_KeyW", longArrayOf(pszdeviceinterface, samdesired.toLong(), disposition.toLong(), phkdeviceinterface, ulflags.toLong())).toUInt()
}

public fun CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Device_Interface_Key_ExA", longArrayOf(pszdeviceinterface, samdesired.toLong(), disposition.toLong(), phkdeviceinterface, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Open_Device_Interface_Key_ExW", longArrayOf(pszdeviceinterface, samdesired.toLong(), disposition.toLong(), phkdeviceinterface, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Query_And_Remove_SubTreeA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_And_Remove_SubTreeA", longArrayOf(dnancestor.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Query_And_Remove_SubTreeW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_And_Remove_SubTreeW", longArrayOf(dnancestor.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Query_And_Remove_SubTree_ExA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_And_Remove_SubTree_ExA", longArrayOf(dnancestor.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Query_And_Remove_SubTree_ExW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_And_Remove_SubTree_ExW", longArrayOf(dnancestor.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Arbitrator_Free_Data", longArrayOf(pdata, datalen.toLong(), dndevinst.toLong(), resourceid.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Arbitrator_Free_Data_Ex", longArrayOf(pdata, datalen.toLong(), dndevinst.toLong(), resourceid.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Arbitrator_Free_Size", longArrayOf(pulsize, dndevinst.toLong(), resourceid.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Arbitrator_Free_Size_Ex", longArrayOf(pulsize, dndevinst.toLong(), resourceid.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Query_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Remove_SubTree", longArrayOf(dnancestor.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Query_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Remove_SubTree_Ex", longArrayOf(dnancestor.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: UInt, resourceid: CM_RESTYPE, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Query_Resource_Conflict_List", longArrayOf(pclconflictlist, dndevinst.toLong(), resourceid.toLong(), resourcedata, resourcelen.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Reenumerate_DevNode(dndevinst: UInt, ulflags: CM_REENUMERATE_FLAGS): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Reenumerate_DevNode", longArrayOf(dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Reenumerate_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Reenumerate_DevNode_Ex", longArrayOf(dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Register_Device_Driver(dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Device_Driver", longArrayOf(dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Register_Device_Driver_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Device_Driver_Ex", longArrayOf(dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Register_Device_InterfaceA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Device_InterfaceA", longArrayOf(dndevinst.toLong(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Register_Device_InterfaceW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Device_InterfaceW", longArrayOf(dndevinst.toLong(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toLong())).toUInt()
}

public fun CM_Register_Device_Interface_ExA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Device_Interface_ExA", longArrayOf(dndevinst.toLong(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Register_Device_Interface_ExW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Device_Interface_ExW", longArrayOf(dndevinst.toLong(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: PCM_NOTIFY_CALLBACK, pnotifycontext: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Register_Notification", longArrayOf(pfilter, pcontext, Win32DynamicFfi.objectSlot(pcallback), pnotifycontext)).toUInt()
}

public fun CM_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Remove_SubTree", longArrayOf(dnancestor.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Remove_SubTree_Ex", longArrayOf(dnancestor.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Request_Device_EjectA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Request_Device_EjectA", longArrayOf(dndevinst.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Request_Device_EjectW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Request_Device_EjectW", longArrayOf(dndevinst.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Request_Device_Eject_ExA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Request_Device_Eject_ExA", longArrayOf(dndevinst.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Request_Device_Eject_ExW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Request_Device_Eject_ExW", longArrayOf(dndevinst.toLong(), pvetotype, pszvetoname, ulnamelength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Request_Eject_PC(): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Request_Eject_PC", longArrayOf()).toUInt()
}

public fun CM_Request_Eject_PC_Ex(hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Request_Eject_PC_Ex", longArrayOf(hmachine)).toUInt()
}

public fun CM_Run_Detection(ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Run_Detection", longArrayOf(ulflags.toLong())).toUInt()
}

public fun CM_Run_Detection_Ex(ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Run_Detection_Ex", longArrayOf(ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_Class_PropertyW", longArrayOf(classguid, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_Class_Property_ExW", longArrayOf(classguid, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_Class_Registry_PropertyA", longArrayOf(classguid, ulproperty.toLong(), buffer, ullength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_Class_Registry_PropertyW", longArrayOf(classguid, ulproperty.toLong(), buffer, ullength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_DevNode_Problem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Problem", longArrayOf(dndevinst.toLong(), ulproblem.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_DevNode_Problem_Ex(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Problem_Ex", longArrayOf(dndevinst.toLong(), ulproblem.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_PropertyW", longArrayOf(dndevinst.toLong(), propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Property_ExW", longArrayOf(dndevinst.toLong(), propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Registry_PropertyA", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), buffer, ullength.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Registry_PropertyW", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), buffer, ullength.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Registry_Property_ExA", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), buffer, ullength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_DevNode_Registry_Property_ExW", longArrayOf(dndevinst.toLong(), ulproperty.toLong(), buffer, ullength.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_Device_Interface_PropertyW", longArrayOf(pszdeviceinterface, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_Device_Interface_Property_ExW", longArrayOf(pszdeviceinterface, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_HW_Prof(ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_HW_Prof", longArrayOf(ulhardwareprofile.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_HW_Prof_Ex(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_HW_Prof_Ex", longArrayOf(ulhardwareprofile.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_HW_Prof_FlagsA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_HW_Prof_FlagsA", longArrayOf(pdeviceid, ulconfig.toLong(), ulvalue.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_HW_Prof_FlagsW", longArrayOf(pdeviceid, ulconfig.toLong(), ulvalue.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Set_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_HW_Prof_Flags_ExA", longArrayOf(pdeviceid, ulconfig.toLong(), ulvalue.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Set_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Set_HW_Prof_Flags_ExW", longArrayOf(pdeviceid, ulconfig.toLong(), ulvalue.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Setup_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Setup_DevNode", longArrayOf(dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Setup_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Setup_DevNode_Ex", longArrayOf(dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Test_Range_Available(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Test_Range_Available", longArrayOf(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Uninstall_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Uninstall_DevNode", longArrayOf(dndevinst.toLong(), ulflags.toLong())).toUInt()
}

public fun CM_Uninstall_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Uninstall_DevNode_Ex", longArrayOf(dndevinst.toLong(), ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Unregister_Device_InterfaceA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Unregister_Device_InterfaceA", longArrayOf(pszdeviceinterface, ulflags.toLong())).toUInt()
}

public fun CM_Unregister_Device_InterfaceW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Unregister_Device_InterfaceW", longArrayOf(pszdeviceinterface, ulflags.toLong())).toUInt()
}

public fun CM_Unregister_Device_Interface_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Unregister_Device_Interface_ExA", longArrayOf(pszdeviceinterface, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Unregister_Device_Interface_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Unregister_Device_Interface_ExW", longArrayOf(pszdeviceinterface, ulflags.toLong(), hmachine)).toUInt()
}

public fun CM_Unregister_Notification(notifycontext: HCMNOTIFICATION): CONFIGRET {
    return Win32DynamicFfi.invoke("cfgmgr32.dll", "CM_Unregister_Notification", longArrayOf(notifycontext)).toUInt()
}

public fun DiInstallDevice(hwndparent: Foundation.HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, flags: DIINSTALLDEVICE_FLAGS, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiInstallDevice", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), deviceinfoset, deviceinfodata, driverinfodata, flags.toLong(), needreboot)).toInt()
}

public fun DiInstallDriverA(hwndparent: Foundation.HWND, infpath: PCSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiInstallDriverA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), infpath, flags.toLong(), needreboot)).toInt()
}

public fun DiInstallDriverW(hwndparent: Foundation.HWND, infpath: PCWSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiInstallDriverW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), infpath, flags.toLong(), needreboot)).toInt()
}

public fun DiRollbackDriver(deviceinfoset: HDEVINFO, deviceinfodata: Long, hwndparent: Foundation.HWND, flags: DIROLLBACKDRIVER_FLAGS, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiRollbackDriver", longArrayOf(deviceinfoset, deviceinfodata, Win32DynamicFfi.objectSlot(hwndparent), flags.toLong(), needreboot)).toInt()
}

public fun DiShowUpdateDevice(hwndparent: Foundation.HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiShowUpdateDevice", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), deviceinfoset, deviceinfodata, flags.toLong(), needreboot)).toInt()
}

public fun DiShowUpdateDriver(hwndparent: Foundation.HWND, filepath: PCWSTR, flags: UInt, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiShowUpdateDriver", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), filepath, flags.toLong(), needreboot)).toInt()
}

public fun DiUninstallDevice(hwndparent: Foundation.HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiUninstallDevice", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), deviceinfoset, deviceinfodata, flags.toLong(), needreboot)).toInt()
}

public fun DiUninstallDriverA(hwndparent: Foundation.HWND, infpath: PCSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiUninstallDriverA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), infpath, flags.toLong(), needreboot)).toInt()
}

public fun DiUninstallDriverW(hwndparent: Foundation.HWND, infpath: PCWSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL {
    return Win32DynamicFfi.invoke("newdev.dll", "DiUninstallDriverW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), infpath, flags.toLong(), needreboot)).toInt()
}

public fun InstallHinfSectionA(window: Foundation.HWND, modulehandle: Foundation.HINSTANCE, commandline: PCSTR, showcommand: Int) {
    Win32DynamicFfi.invoke("setupapi.dll", "InstallHinfSectionA", longArrayOf(Win32DynamicFfi.objectSlot(window), Win32DynamicFfi.objectSlot(modulehandle), commandline, showcommand.toLong()))
}

public fun InstallHinfSectionW(window: Foundation.HWND, modulehandle: Foundation.HINSTANCE, commandline: PCWSTR, showcommand: Int) {
    Win32DynamicFfi.invoke("setupapi.dll", "InstallHinfSectionW", longArrayOf(Win32DynamicFfi.objectSlot(window), Win32DynamicFfi.objectSlot(modulehandle), commandline, showcommand.toLong()))
}

public fun SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddInstallSectionToDiskSpaceListA", longArrayOf(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toLong())).toInt()
}

public fun SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddInstallSectionToDiskSpaceListW", longArrayOf(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toLong())).toInt()
}

public fun SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddSectionToDiskSpaceListA", longArrayOf(diskspace, infhandle, listinfhandle, sectionname, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddSectionToDiskSpaceListW", longArrayOf(diskspace, infhandle, listinfhandle, sectionname, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddToDiskSpaceListA", longArrayOf(diskspace, targetfilespec, filesize, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddToDiskSpaceListW", longArrayOf(diskspace, targetfilespec, filesize, operation.toLong(), reserved1, reserved2.toLong())).toInt()
}

public fun SetupAddToSourceListA(flags: UInt, source: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddToSourceListA", longArrayOf(flags.toLong(), source)).toInt()
}

public fun SetupAddToSourceListW(flags: UInt, source: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAddToSourceListW", longArrayOf(flags.toLong(), source)).toInt()
}

public fun SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: PCSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAdjustDiskSpaceListA", longArrayOf(diskspace, driveroot, amount, reserved1, reserved2.toLong())).toInt()
}

public fun SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: PCWSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupAdjustDiskSpaceListW", longArrayOf(diskspace, driveroot, amount, reserved1, reserved2.toLong())).toInt()
}

public fun SetupBackupErrorA(hwndparent: Foundation.HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupBackupErrorA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, sourcefile, targetfile, win32errorcode.toLong(), style.toLong())).toUInt()
}

public fun SetupBackupErrorW(hwndparent: Foundation.HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupBackupErrorW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, sourcefile, targetfile, win32errorcode.toLong(), style.toLong())).toUInt()
}

public fun SetupCancelTemporarySourceList(): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCancelTemporarySourceList", longArrayOf()).toInt()
}

public fun SetupCloseFileQueue(queuehandle: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCloseFileQueue", longArrayOf(queuehandle)).toInt()
}

public fun SetupCloseInfFile(infhandle: Long) {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupCloseInfFile", longArrayOf(infhandle))
}

public fun SetupCloseLog() {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupCloseLog", longArrayOf())
}

public fun SetupCommitFileQueueA(owner: Foundation.HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCommitFileQueueA", longArrayOf(Win32DynamicFfi.objectSlot(owner), queuehandle, Win32DynamicFfi.objectSlot(msghandler), context)).toInt()
}

public fun SetupCommitFileQueueW(owner: Foundation.HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCommitFileQueueW", longArrayOf(Win32DynamicFfi.objectSlot(owner), queuehandle, Win32DynamicFfi.objectSlot(msghandler), context)).toInt()
}

public fun SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupConfigureWmiFromInfSectionA", longArrayOf(infhandle, sectionname, flags.toLong())).toInt()
}

public fun SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupConfigureWmiFromInfSectionW", longArrayOf(infhandle, sectionname, flags.toLong())).toInt()
}

public fun SetupCopyErrorA(hwndparent: Foundation.HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, sourcefile: PCSTR, targetpathfile: PCSTR, win32errorcode: UInt, style: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCopyErrorA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode.toLong(), style.toLong(), pathbuffer, pathbuffersize.toLong(), pathrequiredsize)).toUInt()
}

public fun SetupCopyErrorW(hwndparent: Foundation.HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, sourcefile: PCWSTR, targetpathfile: PCWSTR, win32errorcode: UInt, style: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCopyErrorW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode.toLong(), style.toLong(), pathbuffer, pathbuffersize.toLong(), pathrequiredsize)).toUInt()
}

public fun SetupCopyOEMInfA(sourceinffilename: PCSTR, oemsourcemedialocation: PCSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCopyOEMInfA", longArrayOf(sourceinffilename, oemsourcemedialocation, oemsourcemediatype.toLong(), copystyle.toLong(), destinationinffilename, destinationinffilenamesize.toLong(), requiredsize, destinationinffilenamecomponent)).toInt()
}

public fun SetupCopyOEMInfW(sourceinffilename: PCWSTR, oemsourcemedialocation: PCWSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PWSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCopyOEMInfW", longArrayOf(sourceinffilename, oemsourcemedialocation, oemsourcemediatype.toLong(), copystyle.toLong(), destinationinffilename, destinationinffilenamesize.toLong(), requiredsize, destinationinffilenamecomponent)).toInt()
}

public fun SetupCreateDiskSpaceListA(reserved1: Long, reserved2: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCreateDiskSpaceListA", longArrayOf(reserved1, reserved2.toLong(), flags.toLong()))
}

public fun SetupCreateDiskSpaceListW(reserved1: Long, reserved2: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupCreateDiskSpaceListW", longArrayOf(reserved1, reserved2.toLong(), flags.toLong()))
}

public fun SetupDecompressOrCopyFileA(sourcefilename: PCSTR, targetfilename: PCSTR, compressiontype: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDecompressOrCopyFileA", longArrayOf(sourcefilename, targetfilename, compressiontype)).toUInt()
}

public fun SetupDecompressOrCopyFileW(sourcefilename: PCWSTR, targetfilename: PCWSTR, compressiontype: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDecompressOrCopyFileW", longArrayOf(sourcefilename, targetfilename, compressiontype)).toUInt()
}

public fun SetupDefaultQueueCallbackA(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDefaultQueueCallbackA", longArrayOf(context, notification.toLong(), param1.toLong(), param2.toLong())).toUInt()
}

public fun SetupDefaultQueueCallbackW(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDefaultQueueCallbackW", longArrayOf(context, notification.toLong(), param1.toLong(), param2.toLong())).toUInt()
}

public fun SetupDeleteErrorA(hwndparent: Foundation.HWND, dialogtitle: PCSTR, file: PCSTR, win32errorcode: UInt, style: UInt): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDeleteErrorA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, file, win32errorcode.toLong(), style.toLong())).toUInt()
}

public fun SetupDeleteErrorW(hwndparent: Foundation.HWND, dialogtitle: PCWSTR, file: PCWSTR, win32errorcode: UInt, style: UInt): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDeleteErrorW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), dialogtitle, file, win32errorcode.toLong(), style.toLong())).toUInt()
}

public fun SetupDestroyDiskSpaceList(diskspace: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDestroyDiskSpaceList", longArrayOf(diskspace)).toInt()
}

public fun SetupDiAskForOEMDisk(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiAskForOEMDisk", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiBuildClassInfoList(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiBuildClassInfoList", longArrayOf(flags.toLong(), classguidlist, classguidlistsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiBuildClassInfoListExA(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiBuildClassInfoListExA", longArrayOf(flags.toLong(), classguidlist, classguidlistsize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiBuildClassInfoListExW(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiBuildClassInfoListExW", longArrayOf(flags.toLong(), classguidlist, classguidlistsize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiBuildDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiBuildDriverInfoList", longArrayOf(deviceinfoset, deviceinfodata, drivertype.toLong())).toInt()
}

public fun SetupDiCallClassInstaller(installfunction: DI_FUNCTION, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCallClassInstaller", longArrayOf(installfunction.toLong(), deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiCancelDriverInfoSearch(deviceinfoset: HDEVINFO): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCancelDriverInfoSearch", longArrayOf(deviceinfoset)).toInt()
}

public fun SetupDiChangeState(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiChangeState", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiClassGuidsFromNameA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassGuidsFromNameA", longArrayOf(classname, classguidlist, classguidlistsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiClassGuidsFromNameExA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassGuidsFromNameExA", longArrayOf(classname, classguidlist, classguidlistsize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiClassGuidsFromNameExW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassGuidsFromNameExW", longArrayOf(classname, classguidlist, classguidlistsize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiClassGuidsFromNameW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassGuidsFromNameW", longArrayOf(classname, classguidlist, classguidlistsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiClassNameFromGuidA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassNameFromGuidA", longArrayOf(classguid, classname, classnamesize.toLong(), requiredsize)).toInt()
}

public fun SetupDiClassNameFromGuidExA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassNameFromGuidExA", longArrayOf(classguid, classname, classnamesize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiClassNameFromGuidExW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassNameFromGuidExW", longArrayOf(classguid, classname, classnamesize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiClassNameFromGuidW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiClassNameFromGuidW", longArrayOf(classguid, classname, classnamesize.toLong(), requiredsize)).toInt()
}

public fun SetupDiCreateDevRegKeyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCSTR): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDevRegKeyA", longArrayOf(deviceinfoset, deviceinfodata, scope.toLong(), hwprofile.toLong(), keytype.toLong(), infhandle, infsectionname))
    return System.Registry.HKEY()
}

public fun SetupDiCreateDevRegKeyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCWSTR): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDevRegKeyW", longArrayOf(deviceinfoset, deviceinfodata, scope.toLong(), hwprofile.toLong(), keytype.toLong(), infhandle, infsectionname))
    return System.Registry.HKEY()
}

public fun SetupDiCreateDeviceInfoA(deviceinfoset: HDEVINFO, devicename: PCSTR, classguid: Long, devicedescription: PCSTR, hwndparent: Foundation.HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInfoA", longArrayOf(deviceinfoset, devicename, classguid, devicedescription, Win32DynamicFfi.objectSlot(hwndparent), creationflags.toLong(), deviceinfodata)).toInt()
}

public fun SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: Foundation.HWND): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInfoList", longArrayOf(classguid, Win32DynamicFfi.objectSlot(hwndparent)))
}

public fun SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: Foundation.HWND, machinename: PCSTR, reserved: Long): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInfoListExA", longArrayOf(classguid, Win32DynamicFfi.objectSlot(hwndparent), machinename, reserved))
}

public fun SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: Foundation.HWND, machinename: PCWSTR, reserved: Long): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInfoListExW", longArrayOf(classguid, Win32DynamicFfi.objectSlot(hwndparent), machinename, reserved))
}

public fun SetupDiCreateDeviceInfoW(deviceinfoset: HDEVINFO, devicename: PCWSTR, classguid: Long, devicedescription: PCWSTR, hwndparent: Foundation.HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInfoW", longArrayOf(deviceinfoset, devicename, classguid, devicedescription, Win32DynamicFfi.objectSlot(hwndparent), creationflags.toLong(), deviceinfodata)).toInt()
}

public fun SetupDiCreateDeviceInterfaceA(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInterfaceA", longArrayOf(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags.toLong(), deviceinterfacedata)).toInt()
}

public fun SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCSTR): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInterfaceRegKeyA", longArrayOf(deviceinfoset, deviceinterfacedata, reserved.toLong(), samdesired.toLong(), infhandle, infsectionname))
    return System.Registry.HKEY()
}

public fun SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCWSTR): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInterfaceRegKeyW", longArrayOf(deviceinfoset, deviceinterfacedata, reserved.toLong(), samdesired.toLong(), infhandle, infsectionname))
    return System.Registry.HKEY()
}

public fun SetupDiCreateDeviceInterfaceW(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCWSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiCreateDeviceInterfaceW", longArrayOf(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags.toLong(), deviceinterfacedata)).toInt()
}

public fun SetupDiDeleteDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDeleteDevRegKey", longArrayOf(deviceinfoset, deviceinfodata, scope.toLong(), hwprofile.toLong(), keytype.toLong())).toInt()
}

public fun SetupDiDeleteDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDeleteDeviceInfo", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiDeleteDeviceInterfaceData(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDeleteDeviceInterfaceData", longArrayOf(deviceinfoset, deviceinterfacedata)).toInt()
}

public fun SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDeleteDeviceInterfaceRegKey", longArrayOf(deviceinfoset, deviceinterfacedata, reserved.toLong())).toInt()
}

public fun SetupDiDestroyClassImageList(classimagelistdata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDestroyClassImageList", longArrayOf(classimagelistdata)).toInt()
}

public fun SetupDiDestroyDeviceInfoList(deviceinfoset: HDEVINFO): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDestroyDeviceInfoList", longArrayOf(deviceinfoset)).toInt()
}

public fun SetupDiDestroyDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDestroyDriverInfoList", longArrayOf(deviceinfoset, deviceinfodata, drivertype.toLong())).toInt()
}

public fun SetupDiDrawMiniIcon(hdc: Graphics.Gdi.HDC, rc: Foundation.RECT, miniiconindex: Int, flags: UInt): Int {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiDrawMiniIcon", longArrayOf(Win32DynamicFfi.objectSlot(hdc), Win32DynamicFfi.objectSlot(rc), miniiconindex.toLong(), flags.toLong())).toInt()
}

public fun SetupDiEnumDeviceInfo(deviceinfoset: HDEVINFO, memberindex: UInt, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiEnumDeviceInfo", longArrayOf(deviceinfoset, memberindex.toLong(), deviceinfodata)).toInt()
}

public fun SetupDiEnumDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, memberindex: UInt, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiEnumDeviceInterfaces", longArrayOf(deviceinfoset, deviceinfodata, interfaceclassguid, memberindex.toLong(), deviceinterfacedata)).toInt()
}

public fun SetupDiEnumDriverInfoA(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiEnumDriverInfoA", longArrayOf(deviceinfoset, deviceinfodata, drivertype.toLong(), memberindex.toLong(), driverinfodata)).toInt()
}

public fun SetupDiEnumDriverInfoW(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiEnumDriverInfoW", longArrayOf(deviceinfoset, deviceinfodata, drivertype.toLong(), memberindex.toLong(), driverinfodata)).toInt()
}

public fun SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetActualModelsSectionA", longArrayOf(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toLong(), requiredsize, reserved)).toInt()
}

public fun SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetActualModelsSectionW", longArrayOf(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toLong(), requiredsize, reserved)).toInt()
}

public fun SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: PCSTR, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetActualSectionToInstallA", longArrayOf(infhandle, infsectionname, infsectionwithext, infsectionwithextsize.toLong(), requiredsize, extension)).toInt()
}

public fun SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: PCSTR, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetActualSectionToInstallExA", longArrayOf(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toLong(), requiredsize, extension, reserved)).toInt()
}

public fun SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: PCWSTR, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetActualSectionToInstallExW", longArrayOf(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toLong(), requiredsize, extension, reserved)).toInt()
}

public fun SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: PCWSTR, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetActualSectionToInstallW", longArrayOf(infhandle, infsectionname, infsectionwithext, infsectionwithextsize.toLong(), requiredsize, extension)).toInt()
}

public fun SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassBitmapIndex", longArrayOf(classguid, miniiconindex)).toInt()
}

public fun SetupDiGetClassDescriptionA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDescriptionA", longArrayOf(classguid, classdescription, classdescriptionsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetClassDescriptionExA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDescriptionExA", longArrayOf(classguid, classdescription, classdescriptionsize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiGetClassDescriptionExW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDescriptionExW", longArrayOf(classguid, classdescription, classdescriptionsize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiGetClassDescriptionW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDescriptionW", longArrayOf(classguid, classdescription, classdescriptionsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetClassDevPropertySheetsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDevPropertySheetsA", longArrayOf(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize.toLong(), requiredsize, propertysheettype.toLong())).toInt()
}

public fun SetupDiGetClassDevPropertySheetsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDevPropertySheetsW", longArrayOf(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize.toLong(), requiredsize, propertysheettype.toLong())).toInt()
}

public fun SetupDiGetClassDevsA(classguid: Long, enumerator: PCSTR, hwndparent: Foundation.HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDevsA", longArrayOf(classguid, enumerator, Win32DynamicFfi.objectSlot(hwndparent), flags.toLong()))
}

public fun SetupDiGetClassDevsExA(classguid: Long, enumerator: PCSTR, hwndparent: Foundation.HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCSTR, reserved: Long): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDevsExA", longArrayOf(classguid, enumerator, Win32DynamicFfi.objectSlot(hwndparent), flags.toLong(), deviceinfoset, machinename, reserved))
}

public fun SetupDiGetClassDevsExW(classguid: Long, enumerator: PCWSTR, hwndparent: Foundation.HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCWSTR, reserved: Long): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDevsExW", longArrayOf(classguid, enumerator, Win32DynamicFfi.objectSlot(hwndparent), flags.toLong(), deviceinfoset, machinename, reserved))
}

public fun SetupDiGetClassDevsW(classguid: Long, enumerator: PCWSTR, hwndparent: Foundation.HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassDevsW", longArrayOf(classguid, enumerator, Win32DynamicFfi.objectSlot(hwndparent), flags.toLong()))
}

public fun SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassImageIndex", longArrayOf(classimagelistdata, classguid, imageindex)).toInt()
}

public fun SetupDiGetClassImageList(classimagelistdata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassImageList", longArrayOf(classimagelistdata)).toInt()
}

public fun SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassImageListExA", longArrayOf(classimagelistdata, machinename, reserved)).toInt()
}

public fun SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassImageListExW", longArrayOf(classimagelistdata, machinename, reserved)).toInt()
}

public fun SetupDiGetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassInstallParamsA", longArrayOf(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassInstallParamsW", longArrayOf(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassPropertyExW", longArrayOf(classguid, propertykey, propertytype, propertybuffer, propertybuffersize.toLong(), requiredsize, flags.toLong(), machinename, reserved)).toInt()
}

public fun SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassPropertyKeys", longArrayOf(classguid, propertykeyarray, propertykeycount.toLong(), requiredpropertykeycount, flags.toLong())).toInt()
}

public fun SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassPropertyKeysExW", longArrayOf(classguid, propertykeyarray, propertykeycount.toLong(), requiredpropertykeycount, flags.toLong(), machinename, reserved)).toInt()
}

public fun SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassPropertyW", longArrayOf(classguid, propertykey, propertytype, propertybuffer, propertybuffersize.toLong(), requiredsize, flags.toLong())).toInt()
}

public fun SetupDiGetClassRegistryPropertyA(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassRegistryPropertyA", longArrayOf(classguid, property.toLong(), propertyregdatatype, propertybuffer, propertybuffersize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiGetClassRegistryPropertyW(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetClassRegistryPropertyW", longArrayOf(classguid, property.toLong(), propertyregdatatype, propertybuffer, propertybuffersize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiGetCustomDevicePropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetCustomDevicePropertyA", longArrayOf(deviceinfoset, deviceinfodata, custompropertyname, flags.toLong(), propertyregdatatype, propertybuffer, propertybuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetCustomDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCWSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetCustomDevicePropertyW", longArrayOf(deviceinfoset, deviceinfodata, custompropertyname, flags.toLong(), propertyregdatatype, propertybuffer, propertybuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDeviceInfoListClass(deviceinfoset: HDEVINFO, classguid: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInfoListClass", longArrayOf(deviceinfoset, classguid)).toInt()
}

public fun SetupDiGetDeviceInfoListDetailA(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInfoListDetailA", longArrayOf(deviceinfoset, deviceinfosetdetaildata)).toInt()
}

public fun SetupDiGetDeviceInfoListDetailW(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInfoListDetailW", longArrayOf(deviceinfoset, deviceinfosetdetaildata)).toInt()
}

public fun SetupDiGetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInstallParamsA", longArrayOf(deviceinfoset, deviceinfodata, deviceinstallparams)).toInt()
}

public fun SetupDiGetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInstallParamsW", longArrayOf(deviceinfoset, deviceinfodata, deviceinstallparams)).toInt()
}

public fun SetupDiGetDeviceInstanceIdA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInstanceIdA", longArrayOf(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDeviceInstanceIdW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PWSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInstanceIdW", longArrayOf(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDeviceInterfaceAlias(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInterfaceAlias", longArrayOf(deviceinfoset, deviceinterfacedata, aliasinterfaceclassguid, aliasdeviceinterfacedata)).toInt()
}

public fun SetupDiGetDeviceInterfaceDetailA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInterfaceDetailA", longArrayOf(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize.toLong(), requiredsize, deviceinfodata)).toInt()
}

public fun SetupDiGetDeviceInterfaceDetailW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInterfaceDetailW", longArrayOf(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize.toLong(), requiredsize, deviceinfodata)).toInt()
}

public fun SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInterfacePropertyKeys", longArrayOf(deviceinfoset, deviceinterfacedata, propertykeyarray, propertykeycount.toLong(), requiredpropertykeycount, flags.toLong())).toInt()
}

public fun SetupDiGetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceInterfacePropertyW", longArrayOf(deviceinfoset, deviceinterfacedata, propertykey, propertytype, propertybuffer, propertybuffersize.toLong(), requiredsize, flags.toLong())).toInt()
}

public fun SetupDiGetDevicePropertyKeys(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDevicePropertyKeys", longArrayOf(deviceinfoset, deviceinfodata, propertykeyarray, propertykeycount.toLong(), requiredpropertykeycount, flags.toLong())).toInt()
}

public fun SetupDiGetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDevicePropertyW", longArrayOf(deviceinfoset, deviceinfodata, propertykey, propertytype, propertybuffer, propertybuffersize.toLong(), requiredsize, flags.toLong())).toInt()
}

public fun SetupDiGetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceRegistryPropertyA", longArrayOf(deviceinfoset, deviceinfodata, property.toLong(), propertyregdatatype, propertybuffer, propertybuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDeviceRegistryPropertyW", longArrayOf(deviceinfoset, deviceinfodata, property.toLong(), propertyregdatatype, propertybuffer, propertybuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDriverInfoDetailA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDriverInfoDetailA", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDriverInfoDetailW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDriverInfoDetailW", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDriverInstallParamsA", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)).toInt()
}

public fun SetupDiGetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetDriverInstallParamsW", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)).toInt()
}

public fun SetupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileFriendlyNameA", longArrayOf(hwprofile.toLong(), friendlyname, friendlynamesize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileFriendlyNameExA", longArrayOf(hwprofile.toLong(), friendlyname, friendlynamesize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileFriendlyNameExW", longArrayOf(hwprofile.toLong(), friendlyname, friendlynamesize.toLong(), requiredsize, machinename, reserved)).toInt()
}

public fun SetupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileFriendlyNameW", longArrayOf(hwprofile.toLong(), friendlyname, friendlynamesize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileList", longArrayOf(hwprofilelist, hwprofilelistsize.toLong(), requiredsize, currentlyactiveindex)).toInt()
}

public fun SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileListExA", longArrayOf(hwprofilelist, hwprofilelistsize.toLong(), requiredsize, currentlyactiveindex, machinename, reserved)).toInt()
}

public fun SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetHwProfileListExW", longArrayOf(hwprofilelist, hwprofilelistsize.toLong(), requiredsize, currentlyactiveindex, machinename, reserved)).toInt()
}

public fun SetupDiGetINFClassA(infname: PCSTR, classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetINFClassA", longArrayOf(infname, classguid, classname, classnamesize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetINFClassW(infname: PCWSTR, classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetINFClassW", longArrayOf(infname, classguid, classname, classnamesize.toLong(), requiredsize)).toInt()
}

public fun SetupDiGetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetSelectedDevice", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiGetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetSelectedDriverA", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata)).toInt()
}

public fun SetupDiGetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetSelectedDriverW", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata)).toInt()
}

public fun SetupDiGetWizardPage(deviceinfoset: HDEVINFO, deviceinfodata: Long, installwizarddata: Long, pagetype: UInt, flags: UInt): UI.Controls.HPROPSHEETPAGE {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiGetWizardPage", longArrayOf(deviceinfoset, deviceinfodata, installwizarddata, pagetype.toLong(), flags.toLong()))
    return UI.Controls.HPROPSHEETPAGE()
}

public fun SetupDiInstallClassA(hwndparent: Foundation.HWND, inffilename: PCSTR, flags: UInt, filequeue: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallClassA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), inffilename, flags.toLong(), filequeue)).toInt()
}

public fun SetupDiInstallClassExA(hwndparent: Foundation.HWND, inffilename: PCSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallClassExA", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), inffilename, flags.toLong(), filequeue, interfaceclassguid, reserved1, reserved2)).toInt()
}

public fun SetupDiInstallClassExW(hwndparent: Foundation.HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallClassExW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), inffilename, flags.toLong(), filequeue, interfaceclassguid, reserved1, reserved2)).toInt()
}

public fun SetupDiInstallClassW(hwndparent: Foundation.HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallClassW", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), inffilename, flags.toLong(), filequeue)).toInt()
}

public fun SetupDiInstallDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallDevice", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiInstallDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallDeviceInterfaces", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiInstallDriverFiles(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiInstallDriverFiles", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiLoadClassIcon", longArrayOf(classguid, largeicon, miniiconindex)).toInt()
}

public fun SetupDiLoadDeviceIcon(deviceinfoset: HDEVINFO, deviceinfodata: Long, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiLoadDeviceIcon", longArrayOf(deviceinfoset, deviceinfodata, cxicon.toLong(), cyicon.toLong(), flags.toLong(), hicon)).toInt()
}

public fun SetupDiOpenClassRegKey(classguid: Long, samdesired: UInt): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenClassRegKey", longArrayOf(classguid, samdesired.toLong()))
    return System.Registry.HKEY()
}

public fun SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCSTR, reserved: Long): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenClassRegKeyExA", longArrayOf(classguid, samdesired.toLong(), flags.toLong(), machinename, reserved))
    return System.Registry.HKEY()
}

public fun SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenClassRegKeyExW", longArrayOf(classguid, samdesired.toLong(), flags.toLong(), machinename, reserved))
    return System.Registry.HKEY()
}

public fun SetupDiOpenDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenDevRegKey", longArrayOf(deviceinfoset, deviceinfodata, scope.toLong(), hwprofile.toLong(), keytype.toLong(), samdesired.toLong()))
    return System.Registry.HKEY()
}

public fun SetupDiOpenDeviceInfoA(deviceinfoset: HDEVINFO, deviceinstanceid: PCSTR, hwndparent: Foundation.HWND, openflags: UInt, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenDeviceInfoA", longArrayOf(deviceinfoset, deviceinstanceid, Win32DynamicFfi.objectSlot(hwndparent), openflags.toLong(), deviceinfodata)).toInt()
}

public fun SetupDiOpenDeviceInfoW(deviceinfoset: HDEVINFO, deviceinstanceid: PCWSTR, hwndparent: Foundation.HWND, openflags: UInt, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenDeviceInfoW", longArrayOf(deviceinfoset, deviceinstanceid, Win32DynamicFfi.objectSlot(hwndparent), openflags.toLong(), deviceinfodata)).toInt()
}

public fun SetupDiOpenDeviceInterfaceA(deviceinfoset: HDEVINFO, devicepath: PCSTR, openflags: UInt, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenDeviceInterfaceA", longArrayOf(deviceinfoset, devicepath, openflags.toLong(), deviceinterfacedata)).toInt()
}

public fun SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt): System.Registry.HKEY {
    Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenDeviceInterfaceRegKey", longArrayOf(deviceinfoset, deviceinterfacedata, reserved.toLong(), samdesired.toLong()))
    return System.Registry.HKEY()
}

public fun SetupDiOpenDeviceInterfaceW(deviceinfoset: HDEVINFO, devicepath: PCWSTR, openflags: UInt, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiOpenDeviceInterfaceW", longArrayOf(deviceinfoset, devicepath, openflags.toLong(), deviceinterfacedata)).toInt()
}

public fun SetupDiRegisterCoDeviceInstallers(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiRegisterCoDeviceInstallers", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiRegisterDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, compareproc: PSP_DETSIG_CMPPROC, comparecontext: Long, dupdeviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiRegisterDeviceInfo", longArrayOf(deviceinfoset, deviceinfodata, flags.toLong(), Win32DynamicFfi.objectSlot(compareproc), comparecontext, dupdeviceinfodata)).toInt()
}

public fun SetupDiRemoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiRemoveDevice", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiRemoveDeviceInterface(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiRemoveDeviceInterface", longArrayOf(deviceinfoset, deviceinterfacedata)).toInt()
}

public fun SetupDiRestartDevices(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiRestartDevices", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiSelectBestCompatDrv(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSelectBestCompatDrv", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiSelectDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSelectDevice", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiSelectOEMDrv(hwndparent: Foundation.HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSelectOEMDrv", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiSetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetClassInstallParamsA", longArrayOf(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toLong())).toInt()
}

public fun SetupDiSetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetClassInstallParamsW", longArrayOf(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toLong())).toInt()
}

public fun SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetClassPropertyExW", longArrayOf(classguid, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), flags.toLong(), machinename, reserved)).toInt()
}

public fun SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetClassPropertyW", longArrayOf(classguid, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), flags.toLong())).toInt()
}

public fun SetupDiSetClassRegistryPropertyA(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetClassRegistryPropertyA", longArrayOf(classguid, property.toLong(), propertybuffer, propertybuffersize.toLong(), machinename, reserved)).toInt()
}

public fun SetupDiSetClassRegistryPropertyW(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCWSTR, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetClassRegistryPropertyW", longArrayOf(classguid, property.toLong(), propertybuffer, propertybuffersize.toLong(), machinename, reserved)).toInt()
}

public fun SetupDiSetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDeviceInstallParamsA", longArrayOf(deviceinfoset, deviceinfodata, deviceinstallparams)).toInt()
}

public fun SetupDiSetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDeviceInstallParamsW", longArrayOf(deviceinfoset, deviceinfodata, deviceinstallparams)).toInt()
}

public fun SetupDiSetDeviceInterfaceDefault(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, flags: UInt, reserved: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDeviceInterfaceDefault", longArrayOf(deviceinfoset, deviceinterfacedata, flags.toLong(), reserved)).toInt()
}

public fun SetupDiSetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDeviceInterfacePropertyW", longArrayOf(deviceinfoset, deviceinterfacedata, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), flags.toLong())).toInt()
}

public fun SetupDiSetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Properties.DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDevicePropertyW", longArrayOf(deviceinfoset, deviceinfodata, propertykey, Win32DynamicFfi.objectSlot(propertytype), propertybuffer, propertybuffersize.toLong(), flags.toLong())).toInt()
}

public fun SetupDiSetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDeviceRegistryPropertyA", longArrayOf(deviceinfoset, deviceinfodata, property.toLong(), propertybuffer, propertybuffersize.toLong())).toInt()
}

public fun SetupDiSetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDeviceRegistryPropertyW", longArrayOf(deviceinfoset, deviceinfodata, property.toLong(), propertybuffer, propertybuffersize.toLong())).toInt()
}

public fun SetupDiSetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDriverInstallParamsA", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)).toInt()
}

public fun SetupDiSetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetDriverInstallParamsW", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)).toInt()
}

public fun SetupDiSetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetSelectedDevice", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDiSetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetSelectedDriverA", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata)).toInt()
}

public fun SetupDiSetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiSetSelectedDriverW", longArrayOf(deviceinfoset, deviceinfodata, driverinfodata)).toInt()
}

public fun SetupDiUnremoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDiUnremoveDevice", longArrayOf(deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDuplicateDiskSpaceListA", longArrayOf(diskspace, reserved1, reserved2.toLong(), flags.toLong()))
}

public fun SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupDuplicateDiskSpaceListW", longArrayOf(diskspace, reserved1, reserved2.toLong(), flags.toLong()))
}

public fun SetupEnumInfSectionsA(infhandle: Long, index: UInt, buffer: PSTR, size: UInt, sizeneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupEnumInfSectionsA", longArrayOf(infhandle, index.toLong(), buffer, size.toLong(), sizeneeded)).toInt()
}

public fun SetupEnumInfSectionsW(infhandle: Long, index: UInt, buffer: PWSTR, size: UInt, sizeneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupEnumInfSectionsW", longArrayOf(infhandle, index.toLong(), buffer, size.toLong(), sizeneeded)).toInt()
}

public fun SetupFindFirstLineA(infhandle: Long, section: PCSTR, key: PCSTR, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFindFirstLineA", longArrayOf(infhandle, section, key, context)).toInt()
}

public fun SetupFindFirstLineW(infhandle: Long, section: PCWSTR, key: PCWSTR, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFindFirstLineW", longArrayOf(infhandle, section, key, context)).toInt()
}

public fun SetupFindNextLine(contextin: Long, contextout: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFindNextLine", longArrayOf(contextin, contextout)).toInt()
}

public fun SetupFindNextMatchLineA(contextin: Long, key: PCSTR, contextout: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFindNextMatchLineA", longArrayOf(contextin, key, contextout)).toInt()
}

public fun SetupFindNextMatchLineW(contextin: Long, key: PCWSTR, contextout: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFindNextMatchLineW", longArrayOf(contextin, key, contextout)).toInt()
}

public fun SetupFreeSourceListA(list: Long, count: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFreeSourceListA", longArrayOf(list, count.toLong())).toInt()
}

public fun SetupFreeSourceListW(list: Long, count: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupFreeSourceListW", longArrayOf(list, count.toLong())).toInt()
}

public fun SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetBackupInformationA", longArrayOf(queuehandle, backupparams)).toInt()
}

public fun SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetBackupInformationW", longArrayOf(queuehandle, backupparams)).toInt()
}

public fun SetupGetBinaryField(context: Long, fieldindex: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetBinaryField", longArrayOf(context, fieldindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetFieldCount(context: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFieldCount", longArrayOf(context)).toUInt()
}

public fun SetupGetFileCompressionInfoA(sourcefilename: PCSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFileCompressionInfoA", longArrayOf(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype)).toUInt()
}

public fun SetupGetFileCompressionInfoExA(sourcefilename: PCSTR, actualsourcefilenamebuffer: PCSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFileCompressionInfoExA", longArrayOf(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen.toLong(), requiredbufferlen, sourcefilesize, targetfilesize, compressiontype)).toInt()
}

public fun SetupGetFileCompressionInfoExW(sourcefilename: PCWSTR, actualsourcefilenamebuffer: PCWSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFileCompressionInfoExW", longArrayOf(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen.toLong(), requiredbufferlen, sourcefilesize, targetfilesize, compressiontype)).toInt()
}

public fun SetupGetFileCompressionInfoW(sourcefilename: PCWSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFileCompressionInfoW", longArrayOf(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype)).toUInt()
}

public fun SetupGetFileQueueCount(filequeue: Long, subqueuefileop: UInt, numoperations: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFileQueueCount", longArrayOf(filequeue, subqueuefileop.toLong(), numoperations)).toInt()
}

public fun SetupGetFileQueueFlags(filequeue: Long, flags: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetFileQueueFlags", longArrayOf(filequeue, flags)).toInt()
}

public fun SetupGetInfDriverStoreLocationA(filename: PCSTR, alternateplatforminfo: Long, localename: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfDriverStoreLocationA", longArrayOf(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfDriverStoreLocationW(filename: PCWSTR, alternateplatforminfo: Long, localename: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfDriverStoreLocationW", longArrayOf(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfFileListA(directorypath: PCSTR, infstyle: INF_STYLE, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfFileListA", longArrayOf(directorypath, infstyle.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfFileListW(directorypath: PCWSTR, infstyle: INF_STYLE, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfFileListW", longArrayOf(directorypath, infstyle.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfInformationA(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfInformationA", longArrayOf(infspec, searchcontrol.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfInformationW(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfInformationW", longArrayOf(infspec, searchcontrol.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfPublishedNameA(driverstorelocation: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfPublishedNameA", longArrayOf(driverstorelocation, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetInfPublishedNameW(driverstorelocation: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetInfPublishedNameW", longArrayOf(driverstorelocation, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetIntField(context: Long, fieldindex: UInt, integervalue: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetIntField", longArrayOf(context, fieldindex.toLong(), integervalue)).toInt()
}

public fun SetupGetLineByIndexA(infhandle: Long, section: PCSTR, index: UInt, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetLineByIndexA", longArrayOf(infhandle, section, index.toLong(), context)).toInt()
}

public fun SetupGetLineByIndexW(infhandle: Long, section: PCWSTR, index: UInt, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetLineByIndexW", longArrayOf(infhandle, section, index.toLong(), context)).toInt()
}

public fun SetupGetLineCountA(infhandle: Long, section: PCSTR): Int {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetLineCountA", longArrayOf(infhandle, section)).toInt()
}

public fun SetupGetLineCountW(infhandle: Long, section: PCWSTR): Int {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetLineCountW", longArrayOf(infhandle, section)).toInt()
}

public fun SetupGetLineTextA(context: Long, infhandle: Long, section: PCSTR, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetLineTextA", longArrayOf(context, infhandle, section, key, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetLineTextW(context: Long, infhandle: Long, section: PCWSTR, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetLineTextW", longArrayOf(context, infhandle, section, key, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetMultiSzFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetMultiSzFieldA", longArrayOf(context, fieldindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetMultiSzFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetMultiSzFieldW", longArrayOf(context, fieldindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetNonInteractiveMode(): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetNonInteractiveMode", longArrayOf()).toInt()
}

public fun SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: PCSTR, sourceid: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetSourceFileLocationA", longArrayOf(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: PCWSTR, sourceid: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetSourceFileLocationW", longArrayOf(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: PCSTR, section: PCSTR, filesize: Long, roundingfactor: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetSourceFileSizeA", longArrayOf(infhandle, infcontext, filename, section, filesize, roundingfactor.toLong())).toInt()
}

public fun SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: PCWSTR, section: PCWSTR, filesize: Long, roundingfactor: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetSourceFileSizeW", longArrayOf(infhandle, infcontext, filename, section, filesize, roundingfactor.toLong())).toInt()
}

public fun SetupGetSourceInfoA(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetSourceInfoA", longArrayOf(infhandle, sourceid.toLong(), infodesired.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetSourceInfoW(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetSourceInfoW", longArrayOf(infhandle, sourceid.toLong(), infodesired.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetStringFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetStringFieldA", longArrayOf(context, fieldindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetStringFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetStringFieldW", longArrayOf(context, fieldindex.toLong(), returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetTargetPathA", longArrayOf(infhandle, infcontext, section, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetTargetPathW", longArrayOf(infhandle, infcontext, section, returnbuffer, returnbuffersize.toLong(), requiredsize)).toInt()
}

public fun SetupGetThreadLogToken(): ULong {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupGetThreadLogToken", longArrayOf()).toULong()
}

public fun SetupInitDefaultQueueCallback(ownerwindow: Foundation.HWND): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInitDefaultQueueCallback", longArrayOf(Win32DynamicFfi.objectSlot(ownerwindow)))
}

public fun SetupInitDefaultQueueCallbackEx(ownerwindow: Foundation.HWND, alternateprogresswindow: Foundation.HWND, progressmessage: UInt, reserved1: UInt, reserved2: Long): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInitDefaultQueueCallbackEx", longArrayOf(Win32DynamicFfi.objectSlot(ownerwindow), Win32DynamicFfi.objectSlot(alternateprogresswindow), progressmessage.toLong(), reserved1.toLong(), reserved2))
}

public fun SetupInitializeFileLogA(logfilename: PCSTR, flags: UInt): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInitializeFileLogA", longArrayOf(logfilename, flags.toLong()))
}

public fun SetupInitializeFileLogW(logfilename: PCWSTR, flags: UInt): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInitializeFileLogW", longArrayOf(logfilename, flags.toLong()))
}

public fun SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFileA", longArrayOf(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toLong(), Win32DynamicFfi.objectSlot(copymsghandler), context)).toInt()
}

public fun SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long, filewasinuse: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFileExA", longArrayOf(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toLong(), Win32DynamicFfi.objectSlot(copymsghandler), context, filewasinuse)).toInt()
}

public fun SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long, filewasinuse: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFileExW", longArrayOf(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toLong(), Win32DynamicFfi.objectSlot(copymsghandler), context, filewasinuse)).toInt()
}

public fun SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFileW", longArrayOf(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toLong(), Win32DynamicFfi.objectSlot(copymsghandler), context)).toInt()
}

public fun SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCSTR, sourcerootpath: PCSTR, copyflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFilesFromInfSectionA", longArrayOf(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags.toLong())).toInt()
}

public fun SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCWSTR, sourcerootpath: PCWSTR, copyflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFilesFromInfSectionW", longArrayOf(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags.toLong())).toInt()
}

public fun SetupInstallFromInfSectionA(owner: Foundation.HWND, infhandle: Long, sectionname: PCSTR, flags: UInt, relativekeyroot: System.Registry.HKEY, sourcerootpath: PCSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFromInfSectionA", longArrayOf(Win32DynamicFfi.objectSlot(owner), infhandle, sectionname, flags.toLong(), Win32DynamicFfi.objectSlot(relativekeyroot), sourcerootpath, copyflags.toLong(), Win32DynamicFfi.objectSlot(msghandler), context, deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupInstallFromInfSectionW(owner: Foundation.HWND, infhandle: Long, sectionname: PCWSTR, flags: UInt, relativekeyroot: System.Registry.HKEY, sourcerootpath: PCWSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallFromInfSectionW", longArrayOf(Win32DynamicFfi.objectSlot(owner), infhandle, sectionname, flags.toLong(), Win32DynamicFfi.objectSlot(relativekeyroot), sourcerootpath, copyflags.toLong(), Win32DynamicFfi.objectSlot(msghandler), context, deviceinfoset, deviceinfodata)).toInt()
}

public fun SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallServicesFromInfSectionA", longArrayOf(infhandle, sectionname, flags.toLong())).toInt()
}

public fun SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallServicesFromInfSectionExA", longArrayOf(infhandle, sectionname, flags.toLong(), deviceinfoset, deviceinfodata, reserved1, reserved2)).toInt()
}

public fun SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallServicesFromInfSectionExW", longArrayOf(infhandle, sectionname, flags.toLong(), deviceinfoset, deviceinfodata, reserved1, reserved2)).toInt()
}

public fun SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupInstallServicesFromInfSectionW", longArrayOf(infhandle, sectionname, flags.toLong())).toInt()
}

public fun SetupIterateCabinetA(cabinetfile: PCSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupIterateCabinetA", longArrayOf(cabinetfile, reserved.toLong(), Win32DynamicFfi.objectSlot(msghandler), context)).toInt()
}

public fun SetupIterateCabinetW(cabinetfile: PCWSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupIterateCabinetW", longArrayOf(cabinetfile, reserved.toLong(), Win32DynamicFfi.objectSlot(msghandler), context)).toInt()
}

public fun SetupLogErrorA(messagestring: PCSTR, severity: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupLogErrorA", longArrayOf(messagestring, severity.toLong())).toInt()
}

public fun SetupLogErrorW(messagestring: PCWSTR, severity: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupLogErrorW", longArrayOf(messagestring, severity.toLong())).toInt()
}

public fun SetupLogFileA(fileloghandle: Long, logsectionname: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, checksum: UInt, disktagfile: PCSTR, diskdescription: PCSTR, otherinfo: PCSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupLogFileA", longArrayOf(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum.toLong(), disktagfile, diskdescription, otherinfo, flags.toLong())).toInt()
}

public fun SetupLogFileW(fileloghandle: Long, logsectionname: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, checksum: UInt, disktagfile: PCWSTR, diskdescription: PCWSTR, otherinfo: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupLogFileW", longArrayOf(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum.toLong(), disktagfile, diskdescription, otherinfo, flags.toLong())).toInt()
}

public fun SetupOpenAppendInfFileA(filename: PCSTR, infhandle: Long, errorline: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenAppendInfFileA", longArrayOf(filename, infhandle, errorline)).toInt()
}

public fun SetupOpenAppendInfFileW(filename: PCWSTR, infhandle: Long, errorline: Long): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenAppendInfFileW", longArrayOf(filename, infhandle, errorline)).toInt()
}

public fun SetupOpenFileQueue(): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenFileQueue", longArrayOf())
}

public fun SetupOpenInfFileA(filename: PCSTR, infclass: PCSTR, infstyle: INF_STYLE, errorline: Long): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenInfFileA", longArrayOf(filename, infclass, infstyle.toLong(), errorline))
}

public fun SetupOpenInfFileW(filename: PCWSTR, infclass: PCWSTR, infstyle: INF_STYLE, errorline: Long): Long {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenInfFileW", longArrayOf(filename, infclass, infstyle.toLong(), errorline))
}

public fun SetupOpenLog(erase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("setupapi.dll", "SetupOpenLog", longArrayOf(erase.toLong())).toInt()
}
