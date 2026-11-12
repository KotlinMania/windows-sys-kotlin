@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp.Priority
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Hpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderaV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderwV2
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

private object WindowsWin32DevicesDeviceanddriverinstallationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(dwtimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(plclogconf: Long, dndevinst: Int, priority: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(plclogconf: Long, dndevinst: Int, priority: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(dndevinst: Int, pszid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(dndevinst: Int, pszid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(dndevinst: Int, pszid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(dndevinst: Int, pszid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(prdresdes: Long, lclogconf: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(prdresdes: Long, lclogconf: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(uncservername: Long, phmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(uncservername: Long, phmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(pdndevinst: Long, pdeviceid: Long, dnparent: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(prlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(classguid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(classguid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(dndevnode: Int, ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, pbconflictdetected: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, pbconflictdetected: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(rlhold: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(ulclassindex: Int, classguid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(ulclassindex: Int, classguid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(ulenumindex: Int, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(pullstart: Long, ullstart: Long, ullength: Int, ullalignment: Long, ullend: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(rlh: Long, pullstart: Long, pullend: Long, preelement: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(lclogconftobefreed: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(lclogconftobefreed: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(lclogconf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(prdresdes: Long, rdresdes: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(prdresdes: Long, rdresdes: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(rdresdes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(clconflictlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(classguid: Long, pszkeyname: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(classguid: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(classguid: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(classguid: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(classguid: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(classguid: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(classguid: Long, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(classguid: Long, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(puldepth: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(puldepth: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(dndevinst: Int, pszcustompropertyname: Long, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(dndevinst: Int, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(dndevinst: Int, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(dndevinst: Int, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(dndevinst: Int, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(dndevinst: Int, ulproperty: Int, pulregdatatype: Long, buffer: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(pulstatus: Long, pulproblemnumber: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(pulstatus: Long, pulproblemnumber: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(dndevinst: Int, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(pszfilter: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(pullen: Long, pszfilter: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(pullen: Long, pszfilter: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(pullen: Long, pszfilter: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(pullen: Long, pszfilter: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(pullen: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(pullen: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(pszdeviceinterface: Long, aliasinterfaceguid: Long, pszaliasdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(interfaceclassguid: Long, pdeviceid: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(pullen: Long, interfaceclassguid: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(pszdeviceinterface: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(pszdeviceinterface: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Long, propertykeyarray: Long, propertykeycount: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(plclogconf: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(plclogconf: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(pulstate: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(pulstate: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(pdeviceid: Long, ulhardwareprofile: Int, pulvalue: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(ulindex: Int, phwprofileinfo: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(ulindex: Int, phwprofileinfo: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(ulindex: Int, phwprofileinfo: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(ulindex: Int, phwprofileinfo: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(lclogconf: Long, ppriority: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(lclogconf: Long, ppriority: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(plclogconf: Long, lclogconf: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(plclogconf: Long, lclogconf: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(prdresdes: Long, rdresdes: Long, forresource: Int, presourceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(prdresdes: Long, rdresdes: Long, forresource: Int, presourceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(rdresdes: Long, buffer: Long, bufferlen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(rdresdes: Long, buffer: Long, bufferlen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(pulsize: Long, rdresdes: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(pulsize: Long, rdresdes: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(clconflictlist: Long, pulcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(clconflictlist: Long, ulindex: Int, pconflictdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(clconflictlist: Long, ulindex: Int, pconflictdetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(pdndevinst: Long, dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(pdndevinst: Long, dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion(): Short

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(hmachine: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(rlhold: Long, rlhnew: Long, ullmaxvalue: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(pbpresent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(pbpresent: Long, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(wversion: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(wversion: Short, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(pdndevinst: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(pdndevinst: Long, pdeviceid: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(pdndevinst: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(pdndevinst: Long, pdeviceid: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(cmreturncode: Int, defaulterr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(rlhold1: Long, rlhold2: Long, rlhnew: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(prdresdes: Long, rdresdes: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(prdresdes: Long, rdresdes: Long, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(dnfromdevinst: Int, dntodevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(preelement: Long, pullstart: Long, pullend: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(classguid: Long, pszclassname: Long, samdesired: Int, disposition: Int, phkclass: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(dndevnode: Int, samdesired: Int, ulhardwareprofile: Int, disposition: Int, phkdevice: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(dndevnode: Int, samdesired: Int, ulhardwareprofile: Int, disposition: Int, phkdevice: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Long, samdesired: Int, disposition: Int, phkdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(dnancestor: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(pdata: Long, datalen: Int, dndevinst: Int, resourceid: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(pdata: Long, datalen: Int, dndevinst: Int, resourceid: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(pulsize: Long, dndevinst: Int, resourceid: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(pulsize: Long, dndevinst: Int, resourceid: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(dnancestor: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(dnancestor: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(pclconflictlist: Long, dndevinst: Int, resourceid: Int, resourcedata: Long, resourcelen: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(dndevinst: Int, interfaceclassguid: Long, pszreference: Long, pszdeviceinterface: Long, pullength: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(pfilter: Long, pcontext: Long, pcallback: Long, pnotifycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(dnancestor: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(dnancestor: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(dndevinst: Int, pvetotype: Long, pszvetoname: Long, ulnamelength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(classguid: Long, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(classguid: Long, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(dndevinst: Int, ulproblem: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(dndevinst: Int, ulproblem: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(dndevinst: Int, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(dndevinst: Int, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(dndevinst: Int, ulproperty: Int, buffer: Long, ullength: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(pszdeviceinterface: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(pszdeviceinterface: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(ulhardwareprofile: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(ulhardwareprofile: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(pdeviceid: Long, ulconfig: Int, ulvalue: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(ullstartvalue: Long, ullendvalue: Long, rlh: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(dndevinst: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(dndevinst: Int, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(pszdeviceinterface: Long, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(pszdeviceinterface: Long, ulflags: Int, hmachine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(notifycontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(deviceinfoset: Long, deviceinfodata: Long, hwndparent: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(hwndparent: Long, filepath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(hwndparent: Long, infpath: Long, flags: Int, needreboot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(window: Long, modulehandle: Long, commandline: Long, showcommand: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(window: Long, modulehandle: Long, commandline: Long, showcommand: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(diskspace: Long, targetfilespec: Long, filesize: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(diskspace: Long, targetfilespec: Long, filesize: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(diskspace: Long, driveroot: Long, amount: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(diskspace: Long, driveroot: Long, amount: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(queuehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(infhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(owner: Long, queuehandle: Long, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(owner: Long, queuehandle: Long, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, sourcefile: Long, targetpathfile: Long, win32errorcode: Int, style: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, sourcefile: Long, targetpathfile: Long, win32errorcode: Int, style: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(sourceinffilename: Long, oemsourcemedialocation: Long, oemsourcemediatype: Int, copystyle: Int, destinationinffilename: Long, destinationinffilenamesize: Int, requiredsize: Long, destinationinffilenamecomponent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(sourceinffilename: Long, oemsourcemedialocation: Long, oemsourcemediatype: Int, copystyle: Int, destinationinffilename: Long, destinationinffilenamesize: Int, requiredsize: Long, destinationinffilenamecomponent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(sourcefilename: Long, targetfilename: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(sourcefilename: Long, targetfilename: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(context: Long, notification: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(context: Long, notification: Int, param1: Long, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(hwndparent: Long, dialogtitle: Long, file: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(hwndparent: Long, dialogtitle: Long, file: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(diskspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(flags: Int, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(installfunction: Int, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(deviceinfoset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(classname: Long, classguidlist: Long, classguidlistsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(deviceinfoset: Long, devicename: Long, classguid: Long, devicedescription: Long, hwndparent: Long, creationflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(classguid: Long, hwndparent: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(classguid: Long, hwndparent: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(classguid: Long, hwndparent: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(deviceinfoset: Long, devicename: Long, classguid: Long, devicedescription: Long, hwndparent: Long, creationflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, referencestring: Long, creationflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int, infhandle: Long, infsectionname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, referencestring: Long, creationflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(deviceinfoset: Long, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(classimagelistdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(deviceinfoset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(deviceinfoset: Long, memberindex: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(deviceinfoset: Long, deviceinfodata: Long, interfaceclassguid: Long, memberindex: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int, memberindex: Int, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(deviceinfoset: Long, deviceinfodata: Long, drivertype: Int, memberindex: Int, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(context: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(context: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(infhandle: Long, infsectionname: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(infhandle: Long, infsectionname: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(infhandle: Long, infsectionname: Long, alternateplatforminfo: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(infhandle: Long, infsectionname: Long, infsectionwithext: Long, infsectionwithextsize: Int, requiredsize: Long, extension: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(classguid: Long, miniiconindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(classguid: Long, classdescription: Long, classdescriptionsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(deviceinfoset: Long, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: Int, requiredsize: Long, propertysheettype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(deviceinfoset: Long, deviceinfodata: Long, propertysheetheader: Long, propertysheetheaderpagelistsize: Int, requiredsize: Long, propertysheettype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int, deviceinfoset: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int, deviceinfoset: Long, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(classguid: Long, enumerator: Long, hwndparent: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(classimagelistdata: Long, classguid: Long, imageindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(classimagelistdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(classimagelistdata: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(classimagelistdata: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(classguid: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(classguid: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(classguid: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(classguid: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(deviceinfoset: Long, deviceinfodata: Long, custompropertyname: Long, flags: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, custompropertyname: Long, flags: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(deviceinfoset: Long, classguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(deviceinfoset: Long, deviceinfosetdetaildata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(deviceinfoset: Long, deviceinfosetdetaildata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(deviceinfoset: Long, deviceinfodata: Long, deviceinstanceid: Long, deviceinstanceidsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(deviceinfoset: Long, deviceinfodata: Long, deviceinstanceid: Long, deviceinstanceidsize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(deviceinfoset: Long, deviceinterfacedata: Long, aliasinterfaceclassguid: Long, aliasdeviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(deviceinfoset: Long, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: Int, requiredsize: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(deviceinfoset: Long, deviceinterfacedata: Long, deviceinterfacedetaildata: Long, deviceinterfacedetaildatasize: Int, requiredsize: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Long, deviceinterfacedata: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(deviceinfoset: Long, deviceinterfacedata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(deviceinfoset: Long, deviceinfodata: Long, propertykeyarray: Long, propertykeycount: Int, requiredpropertykeycount: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, propertykey: Long, propertytype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertyregdatatype: Long, propertybuffer: Long, propertybuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinfodetaildata: Long, driverinfodetaildatasize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(hwprofile: Int, friendlyname: Long, friendlynamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(hwprofilelist: Long, hwprofilelistsize: Int, requiredsize: Long, currentlyactiveindex: Long, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(infname: Long, classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(infname: Long, classguid: Long, classname: Long, classnamesize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(deviceinfoset: Long, deviceinfodata: Long, installwizarddata: Long, pagetype: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long, interfaceclassguid: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(hwndparent: Long, inffilename: Long, flags: Int, filequeue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(classguid: Long, largeicon: Long, miniiconindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(deviceinfoset: Long, deviceinfodata: Long, cxicon: Int, cyicon: Int, flags: Int, hicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(classguid: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(classguid: Long, samdesired: Int, flags: Int, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(classguid: Long, samdesired: Int, flags: Int, machinename: Long, reserved: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(deviceinfoset: Long, deviceinfodata: Long, scope: Int, hwprofile: Int, keytype: Int, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(deviceinfoset: Long, deviceinstanceid: Long, hwndparent: Long, openflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(deviceinfoset: Long, deviceinstanceid: Long, hwndparent: Long, openflags: Int, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(deviceinfoset: Long, devicepath: Long, openflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(deviceinfoset: Long, deviceinterfacedata: Long, reserved: Int, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(deviceinfoset: Long, devicepath: Long, openflags: Int, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(deviceinfoset: Long, deviceinfodata: Long, flags: Int, compareproc: Long, comparecontext: Long, dupdeviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(deviceinfoset: Long, deviceinterfacedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(hwndparent: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, classinstallparams: Long, classinstallparamssize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(classguid: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(classguid: Long, property: Int, propertybuffer: Long, propertybuffersize: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(classguid: Long, property: Int, propertybuffer: Long, propertybuffersize: Int, machinename: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, deviceinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(deviceinfoset: Long, deviceinterfacedata: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(deviceinfoset: Long, deviceinterfacedata: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(deviceinfoset: Long, deviceinfodata: Long, propertykey: Long, propertytype: Int, propertybuffer: Long, propertybuffersize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertybuffer: Long, propertybuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(deviceinfoset: Long, deviceinfodata: Long, property: Int, propertybuffer: Long, propertybuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long, driverinstallparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(deviceinfoset: Long, deviceinfodata: Long, driverinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(diskspace: Long, reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(diskspace: Long, reserved1: Long, reserved2: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(infhandle: Long, index: Int, buffer: Long, size: Int, sizeneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(infhandle: Long, index: Int, buffer: Long, size: Int, sizeneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(infhandle: Long, section: Long, key: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(infhandle: Long, section: Long, key: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(contextin: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(contextin: Long, key: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(contextin: Long, key: Long, contextout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(list: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(list: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(queuehandle: Long, backupparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(queuehandle: Long, backupparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(sourcefilename: Long, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(sourcefilename: Long, actualsourcefilenamebuffer: Long, actualsourcefilenamebufferlen: Int, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(sourcefilename: Long, actualsourcefilenamebuffer: Long, actualsourcefilenamebufferlen: Int, requiredbufferlen: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(sourcefilename: Long, actualsourcefilename: Long, sourcefilesize: Long, targetfilesize: Long, compressiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(filequeue: Long, subqueuefileop: Int, numoperations: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(filequeue: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(filename: Long, alternateplatforminfo: Long, localename: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(filename: Long, alternateplatforminfo: Long, localename: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(directorypath: Long, infstyle: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(directorypath: Long, infstyle: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(infspec: Long, searchcontrol: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(infspec: Long, searchcontrol: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(driverstorelocation: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(driverstorelocation: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(context: Long, fieldindex: Int, integervalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(infhandle: Long, section: Long, index: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(infhandle: Long, section: Long, index: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(infhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(infhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(context: Long, infhandle: Long, section: Long, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(context: Long, infhandle: Long, section: Long, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(infhandle: Long, infcontext: Long, filename: Long, sourceid: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(infhandle: Long, infcontext: Long, filename: Long, sourceid: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(infhandle: Long, infcontext: Long, filename: Long, section: Long, filesize: Long, roundingfactor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(infhandle: Long, infcontext: Long, filename: Long, section: Long, filesize: Long, roundingfactor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(infhandle: Long, sourceid: Int, infodesired: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(infhandle: Long, sourceid: Int, infodesired: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(context: Long, fieldindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(infhandle: Long, infcontext: Long, section: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(infhandle: Long, infcontext: Long, section: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(ownerwindow: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(ownerwindow: Long, alternateprogresswindow: Long, progressmessage: Int, reserved1: Int, reserved2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(logfilename: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(logfilename: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long, filewasinuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long, filewasinuse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(infhandle: Long, infcontext: Long, sourcefile: Long, sourcepathroot: Long, destinationname: Long, copystyle: Int, copymsghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: Long, sourcerootpath: Long, copyflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(infhandle: Long, layoutinfhandle: Long, filequeue: Long, sectionname: Long, sourcerootpath: Long, copyflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(owner: Long, infhandle: Long, sectionname: Long, flags: Int, relativekeyroot: Long, sourcerootpath: Long, copyflags: Int, msghandler: Long, context: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(owner: Long, infhandle: Long, sectionname: Long, flags: Int, relativekeyroot: Long, sourcerootpath: Long, copyflags: Int, msghandler: Long, context: Long, deviceinfoset: Long, deviceinfodata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(infhandle: Long, sectionname: Long, flags: Int, deviceinfoset: Long, deviceinfodata: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(infhandle: Long, sectionname: Long, flags: Int, deviceinfoset: Long, deviceinfodata: Long, reserved1: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(infhandle: Long, sectionname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(cabinetfile: Long, reserved: Int, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(cabinetfile: Long, reserved: Int, msghandler: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(messagestring: Long, severity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(messagestring: Long, severity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(fileloghandle: Long, logsectionname: Long, sourcefilename: Long, targetfilename: Long, checksum: Int, disktagfile: Long, diskdescription: Long, otherinfo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(fileloghandle: Long, logsectionname: Long, sourcefilename: Long, targetfilename: Long, checksum: Int, disktagfile: Long, diskdescription: Long, otherinfo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(filename: Long, infhandle: Long, errorline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(filename: Long, infhandle: Long, errorline: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(filename: Long, infclass: Long, infstyle: Int, errorline: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(filename: Long, infclass: Long, infstyle: Int, errorline: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(erase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(queuehandle: Long, backuppath: Long, restoreflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(queuehandle: Long, backuppath: Long, restoreflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, filesought: Long, tagfile: Long, diskpromptstyle: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(hwndparent: Long, dialogtitle: Long, diskname: Long, pathtosource: Long, filesought: Long, tagfile: Long, diskpromptstyle: Int, pathbuffer: Long, pathbuffersize: Int, pathrequiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(filequeue: Long, owner: Long, scanonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(diskspace: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(diskspace: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(fileloghandle: Long, logsectionname: Long, targetfilename: Long, desiredinfo: Int, dataout: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(fileloghandle: Long, logsectionname: Long, targetfilename: Long, desiredinfo: Int, dataout: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(infinformation: Long, infindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(infinformation: Long, infindex: Int, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(infinformation: Long, infindex: Int, alternateplatforminfo: Long, originalfileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(infinformation: Long, infindex: Int, alternateplatforminfo: Long, originalfileinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(infinformation: Long, infindex: Int, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(infinformation: Long, infindex: Int, key: Long, returnbuffer: Long, returnbuffersize: Int, requiredsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(flags: Int, list: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(flags: Int, list: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(diskspace: Long, drivespec: Long, spacerequired: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(diskspace: Long, drivespec: Long, spacerequired: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(queuehandle: Long, sourcerootpath: Long, sourcepath: Long, sourcefilename: Long, sourcedescription: Long, sourcetagfile: Long, targetdirectory: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(copyparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(copyparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(queuehandle: Long, sourcerootpath: Long, infhandle: Long, listinfhandle: Long, section: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(queuehandle: Long, sourcerootpath: Long, infhandle: Long, listinfhandle: Long, section: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(queuehandle: Long, sourcerootpath: Long, sourcepath: Long, sourcefilename: Long, sourcedescription: Long, sourcetagfile: Long, targetdirectory: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(queuehandle: Long, infhandle: Long, sourcerootpath: Long, sourcefilename: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(queuehandle: Long, infhandle: Long, sourcerootpath: Long, sourcefilename: Long, targetfilename: Long, copystyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(queuehandle: Long, pathpart1: Long, pathpart2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(queuehandle: Long, pathpart1: Long, pathpart2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(queuehandle: Long, sourcepath: Long, sourcefilename: Long, targetpath: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(queuehandle: Long, infhandle: Long, listinfhandle: Long, section: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(queuehandle: Long, sourcepath: Long, sourcefilename: Long, targetpath: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(fileloghandle: Long, logsectionname: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(fileloghandle: Long, logsectionname: Long, targetfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(diskspace: Long, targetfilespec: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(diskspace: Long, targetfilespec: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(flags: Int, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, layoutinfhandle: Long, sectionname: Long, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(diskspace: Long, infhandle: Long, listinfhandle: Long, sectionname: Long, operation: Int, reserved1: Long, reserved2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(hwndparent: Long, dialogtitle: Long, sourcefile: Long, targetfile: Long, win32errorcode: Int, style: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(filequeue: Long, flags: Int, window: Long, callbackroutine: Long, callbackcontext: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(filequeue: Long, flags: Int, window: Long, callbackroutine: Long, callbackcontext: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(infhandle: Long, id: Int, directory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(infhandle: Long, id: Int, directory: Long, flags: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(infhandle: Long, id: Int, directory: Long, flags: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(infhandle: Long, id: Int, directory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(queuehandle: Long, alternateplatforminfo: Long, alternatedefaultcatalogfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(filequeue: Long, flagmask: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(noninteractiveflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(override: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(override: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(flags: Int, sourcelist: Long, sourcecount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(flags: Int, sourcelist: Long, sourcecount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(logtoken: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(fileloghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(filequeue: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(inffilename: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(inffilename: Long, flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(infname: Long, altplatforminfo: Long, infsignerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(infname: Long, altplatforminfo: Long, infsignerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(logtoken: Long, category: Int, flags: Int, messagestr: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(logtoken: Long, category: Int, logflags: Int, error: Int, messagestr: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(logtoken: Long, flags: Int, infhandle: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(hwndparent: Long, hardwareid: Long, fullinfpath: Long, installflags: Int, brebootrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(hwndparent: Long, hardwareid: Long, fullinfpath: Long, installflags: Int, brebootrequired: Long): Int
}

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(dwtimeout.toInt()).toUInt()

public actual fun cmAddEmptyLogConf(plclogconf: MutPtr<ULong>, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(plclogconf.rawAddress, dndevinst.toInt(), priority, ulflags.toInt()).toUInt()

public actual fun cmAddEmptyLogConfEx(plclogconf: MutPtr<ULong>, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(plclogconf.rawAddress, dndevinst.toInt(), priority, ulflags.toInt(), hmachine).toUInt()

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(dndevinst.toInt(), pszid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(dndevinst.toInt(), pszid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(dndevinst.toInt(), pszid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(dndevinst.toInt(), pszid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmAddResDes(prdresdes: MutPtr<ULong>, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(prdresdes.rawAddress, lclogconf.toLong(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmAddResDesEx(prdresdes: MutPtr<ULong>, lclogconf: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(prdresdes.rawAddress, lclogconf.toLong(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: MutPtr<Long>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(uncservername.rawAddress, phmachine.rawAddress).toUInt()

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: MutPtr<Long>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(uncservername.rawAddress, phmachine.rawAddress).toUInt()

public actual fun cmCreateDevNodeA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(pdndevinst.rawAddress, pdeviceid.rawAddress, dnparent.toInt(), ulflags.toInt()).toUInt()

public actual fun cmCreateDevNodeW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(pdndevinst.rawAddress, pdeviceid.rawAddress, dnparent.toInt(), ulflags.toInt()).toUInt()

public actual fun cmCreateDevNodeExA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(pdndevinst.rawAddress, pdeviceid.rawAddress, dnparent.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmCreateDevNodeExW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(pdndevinst.rawAddress, pdeviceid.rawAddress, dnparent.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmCreateRangeList(prlh: MutPtr<ULong>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(prlh.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmDeleteClassKey(classguid: ConstPtr<Guid>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(classguid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmDeleteClassKeyEx(classguid: ConstPtr<Guid>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(classguid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(dndevnode.toInt(), ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(pszdeviceinterface.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(pszdeviceinterface.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(pszdeviceinterface.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(pszdeviceinterface.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, pbconflictdetected: MutPtr<Bool>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), pbconflictdetected.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, pbconflictdetected: MutPtr<Bool>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), pbconflictdetected.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(hmachine).toUInt()

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(rlhold.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: MutPtr<Guid>, ulflags: CmEnumerateFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(ulclassindex.toInt(), classguid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: MutPtr<Guid>, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(ulclassindex.toInt(), classguid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(ulenumindex.toInt(), buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(ulenumindex.toInt(), buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(ulenumindex.toInt(), buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(ulenumindex.toInt(), buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmFindRange(pullstart: MutPtr<ULong>, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(pullstart.rawAddress, ullstart.toLong(), ullength.toInt(), ullalignment.toLong(), ullend.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFirstRange(rlh: ULong, pullstart: MutPtr<ULong>, pullend: MutPtr<ULong>, preelement: MutPtr<ULong>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(rlh.toLong(), pullstart.rawAddress, pullend.rawAddress, preelement.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(lclogconftobefreed.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(lclogconftobefreed.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(lclogconf.toLong()).toUInt()

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(prdresdes.rawAddress, rdresdes.toLong(), ulflags.toInt()).toUInt()

public actual fun cmFreeResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(prdresdes.rawAddress, rdresdes.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(rdresdes.toLong()).toUInt()

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(clconflictlist.toLong()).toUInt()

public actual fun cmGetChild(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(pdndevinst.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetChildEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(pdndevinst.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassKeyNameA(classguid: ConstPtr<Guid>, pszkeyname: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(classguid.rawAddress, pszkeyname.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetClassKeyNameW(classguid: ConstPtr<Guid>, pszkeyname: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(classguid.rawAddress, pszkeyname.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetClassKeyNameExA(classguid: ConstPtr<Guid>, pszkeyname: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(classguid.rawAddress, pszkeyname.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassKeyNameExW(classguid: ConstPtr<Guid>, pszkeyname: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(classguid.rawAddress, pszkeyname.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassNameA(classguid: ConstPtr<Guid>, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(classguid.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetClassNameW(classguid: ConstPtr<Guid>, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(classguid.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetClassNameExA(classguid: ConstPtr<Guid>, buffer: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(classguid.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassNameExW(classguid: ConstPtr<Guid>, buffer: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(classguid.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(classguid.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(classguid.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassPropertyKeys(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(classguid.rawAddress, propertykeyarray.rawAddress, propertykeycount.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetClassPropertyKeysEx(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(classguid.rawAddress, propertykeyarray.rawAddress, propertykeycount.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassRegistryPropertyA(classguid: ConstPtr<Guid>, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(classguid.rawAddress, ulproperty.toInt(), pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetClassRegistryPropertyW(classguid: ConstPtr<Guid>, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(classguid.rawAddress, ulproperty.toInt(), pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDepth(puldepth: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(puldepth.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDepthEx(puldepth: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(puldepth.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(dndevinst.toInt(), pszcustompropertyname.rawAddress, pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(dndevinst.toInt(), pszcustompropertyname.rawAddress, pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(dndevinst.toInt(), pszcustompropertyname.rawAddress, pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(dndevinst.toInt(), pszcustompropertyname.rawAddress, pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(dndevinst.toInt(), propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(dndevinst.toInt(), propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(dndevinst.toInt(), propertykeyarray.rawAddress, propertykeycount.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(dndevinst.toInt(), propertykeyarray.rawAddress, propertykeycount.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: MutPtr<UInt>, buffer: MutPtr<CVoid>, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), pulregdatatype.rawAddress, buffer.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDevNodeStatus(pulstatus: MutPtr<CmDevnodeStatusFlags>, pulproblemnumber: MutPtr<CmProb>, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(pulstatus.rawAddress, pulproblemnumber.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDevNodeStatusEx(pulstatus: MutPtr<CmDevnodeStatusFlags>, pulproblemnumber: MutPtr<CmProb>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(pulstatus.rawAddress, pulproblemnumber.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(dndevinst.toInt(), buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(dndevinst.toInt(), buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(dndevinst.toInt(), buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(dndevinst.toInt(), buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(pszfilter.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(pszfilter.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(pszfilter.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(pszfilter.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListSizeA(pullen: MutPtr<UInt>, pszfilter: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(pullen.rawAddress, pszfilter.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListSizeW(pullen: MutPtr<UInt>, pszfilter: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(pullen.rawAddress, pszfilter.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdListSizeExA(pullen: MutPtr<UInt>, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(pullen.rawAddress, pszfilter.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdListSizeExW(pullen: MutPtr<UInt>, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(pullen.rawAddress, pszfilter.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceIdSize(pullen: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(pullen.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceIdSizeEx(pullen: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(pullen.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(pszdeviceinterface.rawAddress, aliasinterfaceguid.rawAddress, pszaliasdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(pszdeviceinterface.rawAddress, aliasinterfaceguid.rawAddress, pszaliasdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(pszdeviceinterface.rawAddress, aliasinterfaceguid.rawAddress, pszaliasdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: ConstPtr<Guid>, pszaliasdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(pszdeviceinterface.rawAddress, aliasinterfaceguid.rawAddress, pszaliasdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(interfaceclassguid.rawAddress, pdeviceid.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(interfaceclassguid.rawAddress, pdeviceid.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(interfaceclassguid.rawAddress, pdeviceid.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(interfaceclassguid.rawAddress, pdeviceid.rawAddress, buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListSizeA(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(pullen.rawAddress, interfaceclassguid.rawAddress, pdeviceid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListSizeW(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(pullen.rawAddress, interfaceclassguid.rawAddress, pdeviceid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(pullen.rawAddress, interfaceclassguid.rawAddress, pdeviceid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: MutPtr<UInt>, interfaceclassguid: ConstPtr<Guid>, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(pullen.rawAddress, interfaceclassguid.rawAddress, pdeviceid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(pszdeviceinterface.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(pszdeviceinterface.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(pszdeviceinterface.rawAddress, propertykeyarray.rawAddress, propertykeycount.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface.rawAddress, propertykeyarray.rawAddress, propertykeycount.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetFirstLogConf(plclogconf: MutPtr<ULong>, dndevinst: UInt, ulflags: CmLogConf): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(plclogconf.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetFirstLogConfEx(plclogconf: MutPtr<ULong>, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(plclogconf.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetGlobalState(pulstate: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(pulstate.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetGlobalStateEx(pulstate: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(pulstate.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(pdeviceid.rawAddress, ulhardwareprofile.toInt(), pulvalue.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(pdeviceid.rawAddress, ulhardwareprofile.toInt(), pulvalue.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(pdeviceid.rawAddress, ulhardwareprofile.toInt(), pulvalue.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(pdeviceid.rawAddress, ulhardwareprofile.toInt(), pulvalue.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoA>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(ulindex.toInt(), phwprofileinfo.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoW>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(ulindex.toInt(), phwprofileinfo.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoA>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(ulindex.toInt(), phwprofileinfo.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: MutPtr<HwprofileinfoW>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(ulindex.toInt(), phwprofileinfo.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(lclogconf.toLong(), ppriority.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(lclogconf.toLong(), ppriority.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetNextLogConf(plclogconf: MutPtr<ULong>, lclogconf: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(plclogconf.rawAddress, lclogconf.toLong(), ulflags.toInt()).toUInt()

public actual fun cmGetNextLogConfEx(plclogconf: MutPtr<ULong>, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(plclogconf.rawAddress, lclogconf.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetNextResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr<CmRestype>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(prdresdes.rawAddress, rdresdes.toLong(), forresource.toInt(), presourceid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmGetNextResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, forresource: CmRestype, presourceid: MutPtr<CmRestype>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(prdresdes.rawAddress, rdresdes.toLong(), forresource.toInt(), presourceid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetParent(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(pdndevinst.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetParentEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(pdndevinst.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetResDesData(rdresdes: ULong, buffer: MutPtr<CVoid>, bufferlen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(rdresdes.toLong(), buffer.rawAddress, bufferlen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: MutPtr<CVoid>, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(rdresdes.toLong(), buffer.rawAddress, bufferlen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetResDesDataSize(pulsize: MutPtr<UInt>, rdresdes: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(pulsize.rawAddress, rdresdes.toLong(), ulflags.toInt()).toUInt()

public actual fun cmGetResDesDataSizeEx(pulsize: MutPtr<UInt>, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(pulsize.rawAddress, rdresdes.toLong(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: MutPtr<UInt>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(clconflictlist.toLong(), pulcount.rawAddress).toUInt()

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr<ConflictDetailsA>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(clconflictlist.toLong(), ulindex.toInt(), pconflictdetails.rawAddress).toUInt()

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: MutPtr<ConflictDetailsW>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(clconflictlist.toLong(), ulindex.toInt(), pconflictdetails.rawAddress).toUInt()

public actual fun cmGetSibling(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(pdndevinst.rawAddress, dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmGetSiblingEx(pdndevinst: MutPtr<UInt>, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(pdndevinst.rawAddress, dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmGetVersion(): UShort =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion().toUShort()

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(hmachine).toUShort()

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(rlhold.toLong(), rlhnew.toLong(), ullmaxvalue.toLong(), ulflags.toInt()).toUInt()

public actual fun cmIsDockStationPresent(pbpresent: MutPtr<Bool>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(pbpresent.rawAddress).toUInt()

public actual fun cmIsDockStationPresentEx(pbpresent: MutPtr<Bool>, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(pbpresent.rawAddress, hmachine).toUInt()

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(wversion.toShort())

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(wversion.toShort(), hmachine)

public actual fun cmLocateDevNodeA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(pdndevinst.rawAddress, pdeviceid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmLocateDevNodeW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(pdndevinst.rawAddress, pdeviceid.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmLocateDevNodeExA(pdndevinst: MutPtr<UInt>, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(pdndevinst.rawAddress, pdeviceid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmLocateDevNodeExW(pdndevinst: MutPtr<UInt>, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(pdndevinst.rawAddress, pdeviceid.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(cmreturncode.toInt(), defaulterr.toInt()).toUInt()

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(rlhold1.toLong(), rlhold2.toLong(), rlhnew.toLong(), ulflags.toInt()).toUInt()

public actual fun cmModifyResDes(prdresdes: MutPtr<ULong>, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(prdresdes.rawAddress, rdresdes.toLong(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), ulflags.toInt()).toUInt()

public actual fun cmModifyResDesEx(prdresdes: MutPtr<ULong>, rdresdes: ULong, resourceid: UInt, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(prdresdes.rawAddress, rdresdes.toLong(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(dnfromdevinst.toInt(), dntodevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmNextRange(preelement: MutPtr<ULong>, pullstart: MutPtr<ULong>, pullend: MutPtr<ULong>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(preelement.rawAddress, pullstart.rawAddress, pullend.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmOpenClassKeyA(classguid: ConstPtr<Guid>, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(classguid.rawAddress, pszclassname.rawAddress, samdesired.toInt(), disposition.toInt(), phkclass.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmOpenClassKeyW(classguid: ConstPtr<Guid>, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(classguid.rawAddress, pszclassname.rawAddress, samdesired.toInt(), disposition.toInt(), phkclass.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmOpenClassKeyExA(classguid: ConstPtr<Guid>, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(classguid.rawAddress, pszclassname.rawAddress, samdesired.toInt(), disposition.toInt(), phkclass.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenClassKeyExW(classguid: ConstPtr<Guid>, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(classguid.rawAddress, pszclassname.rawAddress, samdesired.toInt(), disposition.toInt(), phkclass.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr<Hkey>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(dndevnode.toInt(), samdesired.toInt(), ulhardwareprofile.toInt(), disposition.toInt(), phkdevice.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(pszdeviceinterface.rawAddress, samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(pszdeviceinterface.rawAddress, samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(pszdeviceinterface.rawAddress, samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: MutPtr<Hkey>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(pszdeviceinterface.rawAddress, samdesired.toInt(), disposition.toInt(), phkdeviceinterface.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(dnancestor.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(dnancestor.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(dnancestor.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(dnancestor.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryArbitratorFreeData(pdata: MutPtr<CVoid>, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(pdata.rawAddress, datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryArbitratorFreeDataEx(pdata: MutPtr<CVoid>, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(pdata.rawAddress, datalen.toInt(), dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryArbitratorFreeSize(pulsize: MutPtr<UInt>, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(pulsize.rawAddress, dndevinst.toInt(), resourceid.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: MutPtr<UInt>, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(pulsize.rawAddress, dndevinst.toInt(), resourceid.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmQueryResourceConflictList(pclconflictlist: MutPtr<ULong>, dndevinst: UInt, resourceid: CmRestype, resourcedata: ConstPtr<CVoid>, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(pclconflictlist.rawAddress, dndevinst.toInt(), resourceid.toInt(), resourcedata.rawAddress, resourcelen.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(dndevinst.toInt(), interfaceclassguid.rawAddress, pszreference.rawAddress, pszdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(dndevinst.toInt(), interfaceclassguid.rawAddress, pszreference.rawAddress, pszdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(dndevinst.toInt(), interfaceclassguid.rawAddress, pszreference.rawAddress, pszdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: ConstPtr<Guid>, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: MutPtr<UInt>, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(dndevinst.toInt(), interfaceclassguid.rawAddress, pszreference.rawAddress, pszdeviceinterface.rawAddress, pullength.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmRegisterNotification(pfilter: ConstPtr<CmNotifyFilter>, pcontext: ConstPtr<CVoid>, pcallback: PcmNotifyCallback, pnotifycontext: MutPtr<Hcmnotification>): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(pfilter.rawAddress, pcontext.rawAddress, 0L, pnotifycontext.rawAddress).toUInt()

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(dnancestor.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(dnancestor.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(dndevinst.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(dndevinst.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(dndevinst.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: MutPtr<PnpVetoType>, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(dndevinst.toInt(), pvetotype.rawAddress, pszvetoname.rawAddress, ulnamelength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmRequestEjectPc(): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc().toUInt()

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(hmachine).toUInt()

public actual fun cmRunDetection(ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(ulflags.toInt()).toUInt()

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(classguid.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(classguid.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassRegistryPropertyA(classguid: ConstPtr<Guid>, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(classguid.rawAddress, ulproperty.toInt(), buffer.rawAddress, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetClassRegistryPropertyW(classguid: ConstPtr<Guid>, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(classguid.rawAddress, ulproperty.toInt(), buffer.rawAddress, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(dndevinst.toInt(), ulproblem.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(dndevinst.toInt(), propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(dndevinst.toInt(), propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress, ullength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress, ullength.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: ConstPtr<CVoid>, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(dndevinst.toInt(), ulproperty.toInt(), buffer.rawAddress, ullength.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(pszdeviceinterface.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(pszdeviceinterface.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(ulhardwareprofile.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(ulhardwareprofile.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(pdeviceid.rawAddress, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(pdeviceid.rawAddress, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(pdeviceid.rawAddress, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(pdeviceid.rawAddress, ulconfig.toInt(), ulvalue.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(ullstartvalue.toLong(), ullendvalue.toLong(), rlh.toLong(), ulflags.toInt()).toUInt()

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(dndevinst.toInt(), ulflags.toInt()).toUInt()

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(dndevinst.toInt(), ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(pszdeviceinterface.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(pszdeviceinterface.rawAddress, ulflags.toInt()).toUInt()

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(pszdeviceinterface.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(pszdeviceinterface.rawAddress, ulflags.toInt(), hmachine).toUInt()

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(notifycontext.rawAddress).toUInt()

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, flags: DiinstalldeviceFlags, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(hwndparent.rawAddress, deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(hwndparent.rawAddress, infpath.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(hwndparent.rawAddress, infpath.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(deviceinfoset, deviceinfodata.rawAddress, hwndparent.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, flags: UInt, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(hwndparent.rawAddress, deviceinfoset, deviceinfodata.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(hwndparent.rawAddress, filepath.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, flags: UInt, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(hwndparent.rawAddress, deviceinfoset, deviceinfodata.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(hwndparent.rawAddress, infpath.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(hwndparent.rawAddress, infpath.rawAddress, flags.toInt(), needreboot.rawAddress)

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(window.rawAddress, modulehandle.rawAddress, commandline.rawAddress, showcommand)
}

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(window.rawAddress, modulehandle.rawAddress, commandline.rawAddress, showcommand)
}

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(diskspace.rawAddress, infhandle.rawAddress, layoutinfhandle.rawAddress, sectionname.rawAddress, reserved1.rawAddress, reserved2.toInt())

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(diskspace.rawAddress, infhandle.rawAddress, layoutinfhandle.rawAddress, sectionname.rawAddress, reserved1.rawAddress, reserved2.toInt())

public actual fun setupAddSectionToDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(diskspace.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, sectionname.rawAddress, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupAddSectionToDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(diskspace.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, sectionname.rawAddress, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupAddToDiskSpaceListA(diskspace: ConstPtr<CVoid>, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(diskspace.rawAddress, targetfilespec.rawAddress, filesize, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupAddToDiskSpaceListW(diskspace: ConstPtr<CVoid>, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(diskspace.rawAddress, targetfilespec.rawAddress, filesize, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(flags.toInt(), source.rawAddress)

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(flags.toInt(), source.rawAddress)

public actual fun setupAdjustDiskSpaceListA(diskspace: ConstPtr<CVoid>, driveroot: Pcstr, amount: Long, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(diskspace.rawAddress, driveroot.rawAddress, amount, reserved1.rawAddress, reserved2.toInt())

public actual fun setupAdjustDiskSpaceListW(diskspace: ConstPtr<CVoid>, driveroot: Pcwstr, amount: Long, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(diskspace.rawAddress, driveroot.rawAddress, amount, reserved1.rawAddress, reserved2.toInt())

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(hwndparent.rawAddress, dialogtitle.rawAddress, sourcefile.rawAddress, targetfile.rawAddress, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(hwndparent.rawAddress, dialogtitle.rawAddress, sourcefile.rawAddress, targetfile.rawAddress, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupCancelTemporarySourceList(): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList()

public actual fun setupCloseFileQueue(queuehandle: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(queuehandle.rawAddress)

public actual fun setupCloseInfFile(infhandle: ConstPtr<CVoid>) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(infhandle.rawAddress)
}

public actual fun setupCloseLog() {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog()
}

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: ConstPtr<CVoid>, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(owner.rawAddress, queuehandle.rawAddress, 0L, context.rawAddress)

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: ConstPtr<CVoid>, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(owner.rawAddress, queuehandle.rawAddress, 0L, context.rawAddress)

public actual fun setupConfigureWmiFromInfSectionA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(infhandle.rawAddress, sectionname.rawAddress, flags.toInt())

public actual fun setupConfigureWmiFromInfSectionW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(infhandle.rawAddress, sectionname.rawAddress, flags.toInt())

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(hwndparent.rawAddress, dialogtitle.rawAddress, diskname.rawAddress, pathtosource.rawAddress, sourcefile.rawAddress, targetpathfile.rawAddress, win32errorcode.toInt(), style.toInt(), pathbuffer.rawAddress, pathbuffersize.toInt(), pathrequiredsize.rawAddress).toUInt()

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(hwndparent.rawAddress, dialogtitle.rawAddress, diskname.rawAddress, pathtosource.rawAddress, sourcefile.rawAddress, targetpathfile.rawAddress, win32errorcode.toInt(), style.toInt(), pathbuffer.rawAddress, pathbuffersize.toInt(), pathrequiredsize.rawAddress).toUInt()

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: MutPtr<UInt>, destinationinffilenamecomponent: MutPtr<Pstr>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(sourceinffilename.rawAddress, oemsourcemedialocation.rawAddress, oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.rawAddress, destinationinffilenamesize.toInt(), requiredsize.rawAddress, destinationinffilenamecomponent.rawAddress)

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: MutPtr<UInt>, destinationinffilenamecomponent: MutPtr<Pwstr>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(sourceinffilename.rawAddress, oemsourcemedialocation.rawAddress, oemsourcemediatype.toInt(), copystyle.toInt(), destinationinffilename.rawAddress, destinationinffilenamesize.toInt(), requiredsize.rawAddress, destinationinffilenamecomponent.rawAddress)

public actual fun setupCreateDiskSpaceListA(reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(reserved1.rawAddress, reserved2.toInt(), flags.toInt()))

public actual fun setupCreateDiskSpaceListW(reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(reserved1.rawAddress, reserved2.toInt(), flags.toInt()))

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: ConstPtr<FileCompressionType>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(sourcefilename.rawAddress, targetfilename.rawAddress, compressiontype.rawAddress).toUInt()

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: ConstPtr<FileCompressionType>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(sourcefilename.rawAddress, targetfilename.rawAddress, compressiontype.rawAddress).toUInt()

public actual fun setupDefaultQueueCallbackA(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(context.rawAddress, notification.toInt(), param1.toLong(), param2.toLong()).toUInt()

public actual fun setupDefaultQueueCallbackW(context: ConstPtr<CVoid>, notification: UInt, param1: ULong, param2: ULong): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(context.rawAddress, notification.toInt(), param1.toLong(), param2.toLong()).toUInt()

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(hwndparent.rawAddress, dialogtitle.rawAddress, file.rawAddress, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(hwndparent.rawAddress, dialogtitle.rawAddress, file.rawAddress, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupDestroyDiskSpaceList(diskspace: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(diskspace.rawAddress)

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(flags.toInt(), classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(flags.toInt(), classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(flags.toInt(), classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, drivertype: SetupDiDriverType): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(deviceinfoset, deviceinfodata.rawAddress, drivertype.toInt())

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(installfunction.toInt(), deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(deviceinfoset)

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(classname.rawAddress, classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(classname.rawAddress, classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(classname.rawAddress, classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: MutPtr<Guid>, classguidlistsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(classname.rawAddress, classguidlist.rawAddress, classguidlistsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiClassNameFromGuidA(classguid: ConstPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(classguid.rawAddress, classname.rawAddress, classnamesize.toInt(), requiredsize.rawAddress)

public actual fun setupDiClassNameFromGuidExA(classguid: ConstPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(classguid.rawAddress, classname.rawAddress, classnamesize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiClassNameFromGuidExW(classguid: ConstPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(classguid.rawAddress, classname.rawAddress, classnamesize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiClassNameFromGuidW(classguid: ConstPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(classguid.rawAddress, classname.rawAddress, classnamesize.toInt(), requiredsize.rawAddress)

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcstr): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(deviceinfoset, deviceinfodata.rawAddress, scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.rawAddress, infsectionname.rawAddress))

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(deviceinfoset, deviceinfodata.rawAddress, scope.toInt(), hwprofile.toInt(), keytype.toInt(), infhandle.rawAddress, infsectionname.rawAddress))

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: ConstPtr<Guid>, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(deviceinfoset, devicename.rawAddress, classguid.rawAddress, devicedescription.rawAddress, hwndparent.rawAddress, creationflags.toInt(), deviceinfodata.rawAddress)

public actual fun setupDiCreateDeviceInfoList(classguid: ConstPtr<Guid>, hwndparent: Hwnd): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(classguid.rawAddress, hwndparent.rawAddress)

public actual fun setupDiCreateDeviceInfoListExA(classguid: ConstPtr<Guid>, hwndparent: Hwnd, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(classguid.rawAddress, hwndparent.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiCreateDeviceInfoListExW(classguid: ConstPtr<Guid>, hwndparent: Hwnd, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(classguid.rawAddress, hwndparent.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: ConstPtr<Guid>, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(deviceinfoset, devicename.rawAddress, classguid.rawAddress, devicedescription.rawAddress, hwndparent.rawAddress, creationflags.toInt(), deviceinfodata.rawAddress)

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(deviceinfoset, deviceinfodata.rawAddress, interfaceclassguid.rawAddress, referencestring.rawAddress, creationflags.toInt(), deviceinterfacedata.rawAddress)

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcstr): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(deviceinfoset, deviceinterfacedata.rawAddress, reserved.toInt(), samdesired.toInt(), infhandle.rawAddress, infsectionname.rawAddress))

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt, infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(deviceinfoset, deviceinterfacedata.rawAddress, reserved.toInt(), samdesired.toInt(), infhandle.rawAddress, infsectionname.rawAddress))

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(deviceinfoset, deviceinfodata.rawAddress, interfaceclassguid.rawAddress, referencestring.rawAddress, creationflags.toInt(), deviceinterfacedata.rawAddress)

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(deviceinfoset, deviceinfodata.rawAddress, scope.toInt(), hwprofile.toInt(), keytype.toInt())

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(deviceinfoset, deviceinterfacedata.rawAddress)

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(deviceinfoset, deviceinterfacedata.rawAddress, reserved.toInt())

public actual fun setupDiDestroyClassImageList(classimagelistdata: ConstPtr<SpClassimagelistData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(classimagelistdata.rawAddress)

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(deviceinfoset)

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(deviceinfoset, deviceinfodata.rawAddress, drivertype.toInt())

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    0

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(deviceinfoset, memberindex.toInt(), deviceinfodata.rawAddress)

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, interfaceclassguid: ConstPtr<Guid>, memberindex: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(deviceinfoset, deviceinfodata.rawAddress, interfaceclassguid.rawAddress, memberindex.toInt(), deviceinterfacedata.rawAddress)

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(deviceinfoset, deviceinfodata.rawAddress, drivertype.toInt(), memberindex.toInt(), driverinfodata.rawAddress)

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(deviceinfoset, deviceinfodata.rawAddress, drivertype.toInt(), memberindex.toInt(), driverinfodata.rawAddress)

public actual fun setupDiGetActualModelsSectionA(context: ConstPtr<Infcontext>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(context.rawAddress, alternateplatforminfo.rawAddress, infsectionwithext.rawAddress, infsectionwithextsize.toInt(), requiredsize.rawAddress, reserved.rawAddress)

public actual fun setupDiGetActualModelsSectionW(context: ConstPtr<Infcontext>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(context.rawAddress, alternateplatforminfo.rawAddress, infsectionwithext.rawAddress, infsectionwithextsize.toInt(), requiredsize.rawAddress, reserved.rawAddress)

public actual fun setupDiGetActualSectionToInstallA(infhandle: ConstPtr<CVoid>, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pstr>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(infhandle.rawAddress, infsectionname.rawAddress, infsectionwithext.rawAddress, infsectionwithextsize.toInt(), requiredsize.rawAddress, extension.rawAddress)

public actual fun setupDiGetActualSectionToInstallExA(infhandle: ConstPtr<CVoid>, infsectionname: Pcstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pstr>, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(infhandle.rawAddress, infsectionname.rawAddress, alternateplatforminfo.rawAddress, infsectionwithext.rawAddress, infsectionwithextsize.toInt(), requiredsize.rawAddress, extension.rawAddress, reserved.rawAddress)

public actual fun setupDiGetActualSectionToInstallExW(infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pwstr>, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(infhandle.rawAddress, infsectionname.rawAddress, alternateplatforminfo.rawAddress, infsectionwithext.rawAddress, infsectionwithextsize.toInt(), requiredsize.rawAddress, extension.rawAddress, reserved.rawAddress)

public actual fun setupDiGetActualSectionToInstallW(infhandle: ConstPtr<CVoid>, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: MutPtr<UInt>, extension: MutPtr<Pwstr>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(infhandle.rawAddress, infsectionname.rawAddress, infsectionwithext.rawAddress, infsectionwithextsize.toInt(), requiredsize.rawAddress, extension.rawAddress)

public actual fun setupDiGetClassBitmapIndex(classguid: ConstPtr<Guid>, miniiconindex: MutPtr<Int>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(classguid.rawAddress, miniiconindex.rawAddress)

public actual fun setupDiGetClassDescriptionA(classguid: ConstPtr<Guid>, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(classguid.rawAddress, classdescription.rawAddress, classdescriptionsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetClassDescriptionExA(classguid: ConstPtr<Guid>, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(classguid.rawAddress, classdescription.rawAddress, classdescriptionsize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassDescriptionExW(classguid: ConstPtr<Guid>, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(classguid.rawAddress, classdescription.rawAddress, classdescriptionsize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassDescriptionW(classguid: ConstPtr<Guid>, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(classguid.rawAddress, classdescription.rawAddress, classdescriptionsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertysheetheader: ConstPtr<PropsheetheaderaV2>, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr<UInt>, propertysheettype: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(deviceinfoset, deviceinfodata.rawAddress, propertysheetheader.rawAddress, propertysheetheaderpagelistsize.toInt(), requiredsize.rawAddress, propertysheettype.toInt())

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertysheetheader: ConstPtr<PropsheetheaderwV2>, propertysheetheaderpagelistsize: UInt, requiredsize: MutPtr<UInt>, propertysheettype: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(deviceinfoset, deviceinfodata.rawAddress, propertysheetheader.rawAddress, propertysheetheaderpagelistsize.toInt(), requiredsize.rawAddress, propertysheettype.toInt())

public actual fun setupDiGetClassDevsA(classguid: ConstPtr<Guid>, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(classguid.rawAddress, enumerator.rawAddress, hwndparent.rawAddress, flags.toInt())

public actual fun setupDiGetClassDevsExA(classguid: ConstPtr<Guid>, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(classguid.rawAddress, enumerator.rawAddress, hwndparent.rawAddress, flags.toInt(), deviceinfoset, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassDevsExW(classguid: ConstPtr<Guid>, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(classguid.rawAddress, enumerator.rawAddress, hwndparent.rawAddress, flags.toInt(), deviceinfoset, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassDevsW(classguid: ConstPtr<Guid>, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(classguid.rawAddress, enumerator.rawAddress, hwndparent.rawAddress, flags.toInt())

public actual fun setupDiGetClassImageIndex(classimagelistdata: ConstPtr<SpClassimagelistData>, classguid: ConstPtr<Guid>, imageindex: MutPtr<Int>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(classimagelistdata.rawAddress, classguid.rawAddress, imageindex.rawAddress)

public actual fun setupDiGetClassImageList(classimagelistdata: MutPtr<SpClassimagelistData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(classimagelistdata.rawAddress)

public actual fun setupDiGetClassImageListExA(classimagelistdata: MutPtr<SpClassimagelistData>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(classimagelistdata.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassImageListExW(classimagelistdata: MutPtr<SpClassimagelistData>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(classimagelistdata.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: MutPtr<SpClassinstallHeader>, classinstallparamssize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(deviceinfoset, deviceinfodata.rawAddress, classinstallparams.rawAddress, classinstallparamssize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: MutPtr<SpClassinstallHeader>, classinstallparamssize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(deviceinfoset, deviceinfodata.rawAddress, classinstallparams.rawAddress, classinstallparamssize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(classguid.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress, flags.toInt(), machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassPropertyKeys(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(classguid.rawAddress, propertykeyarray.rawAddress, propertykeycount.toInt(), requiredpropertykeycount.rawAddress, flags.toInt())

public actual fun setupDiGetClassPropertyKeysExW(classguid: ConstPtr<Guid>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(classguid.rawAddress, propertykeyarray.rawAddress, propertykeycount.toInt(), requiredpropertykeycount.rawAddress, flags.toInt(), machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(classguid.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress, flags.toInt())

public actual fun setupDiGetClassRegistryPropertyA(classguid: ConstPtr<Guid>, property: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(classguid.rawAddress, property.toInt(), propertyregdatatype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetClassRegistryPropertyW(classguid: ConstPtr<Guid>, property: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(classguid.rawAddress, property.toInt(), propertyregdatatype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(deviceinfoset, deviceinfodata.rawAddress, custompropertyname.rawAddress, flags.toInt(), propertyregdatatype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(deviceinfoset, deviceinfodata.rawAddress, custompropertyname.rawAddress, flags.toInt(), propertyregdatatype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: MutPtr<Guid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(deviceinfoset, classguid.rawAddress)

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr<SpDevinfoListDetailDataA>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(deviceinfoset, deviceinfosetdetaildata.rawAddress)

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: MutPtr<SpDevinfoListDetailDataW>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(deviceinfoset, deviceinfosetdetaildata.rawAddress)

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: MutPtr<SpDevinstallParamsA>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(deviceinfoset, deviceinfodata.rawAddress, deviceinstallparams.rawAddress)

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: MutPtr<SpDevinstallParamsW>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(deviceinfoset, deviceinfodata.rawAddress, deviceinstallparams.rawAddress)

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(deviceinfoset, deviceinfodata.rawAddress, deviceinstanceid.rawAddress, deviceinstanceidsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(deviceinfoset, deviceinfodata.rawAddress, deviceinstanceid.rawAddress, deviceinstanceidsize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, aliasinterfaceclassguid: ConstPtr<Guid>, aliasdeviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(deviceinfoset, deviceinterfacedata.rawAddress, aliasinterfaceclassguid.rawAddress, aliasdeviceinterfacedata.rawAddress)

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, deviceinterfacedetaildata: MutPtr<SpDeviceInterfaceDetailDataA>, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr<UInt>, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(deviceinfoset, deviceinterfacedata.rawAddress, deviceinterfacedetaildata.rawAddress, deviceinterfacedetaildatasize.toInt(), requiredsize.rawAddress, deviceinfodata.rawAddress)

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, deviceinterfacedetaildata: MutPtr<SpDeviceInterfaceDetailDataW>, deviceinterfacedetaildatasize: UInt, requiredsize: MutPtr<UInt>, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(deviceinfoset, deviceinterfacedata.rawAddress, deviceinterfacedetaildata.rawAddress, deviceinterfacedetaildatasize.toInt(), requiredsize.rawAddress, deviceinfodata.rawAddress)

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(deviceinfoset, deviceinterfacedata.rawAddress, propertykeyarray.rawAddress, propertykeycount.toInt(), requiredpropertykeycount.rawAddress, flags.toInt())

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(deviceinfoset, deviceinterfacedata.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress, flags.toInt())

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykeyarray: MutPtr<Devpropkey>, propertykeycount: UInt, requiredpropertykeycount: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(deviceinfoset, deviceinfodata.rawAddress, propertykeyarray.rawAddress, propertykeycount.toInt(), requiredpropertykeycount.rawAddress, flags.toInt())

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykey: ConstPtr<Devpropkey>, propertytype: MutPtr<Devproptype>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(deviceinfoset, deviceinfodata.rawAddress, propertykey.rawAddress, propertytype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress, flags.toInt())

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(deviceinfoset, deviceinfodata.rawAddress, property.toInt(), propertyregdatatype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertyregdatatype: MutPtr<UInt>, propertybuffer: MutPtr<UByte>, propertybuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(deviceinfoset, deviceinfodata.rawAddress, property.toInt(), propertyregdatatype.rawAddress, propertybuffer.rawAddress, propertybuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinfodetaildata: MutPtr<SpDrvinfoDetailDataA>, driverinfodetaildatasize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, driverinfodetaildata.rawAddress, driverinfodetaildatasize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinfodetaildata: MutPtr<SpDrvinfoDetailDataW>, driverinfodetaildatasize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, driverinfodetaildata.rawAddress, driverinfodetaildatasize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinstallparams: MutPtr<SpDrvinstallParams>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, driverinstallparams.rawAddress)

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinstallparams: MutPtr<SpDrvinstallParams>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, driverinstallparams.rawAddress)

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(hwprofile.toInt(), friendlyname.rawAddress, friendlynamesize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(hwprofile.toInt(), friendlyname.rawAddress, friendlynamesize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(hwprofile.toInt(), friendlyname.rawAddress, friendlynamesize.toInt(), requiredsize.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(hwprofile.toInt(), friendlyname.rawAddress, friendlynamesize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetHwProfileList(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(hwprofilelist.rawAddress, hwprofilelistsize.toInt(), requiredsize.rawAddress, currentlyactiveindex.rawAddress)

public actual fun setupDiGetHwProfileListExA(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(hwprofilelist.rawAddress, hwprofilelistsize.toInt(), requiredsize.rawAddress, currentlyactiveindex.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetHwProfileListExW(hwprofilelist: MutPtr<UInt>, hwprofilelistsize: UInt, requiredsize: MutPtr<UInt>, currentlyactiveindex: MutPtr<UInt>, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(hwprofilelist.rawAddress, hwprofilelistsize.toInt(), requiredsize.rawAddress, currentlyactiveindex.rawAddress, machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: MutPtr<Guid>, classname: Pstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(infname.rawAddress, classguid.rawAddress, classname.rawAddress, classnamesize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: MutPtr<Guid>, classname: Pwstr, classnamesize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(infname.rawAddress, classguid.rawAddress, classname.rawAddress, classnamesize.toInt(), requiredsize.rawAddress)

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress)

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress)

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, installwizarddata: ConstPtr<SpInstallwizardData>, pagetype: UInt, flags: UInt): Hpropsheetpage =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(deviceinfoset, deviceinfodata.rawAddress, installwizarddata.rawAddress, pagetype.toInt(), flags.toInt()))

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(hwndparent.rawAddress, inffilename.rawAddress, flags.toInt(), filequeue.rawAddress)

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: ConstPtr<CVoid>, interfaceclassguid: ConstPtr<Guid>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(hwndparent.rawAddress, inffilename.rawAddress, flags.toInt(), filequeue.rawAddress, interfaceclassguid.rawAddress, reserved1.rawAddress, reserved2.rawAddress)

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr<CVoid>, interfaceclassguid: ConstPtr<Guid>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(hwndparent.rawAddress, inffilename.rawAddress, flags.toInt(), filequeue.rawAddress, interfaceclassguid.rawAddress, reserved1.rawAddress, reserved2.rawAddress)

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(hwndparent.rawAddress, inffilename.rawAddress, flags.toInt(), filequeue.rawAddress)

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiLoadClassIcon(classguid: ConstPtr<Guid>, largeicon: MutPtr<Hicon>, miniiconindex: MutPtr<Int>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(classguid.rawAddress, largeicon.rawAddress, miniiconindex.rawAddress)

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: MutPtr<Hicon>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(deviceinfoset, deviceinfodata.rawAddress, cxicon.toInt(), cyicon.toInt(), flags.toInt(), hicon.rawAddress)

public actual fun setupDiOpenClassRegKey(classguid: ConstPtr<Guid>, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(classguid.rawAddress, samdesired.toInt()))

public actual fun setupDiOpenClassRegKeyExA(classguid: ConstPtr<Guid>, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: ConstPtr<CVoid>): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(classguid.rawAddress, samdesired.toInt(), flags.toInt(), machinename.rawAddress, reserved.rawAddress))

public actual fun setupDiOpenClassRegKeyExW(classguid: ConstPtr<Guid>, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(classguid.rawAddress, samdesired.toInt(), flags.toInt(), machinename.rawAddress, reserved.rawAddress))

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(deviceinfoset, deviceinfodata.rawAddress, scope.toInt(), hwprofile.toInt(), keytype.toInt(), samdesired.toInt()))

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(deviceinfoset, deviceinstanceid.rawAddress, hwndparent.rawAddress, openflags.toInt(), deviceinfodata.rawAddress)

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(deviceinfoset, deviceinstanceid.rawAddress, hwndparent.rawAddress, openflags.toInt(), deviceinfodata.rawAddress)

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(deviceinfoset, devicepath.rawAddress, openflags.toInt(), deviceinterfacedata.rawAddress)

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, reserved: UInt, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(deviceinfoset, deviceinterfacedata.rawAddress, reserved.toInt(), samdesired.toInt()))

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(deviceinfoset, devicepath.rawAddress, openflags.toInt(), deviceinterfacedata.rawAddress)

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: ConstPtr<CVoid>, dupdeviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(deviceinfoset, deviceinfodata.rawAddress, flags.toInt(), 0L, comparecontext.rawAddress, dupdeviceinfodata.rawAddress)

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(deviceinfoset, deviceinterfacedata.rawAddress)

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(hwndparent.rawAddress, deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: ConstPtr<SpClassinstallHeader>, classinstallparamssize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(deviceinfoset, deviceinfodata.rawAddress, classinstallparams.rawAddress, classinstallparamssize.toInt())

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, classinstallparams: ConstPtr<SpClassinstallHeader>, classinstallparamssize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(deviceinfoset, deviceinfodata.rawAddress, classinstallparams.rawAddress, classinstallparamssize.toInt())

public actual fun setupDiSetClassPropertyExW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(classguid.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), flags.toInt(), machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiSetClassPropertyW(classguid: ConstPtr<Guid>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(classguid.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), flags.toInt())

public actual fun setupDiSetClassRegistryPropertyA(classguid: ConstPtr<Guid>, property: UInt, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, machinename: Pcstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(classguid.rawAddress, property.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiSetClassRegistryPropertyW(classguid: ConstPtr<Guid>, property: UInt, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, machinename: Pcwstr, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(classguid.rawAddress, property.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), machinename.rawAddress, reserved.rawAddress)

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: ConstPtr<SpDevinstallParamsA>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(deviceinfoset, deviceinfodata.rawAddress, deviceinstallparams.rawAddress)

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, deviceinstallparams: ConstPtr<SpDevinstallParamsW>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(deviceinfoset, deviceinfodata.rawAddress, deviceinstallparams.rawAddress)

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: MutPtr<SpDeviceInterfaceData>, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(deviceinfoset, deviceinterfacedata.rawAddress, flags.toInt(), reserved.rawAddress)

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: ConstPtr<SpDeviceInterfaceData>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(deviceinfoset, deviceinterfacedata.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), flags.toInt())

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, propertykey: ConstPtr<Devpropkey>, propertytype: Devproptype, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(deviceinfoset, deviceinfodata.rawAddress, propertykey.rawAddress, propertytype.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt(), flags.toInt())

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(deviceinfoset, deviceinfodata.rawAddress, property.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt())

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, property: SetupDiRegistryProperty, propertybuffer: ConstPtr<UByte>, propertybuffersize: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(deviceinfoset, deviceinfodata.rawAddress, property.toInt(), propertybuffer.rawAddress, propertybuffersize.toInt())

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2A>, driverinstallparams: ConstPtr<SpDrvinstallParams>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, driverinstallparams.rawAddress)

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, driverinfodata: ConstPtr<SpDrvinfoDataV2W>, driverinstallparams: ConstPtr<SpDrvinstallParams>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress, driverinstallparams.rawAddress)

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2A>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress)

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>, driverinfodata: MutPtr<SpDrvinfoDataV2W>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(deviceinfoset, deviceinfodata.rawAddress, driverinfodata.rawAddress)

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: MutPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupDuplicateDiskSpaceListA(diskspace: ConstPtr<CVoid>, reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(diskspace.rawAddress, reserved1.rawAddress, reserved2.toInt(), flags.toInt()))

public actual fun setupDuplicateDiskSpaceListW(diskspace: ConstPtr<CVoid>, reserved1: ConstPtr<CVoid>, reserved2: UInt, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(diskspace.rawAddress, reserved1.rawAddress, reserved2.toInt(), flags.toInt()))

public actual fun setupEnumInfSectionsA(infhandle: ConstPtr<CVoid>, index: UInt, buffer: Pstr, size: UInt, sizeneeded: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(infhandle.rawAddress, index.toInt(), buffer.rawAddress, size.toInt(), sizeneeded.rawAddress)

public actual fun setupEnumInfSectionsW(infhandle: ConstPtr<CVoid>, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(infhandle.rawAddress, index.toInt(), buffer.rawAddress, size.toInt(), sizeneeded.rawAddress)

public actual fun setupFindFirstLineA(infhandle: ConstPtr<CVoid>, section: Pcstr, key: Pcstr, context: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(infhandle.rawAddress, section.rawAddress, key.rawAddress, context.rawAddress)

public actual fun setupFindFirstLineW(infhandle: ConstPtr<CVoid>, section: Pcwstr, key: Pcwstr, context: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(infhandle.rawAddress, section.rawAddress, key.rawAddress, context.rawAddress)

public actual fun setupFindNextLine(contextin: ConstPtr<Infcontext>, contextout: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(contextin.rawAddress, contextout.rawAddress)

public actual fun setupFindNextMatchLineA(contextin: ConstPtr<Infcontext>, key: Pcstr, contextout: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(contextin.rawAddress, key.rawAddress, contextout.rawAddress)

public actual fun setupFindNextMatchLineW(contextin: ConstPtr<Infcontext>, key: Pcwstr, contextout: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(contextin.rawAddress, key.rawAddress, contextout.rawAddress)

public actual fun setupFreeSourceListA(list: MutPtr<MutPtr<Pcstr>>, count: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(list.rawAddress, count.toInt())

public actual fun setupFreeSourceListW(list: MutPtr<MutPtr<Pcwstr>>, count: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(list.rawAddress, count.toInt())

public actual fun setupGetBackupInformationA(queuehandle: ConstPtr<CVoid>, backupparams: MutPtr<SpBackupQueueParamsV2A>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(queuehandle.rawAddress, backupparams.rawAddress)

public actual fun setupGetBackupInformationW(queuehandle: ConstPtr<CVoid>, backupparams: MutPtr<SpBackupQueueParamsV2W>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(queuehandle.rawAddress, backupparams.rawAddress)

public actual fun setupGetBinaryField(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: MutPtr<UByte>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(context.rawAddress, fieldindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetFieldCount(context: ConstPtr<Infcontext>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(context.rawAddress).toUInt()

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: MutPtr<Pstr>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(sourcefilename.rawAddress, actualsourcefilename.rawAddress, sourcefilesize.rawAddress, targetfilesize.rawAddress, compressiontype.rawAddress).toUInt()

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr<UInt>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(sourcefilename.rawAddress, actualsourcefilenamebuffer.rawAddress, actualsourcefilenamebufferlen.toInt(), requiredbufferlen.rawAddress, sourcefilesize.rawAddress, targetfilesize.rawAddress, compressiontype.rawAddress)

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: MutPtr<UInt>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(sourcefilename.rawAddress, actualsourcefilenamebuffer.rawAddress, actualsourcefilenamebufferlen.toInt(), requiredbufferlen.rawAddress, sourcefilesize.rawAddress, targetfilesize.rawAddress, compressiontype.rawAddress)

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: MutPtr<Pwstr>, sourcefilesize: MutPtr<UInt>, targetfilesize: MutPtr<UInt>, compressiontype: MutPtr<FileCompressionType>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(sourcefilename.rawAddress, actualsourcefilename.rawAddress, sourcefilesize.rawAddress, targetfilesize.rawAddress, compressiontype.rawAddress).toUInt()

public actual fun setupGetFileQueueCount(filequeue: ConstPtr<CVoid>, subqueuefileop: UInt, numoperations: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(filequeue.rawAddress, subqueuefileop.toInt(), numoperations.rawAddress)

public actual fun setupGetFileQueueFlags(filequeue: ConstPtr<CVoid>, flags: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(filequeue.rawAddress, flags.rawAddress)

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(filename.rawAddress, alternateplatforminfo.rawAddress, localename.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(filename.rawAddress, alternateplatforminfo.rawAddress, localename.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(directorypath.rawAddress, infstyle.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(directorypath.rawAddress, infstyle.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfInformationA(infspec: ConstPtr<CVoid>, searchcontrol: UInt, returnbuffer: MutPtr<SpInfInformation>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(infspec.rawAddress, searchcontrol.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfInformationW(infspec: ConstPtr<CVoid>, searchcontrol: UInt, returnbuffer: MutPtr<SpInfInformation>, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(infspec.rawAddress, searchcontrol.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(driverstorelocation.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(driverstorelocation.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetIntField(context: ConstPtr<Infcontext>, fieldindex: UInt, integervalue: MutPtr<Int>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(context.rawAddress, fieldindex.toInt(), integervalue.rawAddress)

public actual fun setupGetLineByIndexA(infhandle: ConstPtr<CVoid>, section: Pcstr, index: UInt, context: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(infhandle.rawAddress, section.rawAddress, index.toInt(), context.rawAddress)

public actual fun setupGetLineByIndexW(infhandle: ConstPtr<CVoid>, section: Pcwstr, index: UInt, context: MutPtr<Infcontext>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(infhandle.rawAddress, section.rawAddress, index.toInt(), context.rawAddress)

public actual fun setupGetLineCountA(infhandle: ConstPtr<CVoid>, section: Pcstr): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(infhandle.rawAddress, section.rawAddress)

public actual fun setupGetLineCountW(infhandle: ConstPtr<CVoid>, section: Pcwstr): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(infhandle.rawAddress, section.rawAddress)

public actual fun setupGetLineTextA(context: ConstPtr<Infcontext>, infhandle: ConstPtr<CVoid>, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(context.rawAddress, infhandle.rawAddress, section.rawAddress, key.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetLineTextW(context: ConstPtr<Infcontext>, infhandle: ConstPtr<CVoid>, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(context.rawAddress, infhandle.rawAddress, section.rawAddress, key.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetMultiSzFieldA(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(context.rawAddress, fieldindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetMultiSzFieldW(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(context.rawAddress, fieldindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetNonInteractiveMode(): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode()

public actual fun setupGetSourceFileLocationA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcstr, sourceid: MutPtr<UInt>, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(infhandle.rawAddress, infcontext.rawAddress, filename.rawAddress, sourceid.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetSourceFileLocationW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcwstr, sourceid: MutPtr<UInt>, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(infhandle.rawAddress, infcontext.rawAddress, filename.rawAddress, sourceid.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetSourceFileSizeA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcstr, section: Pcstr, filesize: MutPtr<UInt>, roundingfactor: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(infhandle.rawAddress, infcontext.rawAddress, filename.rawAddress, section.rawAddress, filesize.rawAddress, roundingfactor.toInt())

public actual fun setupGetSourceFileSizeW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, filename: Pcwstr, section: Pcwstr, filesize: MutPtr<UInt>, roundingfactor: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(infhandle.rawAddress, infcontext.rawAddress, filename.rawAddress, section.rawAddress, filesize.rawAddress, roundingfactor.toInt())

public actual fun setupGetSourceInfoA(infhandle: ConstPtr<CVoid>, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(infhandle.rawAddress, sourceid.toInt(), infodesired.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetSourceInfoW(infhandle: ConstPtr<CVoid>, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(infhandle.rawAddress, sourceid.toInt(), infodesired.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetStringFieldA(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(context.rawAddress, fieldindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetStringFieldW(context: ConstPtr<Infcontext>, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(context.rawAddress, fieldindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetTargetPathA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(infhandle.rawAddress, infcontext.rawAddress, section.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetTargetPathW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(infhandle.rawAddress, infcontext.rawAddress, section.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupGetThreadLogToken(): ULong =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken().toULong()

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(ownerwindow.rawAddress))

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(ownerwindow.rawAddress, alternateprogresswindow.rawAddress, progressmessage.toInt(), reserved1.toInt(), reserved2.rawAddress))

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(logfilename.rawAddress, flags.toInt()))

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(logfilename.rawAddress, flags.toInt()))

public actual fun setupInstallFileA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(infhandle.rawAddress, infcontext.rawAddress, sourcefile.rawAddress, sourcepathroot.rawAddress, destinationname.rawAddress, copystyle.toInt(), 0L, context.rawAddress)

public actual fun setupInstallFileExA(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: ConstPtr<CVoid>, filewasinuse: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(infhandle.rawAddress, infcontext.rawAddress, sourcefile.rawAddress, sourcepathroot.rawAddress, destinationname.rawAddress, copystyle.toInt(), 0L, context.rawAddress, filewasinuse.rawAddress)

public actual fun setupInstallFileExW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr<CVoid>, filewasinuse: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(infhandle.rawAddress, infcontext.rawAddress, sourcefile.rawAddress, sourcepathroot.rawAddress, destinationname.rawAddress, copystyle.toInt(), 0L, context.rawAddress, filewasinuse.rawAddress)

public actual fun setupInstallFileW(infhandle: ConstPtr<CVoid>, infcontext: ConstPtr<Infcontext>, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(infhandle.rawAddress, infcontext.rawAddress, sourcefile.rawAddress, sourcepathroot.rawAddress, destinationname.rawAddress, copystyle.toInt(), 0L, context.rawAddress)

public actual fun setupInstallFilesFromInfSectionA(infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, filequeue: ConstPtr<CVoid>, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(infhandle.rawAddress, layoutinfhandle.rawAddress, filequeue.rawAddress, sectionname.rawAddress, sourcerootpath.rawAddress, copyflags.toInt())

public actual fun setupInstallFilesFromInfSectionW(infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, filequeue: ConstPtr<CVoid>, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(infhandle.rawAddress, layoutinfhandle.rawAddress, filequeue.rawAddress, sectionname.rawAddress, sourcerootpath.rawAddress, copyflags.toInt())

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(owner.rawAddress, infhandle.rawAddress, sectionname.rawAddress, flags.toInt(), relativekeyroot.rawAddress, sourcerootpath.rawAddress, copyflags.toInt(), 0L, context.rawAddress, deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(owner.rawAddress, infhandle.rawAddress, sectionname.rawAddress, flags.toInt(), relativekeyroot.rawAddress, sourcerootpath.rawAddress, copyflags.toInt(), 0L, context.rawAddress, deviceinfoset, deviceinfodata.rawAddress)

public actual fun setupInstallServicesFromInfSectionA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(infhandle.rawAddress, sectionname.rawAddress, flags.toInt())

public actual fun setupInstallServicesFromInfSectionExA(infhandle: ConstPtr<CVoid>, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(infhandle.rawAddress, sectionname.rawAddress, flags.toInt(), deviceinfoset, deviceinfodata.rawAddress, reserved1.rawAddress, reserved2.rawAddress)

public actual fun setupInstallServicesFromInfSectionExW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: ConstPtr<SpDevinfoData>, reserved1: ConstPtr<CVoid>, reserved2: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(infhandle.rawAddress, sectionname.rawAddress, flags.toInt(), deviceinfoset, deviceinfodata.rawAddress, reserved1.rawAddress, reserved2.rawAddress)

public actual fun setupInstallServicesFromInfSectionW(infhandle: ConstPtr<CVoid>, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(infhandle.rawAddress, sectionname.rawAddress, flags.toInt())

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(cabinetfile.rawAddress, reserved.toInt(), 0L, context.rawAddress)

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(cabinetfile.rawAddress, reserved.toInt(), 0L, context.rawAddress)

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(messagestring.rawAddress, severity.toInt())

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(messagestring.rawAddress, severity.toInt())

public actual fun setupLogFileA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(fileloghandle.rawAddress, logsectionname.rawAddress, sourcefilename.rawAddress, targetfilename.rawAddress, checksum.toInt(), disktagfile.rawAddress, diskdescription.rawAddress, otherinfo.rawAddress, flags.toInt())

public actual fun setupLogFileW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(fileloghandle.rawAddress, logsectionname.rawAddress, sourcefilename.rawAddress, targetfilename.rawAddress, checksum.toInt(), disktagfile.rawAddress, diskdescription.rawAddress, otherinfo.rawAddress, flags.toInt())

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: ConstPtr<CVoid>, errorline: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(filename.rawAddress, infhandle.rawAddress, errorline.rawAddress)

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: ConstPtr<CVoid>, errorline: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(filename.rawAddress, infhandle.rawAddress, errorline.rawAddress)

public actual fun setupOpenFileQueue(): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue())

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(filename.rawAddress, infclass.rawAddress, infstyle.toInt(), errorline.rawAddress))

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(filename.rawAddress, infclass.rawAddress, infstyle.toInt(), errorline.rawAddress))

public actual fun setupOpenLog(erase: Bool): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(erase)

public actual fun setupOpenMasterInf(): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf())

public actual fun setupPrepareQueueForRestoreA(queuehandle: ConstPtr<CVoid>, backuppath: Pcstr, restoreflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(queuehandle.rawAddress, backuppath.rawAddress, restoreflags.toInt())

public actual fun setupPrepareQueueForRestoreW(queuehandle: ConstPtr<CVoid>, backuppath: Pcwstr, restoreflags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(queuehandle.rawAddress, backuppath.rawAddress, restoreflags.toInt())

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(hwndparent.rawAddress, dialogtitle.rawAddress, diskname.rawAddress, pathtosource.rawAddress, filesought.rawAddress, tagfile.rawAddress, diskpromptstyle.toInt(), pathbuffer.rawAddress, pathbuffersize.toInt(), pathrequiredsize.rawAddress).toUInt()

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: MutPtr<UInt>): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(hwndparent.rawAddress, dialogtitle.rawAddress, diskname.rawAddress, pathtosource.rawAddress, filesought.rawAddress, tagfile.rawAddress, diskpromptstyle.toInt(), pathbuffer.rawAddress, pathbuffersize.toInt(), pathrequiredsize.rawAddress).toUInt()

public actual fun setupPromptReboot(filequeue: ConstPtr<CVoid>, owner: Hwnd, scanonly: Bool): Int =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(filequeue.rawAddress, owner.rawAddress, scanonly)

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: ConstPtr<CVoid>, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(diskspace.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: ConstPtr<CVoid>, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(diskspace.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryFileLogA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(fileloghandle.rawAddress, logsectionname.rawAddress, targetfilename.rawAddress, desiredinfo, dataout.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryFileLogW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(fileloghandle.rawAddress, logsectionname.rawAddress, targetfilename.rawAddress, desiredinfo, dataout.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryInfFileInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(infinformation.rawAddress, infindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryInfFileInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(infinformation.rawAddress, infindex.toInt(), returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryInfOriginalFileInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, originalfileinfo: MutPtr<SpOriginalFileInfoA>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(infinformation.rawAddress, infindex.toInt(), alternateplatforminfo.rawAddress, originalfileinfo.rawAddress)

public actual fun setupQueryInfOriginalFileInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, originalfileinfo: MutPtr<SpOriginalFileInfoW>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(infinformation.rawAddress, infindex.toInt(), alternateplatforminfo.rawAddress, originalfileinfo.rawAddress)

public actual fun setupQueryInfVersionInformationA(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(infinformation.rawAddress, infindex.toInt(), key.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQueryInfVersionInformationW(infinformation: ConstPtr<SpInfInformation>, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(infinformation.rawAddress, infindex.toInt(), key.rawAddress, returnbuffer.rawAddress, returnbuffersize.toInt(), requiredsize.rawAddress)

public actual fun setupQuerySourceListA(flags: UInt, list: MutPtr<MutPtr<Pcstr>>, count: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(flags.toInt(), list.rawAddress, count.rawAddress)

public actual fun setupQuerySourceListW(flags: UInt, list: MutPtr<MutPtr<Pcwstr>>, count: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(flags.toInt(), list.rawAddress, count.rawAddress)

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: ConstPtr<CVoid>, drivespec: Pcstr, spacerequired: MutPtr<Long>, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(diskspace.rawAddress, drivespec.rawAddress, spacerequired.rawAddress, reserved1.rawAddress, reserved2.toInt())

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: ConstPtr<CVoid>, drivespec: Pcwstr, spacerequired: MutPtr<Long>, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(diskspace.rawAddress, drivespec.rawAddress, spacerequired.rawAddress, reserved1.rawAddress, reserved2.toInt())

public actual fun setupQueueCopyA(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(queuehandle.rawAddress, sourcerootpath.rawAddress, sourcepath.rawAddress, sourcefilename.rawAddress, sourcedescription.rawAddress, sourcetagfile.rawAddress, targetdirectory.rawAddress, targetfilename.rawAddress, copystyle.toInt())

public actual fun setupQueueCopyIndirectA(copyparams: ConstPtr<SpFileCopyParamsA>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(copyparams.rawAddress)

public actual fun setupQueueCopyIndirectW(copyparams: ConstPtr<SpFileCopyParamsW>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(copyparams.rawAddress)

public actual fun setupQueueCopySectionA(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(queuehandle.rawAddress, sourcerootpath.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, section.rawAddress, copystyle.toInt())

public actual fun setupQueueCopySectionW(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(queuehandle.rawAddress, sourcerootpath.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, section.rawAddress, copystyle.toInt())

public actual fun setupQueueCopyW(queuehandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(queuehandle.rawAddress, sourcerootpath.rawAddress, sourcepath.rawAddress, sourcefilename.rawAddress, sourcedescription.rawAddress, sourcetagfile.rawAddress, targetdirectory.rawAddress, targetfilename.rawAddress, copystyle.toInt())

public actual fun setupQueueDefaultCopyA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(queuehandle.rawAddress, infhandle.rawAddress, sourcerootpath.rawAddress, sourcefilename.rawAddress, targetfilename.rawAddress, copystyle.toInt())

public actual fun setupQueueDefaultCopyW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(queuehandle.rawAddress, infhandle.rawAddress, sourcerootpath.rawAddress, sourcefilename.rawAddress, targetfilename.rawAddress, copystyle.toInt())

public actual fun setupQueueDeleteA(queuehandle: ConstPtr<CVoid>, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(queuehandle.rawAddress, pathpart1.rawAddress, pathpart2.rawAddress)

public actual fun setupQueueDeleteSectionA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(queuehandle.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, section.rawAddress)

public actual fun setupQueueDeleteSectionW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(queuehandle.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, section.rawAddress)

public actual fun setupQueueDeleteW(queuehandle: ConstPtr<CVoid>, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(queuehandle.rawAddress, pathpart1.rawAddress, pathpart2.rawAddress)

public actual fun setupQueueRenameA(queuehandle: ConstPtr<CVoid>, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(queuehandle.rawAddress, sourcepath.rawAddress, sourcefilename.rawAddress, targetpath.rawAddress, targetfilename.rawAddress)

public actual fun setupQueueRenameSectionA(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(queuehandle.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, section.rawAddress)

public actual fun setupQueueRenameSectionW(queuehandle: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, section: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(queuehandle.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, section.rawAddress)

public actual fun setupQueueRenameW(queuehandle: ConstPtr<CVoid>, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(queuehandle.rawAddress, sourcepath.rawAddress, sourcefilename.rawAddress, targetpath.rawAddress, targetfilename.rawAddress)

public actual fun setupRemoveFileLogEntryA(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(fileloghandle.rawAddress, logsectionname.rawAddress, targetfilename.rawAddress)

public actual fun setupRemoveFileLogEntryW(fileloghandle: ConstPtr<CVoid>, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(fileloghandle.rawAddress, logsectionname.rawAddress, targetfilename.rawAddress)

public actual fun setupRemoveFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(diskspace.rawAddress, targetfilespec.rawAddress, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupRemoveFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(diskspace.rawAddress, targetfilespec.rawAddress, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(flags.toInt(), source.rawAddress)

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(flags.toInt(), source.rawAddress)

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(diskspace.rawAddress, infhandle.rawAddress, layoutinfhandle.rawAddress, sectionname.rawAddress, reserved1.rawAddress, reserved2.toInt())

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, layoutinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(diskspace.rawAddress, infhandle.rawAddress, layoutinfhandle.rawAddress, sectionname.rawAddress, reserved1.rawAddress, reserved2.toInt())

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(diskspace.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, sectionname.rawAddress, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: ConstPtr<CVoid>, infhandle: ConstPtr<CVoid>, listinfhandle: ConstPtr<CVoid>, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: ConstPtr<CVoid>, reserved2: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(diskspace.rawAddress, infhandle.rawAddress, listinfhandle.rawAddress, sectionname.rawAddress, operation.toInt(), reserved1.rawAddress, reserved2.toInt())

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(hwndparent.rawAddress, dialogtitle.rawAddress, sourcefile.rawAddress, targetfile.rawAddress, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(hwndparent.rawAddress, dialogtitle.rawAddress, sourcefile.rawAddress, targetfile.rawAddress, win32errorcode.toInt(), style.toInt()).toUInt()

public actual fun setupScanFileQueueA(filequeue: ConstPtr<CVoid>, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: ConstPtr<CVoid>, result: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(filequeue.rawAddress, flags.toInt(), window.rawAddress, 0L, callbackcontext.rawAddress, result.rawAddress)

public actual fun setupScanFileQueueW(filequeue: ConstPtr<CVoid>, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: ConstPtr<CVoid>, result: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(filequeue.rawAddress, flags.toInt(), window.rawAddress, 0L, callbackcontext.rawAddress, result.rawAddress)

public actual fun setupSetDirectoryIdA(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(infhandle.rawAddress, id.toInt(), directory.rawAddress)

public actual fun setupSetDirectoryIdExA(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(infhandle.rawAddress, id.toInt(), directory.rawAddress, flags.toInt(), reserved1.toInt(), reserved2.rawAddress)

public actual fun setupSetDirectoryIdExW(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(infhandle.rawAddress, id.toInt(), directory.rawAddress, flags.toInt(), reserved1.toInt(), reserved2.rawAddress)

public actual fun setupSetDirectoryIdW(infhandle: ConstPtr<CVoid>, id: UInt, directory: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(infhandle.rawAddress, id.toInt(), directory.rawAddress)

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: ConstPtr<CVoid>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, alternatedefaultcatalogfile: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(queuehandle.rawAddress, alternateplatforminfo.rawAddress, alternatedefaultcatalogfile.rawAddress)

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: ConstPtr<CVoid>, alternateplatforminfo: ConstPtr<SpAltplatformInfoV2>, alternatedefaultcatalogfile: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(queuehandle.rawAddress, alternateplatforminfo.rawAddress, alternatedefaultcatalogfile.rawAddress)

public actual fun setupSetFileQueueFlags(filequeue: ConstPtr<CVoid>, flagmask: UInt, flags: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(filequeue.rawAddress, flagmask.toInt(), flags.toInt())

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(noninteractiveflag)

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(override.rawAddress)

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(override.rawAddress)

public actual fun setupSetSourceListA(flags: UInt, sourcelist: ConstPtr<Pcstr>, sourcecount: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(flags.toInt(), sourcelist.rawAddress, sourcecount.toInt())

public actual fun setupSetSourceListW(flags: UInt, sourcelist: ConstPtr<Pcwstr>, sourcecount: UInt): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(flags.toInt(), sourcelist.rawAddress, sourcecount.toInt())

public actual fun setupSetThreadLogToken(logtoken: ULong) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(logtoken.toLong())
}

public actual fun setupTermDefaultQueueCallback(context: ConstPtr<CVoid>) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(context.rawAddress)
}

public actual fun setupTerminateFileLog(fileloghandle: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(fileloghandle.rawAddress)

public actual fun setupUninstallNewlyCopiedInfs(filequeue: ConstPtr<CVoid>, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(filequeue.rawAddress, flags.toInt(), reserved.rawAddress)

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(inffilename.rawAddress, flags.toInt(), reserved.rawAddress)

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: ConstPtr<CVoid>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(inffilename.rawAddress, flags.toInt(), reserved.rawAddress)

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsignerinfo: MutPtr<SpInfSignerInfoV2A>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(infname.rawAddress, altplatforminfo.rawAddress, infsignerinfo.rawAddress)

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: ConstPtr<SpAltplatformInfoV2>, infsignerinfo: MutPtr<SpInfSignerInfoV2W>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(infname.rawAddress, altplatforminfo.rawAddress, infsignerinfo.rawAddress)

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(logtoken.toLong(), category.toInt(), flags.toInt(), messagestr.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(logtoken.toLong(), category.toInt(), logflags.toInt(), error.toInt(), messagestr.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: ConstPtr<CVoid>, context: ConstPtr<Infcontext>) {
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(logtoken.toLong(), flags.toInt(), infhandle.rawAddress, context.rawAddress)
}

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(hwndparent.rawAddress, hardwareid.rawAddress, fullinfpath.rawAddress, installflags.toInt(), brebootrequired.rawAddress)

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: MutPtr<Bool>): Bool =
    WindowsWin32DevicesDeviceanddriverinstallationJniBridge.windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(hwndparent.rawAddress, hardwareid.rawAddress, fullinfpath.rawAddress, installflags.toInt(), brebootrequired.rawAddress)
