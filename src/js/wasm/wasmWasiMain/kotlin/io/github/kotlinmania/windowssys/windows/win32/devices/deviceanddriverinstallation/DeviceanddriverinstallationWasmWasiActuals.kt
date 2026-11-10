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

public actual fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddEmptyLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddEmptyLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddResDes(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmAddResDesEx(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmConnectMachineA(uncservername: Pcstr, phmachine: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmConnectMachineW(uncservername: Pcwstr, phmachine: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCreateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCreateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCreateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCreateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmCreateRangeList(prlh: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteClassKey(classguid: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteClassKeyEx(classguid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDisconnectMachine(hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnumerateClasses(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFindRange(pullstart: COpaquePointer?, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFirstRange(rlh: ULong, pullstart: COpaquePointer?, pullend: COpaquePointer?, preelement: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeLogConfHandle(lclogconf: ULong): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeResDes(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeResDesHandle(rdresdes: ULong): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetChild(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetChildEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassKeyNameA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassKeyNameW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassKeyNameExA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassKeyNameExW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassNameA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassNameW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassNameExA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassNameExW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassPropertyKeysEx(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDepth(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDepthEx(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeStatus(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDevNodeStatusEx(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListSizeA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListSizeW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListSizeExA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdListSizeExW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdSize(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceIdSizeEx(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListExA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListExW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListSizeA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListSizeW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListSizeExA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfaceListSizeExW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetFirstLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetFirstLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetGlobalState(pulstate: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetGlobalStateEx(pulstate: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetLogConfPriority(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetNextLogConf(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetNextLogConfEx(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetNextResDes(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetNextResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetParent(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetParentEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResDesData(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResDesDataEx(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResDesDataSize(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResDesDataSizeEx(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetSibling(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetSiblingEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetVersion(): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmGetVersionEx(hmachine: Long): UShort =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmIsDockStationPresent(pbpresent: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmIsDockStationPresentEx(pbpresent: COpaquePointer?, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmIsVersionAvailable(wversion: UShort): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmLocateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmLocateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmLocateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmLocateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmModifyResDes(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmModifyResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmNextRange(preelement: COpaquePointer?, pullstart: COpaquePointer?, pullend: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenClassKeyA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenClassKeyW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenClassKeyExA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenClassKeyExW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryArbitratorFreeData(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryArbitratorFreeDataEx(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryArbitratorFreeSize(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryArbitratorFreeSizeEx(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmQueryResourceConflictList(pclconflictlist: COpaquePointer?, dndevinst: UInt, resourceid: CmRestype, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRegisterNotification(pfilter: COpaquePointer?, pcontext: COpaquePointer?, pcallback: PcmNotifyCallback, pnotifycontext: COpaquePointer?): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRequestEjectPc(): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRequestEjectPcEx(hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRunDetection(ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, flags: DiinstalldeviceFlags, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupAddInstallSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddInstallSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddToDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddToDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAdjustDiskSpaceListA(diskspace: COpaquePointer?, driveroot: Pcstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupAdjustDiskSpaceListW(diskspace: COpaquePointer?, driveroot: Pcwstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCancelTemporarySourceList(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCloseFileQueue(queuehandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCloseInfFile(infhandle: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupCloseLog() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupCommitFileQueueA(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCommitFileQueueW(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupConfigureWmiFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupConfigureWmiFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCreateDiskSpaceListA(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupCreateDiskSpaceListW(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDefaultQueueCallbackA(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDefaultQueueCallbackW(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDestroyDiskSpaceList(diskspace: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiBuildClassInfoList(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassNameFromGuidA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassNameFromGuidExA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassNameFromGuidExW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiClassNameFromGuidW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: COpaquePointer?, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInfoList(classguid: COpaquePointer?, hwndparent: Hwnd): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInfoListExA(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInfoListExW(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: COpaquePointer?, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDestroyClassImageList(classimagelistdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, memberindex: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetActualModelsSectionA(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetActualModelsSectionW(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetActualSectionToInstallA(infhandle: COpaquePointer?, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetActualSectionToInstallExA(infhandle: COpaquePointer?, infsectionname: Pcstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetActualSectionToInstallExW(infhandle: COpaquePointer?, infsectionname: Pcwstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetActualSectionToInstallW(infhandle: COpaquePointer?, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassBitmapIndex(classguid: COpaquePointer?, miniiconindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDescriptionA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDescriptionExA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDescriptionExW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDescriptionW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDevsA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDevsExA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDevsExW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassDevsW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassImageIndex(classimagelistdata: COpaquePointer?, classguid: COpaquePointer?, imageindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassImageList(classimagelistdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassImageListExA(classimagelistdata: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassImageListExW(classimagelistdata: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassPropertyKeysExW(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliasdeviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileList(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileListExA(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetHwProfileListExW(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetINFClassA(infname: Pcstr, classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetINFClassW(infname: Pcwstr, classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, installwizarddata: COpaquePointer?, pagetype: UInt, flags: UInt): Hpropsheetpage =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiLoadClassIcon(classguid: COpaquePointer?, largeicon: COpaquePointer?, miniiconindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenClassRegKey(classguid: COpaquePointer?, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenClassRegKeyExA(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: COpaquePointer?): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenClassRegKeyExW(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt): Hkey =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: COpaquePointer?, dupdeviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDuplicateDiskSpaceListA(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupDuplicateDiskSpaceListW(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupEnumInfSectionsA(infhandle: COpaquePointer?, index: UInt, buffer: Pstr, size: UInt, sizeneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupEnumInfSectionsW(infhandle: COpaquePointer?, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFindFirstLineA(infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFindFirstLineW(infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFindNextLine(contextin: COpaquePointer?, contextout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFindNextMatchLineA(contextin: COpaquePointer?, key: Pcstr, contextout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFindNextMatchLineW(contextin: COpaquePointer?, key: Pcwstr, contextout: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFreeSourceListA(list: COpaquePointer?, count: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupFreeSourceListW(list: COpaquePointer?, count: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetBackupInformationA(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetBackupInformationW(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetBinaryField(context: COpaquePointer?, fieldindex: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFieldCount(context: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFileQueueCount(filequeue: COpaquePointer?, subqueuefileop: UInt, numoperations: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetFileQueueFlags(filequeue: COpaquePointer?, flags: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: COpaquePointer?, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: COpaquePointer?, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfInformationA(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfInformationW(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetIntField(context: COpaquePointer?, fieldindex: UInt, integervalue: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetLineByIndexA(infhandle: COpaquePointer?, section: Pcstr, index: UInt, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetLineByIndexW(infhandle: COpaquePointer?, section: Pcwstr, index: UInt, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetLineCountA(infhandle: COpaquePointer?, section: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetLineCountW(infhandle: COpaquePointer?, section: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetLineTextA(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetLineTextW(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetMultiSzFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetMultiSzFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetNonInteractiveMode(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetSourceFileLocationA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, sourceid: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetSourceFileLocationW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, sourceid: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetSourceFileSizeA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, section: Pcstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetSourceFileSizeW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, section: Pcwstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetSourceInfoA(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetSourceInfoW(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetStringFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetStringFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetTargetPathA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetTargetPathW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupGetThreadLogToken(): ULong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFileA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFileExA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFileExW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFileW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFilesFromInfSectionA(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFilesFromInfSectionW(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallServicesFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallServicesFromInfSectionExA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallServicesFromInfSectionExW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupInstallServicesFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupLogFileA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupLogFileW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenFileQueue(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenLog(erase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupOpenMasterInf(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPrepareQueueForRestoreA(queuehandle: COpaquePointer?, backuppath: Pcstr, restoreflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPrepareQueueForRestoreW(queuehandle: COpaquePointer?, backuppath: Pcwstr, restoreflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPromptForDiskA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, filesought: Pcstr, tagfile: Pcstr, diskpromptstyle: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPromptForDiskW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, filesought: Pcwstr, tagfile: Pcwstr, diskpromptstyle: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupPromptReboot(filequeue: COpaquePointer?, owner: Hwnd, scanonly: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryDrivesInDiskSpaceListA(diskspace: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryDrivesInDiskSpaceListW(diskspace: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryFileLogA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr, desiredinfo: SetupFileLogInfo, dataout: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryFileLogW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr, desiredinfo: SetupFileLogInfo, dataout: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryInfFileInformationA(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryInfFileInformationW(infinformation: COpaquePointer?, infindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryInfOriginalFileInformationA(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryInfOriginalFileInformationW(infinformation: COpaquePointer?, infindex: UInt, alternateplatforminfo: COpaquePointer?, originalfileinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryInfVersionInformationA(infinformation: COpaquePointer?, infindex: UInt, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueryInfVersionInformationW(infinformation: COpaquePointer?, infindex: UInt, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQuerySourceListA(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQuerySourceListW(flags: UInt, list: COpaquePointer?, count: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQuerySpaceRequiredOnDriveA(diskspace: COpaquePointer?, drivespec: Pcstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQuerySpaceRequiredOnDriveW(diskspace: COpaquePointer?, drivespec: Pcwstr, spacerequired: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueCopyA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, sourcepath: Pcstr, sourcefilename: Pcstr, sourcedescription: Pcstr, sourcetagfile: Pcstr, targetdirectory: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueCopyIndirectA(copyparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueCopyIndirectW(copyparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueCopySectionA(queuehandle: COpaquePointer?, sourcerootpath: Pcstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueCopySectionW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueCopyW(queuehandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcepath: Pcwstr, sourcefilename: Pcwstr, sourcedescription: Pcwstr, sourcetagfile: Pcwstr, targetdirectory: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueDefaultCopyA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueDefaultCopyW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, sourcerootpath: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, copystyle: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueDeleteA(queuehandle: COpaquePointer?, pathpart1: Pcstr, pathpart2: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueDeleteSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueDeleteSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueDeleteW(queuehandle: COpaquePointer?, pathpart1: Pcwstr, pathpart2: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueRenameA(queuehandle: COpaquePointer?, sourcepath: Pcstr, sourcefilename: Pcstr, targetpath: Pcstr, targetfilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueRenameSectionA(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueRenameSectionW(queuehandle: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, section: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupQueueRenameW(queuehandle: COpaquePointer?, sourcepath: Pcwstr, sourcefilename: Pcwstr, targetpath: Pcwstr, targetfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveFileLogEntryA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, targetfilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveFileLogEntryW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, targetfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveFromDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveFromDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveFromSourceListA(flags: UInt, source: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveFromSourceListW(flags: UInt, source: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveInstallSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveInstallSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveSectionFromDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRemoveSectionFromDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRenameErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupRenameErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupScanFileQueueA(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackA, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupScanFileQueueW(filequeue: COpaquePointer?, flags: SetupscanfilequeueFlags, window: Hwnd, callbackroutine: PspFileCallbackW, callbackcontext: COpaquePointer?, result: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetDirectoryIdA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetDirectoryIdExA(infhandle: COpaquePointer?, id: UInt, directory: Pcstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetDirectoryIdExW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr, flags: UInt, reserved1: UInt, reserved2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetDirectoryIdW(infhandle: COpaquePointer?, id: UInt, directory: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetFileQueueAlternatePlatformA(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetFileQueueAlternatePlatformW(queuehandle: COpaquePointer?, alternateplatforminfo: COpaquePointer?, alternatedefaultcatalogfile: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetFileQueueFlags(filequeue: COpaquePointer?, flagmask: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetNonInteractiveMode(noninteractiveflag: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetPlatformPathOverrideA(override: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetPlatformPathOverrideW(override: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetSourceListA(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetSourceListW(flags: UInt, sourcelist: COpaquePointer?, sourcecount: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupSetThreadLogToken(logtoken: ULong) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupTermDefaultQueueCallback(context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupTerminateFileLog(fileloghandle: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupUninstallNewlyCopiedInfs(filequeue: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupUninstallOEMInfA(inffilename: Pcstr, flags: UInt, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupUninstallOEMInfW(inffilename: Pcwstr, flags: UInt, reserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupVerifyInfFileA(infname: Pcstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupVerifyInfFileW(infname: Pcwstr, altplatforminfo: COpaquePointer?, infsignerinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setupWriteTextLog(logtoken: ULong, category: UInt, flags: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupWriteTextLogError(logtoken: ULong, category: UInt, logflags: UInt, error: UInt, messagestr: Pcstr, vararg variadicArgs: Long) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun setupWriteTextLogInfLine(logtoken: ULong, flags: UInt, infhandle: COpaquePointer?, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun updateDriverForPlugAndPlayDevicesA(hwndparent: Hwnd, hardwareid: Pcstr, fullinfpath: Pcstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateDriverForPlugAndPlayDevicesW(hwndparent: Hwnd, hardwareid: Pcwstr, fullinfpath: Pcwstr, installflags: UpdatedriverforplugandplaydevicesFlags, brebootrequired: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
