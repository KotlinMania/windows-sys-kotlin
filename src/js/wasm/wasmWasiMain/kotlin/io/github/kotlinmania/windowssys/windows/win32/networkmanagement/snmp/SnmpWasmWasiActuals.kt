@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session: Long, reqid: Int): Int

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCancelMsg(session, reqid).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup(): Int

public actual fun snmpCleanup(): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanup().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx(): Int

public actual fun snmpCleanupEx(): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCleanupEx().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpClose")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session: Long): Int

public actual fun snmpClose(session: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpClose(session).toUInt()

public actual fun snmpContextToStr(context: Long, string: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpContextToStr")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl: Long): Int

public actual fun snmpCountVbl(vbl: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCountVbl(vbl).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session: Long, pduType: Int, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpCreatePdu(session, pduType.toInt(), requestId, errorStatus, errorIndex, varbindlist)

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateSession")

public actual fun snmpCreateVbl(session: Long, name: MutPtr, value: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpCreateVbl")

public actual fun snmpDecodeMsg(session: Long, srcentity: MutPtr, dstentity: MutPtr, context: MutPtr, pdu: MutPtr, msgbufdesc: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpDecodeMsg")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl: Long, index: Int): Int

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpDeleteVb(vbl, index.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session: Long, pdu: Long): Long

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicatePdu(session, pdu)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session: Long, vbl: Long): Long

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpDuplicateVbl(session, vbl)

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpEncodeMsg")

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpEntityToStr")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context: Long): Int

public actual fun snmpFreeContext(context: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeContext(context).toUInt()

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeDescriptor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity: Long): Int

public actual fun snmpFreeEntity(entity: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeEntity(entity).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu: Long): Int

public actual fun snmpFreePdu(pdu: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreePdu(pdu).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl: Long): Int

public actual fun snmpFreeVbl(vbl: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpFreeVbl(vbl).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session: Long): Int

public actual fun snmpGetLastError(session: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpGetLastError(session).toUInt()

public actual fun snmpGetPduData(pdu: Long, pduType: MutPtr, requestId: MutPtr, errorStatus: MutPtr, errorIndex: MutPtr, varbindlist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetPduData")

public actual fun snmpGetRetransmitMode(nretransmitmode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetransmitMode")

public actual fun snmpGetRetry(hentity: Long, npolicyretry: MutPtr, nactualretry: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetRetry")

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: MutPtr, nactualtimeout: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTimeout")

public actual fun snmpGetTranslateMode(ntranslatemode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetTranslateMode")

public actual fun snmpGetVb(vbl: Long, index: UInt, name: MutPtr, value: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVb")

public actual fun snmpGetVendorInfo(vendorinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpGetVendorInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpListen")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity: Long, lstatus: Int): Int

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpListen(hentity, lstatus.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity: Long, lstatus: Int, nuseentityaddr: Int): Int

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpListenEx(hentity, lstatus.toInt(), nuseentityaddr.toInt()).toUInt()

public actual fun snmpMgrClose(session: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrClose")

public actual fun snmpMgrCtl(session: MutPtr, dwctlcode: UInt, lpvinbuffer: MutPtr, cbinbuffer: UInt, lpvoutbuffer: MutPtr, cboutbuffer: UInt, lpcbbytesreturned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrCtl")

public actual fun snmpMgrGetTrap(enterprise: MutPtr, ipaddress: MutPtr, generictrap: MutPtr, specifictrap: MutPtr, timestamp: MutPtr, variablebindings: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrap")

public actual fun snmpMgrGetTrapEx(enterprise: MutPtr, agentaddress: MutPtr, sourceaddress: MutPtr, generictrap: MutPtr, specifictrap: MutPtr, community: MutPtr, timestamp: MutPtr, variablebindings: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrGetTrapEx")

public actual fun snmpMgrOidToStr(oid: MutPtr, string: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOidToStr")

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrOpen")

public actual fun snmpMgrRequest(session: MutPtr, requesttype: UByte, variablebindings: MutPtr, errorstatus: MutPtr, errorindex: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrRequest")

public actual fun snmpMgrStrToOid(string: Pcstr, oid: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrStrToOid")

public actual fun snmpMgrTrapListen(phtrapavailable: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpMgrTrapListen")

public actual fun snmpOidCompare(xoid: MutPtr, yoid: MutPtr, maxlen: UInt, result: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCompare")

public actual fun snmpOidCopy(srcoid: MutPtr, dstoid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpOidCopy")

public actual fun snmpOidToStr(srcoid: ConstPtr, size: UInt, string: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpOidToStr")

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpOpen")

public actual fun snmpRecvMsg(session: Long, srcentity: MutPtr, dstentity: MutPtr, context: MutPtr, pdu: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpRecvMsg")

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: MutPtr, state: SnmpStatus): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpRegister")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): Int

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSendMsg(session, srcentity, dstentity, context, pdu).toUInt()

public actual fun snmpSetPduData(pdu: Long, pduType: ConstPtr, requestId: ConstPtr, nonRepeaters: ConstPtr, maxRepetitions: ConstPtr, varbindlist: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPduData")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity: Long, nport: Int): Int

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetPort(hentity, nport.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode: Int): Int

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetransmitMode(nretransmitmode.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity: Long, npolicyretry: Int): Int

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetRetry(hentity, npolicyretry.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity: Long, npolicytimeout: Int): Int

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTimeout(hentity, npolicytimeout.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode: Int): Int

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSetTranslateMode(ntranslatemode.toInt()).toUInt()

public actual fun snmpSetVb(vbl: Long, index: UInt, name: MutPtr, value: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpSetVb")

public actual fun snmpStartup(nmajorversion: MutPtr, nminorversion: MutPtr, nlevel: MutPtr, ntranslatemode: MutPtr, nretransmitmode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpStartup")

public actual fun snmpStartupEx(nmajorversion: MutPtr, nminorversion: MutPtr, nlevel: MutPtr, ntranslatemode: MutPtr, nretransmitmode: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpStartupEx")

public actual fun snmpStrToContext(session: Long, string: MutPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToContext")

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToEntity")

public actual fun snmpStrToOid(string: Pcstr, dstoid: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpStrToOid")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime(): Int

public actual fun snmpSvcGetUptime(): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcGetUptime().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel: Int): Unit

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogLevel(nloglevel)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType")
private external fun wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype: Int): Unit

public actual fun snmpSvcSetLogType(nlogtype: Int): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementSnmpSnmpSvcSetLogType(nlogtype)

public actual fun snmpUtilAsnAnyCpy(panydst: MutPtr, panysrc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyCpy")

public actual fun snmpUtilAsnAnyFree(pany: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilAsnAnyFree")

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilDbgPrint")

public actual fun snmpUtilIdsToA(ids: MutPtr, idlength: UInt): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilIdsToA")

public actual fun snmpUtilMemAlloc(nbytes: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemAlloc")

public actual fun snmpUtilMemFree(pmem: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemFree")

public actual fun snmpUtilMemReAlloc(pmem: MutPtr, nbytes: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilMemReAlloc")

public actual fun snmpUtilOctetsCmp(poctets1: MutPtr, poctets2: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCmp")

public actual fun snmpUtilOctetsCpy(poctetsdst: MutPtr, poctetssrc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsCpy")

public actual fun snmpUtilOctetsFree(poctets: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsFree")

public actual fun snmpUtilOctetsNCmp(poctets1: MutPtr, poctets2: MutPtr, nchars: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOctetsNCmp")

public actual fun snmpUtilOidAppend(poiddst: MutPtr, poidsrc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidAppend")

public actual fun snmpUtilOidCmp(poid1: MutPtr, poid2: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCmp")

public actual fun snmpUtilOidCpy(poiddst: MutPtr, poidsrc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidCpy")

public actual fun snmpUtilOidFree(poid: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidFree")

public actual fun snmpUtilOidNCmp(poid1: MutPtr, poid2: MutPtr, nsubids: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidNCmp")

public actual fun snmpUtilOidToA(oid: MutPtr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilOidToA")

public actual fun snmpUtilPrintAsnAny(pany: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintAsnAny")

public actual fun snmpUtilPrintOid(oid: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilPrintOid")

public actual fun snmpUtilVarBindCpy(pvbdst: MutPtr, pvbsrc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindCpy")

public actual fun snmpUtilVarBindFree(pvb: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindFree")

public actual fun snmpUtilVarBindListCpy(pvbldst: MutPtr, pvblsrc: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListCpy")

public actual fun snmpUtilVarBindListFree(pvbl: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementSnmpSnmpUtilVarBindListFree")
