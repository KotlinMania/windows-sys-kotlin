@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun snmpCancelMsg(session: Long, reqid: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCancelMsg(session, reqid)

public actual fun snmpCleanup(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCleanup()

public actual fun snmpCleanupEx(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCleanupEx()

public actual fun snmpClose(session: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpClose(session)

public actual fun snmpContextToStr(context: Long, string: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpContextToStr(context, string?.value?.toCPointer<ByteVar>())

public actual fun snmpCountVbl(vbl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCountVbl(vbl)

public actual fun snmpCreatePdu(session: Long, pduType: SnmpPduType, requestId: Int, errorStatus: Int, errorIndex: Int, varbindlist: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCreatePdu(session, pduType, requestId, errorStatus, errorIndex, varbindlist)

public actual fun snmpCreateSession(hwnd: Hwnd, wmsg: UInt, fcallback: SnmpapiCallback, lpclientdata: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCreateSession(hwnd?.value?.toCPointer<ByteVar>(), wmsg, 0L.toCPointer<ByteVar>(), lpclientdata?.value?.toCPointer<ByteVar>())

public actual fun snmpCreateVbl(session: Long, name: COpaquePointer?, value: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpCreateVbl(session, name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun snmpDecodeMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?, msgbufdesc: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpDecodeMsg(session, srcentity?.value?.toCPointer<ByteVar>(), dstentity?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), pdu?.value?.toCPointer<ByteVar>(), msgbufdesc?.value?.toCPointer<ByteVar>())

public actual fun snmpDeleteVb(vbl: Long, index: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpDeleteVb(vbl, index)

public actual fun snmpDuplicatePdu(session: Long, pdu: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpDuplicatePdu(session, pdu)

public actual fun snmpDuplicateVbl(session: Long, vbl: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpDuplicateVbl(session, vbl)

public actual fun snmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpEncodeMsg(session, srcentity, dstentity, context, pdu, msgbufdesc?.value?.toCPointer<ByteVar>())

public actual fun snmpEntityToStr(entity: Long, size: UInt, string: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpEntityToStr(entity, size, string?.value?.toCPointer<ByteVar>())

public actual fun snmpFreeContext(context: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpFreeContext(context)

public actual fun snmpFreeDescriptor(syntax: UInt, descriptor: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpFreeDescriptor(syntax, descriptor?.value?.toCPointer<ByteVar>())

public actual fun snmpFreeEntity(entity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpFreeEntity(entity)

public actual fun snmpFreePdu(pdu: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpFreePdu(pdu)

public actual fun snmpFreeVbl(vbl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpFreeVbl(vbl)

public actual fun snmpGetLastError(session: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetLastError(session)

public actual fun snmpGetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, errorStatus: COpaquePointer?, errorIndex: COpaquePointer?, varbindlist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetPduData(pdu, pduType?.value?.toCPointer<ByteVar>(), requestId?.value?.toCPointer<ByteVar>(), errorStatus?.value?.toCPointer<ByteVar>(), errorIndex?.value?.toCPointer<ByteVar>(), varbindlist?.value?.toCPointer<ByteVar>())

public actual fun snmpGetRetransmitMode(nretransmitmode: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetRetransmitMode(nretransmitmode?.value?.toCPointer<ByteVar>())

public actual fun snmpGetRetry(hentity: Long, npolicyretry: COpaquePointer?, nactualretry: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetRetry(hentity, npolicyretry?.value?.toCPointer<ByteVar>(), nactualretry?.value?.toCPointer<ByteVar>())

public actual fun snmpGetTimeout(hentity: Long, npolicytimeout: COpaquePointer?, nactualtimeout: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetTimeout(hentity, npolicytimeout?.value?.toCPointer<ByteVar>(), nactualtimeout?.value?.toCPointer<ByteVar>())

public actual fun snmpGetTranslateMode(ntranslatemode: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetTranslateMode(ntranslatemode?.value?.toCPointer<ByteVar>())

public actual fun snmpGetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetVb(vbl, index, name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun snmpGetVendorInfo(vendorinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpGetVendorInfo(vendorinfo?.value?.toCPointer<ByteVar>())

public actual fun snmpListen(hentity: Long, lstatus: SnmpStatus): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpListen(hentity, lstatus)

public actual fun snmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpListenEx(hentity, lstatus, nuseentityaddr)

public actual fun snmpMgrClose(session: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrClose(session?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrCtl(session: COpaquePointer?, dwctlcode: UInt, lpvinbuffer: COpaquePointer?, cbinbuffer: UInt, lpvoutbuffer: COpaquePointer?, cboutbuffer: UInt, lpcbbytesreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrCtl(session?.value?.toCPointer<ByteVar>(), dwctlcode, lpvinbuffer?.value?.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer?.value?.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrGetTrap(enterprise: COpaquePointer?, ipaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrap(enterprise?.value?.toCPointer<ByteVar>(), ipaddress?.value?.toCPointer<ByteVar>(), generictrap?.value?.toCPointer<ByteVar>(), specifictrap?.value?.toCPointer<ByteVar>(), timestamp?.value?.toCPointer<ByteVar>(), variablebindings?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrGetTrapEx(enterprise: COpaquePointer?, agentaddress: COpaquePointer?, sourceaddress: COpaquePointer?, generictrap: COpaquePointer?, specifictrap: COpaquePointer?, community: COpaquePointer?, timestamp: COpaquePointer?, variablebindings: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrGetTrapEx(enterprise?.value?.toCPointer<ByteVar>(), agentaddress?.value?.toCPointer<ByteVar>(), sourceaddress?.value?.toCPointer<ByteVar>(), generictrap?.value?.toCPointer<ByteVar>(), specifictrap?.value?.toCPointer<ByteVar>(), community?.value?.toCPointer<ByteVar>(), timestamp?.value?.toCPointer<ByteVar>(), variablebindings?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrOidToStr(oid: COpaquePointer?, string: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrOidToStr(oid?.value?.toCPointer<ByteVar>(), string?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrOpen(lpagentaddress: Pcstr, lpagentcommunity: Pcstr, ntimeout: Int, nretries: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrOpen(lpagentaddress?.value?.toCPointer<ByteVar>(), lpagentcommunity?.value?.toCPointer<ByteVar>(), ntimeout, nretries)?.let { COpaquePointer(it.toLong()) }

public actual fun snmpMgrRequest(session: COpaquePointer?, requesttype: UByte, variablebindings: COpaquePointer?, errorstatus: COpaquePointer?, errorindex: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrRequest(session?.value?.toCPointer<ByteVar>(), requesttype, variablebindings?.value?.toCPointer<ByteVar>(), errorstatus?.value?.toCPointer<ByteVar>(), errorindex?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrStrToOid(string: Pcstr, oid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrStrToOid(string?.value?.toCPointer<ByteVar>(), oid?.value?.toCPointer<ByteVar>())

public actual fun snmpMgrTrapListen(phtrapavailable: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpMgrTrapListen(phtrapavailable?.value?.toCPointer<ByteVar>())

public actual fun snmpOidCompare(xoid: COpaquePointer?, yoid: COpaquePointer?, maxlen: UInt, result: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpOidCompare(xoid?.value?.toCPointer<ByteVar>(), yoid?.value?.toCPointer<ByteVar>(), maxlen, result?.value?.toCPointer<ByteVar>())

public actual fun snmpOidCopy(srcoid: COpaquePointer?, dstoid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpOidCopy(srcoid?.value?.toCPointer<ByteVar>(), dstoid?.value?.toCPointer<ByteVar>())

public actual fun snmpOidToStr(srcoid: COpaquePointer?, size: UInt, string: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpOidToStr(srcoid?.value?.toCPointer<ByteVar>(), size, string?.value?.toCPointer<ByteVar>())

public actual fun snmpOpen(hwnd: Hwnd, wmsg: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpOpen(hwnd?.value?.toCPointer<ByteVar>(), wmsg)

public actual fun snmpRecvMsg(session: Long, srcentity: COpaquePointer?, dstentity: COpaquePointer?, context: COpaquePointer?, pdu: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpRecvMsg(session, srcentity?.value?.toCPointer<ByteVar>(), dstentity?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), pdu?.value?.toCPointer<ByteVar>())

public actual fun snmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: COpaquePointer?, state: SnmpStatus): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpRegister(session, srcentity, dstentity, context, notification?.value?.toCPointer<ByteVar>(), state)

public actual fun snmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSendMsg(session, srcentity, dstentity, context, pdu)

public actual fun snmpSetPduData(pdu: Long, pduType: COpaquePointer?, requestId: COpaquePointer?, nonRepeaters: COpaquePointer?, maxRepetitions: COpaquePointer?, varbindlist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetPduData(pdu, pduType?.value?.toCPointer<ByteVar>(), requestId?.value?.toCPointer<ByteVar>(), nonRepeaters?.value?.toCPointer<ByteVar>(), maxRepetitions?.value?.toCPointer<ByteVar>(), varbindlist?.value?.toCPointer<ByteVar>())

public actual fun snmpSetPort(hentity: Long, nport: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetPort(hentity, nport)

public actual fun snmpSetRetransmitMode(nretransmitmode: SnmpStatus): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetRetransmitMode(nretransmitmode)

public actual fun snmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetRetry(hentity, npolicyretry)

public actual fun snmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetTimeout(hentity, npolicytimeout)

public actual fun snmpSetTranslateMode(ntranslatemode: SnmpApiTranslateMode): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetTranslateMode(ntranslatemode)

public actual fun snmpSetVb(vbl: Long, index: UInt, name: COpaquePointer?, value: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSetVb(vbl, index, name?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun snmpStartup(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpStartup(nmajorversion?.value?.toCPointer<ByteVar>(), nminorversion?.value?.toCPointer<ByteVar>(), nlevel?.value?.toCPointer<ByteVar>(), ntranslatemode?.value?.toCPointer<ByteVar>(), nretransmitmode?.value?.toCPointer<ByteVar>())

public actual fun snmpStartupEx(nmajorversion: COpaquePointer?, nminorversion: COpaquePointer?, nlevel: COpaquePointer?, ntranslatemode: COpaquePointer?, nretransmitmode: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpStartupEx(nmajorversion?.value?.toCPointer<ByteVar>(), nminorversion?.value?.toCPointer<ByteVar>(), nlevel?.value?.toCPointer<ByteVar>(), ntranslatemode?.value?.toCPointer<ByteVar>(), nretransmitmode?.value?.toCPointer<ByteVar>())

public actual fun snmpStrToContext(session: Long, string: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpStrToContext(session, string?.value?.toCPointer<ByteVar>())

public actual fun snmpStrToEntity(session: Long, string: Pcstr): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpStrToEntity(session, string?.value?.toCPointer<ByteVar>())

public actual fun snmpStrToOid(string: Pcstr, dstoid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpStrToOid(string?.value?.toCPointer<ByteVar>(), dstoid?.value?.toCPointer<ByteVar>())

public actual fun snmpSvcGetUptime(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSvcGetUptime()

public actual fun snmpSvcSetLogLevel(nloglevel: SnmpLog) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogLevel(nloglevel)
}

public actual fun snmpSvcSetLogType(nlogtype: Int) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpSvcSetLogType(nlogtype)
}

public actual fun snmpUtilAsnAnyCpy(panydst: COpaquePointer?, panysrc: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyCpy(panydst?.value?.toCPointer<ByteVar>(), panysrc?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilAsnAnyFree(pany: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilAsnAnyFree(pany?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilDbgPrint(nloglevel: SnmpLog, szformat: Pcstr, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilDbgPrint(nloglevel, szformat?.value?.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun snmpUtilIdsToA(ids: COpaquePointer?, idlength: UInt): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilIdsToA(ids?.value?.toCPointer<ByteVar>(), idlength)?.let { COpaquePointer(it.toLong()) }

public actual fun snmpUtilMemAlloc(nbytes: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemAlloc(nbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun snmpUtilMemFree(pmem: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemFree(pmem?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilMemReAlloc(pmem: COpaquePointer?, nbytes: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilMemReAlloc(pmem?.value?.toCPointer<ByteVar>(), nbytes)?.let { COpaquePointer(it.toLong()) }

public actual fun snmpUtilOctetsCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCmp(poctets1?.value?.toCPointer<ByteVar>(), poctets2?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilOctetsCpy(poctetsdst: COpaquePointer?, poctetssrc: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsCpy(poctetsdst?.value?.toCPointer<ByteVar>(), poctetssrc?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilOctetsFree(poctets: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsFree(poctets?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilOctetsNCmp(poctets1: COpaquePointer?, poctets2: COpaquePointer?, nchars: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOctetsNCmp(poctets1?.value?.toCPointer<ByteVar>(), poctets2?.value?.toCPointer<ByteVar>(), nchars)

public actual fun snmpUtilOidAppend(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidAppend(poiddst?.value?.toCPointer<ByteVar>(), poidsrc?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilOidCmp(poid1: COpaquePointer?, poid2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCmp(poid1?.value?.toCPointer<ByteVar>(), poid2?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilOidCpy(poiddst: COpaquePointer?, poidsrc: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidCpy(poiddst?.value?.toCPointer<ByteVar>(), poidsrc?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilOidFree(poid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidFree(poid?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilOidNCmp(poid1: COpaquePointer?, poid2: COpaquePointer?, nsubids: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidNCmp(poid1?.value?.toCPointer<ByteVar>(), poid2?.value?.toCPointer<ByteVar>(), nsubids)

public actual fun snmpUtilOidToA(oid: COpaquePointer?): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilOidToA(oid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun snmpUtilPrintAsnAny(pany: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintAsnAny(pany?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilPrintOid(oid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilPrintOid(oid?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilVarBindCpy(pvbdst: COpaquePointer?, pvbsrc: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindCpy(pvbdst?.value?.toCPointer<ByteVar>(), pvbsrc?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilVarBindFree(pvb: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindFree(pvb?.value?.toCPointer<ByteVar>())
}

public actual fun snmpUtilVarBindListCpy(pvbldst: COpaquePointer?, pvblsrc: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListCpy(pvbldst?.value?.toCPointer<ByteVar>(), pvblsrc?.value?.toCPointer<ByteVar>())

public actual fun snmpUtilVarBindListFree(pvbl: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_snmpUtilVarBindListFree(pvbl?.value?.toCPointer<ByteVar>())
}
