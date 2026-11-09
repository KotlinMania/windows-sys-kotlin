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

private object WindowsWin32DevicesDeviceanddriverinstallationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents(dwtimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: Int, priority: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: Int, priority: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA(dndevinst: Int, pszid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW(dndevinst: Int, pszid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA(dndevinst: Int, pszid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW(dndevinst: Int, pszid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des(prdresdes: Long, lclogconf: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA(uncservername: Long, phmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW(uncservername: Long, phmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List(prlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key(classguid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex(classguid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict(dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, pbconflictdetected: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex(dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, pbconflictdetected: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine(hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List(rlhold: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes(ulclassindex: Int, classguid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex(ulclassindex: Int, classguid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range(pullstart: Long, ullstart: Long, ullength: Int, ullalignment: Long, ullend: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range(rlh: Long, pullstart: Long, pullend: Long, preelement: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf(lclogconftobefreed: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex(lclogconftobefreed: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle(lclogconf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List(rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des(prdresdes: Long, rdresdes: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle(rdresdes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle(clconflictlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA(classguid: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW(classguid: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA(classguid: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW(classguid: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth(puldepth: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex(puldepth: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW(dndevinst: Int, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW(dndevinst: Int, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys(dndevinst: Int, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex(dndevinst: Int, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size(pullen: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW(pszdeviceinterface: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State(pulstate: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex(pulstate: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA(ulindex: Int, phwprofileinfo: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW(ulindex: Int, phwprofileinfo: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA(ulindex: Int, phwprofileinfo: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW(ulindex: Int, phwprofileinfo: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority(lclogconf: Long, ppriority: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex(lclogconf: Long, ppriority: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: Long, forresource: Int, presourceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: Long, forresource: Int, presourceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data(rdresdes: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex(rdresdes: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count(clconflictlist: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA(clconflictlist: Long, ulindex: Int, pconflictdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW(clconflictlist: Long, ulindex: Int, pconflictdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version(): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex(hmachine: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List(rlhold: Long, rlhnew: Long, ullmaxvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present(pbpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available(wversion: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex(wversion: Short, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err(cmreturncode: Int, defaulterr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des(prdresdes: Long, rdresdes: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key(dndevnode: Int, samdesired: Int, ulhardwareprofile: Int, disposition: Int, phkdevice: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex(dndevnode: Int, samdesired: Int, ulhardwareprofile: Int, disposition: Int, phkdevice: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: Int, dndevinst: Int, resourceid: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: Int, dndevinst: Int, resourceid: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: Int, resourceid: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: Int, resourceid: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree(dnancestor: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex(dnancestor: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: Long, pnotifycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree(dnancestor: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex(dnancestor: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex(hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection(ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex(ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem(dndevinst: Int, ulproblem: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex(dndevinst: Int, ulproblem: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW(dndevinst: Int, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW(dndevinst: Int, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW(pszdeviceinterface: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof(ulhardwareprofile: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex(ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification(notifycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver(deviceinfoset: Long, deviceinfodata: Long, hwndparent: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver(hwndparent: Long, filepath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA(window: Long, modulehandle: Long, commandline: Long, showcommand: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW(window: Long, modulehandle: Long, commandline: Long, showcommand: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: Long, filesize: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: Long, filesize: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: Long, amount: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: Long, amount: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue(queuehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile(infhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog()

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA(owner: Long, queuehandle: Long, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW(owner: Long, queuehandle: Long, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, sourcefile: Long, targetpathfile: Long, win32errorcode: Int, style: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, sourcefile: Long, targetpathfile: Long, win32errorcode: Int, style: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA(sourceinffilename: Long, oemsourcemedialocation: Long, oemsourcemediatype: Int, copystyle: Int, destinationinffilename: Long, destinationinffilenamesize: Int, requiredsize: Long, destinationinffilenamecomponent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW(sourceinffilename: Long, oemsourcemedialocation: Long, oemsourcemediatype: Int, copystyle: Int, destinationinffilename: Long, destinationinffilenamesize: Int, requiredsize: Long, destinationinffilenamecomponent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA(reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW(reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA(sourcefilename: Long, targetfilename: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW(sourcefilename: Long, targetfilename: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA(context: Long, notification: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW(context: Long, notification: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA(hwndparent: Long, dialogtitle: Long, file: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW(hwndparent: Long, dialogtitle: Long, file: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList(diskspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller(installfunction: Int, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch(deviceinfoset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA(deviceinfoset: Long, devicename: Long, classguid: Long, devicedescription: Long, hwndparent: Long, creationflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW(deviceinfoset: Long, devicename: Long, classguid: Long, devicedescription: Long, hwndparent: Long, creationflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, referencestring: Long, creationflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, referencestring: Long, creationflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData(deviceinfoset: Long, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList(classimagelistdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList(deviceinfoset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo(deviceinfoset: Long, memberindex: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, memberindex: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int, memberindex: Int, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int, memberindex: Int, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA(deviceinfoset: Long, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: Int, requiredsize: Long, propertysheettype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW(deviceinfoset: Long, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: Int, requiredsize: Long, propertysheettype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int, deviceinfoset: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int, deviceinfoset: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList(classimagelistdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA(classguid: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW(classguid: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA(deviceinfoset: Long, deviceinfodata: Long, custompropertyname: Long, flags: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, custompropertyname: Long, flags: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass(deviceinfoset: Long, classguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA(deviceinfoset: Long, deviceinfosetdetaildata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW(deviceinfoset: Long, deviceinfosetdetaildata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA(deviceinfoset: Long, deviceinfodata: Long, deviceinstanceid: Long, deviceinstanceidsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW(deviceinfoset: Long, deviceinfodata: Long, deviceinstanceid: Long, deviceinstanceidsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias(deviceinfoset: Long, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA(deviceinfoset: Long, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: Int, requiredsize: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW(deviceinfoset: Long, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: Int, requiredsize: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Long, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW(deviceinfoset: Long, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys(deviceinfoset: Long, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA(infname: Long, classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW(infname: Long, classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage(deviceinfoset: Long, deviceinfodata: Long, installwizarddata: Long, pagetype: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon(deviceinfoset: Long, deviceinfodata: Long, cxicon: Int, cyicon: Int, flags: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey(classguid: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: Int, flags: Int, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: Int, flags: Int, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA(deviceinfoset: Long, deviceinstanceid: Long, hwndparent: Long, openflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW(deviceinfoset: Long, deviceinstanceid: Long, hwndparent: Long, openflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA(deviceinfoset: Long, devicepath: Long, openflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW(deviceinfoset: Long, devicepath: Long, openflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo(deviceinfoset: Long, deviceinfodata: Long, flags: Int, compareproc: Long, comparecontext: Long, dupdeviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface(deviceinfoset: Long, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA(classguid: Long, property: Int, propertybuffer: Long, propertybuffersize: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW(classguid: Long, property: Int, propertybuffer: Long, propertybuffersize: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault(deviceinfoset: Long, deviceinterfacedata: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW(deviceinfoset: Long, deviceinterfacedata: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertybuffer: Long, propertybuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertybuffer: Long, propertybuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA(infhandle: Long, index: Int, buffer: Long, size: Int, sizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW(infhandle: Long, index: Int, buffer: Long, size: Int, sizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA(infhandle: Long, section: Long, key: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW(infhandle: Long, section: Long, key: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine(contextin: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA(contextin: Long, key: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW(contextin: Long, key: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA(list: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW(list: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA(sourcefilename: Long, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA(sourcefilename: Long, actualsourcefilenamebuffer: Long, actualsourcefilenamebufferlen: Int, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW(sourcefilename: Long, actualsourcefilenamebuffer: Long, actualsourcefilenamebufferlen: Int, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW(sourcefilename: Long, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount(filequeue: Long, subqueuefileop: Int, numoperations: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags(filequeue: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA(filename: Long, alternateplatforminfo: Long, localename: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW(filename: Long, alternateplatforminfo: Long, localename: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA(directorypath: Long, infstyle: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW(directorypath: Long, infstyle: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA(infspec: Long, searchcontrol: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW(infspec: Long, searchcontrol: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA(driverstorelocation: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW(driverstorelocation: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField(context: Long, fieldindex: Int, integervalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA(infhandle: Long, section: Long, index: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW(infhandle: Long, section: Long, index: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA(infhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW(infhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA(context: Long, infhandle: Long, section: Long, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW(context: Long, infhandle: Long, section: Long, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: Long, sourceid: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: Long, sourceid: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: Long, section: Long, filesize: Long, roundingfactor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: Long, section: Long, filesize: Long, roundingfactor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA(infhandle: Long, sourceid: Int, infodesired: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW(infhandle: Long, sourceid: Int, infodesired: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback(ownerwindow: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx(ownerwindow: Long, alternateprogresswindow: Long, progressmessage: Int, reserved1: Int, reserved2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA(logfilename: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW(logfilename: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long, filewasinuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long, filewasinuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: Long, sourcerootpath: Long, copyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: Long, sourcerootpath: Long, copyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA(owner: Long, infhandle: Long, sectionname: Long, flags: Int, relativekeyroot: Long, sourcerootpath: Long, copyflags: Int, msghandler: Long, context: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW(owner: Long, infhandle: Long, sectionname: Long, flags: Int, relativekeyroot: Long, sourcerootpath: Long, copyflags: Int, msghandler: Long, context: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: Long, flags: Int, deviceinfoset: Long, deviceinfodata: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: Long, flags: Int, deviceinfoset: Long, deviceinfodata: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA(cabinetfile: Long, reserved: Int, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW(cabinetfile: Long, reserved: Int, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA(messagestring: Long, severity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW(messagestring: Long, severity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA(fileloghandle: Long, logsectionname: Long, sourcefilename: Long, targetfilename: Long, checksum: Int, disktagfile: Long, diskdescription: Long, otherinfo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW(fileloghandle: Long, logsectionname: Long, sourcefilename: Long, targetfilename: Long, checksum: Int, disktagfile: Long, diskdescription: Long, otherinfo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA(filename: Long, infhandle: Long, errorline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW(filename: Long, infhandle: Long, errorline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA(filename: Long, infclass: Long, infstyle: Int, errorline: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW(filename: Long, infclass: Long, infstyle: Int, errorline: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog(erase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: Long, restoreflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: Long, restoreflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, filesought: Long, tagfile: Long, diskpromptstyle: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, filesought: Long, tagfile: Long, diskpromptstyle: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot(filequeue: Long, owner: Long, scanonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA(fileloghandle: Long, logsectionname: Long, targetfilename: Long, desiredinfo: Int, dataout: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW(fileloghandle: Long, logsectionname: Long, targetfilename: Long, desiredinfo: Int, dataout: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA(infinformation: Long, infindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW(infinformation: Long, infindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: Int, alternateplatforminfo: Long, originalfileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: Int, alternateplatforminfo: Long, originalfileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA(infinformation: Long, infindex: Int, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW(infinformation: Long, infindex: Int, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA(flags: Int, list: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW(flags: Int, list: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: Long, spacerequired: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: Long, spacerequired: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA(queuehandle: Long, sourcerootpath: Long, sourcepath: Long, sourcefilename: Long, sourcedescription: Long, sourcetagfile: Long, targetdirectory: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA(copyparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW(copyparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: Long, infhandle: Long, listinfhandle: Long, section: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: Long, infhandle: Long, listinfhandle: Long, section: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW(queuehandle: Long, sourcerootpath: Long, sourcepath: Long, sourcefilename: Long, sourcedescription: Long, sourcetagfile: Long, targetdirectory: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: Long, sourcefilename: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: Long, sourcefilename: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA(queuehandle: Long, pathpart1: Long, pathpart2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW(queuehandle: Long, pathpart1: Long, pathpart2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA(queuehandle: Long, sourcepath: Long, sourcefilename: Long, targetpath: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW(queuehandle: Long, sourcepath: Long, sourcefilename: Long, targetpath: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA(filequeue: Long, flags: Int, window: Long, callbackroutine: Long, callbackcontext: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW(filequeue: Long, flags: Int, window: Long, callbackroutine: Long, callbackcontext: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA(infhandle: Long, id: Int, directory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA(infhandle: Long, id: Int, directory: Long, flags: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW(infhandle: Long, id: Int, directory: Long, flags: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW(infhandle: Long, id: Int, directory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags(filequeue: Long, flagmask: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode(noninteractiveflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA(override: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW(override: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA(flags: Int, sourcelist: Long, sourcecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW(flags: Int, sourcelist: Long, sourcecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken(logtoken: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback(context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog(fileloghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA(inffilename: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW(inffilename: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA(infname: Long, altplatforminfo: Long, infsignerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW(infname: Long, altplatforminfo: Long, infsignerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine(logtoken: Long, flags: Int, infhandle: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA(hwndparent: Long, hardwareid: Long, fullinfpath: Long, installflags: Int, brebootrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW(hwndparent: Long, hardwareid: Long, fullinfpath: Long, installflags: Int, brebootrequired: Long): Int
}

public actual fun CMP_WaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents(dwtimeout.toInt()).toUInt()

public actual fun CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf(plclogconf, dndevinst.toInt(), priority, ulflags.toInt()).toUInt()

public actual fun CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex(plclogconf, dndevinst.toInt(), priority, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Add_IDA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA(dndevinst.toInt(), pszid, ulflags.toInt()).toUInt()

public actual fun CM_Add_IDW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW(dndevinst.toInt(), pszid, ulflags.toInt()).toUInt()

public actual fun CM_Add_ID_ExA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA(dndevinst.toInt(), pszid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Add_ID_ExW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW(dndevinst.toInt(), pszid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Add_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Add_Res_Des(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des(prdresdes, lclogconf.toLong(), resourceid.toInt(), resourcedata, resourcelen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex(prdresdes, lclogconf.toLong(), resourceid.toInt(), resourcedata, resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Connect_MachineA(uncservername: PCSTR, phmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA(uncservername, phmachine).toUInt()

public actual fun CM_Connect_MachineW(uncservername: PCWSTR, phmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW(uncservername, phmachine).toUInt()

public actual fun CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA(pdndevinst, pdeviceid, dnparent.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW(pdndevinst, pdeviceid, dnparent.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA(pdndevinst, pdeviceid, dnparent.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW(pdndevinst, pdeviceid, dnparent.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Create_Range_List(prlh: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List(prlh, ulflags.toInt()).toUInt()

public actual fun CM_Delete_Class_Key(classguid: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key(classguid, ulflags.toInt()).toUInt()

public actual fun CM_Delete_Class_Key_Ex(classguid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex(classguid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Delete_DevNode_Key(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Delete_DevNode_Key_Ex(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Delete_Device_Interface_KeyA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA(pszdeviceinterface, ulflags.toInt()).toUInt()

public actual fun CM_Delete_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW(pszdeviceinterface, ulflags.toInt()).toUInt()

public actual fun CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Delete_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Detect_Resource_Conflict(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict(dndevinst.toInt(), resourceid.toInt(), resourcedata, resourcelen.toInt(), pbconflictdetected, ulflags.toInt()).toUInt()

public actual fun CM_Detect_Resource_Conflict_Ex(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex(dndevinst.toInt(), resourceid.toInt(), resourcedata, resourcelen.toInt(), pbconflictdetected, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Disable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Disable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Disconnect_Machine(hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine(hmachine).toUInt()

public actual fun CM_Dup_Range_List(rlhold: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List(rlhold.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Enable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Enable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Enumerate_Classes(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes(ulclassindex.toInt(), classguid, ulflags.toInt()).toUInt()

public actual fun CM_Enumerate_Classes_Ex(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex(ulclassindex.toInt(), classguid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Enumerate_EnumeratorsA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA(ulenumindex.toInt(), buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Enumerate_EnumeratorsW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW(ulenumindex.toInt(), buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Enumerate_Enumerators_ExA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA(ulenumindex.toInt(), buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Enumerate_Enumerators_ExW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW(ulenumindex.toInt(), buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Find_Range(pullstart: Long, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range(pullstart, ullstart.toLong(), ullength.toInt(), ullalignment.toLong(), ullend.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_First_Range(rlh: ULong, pullstart: Long, pullend: Long, preelement: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range(rlh.toLong(), pullstart, pullend, preelement, ulflags.toInt()).toUInt()

public actual fun CM_Free_Log_Conf(lclogconftobefreed: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf(lclogconftobefreed.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Free_Log_Conf_Ex(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex(lclogconftobefreed.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Free_Log_Conf_Handle(lclogconf: ULong): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle(lclogconf.toLong()).toUInt()

public actual fun CM_Free_Range_List(rlh: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List(rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Free_Res_Des(prdresdes: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des(prdresdes, rdresdes.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex(prdresdes, rdresdes.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Free_Res_Des_Handle(rdresdes: ULong): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle(rdresdes.toLong()).toUInt()

public actual fun CM_Free_Resource_Conflict_Handle(clconflictlist: ULong): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle(clconflictlist.toLong()).toUInt()

public actual fun CM_Get_Child(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child(pdndevinst, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Child_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex(pdndevinst, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA(classguid, pszkeyname, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW(classguid, pszkeyname, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA(classguid, pszkeyname, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW(classguid, pszkeyname, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_NameA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA(classguid, buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_Class_NameW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW(classguid, buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_Class_Name_ExA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA(classguid, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_Name_ExW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW(classguid, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toInt()).toUInt()

public actual fun CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys(classguid, propertykeyarray, propertykeycount, ulflags.toInt()).toUInt()

public actual fun CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex(classguid, propertykeyarray, propertykeycount, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA(classguid, ulproperty.toInt(), pulregdatatype, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW(classguid, ulproperty.toInt(), pulregdatatype, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Depth(puldepth: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth(puldepth, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Depth_Ex(puldepth: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex(puldepth, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_Custom_PropertyA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA(dndevinst.toInt(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Custom_PropertyW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW(dndevinst.toInt(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Custom_Property_ExA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA(dndevinst.toInt(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_Custom_Property_ExW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW(dndevinst.toInt(), pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW(dndevinst.toInt(), propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW(dndevinst.toInt(), propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_Property_Keys(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys(dndevinst.toInt(), propertykeyarray, propertykeycount, ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Property_Keys_Ex(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex(dndevinst.toInt(), propertykeyarray, propertykeycount, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype, buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype, buffer, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype, buffer, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status(pulstatus, pulproblemnumber, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex(pulstatus, pulproblemnumber, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_IDA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA(dndevinst.toInt(), buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_IDW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW(dndevinst.toInt(), buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_ID_ExA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA(dndevinst.toInt(), buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_ID_ExW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW(dndevinst.toInt(), buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_ID_ListA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA(pszfilter, buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_ID_ListW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW(pszfilter, buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_ID_List_ExA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA(pszfilter, buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_ID_List_ExW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW(pszfilter, buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: PCSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA(pullen, pszfilter, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW(pullen, pszfilter, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA(pullen, pszfilter, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW(pullen, pszfilter, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_ID_Size(pullen: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size(pullen, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex(pullen, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_AliasA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_AliasW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA(interfaceclassguid, pdeviceid, buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW(interfaceclassguid, pdeviceid, buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA(interfaceclassguid, pdeviceid, buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW(interfaceclassguid, pdeviceid, buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA(pullen, interfaceclassguid, pdeviceid, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW(pullen, interfaceclassguid, pdeviceid, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA(pullen, interfaceclassguid, pdeviceid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW(pullen, interfaceclassguid, pdeviceid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags.toInt()).toUInt()

public actual fun CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf(plclogconf, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex(plclogconf, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Global_State(pulstate: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State(pulstate, ulflags.toInt()).toUInt()

public actual fun CM_Get_Global_State_Ex(pulstate: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex(pulstate, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_HW_Prof_FlagsA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA(pdeviceid, ulhardwareprofile.toInt(), pulvalue, ulflags.toInt()).toUInt()

public actual fun CM_Get_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW(pdeviceid, ulhardwareprofile.toInt(), pulvalue, ulflags.toInt()).toUInt()

public actual fun CM_Get_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA(pdeviceid, ulhardwareprofile.toInt(), pulvalue, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW(pdeviceid, ulhardwareprofile.toInt(), pulvalue, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Hardware_Profile_InfoA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA(ulindex.toInt(), phwprofileinfo, ulflags.toInt()).toUInt()

public actual fun CM_Get_Hardware_Profile_InfoW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW(ulindex.toInt(), phwprofileinfo, ulflags.toInt()).toUInt()

public actual fun CM_Get_Hardware_Profile_Info_ExA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA(ulindex.toInt(), phwprofileinfo, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Hardware_Profile_Info_ExW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW(ulindex.toInt(), phwprofileinfo, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Log_Conf_Priority(lclogconf: ULong, ppriority: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority(lclogconf.toLong(), ppriority, ulflags.toInt()).toUInt()

public actual fun CM_Get_Log_Conf_Priority_Ex(lclogconf: ULong, ppriority: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex(lclogconf.toLong(), ppriority, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf(plclogconf, lclogconf.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex(plclogconf, lclogconf.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des(prdresdes, rdresdes.toLong(), forresource.toInt(), presourceid, ulflags.toInt()).toUInt()

public actual fun CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex(prdresdes, rdresdes.toLong(), forresource.toInt(), presourceid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Parent(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent(pdndevinst, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex(pdndevinst, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Res_Des_Data(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data(rdresdes.toLong(), buffer, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Res_Des_Data_Ex(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex(rdresdes.toLong(), buffer, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size(pulsize, rdresdes.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex(pulsize, rdresdes.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Resource_Conflict_Count(clconflictlist: ULong, pulcount: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count(clconflictlist.toLong(), pulcount).toUInt()

public actual fun CM_Get_Resource_Conflict_DetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA(clconflictlist.toLong(), ulindex.toInt(), pconflictdetails).toUInt()

public actual fun CM_Get_Resource_Conflict_DetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW(clconflictlist.toLong(), ulindex.toInt(), pconflictdetails).toUInt()

public actual fun CM_Get_Sibling(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling(pdndevinst, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex(pdndevinst, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Get_Version(): UShort =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version().toUShort()

public actual fun CM_Get_Version_Ex(hmachine: Long): UShort =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex(hmachine).toUShort()

public actual fun CM_Intersect_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Invert_Range_List(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List(rlhold.toLong(), rlhnew.toLong(), ullmaxvalue.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Is_Dock_Station_Present(pbpresent: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present(pbpresent).toUInt()

public actual fun CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex(pbpresent, hmachine).toUInt()

public actual fun CM_Is_Version_Available(wversion: UShort): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available(wversion.toShort())

public actual fun CM_Is_Version_Available_Ex(wversion: UShort, hmachine: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex(wversion.toShort(), hmachine)

public actual fun CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA(pdndevinst, pdeviceid, ulflags.toInt()).toUInt()

public actual fun CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW(pdndevinst, pdeviceid, ulflags.toInt()).toUInt()

public actual fun CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA(pdndevinst, pdeviceid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW(pdndevinst, pdeviceid, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_MapCrToWin32Err(cmreturncode: CONFIGRET, defaulterr: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()).toUInt()

public actual fun CM_Merge_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Modify_Res_Des(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des(prdresdes, rdresdes.toLong(), resourceid.toInt(), resourcedata, resourcelen.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex(prdresdes, rdresdes.toLong(), resourceid.toInt(), resourcedata, resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Move_DevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Move_DevNode_Ex(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range(preelement, pullstart, pullend, ulflags.toInt()).toUInt()

public actual fun CM_Open_Class_KeyA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA(classguid, pszclassname, samdesired.toInt(), disposition.toInt(), phkclass, ulflags.toInt()).toUInt()

public actual fun CM_Open_Class_KeyW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW(classguid, pszclassname, samdesired.toInt(), disposition.toInt(), phkclass, ulflags.toInt()).toUInt()

public actual fun CM_Open_Class_Key_ExA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA(classguid, pszclassname, samdesired.toInt(), disposition.toInt(), phkclass, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Open_Class_Key_ExW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW(classguid, pszclassname, samdesired.toInt(), disposition.toInt(), phkclass, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Open_DevNode_Key(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice, ulflags.toInt()).toUInt()

public actual fun CM_Open_DevNode_Key_Ex(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Open_Device_Interface_KeyA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA(pszdeviceinterface, samdesired.toInt(), disposition.toInt(), phkdeviceinterface, ulflags.toInt()).toUInt()

public actual fun CM_Open_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW(pszdeviceinterface, samdesired.toInt(), disposition.toInt(), phkdeviceinterface, ulflags.toInt()).toUInt()

public actual fun CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA(pszdeviceinterface, samdesired.toInt(), disposition.toInt(), phkdeviceinterface, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW(pszdeviceinterface, samdesired.toInt(), disposition.toInt(), phkdeviceinterface, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Query_And_Remove_SubTreeA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA(dnancestor.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Query_And_Remove_SubTreeW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW(dnancestor.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Query_And_Remove_SubTree_ExA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA(dnancestor.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Query_And_Remove_SubTree_ExW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW(dnancestor.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data(pdata, datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex(pdata, datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size(pulsize, dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex(pulsize, dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Query_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Query_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: UInt, resourceid: CM_RESTYPE, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List(pclconflictlist, dndevinst.toInt(), resourceid.toInt(), resourcedata, resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Reenumerate_DevNode(dndevinst: UInt, ulflags: CM_REENUMERATE_FLAGS): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Reenumerate_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Register_Device_Driver(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Register_Device_Driver_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Register_Device_InterfaceA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA(dndevinst.toInt(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Register_Device_InterfaceW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW(dndevinst.toInt(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toInt()).toUInt()

public actual fun CM_Register_Device_Interface_ExA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA(dndevinst.toInt(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Register_Device_Interface_ExW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW(dndevinst.toInt(), interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: PCM_NOTIFY_CALLBACK, pnotifycontext: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification(pfilter, pcontext, pcallback.toLong(), pnotifycontext).toUInt()

public actual fun CM_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Request_Device_EjectA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA(dndevinst.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Request_Device_EjectW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW(dndevinst.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Request_Device_Eject_ExA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA(dndevinst.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Request_Device_Eject_ExW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW(dndevinst.toInt(), pvetotype, pszvetoname, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Request_Eject_PC(): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC().toUInt()

public actual fun CM_Request_Eject_PC_Ex(hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex(hmachine).toUInt()

public actual fun CM_Run_Detection(ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection(ulflags.toInt()).toUInt()

public actual fun CM_Run_Detection_Ex(ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex(ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW(classguid, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW(classguid, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA(classguid, ulproperty.toInt(), buffer, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW(classguid, ulproperty.toInt(), buffer, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_DevNode_Problem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_DevNode_Problem_Ex(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW(dndevinst.toInt(), propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW(dndevinst.toInt(), propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA(dndevinst.toInt(), ulproperty.toInt(), buffer, ullength.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW(dndevinst.toInt(), ulproperty.toInt(), buffer, ullength.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA(dndevinst.toInt(), ulproperty.toInt(), buffer, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW(dndevinst.toInt(), ulproperty.toInt(), buffer, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW(pszdeviceinterface, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW(pszdeviceinterface, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_HW_Prof(ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof(ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_HW_Prof_Ex(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_HW_Prof_FlagsA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA(pdeviceid, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW(pdeviceid, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Set_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA(pdeviceid, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Set_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW(pdeviceid, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Setup_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Setup_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Test_Range_Available(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun CM_Uninstall_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun CM_Uninstall_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Unregister_Device_InterfaceA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA(pszdeviceinterface, ulflags.toInt()).toUInt()

public actual fun CM_Unregister_Device_InterfaceW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW(pszdeviceinterface, ulflags.toInt()).toUInt()

public actual fun CM_Unregister_Device_Interface_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA(pszdeviceinterface, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Unregister_Device_Interface_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW(pszdeviceinterface, ulflags.toInt(), hmachine).toUInt()

public actual fun CM_Unregister_Notification(notifycontext: HCMNOTIFICATION): CONFIGRET =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification(notifycontext).toUInt()

public actual fun DiInstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, flags: DIINSTALLDEVICE_FLAGS, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice(hwndparent, deviceinfoset, deviceinfodata, driverinfodata, flags.toInt(), needreboot)

public actual fun DiInstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA(hwndparent, infpath, flags.toInt(), needreboot)

public actual fun DiInstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW(hwndparent, infpath, flags.toInt(), needreboot)

public actual fun DiRollbackDriver(deviceinfoset: HDEVINFO, deviceinfodata: Long, hwndparent: HWND, flags: DIROLLBACKDRIVER_FLAGS, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver(deviceinfoset, deviceinfodata, hwndparent, flags.toInt(), needreboot)

public actual fun DiShowUpdateDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice(hwndparent, deviceinfoset, deviceinfodata, flags.toInt(), needreboot)

public actual fun DiShowUpdateDriver(hwndparent: HWND, filepath: PCWSTR, flags: UInt, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver(hwndparent, filepath, flags.toInt(), needreboot)

public actual fun DiUninstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice(hwndparent, deviceinfoset, deviceinfodata, flags.toInt(), needreboot)

public actual fun DiUninstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA(hwndparent, infpath, flags.toInt(), needreboot)

public actual fun DiUninstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW(hwndparent, infpath, flags.toInt(), needreboot)

public actual fun InstallHinfSectionA(window: HWND, modulehandle: HINSTANCE, commandline: PCSTR, showcommand: Int) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA(window, modulehandle, commandline, showcommand)
}

public actual fun InstallHinfSectionW(window: HWND, modulehandle: HINSTANCE, commandline: PCWSTR, showcommand: Int) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW(window, modulehandle, commandline, showcommand)
}

public actual fun SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toInt())

public actual fun SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toInt())

public actual fun SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA(diskspace, infhandle, listinfhandle, sectionname, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW(diskspace, infhandle, listinfhandle, sectionname, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA(diskspace, targetfilespec, filesize, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW(diskspace, targetfilespec, filesize, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupAddToSourceListA(flags: UInt, source: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA(flags.toInt(), source)

public actual fun SetupAddToSourceListW(flags: UInt, source: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW(flags.toInt(), source)

public actual fun SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: PCSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA(diskspace, driveroot, amount, reserved1, reserved2.toInt())

public actual fun SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: PCWSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW(diskspace, driveroot, amount, reserved1, reserved2.toInt())

public actual fun SetupBackupErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun SetupBackupErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun SetupCancelTemporarySourceList(): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList()

public actual fun SetupCloseFileQueue(queuehandle: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue(queuehandle)

public actual fun SetupCloseInfFile(infhandle: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile(infhandle)
}

public actual fun SetupCloseLog() {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog()
}

public actual fun SetupCommitFileQueueA(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA(owner, queuehandle, msghandler.toLong(), context)

public actual fun SetupCommitFileQueueW(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW(owner, queuehandle, msghandler.toLong(), context)

public actual fun SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA(infhandle, sectionname, flags.toInt())

public actual fun SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW(infhandle, sectionname, flags.toInt())

public actual fun SetupCopyErrorA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, sourcefile: PCSTR, targetpathfile: PCSTR, win32errorcode: UInt, style: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA(hwndparent, dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode.toInt(), style.toInt(), pathbuffer, pathbuffersize.toInt(), pathrequiredsize).toUInt()

public actual fun SetupCopyErrorW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, sourcefile: PCWSTR, targetpathfile: PCWSTR, win32errorcode: UInt, style: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW(hwndparent, dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode.toInt(), style.toInt(), pathbuffer, pathbuffersize.toInt(), pathrequiredsize).toUInt()

public actual fun SetupCopyOEMInfA(sourceinffilename: PCSTR, oemsourcemedialocation: PCSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA(sourceinffilename, oemsourcemedialocation, oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename, destinationinffilenamesize.toInt(), requiredsize, destinationinffilenamecomponent)

public actual fun SetupCopyOEMInfW(sourceinffilename: PCWSTR, oemsourcemedialocation: PCWSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PWSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW(sourceinffilename, oemsourcemedialocation, oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename, destinationinffilenamesize.toInt(), requiredsize, destinationinffilenamecomponent)

public actual fun SetupCreateDiskSpaceListA(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA(reserved1, reserved2.toInt(), flags.toInt())

public actual fun SetupCreateDiskSpaceListW(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW(reserved1, reserved2.toInt(), flags.toInt())

public actual fun SetupDecompressOrCopyFileA(sourcefilename: PCSTR, targetfilename: PCSTR, compressiontype: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA(sourcefilename, targetfilename, compressiontype).toUInt()

public actual fun SetupDecompressOrCopyFileW(sourcefilename: PCWSTR, targetfilename: PCWSTR, compressiontype: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW(sourcefilename, targetfilename, compressiontype).toUInt()

public actual fun SetupDefaultQueueCallbackA(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA(context, notification.toInt(), param1.toLong(), param2.toLong()).toUInt()

public actual fun SetupDefaultQueueCallbackW(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW(context, notification.toInt(), param1.toLong(), param2.toLong()).toUInt()

public actual fun SetupDeleteErrorA(hwndparent: HWND, dialogtitle: PCSTR, file: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA(hwndparent, dialogtitle, file, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun SetupDeleteErrorW(hwndparent: HWND, dialogtitle: PCWSTR, file: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW(hwndparent, dialogtitle, file, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun SetupDestroyDiskSpaceList(diskspace: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList(diskspace)

public actual fun SetupDiAskForOEMDisk(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk(deviceinfoset, deviceinfodata)

public actual fun SetupDiBuildClassInfoList(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList(flags.toInt(), classguidlist, classguidlistsize.toInt(), requiredsize)

public actual fun SetupDiBuildClassInfoListExA(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA(flags.toInt(), classguidlist, classguidlistsize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiBuildClassInfoListExW(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW(flags.toInt(), classguidlist, classguidlistsize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiBuildDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList(deviceinfoset, deviceinfodata, drivertype.toInt())

public actual fun SetupDiCallClassInstaller(installfunction: DI_FUNCTION, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller(installfunction.toInt(), deviceinfoset, deviceinfodata)

public actual fun SetupDiCancelDriverInfoSearch(deviceinfoset: HDEVINFO): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch(deviceinfoset)

public actual fun SetupDiChangeState(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState(deviceinfoset, deviceinfodata)

public actual fun SetupDiClassGuidsFromNameA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA(classname, classguidlist, classguidlistsize.toInt(), requiredsize)

public actual fun SetupDiClassGuidsFromNameExA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA(classname, classguidlist, classguidlistsize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiClassGuidsFromNameExW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW(classname, classguidlist, classguidlistsize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiClassGuidsFromNameW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW(classname, classguidlist, classguidlistsize.toInt(), requiredsize)

public actual fun SetupDiClassNameFromGuidA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA(classguid, classname, classnamesize.toInt(), requiredsize)

public actual fun SetupDiClassNameFromGuidExA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA(classguid, classname, classnamesize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiClassNameFromGuidExW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW(classguid, classname, classnamesize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiClassNameFromGuidW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW(classguid, classname, classnamesize.toInt(), requiredsize)

public actual fun SetupDiCreateDevRegKeyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA(deviceinfoset, deviceinfodata, scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle, infsectionname)

public actual fun SetupDiCreateDevRegKeyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW(deviceinfoset, deviceinfodata, scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle, infsectionname)

public actual fun SetupDiCreateDeviceInfoA(deviceinfoset: HDEVINFO, devicename: PCSTR, classguid: Long, devicedescription: PCSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA(deviceinfoset, devicename, classguid, devicedescription, hwndparent, creationflags.toInt(), deviceinfodata)

public actual fun SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: HWND): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList(classguid, hwndparent)

public actual fun SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: HWND, machinename: PCSTR, reserved: Long): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA(classguid, hwndparent, machinename, reserved)

public actual fun SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: HWND, machinename: PCWSTR, reserved: Long): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW(classguid, hwndparent, machinename, reserved)

public actual fun SetupDiCreateDeviceInfoW(deviceinfoset: HDEVINFO, devicename: PCWSTR, classguid: Long, devicedescription: PCWSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW(deviceinfoset, devicename, classguid, devicedescription, hwndparent, creationflags.toInt(), deviceinfodata)

public actual fun SetupDiCreateDeviceInterfaceA(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags.toInt(), deviceinterfacedata)

public actual fun SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset, deviceinterfacedata, reserved.toInt(), samdesired.toInt(), infhandle, infsectionname)

public actual fun SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset, deviceinterfacedata, reserved.toInt(), samdesired.toInt(), infhandle, infsectionname)

public actual fun SetupDiCreateDeviceInterfaceW(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCWSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags.toInt(), deviceinterfacedata)

public actual fun SetupDiDeleteDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey(deviceinfoset, deviceinfodata, scope.toInt(), hwprofile.toInt(), keytype.toInt())

public actual fun SetupDiDeleteDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo(deviceinfoset, deviceinfodata)

public actual fun SetupDiDeleteDeviceInterfaceData(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData(deviceinfoset, deviceinterfacedata)

public actual fun SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset, deviceinterfacedata, reserved.toInt())

public actual fun SetupDiDestroyClassImageList(classimagelistdata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList(classimagelistdata)

public actual fun SetupDiDestroyDeviceInfoList(deviceinfoset: HDEVINFO): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList(deviceinfoset)

public actual fun SetupDiDestroyDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList(deviceinfoset, deviceinfodata, drivertype.toInt())

public actual fun SetupDiDrawMiniIcon(hdc: HDC, rc: RECT, miniiconindex: Int, flags: UInt): Int =
    0

public actual fun SetupDiEnumDeviceInfo(deviceinfoset: HDEVINFO, memberindex: UInt, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo(deviceinfoset, memberindex.toInt(), deviceinfodata)

public actual fun SetupDiEnumDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, memberindex: UInt, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces(deviceinfoset, deviceinfodata, interfaceclassguid, memberindex.toInt(), deviceinterfacedata)

public actual fun SetupDiEnumDriverInfoA(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA(deviceinfoset, deviceinfodata, drivertype.toInt(), memberindex.toInt(), driverinfodata)

public actual fun SetupDiEnumDriverInfoW(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW(deviceinfoset, deviceinfodata, drivertype.toInt(), memberindex.toInt(), driverinfodata)

public actual fun SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toInt(), requiredsize, reserved)

public actual fun SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toInt(), requiredsize, reserved)

public actual fun SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: PCSTR, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA(infhandle, infsectionname, infsectionwithext, infsectionwithextsize.toInt(), requiredsize, extension)

public actual fun SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: PCSTR, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toInt(), requiredsize, extension, reserved)

public actual fun SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: PCWSTR, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize.toInt(), requiredsize, extension, reserved)

public actual fun SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: PCWSTR, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW(infhandle, infsectionname, infsectionwithext, infsectionwithextsize.toInt(), requiredsize, extension)

public actual fun SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex(classguid, miniiconindex)

public actual fun SetupDiGetClassDescriptionA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA(classguid, classdescription, classdescriptionsize.toInt(), requiredsize)

public actual fun SetupDiGetClassDescriptionExA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA(classguid, classdescription, classdescriptionsize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiGetClassDescriptionExW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW(classguid, classdescription, classdescriptionsize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiGetClassDescriptionW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW(classguid, classdescription, classdescriptionsize.toInt(), requiredsize)

public actual fun SetupDiGetClassDevPropertySheetsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize.toInt(), requiredsize, propertysheettype.toInt())

public actual fun SetupDiGetClassDevPropertySheetsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize.toInt(), requiredsize, propertysheettype.toInt())

public actual fun SetupDiGetClassDevsA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA(classguid, enumerator, hwndparent, flags.toInt())

public actual fun SetupDiGetClassDevsExA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCSTR, reserved: Long): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA(classguid, enumerator, hwndparent, flags.toInt(), deviceinfoset, machinename, reserved)

public actual fun SetupDiGetClassDevsExW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCWSTR, reserved: Long): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW(classguid, enumerator, hwndparent, flags.toInt(), deviceinfoset, machinename, reserved)

public actual fun SetupDiGetClassDevsW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW(classguid, enumerator, hwndparent, flags.toInt())

public actual fun SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex(classimagelistdata, classguid, imageindex)

public actual fun SetupDiGetClassImageList(classimagelistdata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList(classimagelistdata)

public actual fun SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA(classimagelistdata, machinename, reserved)

public actual fun SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW(classimagelistdata, machinename, reserved)

public actual fun SetupDiGetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toInt(), requiredsize)

public actual fun SetupDiGetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toInt(), requiredsize)

public actual fun SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW(classguid, propertykey, propertytype, propertybuffer, propertybuffersize.toInt(), requiredsize, flags.toInt(), machinename, reserved)

public actual fun SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys(classguid, propertykeyarray, propertykeycount.toInt(), requiredpropertykeycount, flags.toInt())

public actual fun SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW(classguid, propertykeyarray, propertykeycount.toInt(), requiredpropertykeycount, flags.toInt(), machinename, reserved)

public actual fun SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW(classguid, propertykey, propertytype, propertybuffer, propertybuffersize.toInt(), requiredsize, flags.toInt())

public actual fun SetupDiGetClassRegistryPropertyA(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA(classguid, property.toInt(), propertyregdatatype, propertybuffer, propertybuffersize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiGetClassRegistryPropertyW(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW(classguid, property.toInt(), propertyregdatatype, propertybuffer, propertybuffersize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiGetCustomDevicePropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA(deviceinfoset, deviceinfodata, custompropertyname, flags.toInt(), propertyregdatatype, propertybuffer, propertybuffersize.toInt(), requiredsize)

public actual fun SetupDiGetCustomDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCWSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW(deviceinfoset, deviceinfodata, custompropertyname, flags.toInt(), propertyregdatatype, propertybuffer, propertybuffersize.toInt(), requiredsize)

public actual fun SetupDiGetDeviceInfoListClass(deviceinfoset: HDEVINFO, classguid: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass(deviceinfoset, classguid)

public actual fun SetupDiGetDeviceInfoListDetailA(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA(deviceinfoset, deviceinfosetdetaildata)

public actual fun SetupDiGetDeviceInfoListDetailW(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW(deviceinfoset, deviceinfosetdetaildata)

public actual fun SetupDiGetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA(deviceinfoset, deviceinfodata, deviceinstallparams)

public actual fun SetupDiGetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW(deviceinfoset, deviceinfodata, deviceinstallparams)

public actual fun SetupDiGetDeviceInstanceIdA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize.toInt(), requiredsize)

public actual fun SetupDiGetDeviceInstanceIdW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PWSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize.toInt(), requiredsize)

public actual fun SetupDiGetDeviceInterfaceAlias(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias(deviceinfoset, deviceinterfacedata, aliasinterfaceclassguid, aliasdeviceinterfacedata)

public actual fun SetupDiGetDeviceInterfaceDetailA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize.toInt(), requiredsize, deviceinfodata)

public actual fun SetupDiGetDeviceInterfaceDetailW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize.toInt(), requiredsize, deviceinfodata)

public actual fun SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset, deviceinterfacedata, propertykeyarray, propertykeycount.toInt(), requiredpropertykeycount, flags.toInt())

public actual fun SetupDiGetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW(deviceinfoset, deviceinterfacedata, propertykey, propertytype, propertybuffer, propertybuffersize.toInt(), requiredsize, flags.toInt())

public actual fun SetupDiGetDevicePropertyKeys(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys(deviceinfoset, deviceinfodata, propertykeyarray, propertykeycount.toInt(), requiredpropertykeycount, flags.toInt())

public actual fun SetupDiGetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW(deviceinfoset, deviceinfodata, propertykey, propertytype, propertybuffer, propertybuffersize.toInt(), requiredsize, flags.toInt())

public actual fun SetupDiGetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA(deviceinfoset, deviceinfodata, property.toInt(), propertyregdatatype, propertybuffer, propertybuffersize.toInt(), requiredsize)

public actual fun SetupDiGetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW(deviceinfoset, deviceinfodata, property.toInt(), propertyregdatatype, propertybuffer, propertybuffersize.toInt(), requiredsize)

public actual fun SetupDiGetDriverInfoDetailA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize.toInt(), requiredsize)

public actual fun SetupDiGetDriverInfoDetailW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize.toInt(), requiredsize)

public actual fun SetupDiGetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)

public actual fun SetupDiGetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)

public actual fun SetupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), friendlyname, friendlynamesize.toInt(), requiredsize)

public actual fun SetupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), friendlyname, friendlynamesize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), friendlyname, friendlynamesize.toInt(), requiredsize, machinename, reserved)

public actual fun SetupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), friendlyname, friendlynamesize.toInt(), requiredsize)

public actual fun SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList(hwprofilelist, hwprofilelistsize.toInt(), requiredsize, currentlyactiveindex)

public actual fun SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA(hwprofilelist, hwprofilelistsize.toInt(), requiredsize, currentlyactiveindex, machinename, reserved)

public actual fun SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW(hwprofilelist, hwprofilelistsize.toInt(), requiredsize, currentlyactiveindex, machinename, reserved)

public actual fun SetupDiGetINFClassA(infname: PCSTR, classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA(infname, classguid, classname, classnamesize.toInt(), requiredsize)

public actual fun SetupDiGetINFClassW(infname: PCWSTR, classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW(infname, classguid, classname, classnamesize.toInt(), requiredsize)

public actual fun SetupDiGetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice(deviceinfoset, deviceinfodata)

public actual fun SetupDiGetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA(deviceinfoset, deviceinfodata, driverinfodata)

public actual fun SetupDiGetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW(deviceinfoset, deviceinfodata, driverinfodata)

public actual fun SetupDiGetWizardPage(deviceinfoset: HDEVINFO, deviceinfodata: Long, installwizarddata: Long, pagetype: UInt, flags: UInt): HPROPSHEETPAGE =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage(deviceinfoset, deviceinfodata, installwizarddata, pagetype.toInt(), flags.toInt())

public actual fun SetupDiInstallClassA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA(hwndparent, inffilename, flags.toInt(), filequeue)

public actual fun SetupDiInstallClassExA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA(hwndparent, inffilename, flags.toInt(), filequeue, interfaceclassguid, reserved1, reserved2)

public actual fun SetupDiInstallClassExW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW(hwndparent, inffilename, flags.toInt(), filequeue, interfaceclassguid, reserved1, reserved2)

public actual fun SetupDiInstallClassW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW(hwndparent, inffilename, flags.toInt(), filequeue)

public actual fun SetupDiInstallDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice(deviceinfoset, deviceinfodata)

public actual fun SetupDiInstallDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces(deviceinfoset, deviceinfodata)

public actual fun SetupDiInstallDriverFiles(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles(deviceinfoset, deviceinfodata)

public actual fun SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon(classguid, largeicon, miniiconindex)

public actual fun SetupDiLoadDeviceIcon(deviceinfoset: HDEVINFO, deviceinfodata: Long, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon(deviceinfoset, deviceinfodata, cxicon.toInt(), cyicon.toInt(), flags.toInt(), hicon)

public actual fun SetupDiOpenClassRegKey(classguid: Long, samdesired: UInt): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey(classguid, samdesired.toInt())

public actual fun SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCSTR, reserved: Long): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA(classguid, samdesired.toInt(), flags.toInt(), machinename, reserved)

public actual fun SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW(classguid, samdesired.toInt(), flags.toInt(), machinename, reserved)

public actual fun SetupDiOpenDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey(deviceinfoset, deviceinfodata, scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt())

public actual fun SetupDiOpenDeviceInfoA(deviceinfoset: HDEVINFO, deviceinstanceid: PCSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA(deviceinfoset, deviceinstanceid, hwndparent, openflags.toInt(), deviceinfodata)

public actual fun SetupDiOpenDeviceInfoW(deviceinfoset: HDEVINFO, deviceinstanceid: PCWSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW(deviceinfoset, deviceinstanceid, hwndparent, openflags.toInt(), deviceinfodata)

public actual fun SetupDiOpenDeviceInterfaceA(deviceinfoset: HDEVINFO, devicepath: PCSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA(deviceinfoset, devicepath, openflags.toInt(), deviceinterfacedata)

public actual fun SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt): HKEY =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey(deviceinfoset, deviceinterfacedata, reserved.toInt(), samdesired.toInt())

public actual fun SetupDiOpenDeviceInterfaceW(deviceinfoset: HDEVINFO, devicepath: PCWSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW(deviceinfoset, devicepath, openflags.toInt(), deviceinterfacedata)

public actual fun SetupDiRegisterCoDeviceInstallers(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers(deviceinfoset, deviceinfodata)

public actual fun SetupDiRegisterDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, compareproc: PSP_DETSIG_CMPPROC, comparecontext: Long, dupdeviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo(deviceinfoset, deviceinfodata, flags.toInt(), compareproc.toLong(), comparecontext, dupdeviceinfodata)

public actual fun SetupDiRemoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice(deviceinfoset, deviceinfodata)

public actual fun SetupDiRemoveDeviceInterface(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface(deviceinfoset, deviceinterfacedata)

public actual fun SetupDiRestartDevices(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices(deviceinfoset, deviceinfodata)

public actual fun SetupDiSelectBestCompatDrv(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv(deviceinfoset, deviceinfodata)

public actual fun SetupDiSelectDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice(deviceinfoset, deviceinfodata)

public actual fun SetupDiSelectOEMDrv(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv(hwndparent, deviceinfoset, deviceinfodata)

public actual fun SetupDiSetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toInt())

public actual fun SetupDiSetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize.toInt())

public actual fun SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW(classguid, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), flags.toInt(), machinename, reserved)

public actual fun SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW(classguid, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), flags.toInt())

public actual fun SetupDiSetClassRegistryPropertyA(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA(classguid, property.toInt(), propertybuffer, propertybuffersize.toInt(), machinename, reserved)

public actual fun SetupDiSetClassRegistryPropertyW(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW(classguid, property.toInt(), propertybuffer, propertybuffersize.toInt(), machinename, reserved)

public actual fun SetupDiSetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA(deviceinfoset, deviceinfodata, deviceinstallparams)

public actual fun SetupDiSetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW(deviceinfoset, deviceinfodata, deviceinstallparams)

public actual fun SetupDiSetDeviceInterfaceDefault(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, flags: UInt, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault(deviceinfoset, deviceinterfacedata, flags.toInt(), reserved)

public actual fun SetupDiSetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW(deviceinfoset, deviceinterfacedata, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), flags.toInt())

public actual fun SetupDiSetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW(deviceinfoset, deviceinfodata, propertykey, propertytype.toInt(), propertybuffer, propertybuffersize.toInt(), flags.toInt())

public actual fun SetupDiSetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA(deviceinfoset, deviceinfodata, property.toInt(), propertybuffer, propertybuffersize.toInt())

public actual fun SetupDiSetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW(deviceinfoset, deviceinfodata, property.toInt(), propertybuffer, propertybuffersize.toInt())

public actual fun SetupDiSetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)

public actual fun SetupDiSetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams)

public actual fun SetupDiSetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice(deviceinfoset, deviceinfodata)

public actual fun SetupDiSetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA(deviceinfoset, deviceinfodata, driverinfodata)

public actual fun SetupDiSetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW(deviceinfoset, deviceinfodata, driverinfodata)

public actual fun SetupDiUnremoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice(deviceinfoset, deviceinfodata)

public actual fun SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA(diskspace, reserved1, reserved2.toInt(), flags.toInt())

public actual fun SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW(diskspace, reserved1, reserved2.toInt(), flags.toInt())

public actual fun SetupEnumInfSectionsA(infhandle: Long, index: UInt, buffer: PSTR, size: UInt, sizeneeded: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA(infhandle, index.toInt(), buffer, size.toInt(), sizeneeded)

public actual fun SetupEnumInfSectionsW(infhandle: Long, index: UInt, buffer: PWSTR, size: UInt, sizeneeded: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW(infhandle, index.toInt(), buffer, size.toInt(), sizeneeded)

public actual fun SetupFindFirstLineA(infhandle: Long, section: PCSTR, key: PCSTR, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA(infhandle, section, key, context)

public actual fun SetupFindFirstLineW(infhandle: Long, section: PCWSTR, key: PCWSTR, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW(infhandle, section, key, context)

public actual fun SetupFindNextLine(contextin: Long, contextout: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine(contextin, contextout)

public actual fun SetupFindNextMatchLineA(contextin: Long, key: PCSTR, contextout: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA(contextin, key, contextout)

public actual fun SetupFindNextMatchLineW(contextin: Long, key: PCWSTR, contextout: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW(contextin, key, contextout)

public actual fun SetupFreeSourceListA(list: Long, count: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA(list, count.toInt())

public actual fun SetupFreeSourceListW(list: Long, count: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW(list, count.toInt())

public actual fun SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA(queuehandle, backupparams)

public actual fun SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW(queuehandle, backupparams)

public actual fun SetupGetBinaryField(context: Long, fieldindex: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField(context, fieldindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetFieldCount(context: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount(context).toUInt()

public actual fun SetupGetFileCompressionInfoA(sourcefilename: PCSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype).toUInt()

public actual fun SetupGetFileCompressionInfoExA(sourcefilename: PCSTR, actualsourcefilenamebuffer: PCSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen.toInt(), requiredbufferlen, sourcefilesize, targetfilesize, compressiontype)

public actual fun SetupGetFileCompressionInfoExW(sourcefilename: PCWSTR, actualsourcefilenamebuffer: PCWSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen.toInt(), requiredbufferlen, sourcefilesize, targetfilesize, compressiontype)

public actual fun SetupGetFileCompressionInfoW(sourcefilename: PCWSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype).toUInt()

public actual fun SetupGetFileQueueCount(filequeue: Long, subqueuefileop: UInt, numoperations: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount(filequeue, subqueuefileop.toInt(), numoperations)

public actual fun SetupGetFileQueueFlags(filequeue: Long, flags: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags(filequeue, flags)

public actual fun SetupGetInfDriverStoreLocationA(filename: PCSTR, alternateplatforminfo: Long, localename: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfDriverStoreLocationW(filename: PCWSTR, alternateplatforminfo: Long, localename: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfFileListA(directorypath: PCSTR, infstyle: INF_STYLE, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA(directorypath, infstyle.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfFileListW(directorypath: PCWSTR, infstyle: INF_STYLE, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW(directorypath, infstyle.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfInformationA(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA(infspec, searchcontrol.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfInformationW(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW(infspec, searchcontrol.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfPublishedNameA(driverstorelocation: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA(driverstorelocation, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetInfPublishedNameW(driverstorelocation: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW(driverstorelocation, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetIntField(context: Long, fieldindex: UInt, integervalue: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField(context, fieldindex.toInt(), integervalue)

public actual fun SetupGetLineByIndexA(infhandle: Long, section: PCSTR, index: UInt, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA(infhandle, section, index.toInt(), context)

public actual fun SetupGetLineByIndexW(infhandle: Long, section: PCWSTR, index: UInt, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW(infhandle, section, index.toInt(), context)

public actual fun SetupGetLineCountA(infhandle: Long, section: PCSTR): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA(infhandle, section)

public actual fun SetupGetLineCountW(infhandle: Long, section: PCWSTR): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW(infhandle, section)

public actual fun SetupGetLineTextA(context: Long, infhandle: Long, section: PCSTR, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA(context, infhandle, section, key, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetLineTextW(context: Long, infhandle: Long, section: PCWSTR, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW(context, infhandle, section, key, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetMultiSzFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA(context, fieldindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetMultiSzFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW(context, fieldindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetNonInteractiveMode(): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode()

public actual fun SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: PCSTR, sourceid: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: PCWSTR, sourceid: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: PCSTR, section: PCSTR, filesize: Long, roundingfactor: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA(infhandle, infcontext, filename, section, filesize, roundingfactor.toInt())

public actual fun SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: PCWSTR, section: PCWSTR, filesize: Long, roundingfactor: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW(infhandle, infcontext, filename, section, filesize, roundingfactor.toInt())

public actual fun SetupGetSourceInfoA(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA(infhandle, sourceid.toInt(), infodesired.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetSourceInfoW(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW(infhandle, sourceid.toInt(), infodesired.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetStringFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA(context, fieldindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetStringFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW(context, fieldindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA(infhandle, infcontext, section, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW(infhandle, infcontext, section, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupGetThreadLogToken(): ULong =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken().toULong()

public actual fun SetupInitDefaultQueueCallback(ownerwindow: HWND): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback(ownerwindow)

public actual fun SetupInitDefaultQueueCallbackEx(ownerwindow: HWND, alternateprogresswindow: HWND, progressmessage: UInt, reserved1: UInt, reserved2: Long): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx(ownerwindow, alternateprogresswindow, progressmessage.toInt(), reserved1.toInt(), reserved2)

public actual fun SetupInitializeFileLogA(logfilename: PCSTR, flags: UInt): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA(logfilename, flags.toInt())

public actual fun SetupInitializeFileLogW(logfilename: PCWSTR, flags: UInt): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW(logfilename, flags.toInt())

public actual fun SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toInt(), copymsghandler.toLong(), context)

public actual fun SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long, filewasinuse: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toInt(), copymsghandler.toLong(), context, filewasinuse)

public actual fun SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long, filewasinuse: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toInt(), copymsghandler.toLong(), context, filewasinuse)

public actual fun SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle.toInt(), copymsghandler.toLong(), context)

public actual fun SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCSTR, sourcerootpath: PCSTR, copyflags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags.toInt())

public actual fun SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCWSTR, sourcerootpath: PCWSTR, copyflags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags.toInt())

public actual fun SetupInstallFromInfSectionA(owner: HWND, infhandle: Long, sectionname: PCSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA(owner, infhandle, sectionname, flags.toInt(), relativekeyroot, sourcerootpath, copyflags.toInt(), msghandler.toLong(), context, deviceinfoset, deviceinfodata)

public actual fun SetupInstallFromInfSectionW(owner: HWND, infhandle: Long, sectionname: PCWSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCWSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW(owner, infhandle, sectionname, flags.toInt(), relativekeyroot, sourcerootpath, copyflags.toInt(), msghandler.toLong(), context, deviceinfoset, deviceinfodata)

public actual fun SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA(infhandle, sectionname, flags.toInt())

public actual fun SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA(infhandle, sectionname, flags.toInt(), deviceinfoset, deviceinfodata, reserved1, reserved2)

public actual fun SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW(infhandle, sectionname, flags.toInt(), deviceinfoset, deviceinfodata, reserved1, reserved2)

public actual fun SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW(infhandle, sectionname, flags.toInt())

public actual fun SetupIterateCabinetA(cabinetfile: PCSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA(cabinetfile, reserved.toInt(), msghandler.toLong(), context)

public actual fun SetupIterateCabinetW(cabinetfile: PCWSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW(cabinetfile, reserved.toInt(), msghandler.toLong(), context)

public actual fun SetupLogErrorA(messagestring: PCSTR, severity: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA(messagestring, severity.toInt())

public actual fun SetupLogErrorW(messagestring: PCWSTR, severity: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW(messagestring, severity.toInt())

public actual fun SetupLogFileA(fileloghandle: Long, logsectionname: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, checksum: UInt, disktagfile: PCSTR, diskdescription: PCSTR, otherinfo: PCSTR, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum.toInt(), disktagfile, diskdescription, otherinfo, flags.toInt())

public actual fun SetupLogFileW(fileloghandle: Long, logsectionname: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, checksum: UInt, disktagfile: PCWSTR, diskdescription: PCWSTR, otherinfo: PCWSTR, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum.toInt(), disktagfile, diskdescription, otherinfo, flags.toInt())

public actual fun SetupOpenAppendInfFileA(filename: PCSTR, infhandle: Long, errorline: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA(filename, infhandle, errorline)

public actual fun SetupOpenAppendInfFileW(filename: PCWSTR, infhandle: Long, errorline: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW(filename, infhandle, errorline)

public actual fun SetupOpenFileQueue(): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue()

public actual fun SetupOpenInfFileA(filename: PCSTR, infclass: PCSTR, infstyle: INF_STYLE, errorline: Long): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA(filename, infclass, infstyle.toInt(), errorline)

public actual fun SetupOpenInfFileW(filename: PCWSTR, infclass: PCWSTR, infstyle: INF_STYLE, errorline: Long): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW(filename, infclass, infstyle.toInt(), errorline)

public actual fun SetupOpenLog(erase: BOOL): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog(erase)

public actual fun SetupOpenMasterInf(): Long =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf()

public actual fun SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: PCSTR, restoreflags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA(queuehandle, backuppath, restoreflags.toInt())

public actual fun SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: PCWSTR, restoreflags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW(queuehandle, backuppath, restoreflags.toInt())

public actual fun SetupPromptForDiskA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, filesought: PCSTR, tagfile: PCSTR, diskpromptstyle: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA(hwndparent, dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle.toInt(), pathbuffer, pathbuffersize.toInt(), pathrequiredsize).toUInt()

public actual fun SetupPromptForDiskW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, filesought: PCWSTR, tagfile: PCWSTR, diskpromptstyle: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW(hwndparent, dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle.toInt(), pathbuffer, pathbuffersize.toInt(), pathrequiredsize).toUInt()

public actual fun SetupPromptReboot(filequeue: Long, owner: HWND, scanonly: BOOL): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot(filequeue, owner, scanonly)

public actual fun SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA(diskspace, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW(diskspace, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryFileLogA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR, desiredinfo: SetupFileLogInfo, dataout: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA(fileloghandle, logsectionname, targetfilename, desiredinfo, dataout, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryFileLogW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR, desiredinfo: SetupFileLogInfo, dataout: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW(fileloghandle, logsectionname, targetfilename, desiredinfo, dataout, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryInfFileInformationA(infinformation: Long, infindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA(infinformation, infindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryInfFileInformationW(infinformation: Long, infindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW(infinformation, infindex.toInt(), returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA(infinformation, infindex.toInt(), alternateplatforminfo, originalfileinfo)

public actual fun SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW(infinformation, infindex.toInt(), alternateplatforminfo, originalfileinfo)

public actual fun SetupQueryInfVersionInformationA(infinformation: Long, infindex: UInt, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA(infinformation, infindex.toInt(), key, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQueryInfVersionInformationW(infinformation: Long, infindex: UInt, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW(infinformation, infindex.toInt(), key, returnbuffer, returnbuffersize.toInt(), requiredsize)

public actual fun SetupQuerySourceListA(flags: UInt, list: Long, count: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA(flags.toInt(), list, count)

public actual fun SetupQuerySourceListW(flags: UInt, list: Long, count: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW(flags.toInt(), list, count)

public actual fun SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: PCSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA(diskspace, drivespec, spacerequired, reserved1, reserved2.toInt())

public actual fun SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: PCWSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW(diskspace, drivespec, spacerequired, reserved1, reserved2.toInt())

public actual fun SetupQueueCopyA(queuehandle: Long, sourcerootpath: PCSTR, sourcepath: PCSTR, sourcefilename: PCSTR, sourcedescription: PCSTR, sourcetagfile: PCSTR, targetdirectory: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle.toInt())

public actual fun SetupQueueCopyIndirectA(copyparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA(copyparams)

public actual fun SetupQueueCopyIndirectW(copyparams: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW(copyparams)

public actual fun SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: PCSTR, infhandle: Long, listinfhandle: Long, section: PCSTR, copystyle: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle.toInt())

public actual fun SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: PCWSTR, infhandle: Long, listinfhandle: Long, section: PCWSTR, copystyle: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle.toInt())

public actual fun SetupQueueCopyW(queuehandle: Long, sourcerootpath: PCWSTR, sourcepath: PCWSTR, sourcefilename: PCWSTR, sourcedescription: PCWSTR, sourcetagfile: PCWSTR, targetdirectory: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle.toInt())

public actual fun SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle.toInt())

public actual fun SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle.toInt())

public actual fun SetupQueueDeleteA(queuehandle: Long, pathpart1: PCSTR, pathpart2: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA(queuehandle, pathpart1, pathpart2)

public actual fun SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA(queuehandle, infhandle, listinfhandle, section)

public actual fun SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW(queuehandle, infhandle, listinfhandle, section)

public actual fun SetupQueueDeleteW(queuehandle: Long, pathpart1: PCWSTR, pathpart2: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW(queuehandle, pathpart1, pathpart2)

public actual fun SetupQueueRenameA(queuehandle: Long, sourcepath: PCSTR, sourcefilename: PCSTR, targetpath: PCSTR, targetfilename: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename)

public actual fun SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA(queuehandle, infhandle, listinfhandle, section)

public actual fun SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW(queuehandle, infhandle, listinfhandle, section)

public actual fun SetupQueueRenameW(queuehandle: Long, sourcepath: PCWSTR, sourcefilename: PCWSTR, targetpath: PCWSTR, targetfilename: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename)

public actual fun SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA(fileloghandle, logsectionname, targetfilename)

public actual fun SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW(fileloghandle, logsectionname, targetfilename)

public actual fun SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA(diskspace, targetfilespec, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW(diskspace, targetfilespec, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupRemoveFromSourceListA(flags: UInt, source: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA(flags.toInt(), source)

public actual fun SetupRemoveFromSourceListW(flags: UInt, source: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW(flags.toInt(), source)

public actual fun SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toInt())

public actual fun SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2.toInt())

public actual fun SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA(diskspace, infhandle, listinfhandle, sectionname, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW(diskspace, infhandle, listinfhandle, sectionname, operation.toInt(), reserved1, reserved2.toInt())

public actual fun SetupRenameErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun SetupRenameErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun SetupScanFileQueueA(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_A, callbackcontext: Long, result: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA(filequeue, flags.toInt(), window, callbackroutine.toLong(), callbackcontext, result)

public actual fun SetupScanFileQueueW(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_W, callbackcontext: Long, result: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW(filequeue, flags.toInt(), window, callbackroutine.toLong(), callbackcontext, result)

public actual fun SetupSetDirectoryIdA(infhandle: Long, id: UInt, directory: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA(infhandle, id.toInt(), directory)

public actual fun SetupSetDirectoryIdExA(infhandle: Long, id: UInt, directory: PCSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA(infhandle, id.toInt(), directory, flags.toInt(), reserved1.toInt(), reserved2)

public actual fun SetupSetDirectoryIdExW(infhandle: Long, id: UInt, directory: PCWSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW(infhandle, id.toInt(), directory, flags.toInt(), reserved1.toInt(), reserved2)

public actual fun SetupSetDirectoryIdW(infhandle: Long, id: UInt, directory: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW(infhandle, id.toInt(), directory)

public actual fun SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile)

public actual fun SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile)

public actual fun SetupSetFileQueueFlags(filequeue: Long, flagmask: UInt, flags: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags(filequeue, flagmask.toInt(), flags.toInt())

public actual fun SetupSetNonInteractiveMode(noninteractiveflag: BOOL): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode(noninteractiveflag)

public actual fun SetupSetPlatformPathOverrideA(override: PCSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA(override)

public actual fun SetupSetPlatformPathOverrideW(override: PCWSTR): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW(override)

public actual fun SetupSetSourceListA(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA(flags.toInt(), sourcelist, sourcecount.toInt())

public actual fun SetupSetSourceListW(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW(flags.toInt(), sourcelist, sourcecount.toInt())

public actual fun SetupSetThreadLogToken(logtoken: ULong) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken(logtoken.toLong())
}

public actual fun SetupTermDefaultQueueCallback(context: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback(context)
}

public actual fun SetupTerminateFileLog(fileloghandle: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog(fileloghandle)

public actual fun SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: UInt, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs(filequeue, flags.toInt(), reserved)

public actual fun SetupUninstallOEMInfA(inffilename: PCSTR, flags: UInt, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA(inffilename, flags.toInt(), reserved)

public actual fun SetupUninstallOEMInfW(inffilename: PCWSTR, flags: UInt, reserved: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW(inffilename, flags.toInt(), reserved)

public actual fun SetupVerifyInfFileA(infname: PCSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA(infname, altplatforminfo, infsignerinfo)

public actual fun SetupVerifyInfFileW(infname: PCWSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW(infname, altplatforminfo, infsignerinfo)

public actual fun SetupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: Long, context: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine(logtoken.toLong(), flags.toInt(), infhandle, context)
}

public actual fun UpdateDriverForPlugAndPlayDevicesA(hwndparent: HWND, hardwareid: PCSTR, fullinfpath: PCSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA(hwndparent, hardwareid, fullinfpath, installflags.toInt(), brebootrequired)

public actual fun UpdateDriverForPlugAndPlayDevicesW(hwndparent: HWND, hardwareid: PCWSTR, fullinfpath: PCWSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW(hwndparent, hardwareid, fullinfpath, installflags.toInt(), brebootrequired)
