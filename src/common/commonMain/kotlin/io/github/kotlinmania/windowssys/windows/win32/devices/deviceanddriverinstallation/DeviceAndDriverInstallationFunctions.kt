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

public expect fun cmpWaitNoPendingInstallEvents(dwtimeout: UInt): UInt

public expect fun cmAddEmptyLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt): Configret

public expect fun cmAddEmptyLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, priority: Priority, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddIda(dndevinst: UInt, pszid: Pcstr, ulflags: UInt): Configret

public expect fun cmAddIdw(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt): Configret

public expect fun cmAddIdExA(dndevinst: UInt, pszid: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddIdExW(dndevinst: UInt, pszid: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmAddRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmAddResDes(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret

public expect fun cmAddResDesEx(prdresdes: COpaquePointer?, lclogconf: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmConnectMachineA(uncservername: Pcstr, phmachine: COpaquePointer?): Configret

public expect fun cmConnectMachineW(uncservername: Pcwstr, phmachine: COpaquePointer?): Configret

public expect fun cmCreateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt): Configret

public expect fun cmCreateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt): Configret

public expect fun cmCreateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmCreateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, dnparent: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmCreateRangeList(prlh: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmDeleteClassKey(classguid: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmDeleteClassKeyEx(classguid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDevNodeKey(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt): Configret

public expect fun cmDeleteDevNodeKeyEx(dndevnode: UInt, ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret

public expect fun cmDeleteDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret

public expect fun cmDeleteDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDeleteRange(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmDetectResourceConflict(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmDetectResourceConflictEx(dndevinst: UInt, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, pbconflictdetected: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDisableDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmDisableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmDisconnectMachine(hmachine: Long): Configret

public expect fun cmDupRangeList(rlhold: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmEnableDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmEnableDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmEnumerateClasses(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags): Configret

public expect fun cmEnumerateClassesEx(ulclassindex: UInt, classguid: COpaquePointer?, ulflags: CmEnumerateFlags, hmachine: Long): Configret

public expect fun cmEnumerateEnumeratorsA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmEnumerateEnumeratorsW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmEnumerateEnumeratorsExA(ulenumindex: UInt, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmEnumerateEnumeratorsExW(ulenumindex: UInt, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFindRange(pullstart: COpaquePointer?, ullstart: ULong, ullength: UInt, ullalignment: ULong, ullend: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmFirstRange(rlh: ULong, pullstart: COpaquePointer?, pullend: COpaquePointer?, preelement: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmFreeLogConf(lclogconftobefreed: ULong, ulflags: UInt): Configret

public expect fun cmFreeLogConfEx(lclogconftobefreed: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFreeLogConfHandle(lclogconf: ULong): Configret

public expect fun cmFreeRangeList(rlh: ULong, ulflags: UInt): Configret

public expect fun cmFreeResDes(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret

public expect fun cmFreeResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmFreeResDesHandle(rdresdes: ULong): Configret

public expect fun cmFreeResourceConflictHandle(clconflictlist: ULong): Configret

public expect fun cmGetChild(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetChildEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassKeyNameA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetClassKeyNameW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetClassKeyNameExA(classguid: COpaquePointer?, pszkeyname: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassKeyNameExW(classguid: COpaquePointer?, pszkeyname: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassNameA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetClassNameW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetClassNameExA(classguid: COpaquePointer?, buffer: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassNameExW(classguid: COpaquePointer?, buffer: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetClassPropertyKeysEx(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDepth(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDepthEx(puldepth: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeCustomPropertyA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDevNodeCustomPropertyW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDevNodeCustomPropertyExA(dndevinst: UInt, pszcustompropertyname: Pcstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeCustomPropertyExW(dndevinst: UInt, pszcustompropertyname: Pcwstr, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodePropertyKeys(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDevNodePropertyKeysEx(dndevinst: UInt, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, pulregdatatype: COpaquePointer?, buffer: COpaquePointer?, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDevNodeStatus(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDevNodeStatusEx(pulstatus: COpaquePointer?, pulproblemnumber: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIda(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdw(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdExA(dndevinst: UInt, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdExW(dndevinst: UInt, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListExA(pszfilter: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListExW(pszfilter: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListSizeA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListSizeW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt): Configret

public expect fun cmGetDeviceIdListSizeExA(pullen: COpaquePointer?, pszfilter: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdListSizeExW(pullen: COpaquePointer?, pszfilter: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceIdSize(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetDeviceIdSizeEx(pullen: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceAliasA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfaceAliasW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfaceAliasExA(pszdeviceinterface: Pcstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceAliasExW(pszdeviceinterface: Pcwstr, aliasinterfaceguid: COpaquePointer?, pszaliasdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListExA(interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, buffer: Pstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListExW(interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, buffer: Pwstr, bufferlen: UInt, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListSizeA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListSizeW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags): Configret

public expect fun cmGetDeviceInterfaceListSizeExA(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfaceListSizeExW(pullen: COpaquePointer?, interfaceclassguid: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmGetDeviceInterfaceListFlags, hmachine: Long): Configret

public expect fun cmGetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetDeviceInterfacePropertyKeysW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetDeviceInterfacePropertyKeysExW(pszdeviceinterface: Pcwstr, propertykeyarray: COpaquePointer?, propertykeycount: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetFirstLogConf(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf): Configret

public expect fun cmGetFirstLogConfEx(plclogconf: COpaquePointer?, dndevinst: UInt, ulflags: CmLogConf, hmachine: Long): Configret

public expect fun cmGetGlobalState(pulstate: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetGlobalStateEx(pulstate: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHwProfFlagsA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetHwProfFlagsW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetHwProfFlagsExA(pdeviceid: Pcstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHwProfFlagsExW(pdeviceid: Pcwstr, ulhardwareprofile: UInt, pulvalue: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHardwareProfileInfoA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetHardwareProfileInfoW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetHardwareProfileInfoExA(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetHardwareProfileInfoExW(ulindex: UInt, phwprofileinfo: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetLogConfPriority(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetLogConfPriorityEx(lclogconf: ULong, ppriority: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetNextLogConf(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt): Configret

public expect fun cmGetNextLogConfEx(plclogconf: COpaquePointer?, lclogconf: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetNextResDes(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmGetNextResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, forresource: CmRestype, presourceid: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetParent(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetParentEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResDesData(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt): Configret

public expect fun cmGetResDesDataEx(rdresdes: ULong, buffer: COpaquePointer?, bufferlen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResDesDataSize(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt): Configret

public expect fun cmGetResDesDataSizeEx(pulsize: COpaquePointer?, rdresdes: ULong, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetResourceConflictCount(clconflictlist: ULong, pulcount: COpaquePointer?): Configret

public expect fun cmGetResourceConflictDetailsA(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret

public expect fun cmGetResourceConflictDetailsW(clconflictlist: ULong, ulindex: UInt, pconflictdetails: COpaquePointer?): Configret

public expect fun cmGetSibling(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmGetSiblingEx(pdndevinst: COpaquePointer?, dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmGetVersion(): UShort

public expect fun cmGetVersionEx(hmachine: Long): UShort

public expect fun cmIntersectRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmInvertRangeList(rlhold: ULong, rlhnew: ULong, ullmaxvalue: ULong, ulflags: UInt): Configret

public expect fun cmIsDockStationPresent(pbpresent: COpaquePointer?): Configret

public expect fun cmIsDockStationPresentEx(pbpresent: COpaquePointer?, hmachine: Long): Configret

public expect fun cmIsVersionAvailable(wversion: UShort): Bool

public expect fun cmIsVersionAvailableEx(wversion: UShort, hmachine: Long): Bool

public expect fun cmLocateDevNodeA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: CmLocateDevnodeFlags): Configret

public expect fun cmLocateDevNodeW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: CmLocateDevnodeFlags): Configret

public expect fun cmLocateDevNodeExA(pdndevinst: COpaquePointer?, pdeviceid: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmLocateDevNodeExW(pdndevinst: COpaquePointer?, pdeviceid: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmMapCrToWin32Err(cmreturncode: Configret, defaulterr: UInt): UInt

public expect fun cmMergeRangeList(rlhold1: ULong, rlhold2: ULong, rlhnew: ULong, ulflags: UInt): Configret

public expect fun cmModifyResDes(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt): Configret

public expect fun cmModifyResDesEx(prdresdes: COpaquePointer?, rdresdes: ULong, resourceid: UInt, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmMoveDevNode(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt): Configret

public expect fun cmMoveDevNodeEx(dnfromdevinst: UInt, dntodevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmNextRange(preelement: COpaquePointer?, pullstart: COpaquePointer?, pullend: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmOpenClassKeyA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmOpenClassKeyW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmOpenClassKeyExA(classguid: COpaquePointer?, pszclassname: Pcstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenClassKeyExW(classguid: COpaquePointer?, pszclassname: Pcwstr, samdesired: UInt, disposition: UInt, phkclass: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDevNodeKey(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmOpenDevNodeKeyEx(dndevnode: UInt, samdesired: UInt, ulhardwareprofile: UInt, disposition: UInt, phkdevice: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDeviceInterfaceKeyA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmOpenDeviceInterfaceKeyW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmOpenDeviceInterfaceKeyExA(pszdeviceinterface: Pcstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmOpenDeviceInterfaceKeyExW(pszdeviceinterface: Pcwstr, samdesired: UInt, disposition: UInt, phkdeviceinterface: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryAndRemoveSubTreeA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmQueryAndRemoveSubTreeW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmQueryAndRemoveSubTreeExA(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryAndRemoveSubTreeExW(dnancestor: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryArbitratorFreeData(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret

public expect fun cmQueryArbitratorFreeDataEx(pdata: COpaquePointer?, datalen: UInt, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryArbitratorFreeSize(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt): Configret

public expect fun cmQueryArbitratorFreeSizeEx(pulsize: COpaquePointer?, dndevinst: UInt, resourceid: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret

public expect fun cmQueryRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmQueryResourceConflictList(pclconflictlist: COpaquePointer?, dndevinst: UInt, resourceid: CmRestype, resourcedata: COpaquePointer?, resourcelen: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmReenumerateDevNode(dndevinst: UInt, ulflags: CmReenumerateFlags): Configret

public expect fun cmReenumerateDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceDriver(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmRegisterDeviceDriverEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceInterfaceA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmRegisterDeviceInterfaceW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt): Configret

public expect fun cmRegisterDeviceInterfaceExA(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcstr, pszdeviceinterface: Pstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterDeviceInterfaceExW(dndevinst: UInt, interfaceclassguid: COpaquePointer?, pszreference: Pcwstr, pszdeviceinterface: Pwstr, pullength: COpaquePointer?, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRegisterNotification(pfilter: COpaquePointer?, pcontext: COpaquePointer?, pcallback: PcmNotifyCallback, pnotifycontext: COpaquePointer?): Configret

public expect fun cmRemoveSubTree(dnancestor: UInt, ulflags: UInt): Configret

public expect fun cmRemoveSubTreeEx(dnancestor: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestDeviceEjectA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmRequestDeviceEjectW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt): Configret

public expect fun cmRequestDeviceEjectExA(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestDeviceEjectExW(dndevinst: UInt, pvetotype: COpaquePointer?, pszvetoname: Pwstr, ulnamelength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmRequestEjectPc(): Configret

public expect fun cmRequestEjectPcEx(hmachine: Long): Configret

public expect fun cmRunDetection(ulflags: UInt): Configret

public expect fun cmRunDetectionEx(ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassRegistryPropertyA(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetClassRegistryPropertyW(classguid: COpaquePointer?, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeProblem(dndevinst: UInt, ulproblem: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeProblemEx(dndevinst: UInt, ulproblem: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodePropertyW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodePropertyExW(dndevinst: UInt, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeRegistryPropertyA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeRegistryPropertyW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt): Configret

public expect fun cmSetDevNodeRegistryPropertyExA(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDevNodeRegistryPropertyExW(dndevinst: UInt, ulproperty: UInt, buffer: COpaquePointer?, ullength: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetDeviceInterfacePropertyW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt): Configret

public expect fun cmSetDeviceInterfacePropertyExW(pszdeviceinterface: Pcwstr, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetHwProf(ulhardwareprofile: UInt, ulflags: UInt): Configret

public expect fun cmSetHwProfEx(ulhardwareprofile: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetHwProfFlagsA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret

public expect fun cmSetHwProfFlagsW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt): Configret

public expect fun cmSetHwProfFlagsExA(pdeviceid: Pcstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetHwProfFlagsExW(pdeviceid: Pcwstr, ulconfig: UInt, ulvalue: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmSetupDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmSetupDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmTestRangeAvailable(ullstartvalue: ULong, ullendvalue: ULong, rlh: ULong, ulflags: UInt): Configret

public expect fun cmUninstallDevNode(dndevinst: UInt, ulflags: UInt): Configret

public expect fun cmUninstallDevNodeEx(dndevinst: UInt, ulflags: UInt, hmachine: Long): Configret

public expect fun cmUnregisterDeviceInterfaceA(pszdeviceinterface: Pcstr, ulflags: UInt): Configret

public expect fun cmUnregisterDeviceInterfaceW(pszdeviceinterface: Pcwstr, ulflags: UInt): Configret

public expect fun cmUnregisterDeviceInterfaceExA(pszdeviceinterface: Pcstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmUnregisterDeviceInterfaceExW(pszdeviceinterface: Pcwstr, ulflags: UInt, hmachine: Long): Configret

public expect fun cmUnregisterNotification(notifycontext: Hcmnotification): Configret

public expect fun diInstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, flags: DiinstalldeviceFlags, needreboot: COpaquePointer?): Bool

public expect fun diInstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool

public expect fun diInstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiinstalldriverFlags, needreboot: COpaquePointer?): Bool

public expect fun diRollbackDriver(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, hwndparent: Hwnd, flags: DirollbackdriverFlags, needreboot: COpaquePointer?): Bool

public expect fun diShowUpdateDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool

public expect fun diShowUpdateDriver(hwndparent: Hwnd, filepath: Pcwstr, flags: UInt, needreboot: COpaquePointer?): Bool

public expect fun diUninstallDevice(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, needreboot: COpaquePointer?): Bool

public expect fun diUninstallDriverA(hwndparent: Hwnd, infpath: Pcstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool

public expect fun diUninstallDriverW(hwndparent: Hwnd, infpath: Pcwstr, flags: DiuninstalldriverFlags, needreboot: COpaquePointer?): Bool

public expect fun installHinfSectionA(window: Hwnd, modulehandle: Hinstance, commandline: Pcstr, showcommand: Int)

public expect fun installHinfSectionW(window: Hwnd, modulehandle: Hinstance, commandline: Pcwstr, showcommand: Int)

public expect fun setupAddInstallSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcstr, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAddInstallSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, sectionname: Pcwstr, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAddSectionToDiskSpaceListA(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAddSectionToDiskSpaceListW(diskspace: COpaquePointer?, infhandle: COpaquePointer?, listinfhandle: COpaquePointer?, sectionname: Pcwstr, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAddToDiskSpaceListA(diskspace: COpaquePointer?, targetfilespec: Pcstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAddToDiskSpaceListW(diskspace: COpaquePointer?, targetfilespec: Pcwstr, filesize: Long, operation: SetupFileOperation, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAddToSourceListA(flags: UInt, source: Pcstr): Bool

public expect fun setupAddToSourceListW(flags: UInt, source: Pcwstr): Bool

public expect fun setupAdjustDiskSpaceListA(diskspace: COpaquePointer?, driveroot: Pcstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupAdjustDiskSpaceListW(diskspace: COpaquePointer?, driveroot: Pcwstr, amount: Long, reserved1: COpaquePointer?, reserved2: UInt): Bool

public expect fun setupBackupErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, sourcefile: Pcstr, targetfile: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupBackupErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, sourcefile: Pcwstr, targetfile: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupCancelTemporarySourceList(): Bool

public expect fun setupCloseFileQueue(queuehandle: COpaquePointer?): Bool

public expect fun setupCloseInfFile(infhandle: COpaquePointer?)

public expect fun setupCloseLog()

public expect fun setupCommitFileQueueA(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool

public expect fun setupCommitFileQueueW(owner: Hwnd, queuehandle: COpaquePointer?, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool

public expect fun setupConfigureWmiFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt): Bool

public expect fun setupConfigureWmiFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt): Bool

public expect fun setupCopyErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, diskname: Pcstr, pathtosource: Pcstr, sourcefile: Pcstr, targetpathfile: Pcstr, win32errorcode: UInt, style: UInt, pathbuffer: Pstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt

public expect fun setupCopyErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, diskname: Pcwstr, pathtosource: Pcwstr, sourcefile: Pcwstr, targetpathfile: Pcwstr, win32errorcode: UInt, style: UInt, pathbuffer: Pwstr, pathbuffersize: UInt, pathrequiredsize: COpaquePointer?): UInt

public expect fun setupCopyOEMInfA(sourceinffilename: Pcstr, oemsourcemedialocation: Pcstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool

public expect fun setupCopyOEMInfW(sourceinffilename: Pcwstr, oemsourcemedialocation: Pcwstr, oemsourcemediatype: OemSourceMediaType, copystyle: SpCopyStyle, destinationinffilename: Pwstr, destinationinffilenamesize: UInt, requiredsize: COpaquePointer?, destinationinffilenamecomponent: COpaquePointer?): Bool

public expect fun setupCreateDiskSpaceListA(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer?

public expect fun setupCreateDiskSpaceListW(reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer?

public expect fun setupDecompressOrCopyFileA(sourcefilename: Pcstr, targetfilename: Pcstr, compressiontype: COpaquePointer?): UInt

public expect fun setupDecompressOrCopyFileW(sourcefilename: Pcwstr, targetfilename: Pcwstr, compressiontype: COpaquePointer?): UInt

public expect fun setupDefaultQueueCallbackA(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun setupDefaultQueueCallbackW(context: COpaquePointer?, notification: UInt, param1: ULong, param2: ULong): UInt

public expect fun setupDeleteErrorA(hwndparent: Hwnd, dialogtitle: Pcstr, file: Pcstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupDeleteErrorW(hwndparent: Hwnd, dialogtitle: Pcwstr, file: Pcwstr, win32errorcode: UInt, style: UInt): UInt

public expect fun setupDestroyDiskSpaceList(diskspace: COpaquePointer?): Bool

public expect fun setupDiAskForOEMDisk(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiBuildClassInfoList(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiBuildClassInfoListExA(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiBuildClassInfoListExW(flags: UInt, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiBuildDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool

public expect fun setupDiCallClassInstaller(installfunction: DiFunction, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiCancelDriverInfoSearch(deviceinfoset: Hdevinfo): Bool

public expect fun setupDiChangeState(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiClassGuidsFromNameA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiClassGuidsFromNameExA(classname: Pcstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiClassGuidsFromNameExW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiClassGuidsFromNameW(classname: Pcwstr, classguidlist: COpaquePointer?, classguidlistsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiClassNameFromGuidA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiClassNameFromGuidExA(classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiClassNameFromGuidExW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiClassNameFromGuidW(classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiCreateDevRegKeyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey

public expect fun setupDiCreateDevRegKeyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey

public expect fun setupDiCreateDeviceInfoA(deviceinfoset: Hdevinfo, devicename: Pcstr, classguid: COpaquePointer?, devicedescription: Pcstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiCreateDeviceInfoList(classguid: COpaquePointer?, hwndparent: Hwnd): Hdevinfo

public expect fun setupDiCreateDeviceInfoListExA(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo

public expect fun setupDiCreateDeviceInfoListExW(classguid: COpaquePointer?, hwndparent: Hwnd, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo

public expect fun setupDiCreateDeviceInfoW(deviceinfoset: Hdevinfo, devicename: Pcwstr, classguid: COpaquePointer?, devicedescription: Pcwstr, hwndparent: Hwnd, creationflags: SetupDiDeviceCreationFlags, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiCreateDeviceInterfaceA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiCreateDeviceInterfaceRegKeyA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcstr): Hkey

public expect fun setupDiCreateDeviceInterfaceRegKeyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt, infhandle: COpaquePointer?, infsectionname: Pcwstr): Hkey

public expect fun setupDiCreateDeviceInterfaceW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: Pcwstr, creationflags: UInt, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiDeleteDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt): Bool

public expect fun setupDiDeleteDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiDeleteDeviceInterfaceData(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiDeleteDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt): Bool

public expect fun setupDiDestroyClassImageList(classimagelistdata: COpaquePointer?): Bool

public expect fun setupDiDestroyDeviceInfoList(deviceinfoset: Hdevinfo): Bool

public expect fun setupDiDestroyDriverInfoList(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType): Bool

public expect fun setupDiDrawMiniIcon(hdc: Hdc, rc: Rect, miniiconindex: Int, flags: UInt): Int

public expect fun setupDiEnumDeviceInfo(deviceinfoset: Hdevinfo, memberindex: UInt, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiEnumDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, interfaceclassguid: COpaquePointer?, memberindex: UInt, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiEnumDriverInfoA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool

public expect fun setupDiEnumDriverInfoW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, drivertype: SetupDiDriverType, memberindex: UInt, driverinfodata: COpaquePointer?): Bool

public expect fun setupDiGetActualModelsSectionA(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun setupDiGetActualModelsSectionW(context: COpaquePointer?, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun setupDiGetActualSectionToInstallA(infhandle: COpaquePointer?, infsectionname: Pcstr, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool

public expect fun setupDiGetActualSectionToInstallExA(infhandle: COpaquePointer?, infsectionname: Pcstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun setupDiGetActualSectionToInstallExW(infhandle: COpaquePointer?, infsectionname: Pcwstr, alternateplatforminfo: COpaquePointer?, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?, reserved: COpaquePointer?): Bool

public expect fun setupDiGetActualSectionToInstallW(infhandle: COpaquePointer?, infsectionname: Pcwstr, infsectionwithext: Pwstr, infsectionwithextsize: UInt, requiredsize: COpaquePointer?, extension: COpaquePointer?): Bool

public expect fun setupDiGetClassBitmapIndex(classguid: COpaquePointer?, miniiconindex: COpaquePointer?): Bool

public expect fun setupDiGetClassDescriptionA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetClassDescriptionExA(classguid: COpaquePointer?, classdescription: Pstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassDescriptionExW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassDescriptionW(classguid: COpaquePointer?, classdescription: Pwstr, classdescriptionsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetClassDevPropertySheetsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool

public expect fun setupDiGetClassDevPropertySheetsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertysheetheader: COpaquePointer?, propertysheetheaderpagelistsize: UInt, requiredsize: COpaquePointer?, propertysheettype: UInt): Bool

public expect fun setupDiGetClassDevsA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo

public expect fun setupDiGetClassDevsExA(classguid: COpaquePointer?, enumerator: Pcstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcstr, reserved: COpaquePointer?): Hdevinfo

public expect fun setupDiGetClassDevsExW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags, deviceinfoset: Hdevinfo, machinename: Pcwstr, reserved: COpaquePointer?): Hdevinfo

public expect fun setupDiGetClassDevsW(classguid: COpaquePointer?, enumerator: Pcwstr, hwndparent: Hwnd, flags: SetupDiGetClassDevsFlags): Hdevinfo

public expect fun setupDiGetClassImageIndex(classimagelistdata: COpaquePointer?, classguid: COpaquePointer?, imageindex: COpaquePointer?): Bool

public expect fun setupDiGetClassImageList(classimagelistdata: COpaquePointer?): Bool

public expect fun setupDiGetClassImageListExA(classimagelistdata: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassImageListExW(classimagelistdata: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassPropertyKeys(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool

public expect fun setupDiGetClassPropertyKeysExW(classguid: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool

public expect fun setupDiGetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetCustomDevicePropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetCustomDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, custompropertyname: Pcwstr, flags: UInt, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInfoListClass(deviceinfoset: Hdevinfo, classguid: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInfoListDetailA(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInfoListDetailW(deviceinfoset: Hdevinfo, deviceinfosetdetaildata: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInstanceIdA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInstanceIdW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstanceid: Pwstr, deviceinstanceidsize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInterfaceAlias(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliasdeviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInterfaceDetailA(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInterfaceDetailW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, deviceinterfacedetaildata: COpaquePointer?, deviceinterfacedetaildatasize: UInt, requiredsize: COpaquePointer?, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiGetDeviceInterfacePropertyKeys(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool

public expect fun setupDiGetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool

public expect fun setupDiGetDevicePropertyKeys(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykeyarray: COpaquePointer?, propertykeycount: UInt, requiredpropertykeycount: COpaquePointer?, flags: UInt): Bool

public expect fun setupDiGetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?, flags: UInt): Bool

public expect fun setupDiGetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertyregdatatype: COpaquePointer?, propertybuffer: COpaquePointer?, propertybuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDriverInfoDetailA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDriverInfoDetailW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinfodetaildata: COpaquePointer?, driverinfodetaildatasize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool

public expect fun setupDiGetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileFriendlyNameA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileFriendlyNameExA(hwprofile: UInt, friendlyname: Pstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileFriendlyNameExW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileFriendlyNameW(hwprofile: UInt, friendlyname: Pwstr, friendlynamesize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileList(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileListExA(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetHwProfileListExW(hwprofilelist: COpaquePointer?, hwprofilelistsize: UInt, requiredsize: COpaquePointer?, currentlyactiveindex: COpaquePointer?, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiGetINFClassA(infname: Pcstr, classguid: COpaquePointer?, classname: Pstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetINFClassW(infname: Pcwstr, classguid: COpaquePointer?, classname: Pwstr, classnamesize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupDiGetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiGetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool

public expect fun setupDiGetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool

public expect fun setupDiGetWizardPage(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, installwizarddata: COpaquePointer?, pagetype: UInt, flags: UInt): Hpropsheetpage

public expect fun setupDiInstallClassA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?): Bool

public expect fun setupDiInstallClassExA(hwndparent: Hwnd, inffilename: Pcstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool

public expect fun setupDiInstallClassExW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?, interfaceclassguid: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool

public expect fun setupDiInstallClassW(hwndparent: Hwnd, inffilename: Pcwstr, flags: UInt, filequeue: COpaquePointer?): Bool

public expect fun setupDiInstallDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiInstallDeviceInterfaces(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiInstallDriverFiles(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiLoadClassIcon(classguid: COpaquePointer?, largeicon: COpaquePointer?, miniiconindex: COpaquePointer?): Bool

public expect fun setupDiLoadDeviceIcon(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, cxicon: UInt, cyicon: UInt, flags: UInt, hicon: COpaquePointer?): Bool

public expect fun setupDiOpenClassRegKey(classguid: COpaquePointer?, samdesired: UInt): Hkey

public expect fun setupDiOpenClassRegKeyExA(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcstr, reserved: COpaquePointer?): Hkey

public expect fun setupDiOpenClassRegKeyExW(classguid: COpaquePointer?, samdesired: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Hkey

public expect fun setupDiOpenDevRegKey(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, scope: UInt, hwprofile: UInt, keytype: UInt, samdesired: UInt): Hkey

public expect fun setupDiOpenDeviceInfoA(deviceinfoset: Hdevinfo, deviceinstanceid: Pcstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiOpenDeviceInfoW(deviceinfoset: Hdevinfo, deviceinstanceid: Pcwstr, hwndparent: Hwnd, openflags: UInt, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiOpenDeviceInterfaceA(deviceinfoset: Hdevinfo, devicepath: Pcstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiOpenDeviceInterfaceRegKey(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, reserved: UInt, samdesired: UInt): Hkey

public expect fun setupDiOpenDeviceInterfaceW(deviceinfoset: Hdevinfo, devicepath: Pcwstr, openflags: UInt, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiRegisterCoDeviceInstallers(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiRegisterDeviceInfo(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, flags: UInt, compareproc: PspDetsigCmpproc, comparecontext: COpaquePointer?, dupdeviceinfodata: COpaquePointer?): Bool

public expect fun setupDiRemoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiRemoveDeviceInterface(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?): Bool

public expect fun setupDiRestartDevices(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiSelectBestCompatDrv(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiSelectDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiSelectOEMDrv(hwndparent: Hwnd, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiSetClassInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool

public expect fun setupDiSetClassInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, classinstallparams: COpaquePointer?, classinstallparamssize: UInt): Bool

public expect fun setupDiSetClassPropertyExW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiSetClassPropertyW(classguid: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetClassRegistryPropertyA(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcstr, reserved: COpaquePointer?): Bool

public expect fun setupDiSetClassRegistryPropertyW(classguid: COpaquePointer?, property: UInt, propertybuffer: COpaquePointer?, propertybuffersize: UInt, machinename: Pcwstr, reserved: COpaquePointer?): Bool

public expect fun setupDiSetDeviceInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool

public expect fun setupDiSetDeviceInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, deviceinstallparams: COpaquePointer?): Bool

public expect fun setupDiSetDeviceInterfaceDefault(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, flags: UInt, reserved: COpaquePointer?): Bool

public expect fun setupDiSetDeviceInterfacePropertyW(deviceinfoset: Hdevinfo, deviceinterfacedata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetDevicePropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, propertykey: COpaquePointer?, propertytype: Devproptype, propertybuffer: COpaquePointer?, propertybuffersize: UInt, flags: UInt): Bool

public expect fun setupDiSetDeviceRegistryPropertyA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool

public expect fun setupDiSetDeviceRegistryPropertyW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, property: SetupDiRegistryProperty, propertybuffer: COpaquePointer?, propertybuffersize: UInt): Bool

public expect fun setupDiSetDriverInstallParamsA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool

public expect fun setupDiSetDriverInstallParamsW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?, driverinstallparams: COpaquePointer?): Bool

public expect fun setupDiSetSelectedDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDiSetSelectedDriverA(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool

public expect fun setupDiSetSelectedDriverW(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, driverinfodata: COpaquePointer?): Bool

public expect fun setupDiUnremoveDevice(deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupDuplicateDiskSpaceListA(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer?

public expect fun setupDuplicateDiskSpaceListW(diskspace: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, flags: UInt): COpaquePointer?

public expect fun setupEnumInfSectionsA(infhandle: COpaquePointer?, index: UInt, buffer: Pstr, size: UInt, sizeneeded: COpaquePointer?): Bool

public expect fun setupEnumInfSectionsW(infhandle: COpaquePointer?, index: UInt, buffer: Pwstr, size: UInt, sizeneeded: COpaquePointer?): Bool

public expect fun setupFindFirstLineA(infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, context: COpaquePointer?): Bool

public expect fun setupFindFirstLineW(infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, context: COpaquePointer?): Bool

public expect fun setupFindNextLine(contextin: COpaquePointer?, contextout: COpaquePointer?): Bool

public expect fun setupFindNextMatchLineA(contextin: COpaquePointer?, key: Pcstr, contextout: COpaquePointer?): Bool

public expect fun setupFindNextMatchLineW(contextin: COpaquePointer?, key: Pcwstr, contextout: COpaquePointer?): Bool

public expect fun setupFreeSourceListA(list: COpaquePointer?, count: UInt): Bool

public expect fun setupFreeSourceListW(list: COpaquePointer?, count: UInt): Bool

public expect fun setupGetBackupInformationA(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool

public expect fun setupGetBackupInformationW(queuehandle: COpaquePointer?, backupparams: COpaquePointer?): Bool

public expect fun setupGetBinaryField(context: COpaquePointer?, fieldindex: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetFieldCount(context: COpaquePointer?): UInt

public expect fun setupGetFileCompressionInfoA(sourcefilename: Pcstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt

public expect fun setupGetFileCompressionInfoExA(sourcefilename: Pcstr, actualsourcefilenamebuffer: Pcstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool

public expect fun setupGetFileCompressionInfoExW(sourcefilename: Pcwstr, actualsourcefilenamebuffer: Pcwstr, actualsourcefilenamebufferlen: UInt, requiredbufferlen: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): Bool

public expect fun setupGetFileCompressionInfoW(sourcefilename: Pcwstr, actualsourcefilename: COpaquePointer?, sourcefilesize: COpaquePointer?, targetfilesize: COpaquePointer?, compressiontype: COpaquePointer?): UInt

public expect fun setupGetFileQueueCount(filequeue: COpaquePointer?, subqueuefileop: UInt, numoperations: COpaquePointer?): Bool

public expect fun setupGetFileQueueFlags(filequeue: COpaquePointer?, flags: COpaquePointer?): Bool

public expect fun setupGetInfDriverStoreLocationA(filename: Pcstr, alternateplatforminfo: COpaquePointer?, localename: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfDriverStoreLocationW(filename: Pcwstr, alternateplatforminfo: COpaquePointer?, localename: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfFileListA(directorypath: Pcstr, infstyle: InfStyle, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfFileListW(directorypath: Pcwstr, infstyle: InfStyle, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfInformationA(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfInformationW(infspec: COpaquePointer?, searchcontrol: UInt, returnbuffer: COpaquePointer?, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfPublishedNameA(driverstorelocation: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetInfPublishedNameW(driverstorelocation: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetIntField(context: COpaquePointer?, fieldindex: UInt, integervalue: COpaquePointer?): Bool

public expect fun setupGetLineByIndexA(infhandle: COpaquePointer?, section: Pcstr, index: UInt, context: COpaquePointer?): Bool

public expect fun setupGetLineByIndexW(infhandle: COpaquePointer?, section: Pcwstr, index: UInt, context: COpaquePointer?): Bool

public expect fun setupGetLineCountA(infhandle: COpaquePointer?, section: Pcstr): Int

public expect fun setupGetLineCountW(infhandle: COpaquePointer?, section: Pcwstr): Int

public expect fun setupGetLineTextA(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcstr, key: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetLineTextW(context: COpaquePointer?, infhandle: COpaquePointer?, section: Pcwstr, key: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetMultiSzFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetMultiSzFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetNonInteractiveMode(): Bool

public expect fun setupGetSourceFileLocationA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, sourceid: COpaquePointer?, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetSourceFileLocationW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, sourceid: COpaquePointer?, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetSourceFileSizeA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcstr, section: Pcstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool

public expect fun setupGetSourceFileSizeW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, filename: Pcwstr, section: Pcwstr, filesize: COpaquePointer?, roundingfactor: UInt): Bool

public expect fun setupGetSourceInfoA(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetSourceInfoW(infhandle: COpaquePointer?, sourceid: UInt, infodesired: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetStringFieldA(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetStringFieldW(context: COpaquePointer?, fieldindex: UInt, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetTargetPathA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcstr, returnbuffer: Pstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetTargetPathW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, section: Pcwstr, returnbuffer: Pwstr, returnbuffersize: UInt, requiredsize: COpaquePointer?): Bool

public expect fun setupGetThreadLogToken(): ULong

public expect fun setupInitDefaultQueueCallback(ownerwindow: Hwnd): COpaquePointer?

public expect fun setupInitDefaultQueueCallbackEx(ownerwindow: Hwnd, alternateprogresswindow: Hwnd, progressmessage: UInt, reserved1: UInt, reserved2: COpaquePointer?): COpaquePointer?

public expect fun setupInitializeFileLogA(logfilename: Pcstr, flags: UInt): COpaquePointer?

public expect fun setupInitializeFileLogW(logfilename: Pcwstr, flags: UInt): COpaquePointer?

public expect fun setupInstallFileA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?): Bool

public expect fun setupInstallFileExA(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcstr, sourcepathroot: Pcstr, destinationname: Pcstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackA, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool

public expect fun setupInstallFileExW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?, filewasinuse: COpaquePointer?): Bool

public expect fun setupInstallFileW(infhandle: COpaquePointer?, infcontext: COpaquePointer?, sourcefile: Pcwstr, sourcepathroot: Pcwstr, destinationname: Pcwstr, copystyle: SpCopyStyle, copymsghandler: PspFileCallbackW, context: COpaquePointer?): Bool

public expect fun setupInstallFilesFromInfSectionA(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcstr, sourcerootpath: Pcstr, copyflags: UInt): Bool

public expect fun setupInstallFilesFromInfSectionW(infhandle: COpaquePointer?, layoutinfhandle: COpaquePointer?, filequeue: COpaquePointer?, sectionname: Pcwstr, sourcerootpath: Pcwstr, copyflags: UInt): Bool

public expect fun setupInstallFromInfSectionA(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcstr, copyflags: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupInstallFromInfSectionW(owner: Hwnd, infhandle: COpaquePointer?, sectionname: Pcwstr, flags: UInt, relativekeyroot: Hkey, sourcerootpath: Pcwstr, copyflags: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?): Bool

public expect fun setupInstallServicesFromInfSectionA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags): Bool

public expect fun setupInstallServicesFromInfSectionExA(infhandle: COpaquePointer?, sectionname: Pcstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool

public expect fun setupInstallServicesFromInfSectionExW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags, deviceinfoset: Hdevinfo, deviceinfodata: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Bool

public expect fun setupInstallServicesFromInfSectionW(infhandle: COpaquePointer?, sectionname: Pcwstr, flags: SpsvcinstFlags): Bool

public expect fun setupIterateCabinetA(cabinetfile: Pcstr, reserved: UInt, msghandler: PspFileCallbackA, context: COpaquePointer?): Bool

public expect fun setupIterateCabinetW(cabinetfile: Pcwstr, reserved: UInt, msghandler: PspFileCallbackW, context: COpaquePointer?): Bool

public expect fun setupLogErrorA(messagestring: Pcstr, severity: UInt): Bool

public expect fun setupLogErrorW(messagestring: Pcwstr, severity: UInt): Bool

public expect fun setupLogFileA(fileloghandle: COpaquePointer?, logsectionname: Pcstr, sourcefilename: Pcstr, targetfilename: Pcstr, checksum: UInt, disktagfile: Pcstr, diskdescription: Pcstr, otherinfo: Pcstr, flags: UInt): Bool

public expect fun setupLogFileW(fileloghandle: COpaquePointer?, logsectionname: Pcwstr, sourcefilename: Pcwstr, targetfilename: Pcwstr, checksum: UInt, disktagfile: Pcwstr, diskdescription: Pcwstr, otherinfo: Pcwstr, flags: UInt): Bool

public expect fun setupOpenAppendInfFileA(filename: Pcstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool

public expect fun setupOpenAppendInfFileW(filename: Pcwstr, infhandle: COpaquePointer?, errorline: COpaquePointer?): Bool

public expect fun setupOpenFileQueue(): COpaquePointer?

public expect fun setupOpenInfFileA(filename: Pcstr, infclass: Pcstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer?

public expect fun setupOpenInfFileW(filename: Pcwstr, infclass: Pcwstr, infstyle: InfStyle, errorline: COpaquePointer?): COpaquePointer?

public expect fun setupOpenLog(erase: Bool): Bool
