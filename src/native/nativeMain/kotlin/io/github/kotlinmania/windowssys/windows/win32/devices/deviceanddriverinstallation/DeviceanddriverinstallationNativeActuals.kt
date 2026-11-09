@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CMP_WaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents(dwtimeout)

public actual fun CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf(plclogconf.toCPointer<ByteVar>(), dndevinst, priority, ulflags)

public actual fun CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex(plclogconf.toCPointer<ByteVar>(), dndevinst, priority, ulflags, hmachine)

public actual fun CM_Add_IDA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA(dndevinst, pszid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Add_IDW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW(dndevinst, pszid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Add_ID_ExA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA(dndevinst, pszid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Add_ID_ExW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW(dndevinst, pszid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Add_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range(ullstartvalue, ullendvalue, rlh, ulflags)

public actual fun CM_Add_Res_Des(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des(prdresdes.toCPointer<ByteVar>(), lclogconf, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, ulflags)

public actual fun CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex(prdresdes.toCPointer<ByteVar>(), lclogconf, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, ulflags, hmachine)

public actual fun CM_Connect_MachineA(uncservername: PCSTR, phmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA(uncservername.toCPointer<ByteVar>(), phmachine.toCPointer<ByteVar>())

public actual fun CM_Connect_MachineW(uncservername: PCWSTR, phmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW(uncservername.toCPointer<ByteVar>(), phmachine.toCPointer<ByteVar>())

public actual fun CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), dnparent, ulflags)

public actual fun CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), dnparent, ulflags)

public actual fun CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), dnparent, ulflags, hmachine)

public actual fun CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), dnparent, ulflags, hmachine)

public actual fun CM_Create_Range_List(prlh: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List(prlh.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Delete_Class_Key(classguid: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key(classguid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Delete_Class_Key_Ex(classguid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex(classguid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Delete_DevNode_Key(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key(dndevnode, ulhardwareprofile, ulflags)

public actual fun CM_Delete_DevNode_Key_Ex(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex(dndevnode, ulhardwareprofile, ulflags, hmachine)

public actual fun CM_Delete_Device_Interface_KeyA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA(pszdeviceinterface.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Delete_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW(pszdeviceinterface.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Delete_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range(ullstartvalue, ullendvalue, rlh, ulflags)

public actual fun CM_Detect_Resource_Conflict(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict(dndevinst, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, pbconflictdetected.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Detect_Resource_Conflict_Ex(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex(dndevinst, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, pbconflictdetected.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Disable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode(dndevinst, ulflags)

public actual fun CM_Disable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex(dndevinst, ulflags, hmachine)

public actual fun CM_Disconnect_Machine(hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine(hmachine)

public actual fun CM_Dup_Range_List(rlhold: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List(rlhold, rlhnew, ulflags)

public actual fun CM_Enable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode(dndevinst, ulflags)

public actual fun CM_Enable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex(dndevinst, ulflags, hmachine)

public actual fun CM_Enumerate_Classes(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes(ulclassindex, classguid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Enumerate_Classes_Ex(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex(ulclassindex, classguid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Enumerate_EnumeratorsA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA(ulenumindex, buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Enumerate_EnumeratorsW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW(ulenumindex, buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Enumerate_Enumerators_ExA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA(ulenumindex, buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Enumerate_Enumerators_ExW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW(ulenumindex, buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Find_Range(pullstart: Long, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range(pullstart.toCPointer<ByteVar>(), ullstart, ullength, ullalignment, ullend, rlh, ulflags)

public actual fun CM_First_Range(rlh: ULong, pullstart: Long, pullend: Long, preelement: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range(rlh, pullstart.toCPointer<ByteVar>(), pullend.toCPointer<ByteVar>(), preelement.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Free_Log_Conf(lclogconftobefreed: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf(lclogconftobefreed, ulflags)

public actual fun CM_Free_Log_Conf_Ex(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex(lclogconftobefreed, ulflags, hmachine)

public actual fun CM_Free_Log_Conf_Handle(lclogconf: ULong): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle(lclogconf)

public actual fun CM_Free_Range_List(rlh: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List(rlh, ulflags)

public actual fun CM_Free_Res_Des(prdresdes: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des(prdresdes.toCPointer<ByteVar>(), rdresdes, ulflags)

public actual fun CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex(prdresdes.toCPointer<ByteVar>(), rdresdes, ulflags, hmachine)

public actual fun CM_Free_Res_Des_Handle(rdresdes: ULong): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle(rdresdes)

public actual fun CM_Free_Resource_Conflict_Handle(clconflictlist: ULong): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle(clconflictlist)

public actual fun CM_Get_Child(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child(pdndevinst.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_Child_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex(pdndevinst.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA(classguid.toCPointer<ByteVar>(), pszkeyname.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW(classguid.toCPointer<ByteVar>(), pszkeyname.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA(classguid.toCPointer<ByteVar>(), pszkeyname.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW(classguid.toCPointer<ByteVar>(), pszkeyname.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_NameA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA(classguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Class_NameW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW(classguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Class_Name_ExA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA(classguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_Name_ExW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW(classguid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys(classguid.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex(classguid.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA(classguid.toCPointer<ByteVar>(), ulproperty, pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW(classguid.toCPointer<ByteVar>(), ulproperty, pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Depth(puldepth: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth(puldepth.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_Depth_Ex(puldepth: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex(puldepth.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_DevNode_Custom_PropertyA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA(dndevinst, pszcustompropertyname.toCPointer<ByteVar>(), pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_DevNode_Custom_PropertyW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW(dndevinst, pszcustompropertyname.toCPointer<ByteVar>(), pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_DevNode_Custom_Property_ExA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA(dndevinst, pszcustompropertyname.toCPointer<ByteVar>(), pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_DevNode_Custom_Property_ExW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW(dndevinst, pszcustompropertyname.toCPointer<ByteVar>(), pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW(dndevinst, propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW(dndevinst, propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_DevNode_Property_Keys(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys(dndevinst, propertykeyarray.toCPointer<ByteVar>(), propertykeycount.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_DevNode_Property_Keys_Ex(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex(dndevinst, propertykeyarray.toCPointer<ByteVar>(), propertykeycount.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA(dndevinst, ulproperty, pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW(dndevinst, ulproperty, pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA(dndevinst, ulproperty, pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW(dndevinst, ulproperty, pulregdatatype.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status(pulstatus.toCPointer<ByteVar>(), pulproblemnumber.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex(pulstatus.toCPointer<ByteVar>(), pulproblemnumber.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_Device_IDA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA(dndevinst, buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Device_IDW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW(dndevinst, buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Device_ID_ExA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA(dndevinst, buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Device_ID_ExW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW(dndevinst, buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Device_ID_ListA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA(pszfilter.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Device_ID_ListW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW(pszfilter.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Device_ID_List_ExA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA(pszfilter.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Device_ID_List_ExW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW(pszfilter.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: PCSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA(pullen.toCPointer<ByteVar>(), pszfilter.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW(pullen.toCPointer<ByteVar>(), pszfilter.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA(pullen.toCPointer<ByteVar>(), pszfilter.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW(pullen.toCPointer<ByteVar>(), pszfilter.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_ID_Size(pullen: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size(pullen.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex(pullen.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_Device_Interface_AliasA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA(pszdeviceinterface.toCPointer<ByteVar>(), aliasinterfaceguid.toCPointer<ByteVar>(), pszaliasdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_Interface_AliasW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW(pszdeviceinterface.toCPointer<ByteVar>(), aliasinterfaceguid.toCPointer<ByteVar>(), pszaliasdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface.toCPointer<ByteVar>(), aliasinterfaceguid.toCPointer<ByteVar>(), pszaliasdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface.toCPointer<ByteVar>(), aliasinterfaceguid.toCPointer<ByteVar>(), pszaliasdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA(interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW(interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA(interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW(interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA(pullen.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW(pullen.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA(pullen.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW(pullen.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW(pszdeviceinterface.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW(pszdeviceinterface.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf(plclogconf.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex(plclogconf.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_Global_State(pulstate: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State(pulstate.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Global_State_Ex(pulstate: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex(pulstate.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_HW_Prof_FlagsA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA(pdeviceid.toCPointer<ByteVar>(), ulhardwareprofile, pulvalue.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW(pdeviceid.toCPointer<ByteVar>(), ulhardwareprofile, pulvalue.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA(pdeviceid.toCPointer<ByteVar>(), ulhardwareprofile, pulvalue.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW(pdeviceid.toCPointer<ByteVar>(), ulhardwareprofile, pulvalue.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Hardware_Profile_InfoA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA(ulindex, phwprofileinfo.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Hardware_Profile_InfoW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW(ulindex, phwprofileinfo.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Hardware_Profile_Info_ExA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA(ulindex, phwprofileinfo.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Hardware_Profile_Info_ExW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW(ulindex, phwprofileinfo.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Log_Conf_Priority(lclogconf: ULong, ppriority: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority(lclogconf, ppriority.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Log_Conf_Priority_Ex(lclogconf: ULong, ppriority: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex(lclogconf, ppriority.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf(plclogconf.toCPointer<ByteVar>(), lclogconf, ulflags)

public actual fun CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex(plclogconf.toCPointer<ByteVar>(), lclogconf, ulflags, hmachine)

public actual fun CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des(prdresdes.toCPointer<ByteVar>(), rdresdes, forresource, presourceid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex(prdresdes.toCPointer<ByteVar>(), rdresdes, forresource, presourceid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Get_Parent(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent(pdndevinst.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex(pdndevinst.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_Res_Des_Data(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data(rdresdes, buffer.toCPointer<ByteVar>(), bufferlen, ulflags)

public actual fun CM_Get_Res_Des_Data_Ex(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex(rdresdes, buffer.toCPointer<ByteVar>(), bufferlen, ulflags, hmachine)

public actual fun CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size(pulsize.toCPointer<ByteVar>(), rdresdes, ulflags)

public actual fun CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex(pulsize.toCPointer<ByteVar>(), rdresdes, ulflags, hmachine)

public actual fun CM_Get_Resource_Conflict_Count(clconflictlist: ULong, pulcount: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count(clconflictlist, pulcount.toCPointer<ByteVar>())

public actual fun CM_Get_Resource_Conflict_DetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA(clconflictlist, ulindex, pconflictdetails.toCPointer<ByteVar>())

public actual fun CM_Get_Resource_Conflict_DetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW(clconflictlist, ulindex, pconflictdetails.toCPointer<ByteVar>())

public actual fun CM_Get_Sibling(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling(pdndevinst.toCPointer<ByteVar>(), dndevinst, ulflags)

public actual fun CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex(pdndevinst.toCPointer<ByteVar>(), dndevinst, ulflags, hmachine)

public actual fun CM_Get_Version(): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version()

public actual fun CM_Get_Version_Ex(hmachine: Long): UShort =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex(hmachine)

public actual fun CM_Intersect_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List(rlhold1, rlhold2, rlhnew, ulflags)

public actual fun CM_Invert_Range_List(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List(rlhold, rlhnew, ullmaxvalue, ulflags)

public actual fun CM_Is_Dock_Station_Present(pbpresent: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present(pbpresent.toCPointer<ByteVar>())

public actual fun CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex(pbpresent.toCPointer<ByteVar>(), hmachine)

public actual fun CM_Is_Version_Available(wversion: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available(wversion)

public actual fun CM_Is_Version_Available_Ex(wversion: UShort, hmachine: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex(wversion, hmachine)

public actual fun CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW(pdndevinst.toCPointer<ByteVar>(), pdeviceid.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_MapCrToWin32Err(cmreturncode: CONFIGRET, defaulterr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err(cmreturncode, defaulterr)

public actual fun CM_Merge_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List(rlhold1, rlhold2, rlhnew, ulflags)

public actual fun CM_Modify_Res_Des(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des(prdresdes.toCPointer<ByteVar>(), rdresdes, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, ulflags)

public actual fun CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex(prdresdes.toCPointer<ByteVar>(), rdresdes, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, ulflags, hmachine)

public actual fun CM_Move_DevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode(dnfromdevinst, dntodevinst, ulflags)

public actual fun CM_Move_DevNode_Ex(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex(dnfromdevinst, dntodevinst, ulflags, hmachine)

public actual fun CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range(preelement.toCPointer<ByteVar>(), pullstart.toCPointer<ByteVar>(), pullend.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Open_Class_KeyA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA(classguid.toCPointer<ByteVar>(), pszclassname.toCPointer<ByteVar>(), samdesired, disposition, phkclass.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Open_Class_KeyW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW(classguid.toCPointer<ByteVar>(), pszclassname.toCPointer<ByteVar>(), samdesired, disposition, phkclass.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Open_Class_Key_ExA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA(classguid.toCPointer<ByteVar>(), pszclassname.toCPointer<ByteVar>(), samdesired, disposition, phkclass.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Open_Class_Key_ExW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW(classguid.toCPointer<ByteVar>(), pszclassname.toCPointer<ByteVar>(), samdesired, disposition, phkclass.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Open_DevNode_Key(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key(dndevnode, samdesired, ulhardwareprofile, disposition, phkdevice.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Open_DevNode_Key_Ex(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex(dndevnode, samdesired, ulhardwareprofile, disposition, phkdevice.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Open_Device_Interface_KeyA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA(pszdeviceinterface.toCPointer<ByteVar>(), samdesired, disposition, phkdeviceinterface.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Open_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW(pszdeviceinterface.toCPointer<ByteVar>(), samdesired, disposition, phkdeviceinterface.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA(pszdeviceinterface.toCPointer<ByteVar>(), samdesired, disposition, phkdeviceinterface.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW(pszdeviceinterface.toCPointer<ByteVar>(), samdesired, disposition, phkdeviceinterface.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Query_And_Remove_SubTreeA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA(dnancestor, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags)

public actual fun CM_Query_And_Remove_SubTreeW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW(dnancestor, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags)

public actual fun CM_Query_And_Remove_SubTree_ExA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA(dnancestor, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags, hmachine)

public actual fun CM_Query_And_Remove_SubTree_ExW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW(dnancestor, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags, hmachine)

public actual fun CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data(pdata.toCPointer<ByteVar>(), datalen, dndevinst, resourceid, ulflags)

public actual fun CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex(pdata.toCPointer<ByteVar>(), datalen, dndevinst, resourceid, ulflags, hmachine)

public actual fun CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size(pulsize.toCPointer<ByteVar>(), dndevinst, resourceid, ulflags)

public actual fun CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex(pulsize.toCPointer<ByteVar>(), dndevinst, resourceid, ulflags, hmachine)

public actual fun CM_Query_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree(dnancestor, ulflags)

public actual fun CM_Query_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex(dnancestor, ulflags, hmachine)

public actual fun CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: UInt, resourceid: CM_RESTYPE, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List(pclconflictlist.toCPointer<ByteVar>(), dndevinst, resourceid, resourcedata.toCPointer<ByteVar>(), resourcelen, ulflags, hmachine)

public actual fun CM_Reenumerate_DevNode(dndevinst: UInt, ulflags: CM_REENUMERATE_FLAGS): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode(dndevinst, ulflags)

public actual fun CM_Reenumerate_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex(dndevinst, ulflags, hmachine)

public actual fun CM_Register_Device_Driver(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver(dndevinst, ulflags)

public actual fun CM_Register_Device_Driver_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex(dndevinst, ulflags, hmachine)

public actual fun CM_Register_Device_InterfaceA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA(dndevinst, interfaceclassguid.toCPointer<ByteVar>(), pszreference.toCPointer<ByteVar>(), pszdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Register_Device_InterfaceW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW(dndevinst, interfaceclassguid.toCPointer<ByteVar>(), pszreference.toCPointer<ByteVar>(), pszdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Register_Device_Interface_ExA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA(dndevinst, interfaceclassguid.toCPointer<ByteVar>(), pszreference.toCPointer<ByteVar>(), pszdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Register_Device_Interface_ExW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW(dndevinst, interfaceclassguid.toCPointer<ByteVar>(), pszreference.toCPointer<ByteVar>(), pszdeviceinterface.toCPointer<ByteVar>(), pullength.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: PCM_NOTIFY_CALLBACK, pnotifycontext: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification(pfilter.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>(), pcallback.toLong().toCPointer<ByteVar>(), pnotifycontext.toCPointer<ByteVar>())

public actual fun CM_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree(dnancestor, ulflags)

public actual fun CM_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex(dnancestor, ulflags, hmachine)

public actual fun CM_Request_Device_EjectA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA(dndevinst, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags)

public actual fun CM_Request_Device_EjectW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW(dndevinst, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags)

public actual fun CM_Request_Device_Eject_ExA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA(dndevinst, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags, hmachine)

public actual fun CM_Request_Device_Eject_ExW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW(dndevinst, pvetotype.toCPointer<ByteVar>(), pszvetoname.toCPointer<ByteVar>(), ulnamelength, ulflags, hmachine)

public actual fun CM_Request_Eject_PC(): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC()

public actual fun CM_Request_Eject_PC_Ex(hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex(hmachine)

public actual fun CM_Run_Detection(ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection(ulflags)

public actual fun CM_Run_Detection_Ex(ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex(ulflags, hmachine)

public actual fun CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, ulflags)

public actual fun CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, ulflags, hmachine)

public actual fun CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA(classguid.toCPointer<ByteVar>(), ulproperty, buffer.toCPointer<ByteVar>(), ullength, ulflags, hmachine)

public actual fun CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW(classguid.toCPointer<ByteVar>(), ulproperty, buffer.toCPointer<ByteVar>(), ullength, ulflags, hmachine)

public actual fun CM_Set_DevNode_Problem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem(dndevinst, ulproblem, ulflags)

public actual fun CM_Set_DevNode_Problem_Ex(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex(dndevinst, ulproblem, ulflags, hmachine)

public actual fun CM_Set_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW(dndevinst, propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, ulflags)

public actual fun CM_Set_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW(dndevinst, propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, ulflags, hmachine)

public actual fun CM_Set_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA(dndevinst, ulproperty, buffer.toCPointer<ByteVar>(), ullength, ulflags)

public actual fun CM_Set_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW(dndevinst, ulproperty, buffer.toCPointer<ByteVar>(), ullength, ulflags)

public actual fun CM_Set_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA(dndevinst, ulproperty, buffer.toCPointer<ByteVar>(), ullength, ulflags, hmachine)

public actual fun CM_Set_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW(dndevinst, ulproperty, buffer.toCPointer<ByteVar>(), ullength, ulflags, hmachine)

public actual fun CM_Set_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW(pszdeviceinterface.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, ulflags)

public actual fun CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW(pszdeviceinterface.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, ulflags, hmachine)

public actual fun CM_Set_HW_Prof(ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof(ulhardwareprofile, ulflags)

public actual fun CM_Set_HW_Prof_Ex(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex(ulhardwareprofile, ulflags, hmachine)

public actual fun CM_Set_HW_Prof_FlagsA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA(pdeviceid.toCPointer<ByteVar>(), ulconfig, ulvalue, ulflags)

public actual fun CM_Set_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW(pdeviceid.toCPointer<ByteVar>(), ulconfig, ulvalue, ulflags)

public actual fun CM_Set_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA(pdeviceid.toCPointer<ByteVar>(), ulconfig, ulvalue, ulflags, hmachine)

public actual fun CM_Set_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW(pdeviceid.toCPointer<ByteVar>(), ulconfig, ulvalue, ulflags, hmachine)

public actual fun CM_Setup_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode(dndevinst, ulflags)

public actual fun CM_Setup_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex(dndevinst, ulflags, hmachine)

public actual fun CM_Test_Range_Available(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available(ullstartvalue, ullendvalue, rlh, ulflags)

public actual fun CM_Uninstall_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode(dndevinst, ulflags)

public actual fun CM_Uninstall_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex(dndevinst, ulflags, hmachine)

public actual fun CM_Unregister_Device_InterfaceA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA(pszdeviceinterface.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Unregister_Device_InterfaceW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW(pszdeviceinterface.toCPointer<ByteVar>(), ulflags)

public actual fun CM_Unregister_Device_Interface_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA(pszdeviceinterface.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Unregister_Device_Interface_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW(pszdeviceinterface.toCPointer<ByteVar>(), ulflags, hmachine)

public actual fun CM_Unregister_Notification(notifycontext: HCMNOTIFICATION): CONFIGRET =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification(notifycontext.toCPointer<ByteVar>())

public actual fun DiInstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, flags: DIINSTALLDEVICE_FLAGS, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice(hwndparent.toCPointer<ByteVar>(), deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiInstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA(hwndparent.toCPointer<ByteVar>(), infpath.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiInstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW(hwndparent.toCPointer<ByteVar>(), infpath.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiRollbackDriver(deviceinfoset: HDEVINFO, deviceinfodata: Long, hwndparent: HWND, flags: DIROLLBACKDRIVER_FLAGS, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiShowUpdateDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice(hwndparent.toCPointer<ByteVar>(), deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiShowUpdateDriver(hwndparent: HWND, filepath: PCWSTR, flags: UInt, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver(hwndparent.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiUninstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice(hwndparent.toCPointer<ByteVar>(), deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiUninstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA(hwndparent.toCPointer<ByteVar>(), infpath.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun DiUninstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW(hwndparent.toCPointer<ByteVar>(), infpath.toCPointer<ByteVar>(), flags, needreboot.toCPointer<ByteVar>())

public actual fun InstallHinfSectionA(window: HWND, modulehandle: HINSTANCE, commandline: PCSTR, showcommand: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA(window.toCPointer<ByteVar>(), modulehandle.toCPointer<ByteVar>(), commandline.toCPointer<ByteVar>(), showcommand)
}

public actual fun InstallHinfSectionW(window: HWND, modulehandle: HINSTANCE, commandline: PCWSTR, showcommand: Int) {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW(window.toCPointer<ByteVar>(), modulehandle.toCPointer<ByteVar>(), commandline.toCPointer<ByteVar>(), showcommand)
}

public actual fun SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), layoutinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), layoutinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA(diskspace.toCPointer<ByteVar>(), targetfilespec.toCPointer<ByteVar>(), filesize, operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW(diskspace.toCPointer<ByteVar>(), targetfilespec.toCPointer<ByteVar>(), filesize, operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAddToSourceListA(flags: UInt, source: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA(flags, source.toCPointer<ByteVar>())

public actual fun SetupAddToSourceListW(flags: UInt, source: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW(flags, source.toCPointer<ByteVar>())

public actual fun SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: PCSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA(diskspace.toCPointer<ByteVar>(), driveroot.toCPointer<ByteVar>(), amount, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: PCWSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW(diskspace.toCPointer<ByteVar>(), driveroot.toCPointer<ByteVar>(), amount, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupBackupErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), targetfile.toCPointer<ByteVar>(), win32errorcode, style)

public actual fun SetupBackupErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), targetfile.toCPointer<ByteVar>(), win32errorcode, style)

public actual fun SetupCancelTemporarySourceList(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList()

public actual fun SetupCloseFileQueue(queuehandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue(queuehandle.toCPointer<ByteVar>())

public actual fun SetupCloseInfFile(infhandle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile(infhandle.toCPointer<ByteVar>())
}

public actual fun SetupCloseLog() {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog()
}

public actual fun SetupCommitFileQueueA(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA(owner.toCPointer<ByteVar>(), queuehandle.toCPointer<ByteVar>(), msghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupCommitFileQueueW(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW(owner.toCPointer<ByteVar>(), queuehandle.toCPointer<ByteVar>(), msghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA(infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags)

public actual fun SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW(infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags)

public actual fun SetupCopyErrorA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, sourcefile: PCSTR, targetpathfile: PCSTR, win32errorcode: UInt, style: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), diskname.toCPointer<ByteVar>(), pathtosource.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), targetpathfile.toCPointer<ByteVar>(), win32errorcode, style, pathbuffer.toCPointer<ByteVar>(), pathbuffersize, pathrequiredsize.toCPointer<ByteVar>())

public actual fun SetupCopyErrorW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, sourcefile: PCWSTR, targetpathfile: PCWSTR, win32errorcode: UInt, style: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), diskname.toCPointer<ByteVar>(), pathtosource.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), targetpathfile.toCPointer<ByteVar>(), win32errorcode, style, pathbuffer.toCPointer<ByteVar>(), pathbuffersize, pathrequiredsize.toCPointer<ByteVar>())

public actual fun SetupCopyOEMInfA(sourceinffilename: PCSTR, oemsourcemedialocation: PCSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA(sourceinffilename.toCPointer<ByteVar>(), oemsourcemedialocation.toCPointer<ByteVar>(), oemsourcemediatype, copystyle, destinationinffilename.toCPointer<ByteVar>(), destinationinffilenamesize, requiredsize.toCPointer<ByteVar>(), destinationinffilenamecomponent.toCPointer<ByteVar>())

public actual fun SetupCopyOEMInfW(sourceinffilename: PCWSTR, oemsourcemedialocation: PCWSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PWSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW(sourceinffilename.toCPointer<ByteVar>(), oemsourcemedialocation.toCPointer<ByteVar>(), oemsourcemediatype, copystyle, destinationinffilename.toCPointer<ByteVar>(), destinationinffilenamesize, requiredsize.toCPointer<ByteVar>(), destinationinffilenamecomponent.toCPointer<ByteVar>())

public actual fun SetupCreateDiskSpaceListA(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA(reserved1.toCPointer<ByteVar>(), reserved2, flags)?.toLong() ?: 0L

public actual fun SetupCreateDiskSpaceListW(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW(reserved1.toCPointer<ByteVar>(), reserved2, flags)?.toLong() ?: 0L

public actual fun SetupDecompressOrCopyFileA(sourcefilename: PCSTR, targetfilename: PCSTR, compressiontype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA(sourcefilename.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), compressiontype.toCPointer<ByteVar>())

public actual fun SetupDecompressOrCopyFileW(sourcefilename: PCWSTR, targetfilename: PCWSTR, compressiontype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW(sourcefilename.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), compressiontype.toCPointer<ByteVar>())

public actual fun SetupDefaultQueueCallbackA(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA(context.toCPointer<ByteVar>(), notification, param1, param2)

public actual fun SetupDefaultQueueCallbackW(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW(context.toCPointer<ByteVar>(), notification, param1, param2)

public actual fun SetupDeleteErrorA(hwndparent: HWND, dialogtitle: PCSTR, file: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), win32errorcode, style)

public actual fun SetupDeleteErrorW(hwndparent: HWND, dialogtitle: PCWSTR, file: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), file.toCPointer<ByteVar>(), win32errorcode, style)

public actual fun SetupDestroyDiskSpaceList(diskspace: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList(diskspace.toCPointer<ByteVar>())

public actual fun SetupDiAskForOEMDisk(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiBuildClassInfoList(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList(flags, classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiBuildClassInfoListExA(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA(flags, classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiBuildClassInfoListExW(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW(flags, classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiBuildDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), drivertype)

public actual fun SetupDiCallClassInstaller(installfunction: DI_FUNCTION, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller(installfunction, deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiCancelDriverInfoSearch(deviceinfoset: HDEVINFO): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch(deviceinfoset)

public actual fun SetupDiChangeState(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiClassGuidsFromNameA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA(classname.toCPointer<ByteVar>(), classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiClassGuidsFromNameExA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA(classname.toCPointer<ByteVar>(), classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiClassGuidsFromNameExW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW(classname.toCPointer<ByteVar>(), classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiClassGuidsFromNameW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW(classname.toCPointer<ByteVar>(), classguidlist.toCPointer<ByteVar>(), classguidlistsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiClassNameFromGuidA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA(classguid.toCPointer<ByteVar>(), classname.toCPointer<ByteVar>(), classnamesize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiClassNameFromGuidExA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA(classguid.toCPointer<ByteVar>(), classname.toCPointer<ByteVar>(), classnamesize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiClassNameFromGuidExW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW(classguid.toCPointer<ByteVar>(), classname.toCPointer<ByteVar>(), classnamesize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiClassNameFromGuidW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW(classguid.toCPointer<ByteVar>(), classname.toCPointer<ByteVar>(), classnamesize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiCreateDevRegKeyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), scope, hwprofile, keytype, infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupDiCreateDevRegKeyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), scope, hwprofile, keytype, infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupDiCreateDeviceInfoA(deviceinfoset: HDEVINFO, devicename: PCSTR, classguid: Long, devicedescription: PCSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA(deviceinfoset, devicename.toCPointer<ByteVar>(), classguid.toCPointer<ByteVar>(), devicedescription.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), creationflags, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: HWND): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList(classguid.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>())

public actual fun SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: HWND, machinename: PCSTR, reserved: Long): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA(classguid.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: HWND, machinename: PCWSTR, reserved: Long): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW(classguid.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiCreateDeviceInfoW(deviceinfoset: HDEVINFO, devicename: PCWSTR, classguid: Long, devicedescription: PCWSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW(deviceinfoset, devicename.toCPointer<ByteVar>(), classguid.toCPointer<ByteVar>(), devicedescription.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), creationflags, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiCreateDeviceInterfaceA(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), referencestring.toCPointer<ByteVar>(), creationflags, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), reserved, samdesired, infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), reserved, samdesired, infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupDiCreateDeviceInterfaceW(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCWSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), referencestring.toCPointer<ByteVar>(), creationflags, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiDeleteDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), scope, hwprofile, keytype)

public actual fun SetupDiDeleteDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiDeleteDeviceInterfaceData(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), reserved)

public actual fun SetupDiDestroyClassImageList(classimagelistdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList(classimagelistdata.toCPointer<ByteVar>())

public actual fun SetupDiDestroyDeviceInfoList(deviceinfoset: HDEVINFO): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList(deviceinfoset)

public actual fun SetupDiDestroyDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), drivertype)

public actual fun SetupDiDrawMiniIcon(hdc: HDC, rc: RECT, miniiconindex: Int, flags: UInt): Int =
    0

public actual fun SetupDiEnumDeviceInfo(deviceinfoset: HDEVINFO, memberindex: UInt, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo(deviceinfoset, memberindex, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiEnumDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, memberindex: UInt, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), memberindex, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiEnumDriverInfoA(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), drivertype, memberindex, driverinfodata.toCPointer<ByteVar>())

public actual fun SetupDiEnumDriverInfoW(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), drivertype, memberindex, driverinfodata.toCPointer<ByteVar>())

public actual fun SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA(context.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), infsectionwithext.toCPointer<ByteVar>(), infsectionwithextsize, requiredsize.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW(context.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), infsectionwithext.toCPointer<ByteVar>(), infsectionwithextsize, requiredsize.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: PCSTR, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA(infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>(), infsectionwithext.toCPointer<ByteVar>(), infsectionwithextsize, requiredsize.toCPointer<ByteVar>(), extension.toCPointer<ByteVar>())

public actual fun SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: PCSTR, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA(infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), infsectionwithext.toCPointer<ByteVar>(), infsectionwithextsize, requiredsize.toCPointer<ByteVar>(), extension.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: PCWSTR, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW(infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), infsectionwithext.toCPointer<ByteVar>(), infsectionwithextsize, requiredsize.toCPointer<ByteVar>(), extension.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: PCWSTR, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW(infhandle.toCPointer<ByteVar>(), infsectionname.toCPointer<ByteVar>(), infsectionwithext.toCPointer<ByteVar>(), infsectionwithextsize, requiredsize.toCPointer<ByteVar>(), extension.toCPointer<ByteVar>())

public actual fun SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex(classguid.toCPointer<ByteVar>(), miniiconindex.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDescriptionA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA(classguid.toCPointer<ByteVar>(), classdescription.toCPointer<ByteVar>(), classdescriptionsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDescriptionExA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA(classguid.toCPointer<ByteVar>(), classdescription.toCPointer<ByteVar>(), classdescriptionsize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDescriptionExW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW(classguid.toCPointer<ByteVar>(), classdescription.toCPointer<ByteVar>(), classdescriptionsize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDescriptionW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW(classguid.toCPointer<ByteVar>(), classdescription.toCPointer<ByteVar>(), classdescriptionsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDevPropertySheetsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), propertysheetheader.toCPointer<ByteVar>(), propertysheetheaderpagelistsize, requiredsize.toCPointer<ByteVar>(), propertysheettype)

public actual fun SetupDiGetClassDevPropertySheetsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), propertysheetheader.toCPointer<ByteVar>(), propertysheetheaderpagelistsize, requiredsize.toCPointer<ByteVar>(), propertysheettype)

public actual fun SetupDiGetClassDevsA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA(classguid.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetClassDevsExA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCSTR, reserved: Long): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA(classguid.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), flags, deviceinfoset, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDevsExW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCWSTR, reserved: Long): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW(classguid.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), flags, deviceinfoset, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassDevsW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW(classguid.toCPointer<ByteVar>(), enumerator.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex(classimagelistdata.toCPointer<ByteVar>(), classguid.toCPointer<ByteVar>(), imageindex.toCPointer<ByteVar>())

public actual fun SetupDiGetClassImageList(classimagelistdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList(classimagelistdata.toCPointer<ByteVar>())

public actual fun SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA(classimagelistdata.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW(classimagelistdata.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), classinstallparams.toCPointer<ByteVar>(), classinstallparamssize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), classinstallparams.toCPointer<ByteVar>(), classinstallparamssize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>(), flags, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys(classguid.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount, requiredpropertykeycount.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW(classguid.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount, requiredpropertykeycount.toCPointer<ByteVar>(), flags, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetClassRegistryPropertyA(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA(classguid.toCPointer<ByteVar>(), property, propertyregdatatype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetClassRegistryPropertyW(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW(classguid.toCPointer<ByteVar>(), property, propertyregdatatype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetCustomDevicePropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), custompropertyname.toCPointer<ByteVar>(), flags, propertyregdatatype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetCustomDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCWSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), custompropertyname.toCPointer<ByteVar>(), flags, propertyregdatatype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInfoListClass(deviceinfoset: HDEVINFO, classguid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass(deviceinfoset, classguid.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInfoListDetailA(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA(deviceinfoset, deviceinfosetdetaildata.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInfoListDetailW(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW(deviceinfoset, deviceinfosetdetaildata.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), deviceinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), deviceinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInstanceIdA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), deviceinstanceid.toCPointer<ByteVar>(), deviceinstanceidsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInstanceIdW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PWSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), deviceinstanceid.toCPointer<ByteVar>(), deviceinstanceidsize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInterfaceAlias(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), aliasinterfaceclassguid.toCPointer<ByteVar>(), aliasdeviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInterfaceDetailA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), deviceinterfacedetaildata.toCPointer<ByteVar>(), deviceinterfacedetaildatasize, requiredsize.toCPointer<ByteVar>(), deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInterfaceDetailW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), deviceinterfacedetaildata.toCPointer<ByteVar>(), deviceinterfacedetaildatasize, requiredsize.toCPointer<ByteVar>(), deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount, requiredpropertykeycount.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetDevicePropertyKeys(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), propertykeyarray.toCPointer<ByteVar>(), propertykeycount, requiredpropertykeycount.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>(), flags)

public actual fun SetupDiGetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), property, propertyregdatatype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), property, propertyregdatatype.toCPointer<ByteVar>(), propertybuffer.toCPointer<ByteVar>(), propertybuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDriverInfoDetailA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), driverinfodetaildata.toCPointer<ByteVar>(), driverinfodetaildatasize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDriverInfoDetailW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), driverinfodetaildata.toCPointer<ByteVar>(), driverinfodetaildatasize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), driverinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiGetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), driverinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA(hwprofile, friendlyname.toCPointer<ByteVar>(), friendlynamesize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA(hwprofile, friendlyname.toCPointer<ByteVar>(), friendlynamesize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW(hwprofile, friendlyname.toCPointer<ByteVar>(), friendlynamesize, requiredsize.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW(hwprofile, friendlyname.toCPointer<ByteVar>(), friendlynamesize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList(hwprofilelist.toCPointer<ByteVar>(), hwprofilelistsize, requiredsize.toCPointer<ByteVar>(), currentlyactiveindex.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA(hwprofilelist.toCPointer<ByteVar>(), hwprofilelistsize, requiredsize.toCPointer<ByteVar>(), currentlyactiveindex.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW(hwprofilelist.toCPointer<ByteVar>(), hwprofilelistsize, requiredsize.toCPointer<ByteVar>(), currentlyactiveindex.toCPointer<ByteVar>(), machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiGetINFClassA(infname: PCSTR, classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA(infname.toCPointer<ByteVar>(), classguid.toCPointer<ByteVar>(), classname.toCPointer<ByteVar>(), classnamesize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetINFClassW(infname: PCWSTR, classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW(infname.toCPointer<ByteVar>(), classguid.toCPointer<ByteVar>(), classname.toCPointer<ByteVar>(), classnamesize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupDiGetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiGetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>())

public actual fun SetupDiGetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>())

public actual fun SetupDiGetWizardPage(deviceinfoset: HDEVINFO, deviceinfodata: Long, installwizarddata: Long, pagetype: UInt, flags: UInt): HPROPSHEETPAGE =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), installwizarddata.toCPointer<ByteVar>(), pagetype, flags)?.toLong() ?: 0L

public actual fun SetupDiInstallClassA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA(hwndparent.toCPointer<ByteVar>(), inffilename.toCPointer<ByteVar>(), flags, filequeue.toCPointer<ByteVar>())

public actual fun SetupDiInstallClassExA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA(hwndparent.toCPointer<ByteVar>(), inffilename.toCPointer<ByteVar>(), flags, filequeue.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2.toCPointer<ByteVar>())

public actual fun SetupDiInstallClassExW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW(hwndparent.toCPointer<ByteVar>(), inffilename.toCPointer<ByteVar>(), flags, filequeue.toCPointer<ByteVar>(), interfaceclassguid.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2.toCPointer<ByteVar>())

public actual fun SetupDiInstallClassW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW(hwndparent.toCPointer<ByteVar>(), inffilename.toCPointer<ByteVar>(), flags, filequeue.toCPointer<ByteVar>())

public actual fun SetupDiInstallDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiInstallDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiInstallDriverFiles(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon(classguid.toCPointer<ByteVar>(), largeicon.toCPointer<ByteVar>(), miniiconindex.toCPointer<ByteVar>())

public actual fun SetupDiLoadDeviceIcon(deviceinfoset: HDEVINFO, deviceinfodata: Long, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), cxicon, cyicon, flags, hicon.toCPointer<ByteVar>())

public actual fun SetupDiOpenClassRegKey(classguid: Long, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey(classguid.toCPointer<ByteVar>(), samdesired)?.toLong() ?: 0L

public actual fun SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCSTR, reserved: Long): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA(classguid.toCPointer<ByteVar>(), samdesired, flags, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW(classguid.toCPointer<ByteVar>(), samdesired, flags, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupDiOpenDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), scope, hwprofile, keytype, samdesired)?.toLong() ?: 0L

public actual fun SetupDiOpenDeviceInfoA(deviceinfoset: HDEVINFO, deviceinstanceid: PCSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA(deviceinfoset, deviceinstanceid.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), openflags, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiOpenDeviceInfoW(deviceinfoset: HDEVINFO, deviceinstanceid: PCWSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW(deviceinfoset, deviceinstanceid.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), openflags, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiOpenDeviceInterfaceA(deviceinfoset: HDEVINFO, devicepath: PCSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA(deviceinfoset, devicepath.toCPointer<ByteVar>(), openflags, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt): HKEY =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), reserved, samdesired)?.toLong() ?: 0L

public actual fun SetupDiOpenDeviceInterfaceW(deviceinfoset: HDEVINFO, devicepath: PCWSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW(deviceinfoset, devicepath.toCPointer<ByteVar>(), openflags, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiRegisterCoDeviceInstallers(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiRegisterDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, compareproc: PSP_DETSIG_CMPPROC, comparecontext: Long, dupdeviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), flags, compareproc.toLong().toCPointer<ByteVar>(), comparecontext.toCPointer<ByteVar>(), dupdeviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiRemoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiRemoveDeviceInterface(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>())

public actual fun SetupDiRestartDevices(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiSelectBestCompatDrv(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiSelectDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiSelectOEMDrv(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv(hwndparent.toCPointer<ByteVar>(), deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiSetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), classinstallparams.toCPointer<ByteVar>(), classinstallparamssize)

public actual fun SetupDiSetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), classinstallparams.toCPointer<ByteVar>(), classinstallparamssize)

public actual fun SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, flags, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW(classguid.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, flags)

public actual fun SetupDiSetClassRegistryPropertyA(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA(classguid.toCPointer<ByteVar>(), property, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiSetClassRegistryPropertyW(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW(classguid.toCPointer<ByteVar>(), property, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, machinename.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun SetupDiSetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), deviceinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiSetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), deviceinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiSetDeviceInterfaceDefault(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, flags: UInt, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), flags, reserved.toCPointer<ByteVar>())

public actual fun SetupDiSetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW(deviceinfoset, deviceinterfacedata.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, flags)

public actual fun SetupDiSetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), propertykey.toCPointer<ByteVar>(), propertytype, propertybuffer.toCPointer<ByteVar>(), propertybuffersize, flags)

public actual fun SetupDiSetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), property, propertybuffer.toCPointer<ByteVar>(), propertybuffersize)

public actual fun SetupDiSetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), property, propertybuffer.toCPointer<ByteVar>(), propertybuffersize)

public actual fun SetupDiSetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), driverinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiSetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>(), driverinstallparams.toCPointer<ByteVar>())

public actual fun SetupDiSetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDiSetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>())

public actual fun SetupDiSetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW(deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), driverinfodata.toCPointer<ByteVar>())

public actual fun SetupDiUnremoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice(deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA(diskspace.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2, flags)?.toLong() ?: 0L

public actual fun SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW(diskspace.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2, flags)?.toLong() ?: 0L

public actual fun SetupEnumInfSectionsA(infhandle: Long, index: UInt, buffer: PSTR, size: UInt, sizeneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA(infhandle.toCPointer<ByteVar>(), index, buffer.toCPointer<ByteVar>(), size, sizeneeded.toCPointer<ByteVar>())

public actual fun SetupEnumInfSectionsW(infhandle: Long, index: UInt, buffer: PWSTR, size: UInt, sizeneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW(infhandle.toCPointer<ByteVar>(), index, buffer.toCPointer<ByteVar>(), size, sizeneeded.toCPointer<ByteVar>())

public actual fun SetupFindFirstLineA(infhandle: Long, section: PCSTR, key: PCSTR, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA(infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupFindFirstLineW(infhandle: Long, section: PCWSTR, key: PCWSTR, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW(infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupFindNextLine(contextin: Long, contextout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine(contextin.toCPointer<ByteVar>(), contextout.toCPointer<ByteVar>())

public actual fun SetupFindNextMatchLineA(contextin: Long, key: PCSTR, contextout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA(contextin.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), contextout.toCPointer<ByteVar>())

public actual fun SetupFindNextMatchLineW(contextin: Long, key: PCWSTR, contextout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW(contextin.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), contextout.toCPointer<ByteVar>())

public actual fun SetupFreeSourceListA(list: Long, count: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA(list.toCPointer<ByteVar>(), count)

public actual fun SetupFreeSourceListW(list: Long, count: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW(list.toCPointer<ByteVar>(), count)

public actual fun SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA(queuehandle.toCPointer<ByteVar>(), backupparams.toCPointer<ByteVar>())

public actual fun SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW(queuehandle.toCPointer<ByteVar>(), backupparams.toCPointer<ByteVar>())

public actual fun SetupGetBinaryField(context: Long, fieldindex: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField(context.toCPointer<ByteVar>(), fieldindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetFieldCount(context: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount(context.toCPointer<ByteVar>())

public actual fun SetupGetFileCompressionInfoA(sourcefilename: PCSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA(sourcefilename.toCPointer<ByteVar>(), actualsourcefilename.toCPointer<ByteVar>(), sourcefilesize.toCPointer<ByteVar>(), targetfilesize.toCPointer<ByteVar>(), compressiontype.toCPointer<ByteVar>())

public actual fun SetupGetFileCompressionInfoExA(sourcefilename: PCSTR, actualsourcefilenamebuffer: PCSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA(sourcefilename.toCPointer<ByteVar>(), actualsourcefilenamebuffer.toCPointer<ByteVar>(), actualsourcefilenamebufferlen, requiredbufferlen.toCPointer<ByteVar>(), sourcefilesize.toCPointer<ByteVar>(), targetfilesize.toCPointer<ByteVar>(), compressiontype.toCPointer<ByteVar>())

public actual fun SetupGetFileCompressionInfoExW(sourcefilename: PCWSTR, actualsourcefilenamebuffer: PCWSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW(sourcefilename.toCPointer<ByteVar>(), actualsourcefilenamebuffer.toCPointer<ByteVar>(), actualsourcefilenamebufferlen, requiredbufferlen.toCPointer<ByteVar>(), sourcefilesize.toCPointer<ByteVar>(), targetfilesize.toCPointer<ByteVar>(), compressiontype.toCPointer<ByteVar>())

public actual fun SetupGetFileCompressionInfoW(sourcefilename: PCWSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW(sourcefilename.toCPointer<ByteVar>(), actualsourcefilename.toCPointer<ByteVar>(), sourcefilesize.toCPointer<ByteVar>(), targetfilesize.toCPointer<ByteVar>(), compressiontype.toCPointer<ByteVar>())

public actual fun SetupGetFileQueueCount(filequeue: Long, subqueuefileop: UInt, numoperations: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount(filequeue.toCPointer<ByteVar>(), subqueuefileop, numoperations.toCPointer<ByteVar>())

public actual fun SetupGetFileQueueFlags(filequeue: Long, flags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags(filequeue.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>())

public actual fun SetupGetInfDriverStoreLocationA(filename: PCSTR, alternateplatforminfo: Long, localename: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA(filename.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), localename.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfDriverStoreLocationW(filename: PCWSTR, alternateplatforminfo: Long, localename: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW(filename.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), localename.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfFileListA(directorypath: PCSTR, infstyle: INF_STYLE, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA(directorypath.toCPointer<ByteVar>(), infstyle, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfFileListW(directorypath: PCWSTR, infstyle: INF_STYLE, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW(directorypath.toCPointer<ByteVar>(), infstyle, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfInformationA(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA(infspec.toCPointer<ByteVar>(), searchcontrol, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfInformationW(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW(infspec.toCPointer<ByteVar>(), searchcontrol, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfPublishedNameA(driverstorelocation: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA(driverstorelocation.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetInfPublishedNameW(driverstorelocation: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW(driverstorelocation.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetIntField(context: Long, fieldindex: UInt, integervalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField(context.toCPointer<ByteVar>(), fieldindex, integervalue.toCPointer<ByteVar>())

public actual fun SetupGetLineByIndexA(infhandle: Long, section: PCSTR, index: UInt, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA(infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), index, context.toCPointer<ByteVar>())

public actual fun SetupGetLineByIndexW(infhandle: Long, section: PCWSTR, index: UInt, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW(infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), index, context.toCPointer<ByteVar>())

public actual fun SetupGetLineCountA(infhandle: Long, section: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA(infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>())

public actual fun SetupGetLineCountW(infhandle: Long, section: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW(infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>())

public actual fun SetupGetLineTextA(context: Long, infhandle: Long, section: PCSTR, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA(context.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetLineTextW(context: Long, infhandle: Long, section: PCWSTR, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW(context.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetMultiSzFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA(context.toCPointer<ByteVar>(), fieldindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetMultiSzFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW(context.toCPointer<ByteVar>(), fieldindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetNonInteractiveMode(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode()

public actual fun SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: PCSTR, sourceid: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), sourceid.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: PCWSTR, sourceid: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), sourceid.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: PCSTR, section: PCSTR, filesize: Long, roundingfactor: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), filesize.toCPointer<ByteVar>(), roundingfactor)

public actual fun SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: PCWSTR, section: PCWSTR, filesize: Long, roundingfactor: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), filesize.toCPointer<ByteVar>(), roundingfactor)

public actual fun SetupGetSourceInfoA(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA(infhandle.toCPointer<ByteVar>(), sourceid, infodesired, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetSourceInfoW(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW(infhandle.toCPointer<ByteVar>(), sourceid, infodesired, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetStringFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA(context.toCPointer<ByteVar>(), fieldindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetStringFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW(context.toCPointer<ByteVar>(), fieldindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupGetThreadLogToken(): ULong =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken()

public actual fun SetupInitDefaultQueueCallback(ownerwindow: HWND): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback(ownerwindow.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupInitDefaultQueueCallbackEx(ownerwindow: HWND, alternateprogresswindow: HWND, progressmessage: UInt, reserved1: UInt, reserved2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx(ownerwindow.toCPointer<ByteVar>(), alternateprogresswindow.toCPointer<ByteVar>(), progressmessage, reserved1, reserved2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupInitializeFileLogA(logfilename: PCSTR, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA(logfilename.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun SetupInitializeFileLogW(logfilename: PCWSTR, flags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW(logfilename.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), sourcepathroot.toCPointer<ByteVar>(), destinationname.toCPointer<ByteVar>(), copystyle, copymsghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long, filewasinuse: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), sourcepathroot.toCPointer<ByteVar>(), destinationname.toCPointer<ByteVar>(), copystyle, copymsghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), filewasinuse.toCPointer<ByteVar>())

public actual fun SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long, filewasinuse: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), sourcepathroot.toCPointer<ByteVar>(), destinationname.toCPointer<ByteVar>(), copystyle, copymsghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), filewasinuse.toCPointer<ByteVar>())

public actual fun SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW(infhandle.toCPointer<ByteVar>(), infcontext.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), sourcepathroot.toCPointer<ByteVar>(), destinationname.toCPointer<ByteVar>(), copystyle, copymsghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCSTR, sourcerootpath: PCSTR, copyflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA(infhandle.toCPointer<ByteVar>(), layoutinfhandle.toCPointer<ByteVar>(), filequeue.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), copyflags)

public actual fun SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCWSTR, sourcerootpath: PCWSTR, copyflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW(infhandle.toCPointer<ByteVar>(), layoutinfhandle.toCPointer<ByteVar>(), filequeue.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), copyflags)

public actual fun SetupInstallFromInfSectionA(owner: HWND, infhandle: Long, sectionname: PCSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA(owner.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags, relativekeyroot.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), copyflags, msghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupInstallFromInfSectionW(owner: HWND, infhandle: Long, sectionname: PCWSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCWSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW(owner.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags, relativekeyroot.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), copyflags, msghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), deviceinfoset, deviceinfodata.toCPointer<ByteVar>())

public actual fun SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA(infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags)

public actual fun SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA(infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags, deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2.toCPointer<ByteVar>())

public actual fun SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW(infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags, deviceinfoset, deviceinfodata.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2.toCPointer<ByteVar>())

public actual fun SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW(infhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), flags)

public actual fun SetupIterateCabinetA(cabinetfile: PCSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA(cabinetfile.toCPointer<ByteVar>(), reserved, msghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupIterateCabinetW(cabinetfile: PCWSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW(cabinetfile.toCPointer<ByteVar>(), reserved, msghandler.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun SetupLogErrorA(messagestring: PCSTR, severity: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA(messagestring.toCPointer<ByteVar>(), severity)

public actual fun SetupLogErrorW(messagestring: PCWSTR, severity: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW(messagestring.toCPointer<ByteVar>(), severity)

public actual fun SetupLogFileA(fileloghandle: Long, logsectionname: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, checksum: UInt, disktagfile: PCSTR, diskdescription: PCSTR, otherinfo: PCSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA(fileloghandle.toCPointer<ByteVar>(), logsectionname.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), checksum, disktagfile.toCPointer<ByteVar>(), diskdescription.toCPointer<ByteVar>(), otherinfo.toCPointer<ByteVar>(), flags)

public actual fun SetupLogFileW(fileloghandle: Long, logsectionname: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, checksum: UInt, disktagfile: PCWSTR, diskdescription: PCWSTR, otherinfo: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW(fileloghandle.toCPointer<ByteVar>(), logsectionname.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), checksum, disktagfile.toCPointer<ByteVar>(), diskdescription.toCPointer<ByteVar>(), otherinfo.toCPointer<ByteVar>(), flags)

public actual fun SetupOpenAppendInfFileA(filename: PCSTR, infhandle: Long, errorline: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA(filename.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), errorline.toCPointer<ByteVar>())

public actual fun SetupOpenAppendInfFileW(filename: PCWSTR, infhandle: Long, errorline: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW(filename.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), errorline.toCPointer<ByteVar>())

public actual fun SetupOpenFileQueue(): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue()?.toLong() ?: 0L

public actual fun SetupOpenInfFileA(filename: PCSTR, infclass: PCSTR, infstyle: INF_STYLE, errorline: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA(filename.toCPointer<ByteVar>(), infclass.toCPointer<ByteVar>(), infstyle, errorline.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupOpenInfFileW(filename: PCWSTR, infclass: PCWSTR, infstyle: INF_STYLE, errorline: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW(filename.toCPointer<ByteVar>(), infclass.toCPointer<ByteVar>(), infstyle, errorline.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetupOpenLog(erase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog(erase)

public actual fun SetupOpenMasterInf(): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf()?.toLong() ?: 0L

public actual fun SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: PCSTR, restoreflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA(queuehandle.toCPointer<ByteVar>(), backuppath.toCPointer<ByteVar>(), restoreflags)

public actual fun SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: PCWSTR, restoreflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW(queuehandle.toCPointer<ByteVar>(), backuppath.toCPointer<ByteVar>(), restoreflags)

public actual fun SetupPromptForDiskA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, filesought: PCSTR, tagfile: PCSTR, diskpromptstyle: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), diskname.toCPointer<ByteVar>(), pathtosource.toCPointer<ByteVar>(), filesought.toCPointer<ByteVar>(), tagfile.toCPointer<ByteVar>(), diskpromptstyle, pathbuffer.toCPointer<ByteVar>(), pathbuffersize, pathrequiredsize.toCPointer<ByteVar>())

public actual fun SetupPromptForDiskW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, filesought: PCWSTR, tagfile: PCWSTR, diskpromptstyle: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), diskname.toCPointer<ByteVar>(), pathtosource.toCPointer<ByteVar>(), filesought.toCPointer<ByteVar>(), tagfile.toCPointer<ByteVar>(), diskpromptstyle, pathbuffer.toCPointer<ByteVar>(), pathbuffersize, pathrequiredsize.toCPointer<ByteVar>())

public actual fun SetupPromptReboot(filequeue: Long, owner: HWND, scanonly: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot(filequeue.toCPointer<ByteVar>(), owner.toCPointer<ByteVar>(), scanonly)

public actual fun SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA(diskspace.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW(diskspace.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryFileLogA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR, desiredinfo: SetupFileLogInfo, dataout: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA(fileloghandle.toCPointer<ByteVar>(), logsectionname.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), desiredinfo, dataout.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryFileLogW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR, desiredinfo: SetupFileLogInfo, dataout: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW(fileloghandle.toCPointer<ByteVar>(), logsectionname.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), desiredinfo, dataout.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryInfFileInformationA(infinformation: Long, infindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA(infinformation.toCPointer<ByteVar>(), infindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryInfFileInformationW(infinformation: Long, infindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW(infinformation.toCPointer<ByteVar>(), infindex, returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA(infinformation.toCPointer<ByteVar>(), infindex, alternateplatforminfo.toCPointer<ByteVar>(), originalfileinfo.toCPointer<ByteVar>())

public actual fun SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW(infinformation.toCPointer<ByteVar>(), infindex, alternateplatforminfo.toCPointer<ByteVar>(), originalfileinfo.toCPointer<ByteVar>())

public actual fun SetupQueryInfVersionInformationA(infinformation: Long, infindex: UInt, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA(infinformation.toCPointer<ByteVar>(), infindex, key.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQueryInfVersionInformationW(infinformation: Long, infindex: UInt, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW(infinformation.toCPointer<ByteVar>(), infindex, key.toCPointer<ByteVar>(), returnbuffer.toCPointer<ByteVar>(), returnbuffersize, requiredsize.toCPointer<ByteVar>())

public actual fun SetupQuerySourceListA(flags: UInt, list: Long, count: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA(flags, list.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun SetupQuerySourceListW(flags: UInt, list: Long, count: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW(flags, list.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: PCSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA(diskspace.toCPointer<ByteVar>(), drivespec.toCPointer<ByteVar>(), spacerequired.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: PCWSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW(diskspace.toCPointer<ByteVar>(), drivespec.toCPointer<ByteVar>(), spacerequired.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupQueueCopyA(queuehandle: Long, sourcerootpath: PCSTR, sourcepath: PCSTR, sourcefilename: PCSTR, sourcedescription: PCSTR, sourcetagfile: PCSTR, targetdirectory: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA(queuehandle.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), sourcepath.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), sourcedescription.toCPointer<ByteVar>(), sourcetagfile.toCPointer<ByteVar>(), targetdirectory.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), copystyle)

public actual fun SetupQueueCopyIndirectA(copyparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA(copyparams.toCPointer<ByteVar>())

public actual fun SetupQueueCopyIndirectW(copyparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW(copyparams.toCPointer<ByteVar>())

public actual fun SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: PCSTR, infhandle: Long, listinfhandle: Long, section: PCSTR, copystyle: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA(queuehandle.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), copystyle)

public actual fun SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: PCWSTR, infhandle: Long, listinfhandle: Long, section: PCWSTR, copystyle: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW(queuehandle.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>(), copystyle)

public actual fun SetupQueueCopyW(queuehandle: Long, sourcerootpath: PCWSTR, sourcepath: PCWSTR, sourcefilename: PCWSTR, sourcedescription: PCWSTR, sourcetagfile: PCWSTR, targetdirectory: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW(queuehandle.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), sourcepath.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), sourcedescription.toCPointer<ByteVar>(), sourcetagfile.toCPointer<ByteVar>(), targetdirectory.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), copystyle)

public actual fun SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA(queuehandle.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), copystyle)

public actual fun SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW(queuehandle.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), sourcerootpath.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>(), copystyle)

public actual fun SetupQueueDeleteA(queuehandle: Long, pathpart1: PCSTR, pathpart2: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA(queuehandle.toCPointer<ByteVar>(), pathpart1.toCPointer<ByteVar>(), pathpart2.toCPointer<ByteVar>())

public actual fun SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA(queuehandle.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>())

public actual fun SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW(queuehandle.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>())

public actual fun SetupQueueDeleteW(queuehandle: Long, pathpart1: PCWSTR, pathpart2: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW(queuehandle.toCPointer<ByteVar>(), pathpart1.toCPointer<ByteVar>(), pathpart2.toCPointer<ByteVar>())

public actual fun SetupQueueRenameA(queuehandle: Long, sourcepath: PCSTR, sourcefilename: PCSTR, targetpath: PCSTR, targetfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA(queuehandle.toCPointer<ByteVar>(), sourcepath.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), targetpath.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>())

public actual fun SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA(queuehandle.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>())

public actual fun SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW(queuehandle.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), section.toCPointer<ByteVar>())

public actual fun SetupQueueRenameW(queuehandle: Long, sourcepath: PCWSTR, sourcefilename: PCWSTR, targetpath: PCWSTR, targetfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW(queuehandle.toCPointer<ByteVar>(), sourcepath.toCPointer<ByteVar>(), sourcefilename.toCPointer<ByteVar>(), targetpath.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>())

public actual fun SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA(fileloghandle.toCPointer<ByteVar>(), logsectionname.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>())

public actual fun SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW(fileloghandle.toCPointer<ByteVar>(), logsectionname.toCPointer<ByteVar>(), targetfilename.toCPointer<ByteVar>())

public actual fun SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA(diskspace.toCPointer<ByteVar>(), targetfilespec.toCPointer<ByteVar>(), operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW(diskspace.toCPointer<ByteVar>(), targetfilespec.toCPointer<ByteVar>(), operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupRemoveFromSourceListA(flags: UInt, source: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA(flags, source.toCPointer<ByteVar>())

public actual fun SetupRemoveFromSourceListW(flags: UInt, source: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW(flags, source.toCPointer<ByteVar>())

public actual fun SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), layoutinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), layoutinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW(diskspace.toCPointer<ByteVar>(), infhandle.toCPointer<ByteVar>(), listinfhandle.toCPointer<ByteVar>(), sectionname.toCPointer<ByteVar>(), operation, reserved1.toCPointer<ByteVar>(), reserved2)

public actual fun SetupRenameErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), targetfile.toCPointer<ByteVar>(), win32errorcode, style)

public actual fun SetupRenameErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW(hwndparent.toCPointer<ByteVar>(), dialogtitle.toCPointer<ByteVar>(), sourcefile.toCPointer<ByteVar>(), targetfile.toCPointer<ByteVar>(), win32errorcode, style)

public actual fun SetupScanFileQueueA(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_A, callbackcontext: Long, result: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA(filequeue.toCPointer<ByteVar>(), flags, window.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun SetupScanFileQueueW(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_W, callbackcontext: Long, result: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW(filequeue.toCPointer<ByteVar>(), flags, window.toCPointer<ByteVar>(), callbackroutine.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun SetupSetDirectoryIdA(infhandle: Long, id: UInt, directory: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA(infhandle.toCPointer<ByteVar>(), id, directory.toCPointer<ByteVar>())

public actual fun SetupSetDirectoryIdExA(infhandle: Long, id: UInt, directory: PCSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA(infhandle.toCPointer<ByteVar>(), id, directory.toCPointer<ByteVar>(), flags, reserved1, reserved2.toCPointer<ByteVar>())

public actual fun SetupSetDirectoryIdExW(infhandle: Long, id: UInt, directory: PCWSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW(infhandle.toCPointer<ByteVar>(), id, directory.toCPointer<ByteVar>(), flags, reserved1, reserved2.toCPointer<ByteVar>())

public actual fun SetupSetDirectoryIdW(infhandle: Long, id: UInt, directory: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW(infhandle.toCPointer<ByteVar>(), id, directory.toCPointer<ByteVar>())

public actual fun SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA(queuehandle.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), alternatedefaultcatalogfile.toCPointer<ByteVar>())

public actual fun SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW(queuehandle.toCPointer<ByteVar>(), alternateplatforminfo.toCPointer<ByteVar>(), alternatedefaultcatalogfile.toCPointer<ByteVar>())

public actual fun SetupSetFileQueueFlags(filequeue: Long, flagmask: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags(filequeue.toCPointer<ByteVar>(), flagmask, flags)

public actual fun SetupSetNonInteractiveMode(noninteractiveflag: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode(noninteractiveflag)

public actual fun SetupSetPlatformPathOverrideA(override: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA(override.toCPointer<ByteVar>())

public actual fun SetupSetPlatformPathOverrideW(override: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW(override.toCPointer<ByteVar>())

public actual fun SetupSetSourceListA(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA(flags, sourcelist.toCPointer<ByteVar>(), sourcecount)

public actual fun SetupSetSourceListW(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW(flags, sourcelist.toCPointer<ByteVar>(), sourcecount)

public actual fun SetupSetThreadLogToken(logtoken: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken(logtoken)
}

public actual fun SetupTermDefaultQueueCallback(context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback(context.toCPointer<ByteVar>())
}

public actual fun SetupTerminateFileLog(fileloghandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog(fileloghandle.toCPointer<ByteVar>())

public actual fun SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: UInt, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs(filequeue.toCPointer<ByteVar>(), flags, reserved.toCPointer<ByteVar>())

public actual fun SetupUninstallOEMInfA(inffilename: PCSTR, flags: UInt, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA(inffilename.toCPointer<ByteVar>(), flags, reserved.toCPointer<ByteVar>())

public actual fun SetupUninstallOEMInfW(inffilename: PCWSTR, flags: UInt, reserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW(inffilename.toCPointer<ByteVar>(), flags, reserved.toCPointer<ByteVar>())

public actual fun SetupVerifyInfFileA(infname: PCSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA(infname.toCPointer<ByteVar>(), altplatforminfo.toCPointer<ByteVar>(), infsignerinfo.toCPointer<ByteVar>())

public actual fun SetupVerifyInfFileW(infname: PCWSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW(infname.toCPointer<ByteVar>(), altplatforminfo.toCPointer<ByteVar>(), infsignerinfo.toCPointer<ByteVar>())

public actual fun SetupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: Long, context: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine(logtoken, flags, infhandle.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())
}

public actual fun UpdateDriverForPlugAndPlayDevicesA(hwndparent: HWND, hardwareid: PCSTR, fullinfpath: PCSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA(hwndparent.toCPointer<ByteVar>(), hardwareid.toCPointer<ByteVar>(), fullinfpath.toCPointer<ByteVar>(), installflags, brebootrequired.toCPointer<ByteVar>())

public actual fun UpdateDriverForPlugAndPlayDevicesW(hwndparent: HWND, hardwareid: PCWSTR, fullinfpath: PCWSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation.cinterop.windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW(hwndparent.toCPointer<ByteVar>(), hardwareid.toCPointer<ByteVar>(), fullinfpath.toCPointer<ByteVar>(), installflags, brebootrequired.toCPointer<ByteVar>())
