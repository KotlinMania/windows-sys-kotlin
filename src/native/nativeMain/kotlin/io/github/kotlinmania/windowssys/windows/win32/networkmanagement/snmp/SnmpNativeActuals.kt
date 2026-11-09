@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun SnmpCancelMsg(session: Long, reqid: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCancelMsg(session, reqid)

public actual fun SnmpCleanup(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCleanup()

public actual fun SnmpCleanupEx(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCleanupEx()

public actual fun SnmpClose(session: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpClose(session)

public actual fun SnmpContextToStr(context: Long, string: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpContextToStr(context, string.toCPointer<ByteVar>())

public actual fun SnmpCountVbl(vbl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCountVbl(vbl)

public actual fun SnmpCreatePdu(session: Long, pdu_type: SNMP_PDU_TYPE, request_id: Int, error_status: Int, error_index: Int, varbindlist: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCreatePdu(session, pdu_type, request_id, error_status, error_index, varbindlist)

public actual fun SnmpCreateSession(hwnd: HWND, wmsg: UInt, fcallback: SNMPAPI_CALLBACK, lpclientdata: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCreateSession(hwnd.toCPointer<ByteVar>(), wmsg, fcallback.toLong().toCPointer<ByteVar>(), lpclientdata.toCPointer<ByteVar>())

public actual fun SnmpCreateVbl(session: Long, name: Long, value: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpCreateVbl(session, name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun SnmpDecodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpDecodeMsg(session, srcentity.toCPointer<ByteVar>(), dstentity.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), pdu.toCPointer<ByteVar>(), msgbufdesc.toCPointer<ByteVar>())

public actual fun SnmpDeleteVb(vbl: Long, index: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpDeleteVb(vbl, index)

public actual fun SnmpDuplicatePdu(session: Long, pdu: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicatePdu(session, pdu)

public actual fun SnmpDuplicateVbl(session: Long, vbl: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpDuplicateVbl(session, vbl)

public actual fun SnmpEncodeMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long, msgbufdesc: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpEncodeMsg(session, srcentity, dstentity, context, pdu, msgbufdesc.toCPointer<ByteVar>())

public actual fun SnmpEntityToStr(entity: Long, size: UInt, string: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpEntityToStr(entity, size, string.toCPointer<ByteVar>())

public actual fun SnmpFreeContext(context: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeContext(context)

public actual fun SnmpFreeDescriptor(syntax: UInt, descriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeDescriptor(syntax, descriptor.toCPointer<ByteVar>())

public actual fun SnmpFreeEntity(entity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeEntity(entity)

public actual fun SnmpFreePdu(pdu: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpFreePdu(pdu)

public actual fun SnmpFreeVbl(vbl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpFreeVbl(vbl)

public actual fun SnmpGetLastError(session: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetLastError(session)

public actual fun SnmpGetPduData(pdu: Long, pdu_type: Long, request_id: Long, error_status: Long, error_index: Long, varbindlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetPduData(pdu, pdu_type.toCPointer<ByteVar>(), request_id.toCPointer<ByteVar>(), error_status.toCPointer<ByteVar>(), error_index.toCPointer<ByteVar>(), varbindlist.toCPointer<ByteVar>())

public actual fun SnmpGetRetransmitMode(nretransmitmode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetransmitMode(nretransmitmode.toCPointer<ByteVar>())

public actual fun SnmpGetRetry(hentity: Long, npolicyretry: Long, nactualretry: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetRetry(hentity, npolicyretry.toCPointer<ByteVar>(), nactualretry.toCPointer<ByteVar>())

public actual fun SnmpGetTimeout(hentity: Long, npolicytimeout: Long, nactualtimeout: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetTimeout(hentity, npolicytimeout.toCPointer<ByteVar>(), nactualtimeout.toCPointer<ByteVar>())

public actual fun SnmpGetTranslateMode(ntranslatemode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetTranslateMode(ntranslatemode.toCPointer<ByteVar>())

public actual fun SnmpGetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetVb(vbl, index, name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun SnmpGetVendorInfo(vendorinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpGetVendorInfo(vendorinfo.toCPointer<ByteVar>())

public actual fun SnmpListen(hentity: Long, lstatus: SNMP_STATUS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpListen(hentity, lstatus)

public actual fun SnmpListenEx(hentity: Long, lstatus: UInt, nuseentityaddr: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpListenEx(hentity, lstatus, nuseentityaddr)

public actual fun SnmpMgrClose(session: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrClose(session.toCPointer<ByteVar>())

public actual fun SnmpMgrCtl(session: Long, dwctlcode: UInt, lpvinbuffer: Long, cbinbuffer: UInt, lpvoutbuffer: Long, cboutbuffer: UInt, lpcbbytesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrCtl(session.toCPointer<ByteVar>(), dwctlcode, lpvinbuffer.toCPointer<ByteVar>(), cbinbuffer, lpvoutbuffer.toCPointer<ByteVar>(), cboutbuffer, lpcbbytesreturned.toCPointer<ByteVar>())

public actual fun SnmpMgrGetTrap(enterprise: Long, ipaddress: Long, generictrap: Long, specifictrap: Long, timestamp: Long, variablebindings: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrap(enterprise.toCPointer<ByteVar>(), ipaddress.toCPointer<ByteVar>(), generictrap.toCPointer<ByteVar>(), specifictrap.toCPointer<ByteVar>(), timestamp.toCPointer<ByteVar>(), variablebindings.toCPointer<ByteVar>())

public actual fun SnmpMgrGetTrapEx(enterprise: Long, agentaddress: Long, sourceaddress: Long, generictrap: Long, specifictrap: Long, community: Long, timestamp: Long, variablebindings: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrGetTrapEx(enterprise.toCPointer<ByteVar>(), agentaddress.toCPointer<ByteVar>(), sourceaddress.toCPointer<ByteVar>(), generictrap.toCPointer<ByteVar>(), specifictrap.toCPointer<ByteVar>(), community.toCPointer<ByteVar>(), timestamp.toCPointer<ByteVar>(), variablebindings.toCPointer<ByteVar>())

public actual fun SnmpMgrOidToStr(oid: Long, string: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOidToStr(oid.toCPointer<ByteVar>(), string.toCPointer<ByteVar>())

public actual fun SnmpMgrOpen(lpagentaddress: PCSTR, lpagentcommunity: PCSTR, ntimeout: Int, nretries: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrOpen(lpagentaddress.toCPointer<ByteVar>(), lpagentcommunity.toCPointer<ByteVar>(), ntimeout, nretries)?.toLong() ?: 0L

public actual fun SnmpMgrRequest(session: Long, requesttype: UByte, variablebindings: Long, errorstatus: Long, errorindex: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrRequest(session.toCPointer<ByteVar>(), requesttype, variablebindings.toCPointer<ByteVar>(), errorstatus.toCPointer<ByteVar>(), errorindex.toCPointer<ByteVar>())

public actual fun SnmpMgrStrToOid(string: PCSTR, oid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrStrToOid(string.toCPointer<ByteVar>(), oid.toCPointer<ByteVar>())

public actual fun SnmpMgrTrapListen(phtrapavailable: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpMgrTrapListen(phtrapavailable.toCPointer<ByteVar>())

public actual fun SnmpOidCompare(xoid: Long, yoid: Long, maxlen: UInt, result: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpOidCompare(xoid.toCPointer<ByteVar>(), yoid.toCPointer<ByteVar>(), maxlen, result.toCPointer<ByteVar>())

public actual fun SnmpOidCopy(srcoid: Long, dstoid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpOidCopy(srcoid.toCPointer<ByteVar>(), dstoid.toCPointer<ByteVar>())

public actual fun SnmpOidToStr(srcoid: Long, size: UInt, string: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpOidToStr(srcoid.toCPointer<ByteVar>(), size, string.toCPointer<ByteVar>())

public actual fun SnmpOpen(hwnd: HWND, wmsg: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpOpen(hwnd.toCPointer<ByteVar>(), wmsg)

public actual fun SnmpRecvMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpRecvMsg(session, srcentity.toCPointer<ByteVar>(), dstentity.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), pdu.toCPointer<ByteVar>())

public actual fun SnmpRegister(session: Long, srcentity: Long, dstentity: Long, context: Long, notification: Long, state: SNMP_STATUS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpRegister(session, srcentity, dstentity, context, notification.toCPointer<ByteVar>(), state)

public actual fun SnmpSendMsg(session: Long, srcentity: Long, dstentity: Long, context: Long, pdu: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSendMsg(session, srcentity, dstentity, context, pdu)

public actual fun SnmpSetPduData(pdu: Long, pdu_type: Long, request_id: Long, non_repeaters: Long, max_repetitions: Long, varbindlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetPduData(pdu, pdu_type.toCPointer<ByteVar>(), request_id.toCPointer<ByteVar>(), non_repeaters.toCPointer<ByteVar>(), max_repetitions.toCPointer<ByteVar>(), varbindlist.toCPointer<ByteVar>())

public actual fun SnmpSetPort(hentity: Long, nport: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetPort(hentity, nport)

public actual fun SnmpSetRetransmitMode(nretransmitmode: SNMP_STATUS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetransmitMode(nretransmitmode)

public actual fun SnmpSetRetry(hentity: Long, npolicyretry: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetRetry(hentity, npolicyretry)

public actual fun SnmpSetTimeout(hentity: Long, npolicytimeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetTimeout(hentity, npolicytimeout)

public actual fun SnmpSetTranslateMode(ntranslatemode: SNMP_API_TRANSLATE_MODE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetTranslateMode(ntranslatemode)

public actual fun SnmpSetVb(vbl: Long, index: UInt, name: Long, value: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSetVb(vbl, index, name.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun SnmpStartup(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpStartup(nmajorversion.toCPointer<ByteVar>(), nminorversion.toCPointer<ByteVar>(), nlevel.toCPointer<ByteVar>(), ntranslatemode.toCPointer<ByteVar>(), nretransmitmode.toCPointer<ByteVar>())

public actual fun SnmpStartupEx(nmajorversion: Long, nminorversion: Long, nlevel: Long, ntranslatemode: Long, nretransmitmode: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpStartupEx(nmajorversion.toCPointer<ByteVar>(), nminorversion.toCPointer<ByteVar>(), nlevel.toCPointer<ByteVar>(), ntranslatemode.toCPointer<ByteVar>(), nretransmitmode.toCPointer<ByteVar>())

public actual fun SnmpStrToContext(session: Long, string: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToContext(session, string.toCPointer<ByteVar>())

public actual fun SnmpStrToEntity(session: Long, string: PCSTR): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToEntity(session, string.toCPointer<ByteVar>())

public actual fun SnmpStrToOid(string: PCSTR, dstoid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpStrToOid(string.toCPointer<ByteVar>(), dstoid.toCPointer<ByteVar>())

public actual fun SnmpSvcGetUptime(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcGetUptime()

public actual fun SnmpSvcSetLogLevel(nloglevel: SNMP_LOG) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogLevel(nloglevel)
}

public actual fun SnmpSvcSetLogType(nlogtype: Int) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpSvcSetLogType(nlogtype)
}

public actual fun SnmpUtilAsnAnyCpy(panydst: Long, panysrc: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyCpy(panydst.toCPointer<ByteVar>(), panysrc.toCPointer<ByteVar>())

public actual fun SnmpUtilAsnAnyFree(pany: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilAsnAnyFree(pany.toCPointer<ByteVar>())
}

public actual fun SnmpUtilDbgPrint(nloglevel: SNMP_LOG, szformat: PCSTR) {
}

public actual fun SnmpUtilIdsToA(ids: Long, idlength: UInt): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilIdsToA(ids.toCPointer<ByteVar>(), idlength)?.toLong() ?: 0L

public actual fun SnmpUtilMemAlloc(nbytes: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemAlloc(nbytes)?.toLong() ?: 0L

public actual fun SnmpUtilMemFree(pmem: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemFree(pmem.toCPointer<ByteVar>())
}

public actual fun SnmpUtilMemReAlloc(pmem: Long, nbytes: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilMemReAlloc(pmem.toCPointer<ByteVar>(), nbytes)?.toLong() ?: 0L

public actual fun SnmpUtilOctetsCmp(poctets1: Long, poctets2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCmp(poctets1.toCPointer<ByteVar>(), poctets2.toCPointer<ByteVar>())

public actual fun SnmpUtilOctetsCpy(poctetsdst: Long, poctetssrc: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsCpy(poctetsdst.toCPointer<ByteVar>(), poctetssrc.toCPointer<ByteVar>())

public actual fun SnmpUtilOctetsFree(poctets: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsFree(poctets.toCPointer<ByteVar>())
}

public actual fun SnmpUtilOctetsNCmp(poctets1: Long, poctets2: Long, nchars: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOctetsNCmp(poctets1.toCPointer<ByteVar>(), poctets2.toCPointer<ByteVar>(), nchars)

public actual fun SnmpUtilOidAppend(poiddst: Long, poidsrc: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidAppend(poiddst.toCPointer<ByteVar>(), poidsrc.toCPointer<ByteVar>())

public actual fun SnmpUtilOidCmp(poid1: Long, poid2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCmp(poid1.toCPointer<ByteVar>(), poid2.toCPointer<ByteVar>())

public actual fun SnmpUtilOidCpy(poiddst: Long, poidsrc: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidCpy(poiddst.toCPointer<ByteVar>(), poidsrc.toCPointer<ByteVar>())

public actual fun SnmpUtilOidFree(poid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidFree(poid.toCPointer<ByteVar>())
}

public actual fun SnmpUtilOidNCmp(poid1: Long, poid2: Long, nsubids: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidNCmp(poid1.toCPointer<ByteVar>(), poid2.toCPointer<ByteVar>(), nsubids)

public actual fun SnmpUtilOidToA(oid: Long): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilOidToA(oid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SnmpUtilPrintAsnAny(pany: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintAsnAny(pany.toCPointer<ByteVar>())
}

public actual fun SnmpUtilPrintOid(oid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilPrintOid(oid.toCPointer<ByteVar>())
}

public actual fun SnmpUtilVarBindCpy(pvbdst: Long, pvbsrc: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindCpy(pvbdst.toCPointer<ByteVar>(), pvbsrc.toCPointer<ByteVar>())

public actual fun SnmpUtilVarBindFree(pvb: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindFree(pvb.toCPointer<ByteVar>())
}

public actual fun SnmpUtilVarBindListCpy(pvbldst: Long, pvblsrc: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListCpy(pvbldst.toCPointer<ByteVar>(), pvblsrc.toCPointer<ByteVar>())

public actual fun SnmpUtilVarBindListFree(pvbl: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp.cinterop.windowssys_windows_win32_networkmanagement_snmp_SnmpUtilVarBindListFree(pvbl.toCPointer<ByteVar>())
}
