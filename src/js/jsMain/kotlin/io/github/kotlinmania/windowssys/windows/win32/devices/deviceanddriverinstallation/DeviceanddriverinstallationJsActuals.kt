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

private val _windowsWin32DevicesDeviceanddriverinstallationNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CMP_WaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents(dwtimeout.toInt()) as Int).toUInt() else 0u

public actual fun CM_Add_Empty_Log_Conf(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf(plclogconf.toString(), dndevinst.toInt(), priority, ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Add_Empty_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, priority: PRIORITY, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex(plclogconf.toString(), dndevinst.toInt(), priority, ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Add_IDA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA(dndevinst.toInt(), pszid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Add_IDW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW(dndevinst.toInt(), pszid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Add_ID_ExA(dndevinst: UInt, pszid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA(dndevinst.toInt(), pszid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Add_ID_ExW(dndevinst: UInt, pszid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW(dndevinst.toInt(), pszid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Add_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Add_Res_Des(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des(prdresdes.toString(), lclogconf.toString(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Add_Res_Des_Ex(prdresdes: Long, lclogconf: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex(prdresdes.toString(), lclogconf.toString(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Connect_MachineA(uncservername: PCSTR, phmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA(uncservername.toString(), phmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Connect_MachineW(uncservername: PCWSTR, phmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW(uncservername.toString(), phmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Create_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA(pdndevinst.toString(), pdeviceid.toString(), dnparent.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Create_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW(pdndevinst.toString(), pdeviceid.toString(), dnparent.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Create_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA(pdndevinst.toString(), pdeviceid.toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Create_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, dnparent: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW(pdndevinst.toString(), pdeviceid.toString(), dnparent.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Create_Range_List(prlh: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List(prlh.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Delete_Class_Key(classguid: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key(classguid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Delete_Class_Key_Ex(classguid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex(classguid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Delete_DevNode_Key(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Delete_DevNode_Key_Ex(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Delete_Device_Interface_KeyA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA(pszdeviceinterface.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Delete_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW(pszdeviceinterface.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA(pszdeviceinterface.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW(pszdeviceinterface.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Delete_Range(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Detect_Resource_Conflict(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict(dndevinst.toInt(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), pbconflictdetected.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Detect_Resource_Conflict_Ex(dndevinst: UInt, resourceid: UInt, resourcedata: Long, resourcelen: UInt, pbconflictdetected: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex(dndevinst.toInt(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), pbconflictdetected.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Disable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Disable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Disconnect_Machine(hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine(hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Dup_Range_List(rlhold: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List(rlhold.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Enable_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Enable_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Enumerate_Classes(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes(ulclassindex.toInt(), classguid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Enumerate_Classes_Ex(ulclassindex: UInt, classguid: Long, ulflags: CM_ENUMERATE_FLAGS, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex(ulclassindex.toInt(), classguid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Enumerate_EnumeratorsA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA(ulenumindex.toInt(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Enumerate_EnumeratorsW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW(ulenumindex.toInt(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Enumerate_Enumerators_ExA(ulenumindex: UInt, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA(ulenumindex.toInt(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Enumerate_Enumerators_ExW(ulenumindex: UInt, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW(ulenumindex.toInt(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Find_Range(pullstart: Long, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range(pullstart.toString(), ullstart.toString(), ullength.toInt(), ullalignment.toString(), ullend.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_First_Range(rlh: ULong, pullstart: Long, pullend: Long, preelement: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range(rlh.toString(), pullstart.toString(), pullend.toString(), preelement.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Free_Log_Conf(lclogconftobefreed: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf(lclogconftobefreed.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Free_Log_Conf_Ex(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex(lclogconftobefreed.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Free_Log_Conf_Handle(lclogconf: ULong): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle(lclogconf.toString()) as Int).toUInt() else 0u

public actual fun CM_Free_Range_List(rlh: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List(rlh.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Free_Res_Des(prdresdes: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des(prdresdes.toString(), rdresdes.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Free_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex(prdresdes.toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Free_Res_Des_Handle(rdresdes: ULong): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle(rdresdes.toString()) as Int).toUInt() else 0u

public actual fun CM_Free_Resource_Conflict_Handle(clconflictlist: ULong): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle(clconflictlist.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Child(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child(pdndevinst.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Child_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex(pdndevinst.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Key_NameA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA(classguid.toString(), pszkeyname.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Key_NameW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW(classguid.toString(), pszkeyname.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Key_Name_ExA(classguid: Long, pszkeyname: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA(classguid.toString(), pszkeyname.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Key_Name_ExW(classguid: Long, pszkeyname: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW(classguid.toString(), pszkeyname.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_NameA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA(classguid.toString(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_NameW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW(classguid.toString(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Name_ExA(classguid: Long, buffer: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA(classguid.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Name_ExW(classguid: Long, buffer: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW(classguid.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW(classguid.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW(classguid.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Property_Keys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys(classguid.toString(), propertykeyarray.toString(), propertykeycount.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Property_Keys_Ex(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex(classguid.toString(), propertykeyarray.toString(), propertykeycount.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA(classguid.toString(), ulproperty.toInt(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW(classguid.toString(), ulproperty.toInt(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Depth(puldepth: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth(puldepth.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Depth_Ex(puldepth: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex(puldepth.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Custom_PropertyA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA(dndevinst.toInt(), pszcustompropertyname.toString(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Custom_PropertyW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW(dndevinst.toInt(), pszcustompropertyname.toString(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Custom_Property_ExA(dndevinst: UInt, pszcustompropertyname: PCSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA(dndevinst.toInt(), pszcustompropertyname.toString(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Custom_Property_ExW(dndevinst: UInt, pszcustompropertyname: PCWSTR, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW(dndevinst.toInt(), pszcustompropertyname.toString(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW(dndevinst.toInt(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW(dndevinst.toInt(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Property_Keys(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys(dndevinst.toInt(), propertykeyarray.toString(), propertykeycount.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Property_Keys_Ex(dndevinst: UInt, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex(dndevinst.toInt(), propertykeyarray.toString(), propertykeycount.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.toString(), buffer.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Status(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status(pulstatus.toString(), pulproblemnumber.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_DevNode_Status_Ex(pulstatus: Long, pulproblemnumber: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex(pulstatus.toString(), pulproblemnumber.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_IDA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA(dndevinst.toInt(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_IDW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW(dndevinst.toInt(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_ExA(dndevinst: UInt, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA(dndevinst.toInt(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_ExW(dndevinst: UInt, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW(dndevinst.toInt(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_ListA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA(pszfilter.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_ListW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW(pszfilter.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_List_ExA(pszfilter: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA(pszfilter.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_List_ExW(pszfilter: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW(pszfilter.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_List_SizeA(pullen: Long, pszfilter: PCSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA(pullen.toString(), pszfilter.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_List_SizeW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW(pullen.toString(), pszfilter.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_List_Size_ExA(pullen: Long, pszfilter: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA(pullen.toString(), pszfilter.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_List_Size_ExW(pullen: Long, pszfilter: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW(pullen.toString(), pszfilter.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_Size(pullen: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size(pullen.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_ID_Size_Ex(pullen: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex(pullen.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_AliasA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA(pszdeviceinterface.toString(), aliasinterfaceguid.toString(), pszaliasdeviceinterface.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_AliasW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW(pszdeviceinterface.toString(), aliasinterfaceguid.toString(), pszaliasdeviceinterface.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface: PCSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA(pszdeviceinterface.toString(), aliasinterfaceguid.toString(), pszaliasdeviceinterface.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface: PCWSTR, aliasinterfaceguid: Long, pszaliasdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW(pszdeviceinterface.toString(), aliasinterfaceguid.toString(), pszaliasdeviceinterface.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_ListA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA(interfaceclassguid.toString(), pdeviceid.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_ListW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW(interfaceclassguid.toString(), pdeviceid.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_List_ExA(interfaceclassguid: Long, pdeviceid: PCSTR, buffer: PSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA(interfaceclassguid.toString(), pdeviceid.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_List_ExW(interfaceclassguid: Long, pdeviceid: PCWSTR, buffer: PWSTR, bufferlen: UInt, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW(interfaceclassguid.toString(), pdeviceid.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_List_SizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA(pullen.toString(), interfaceclassguid.toString(), pdeviceid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_List_SizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW(pullen.toString(), interfaceclassguid.toString(), pdeviceid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_List_Size_ExA(pullen: Long, interfaceclassguid: Long, pdeviceid: PCSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA(pullen.toString(), interfaceclassguid.toString(), pdeviceid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_List_Size_ExW(pullen: Long, interfaceclassguid: Long, pdeviceid: PCWSTR, ulflags: CM_GET_DEVICE_INTERFACE_LIST_FLAGS, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW(pullen.toString(), interfaceclassguid.toString(), pdeviceid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW(pszdeviceinterface.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW(pszdeviceinterface.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW(pszdeviceinterface.toString(), propertykeyarray.toString(), propertykeycount.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface: PCWSTR, propertykeyarray: Long, propertykeycount: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW(pszdeviceinterface.toString(), propertykeyarray.toString(), propertykeycount.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_First_Log_Conf(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf(plclogconf.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_First_Log_Conf_Ex(plclogconf: Long, dndevinst: UInt, ulflags: CM_LOG_CONF, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex(plclogconf.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Global_State(pulstate: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State(pulstate.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Global_State_Ex(pulstate: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex(pulstate.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_HW_Prof_FlagsA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA(pdeviceid.toString(), ulhardwareprofile.toInt(), pulvalue.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW(pdeviceid.toString(), ulhardwareprofile.toInt(), pulvalue.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA(pdeviceid.toString(), ulhardwareprofile.toInt(), pulvalue.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulhardwareprofile: UInt, pulvalue: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW(pdeviceid.toString(), ulhardwareprofile.toInt(), pulvalue.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Hardware_Profile_InfoA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA(ulindex.toInt(), phwprofileinfo.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Hardware_Profile_InfoW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW(ulindex.toInt(), phwprofileinfo.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Hardware_Profile_Info_ExA(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA(ulindex.toInt(), phwprofileinfo.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Hardware_Profile_Info_ExW(ulindex: UInt, phwprofileinfo: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW(ulindex.toInt(), phwprofileinfo.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Log_Conf_Priority(lclogconf: ULong, ppriority: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority(lclogconf.toString(), ppriority.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Log_Conf_Priority_Ex(lclogconf: ULong, ppriority: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex(lclogconf.toString(), ppriority.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Next_Log_Conf(plclogconf: Long, lclogconf: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf(plclogconf.toString(), lclogconf.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Next_Log_Conf_Ex(plclogconf: Long, lclogconf: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex(plclogconf.toString(), lclogconf.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Next_Res_Des(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des(prdresdes.toString(), rdresdes.toString(), forresource.toInt(), presourceid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Next_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, forresource: CM_RESTYPE, presourceid: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex(prdresdes.toString(), rdresdes.toString(), forresource.toInt(), presourceid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Parent(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent(pdndevinst.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Parent_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex(pdndevinst.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Res_Des_Data(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data(rdresdes.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Res_Des_Data_Ex(rdresdes: ULong, buffer: Long, bufferlen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex(rdresdes.toString(), buffer.toString(), bufferlen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Res_Des_Data_Size(pulsize: Long, rdresdes: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size(pulsize.toString(), rdresdes.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Res_Des_Data_Size_Ex(pulsize: Long, rdresdes: ULong, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex(pulsize.toString(), rdresdes.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Resource_Conflict_Count(clconflictlist: ULong, pulcount: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count(clconflictlist.toString(), pulcount.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Resource_Conflict_DetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA(clconflictlist.toString(), ulindex.toInt(), pconflictdetails.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Resource_Conflict_DetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW(clconflictlist.toString(), ulindex.toInt(), pconflictdetails.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Sibling(pdndevinst: Long, dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling(pdndevinst.toString(), dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Get_Sibling_Ex(pdndevinst: Long, dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex(pdndevinst.toString(), dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Get_Version(): UShort =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version() as Int).toUShort() else 0u

public actual fun CM_Get_Version_Ex(hmachine: Long): UShort =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex(hmachine.toString()) as Int).toUShort() else 0u

public actual fun CM_Intersect_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Invert_Range_List(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List(rlhold.toString(), rlhnew.toString(), ullmaxvalue.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Is_Dock_Station_Present(pbpresent: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present(pbpresent.toString()) as Int).toUInt() else 0u

public actual fun CM_Is_Dock_Station_Present_Ex(pbpresent: Long, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex(pbpresent.toString(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Is_Version_Available(wversion: UShort): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available(wversion.toInt()) as Int) else 0

public actual fun CM_Is_Version_Available_Ex(wversion: UShort, hmachine: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex(wversion.toInt(), hmachine.toString()) as Int) else 0

public actual fun CM_Locate_DevNodeA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA(pdndevinst.toString(), pdeviceid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Locate_DevNodeW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: CM_LOCATE_DEVNODE_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW(pdndevinst.toString(), pdeviceid.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Locate_DevNode_ExA(pdndevinst: Long, pdeviceid: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA(pdndevinst.toString(), pdeviceid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Locate_DevNode_ExW(pdndevinst: Long, pdeviceid: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW(pdndevinst.toString(), pdeviceid.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_MapCrToWin32Err(cmreturncode: CONFIGRET, defaulterr: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()) as Int).toUInt() else 0u

public actual fun CM_Merge_Range_List(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List(rlhold1.toString(), rlhold2.toString(), rlhnew.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Modify_Res_Des(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des(prdresdes.toString(), rdresdes.toString(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Modify_Res_Des_Ex(prdresdes: Long, rdresdes: ULong, resourceid: UInt, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex(prdresdes.toString(), rdresdes.toString(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Move_DevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Move_DevNode_Ex(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Next_Range(preelement: Long, pullstart: Long, pullend: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range(preelement.toString(), pullstart.toString(), pullend.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Open_Class_KeyA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA(classguid.toString(), pszclassname.toString(), samdesired.toInt(), disposition.toInt(), phkclass.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Open_Class_KeyW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW(classguid.toString(), pszclassname.toString(), samdesired.toInt(), disposition.toInt(), phkclass.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Open_Class_Key_ExA(classguid: Long, pszclassname: PCSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA(classguid.toString(), pszclassname.toString(), samdesired.toInt(), disposition.toInt(), phkclass.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Open_Class_Key_ExW(classguid: Long, pszclassname: PCWSTR, samdesired: UInt, disposition: UInt, phkclass: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW(classguid.toString(), pszclassname.toString(), samdesired.toInt(), disposition.toInt(), phkclass.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Open_DevNode_Key(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Open_DevNode_Key_Ex(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Open_Device_Interface_KeyA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA(pszdeviceinterface.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Open_Device_Interface_KeyW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW(pszdeviceinterface.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Open_Device_Interface_Key_ExA(pszdeviceinterface: PCSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA(pszdeviceinterface.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Open_Device_Interface_Key_ExW(pszdeviceinterface: PCWSTR, samdesired: UInt, disposition: UInt, phkdeviceinterface: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW(pszdeviceinterface.toString(), samdesired.toInt(), disposition.toInt(), phkdeviceinterface.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Query_And_Remove_SubTreeA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA(dnancestor.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Query_And_Remove_SubTreeW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW(dnancestor.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Query_And_Remove_SubTree_ExA(dnancestor: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA(dnancestor.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Query_And_Remove_SubTree_ExW(dnancestor: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW(dnancestor.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Query_Arbitrator_Free_Data(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data(pdata.toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Query_Arbitrator_Free_Data_Ex(pdata: Long, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex(pdata.toString(), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Query_Arbitrator_Free_Size(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size(pulsize.toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Query_Arbitrator_Free_Size_Ex(pulsize: Long, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex(pulsize.toString(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Query_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree(dnancestor.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Query_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Query_Resource_Conflict_List(pclconflictlist: Long, dndevinst: UInt, resourceid: CM_RESTYPE, resourcedata: Long, resourcelen: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List(pclconflictlist.toString(), dndevinst.toInt(), resourceid.toInt(), resourcedata.toString(), resourcelen.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Reenumerate_DevNode(dndevinst: UInt, ulflags: CM_REENUMERATE_FLAGS): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Reenumerate_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Register_Device_Driver(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Register_Device_Driver_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Register_Device_InterfaceA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA(dndevinst.toInt(), interfaceclassguid.toString(), pszreference.toString(), pszdeviceinterface.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Register_Device_InterfaceW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW(dndevinst.toInt(), interfaceclassguid.toString(), pszreference.toString(), pszdeviceinterface.toString(), pullength.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Register_Device_Interface_ExA(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCSTR, pszdeviceinterface: PSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA(dndevinst.toInt(), interfaceclassguid.toString(), pszreference.toString(), pszdeviceinterface.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Register_Device_Interface_ExW(dndevinst: UInt, interfaceclassguid: Long, pszreference: PCWSTR, pszdeviceinterface: PWSTR, pullength: Long, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW(dndevinst.toInt(), interfaceclassguid.toString(), pszreference.toString(), pszdeviceinterface.toString(), pullength.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Register_Notification(pfilter: Long, pcontext: Long, pcallback: PCM_NOTIFY_CALLBACK, pnotifycontext: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification(pfilter.toString(), pcontext.toString(), pcallback.toLong().toString(), pnotifycontext.toString()) as Int).toUInt() else 0u

public actual fun CM_Remove_SubTree(dnancestor: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree(dnancestor.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Remove_SubTree_Ex(dnancestor: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex(dnancestor.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Request_Device_EjectA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA(dndevinst.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Request_Device_EjectW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW(dndevinst.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Request_Device_Eject_ExA(dndevinst: UInt, pvetotype: Long, pszvetoname: PSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA(dndevinst.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Request_Device_Eject_ExW(dndevinst: UInt, pvetotype: Long, pszvetoname: PWSTR, ulnamelength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW(dndevinst.toInt(), pvetotype.toString(), pszvetoname.toString(), ulnamelength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Request_Eject_PC(): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC() as Int).toUInt() else 0u

public actual fun CM_Request_Eject_PC_Ex(hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex(hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Run_Detection(ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection(ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Run_Detection_Ex(ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex(ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_Class_PropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW(classguid.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_Class_Property_ExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW(classguid.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_Class_Registry_PropertyA(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA(classguid.toString(), ulproperty.toInt(), buffer.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_Class_Registry_PropertyW(classguid: Long, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW(classguid.toString(), ulproperty.toInt(), buffer.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Problem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Problem_Ex(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_PropertyW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW(dndevinst.toInt(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Property_ExW(dndevinst: UInt, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW(dndevinst.toInt(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Registry_PropertyA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA(dndevinst.toInt(), ulproperty.toInt(), buffer.toString(), ullength.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Registry_PropertyW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW(dndevinst.toInt(), ulproperty.toInt(), buffer.toString(), ullength.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Registry_Property_ExA(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA(dndevinst.toInt(), ulproperty.toInt(), buffer.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_DevNode_Registry_Property_ExW(dndevinst: UInt, ulproperty: UInt, buffer: Long, ullength: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW(dndevinst.toInt(), ulproperty.toInt(), buffer.toString(), ullength.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_Device_Interface_PropertyW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW(pszdeviceinterface.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_Device_Interface_Property_ExW(pszdeviceinterface: PCWSTR, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW(pszdeviceinterface.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_HW_Prof(ulhardwareprofile: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof(ulhardwareprofile.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_HW_Prof_Ex(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_HW_Prof_FlagsA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA(pdeviceid.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_HW_Prof_FlagsW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW(pdeviceid.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Set_HW_Prof_Flags_ExA(pdeviceid: PCSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA(pdeviceid.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Set_HW_Prof_Flags_ExW(pdeviceid: PCWSTR, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW(pdeviceid.toString(), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Setup_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Setup_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Test_Range_Available(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available(ullstartvalue.toString(), ullendvalue.toString(), rlh.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Uninstall_DevNode(dndevinst: UInt, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode(dndevinst.toInt(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Uninstall_DevNode_Ex(dndevinst: UInt, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex(dndevinst.toInt(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Unregister_Device_InterfaceA(pszdeviceinterface: PCSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA(pszdeviceinterface.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Unregister_Device_InterfaceW(pszdeviceinterface: PCWSTR, ulflags: UInt): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW(pszdeviceinterface.toString(), ulflags.toInt()) as Int).toUInt() else 0u

public actual fun CM_Unregister_Device_Interface_ExA(pszdeviceinterface: PCSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA(pszdeviceinterface.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Unregister_Device_Interface_ExW(pszdeviceinterface: PCWSTR, ulflags: UInt, hmachine: Long): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW(pszdeviceinterface.toString(), ulflags.toInt(), hmachine.toString()) as Int).toUInt() else 0u

public actual fun CM_Unregister_Notification(notifycontext: HCMNOTIFICATION): CONFIGRET =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification(notifycontext.toString()) as Int).toUInt() else 0u

public actual fun DiInstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, flags: DIINSTALLDEVICE_FLAGS, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice(hwndparent.toString(), deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiInstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA(hwndparent.toString(), infpath.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiInstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW(hwndparent.toString(), infpath.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiRollbackDriver(deviceinfoset: HDEVINFO, deviceinfodata: Long, hwndparent: HWND, flags: DIROLLBACKDRIVER_FLAGS, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver(deviceinfoset.toString(), deviceinfodata.toString(), hwndparent.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiShowUpdateDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice(hwndparent.toString(), deviceinfoset.toString(), deviceinfodata.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiShowUpdateDriver(hwndparent: HWND, filepath: PCWSTR, flags: UInt, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver(hwndparent.toString(), filepath.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiUninstallDevice(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice(hwndparent.toString(), deviceinfoset.toString(), deviceinfodata.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiUninstallDriverA(hwndparent: HWND, infpath: PCSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA(hwndparent.toString(), infpath.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun DiUninstallDriverW(hwndparent: HWND, infpath: PCWSTR, flags: DIUNINSTALLDRIVER_FLAGS, needreboot: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW(hwndparent.toString(), infpath.toString(), flags.toInt(), needreboot.toString()) as Int) else 0

public actual fun InstallHinfSectionA(window: HWND, modulehandle: HINSTANCE, commandline: PCSTR, showcommand: Int) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA(window.toString(), modulehandle.toString(), commandline.toString(), showcommand)
    }
}

public actual fun InstallHinfSectionW(window: HWND, modulehandle: HINSTANCE, commandline: PCWSTR, showcommand: Int) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW(window.toString(), modulehandle.toString(), commandline.toString(), showcommand)
    }
}

public actual fun SetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA(diskspace.toString(), infhandle.toString(), layoutinfhandle.toString(), sectionname.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW(diskspace.toString(), infhandle.toString(), layoutinfhandle.toString(), sectionname.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA(diskspace.toString(), infhandle.toString(), listinfhandle.toString(), sectionname.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW(diskspace.toString(), infhandle.toString(), listinfhandle.toString(), sectionname.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA(diskspace.toString(), targetfilespec.toString(), filesize.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, filesize: Long, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW(diskspace.toString(), targetfilespec.toString(), filesize.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAddToSourceListA(flags: UInt, source: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA(flags.toInt(), source.toString()) as Int) else 0

public actual fun SetupAddToSourceListW(flags: UInt, source: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW(flags.toInt(), source.toString()) as Int) else 0

public actual fun SetupAdjustDiskSpaceListA(diskspace: Long, driveroot: PCSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA(diskspace.toString(), driveroot.toString(), amount.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupAdjustDiskSpaceListW(diskspace: Long, driveroot: PCWSTR, amount: Long, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW(diskspace.toString(), driveroot.toString(), amount.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupBackupErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA(hwndparent.toString(), dialogtitle.toString(), sourcefile.toString(), targetfile.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else 0u

public actual fun SetupBackupErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW(hwndparent.toString(), dialogtitle.toString(), sourcefile.toString(), targetfile.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else 0u

public actual fun SetupCancelTemporarySourceList(): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList() as Int) else 0

public actual fun SetupCloseFileQueue(queuehandle: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue(queuehandle.toString()) as Int) else 0

public actual fun SetupCloseInfFile(infhandle: Long) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile(infhandle.toString())
    }
}

public actual fun SetupCloseLog() {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog()
    }
}

public actual fun SetupCommitFileQueueA(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA(owner.toString(), queuehandle.toString(), msghandler.toLong().toString(), context.toString()) as Int) else 0

public actual fun SetupCommitFileQueueW(owner: HWND, queuehandle: Long, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW(owner.toString(), queuehandle.toString(), msghandler.toLong().toString(), context.toString()) as Int) else 0

public actual fun SetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA(infhandle.toString(), sectionname.toString(), flags.toInt()) as Int) else 0

public actual fun SetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW(infhandle.toString(), sectionname.toString(), flags.toInt()) as Int) else 0

public actual fun SetupCopyErrorA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, sourcefile: PCSTR, targetpathfile: PCSTR, win32errorcode: UInt, style: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA(hwndparent.toString(), dialogtitle.toString(), diskname.toString(), pathtosource.toString(), sourcefile.toString(), targetpathfile.toString(), win32errorcode.toInt(), style.toInt(), pathbuffer.toString(), pathbuffersize.toInt(), pathrequiredsize.toString()) as Int).toUInt() else 0u

public actual fun SetupCopyErrorW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, sourcefile: PCWSTR, targetpathfile: PCWSTR, win32errorcode: UInt, style: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW(hwndparent.toString(), dialogtitle.toString(), diskname.toString(), pathtosource.toString(), sourcefile.toString(), targetpathfile.toString(), win32errorcode.toInt(), style.toInt(), pathbuffer.toString(), pathbuffersize.toInt(), pathrequiredsize.toString()) as Int).toUInt() else 0u

public actual fun SetupCopyOEMInfA(sourceinffilename: PCSTR, oemsourcemedialocation: PCSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA(sourceinffilename.toString(), oemsourcemedialocation.toString(), oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.toString(), destinationinffilenamesize.toInt(), requiredsize.toString(), destinationinffilenamecomponent.toString()) as Int) else 0

public actual fun SetupCopyOEMInfW(sourceinffilename: PCWSTR, oemsourcemedialocation: PCWSTR, oemsourcemediatype: OEM_SOURCE_MEDIA_TYPE, copystyle: SP_COPY_STYLE, destinationinffilename: PWSTR, destinationinffilenamesize: UInt, requiredsize: Long, destinationinffilenamecomponent: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW(sourceinffilename.toString(), oemsourcemedialocation.toString(), oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.toString(), destinationinffilenamesize.toInt(), requiredsize.toString(), destinationinffilenamecomponent.toString()) as Int) else 0

public actual fun SetupCreateDiskSpaceListA(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA(reserved1.toString(), reserved2.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupCreateDiskSpaceListW(reserved1: Long, reserved2: UInt, flags: UInt): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW(reserved1.toString(), reserved2.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupDecompressOrCopyFileA(sourcefilename: PCSTR, targetfilename: PCSTR, compressiontype: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA(sourcefilename.toString(), targetfilename.toString(), compressiontype.toString()) as Int).toUInt() else 0u

public actual fun SetupDecompressOrCopyFileW(sourcefilename: PCWSTR, targetfilename: PCWSTR, compressiontype: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW(sourcefilename.toString(), targetfilename.toString(), compressiontype.toString()) as Int).toUInt() else 0u

public actual fun SetupDefaultQueueCallbackA(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA(context.toString(), notification.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun SetupDefaultQueueCallbackW(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW(context.toString(), notification.toInt(), param1.toString(), param2.toString()) as Int).toUInt() else 0u

public actual fun SetupDeleteErrorA(hwndparent: HWND, dialogtitle: PCSTR, file: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA(hwndparent.toString(), dialogtitle.toString(), file.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else 0u

public actual fun SetupDeleteErrorW(hwndparent: HWND, dialogtitle: PCWSTR, file: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW(hwndparent.toString(), dialogtitle.toString(), file.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else 0u

public actual fun SetupDestroyDiskSpaceList(diskspace: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList(diskspace.toString()) as Int) else 0

public actual fun SetupDiAskForOEMDisk(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiBuildClassInfoList(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList(flags.toInt(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiBuildClassInfoListExA(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA(flags.toInt(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiBuildClassInfoListExW(flags: UInt, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW(flags.toInt(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiBuildDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList(deviceinfoset.toString(), deviceinfodata.toString(), drivertype.toInt()) as Int) else 0

public actual fun SetupDiCallClassInstaller(installfunction: DI_FUNCTION, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller(installfunction.toInt(), deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiCancelDriverInfoSearch(deviceinfoset: HDEVINFO): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch(deviceinfoset.toString()) as Int) else 0

public actual fun SetupDiChangeState(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiClassGuidsFromNameA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA(classname.toString(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiClassGuidsFromNameExA(classname: PCSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA(classname.toString(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiClassGuidsFromNameExW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW(classname.toString(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiClassGuidsFromNameW(classname: PCWSTR, classguidlist: Long, classguidlistsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW(classname.toString(), classguidlist.toString(), classguidlistsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiClassNameFromGuidA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA(classguid.toString(), classname.toString(), classnamesize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiClassNameFromGuidExA(classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA(classguid.toString(), classname.toString(), classnamesize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiClassNameFromGuidExW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW(classguid.toString(), classname.toString(), classnamesize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiClassNameFromGuidW(classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW(classguid.toString(), classname.toString(), classnamesize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiCreateDevRegKeyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA(deviceinfoset.toString(), deviceinfodata.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.toString(), infsectionname.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDevRegKeyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW(deviceinfoset.toString(), deviceinfodata.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.toString(), infsectionname.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDeviceInfoA(deviceinfoset: HDEVINFO, devicename: PCSTR, classguid: Long, devicedescription: PCSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA(deviceinfoset.toString(), devicename.toString(), classguid.toString(), devicedescription.toString(), hwndparent.toString(), creationflags.toInt(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiCreateDeviceInfoList(classguid: Long, hwndparent: HWND): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList(classguid.toString(), hwndparent.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: HWND, machinename: PCSTR, reserved: Long): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA(classguid.toString(), hwndparent.toString(), machinename.toString(), reserved.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: HWND, machinename: PCWSTR, reserved: Long): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW(classguid.toString(), hwndparent.toString(), machinename.toString(), reserved.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDeviceInfoW(deviceinfoset: HDEVINFO, devicename: PCWSTR, classguid: Long, devicedescription: PCWSTR, hwndparent: HWND, creationflags: SETUP_DI_DEVICE_CREATION_FLAGS, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW(deviceinfoset.toString(), devicename.toString(), classguid.toString(), devicedescription.toString(), hwndparent.toString(), creationflags.toInt(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiCreateDeviceInterfaceA(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA(deviceinfoset.toString(), deviceinfodata.toString(), interfaceclassguid.toString(), referencestring.toString(), creationflags.toInt(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCSTR): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset.toString(), deviceinterfacedata.toString(), reserved.toInt(), samdesired.toInt(), infhandle.toString(), infsectionname.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt, infhandle: Long, infsectionname: PCWSTR): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset.toString(), deviceinterfacedata.toString(), reserved.toInt(), samdesired.toInt(), infhandle.toString(), infsectionname.toString()) as String).toLong() else 0L

public actual fun SetupDiCreateDeviceInterfaceW(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, referencestring: PCWSTR, creationflags: UInt, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW(deviceinfoset.toString(), deviceinfodata.toString(), interfaceclassguid.toString(), referencestring.toString(), creationflags.toInt(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiDeleteDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey(deviceinfoset.toString(), deviceinfodata.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt()) as Int) else 0

public actual fun SetupDiDeleteDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiDeleteDeviceInterfaceData(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData(deviceinfoset.toString(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey(deviceinfoset.toString(), deviceinterfacedata.toString(), reserved.toInt()) as Int) else 0

public actual fun SetupDiDestroyClassImageList(classimagelistdata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList(classimagelistdata.toString()) as Int) else 0

public actual fun SetupDiDestroyDeviceInfoList(deviceinfoset: HDEVINFO): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList(deviceinfoset.toString()) as Int) else 0

public actual fun SetupDiDestroyDriverInfoList(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList(deviceinfoset.toString(), deviceinfodata.toString(), drivertype.toInt()) as Int) else 0

public actual fun SetupDiDrawMiniIcon(hdc: HDC, rc: RECT, miniiconindex: Int, flags: UInt): Int =
    0

public actual fun SetupDiEnumDeviceInfo(deviceinfoset: HDEVINFO, memberindex: UInt, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo(deviceinfoset.toString(), memberindex.toInt(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiEnumDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long, interfaceclassguid: Long, memberindex: UInt, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces(deviceinfoset.toString(), deviceinfodata.toString(), interfaceclassguid.toString(), memberindex.toInt(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiEnumDriverInfoA(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA(deviceinfoset.toString(), deviceinfodata.toString(), drivertype.toInt(), memberindex.toInt(), driverinfodata.toString()) as Int) else 0

public actual fun SetupDiEnumDriverInfoW(deviceinfoset: HDEVINFO, deviceinfodata: Long, drivertype: SETUP_DI_DRIVER_TYPE, memberindex: UInt, driverinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW(deviceinfoset.toString(), deviceinfodata.toString(), drivertype.toInt(), memberindex.toInt(), driverinfodata.toString()) as Int) else 0

public actual fun SetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA(context.toString(), alternateplatforminfo.toString(), infsectionwithext.toString(), infsectionwithextsize.toInt(), requiredsize.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW(context.toString(), alternateplatforminfo.toString(), infsectionwithext.toString(), infsectionwithextsize.toInt(), requiredsize.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: PCSTR, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA(infhandle.toString(), infsectionname.toString(), infsectionwithext.toString(), infsectionwithextsize.toInt(), requiredsize.toString(), extension.toString()) as Int) else 0

public actual fun SetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: PCSTR, alternateplatforminfo: Long, infsectionwithext: PSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA(infhandle.toString(), infsectionname.toString(), alternateplatforminfo.toString(), infsectionwithext.toString(), infsectionwithextsize.toInt(), requiredsize.toString(), extension.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: PCWSTR, alternateplatforminfo: Long, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW(infhandle.toString(), infsectionname.toString(), alternateplatforminfo.toString(), infsectionwithext.toString(), infsectionwithextsize.toInt(), requiredsize.toString(), extension.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: PCWSTR, infsectionwithext: PWSTR, infsectionwithextsize: UInt, requiredsize: Long, extension: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW(infhandle.toString(), infsectionname.toString(), infsectionwithext.toString(), infsectionwithextsize.toInt(), requiredsize.toString(), extension.toString()) as Int) else 0

public actual fun SetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex(classguid.toString(), miniiconindex.toString()) as Int) else 0

public actual fun SetupDiGetClassDescriptionA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA(classguid.toString(), classdescription.toString(), classdescriptionsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetClassDescriptionExA(classguid: Long, classdescription: PSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA(classguid.toString(), classdescription.toString(), classdescriptionsize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassDescriptionExW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW(classguid.toString(), classdescription.toString(), classdescriptionsize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassDescriptionW(classguid: Long, classdescription: PWSTR, classdescriptionsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW(classguid.toString(), classdescription.toString(), classdescriptionsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetClassDevPropertySheetsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA(deviceinfoset.toString(), deviceinfodata.toString(), propertysheetheader.toString(), propertysheetheaderpagelistsize.toInt(), requiredsize.toString(), propertysheettype.toInt()) as Int) else 0

public actual fun SetupDiGetClassDevPropertySheetsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: UInt, requiredsize: Long, propertysheettype: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW(deviceinfoset.toString(), deviceinfodata.toString(), propertysheetheader.toString(), propertysheetheaderpagelistsize.toInt(), requiredsize.toString(), propertysheettype.toInt()) as Int) else 0

public actual fun SetupDiGetClassDevsA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA(classguid.toString(), enumerator.toString(), hwndparent.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupDiGetClassDevsExA(classguid: Long, enumerator: PCSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCSTR, reserved: Long): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA(classguid.toString(), enumerator.toString(), hwndparent.toString(), flags.toInt(), deviceinfoset.toString(), machinename.toString(), reserved.toString()) as String).toLong() else 0L

public actual fun SetupDiGetClassDevsExW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS, deviceinfoset: HDEVINFO, machinename: PCWSTR, reserved: Long): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW(classguid.toString(), enumerator.toString(), hwndparent.toString(), flags.toInt(), deviceinfoset.toString(), machinename.toString(), reserved.toString()) as String).toLong() else 0L

public actual fun SetupDiGetClassDevsW(classguid: Long, enumerator: PCWSTR, hwndparent: HWND, flags: SETUP_DI_GET_CLASS_DEVS_FLAGS): HDEVINFO =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW(classguid.toString(), enumerator.toString(), hwndparent.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex(classimagelistdata.toString(), classguid.toString(), imageindex.toString()) as Int) else 0

public actual fun SetupDiGetClassImageList(classimagelistdata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList(classimagelistdata.toString()) as Int) else 0

public actual fun SetupDiGetClassImageListExA(classimagelistdata: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA(classimagelistdata.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassImageListExW(classimagelistdata: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW(classimagelistdata.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA(deviceinfoset.toString(), deviceinfodata.toString(), classinstallparams.toString(), classinstallparamssize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW(deviceinfoset.toString(), deviceinfodata.toString(), classinstallparams.toString(), classinstallparamssize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW(classguid.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString(), flags.toInt(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys(classguid.toString(), propertykeyarray.toString(), propertykeycount.toInt(), requiredpropertykeycount.toString(), flags.toInt()) as Int) else 0

public actual fun SetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW(classguid.toString(), propertykeyarray.toString(), propertykeycount.toInt(), requiredpropertykeycount.toString(), flags.toInt(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW(classguid.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString(), flags.toInt()) as Int) else 0

public actual fun SetupDiGetClassRegistryPropertyA(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA(classguid.toString(), property.toInt(), propertyregdatatype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetClassRegistryPropertyW(classguid: Long, property: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW(classguid.toString(), property.toInt(), propertyregdatatype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetCustomDevicePropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA(deviceinfoset.toString(), deviceinfodata.toString(), custompropertyname.toString(), flags.toInt(), propertyregdatatype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetCustomDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, custompropertyname: PCWSTR, flags: UInt, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW(deviceinfoset.toString(), deviceinfodata.toString(), custompropertyname.toString(), flags.toInt(), propertyregdatatype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInfoListClass(deviceinfoset: HDEVINFO, classguid: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass(deviceinfoset.toString(), classguid.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInfoListDetailA(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA(deviceinfoset.toString(), deviceinfosetdetaildata.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInfoListDetailW(deviceinfoset: HDEVINFO, deviceinfosetdetaildata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW(deviceinfoset.toString(), deviceinfosetdetaildata.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA(deviceinfoset.toString(), deviceinfodata.toString(), deviceinstallparams.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW(deviceinfoset.toString(), deviceinfodata.toString(), deviceinstallparams.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInstanceIdA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA(deviceinfoset.toString(), deviceinfodata.toString(), deviceinstanceid.toString(), deviceinstanceidsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInstanceIdW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstanceid: PWSTR, deviceinstanceidsize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW(deviceinfoset.toString(), deviceinfodata.toString(), deviceinstanceid.toString(), deviceinstanceidsize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInterfaceAlias(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias(deviceinfoset.toString(), deviceinterfacedata.toString(), aliasinterfaceclassguid.toString(), aliasdeviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInterfaceDetailA(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA(deviceinfoset.toString(), deviceinterfacedata.toString(), deviceinterfacedetaildata.toString(), deviceinterfacedetaildatasize.toInt(), requiredsize.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInterfaceDetailW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: UInt, requiredsize: Long, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW(deviceinfoset.toString(), deviceinterfacedata.toString(), deviceinterfacedetaildata.toString(), deviceinterfacedetaildatasize.toInt(), requiredsize.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys(deviceinfoset.toString(), deviceinterfacedata.toString(), propertykeyarray.toString(), propertykeycount.toInt(), requiredpropertykeycount.toString(), flags.toInt()) as Int) else 0

public actual fun SetupDiGetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW(deviceinfoset.toString(), deviceinterfacedata.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString(), flags.toInt()) as Int) else 0

public actual fun SetupDiGetDevicePropertyKeys(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: UInt, requiredpropertykeycount: Long, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys(deviceinfoset.toString(), deviceinfodata.toString(), propertykeyarray.toString(), propertykeycount.toInt(), requiredpropertykeycount.toString(), flags.toInt()) as Int) else 0

public actual fun SetupDiGetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW(deviceinfoset.toString(), deviceinfodata.toString(), propertykey.toString(), propertytype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString(), flags.toInt()) as Int) else 0

public actual fun SetupDiGetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA(deviceinfoset.toString(), deviceinfodata.toString(), property.toInt(), propertyregdatatype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW(deviceinfoset.toString(), deviceinfodata.toString(), property.toInt(), propertyregdatatype.toString(), propertybuffer.toString(), propertybuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDriverInfoDetailA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), driverinfodetaildata.toString(), driverinfodetaildatasize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDriverInfoDetailW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), driverinfodetaildata.toString(), driverinfodetaildatasize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), driverinstallparams.toString()) as Int) else 0

public actual fun SetupDiGetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), driverinstallparams.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), friendlyname.toString(), friendlynamesize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: PSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), friendlyname.toString(), friendlynamesize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), friendlyname.toString(), friendlynamesize.toInt(), requiredsize.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: PWSTR, friendlynamesize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), friendlyname.toString(), friendlynamesize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList(hwprofilelist.toString(), hwprofilelistsize.toInt(), requiredsize.toString(), currentlyactiveindex.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA(hwprofilelist.toString(), hwprofilelistsize.toInt(), requiredsize.toString(), currentlyactiveindex.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: UInt, requiredsize: Long, currentlyactiveindex: Long, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW(hwprofilelist.toString(), hwprofilelistsize.toInt(), requiredsize.toString(), currentlyactiveindex.toString(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiGetINFClassA(infname: PCSTR, classguid: Long, classname: PSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA(infname.toString(), classguid.toString(), classname.toString(), classnamesize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetINFClassW(infname: PCWSTR, classguid: Long, classname: PWSTR, classnamesize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW(infname.toString(), classguid.toString(), classname.toString(), classnamesize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupDiGetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiGetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString()) as Int) else 0

public actual fun SetupDiGetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString()) as Int) else 0

public actual fun SetupDiGetWizardPage(deviceinfoset: HDEVINFO, deviceinfodata: Long, installwizarddata: Long, pagetype: UInt, flags: UInt): HPROPSHEETPAGE =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage(deviceinfoset.toString(), deviceinfodata.toString(), installwizarddata.toString(), pagetype.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupDiInstallClassA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA(hwndparent.toString(), inffilename.toString(), flags.toInt(), filequeue.toString()) as Int) else 0

public actual fun SetupDiInstallClassExA(hwndparent: HWND, inffilename: PCSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA(hwndparent.toString(), inffilename.toString(), flags.toInt(), filequeue.toString(), interfaceclassguid.toString(), reserved1.toString(), reserved2.toString()) as Int) else 0

public actual fun SetupDiInstallClassExW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW(hwndparent.toString(), inffilename.toString(), flags.toInt(), filequeue.toString(), interfaceclassguid.toString(), reserved1.toString(), reserved2.toString()) as Int) else 0

public actual fun SetupDiInstallClassW(hwndparent: HWND, inffilename: PCWSTR, flags: UInt, filequeue: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW(hwndparent.toString(), inffilename.toString(), flags.toInt(), filequeue.toString()) as Int) else 0

public actual fun SetupDiInstallDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiInstallDeviceInterfaces(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiInstallDriverFiles(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon(classguid.toString(), largeicon.toString(), miniiconindex.toString()) as Int) else 0

public actual fun SetupDiLoadDeviceIcon(deviceinfoset: HDEVINFO, deviceinfodata: Long, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon(deviceinfoset.toString(), deviceinfodata.toString(), cxicon.toInt(), cyicon.toInt(), flags.toInt(), hicon.toString()) as Int) else 0

public actual fun SetupDiOpenClassRegKey(classguid: Long, samdesired: UInt): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey(classguid.toString(), samdesired.toInt()) as String).toLong() else 0L

public actual fun SetupDiOpenClassRegKeyExA(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCSTR, reserved: Long): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA(classguid.toString(), samdesired.toInt(), flags.toInt(), machinename.toString(), reserved.toString()) as String).toLong() else 0L

public actual fun SetupDiOpenClassRegKeyExW(classguid: Long, samdesired: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW(classguid.toString(), samdesired.toInt(), flags.toInt(), machinename.toString(), reserved.toString()) as String).toLong() else 0L

public actual fun SetupDiOpenDevRegKey(deviceinfoset: HDEVINFO, deviceinfodata: Long, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey(deviceinfoset.toString(), deviceinfodata.toString(), scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt()) as String).toLong() else 0L

public actual fun SetupDiOpenDeviceInfoA(deviceinfoset: HDEVINFO, deviceinstanceid: PCSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA(deviceinfoset.toString(), deviceinstanceid.toString(), hwndparent.toString(), openflags.toInt(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiOpenDeviceInfoW(deviceinfoset: HDEVINFO, deviceinstanceid: PCWSTR, hwndparent: HWND, openflags: UInt, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW(deviceinfoset.toString(), deviceinstanceid.toString(), hwndparent.toString(), openflags.toInt(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiOpenDeviceInterfaceA(deviceinfoset: HDEVINFO, devicepath: PCSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA(deviceinfoset.toString(), devicepath.toString(), openflags.toInt(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiOpenDeviceInterfaceRegKey(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, reserved: UInt, samdesired: UInt): HKEY =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey(deviceinfoset.toString(), deviceinterfacedata.toString(), reserved.toInt(), samdesired.toInt()) as String).toLong() else 0L

public actual fun SetupDiOpenDeviceInterfaceW(deviceinfoset: HDEVINFO, devicepath: PCWSTR, openflags: UInt, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW(deviceinfoset.toString(), devicepath.toString(), openflags.toInt(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiRegisterCoDeviceInstallers(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiRegisterDeviceInfo(deviceinfoset: HDEVINFO, deviceinfodata: Long, flags: UInt, compareproc: PSP_DETSIG_CMPPROC, comparecontext: Long, dupdeviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo(deviceinfoset.toString(), deviceinfodata.toString(), flags.toInt(), compareproc.toLong().toString(), comparecontext.toString(), dupdeviceinfodata.toString()) as Int) else 0

public actual fun SetupDiRemoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiRemoveDeviceInterface(deviceinfoset: HDEVINFO, deviceinterfacedata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface(deviceinfoset.toString(), deviceinterfacedata.toString()) as Int) else 0

public actual fun SetupDiRestartDevices(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiSelectBestCompatDrv(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiSelectDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiSelectOEMDrv(hwndparent: HWND, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv(hwndparent.toString(), deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiSetClassInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA(deviceinfoset.toString(), deviceinfodata.toString(), classinstallparams.toString(), classinstallparamssize.toInt()) as Int) else 0

public actual fun SetupDiSetClassInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW(deviceinfoset.toString(), deviceinfodata.toString(), classinstallparams.toString(), classinstallparamssize.toInt()) as Int) else 0

public actual fun SetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW(classguid.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), flags.toInt(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW(classguid.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else 0

public actual fun SetupDiSetClassRegistryPropertyA(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA(classguid.toString(), property.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiSetClassRegistryPropertyW(classguid: Long, property: UInt, propertybuffer: Long, propertybuffersize: UInt, machinename: PCWSTR, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW(classguid.toString(), property.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), machinename.toString(), reserved.toString()) as Int) else 0

public actual fun SetupDiSetDeviceInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA(deviceinfoset.toString(), deviceinfodata.toString(), deviceinstallparams.toString()) as Int) else 0

public actual fun SetupDiSetDeviceInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, deviceinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW(deviceinfoset.toString(), deviceinfodata.toString(), deviceinstallparams.toString()) as Int) else 0

public actual fun SetupDiSetDeviceInterfaceDefault(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, flags: UInt, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault(deviceinfoset.toString(), deviceinterfacedata.toString(), flags.toInt(), reserved.toString()) as Int) else 0

public actual fun SetupDiSetDeviceInterfacePropertyW(deviceinfoset: HDEVINFO, deviceinterfacedata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW(deviceinfoset.toString(), deviceinterfacedata.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else 0

public actual fun SetupDiSetDevicePropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, propertykey: Long, propertytype: DEVPROPTYPE, propertybuffer: Long, propertybuffersize: UInt, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW(deviceinfoset.toString(), deviceinfodata.toString(), propertykey.toString(), propertytype.toInt(), propertybuffer.toString(), propertybuffersize.toInt(), flags.toInt()) as Int) else 0

public actual fun SetupDiSetDeviceRegistryPropertyA(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA(deviceinfoset.toString(), deviceinfodata.toString(), property.toInt(), propertybuffer.toString(), propertybuffersize.toInt()) as Int) else 0

public actual fun SetupDiSetDeviceRegistryPropertyW(deviceinfoset: HDEVINFO, deviceinfodata: Long, property: SETUP_DI_REGISTRY_PROPERTY, propertybuffer: Long, propertybuffersize: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW(deviceinfoset.toString(), deviceinfodata.toString(), property.toInt(), propertybuffer.toString(), propertybuffersize.toInt()) as Int) else 0

public actual fun SetupDiSetDriverInstallParamsA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), driverinstallparams.toString()) as Int) else 0

public actual fun SetupDiSetDriverInstallParamsW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString(), driverinstallparams.toString()) as Int) else 0

public actual fun SetupDiSetSelectedDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDiSetSelectedDriverA(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString()) as Int) else 0

public actual fun SetupDiSetSelectedDriverW(deviceinfoset: HDEVINFO, deviceinfodata: Long, driverinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW(deviceinfoset.toString(), deviceinfodata.toString(), driverinfodata.toString()) as Int) else 0

public actual fun SetupDiUnremoveDevice(deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice(deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA(diskspace.toString(), reserved1.toString(), reserved2.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: UInt, flags: UInt): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW(diskspace.toString(), reserved1.toString(), reserved2.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupEnumInfSectionsA(infhandle: Long, index: UInt, buffer: PSTR, size: UInt, sizeneeded: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA(infhandle.toString(), index.toInt(), buffer.toString(), size.toInt(), sizeneeded.toString()) as Int) else 0

public actual fun SetupEnumInfSectionsW(infhandle: Long, index: UInt, buffer: PWSTR, size: UInt, sizeneeded: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW(infhandle.toString(), index.toInt(), buffer.toString(), size.toInt(), sizeneeded.toString()) as Int) else 0

public actual fun SetupFindFirstLineA(infhandle: Long, section: PCSTR, key: PCSTR, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA(infhandle.toString(), section.toString(), key.toString(), context.toString()) as Int) else 0

public actual fun SetupFindFirstLineW(infhandle: Long, section: PCWSTR, key: PCWSTR, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW(infhandle.toString(), section.toString(), key.toString(), context.toString()) as Int) else 0

public actual fun SetupFindNextLine(contextin: Long, contextout: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine(contextin.toString(), contextout.toString()) as Int) else 0

public actual fun SetupFindNextMatchLineA(contextin: Long, key: PCSTR, contextout: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA(contextin.toString(), key.toString(), contextout.toString()) as Int) else 0

public actual fun SetupFindNextMatchLineW(contextin: Long, key: PCWSTR, contextout: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW(contextin.toString(), key.toString(), contextout.toString()) as Int) else 0

public actual fun SetupFreeSourceListA(list: Long, count: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA(list.toString(), count.toInt()) as Int) else 0

public actual fun SetupFreeSourceListW(list: Long, count: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW(list.toString(), count.toInt()) as Int) else 0

public actual fun SetupGetBackupInformationA(queuehandle: Long, backupparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA(queuehandle.toString(), backupparams.toString()) as Int) else 0

public actual fun SetupGetBackupInformationW(queuehandle: Long, backupparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW(queuehandle.toString(), backupparams.toString()) as Int) else 0

public actual fun SetupGetBinaryField(context: Long, fieldindex: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField(context.toString(), fieldindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetFieldCount(context: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount(context.toString()) as Int).toUInt() else 0u

public actual fun SetupGetFileCompressionInfoA(sourcefilename: PCSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA(sourcefilename.toString(), actualsourcefilename.toString(), sourcefilesize.toString(), targetfilesize.toString(), compressiontype.toString()) as Int).toUInt() else 0u

public actual fun SetupGetFileCompressionInfoExA(sourcefilename: PCSTR, actualsourcefilenamebuffer: PCSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA(sourcefilename.toString(), actualsourcefilenamebuffer.toString(), actualsourcefilenamebufferlen.toInt(), requiredbufferlen.toString(), sourcefilesize.toString(), targetfilesize.toString(), compressiontype.toString()) as Int) else 0

public actual fun SetupGetFileCompressionInfoExW(sourcefilename: PCWSTR, actualsourcefilenamebuffer: PCWSTR, actualsourcefilenamebufferlen: UInt, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW(sourcefilename.toString(), actualsourcefilenamebuffer.toString(), actualsourcefilenamebufferlen.toInt(), requiredbufferlen.toString(), sourcefilesize.toString(), targetfilesize.toString(), compressiontype.toString()) as Int) else 0

public actual fun SetupGetFileCompressionInfoW(sourcefilename: PCWSTR, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW(sourcefilename.toString(), actualsourcefilename.toString(), sourcefilesize.toString(), targetfilesize.toString(), compressiontype.toString()) as Int).toUInt() else 0u

public actual fun SetupGetFileQueueCount(filequeue: Long, subqueuefileop: UInt, numoperations: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount(filequeue.toString(), subqueuefileop.toInt(), numoperations.toString()) as Int) else 0

public actual fun SetupGetFileQueueFlags(filequeue: Long, flags: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags(filequeue.toString(), flags.toString()) as Int) else 0

public actual fun SetupGetInfDriverStoreLocationA(filename: PCSTR, alternateplatforminfo: Long, localename: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA(filename.toString(), alternateplatforminfo.toString(), localename.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfDriverStoreLocationW(filename: PCWSTR, alternateplatforminfo: Long, localename: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW(filename.toString(), alternateplatforminfo.toString(), localename.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfFileListA(directorypath: PCSTR, infstyle: INF_STYLE, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA(directorypath.toString(), infstyle.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfFileListW(directorypath: PCWSTR, infstyle: INF_STYLE, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW(directorypath.toString(), infstyle.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfInformationA(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA(infspec.toString(), searchcontrol.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfInformationW(infspec: Long, searchcontrol: UInt, returnbuffer: Long, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW(infspec.toString(), searchcontrol.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfPublishedNameA(driverstorelocation: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA(driverstorelocation.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetInfPublishedNameW(driverstorelocation: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW(driverstorelocation.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetIntField(context: Long, fieldindex: UInt, integervalue: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField(context.toString(), fieldindex.toInt(), integervalue.toString()) as Int) else 0

public actual fun SetupGetLineByIndexA(infhandle: Long, section: PCSTR, index: UInt, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA(infhandle.toString(), section.toString(), index.toInt(), context.toString()) as Int) else 0

public actual fun SetupGetLineByIndexW(infhandle: Long, section: PCWSTR, index: UInt, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW(infhandle.toString(), section.toString(), index.toInt(), context.toString()) as Int) else 0

public actual fun SetupGetLineCountA(infhandle: Long, section: PCSTR): Int =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA(infhandle.toString(), section.toString()) as Int) else 0

public actual fun SetupGetLineCountW(infhandle: Long, section: PCWSTR): Int =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW(infhandle.toString(), section.toString()) as Int) else 0

public actual fun SetupGetLineTextA(context: Long, infhandle: Long, section: PCSTR, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA(context.toString(), infhandle.toString(), section.toString(), key.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetLineTextW(context: Long, infhandle: Long, section: PCWSTR, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW(context.toString(), infhandle.toString(), section.toString(), key.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetMultiSzFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA(context.toString(), fieldindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetMultiSzFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW(context.toString(), fieldindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetNonInteractiveMode(): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode() as Int) else 0

public actual fun SetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: PCSTR, sourceid: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA(infhandle.toString(), infcontext.toString(), filename.toString(), sourceid.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: PCWSTR, sourceid: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW(infhandle.toString(), infcontext.toString(), filename.toString(), sourceid.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: PCSTR, section: PCSTR, filesize: Long, roundingfactor: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA(infhandle.toString(), infcontext.toString(), filename.toString(), section.toString(), filesize.toString(), roundingfactor.toInt()) as Int) else 0

public actual fun SetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: PCWSTR, section: PCWSTR, filesize: Long, roundingfactor: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW(infhandle.toString(), infcontext.toString(), filename.toString(), section.toString(), filesize.toString(), roundingfactor.toInt()) as Int) else 0

public actual fun SetupGetSourceInfoA(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA(infhandle.toString(), sourceid.toInt(), infodesired.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetSourceInfoW(infhandle: Long, sourceid: UInt, infodesired: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW(infhandle.toString(), sourceid.toInt(), infodesired.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetStringFieldA(context: Long, fieldindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA(context.toString(), fieldindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetStringFieldW(context: Long, fieldindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW(context.toString(), fieldindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetTargetPathA(infhandle: Long, infcontext: Long, section: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA(infhandle.toString(), infcontext.toString(), section.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetTargetPathW(infhandle: Long, infcontext: Long, section: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW(infhandle.toString(), infcontext.toString(), section.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupGetThreadLogToken(): ULong =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken() as String).toULong() else 0uL

public actual fun SetupInitDefaultQueueCallback(ownerwindow: HWND): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback(ownerwindow.toString()) as String).toLong() else 0L

public actual fun SetupInitDefaultQueueCallbackEx(ownerwindow: HWND, alternateprogresswindow: HWND, progressmessage: UInt, reserved1: UInt, reserved2: Long): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx(ownerwindow.toString(), alternateprogresswindow.toString(), progressmessage.toInt(), reserved1.toInt(), reserved2.toString()) as String).toLong() else 0L

public actual fun SetupInitializeFileLogA(logfilename: PCSTR, flags: UInt): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA(logfilename.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupInitializeFileLogW(logfilename: PCWSTR, flags: UInt): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW(logfilename.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun SetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA(infhandle.toString(), infcontext.toString(), sourcefile.toString(), sourcepathroot.toString(), destinationname.toString(), copystyle.toInt(), copymsghandler.toLong().toString(), context.toString()) as Int) else 0

public actual fun SetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: PCSTR, sourcepathroot: PCSTR, destinationname: PCSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_A, context: Long, filewasinuse: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA(infhandle.toString(), infcontext.toString(), sourcefile.toString(), sourcepathroot.toString(), destinationname.toString(), copystyle.toInt(), copymsghandler.toLong().toString(), context.toString(), filewasinuse.toString()) as Int) else 0

public actual fun SetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long, filewasinuse: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW(infhandle.toString(), infcontext.toString(), sourcefile.toString(), sourcepathroot.toString(), destinationname.toString(), copystyle.toInt(), copymsghandler.toLong().toString(), context.toString(), filewasinuse.toString()) as Int) else 0

public actual fun SetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: PCWSTR, sourcepathroot: PCWSTR, destinationname: PCWSTR, copystyle: SP_COPY_STYLE, copymsghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW(infhandle.toString(), infcontext.toString(), sourcefile.toString(), sourcepathroot.toString(), destinationname.toString(), copystyle.toInt(), copymsghandler.toLong().toString(), context.toString()) as Int) else 0

public actual fun SetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCSTR, sourcerootpath: PCSTR, copyflags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA(infhandle.toString(), layoutinfhandle.toString(), filequeue.toString(), sectionname.toString(), sourcerootpath.toString(), copyflags.toInt()) as Int) else 0

public actual fun SetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: PCWSTR, sourcerootpath: PCWSTR, copyflags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW(infhandle.toString(), layoutinfhandle.toString(), filequeue.toString(), sectionname.toString(), sourcerootpath.toString(), copyflags.toInt()) as Int) else 0

public actual fun SetupInstallFromInfSectionA(owner: HWND, infhandle: Long, sectionname: PCSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA(owner.toString(), infhandle.toString(), sectionname.toString(), flags.toInt(), relativekeyroot.toString(), sourcerootpath.toString(), copyflags.toInt(), msghandler.toLong().toString(), context.toString(), deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupInstallFromInfSectionW(owner: HWND, infhandle: Long, sectionname: PCWSTR, flags: UInt, relativekeyroot: HKEY, sourcerootpath: PCWSTR, copyflags: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long, deviceinfoset: HDEVINFO, deviceinfodata: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW(owner.toString(), infhandle.toString(), sectionname.toString(), flags.toInt(), relativekeyroot.toString(), sourcerootpath.toString(), copyflags.toInt(), msghandler.toLong().toString(), context.toString(), deviceinfoset.toString(), deviceinfodata.toString()) as Int) else 0

public actual fun SetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA(infhandle.toString(), sectionname.toString(), flags.toInt()) as Int) else 0

public actual fun SetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: PCSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA(infhandle.toString(), sectionname.toString(), flags.toInt(), deviceinfoset.toString(), deviceinfodata.toString(), reserved1.toString(), reserved2.toString()) as Int) else 0

public actual fun SetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS, deviceinfoset: HDEVINFO, deviceinfodata: Long, reserved1: Long, reserved2: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW(infhandle.toString(), sectionname.toString(), flags.toInt(), deviceinfoset.toString(), deviceinfodata.toString(), reserved1.toString(), reserved2.toString()) as Int) else 0

public actual fun SetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: PCWSTR, flags: SPSVCINST_FLAGS): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW(infhandle.toString(), sectionname.toString(), flags.toInt()) as Int) else 0

public actual fun SetupIterateCabinetA(cabinetfile: PCSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_A, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA(cabinetfile.toString(), reserved.toInt(), msghandler.toLong().toString(), context.toString()) as Int) else 0

public actual fun SetupIterateCabinetW(cabinetfile: PCWSTR, reserved: UInt, msghandler: PSP_FILE_CALLBACK_W, context: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW(cabinetfile.toString(), reserved.toInt(), msghandler.toLong().toString(), context.toString()) as Int) else 0

public actual fun SetupLogErrorA(messagestring: PCSTR, severity: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA(messagestring.toString(), severity.toInt()) as Int) else 0

public actual fun SetupLogErrorW(messagestring: PCWSTR, severity: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW(messagestring.toString(), severity.toInt()) as Int) else 0

public actual fun SetupLogFileA(fileloghandle: Long, logsectionname: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, checksum: UInt, disktagfile: PCSTR, diskdescription: PCSTR, otherinfo: PCSTR, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA(fileloghandle.toString(), logsectionname.toString(), sourcefilename.toString(), targetfilename.toString(), checksum.toInt(), disktagfile.toString(), diskdescription.toString(), otherinfo.toString(), flags.toInt()) as Int) else 0

public actual fun SetupLogFileW(fileloghandle: Long, logsectionname: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, checksum: UInt, disktagfile: PCWSTR, diskdescription: PCWSTR, otherinfo: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW(fileloghandle.toString(), logsectionname.toString(), sourcefilename.toString(), targetfilename.toString(), checksum.toInt(), disktagfile.toString(), diskdescription.toString(), otherinfo.toString(), flags.toInt()) as Int) else 0

public actual fun SetupOpenAppendInfFileA(filename: PCSTR, infhandle: Long, errorline: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA(filename.toString(), infhandle.toString(), errorline.toString()) as Int) else 0

public actual fun SetupOpenAppendInfFileW(filename: PCWSTR, infhandle: Long, errorline: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW(filename.toString(), infhandle.toString(), errorline.toString()) as Int) else 0

public actual fun SetupOpenFileQueue(): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue() as String).toLong() else 0L

public actual fun SetupOpenInfFileA(filename: PCSTR, infclass: PCSTR, infstyle: INF_STYLE, errorline: Long): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA(filename.toString(), infclass.toString(), infstyle.toInt(), errorline.toString()) as String).toLong() else 0L

public actual fun SetupOpenInfFileW(filename: PCWSTR, infclass: PCWSTR, infstyle: INF_STYLE, errorline: Long): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW(filename.toString(), infclass.toString(), infstyle.toInt(), errorline.toString()) as String).toLong() else 0L

public actual fun SetupOpenLog(erase: BOOL): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog(erase) as Int) else 0

public actual fun SetupOpenMasterInf(): Long =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf() as String).toLong() else 0L

public actual fun SetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: PCSTR, restoreflags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA(queuehandle.toString(), backuppath.toString(), restoreflags.toInt()) as Int) else 0

public actual fun SetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: PCWSTR, restoreflags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW(queuehandle.toString(), backuppath.toString(), restoreflags.toInt()) as Int) else 0

public actual fun SetupPromptForDiskA(hwndparent: HWND, dialogtitle: PCSTR, diskname: PCSTR, pathtosource: PCSTR, filesought: PCSTR, tagfile: PCSTR, diskpromptstyle: UInt, pathbuffer: PSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA(hwndparent.toString(), dialogtitle.toString(), diskname.toString(), pathtosource.toString(), filesought.toString(), tagfile.toString(), diskpromptstyle.toInt(), pathbuffer.toString(), pathbuffersize.toInt(), pathrequiredsize.toString()) as Int).toUInt() else 0u

public actual fun SetupPromptForDiskW(hwndparent: HWND, dialogtitle: PCWSTR, diskname: PCWSTR, pathtosource: PCWSTR, filesought: PCWSTR, tagfile: PCWSTR, diskpromptstyle: UInt, pathbuffer: PWSTR, pathbuffersize: UInt, pathrequiredsize: Long): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW(hwndparent.toString(), dialogtitle.toString(), diskname.toString(), pathtosource.toString(), filesought.toString(), tagfile.toString(), diskpromptstyle.toInt(), pathbuffer.toString(), pathbuffersize.toInt(), pathrequiredsize.toString()) as Int).toUInt() else 0u

public actual fun SetupPromptReboot(filequeue: Long, owner: HWND, scanonly: BOOL): Int =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot(filequeue.toString(), owner.toString(), scanonly) as Int) else 0

public actual fun SetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA(diskspace.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW(diskspace.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryFileLogA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR, desiredinfo: SetupFileLogInfo, dataout: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA(fileloghandle.toString(), logsectionname.toString(), targetfilename.toString(), desiredinfo, dataout.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryFileLogW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR, desiredinfo: SetupFileLogInfo, dataout: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW(fileloghandle.toString(), logsectionname.toString(), targetfilename.toString(), desiredinfo, dataout.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryInfFileInformationA(infinformation: Long, infindex: UInt, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA(infinformation.toString(), infindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryInfFileInformationW(infinformation: Long, infindex: UInt, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW(infinformation.toString(), infindex.toInt(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA(infinformation.toString(), infindex.toInt(), alternateplatforminfo.toString(), originalfileinfo.toString()) as Int) else 0

public actual fun SetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: UInt, alternateplatforminfo: Long, originalfileinfo: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW(infinformation.toString(), infindex.toInt(), alternateplatforminfo.toString(), originalfileinfo.toString()) as Int) else 0

public actual fun SetupQueryInfVersionInformationA(infinformation: Long, infindex: UInt, key: PCSTR, returnbuffer: PSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA(infinformation.toString(), infindex.toInt(), key.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQueryInfVersionInformationW(infinformation: Long, infindex: UInt, key: PCWSTR, returnbuffer: PWSTR, returnbuffersize: UInt, requiredsize: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW(infinformation.toString(), infindex.toInt(), key.toString(), returnbuffer.toString(), returnbuffersize.toInt(), requiredsize.toString()) as Int) else 0

public actual fun SetupQuerySourceListA(flags: UInt, list: Long, count: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA(flags.toInt(), list.toString(), count.toString()) as Int) else 0

public actual fun SetupQuerySourceListW(flags: UInt, list: Long, count: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW(flags.toInt(), list.toString(), count.toString()) as Int) else 0

public actual fun SetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: PCSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA(diskspace.toString(), drivespec.toString(), spacerequired.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: PCWSTR, spacerequired: Long, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW(diskspace.toString(), drivespec.toString(), spacerequired.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupQueueCopyA(queuehandle: Long, sourcerootpath: PCSTR, sourcepath: PCSTR, sourcefilename: PCSTR, sourcedescription: PCSTR, sourcetagfile: PCSTR, targetdirectory: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA(queuehandle.toString(), sourcerootpath.toString(), sourcepath.toString(), sourcefilename.toString(), sourcedescription.toString(), sourcetagfile.toString(), targetdirectory.toString(), targetfilename.toString(), copystyle.toInt()) as Int) else 0

public actual fun SetupQueueCopyIndirectA(copyparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA(copyparams.toString()) as Int) else 0

public actual fun SetupQueueCopyIndirectW(copyparams: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW(copyparams.toString()) as Int) else 0

public actual fun SetupQueueCopySectionA(queuehandle: Long, sourcerootpath: PCSTR, infhandle: Long, listinfhandle: Long, section: PCSTR, copystyle: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA(queuehandle.toString(), sourcerootpath.toString(), infhandle.toString(), listinfhandle.toString(), section.toString(), copystyle.toInt()) as Int) else 0

public actual fun SetupQueueCopySectionW(queuehandle: Long, sourcerootpath: PCWSTR, infhandle: Long, listinfhandle: Long, section: PCWSTR, copystyle: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW(queuehandle.toString(), sourcerootpath.toString(), infhandle.toString(), listinfhandle.toString(), section.toString(), copystyle.toInt()) as Int) else 0

public actual fun SetupQueueCopyW(queuehandle: Long, sourcerootpath: PCWSTR, sourcepath: PCWSTR, sourcefilename: PCWSTR, sourcedescription: PCWSTR, sourcetagfile: PCWSTR, targetdirectory: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW(queuehandle.toString(), sourcerootpath.toString(), sourcepath.toString(), sourcefilename.toString(), sourcedescription.toString(), sourcetagfile.toString(), targetdirectory.toString(), targetfilename.toString(), copystyle.toInt()) as Int) else 0

public actual fun SetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: PCSTR, sourcefilename: PCSTR, targetfilename: PCSTR, copystyle: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA(queuehandle.toString(), infhandle.toString(), sourcerootpath.toString(), sourcefilename.toString(), targetfilename.toString(), copystyle.toInt()) as Int) else 0

public actual fun SetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: PCWSTR, sourcefilename: PCWSTR, targetfilename: PCWSTR, copystyle: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW(queuehandle.toString(), infhandle.toString(), sourcerootpath.toString(), sourcefilename.toString(), targetfilename.toString(), copystyle.toInt()) as Int) else 0

public actual fun SetupQueueDeleteA(queuehandle: Long, pathpart1: PCSTR, pathpart2: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA(queuehandle.toString(), pathpart1.toString(), pathpart2.toString()) as Int) else 0

public actual fun SetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA(queuehandle.toString(), infhandle.toString(), listinfhandle.toString(), section.toString()) as Int) else 0

public actual fun SetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW(queuehandle.toString(), infhandle.toString(), listinfhandle.toString(), section.toString()) as Int) else 0

public actual fun SetupQueueDeleteW(queuehandle: Long, pathpart1: PCWSTR, pathpart2: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW(queuehandle.toString(), pathpart1.toString(), pathpart2.toString()) as Int) else 0

public actual fun SetupQueueRenameA(queuehandle: Long, sourcepath: PCSTR, sourcefilename: PCSTR, targetpath: PCSTR, targetfilename: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA(queuehandle.toString(), sourcepath.toString(), sourcefilename.toString(), targetpath.toString(), targetfilename.toString()) as Int) else 0

public actual fun SetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA(queuehandle.toString(), infhandle.toString(), listinfhandle.toString(), section.toString()) as Int) else 0

public actual fun SetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW(queuehandle.toString(), infhandle.toString(), listinfhandle.toString(), section.toString()) as Int) else 0

public actual fun SetupQueueRenameW(queuehandle: Long, sourcepath: PCWSTR, sourcefilename: PCWSTR, targetpath: PCWSTR, targetfilename: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW(queuehandle.toString(), sourcepath.toString(), sourcefilename.toString(), targetpath.toString(), targetfilename.toString()) as Int) else 0

public actual fun SetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: PCSTR, targetfilename: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA(fileloghandle.toString(), logsectionname.toString(), targetfilename.toString()) as Int) else 0

public actual fun SetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: PCWSTR, targetfilename: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW(fileloghandle.toString(), logsectionname.toString(), targetfilename.toString()) as Int) else 0

public actual fun SetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA(diskspace.toString(), targetfilespec.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW(diskspace.toString(), targetfilespec.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupRemoveFromSourceListA(flags: UInt, source: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA(flags.toInt(), source.toString()) as Int) else 0

public actual fun SetupRemoveFromSourceListW(flags: UInt, source: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW(flags.toInt(), source.toString()) as Int) else 0

public actual fun SetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCSTR, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA(diskspace.toString(), infhandle.toString(), layoutinfhandle.toString(), sectionname.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: PCWSTR, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW(diskspace.toString(), infhandle.toString(), layoutinfhandle.toString(), sectionname.toString(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA(diskspace.toString(), infhandle.toString(), listinfhandle.toString(), sectionname.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: PCWSTR, operation: SETUP_FILE_OPERATION, reserved1: Long, reserved2: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW(diskspace.toString(), infhandle.toString(), listinfhandle.toString(), sectionname.toString(), operation.toInt(), reserved1.toString(), reserved2.toInt()) as Int) else 0

public actual fun SetupRenameErrorA(hwndparent: HWND, dialogtitle: PCSTR, sourcefile: PCSTR, targetfile: PCSTR, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA(hwndparent.toString(), dialogtitle.toString(), sourcefile.toString(), targetfile.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else 0u

public actual fun SetupRenameErrorW(hwndparent: HWND, dialogtitle: PCWSTR, sourcefile: PCWSTR, targetfile: PCWSTR, win32errorcode: UInt, style: UInt): UInt =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW(hwndparent.toString(), dialogtitle.toString(), sourcefile.toString(), targetfile.toString(), win32errorcode.toInt(), style.toInt()) as Int).toUInt() else 0u

public actual fun SetupScanFileQueueA(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_A, callbackcontext: Long, result: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA(filequeue.toString(), flags.toInt(), window.toString(), callbackroutine.toLong().toString(), callbackcontext.toString(), result.toString()) as Int) else 0

public actual fun SetupScanFileQueueW(filequeue: Long, flags: SETUPSCANFILEQUEUE_FLAGS, window: HWND, callbackroutine: PSP_FILE_CALLBACK_W, callbackcontext: Long, result: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW(filequeue.toString(), flags.toInt(), window.toString(), callbackroutine.toLong().toString(), callbackcontext.toString(), result.toString()) as Int) else 0

public actual fun SetupSetDirectoryIdA(infhandle: Long, id: UInt, directory: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA(infhandle.toString(), id.toInt(), directory.toString()) as Int) else 0

public actual fun SetupSetDirectoryIdExA(infhandle: Long, id: UInt, directory: PCSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA(infhandle.toString(), id.toInt(), directory.toString(), flags.toInt(), reserved1.toInt(), reserved2.toString()) as Int) else 0

public actual fun SetupSetDirectoryIdExW(infhandle: Long, id: UInt, directory: PCWSTR, flags: UInt, reserved1: UInt, reserved2: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW(infhandle.toString(), id.toInt(), directory.toString(), flags.toInt(), reserved1.toInt(), reserved2.toString()) as Int) else 0

public actual fun SetupSetDirectoryIdW(infhandle: Long, id: UInt, directory: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW(infhandle.toString(), id.toInt(), directory.toString()) as Int) else 0

public actual fun SetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA(queuehandle.toString(), alternateplatforminfo.toString(), alternatedefaultcatalogfile.toString()) as Int) else 0

public actual fun SetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW(queuehandle.toString(), alternateplatforminfo.toString(), alternatedefaultcatalogfile.toString()) as Int) else 0

public actual fun SetupSetFileQueueFlags(filequeue: Long, flagmask: UInt, flags: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags(filequeue.toString(), flagmask.toInt(), flags.toInt()) as Int) else 0

public actual fun SetupSetNonInteractiveMode(noninteractiveflag: BOOL): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode(noninteractiveflag) as Int) else 0

public actual fun SetupSetPlatformPathOverrideA(override: PCSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA(override.toString()) as Int) else 0

public actual fun SetupSetPlatformPathOverrideW(override: PCWSTR): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW(override.toString()) as Int) else 0

public actual fun SetupSetSourceListA(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA(flags.toInt(), sourcelist.toString(), sourcecount.toInt()) as Int) else 0

public actual fun SetupSetSourceListW(flags: UInt, sourcelist: Long, sourcecount: UInt): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW(flags.toInt(), sourcelist.toString(), sourcecount.toInt()) as Int) else 0

public actual fun SetupSetThreadLogToken(logtoken: ULong) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken(logtoken.toString())
    }
}

public actual fun SetupTermDefaultQueueCallback(context: Long) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback(context.toString())
    }
}

public actual fun SetupTerminateFileLog(fileloghandle: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog(fileloghandle.toString()) as Int) else 0

public actual fun SetupUninstallNewlyCopiedInfs(filequeue: Long, flags: UInt, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs(filequeue.toString(), flags.toInt(), reserved.toString()) as Int) else 0

public actual fun SetupUninstallOEMInfA(inffilename: PCSTR, flags: UInt, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA(inffilename.toString(), flags.toInt(), reserved.toString()) as Int) else 0

public actual fun SetupUninstallOEMInfW(inffilename: PCWSTR, flags: UInt, reserved: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW(inffilename.toString(), flags.toInt(), reserved.toString()) as Int) else 0

public actual fun SetupVerifyInfFileA(infname: PCSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA(infname.toString(), altplatforminfo.toString(), infsignerinfo.toString()) as Int) else 0

public actual fun SetupVerifyInfFileW(infname: PCWSTR, altplatforminfo: Long, infsignerinfo: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW(infname.toString(), altplatforminfo.toString(), infsignerinfo.toString()) as Int) else 0

public actual fun SetupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: PCSTR) {
}

public actual fun SetupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: Long, context: Long) {
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) {
        _windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine(logtoken.toString(), flags.toInt(), infhandle.toString(), context.toString())
    }
}

public actual fun UpdateDriverForPlugAndPlayDevicesA(hwndparent: HWND, hardwareid: PCSTR, fullinfpath: PCSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA(hwndparent.toString(), hardwareid.toString(), fullinfpath.toString(), installflags.toInt(), brebootrequired.toString()) as Int) else 0

public actual fun UpdateDriverForPlugAndPlayDevicesW(hwndparent: HWND, hardwareid: PCWSTR, fullinfpath: PCWSTR, installflags: UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS, brebootrequired: Long): BOOL =
    if (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon != null) (_windowsWin32DevicesDeviceanddriverinstallationNapiAddon.windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW(hwndparent.toString(), hardwareid.toString(), fullinfpath.toString(), installflags.toInt(), brebootrequired.toString()) as Int) else 0
