@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.Priority
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage

private object WindowsWin32DevicesDeviceanddriverinstallationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmpWaitNoPendingInstallEvents(dwtimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConf(plclogconf: Long, dndevinst: Int, priority: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConfEx(plclogconf: Long, dndevinst: Int, priority: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIda(dndevinst: Int, pszid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdw(dndevinst: Int, pszid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExA(dndevinst: Int, pszid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExW(dndevinst: Int, pszid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddRange(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDes(prdresdes: Long, lclogconf: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDesEx(prdresdes: Long, lclogconf: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineA(uncservername: Long, phmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineW(uncservername: Long, phmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeA(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeW(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExA(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExW(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateRangeList(prlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKey(classguid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKeyEx(classguid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKey(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKeyEx(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteRange(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflict(dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, pbconflictdetected: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflictEx(dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, pbconflictdetected: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisconnectMachine(hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmDupRangeList(rlhold: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClasses(ulclassindex: Int, classguid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClassesEx(ulclassindex: Int, classguid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsA(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsW(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExA(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExW(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFindRange(pullstart: Long, ullstart: Long, ullength: Int, ullalignment: Long, ullend: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFirstRange(rlh: Long, pullstart: Long, pullend: Long, preelement: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConf(lclogconftobefreed: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfEx(lclogconftobefreed: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfHandle(lclogconf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeRangeList(rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDes(prdresdes: Long, rdresdes: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesEx(prdresdes: Long, rdresdes: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesHandle(rdresdes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResourceConflictHandle(clconflictlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChild(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChildEx(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameA(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameW(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExA(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExW(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameA(classguid: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameW(classguid: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExA(classguid: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExW(classguid: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeysEx(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyA(classguid: Long, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyW(classguid: Long, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepth(puldepth: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepthEx(puldepth: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyA(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyW(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExA(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExW(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyW(dndevinst: Int, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyExW(dndevinst: Int, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeys(dndevinst: Int, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeysEx(dndevinst: Int, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyA(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyW(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExA(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExW(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatus(pulstatus: Long, pulproblemnumber: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatusEx(pulstatus: Long, pulproblemnumber: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIda(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdw(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExA(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExW(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListA(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListW(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExA(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExW(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeA(pullen: Long, pszfilter: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeW(pullen: Long, pszfilter: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExA(pullen: Long, pszfilter: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExW(pullen: Long, pszfilter: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSize(pullen: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSizeEx(pullen: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasA(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasW(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListA(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListW(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExA(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExW(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExA(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExW(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyW(pszdeviceinterface: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConf(plclogconf: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConfEx(plclogconf: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalState(pulstate: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalStateEx(pulstate: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsA(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsW(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExA(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExW(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoA(ulindex: Int, phwprofileinfo: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoW(ulindex: Int, phwprofileinfo: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExA(ulindex: Int, phwprofileinfo: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExW(ulindex: Int, phwprofileinfo: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriority(lclogconf: Long, ppriority: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriorityEx(lclogconf: Long, ppriority: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConf(plclogconf: Long, lclogconf: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConfEx(plclogconf: Long, lclogconf: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDes(prdresdes: Long, rdresdes: Long, forresource: Int, presourceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDesEx(prdresdes: Long, rdresdes: Long, forresource: Int, presourceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParent(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParentEx(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesData(rdresdes: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataEx(rdresdes: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSize(pulsize: Long, rdresdes: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSizeEx(pulsize: Long, rdresdes: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictCount(clconflictlist: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsA(clconflictlist: Long, ulindex: Int, pconflictdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsW(clconflictlist: Long, ulindex: Int, pconflictdetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSibling(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSiblingEx(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersion(): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersionEx(hmachine: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmIntersectRangeList(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmInvertRangeList(rlhold: Long, rlhnew: Long, ullmaxvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresent(pbpresent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresentEx(pbpresent: Long, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailable(wversion: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailableEx(wversion: Short, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeA(pdndevinst: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeW(pdndevinst: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExA(pdndevinst: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExW(pdndevinst: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmMapCrToWin32Err(cmreturncode: Int, defaulterr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmMergeRangeList(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDes(prdresdes: Long, rdresdes: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDesEx(prdresdes: Long, rdresdes: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNode(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNodeEx(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmNextRange(preelement: Long, pullstart: Long, pullend: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyA(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyW(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExA(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExW(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKey(dndevnode: Int, samdesired: Int, ulhardwareprofile: Int, disposition: Int, phkdevice: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKeyEx(dndevnode: Int, samdesired: Int, ulhardwareprofile: Int, disposition: Int, phkdevice: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeA(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeW(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExA(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExW(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeData(pdata: Long, datalen: Int, dndevinst: Int, resourceid: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeDataEx(pdata: Long, datalen: Int, dndevinst: Int, resourceid: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSize(pulsize: Long, dndevinst: Int, resourceid: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSizeEx(pulsize: Long, dndevinst: Int, resourceid: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTree(dnancestor: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTreeEx(dnancestor: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryResourceConflictList(pclconflictlist: Long, dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriver(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriverEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceA(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceW(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExA(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExW(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterNotification(pfilter: Long, pcontext: Long, pcallback: Long, pnotifycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTree(dnancestor: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTreeEx(dnancestor: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectA(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectW(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExA(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExW(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPc(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPcEx(hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetection(ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetectionEx(ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyA(classguid: Long, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyW(classguid: Long, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblem(dndevinst: Int, ulproblem: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblemEx(dndevinst: Int, ulproblem: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyW(dndevinst: Int, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyExW(dndevinst: Int, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyA(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyW(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExA(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExW(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyW(pszdeviceinterface: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProf(ulhardwareprofile: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfEx(ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsA(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsW(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExA(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExW(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmTestRangeAvailable(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceA(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceW(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterNotification(notifycontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverA(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverW(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diRollbackDriver(deviceinfoset: Long, deviceinfodata: Long, hwndparent: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDriver(hwndparent: Long, filepath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverA(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverW(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionA(window: Long, modulehandle: Long, commandline: Long, showcommand: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionW(window: Long, modulehandle: Long, commandline: Long, showcommand: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListA(diskspace: Long, targetfilespec: Long, filesize: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListW(diskspace: Long, targetfilespec: Long, filesize: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListA(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListW(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListA(diskspace: Long, driveroot: Long, amount: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListW(diskspace: Long, driveroot: Long, amount: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorA(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorW(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCancelTemporarySourceList(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseFileQueue(queuehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseInfFile(infhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseLog()

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueA(owner: Long, queuehandle: Long, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueW(owner: Long, queuehandle: Long, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorA(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, sourcefile: Long, targetpathfile: Long, win32errorcode: Int, style: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorW(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, sourcefile: Long, targetpathfile: Long, win32errorcode: Int, style: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfA(sourceinffilename: Long, oemsourcemedialocation: Long, oemsourcemediatype: Int, copystyle: Int, destinationinffilename: Long, destinationinffilenamesize: Int, requiredsize: Long, destinationinffilenamecomponent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfW(sourceinffilename: Long, oemsourcemedialocation: Long, oemsourcemediatype: Int, copystyle: Int, destinationinffilename: Long, destinationinffilenamesize: Int, requiredsize: Long, destinationinffilenamecomponent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListA(reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListW(reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileA(sourcefilename: Long, targetfilename: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileW(sourcefilename: Long, targetfilename: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackA(context: Long, notification: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackW(context: Long, notification: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorA(hwndparent: Long, dialogtitle: Long, file: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorW(hwndparent: Long, dialogtitle: Long, file: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDestroyDiskSpaceList(diskspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiAskForOEMDisk(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoList(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExA(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExW(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildDriverInfoList(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCallClassInstaller(installfunction: Int, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCancelDriverInfoSearch(deviceinfoset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiChangeState(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameA(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExA(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExW(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameW(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidA(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExA(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExW(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidW(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyA(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyW(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoA(deviceinfoset: Long, devicename: Long, classguid: Long, devicedescription: Long, hwndparent: Long, creationflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoList(classguid: Long, hwndparent: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoW(deviceinfoset: Long, devicename: Long, classguid: Long, devicedescription: Long, hwndparent: Long, creationflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceA(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, referencestring: Long, creationflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceW(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, referencestring: Long, creationflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDevRegKey(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInfo(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceData(deviceinfoset: Long, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyClassImageList(classimagelistdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDeviceInfoList(deviceinfoset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDriverInfoList(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInfo(deviceinfoset: Long, memberindex: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInterfaces(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, memberindex: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoA(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int, memberindex: Int, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoW(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int, memberindex: Int, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionA(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExA(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExW(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionW(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsA(deviceinfoset: Long, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: Int, requiredsize: Long, propertysheettype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsW(deviceinfoset: Long, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: Int, requiredsize: Long, propertysheettype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsA(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExA(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int, deviceinfoset: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExW(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int, deviceinfoset: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsW(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageList(classimagelistdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExA(classimagelistdata: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExW(classimagelistdata: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyA(classguid: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyW(classguid: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyA(deviceinfoset: Long, deviceinfodata: Long, custompropertyname: Long, flags: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, custompropertyname: Long, flags: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListClass(deviceinfoset: Long, classguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailA(deviceinfoset: Long, deviceinfosetdetaildata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailW(deviceinfoset: Long, deviceinfosetdetaildata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdA(deviceinfoset: Long, deviceinfodata: Long, deviceinstanceid: Long, deviceinstanceidsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdW(deviceinfoset: Long, deviceinfodata: Long, deviceinstanceid: Long, deviceinstanceidsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceAlias(deviceinfoset: Long, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailA(deviceinfoset: Long, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: Int, requiredsize: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailW(deviceinfoset: Long, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: Int, requiredsize: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Long, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyW(deviceinfoset: Long, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyKeys(deviceinfoset: Long, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyA(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyW(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameA(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExA(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExW(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameW(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassA(infname: Long, classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassW(infname: Long, classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetWizardPage(deviceinfoset: Long, deviceinfodata: Long, installwizarddata: Long, pagetype: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassA(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExA(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExW(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassW(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDeviceInterfaces(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDriverFiles(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadDeviceIcon(deviceinfoset: Long, deviceinfodata: Long, cxicon: Int, cyicon: Int, flags: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKey(classguid: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExA(classguid: Long, samdesired: Int, flags: Int, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExW(classguid: Long, samdesired: Int, flags: Int, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDevRegKey(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoA(deviceinfoset: Long, deviceinstanceid: Long, hwndparent: Long, openflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoW(deviceinfoset: Long, deviceinstanceid: Long, hwndparent: Long, openflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceA(deviceinfoset: Long, devicepath: Long, openflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceW(deviceinfoset: Long, devicepath: Long, openflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterCoDeviceInstallers(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterDeviceInfo(deviceinfoset: Long, deviceinfodata: Long, flags: Int, compareproc: Long, comparecontext: Long, dupdeviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDeviceInterface(deviceinfoset: Long, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRestartDevices(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectBestCompatDrv(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectOEMDrv(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyA(classguid: Long, property: Int, propertybuffer: Long, propertybuffersize: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyW(classguid: Long, property: Int, propertybuffer: Long, propertybuffersize: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfaceDefault(deviceinfoset: Long, deviceinterfacedata: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfacePropertyW(deviceinfoset: Long, deviceinterfacedata: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyA(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertybuffer: Long, propertybuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyW(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertybuffer: Long, propertybuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiUnremoveDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsA(infhandle: Long, index: Int, buffer: Long, size: Int, sizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsW(infhandle: Long, index: Int, buffer: Long, size: Int, sizeneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineA(infhandle: Long, section: Long, key: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineW(infhandle: Long, section: Long, key: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextLine(contextin: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineA(contextin: Long, key: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineW(contextin: Long, key: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListA(list: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListW(list: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationA(queuehandle: Long, backupparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationW(queuehandle: Long, backupparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBinaryField(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFieldCount(context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoA(sourcefilename: Long, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExA(sourcefilename: Long, actualsourcefilenamebuffer: Long, actualsourcefilenamebufferlen: Int, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExW(sourcefilename: Long, actualsourcefilenamebuffer: Long, actualsourcefilenamebufferlen: Int, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoW(sourcefilename: Long, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueCount(filequeue: Long, subqueuefileop: Int, numoperations: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueFlags(filequeue: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationA(filename: Long, alternateplatforminfo: Long, localename: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationW(filename: Long, alternateplatforminfo: Long, localename: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListA(directorypath: Long, infstyle: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListW(directorypath: Long, infstyle: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationA(infspec: Long, searchcontrol: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationW(infspec: Long, searchcontrol: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameA(driverstorelocation: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameW(driverstorelocation: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetIntField(context: Long, fieldindex: Int, integervalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexA(infhandle: Long, section: Long, index: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexW(infhandle: Long, section: Long, index: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountA(infhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountW(infhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextA(context: Long, infhandle: Long, section: Long, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextW(context: Long, infhandle: Long, section: Long, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldA(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldW(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetNonInteractiveMode(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: Long, sourceid: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: Long, sourceid: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: Long, section: Long, filesize: Long, roundingfactor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: Long, section: Long, filesize: Long, roundingfactor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoA(infhandle: Long, sourceid: Int, infodesired: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoW(infhandle: Long, sourceid: Int, infodesired: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldA(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldW(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathA(infhandle: Long, infcontext: Long, section: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathW(infhandle: Long, infcontext: Long, section: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetThreadLogToken(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallback(ownerwindow: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallbackEx(ownerwindow: Long, alternateprogresswindow: Long, progressmessage: Int, reserved1: Int, reserved2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogA(logfilename: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogW(logfilename: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long, filewasinuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long, filewasinuse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: Long, sourcerootpath: Long, copyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: Long, sourcerootpath: Long, copyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionA(owner: Long, infhandle: Long, sectionname: Long, flags: Int, relativekeyroot: Long, sourcerootpath: Long, copyflags: Int, msghandler: Long, context: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionW(owner: Long, infhandle: Long, sectionname: Long, flags: Int, relativekeyroot: Long, sourcerootpath: Long, copyflags: Int, msghandler: Long, context: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionA(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: Long, flags: Int, deviceinfoset: Long, deviceinfodata: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: Long, flags: Int, deviceinfoset: Long, deviceinfodata: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionW(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetA(cabinetfile: Long, reserved: Int, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetW(cabinetfile: Long, reserved: Int, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorA(messagestring: Long, severity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorW(messagestring: Long, severity: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileA(fileloghandle: Long, logsectionname: Long, sourcefilename: Long, targetfilename: Long, checksum: Int, disktagfile: Long, diskdescription: Long, otherinfo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileW(fileloghandle: Long, logsectionname: Long, sourcefilename: Long, targetfilename: Long, checksum: Int, disktagfile: Long, diskdescription: Long, otherinfo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileA(filename: Long, infhandle: Long, errorline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileW(filename: Long, infhandle: Long, errorline: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenFileQueue(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileA(filename: Long, infclass: Long, infstyle: Int, errorline: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileW(filename: Long, infclass: Long, infstyle: Int, errorline: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenLog(erase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenMasterInf(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreA(queuehandle: Long, backuppath: Long, restoreflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreW(queuehandle: Long, backuppath: Long, restoreflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskA(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, filesought: Long, tagfile: Long, diskpromptstyle: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskW(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, filesought: Long, tagfile: Long, diskpromptstyle: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptReboot(filequeue: Long, owner: Long, scanonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogA(fileloghandle: Long, logsectionname: Long, targetfilename: Long, desiredinfo: Int, dataout: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogW(fileloghandle: Long, logsectionname: Long, targetfilename: Long, desiredinfo: Int, dataout: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationA(infinformation: Long, infindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationW(infinformation: Long, infindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationA(infinformation: Long, infindex: Int, alternateplatforminfo: Long, originalfileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationW(infinformation: Long, infindex: Int, alternateplatforminfo: Long, originalfileinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationA(infinformation: Long, infindex: Int, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationW(infinformation: Long, infindex: Int, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListA(flags: Int, list: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListW(flags: Int, list: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: Long, spacerequired: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: Long, spacerequired: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyA(queuehandle: Long, sourcerootpath: Long, sourcepath: Long, sourcefilename: Long, sourcedescription: Long, sourcetagfile: Long, targetdirectory: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectA(copyparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectW(copyparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionA(queuehandle: Long, sourcerootpath: Long, infhandle: Long, listinfhandle: Long, section: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionW(queuehandle: Long, sourcerootpath: Long, infhandle: Long, listinfhandle: Long, section: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyW(queuehandle: Long, sourcerootpath: Long, sourcepath: Long, sourcefilename: Long, sourcedescription: Long, sourcetagfile: Long, targetdirectory: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: Long, sourcefilename: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: Long, sourcefilename: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteA(queuehandle: Long, pathpart1: Long, pathpart2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteW(queuehandle: Long, pathpart1: Long, pathpart2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameA(queuehandle: Long, sourcepath: Long, sourcefilename: Long, targetpath: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameW(queuehandle: Long, sourcepath: Long, sourcefilename: Long, targetpath: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListA(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListW(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorA(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorW(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueA(filequeue: Long, flags: Int, window: Long, callbackroutine: Long, callbackcontext: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueW(filequeue: Long, flags: Int, window: Long, callbackroutine: Long, callbackcontext: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdA(infhandle: Long, id: Int, directory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExA(infhandle: Long, id: Int, directory: Long, flags: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExW(infhandle: Long, id: Int, directory: Long, flags: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdW(infhandle: Long, id: Int, directory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueFlags(filequeue: Long, flagmask: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetNonInteractiveMode(noninteractiveflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideA(override: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideW(override: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListA(flags: Int, sourcelist: Long, sourcecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListW(flags: Int, sourcelist: Long, sourcecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetThreadLogToken(logtoken: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupTermDefaultQueueCallback(context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupTerminateFileLog(fileloghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallNewlyCopiedInfs(filequeue: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfA(inffilename: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfW(inffilename: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileA(infname: Long, altplatforminfo: Long, infsignerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileW(infname: Long, altplatforminfo: Long, infsignerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLog(logtoken: Long, category: Int, flags: Int, messagestr: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogError(logtoken: Long, category: Int, logflags: Int, error: Int, messagestr: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogInfLine(logtoken: Long, flags: Int, infhandle: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesA(hwndparent: Long, hardwareid: Long, fullinfpath: Long, installflags: Int, brebootrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesW(hwndparent: Long, hardwareid: Long, fullinfpath: Long, installflags: Int, brebootrequired: Long): Int
}

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmpWaitNoPendingInstallEvents(dwtimeout.toInt()).toUInt()

public actual fun cmAddEmptyLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConf((plclogconf?.value ?: 0L), dndevinst.toInt(), priority, ulflags.toInt()).toUInt()

public actual fun cmAddEmptyLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConfEx((plclogconf?.value ?: 0L), dndevinst.toInt(), priority, ulflags.toInt(), hmachine).toUInt()

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIda(dndevinst.toInt(), (pszid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdw(dndevinst.toInt(), (pszid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExA(dndevinst.toInt(), (pszid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExW(dndevinst.toInt(), (pszid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddRange(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmAddResDes(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDes((prdresdes?.value ?: 0L), lclogconf.toLong(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmAddResDesEx(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDesEx((prdresdes?.value ?: 0L), lclogconf.toLong(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineA((uncservername?.value ?: 0L), (phmachine?.value ?: 0L)).toUInt()

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineW((uncservername?.value ?: 0L), (phmachine?.value ?: 0L)).toUInt()

public actual fun cmCreateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeA((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), dnparent.toInt(), ulflags.toInt()).toUInt()

public actual fun cmCreateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeW((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), dnparent.toInt(), ulflags.toInt()).toUInt()

public actual fun cmCreateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExA((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), dnparent.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmCreateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExW((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), dnparent.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmCreateRangeList(prlh: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateRangeList((prlh?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmDeleteClassKey(classguid: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKey((classguid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmDeleteClassKeyEx(classguid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKeyEx((classguid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKey(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKeyEx(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyA((pszdeviceinterface?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyW((pszdeviceinterface?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExA((pszdeviceinterface?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExW((pszdeviceinterface?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteRange(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflict(dndevinst.toInt(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), (pbconflictdetected?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflictEx(dndevinst.toInt(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), (pbconflictdetected?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisconnectMachine(hmachine).toUInt()

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmDupRangeList(rlhold.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClasses(ulclassindex.toInt(), (classguid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClassesEx(ulclassindex.toInt(), (classguid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsA(ulenumindex.toInt(), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsW(ulenumindex.toInt(), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExA(ulenumindex.toInt(), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExW(ulenumindex.toInt(), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmFindRange(pullstart: COpaquePointer?, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFindRange((pullstart?.value ?: 0L), ullstart.toLong(), ullength.toInt(), ullalignment.toLong(), ullend.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFirstRange(rlh: ULong, pullstart: COpaquePointer?, pullend: COpaquePointer?, preelement: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFirstRange(rlh.toLong(), (pullstart?.value ?: 0L), (pullend?.value ?: 0L), (preelement?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConf(lclogconftobefreed.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfEx(lclogconftobefreed.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfHandle(lclogconf.toLong()).toUInt()

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeRangeList(rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeResDes(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDes((prdresdes?.value ?: 0L), rdresdes.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesEx((prdresdes?.value ?: 0L), rdresdes.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesHandle(rdresdes.toLong()).toUInt()

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResourceConflictHandle(clconflictlist.toLong()).toUInt()

public actual fun cmGetChild(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChild((pdndevinst?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetChildEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChildEx((pdndevinst?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassKeyNameA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameA((classguid?.value ?: 0L), (pszkeyname?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetClassKeyNameW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameW((classguid?.value ?: 0L), (pszkeyname?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetClassKeyNameExA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExA((classguid?.value ?: 0L), (pszkeyname?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassKeyNameExW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExW((classguid?.value ?: 0L), (pszkeyname?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassNameA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameA((classguid?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetClassNameW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameW((classguid?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetClassNameExA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExA((classguid?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassNameExW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExW((classguid?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyExW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeys((classguid?.value ?: 0L), (propertykeyarray?.value ?: 0L), (propertykeycount?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetClassPropertyKeysEx(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeysEx((classguid?.value ?: 0L), (propertykeyarray?.value ?: 0L), (propertykeycount?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyA((classguid?.value ?: 0L), ulproperty.toInt(), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyW((classguid?.value ?: 0L), ulproperty.toInt(), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDepth(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepth((puldepth?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDepthEx(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepthEx((puldepth?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyA(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyW(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExA(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExW(dndevinst.toInt(), (pszcustompropertyname?.value ?: 0L), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyW(dndevinst.toInt(), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyExW(dndevinst.toInt(), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeys(dndevinst.toInt(), (propertykeyarray?.value ?: 0L), (propertykeycount?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeysEx(dndevinst.toInt(), (propertykeyarray?.value ?: 0L), (propertykeycount?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), (pulregdatatype?.value ?: 0L), (buffer?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeStatus(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatus((pulstatus?.value ?: 0L), (pulproblemnumber?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeStatusEx(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatusEx((pulstatus?.value ?: 0L), (pulproblemnumber?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIda(dndevinst.toInt(), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdw(dndevinst.toInt(), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExA(dndevinst.toInt(), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExW(dndevinst.toInt(), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListA((pszfilter?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListW((pszfilter?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExA((pszfilter?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExW((pszfilter?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListSizeA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeA((pullen?.value ?: 0L), (pszfilter?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListSizeW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeW((pullen?.value ?: 0L), (pszfilter?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListSizeExA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExA((pullen?.value ?: 0L), (pszfilter?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListSizeExW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExW((pullen?.value ?: 0L), (pszfilter?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdSize(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSize((pullen?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdSizeEx(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSizeEx((pullen?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasA((pszdeviceinterface?.value ?: 0L), (aliasinterfaceguid?.value ?: 0L), (pszaliasdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasW((pszdeviceinterface?.value ?: 0L), (aliasinterfaceguid?.value ?: 0L), (pszaliasdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExA((pszdeviceinterface?.value ?: 0L), (aliasinterfaceguid?.value ?: 0L), (pszaliasdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExW((pszdeviceinterface?.value ?: 0L), (aliasinterfaceguid?.value ?: 0L), (pszaliasdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListA((interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListW((interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExA((interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExW((interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListSizeA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeA((pullen?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListSizeW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeW((pullen?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExA((pullen?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExW((pullen?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyW((pszdeviceinterface?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyExW((pszdeviceinterface?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysW((pszdeviceinterface?.value ?: 0L), (propertykeyarray?.value ?: 0L), (propertykeycount?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysExW((pszdeviceinterface?.value ?: 0L), (propertykeyarray?.value ?: 0L), (propertykeycount?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetFirstLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConf((plclogconf?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetFirstLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConfEx((plclogconf?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetGlobalState(pulstate: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalState((pulstate?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetGlobalStateEx(pulstate: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalStateEx((pulstate?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsA((pdeviceid?.value ?: 0L), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsW((pdeviceid?.value ?: 0L), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExA((pdeviceid?.value ?: 0L), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExW((pdeviceid?.value ?: 0L), ulhardwareprofile.toInt(), (pulvalue?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoA(ulindex.toInt(), (phwprofileinfo?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoW(ulindex.toInt(), (phwprofileinfo?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExA(ulindex.toInt(), (phwprofileinfo?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExW(ulindex.toInt(), (phwprofileinfo?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriority(lclogconf.toLong(), (ppriority?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriorityEx(lclogconf.toLong(), (ppriority?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetNextLogConf(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConf((plclogconf?.value ?: 0L), lclogconf.toLong(), ulflags.toInt()).toUInt()

public actual fun cmGetNextLogConfEx(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConfEx((plclogconf?.value ?: 0L), lclogconf.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetNextResDes(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDes((prdresdes?.value ?: 0L), rdresdes.toLong(), forresource.toInt(), (presourceid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmGetNextResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDesEx((prdresdes?.value ?: 0L), rdresdes.toLong(), forresource.toInt(), (presourceid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetParent(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParent((pdndevinst?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetParentEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParentEx((pdndevinst?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetResDesData(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesData(rdresdes.toLong(), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataEx(rdresdes.toLong(), (buffer?.value ?: 0L), bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetResDesDataSize(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSize((pulsize?.value ?: 0L), rdresdes.toLong(), ulflags.toInt()).toUInt()

public actual fun cmGetResDesDataSizeEx(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSizeEx((pulsize?.value ?: 0L), rdresdes.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictCount(clconflictlist.toLong(), (pulcount?.value ?: 0L)).toUInt()

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsA(clconflictlist.toLong(), ulindex.toInt(), (pconflictdetails?.value ?: 0L)).toUInt()

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsW(clconflictlist.toLong(), ulindex.toInt(), (pconflictdetails?.value ?: 0L)).toUInt()

public actual fun cmGetSibling(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSibling((pdndevinst?.value ?: 0L), dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetSiblingEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSiblingEx((pdndevinst?.value ?: 0L), dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetVersion(): UShort =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersion().toUShort()

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersionEx(hmachine).toUShort()

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIntersectRangeList(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmInvertRangeList(rlhold.toLong(), rlhnew.toLong(), ullmaxvalue.toLong(), ulflags.toInt()).toUInt()

public actual fun cmIsDockStationPresent(pbpresent: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresent((pbpresent?.value ?: 0L)).toUInt()

public actual fun cmIsDockStationPresentEx(pbpresent: COpaquePointer?, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresentEx((pbpresent?.value ?: 0L), hmachine).toUInt()

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailable(wversion.toShort())

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailableEx(wversion.toShort(), hmachine)

public actual fun cmLocateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeA((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmLocateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeW((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmLocateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExA((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmLocateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExW((pdndevinst?.value ?: 0L), (pdeviceid?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()).toUInt()

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMergeRangeList(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmModifyResDes(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDes((prdresdes?.value ?: 0L), rdresdes.toLong(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmModifyResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDesEx((prdresdes?.value ?: 0L), rdresdes.toLong(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNodeEx(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmNextRange(preelement: COpaquePointer?, pullstart: COpaquePointer?, pullend: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmNextRange((preelement?.value ?: 0L), (pullstart?.value ?: 0L), (pullend?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmOpenClassKeyA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyA((classguid?.value ?: 0L), (pszclassname?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmOpenClassKeyW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyW((classguid?.value ?: 0L), (pszclassname?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmOpenClassKeyExA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExA((classguid?.value ?: 0L), (pszclassname?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenClassKeyExW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExW((classguid?.value ?: 0L), (pszclassname?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkclass?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKey(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), (phkdevice?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKeyEx(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), (phkdevice?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyA((pszdeviceinterface?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyW((pszdeviceinterface?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExA((pszdeviceinterface?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExW((pszdeviceinterface?.value ?: 0L), samdesired.toInt(), disposition.toInt(), (phkdeviceinterface?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeA(dnancestor.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeW(dnancestor.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExA(dnancestor.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExW(dnancestor.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryArbitratorFreeData(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeData((pdata?.value ?: 0L), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryArbitratorFreeDataEx(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeDataEx((pdata?.value ?: 0L), datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryArbitratorFreeSize(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSize((pulsize?.value ?: 0L), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSizeEx((pulsize?.value ?: 0L), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryResourceConflictList(pclconflictlist: COpaquePointer?, dndevinst: UInt, resourceid: CmRestype, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryResourceConflictList((pclconflictlist?.value ?: 0L), dndevinst.toInt(), resourceid.toInt(), (resourcedata?.value ?: 0L), resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriver(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriverEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceA(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L), (pszreference?.value ?: 0L), (pszdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceW(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L), (pszreference?.value ?: 0L), (pszdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExA(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L), (pszreference?.value ?: 0L), (pszdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExW(dndevinst.toInt(), (interfaceclassguid?.value ?: 0L), (pszreference?.value ?: 0L), (pszdeviceinterface?.value ?: 0L), (pullength?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterNotification(pfilter: COpaquePointer?, pcontext: COpaquePointer?, pcallback: PcmNotifyCallback, pnotifycontext: COpaquePointer?): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterNotification((pfilter?.value ?: 0L), (pcontext?.value ?: 0L), 0L, (pnotifycontext?.value ?: 0L)).toUInt()

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectA(dndevinst.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectW(dndevinst.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExA(dndevinst.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExW(dndevinst.toInt(), (pvetotype?.value ?: 0L), (pszvetoname?.value ?: 0L), ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestEjectPc(): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPc().toUInt()

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPcEx(hmachine).toUInt()

public actual fun cmRunDetection(ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetection(ulflags.toInt()).toUInt()

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetectionEx(ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyExW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyA((classguid?.value ?: 0L), ulproperty.toInt(), (buffer?.value ?: 0L), ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyW((classguid?.value ?: 0L), ulproperty.toInt(), (buffer?.value ?: 0L), ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblemEx(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyW(dndevinst.toInt(), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyExW(dndevinst.toInt(), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L), ullength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L), ullength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L), ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), (buffer?.value ?: 0L), ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyW((pszdeviceinterface?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyExW((pszdeviceinterface?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProf(ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfEx(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsA((pdeviceid?.value ?: 0L), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsW((pdeviceid?.value ?: 0L), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExA((pdeviceid?.value ?: 0L), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExW((pdeviceid?.value ?: 0L), ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmTestRangeAvailable(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceA((pszdeviceinterface?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceW((pszdeviceinterface?.value ?: 0L), ulflags.toInt()).toUInt()

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExA((pszdeviceinterface?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExW((pszdeviceinterface?.value ?: 0L), ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterNotification((notifycontext?.value ?: 0L)).toUInt()

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, flags: DiinstalldeviceFlags, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDevice((hwndparent?.value ?: 0L), deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverA((hwndparent?.value ?: 0L), (infpath?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverW((hwndparent?.value ?: 0L), (infpath?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diRollbackDriver(deviceinfoset, (deviceinfodata?.value ?: 0L), (hwndparent?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDevice((hwndparent?.value ?: 0L), deviceinfoset, (deviceinfodata?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDriver((hwndparent?.value ?: 0L), (filepath?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDevice((hwndparent?.value ?: 0L), deviceinfoset, (deviceinfodata?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverA((hwndparent?.value ?: 0L), (infpath?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverW((hwndparent?.value ?: 0L), (infpath?.value ?: 0L), flags.toInt(), (needreboot?.value ?: 0L))

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionA((window?.value ?: 0L), (modulehandle?.value ?: 0L), (commandline?.value ?: 0L), showcommand)
}

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionW((window?.value ?: 0L), (modulehandle?.value ?: 0L), (commandline?.value ?: 0L), showcommand)
}

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListA((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (layoutinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListW((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (layoutinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAddSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListA((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAddSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListW((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAddToDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListA((diskspace?.value ?: 0L), (targetfilespec?.value ?: 0L), filesize, operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAddToDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListW((diskspace?.value ?: 0L), (targetfilespec?.value ?: 0L), filesize, operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListA(flags.toInt(), (source?.value ?: 0L))

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListW(flags.toInt(), (source?.value ?: 0L))

public actual fun setupAdjustDiskSpaceListA(diskspace: COpaquePointer?, driveroot: Pcstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListA((diskspace?.value ?: 0L), (driveroot?.value ?: 0L), amount, (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupAdjustDiskSpaceListW(diskspace: COpaquePointer?, driveroot: Pcwstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListW((diskspace?.value ?: 0L), (driveroot?.value ?: 0L), amount, (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorA((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (sourcefile?.value ?: 0L), (targetfile?.value ?: 0L), win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorW((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (sourcefile?.value ?: 0L), (targetfile?.value ?: 0L), win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupCancelTemporarySourceList(): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCancelTemporarySourceList()

public actual fun setupCloseFileQueue(queuehandle: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseFileQueue((queuehandle?.value ?: 0L))

public actual fun setupCloseInfFile(infhandle: COpaquePointer?) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseInfFile((infhandle?.value ?: 0L))
}

public actual fun setupCloseLog() {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseLog()
}

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueA((owner?.value ?: 0L), (queuehandle?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueW((owner?.value ?: 0L), (queuehandle?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun setupConfigureWmiFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionA((infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt())

public actual fun setupConfigureWmiFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionW((infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt())

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorA((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (diskname?.value ?: 0L), (pathtosource?.value ?: 0L), (sourcefile?.value ?: 0L), (targetpathfile?.value ?: 0L), win32errorcode.toInt(), style.toInt(), (pathbuffer?.value ?: 0L), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L)).toUInt()

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorW((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (diskname?.value ?: 0L), (pathtosource?.value ?: 0L), (sourcefile?.value ?: 0L), (targetpathfile?.value ?: 0L), win32errorcode.toInt(), style.toInt(), (pathbuffer?.value ?: 0L), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L)).toUInt()

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfA((sourceinffilename?.value ?: 0L), (oemsourcemedialocation?.value ?: 0L), oemsourcemediatype.toInt(), copystyle.toInt(), (destinationinffilename?.value ?: 0L), destinationinffilenamesize.toInt(), (requiredsize?.value ?: 0L), (destinationinffilenamecomponent?.value ?: 0L))

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfW((sourceinffilename?.value ?: 0L), (oemsourcemedialocation?.value ?: 0L), oemsourcemediatype.toInt(), copystyle.toInt(), (destinationinffilename?.value ?: 0L), destinationinffilenamesize.toInt(), (requiredsize?.value ?: 0L), (destinationinffilenamecomponent?.value ?: 0L))

public actual fun setupCreateDiskSpaceListA(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListA((reserved1?.value ?: 0L), reserved2.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupCreateDiskSpaceListW(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListW((reserved1?.value ?: 0L), reserved2.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileA((sourcefilename?.value ?: 0L), (targetfilename?.value ?: 0L), (compressiontype?.value ?: 0L)).toUInt()

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileW((sourcefilename?.value ?: 0L), (targetfilename?.value ?: 0L), (compressiontype?.value ?: 0L)).toUInt()

public actual fun setupDefaultQueueCallbackA(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackA((context?.value ?: 0L), notification.toInt(), param1.toLong(), param2.toLong()).toUInt()

public actual fun setupDefaultQueueCallbackW(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackW((context?.value ?: 0L), notification.toInt(), param1.toLong(), param2.toLong()).toUInt()

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorA((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (file?.value ?: 0L), win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorW((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (file?.value ?: 0L), win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupDestroyDiskSpaceList(diskspace: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDestroyDiskSpaceList((diskspace?.value ?: 0L))

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiAskForOEMDisk(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoList(flags.toInt(), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExA(flags.toInt(), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExW(flags.toInt(), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildDriverInfoList(deviceinfoset, (deviceinfodata?.value ?: 0L), drivertype.toInt())

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCallClassInstaller(installfunction.toInt(), deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCancelDriverInfoSearch(deviceinfoset)

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiChangeState(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameA((classname?.value ?: 0L), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExA((classname?.value ?: 0L), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExW((classname?.value ?: 0L), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameW((classname?.value ?: 0L), (classguidlist?.value ?: 0L), classguidlistsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiClassNameFromGuidA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidA((classguid?.value ?: 0L), (classname?.value ?: 0L), classnamesize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiClassNameFromGuidExA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExA((classguid?.value ?: 0L), (classname?.value ?: 0L), classnamesize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiClassNameFromGuidExW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExW((classguid?.value ?: 0L), (classname?.value ?: 0L), classnamesize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiClassNameFromGuidW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidW((classguid?.value ?: 0L), (classname?.value ?: 0L), classnamesize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyA(deviceinfoset, (deviceinfodata?.value ?: 0L), scope.toInt(), hwprofile.toInt(), keytype.toInt(), (infhandle?.value ?: 0L), (infsectionname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyW(deviceinfoset, (deviceinfodata?.value ?: 0L), scope.toInt(), hwprofile.toInt(), keytype.toInt(), (infhandle?.value ?: 0L), (infsectionname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: COpaquePointer?, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoA(deviceinfoset, (devicename?.value ?: 0L), (classguid?.value ?: 0L), (devicedescription?.value ?: 0L), (hwndparent?.value ?: 0L), creationflags.toInt(), (deviceinfodata?.value ?: 0L))

public actual fun setupDiCreateDeviceInfoList(classguid: COpaquePointer?, hwndparent: Hwnd): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoList((classguid?.value ?: 0L), (hwndparent?.value ?: 0L))

public actual fun setupDiCreateDeviceInfoListExA(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExA((classguid?.value ?: 0L), (hwndparent?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiCreateDeviceInfoListExW(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExW((classguid?.value ?: 0L), (hwndparent?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: COpaquePointer?, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoW(deviceinfoset, (devicename?.value ?: 0L), (classguid?.value ?: 0L), (devicedescription?.value ?: 0L), (hwndparent?.value ?: 0L), creationflags.toInt(), (deviceinfodata?.value ?: 0L))

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceA(deviceinfoset, (deviceinfodata?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (referencestring?.value ?: 0L), creationflags.toInt(), (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset, (deviceinterfacedata?.value ?: 0L), reserved.toInt(), samdesired.toInt(), (infhandle?.value ?: 0L), (infsectionname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset, (deviceinterfacedata?.value ?: 0L), reserved.toInt(), samdesired.toInt(), (infhandle?.value ?: 0L), (infsectionname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceW(deviceinfoset, (deviceinfodata?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (referencestring?.value ?: 0L), creationflags.toInt(), (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDevRegKey(deviceinfoset, (deviceinfodata?.value ?: 0L), scope.toInt(), hwprofile.toInt(), keytype.toInt())

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInfo(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceData(deviceinfoset, (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceRegKey(deviceinfoset, (deviceinterfacedata?.value ?: 0L), reserved.toInt())

public actual fun setupDiDestroyClassImageList(classimagelistdata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyClassImageList((classimagelistdata?.value ?: 0L))

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDeviceInfoList(deviceinfoset)

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDriverInfoList(deviceinfoset, (deviceinfodata?.value ?: 0L), drivertype.toInt())

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    0

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInfo(deviceinfoset, memberindex.toInt(), (deviceinfodata?.value ?: 0L))

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, memberindex: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInterfaces(deviceinfoset, (deviceinfodata?.value ?: 0L), (interfaceclassguid?.value ?: 0L), memberindex.toInt(), (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoA(deviceinfoset, (deviceinfodata?.value ?: 0L), drivertype.toInt(), memberindex.toInt(), (driverinfodata?.value ?: 0L))

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoW(deviceinfoset, (deviceinfodata?.value ?: 0L), drivertype.toInt(), memberindex.toInt(), (driverinfodata?.value ?: 0L))

public actual fun setupDiGetActualModelsSectionA(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionA((context?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (infsectionwithext?.value ?: 0L), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetActualModelsSectionW(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionW((context?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (infsectionwithext?.value ?: 0L), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetActualSectionToInstallA(infhandle: COpaquePointer?, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallA((infhandle?.value ?: 0L), (infsectionname?.value ?: 0L), (infsectionwithext?.value ?: 0L), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L), (extension?.value ?: 0L))

public actual fun setupDiGetActualSectionToInstallExA(infhandle: COpaquePointer?, infsectionname: Pcstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExA((infhandle?.value ?: 0L), (infsectionname?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (infsectionwithext?.value ?: 0L), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L), (extension?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetActualSectionToInstallExW(infhandle: COpaquePointer?, infsectionname: Pcwstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExW((infhandle?.value ?: 0L), (infsectionname?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (infsectionwithext?.value ?: 0L), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L), (extension?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetActualSectionToInstallW(infhandle: COpaquePointer?, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallW((infhandle?.value ?: 0L), (infsectionname?.value ?: 0L), (infsectionwithext?.value ?: 0L), infsectionwithextsize.toInt(), (requiredsize?.value ?: 0L), (extension?.value ?: 0L))

public actual fun setupDiGetClassBitmapIndex(classguid: COpaquePointer?, miniiconindex: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassBitmapIndex((classguid?.value ?: 0L), (miniiconindex?.value ?: 0L))

public actual fun setupDiGetClassDescriptionA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionA((classguid?.value ?: 0L), (classdescription?.value ?: 0L), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetClassDescriptionExA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExA((classguid?.value ?: 0L), (classdescription?.value ?: 0L), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassDescriptionExW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExW((classguid?.value ?: 0L), (classdescription?.value ?: 0L), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassDescriptionW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionW((classguid?.value ?: 0L), (classdescription?.value ?: 0L), classdescriptionsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (propertysheetheader?.value ?: 0L), propertysheetheaderpagelistsize.toInt(), (requiredsize?.value ?: 0L), propertysheettype.toInt())

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (propertysheetheader?.value ?: 0L), propertysheetheaderpagelistsize.toInt(), (requiredsize?.value ?: 0L), propertysheettype.toInt())

public actual fun setupDiGetClassDevsA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsA((classguid?.value ?: 0L), (enumerator?.value ?: 0L), (hwndparent?.value ?: 0L), flags.toInt())

public actual fun setupDiGetClassDevsExA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExA((classguid?.value ?: 0L), (enumerator?.value ?: 0L), (hwndparent?.value ?: 0L), flags.toInt(), deviceinfoset, (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassDevsExW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExW((classguid?.value ?: 0L), (enumerator?.value ?: 0L), (hwndparent?.value ?: 0L), flags.toInt(), deviceinfoset, (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassDevsW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsW((classguid?.value ?: 0L), (enumerator?.value ?: 0L), (hwndparent?.value ?: 0L), flags.toInt())

public actual fun setupDiGetClassImageIndex(classimagelistdata: COpaquePointer?, classguid: COpaquePointer?, imageindex: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageIndex((classimagelistdata?.value ?: 0L), (classguid?.value ?: 0L), (imageindex?.value ?: 0L))

public actual fun setupDiGetClassImageList(classimagelistdata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageList((classimagelistdata?.value ?: 0L))

public actual fun setupDiGetClassImageListExA(classimagelistdata: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExA((classimagelistdata?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassImageListExW(classimagelistdata: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExW((classimagelistdata?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (classinstallparams?.value ?: 0L), classinstallparamssize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (classinstallparams?.value ?: 0L), classinstallparamssize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyExW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L), flags.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeys((classguid?.value ?: 0L), (propertykeyarray?.value ?: 0L), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L), flags.toInt())

public actual fun setupDiGetClassPropertyKeysExW(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeysExW((classguid?.value ?: 0L), (propertykeyarray?.value ?: 0L), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L), flags.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L), flags.toInt())

public actual fun setupDiGetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyA((classguid?.value ?: 0L), property.toInt(), (propertyregdatatype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyW((classguid?.value ?: 0L), property.toInt(), (propertyregdatatype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyA(deviceinfoset, (deviceinfodata?.value ?: 0L), (custompropertyname?.value ?: 0L), flags.toInt(), (propertyregdatatype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyW(deviceinfoset, (deviceinfodata?.value ?: 0L), (custompropertyname?.value ?: 0L), flags.toInt(), (propertyregdatatype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListClass(deviceinfoset, (classguid?.value ?: 0L))

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailA(deviceinfoset, (deviceinfosetdetaildata?.value ?: 0L))

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailW(deviceinfoset, (deviceinfosetdetaildata?.value ?: 0L))

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (deviceinstallparams?.value ?: 0L))

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (deviceinstallparams?.value ?: 0L))

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdA(deviceinfoset, (deviceinfodata?.value ?: 0L), (deviceinstanceid?.value ?: 0L), deviceinstanceidsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdW(deviceinfoset, (deviceinfodata?.value ?: 0L), (deviceinstanceid?.value ?: 0L), deviceinstanceidsize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliasdeviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceAlias(deviceinfoset, (deviceinterfacedata?.value ?: 0L), (aliasinterfaceclassguid?.value ?: 0L), (aliasdeviceinterfacedata?.value ?: 0L))

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailA(deviceinfoset, (deviceinterfacedata?.value ?: 0L), (deviceinterfacedetaildata?.value ?: 0L), deviceinterfacedetaildatasize.toInt(), (requiredsize?.value ?: 0L), (deviceinfodata?.value ?: 0L))

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailW(deviceinfoset, (deviceinterfacedata?.value ?: 0L), (deviceinterfacedetaildata?.value ?: 0L), deviceinterfacedetaildatasize.toInt(), (requiredsize?.value ?: 0L), (deviceinfodata?.value ?: 0L))

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyKeys(deviceinfoset, (deviceinterfacedata?.value ?: 0L), (propertykeyarray?.value ?: 0L), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L), flags.toInt())

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyW(deviceinfoset, (deviceinterfacedata?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L), flags.toInt())

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyKeys(deviceinfoset, (deviceinfodata?.value ?: 0L), (propertykeyarray?.value ?: 0L), propertykeycount.toInt(), (requiredpropertykeycount?.value ?: 0L), flags.toInt())

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyW(deviceinfoset, (deviceinfodata?.value ?: 0L), (propertykey?.value ?: 0L), (propertytype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L), flags.toInt())

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyA(deviceinfoset, (deviceinfodata?.value ?: 0L), property.toInt(), (propertyregdatatype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyW(deviceinfoset, (deviceinfodata?.value ?: 0L), property.toInt(), (propertyregdatatype?.value ?: 0L), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailA(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), (driverinfodetaildata?.value ?: 0L), driverinfodetaildatasize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailW(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), (driverinfodetaildata?.value ?: 0L), driverinfodetaildatasize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), (driverinstallparams?.value ?: 0L))

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), (driverinstallparams?.value ?: 0L))

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), (friendlyname?.value ?: 0L), friendlynamesize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), (friendlyname?.value ?: 0L), friendlynamesize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), (friendlyname?.value ?: 0L), friendlynamesize.toInt(), (requiredsize?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), (friendlyname?.value ?: 0L), friendlynamesize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetHwProfileList(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileList((hwprofilelist?.value ?: 0L), hwprofilelistsize.toInt(), (requiredsize?.value ?: 0L), (currentlyactiveindex?.value ?: 0L))

public actual fun setupDiGetHwProfileListExA(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExA((hwprofilelist?.value ?: 0L), hwprofilelistsize.toInt(), (requiredsize?.value ?: 0L), (currentlyactiveindex?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetHwProfileListExW(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExW((hwprofilelist?.value ?: 0L), hwprofilelistsize.toInt(), (requiredsize?.value ?: 0L), (currentlyactiveindex?.value ?: 0L), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassA((infname?.value ?: 0L), (classguid?.value ?: 0L), (classname?.value ?: 0L), classnamesize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassW((infname?.value ?: 0L), (classguid?.value ?: 0L), (classname?.value ?: 0L), classnamesize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDevice(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverA(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L))

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverW(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L))

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, installwizarddata: COpaquePointer?, pagetype: UInt, flags: UInt): Hpropsheetpage =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetWizardPage(deviceinfoset, (deviceinfodata?.value ?: 0L), (installwizarddata?.value ?: 0L), pagetype.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassA((hwndparent?.value ?: 0L), (inffilename?.value ?: 0L), flags.toInt(), (filequeue?.value ?: 0L))

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExA((hwndparent?.value ?: 0L), (inffilename?.value ?: 0L), flags.toInt(), (filequeue?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (reserved1?.value ?: 0L), (reserved2?.value ?: 0L))

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExW((hwndparent?.value ?: 0L), (inffilename?.value ?: 0L), flags.toInt(), (filequeue?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (reserved1?.value ?: 0L), (reserved2?.value ?: 0L))

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassW((hwndparent?.value ?: 0L), (inffilename?.value ?: 0L), flags.toInt(), (filequeue?.value ?: 0L))

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDevice(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDeviceInterfaces(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDriverFiles(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiLoadClassIcon(classguid: COpaquePointer?, largeicon: COpaquePointer?, miniiconindex: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadClassIcon((classguid?.value ?: 0L), (largeicon?.value ?: 0L), (miniiconindex?.value ?: 0L))

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadDeviceIcon(deviceinfoset, (deviceinfodata?.value ?: 0L), cxicon.toInt(), cyicon.toInt(), flags.toInt(), (hicon?.value ?: 0L))

public actual fun setupDiOpenClassRegKey(classguid: COpaquePointer?, samdesired: UInt): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKey((classguid?.value ?: 0L), samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiOpenClassRegKeyExA(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: COpaquePointer?): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExA((classguid?.value ?: 0L), samdesired.toInt(), flags.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiOpenClassRegKeyExW(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExW((classguid?.value ?: 0L), samdesired.toInt(), flags.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDevRegKey(deviceinfoset, (deviceinfodata?.value ?: 0L), scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoA(deviceinfoset, (deviceinstanceid?.value ?: 0L), (hwndparent?.value ?: 0L), openflags.toInt(), (deviceinfodata?.value ?: 0L))

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoW(deviceinfoset, (deviceinstanceid?.value ?: 0L), (hwndparent?.value ?: 0L), openflags.toInt(), (deviceinfodata?.value ?: 0L))

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceA(deviceinfoset, (devicepath?.value ?: 0L), openflags.toInt(), (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt): Hkey =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceRegKey(deviceinfoset, (deviceinterfacedata?.value ?: 0L), reserved.toInt(), samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceW(deviceinfoset, (devicepath?.value ?: 0L), openflags.toInt(), (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterCoDeviceInstallers(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: COpaquePointer?, dupdeviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterDeviceInfo(deviceinfoset, (deviceinfodata?.value ?: 0L), flags.toInt(), 0L, (comparecontext?.value ?: 0L), (dupdeviceinfodata?.value ?: 0L))

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDevice(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDeviceInterface(deviceinfoset, (deviceinterfacedata?.value ?: 0L))

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRestartDevices(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectBestCompatDrv(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectDevice(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectOEMDrv((hwndparent?.value ?: 0L), deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (classinstallparams?.value ?: 0L), classinstallparamssize.toInt())

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (classinstallparams?.value ?: 0L), classinstallparamssize.toInt())

public actual fun setupDiSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyExW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), flags.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyW((classguid?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), flags.toInt())

public actual fun setupDiSetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyA((classguid?.value ?: 0L), property.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiSetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyW((classguid?.value ?: 0L), property.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), (machinename?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (deviceinstallparams?.value ?: 0L))

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (deviceinstallparams?.value ?: 0L))

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfaceDefault(deviceinfoset, (deviceinterfacedata?.value ?: 0L), flags.toInt(), (reserved?.value ?: 0L))

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfacePropertyW(deviceinfoset, (deviceinterfacedata?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), flags.toInt())

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDevicePropertyW(deviceinfoset, (deviceinfodata?.value ?: 0L), (propertykey?.value ?: 0L), propertytype.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt(), flags.toInt())

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyA(deviceinfoset, (deviceinfodata?.value ?: 0L), property.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt())

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyW(deviceinfoset, (deviceinfodata?.value ?: 0L), property.toInt(), (propertybuffer?.value ?: 0L), propertybuffersize.toInt())

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsA(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), (driverinstallparams?.value ?: 0L))

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsW(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L), (driverinstallparams?.value ?: 0L))

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDevice(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverA(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L))

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverW(deviceinfoset, (deviceinfodata?.value ?: 0L), (driverinfodata?.value ?: 0L))

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiUnremoveDevice(deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupDuplicateDiskSpaceListA(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListA((diskspace?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupDuplicateDiskSpaceListW(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListW((diskspace?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupEnumInfSectionsA(infhandle: COpaquePointer?, index: UInt, buffer: Pstr, size: UInt, sizeneeded: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsA((infhandle?.value ?: 0L), index.toInt(), (buffer?.value ?: 0L), size.toInt(), (sizeneeded?.value ?: 0L))

public actual fun setupEnumInfSectionsW(infhandle: COpaquePointer?, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsW((infhandle?.value ?: 0L), index.toInt(), (buffer?.value ?: 0L), size.toInt(), (sizeneeded?.value ?: 0L))

public actual fun setupFindFirstLineA(infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineA((infhandle?.value ?: 0L), (section?.value ?: 0L), (key?.value ?: 0L), (context?.value ?: 0L))

public actual fun setupFindFirstLineW(infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineW((infhandle?.value ?: 0L), (section?.value ?: 0L), (key?.value ?: 0L), (context?.value ?: 0L))

public actual fun setupFindNextLine(contextin: COpaquePointer?, contextout: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextLine((contextin?.value ?: 0L), (contextout?.value ?: 0L))

public actual fun setupFindNextMatchLineA(contextin: COpaquePointer?, key: Pcstr, contextout: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineA((contextin?.value ?: 0L), (key?.value ?: 0L), (contextout?.value ?: 0L))

public actual fun setupFindNextMatchLineW(contextin: COpaquePointer?, key: Pcwstr, contextout: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineW((contextin?.value ?: 0L), (key?.value ?: 0L), (contextout?.value ?: 0L))

public actual fun setupFreeSourceListA(list: COpaquePointer?, count: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListA((list?.value ?: 0L), count.toInt())

public actual fun setupFreeSourceListW(list: COpaquePointer?, count: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListW((list?.value ?: 0L), count.toInt())

public actual fun setupGetBackupInformationA(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationA((queuehandle?.value ?: 0L), (backupparams?.value ?: 0L))

public actual fun setupGetBackupInformationW(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationW((queuehandle?.value ?: 0L), (backupparams?.value ?: 0L))

public actual fun setupGetBinaryField(context: COpaquePointer?, fieldindex: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBinaryField((context?.value ?: 0L), fieldindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetFieldCount(context: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFieldCount((context?.value ?: 0L)).toUInt()

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoA((sourcefilename?.value ?: 0L), (actualsourcefilename?.value ?: 0L), (sourcefilesize?.value ?: 0L), (targetfilesize?.value ?: 0L), (compressiontype?.value ?: 0L)).toUInt()

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExA((sourcefilename?.value ?: 0L), (actualsourcefilenamebuffer?.value ?: 0L), actualsourcefilenamebufferlen.toInt(), (requiredbufferlen?.value ?: 0L), (sourcefilesize?.value ?: 0L), (targetfilesize?.value ?: 0L), (compressiontype?.value ?: 0L))

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExW((sourcefilename?.value ?: 0L), (actualsourcefilenamebuffer?.value ?: 0L), actualsourcefilenamebufferlen.toInt(), (requiredbufferlen?.value ?: 0L), (sourcefilesize?.value ?: 0L), (targetfilesize?.value ?: 0L), (compressiontype?.value ?: 0L))

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoW((sourcefilename?.value ?: 0L), (actualsourcefilename?.value ?: 0L), (sourcefilesize?.value ?: 0L), (targetfilesize?.value ?: 0L), (compressiontype?.value ?: 0L)).toUInt()

public actual fun setupGetFileQueueCount(filequeue: COpaquePointer?, subqueuefileop: UInt, numoperations: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueCount((filequeue?.value ?: 0L), subqueuefileop.toInt(), (numoperations?.value ?: 0L))

public actual fun setupGetFileQueueFlags(filequeue: COpaquePointer?, flags: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueFlags((filequeue?.value ?: 0L), (flags?.value ?: 0L))

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: COpaquePointer?, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationA((filename?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (localename?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: COpaquePointer?, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationW((filename?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (localename?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListA((directorypath?.value ?: 0L), infstyle.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListW((directorypath?.value ?: 0L), infstyle.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfInformationA(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationA((infspec?.value ?: 0L), searchcontrol.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfInformationW(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationW((infspec?.value ?: 0L), searchcontrol.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameA((driverstorelocation?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameW((driverstorelocation?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetIntField(context: COpaquePointer?, fieldindex: UInt, integervalue: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetIntField((context?.value ?: 0L), fieldindex.toInt(), (integervalue?.value ?: 0L))

public actual fun setupGetLineByIndexA(infhandle: COpaquePointer?, section: Pcstr, index: UInt, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexA((infhandle?.value ?: 0L), (section?.value ?: 0L), index.toInt(), (context?.value ?: 0L))

public actual fun setupGetLineByIndexW(infhandle: COpaquePointer?, section: Pcwstr, index: UInt, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexW((infhandle?.value ?: 0L), (section?.value ?: 0L), index.toInt(), (context?.value ?: 0L))

public actual fun setupGetLineCountA(infhandle: COpaquePointer?, section: Pcstr): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountA((infhandle?.value ?: 0L), (section?.value ?: 0L))

public actual fun setupGetLineCountW(infhandle: COpaquePointer?, section: Pcwstr): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountW((infhandle?.value ?: 0L), (section?.value ?: 0L))

public actual fun setupGetLineTextA(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextA((context?.value ?: 0L), (infhandle?.value ?: 0L), (section?.value ?: 0L), (key?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetLineTextW(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextW((context?.value ?: 0L), (infhandle?.value ?: 0L), (section?.value ?: 0L), (key?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetMultiSzFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldA((context?.value ?: 0L), fieldindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetMultiSzFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldW((context?.value ?: 0L), fieldindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetNonInteractiveMode(): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetNonInteractiveMode()

public actual fun setupGetSourceFileLocationA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, sourceid: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationA((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (filename?.value ?: 0L), (sourceid?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetSourceFileLocationW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, sourceid: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationW((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (filename?.value ?: 0L), (sourceid?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetSourceFileSizeA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, section: Pcstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeA((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (filename?.value ?: 0L), (section?.value ?: 0L), (filesize?.value ?: 0L), roundingfactor.toInt())

public actual fun setupGetSourceFileSizeW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, section: Pcwstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeW((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (filename?.value ?: 0L), (section?.value ?: 0L), (filesize?.value ?: 0L), roundingfactor.toInt())

public actual fun setupGetSourceInfoA(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoA((infhandle?.value ?: 0L), sourceid.toInt(), infodesired.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetSourceInfoW(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoW((infhandle?.value ?: 0L), sourceid.toInt(), infodesired.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetStringFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldA((context?.value ?: 0L), fieldindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetStringFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldW((context?.value ?: 0L), fieldindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetTargetPathA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathA((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (section?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetTargetPathW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathW((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (section?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupGetThreadLogToken(): ULong =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetThreadLogToken().toULong()

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallback((ownerwindow?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallbackEx((ownerwindow?.value ?: 0L), (alternateprogresswindow?.value ?: 0L), progressmessage.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogA((logfilename?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogW((logfilename?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupInstallFileA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileA((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (sourcefile?.value ?: 0L), (sourcepathroot?.value ?: 0L), (destinationname?.value ?: 0L), copystyle.toInt(), 0L, (context?.value ?: 0L))

public actual fun setupInstallFileExA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExA((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (sourcefile?.value ?: 0L), (sourcepathroot?.value ?: 0L), (destinationname?.value ?: 0L), copystyle.toInt(), 0L, (context?.value ?: 0L), (filewasinuse?.value ?: 0L))

public actual fun setupInstallFileExW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExW((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (sourcefile?.value ?: 0L), (sourcepathroot?.value ?: 0L), (destinationname?.value ?: 0L), copystyle.toInt(), 0L, (context?.value ?: 0L), (filewasinuse?.value ?: 0L))

public actual fun setupInstallFileW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileW((infhandle?.value ?: 0L), (infcontext?.value ?: 0L), (sourcefile?.value ?: 0L), (sourcepathroot?.value ?: 0L), (destinationname?.value ?: 0L), copystyle.toInt(), 0L, (context?.value ?: 0L))

public actual fun setupInstallFilesFromInfSectionA(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionA((infhandle?.value ?: 0L), (layoutinfhandle?.value ?: 0L), (filequeue?.value ?: 0L), (sectionname?.value ?: 0L), (sourcerootpath?.value ?: 0L), copyflags.toInt())

public actual fun setupInstallFilesFromInfSectionW(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionW((infhandle?.value ?: 0L), (layoutinfhandle?.value ?: 0L), (filequeue?.value ?: 0L), (sectionname?.value ?: 0L), (sourcerootpath?.value ?: 0L), copyflags.toInt())

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionA((owner?.value ?: 0L), (infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt(), (relativekeyroot?.value ?: 0L), (sourcerootpath?.value ?: 0L), copyflags.toInt(), 0L, (context?.value ?: 0L), deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionW((owner?.value ?: 0L), (infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt(), (relativekeyroot?.value ?: 0L), (sourcerootpath?.value ?: 0L), copyflags.toInt(), 0L, (context?.value ?: 0L), deviceinfoset, (deviceinfodata?.value ?: 0L))

public actual fun setupInstallServicesFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionA((infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt())

public actual fun setupInstallServicesFromInfSectionExA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExA((infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt(), deviceinfoset, (deviceinfodata?.value ?: 0L), (reserved1?.value ?: 0L), (reserved2?.value ?: 0L))

public actual fun setupInstallServicesFromInfSectionExW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExW((infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt(), deviceinfoset, (deviceinfodata?.value ?: 0L), (reserved1?.value ?: 0L), (reserved2?.value ?: 0L))

public actual fun setupInstallServicesFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionW((infhandle?.value ?: 0L), (sectionname?.value ?: 0L), flags.toInt())

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetA((cabinetfile?.value ?: 0L), reserved.toInt(), 0L, (context?.value ?: 0L))

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetW((cabinetfile?.value ?: 0L), reserved.toInt(), 0L, (context?.value ?: 0L))

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorA((messagestring?.value ?: 0L), severity.toInt())

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorW((messagestring?.value ?: 0L), severity.toInt())

public actual fun setupLogFileA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileA((fileloghandle?.value ?: 0L), (logsectionname?.value ?: 0L), (sourcefilename?.value ?: 0L), (targetfilename?.value ?: 0L), checksum.toInt(), (disktagfile?.value ?: 0L), (diskdescription?.value ?: 0L), (otherinfo?.value ?: 0L), flags.toInt())

public actual fun setupLogFileW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileW((fileloghandle?.value ?: 0L), (logsectionname?.value ?: 0L), (sourcefilename?.value ?: 0L), (targetfilename?.value ?: 0L), checksum.toInt(), (disktagfile?.value ?: 0L), (diskdescription?.value ?: 0L), (otherinfo?.value ?: 0L), flags.toInt())

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileA((filename?.value ?: 0L), (infhandle?.value ?: 0L), (errorline?.value ?: 0L))

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileW((filename?.value ?: 0L), (infhandle?.value ?: 0L), (errorline?.value ?: 0L))

public actual fun setupOpenFileQueue(): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenFileQueue().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileA((filename?.value ?: 0L), (infclass?.value ?: 0L), infstyle.toInt(), (errorline?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileW((filename?.value ?: 0L), (infclass?.value ?: 0L), infstyle.toInt(), (errorline?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupOpenLog(erase: Bool): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenLog(erase)

public actual fun setupOpenMasterInf(): COpaquePointer? =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenMasterInf().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setupPrepareQueueForRestoreA(queuehandle: COpaquePointer?, backuppath: Pcstr, restoreflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreA((queuehandle?.value ?: 0L), (backuppath?.value ?: 0L), restoreflags.toInt())

public actual fun setupPrepareQueueForRestoreW(queuehandle: COpaquePointer?, backuppath: Pcwstr, restoreflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreW((queuehandle?.value ?: 0L), (backuppath?.value ?: 0L), restoreflags.toInt())

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskA((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (diskname?.value ?: 0L), (pathtosource?.value ?: 0L), (filesought?.value ?: 0L), (tagfile?.value ?: 0L), diskpromptstyle.toInt(), (pathbuffer?.value ?: 0L), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L)).toUInt()

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskW((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (diskname?.value ?: 0L), (pathtosource?.value ?: 0L), (filesought?.value ?: 0L), (tagfile?.value ?: 0L), diskpromptstyle.toInt(), (pathbuffer?.value ?: 0L), pathbuffersize.toInt(), (pathrequiredsize?.value ?: 0L)).toUInt()

public actual fun setupPromptReboot(filequeue: COpaquePointer?, owner: Hwnd, scanonly: Bool): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptReboot((filequeue?.value ?: 0L), (owner?.value ?: 0L), scanonly)

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListA((diskspace?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListW((diskspace?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryFileLogA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogA((fileloghandle?.value ?: 0L), (logsectionname?.value ?: 0L), (targetfilename?.value ?: 0L), desiredinfo, (dataout?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryFileLogW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogW((fileloghandle?.value ?: 0L), (logsectionname?.value ?: 0L), (targetfilename?.value ?: 0L), desiredinfo, (dataout?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryInfFileInformationA(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationA((infinformation?.value ?: 0L), infindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryInfFileInformationW(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationW((infinformation?.value ?: 0L), infindex.toInt(), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryInfOriginalFileInformationA(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationA((infinformation?.value ?: 0L), infindex.toInt(), (alternateplatforminfo?.value ?: 0L), (originalfileinfo?.value ?: 0L))

public actual fun setupQueryInfOriginalFileInformationW(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationW((infinformation?.value ?: 0L), infindex.toInt(), (alternateplatforminfo?.value ?: 0L), (originalfileinfo?.value ?: 0L))

public actual fun setupQueryInfVersionInformationA(infinformation: COpaquePointer?, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationA((infinformation?.value ?: 0L), infindex.toInt(), (key?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQueryInfVersionInformationW(infinformation: COpaquePointer?, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationW((infinformation?.value ?: 0L), infindex.toInt(), (key?.value ?: 0L), (returnbuffer?.value ?: 0L), returnbuffersize.toInt(), (requiredsize?.value ?: 0L))

public actual fun setupQuerySourceListA(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListA(flags.toInt(), (list?.value ?: 0L), (count?.value ?: 0L))

public actual fun setupQuerySourceListW(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListW(flags.toInt(), (list?.value ?: 0L), (count?.value ?: 0L))

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: COpaquePointer?, drivespec: Pcstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveA((diskspace?.value ?: 0L), (drivespec?.value ?: 0L), (spacerequired?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: COpaquePointer?, drivespec: Pcwstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveW((diskspace?.value ?: 0L), (drivespec?.value ?: 0L), (spacerequired?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupQueueCopyA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyA((queuehandle?.value ?: 0L), (sourcerootpath?.value ?: 0L), (sourcepath?.value ?: 0L), (sourcefilename?.value ?: 0L), (sourcedescription?.value ?: 0L), (sourcetagfile?.value ?: 0L), (targetdirectory?.value ?: 0L), (targetfilename?.value ?: 0L), copystyle.toInt())

public actual fun setupQueueCopyIndirectA(copyparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectA((copyparams?.value ?: 0L))

public actual fun setupQueueCopyIndirectW(copyparams: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectW((copyparams?.value ?: 0L))

public actual fun setupQueueCopySectionA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionA((queuehandle?.value ?: 0L), (sourcerootpath?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (section?.value ?: 0L), copystyle.toInt())

public actual fun setupQueueCopySectionW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionW((queuehandle?.value ?: 0L), (sourcerootpath?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (section?.value ?: 0L), copystyle.toInt())

public actual fun setupQueueCopyW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyW((queuehandle?.value ?: 0L), (sourcerootpath?.value ?: 0L), (sourcepath?.value ?: 0L), (sourcefilename?.value ?: 0L), (sourcedescription?.value ?: 0L), (sourcetagfile?.value ?: 0L), (targetdirectory?.value ?: 0L), (targetfilename?.value ?: 0L), copystyle.toInt())

public actual fun setupQueueDefaultCopyA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyA((queuehandle?.value ?: 0L), (infhandle?.value ?: 0L), (sourcerootpath?.value ?: 0L), (sourcefilename?.value ?: 0L), (targetfilename?.value ?: 0L), copystyle.toInt())

public actual fun setupQueueDefaultCopyW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyW((queuehandle?.value ?: 0L), (infhandle?.value ?: 0L), (sourcerootpath?.value ?: 0L), (sourcefilename?.value ?: 0L), (targetfilename?.value ?: 0L), copystyle.toInt())

public actual fun setupQueueDeleteA(queuehandle: COpaquePointer?, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteA((queuehandle?.value ?: 0L), (pathpart1?.value ?: 0L), (pathpart2?.value ?: 0L))

public actual fun setupQueueDeleteSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionA((queuehandle?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (section?.value ?: 0L))

public actual fun setupQueueDeleteSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionW((queuehandle?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (section?.value ?: 0L))

public actual fun setupQueueDeleteW(queuehandle: COpaquePointer?, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteW((queuehandle?.value ?: 0L), (pathpart1?.value ?: 0L), (pathpart2?.value ?: 0L))

public actual fun setupQueueRenameA(queuehandle: COpaquePointer?, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameA((queuehandle?.value ?: 0L), (sourcepath?.value ?: 0L), (sourcefilename?.value ?: 0L), (targetpath?.value ?: 0L), (targetfilename?.value ?: 0L))

public actual fun setupQueueRenameSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionA((queuehandle?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (section?.value ?: 0L))

public actual fun setupQueueRenameSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionW((queuehandle?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (section?.value ?: 0L))

public actual fun setupQueueRenameW(queuehandle: COpaquePointer?, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameW((queuehandle?.value ?: 0L), (sourcepath?.value ?: 0L), (sourcefilename?.value ?: 0L), (targetpath?.value ?: 0L), (targetfilename?.value ?: 0L))

public actual fun setupRemoveFileLogEntryA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryA((fileloghandle?.value ?: 0L), (logsectionname?.value ?: 0L), (targetfilename?.value ?: 0L))

public actual fun setupRemoveFileLogEntryW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryW((fileloghandle?.value ?: 0L), (logsectionname?.value ?: 0L), (targetfilename?.value ?: 0L))

public actual fun setupRemoveFromDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListA((diskspace?.value ?: 0L), (targetfilespec?.value ?: 0L), operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupRemoveFromDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListW((diskspace?.value ?: 0L), (targetfilespec?.value ?: 0L), operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListA(flags.toInt(), (source?.value ?: 0L))

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListW(flags.toInt(), (source?.value ?: 0L))

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListA((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (layoutinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListW((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (layoutinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListA((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListW((diskspace?.value ?: 0L), (infhandle?.value ?: 0L), (listinfhandle?.value ?: 0L), (sectionname?.value ?: 0L), operation.toInt(), (reserved1?.value ?: 0L), reserved2.toInt())

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorA((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (sourcefile?.value ?: 0L), (targetfile?.value ?: 0L), win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorW((hwndparent?.value ?: 0L), (dialogtitle?.value ?: 0L), (sourcefile?.value ?: 0L), (targetfile?.value ?: 0L), win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupScanFileQueueA(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueA((filequeue?.value ?: 0L), flags.toInt(), (window?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (result?.value ?: 0L))

public actual fun setupScanFileQueueW(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueW((filequeue?.value ?: 0L), flags.toInt(), (window?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (result?.value ?: 0L))

public actual fun setupSetDirectoryIdA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdA((infhandle?.value ?: 0L), id.toInt(), (directory?.value ?: 0L))

public actual fun setupSetDirectoryIdExA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExA((infhandle?.value ?: 0L), id.toInt(), (directory?.value ?: 0L), flags.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L))

public actual fun setupSetDirectoryIdExW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExW((infhandle?.value ?: 0L), id.toInt(), (directory?.value ?: 0L), flags.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L))

public actual fun setupSetDirectoryIdW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdW((infhandle?.value ?: 0L), id.toInt(), (directory?.value ?: 0L))

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformA((queuehandle?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (alternatedefaultcatalogfile?.value ?: 0L))

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformW((queuehandle?.value ?: 0L), (alternateplatforminfo?.value ?: 0L), (alternatedefaultcatalogfile?.value ?: 0L))

public actual fun setupSetFileQueueFlags(filequeue: COpaquePointer?, flagmask: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueFlags((filequeue?.value ?: 0L), flagmask.toInt(), flags.toInt())

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetNonInteractiveMode(noninteractiveflag)

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideA((override?.value ?: 0L))

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideW((override?.value ?: 0L))

public actual fun setupSetSourceListA(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListA(flags.toInt(), (sourcelist?.value ?: 0L), sourcecount.toInt())

public actual fun setupSetSourceListW(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListW(flags.toInt(), (sourcelist?.value ?: 0L), sourcecount.toInt())

public actual fun setupSetThreadLogToken(logtoken: ULong) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetThreadLogToken(logtoken.toLong())
}

public actual fun setupTermDefaultQueueCallback(context: COpaquePointer?) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupTermDefaultQueueCallback((context?.value ?: 0L))
}

public actual fun setupTerminateFileLog(fileloghandle: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupTerminateFileLog((fileloghandle?.value ?: 0L))

public actual fun setupUninstallNewlyCopiedInfs(filequeue: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallNewlyCopiedInfs((filequeue?.value ?: 0L), flags.toInt(), (reserved?.value ?: 0L))

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfA((inffilename?.value ?: 0L), flags.toInt(), (reserved?.value ?: 0L))

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfW((inffilename?.value ?: 0L), flags.toInt(), (reserved?.value ?: 0L))

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileA((infname?.value ?: 0L), (altplatforminfo?.value ?: 0L), (infsignerinfo?.value ?: 0L))

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileW((infname?.value ?: 0L), (altplatforminfo?.value ?: 0L), (infsignerinfo?.value ?: 0L))

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLog(logtoken.toLong(), category.toInt(), flags.toInt(), (messagestr?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogError(logtoken.toLong(), category.toInt(), logflags.toInt(), error.toInt(), (messagestr?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: COpaquePointer?, context: COpaquePointer?) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogInfLine(logtoken.toLong(), flags.toInt(), (infhandle?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesA((hwndparent?.value ?: 0L), (hardwareid?.value ?: 0L), (fullinfpath?.value ?: 0L), installflags.toInt(), (brebootrequired?.value ?: 0L))

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesW((hwndparent?.value ?: 0L), (hardwareid?.value ?: 0L), (fullinfpath?.value ?: 0L), installflags.toInt(), (brebootrequired?.value ?: 0L))
