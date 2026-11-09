@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private val _windowsWin32SystemMessagequeuingNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun MQADsPathToFormatName(lpwcsadspath: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQADsPathToFormatName(lpwcsadspath.toString(), lpwcsformatname.toString(), lpdwformatnamelength.toString()) as Int) else 0

public actual fun MQBeginTransaction(pptransaction: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQBeginTransaction(pptransaction.toString()) as Int) else 0

public actual fun MQCloseCursor(hcursor: HANDLE): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQCloseCursor(hcursor.toString()) as Int) else 0

public actual fun MQCloseQueue(hqueue: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQCloseQueue(hqueue.toString()) as Int) else 0

public actual fun MQCreateCursor(hqueue: Long, phcursor: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQCreateCursor(hqueue.toString(), phcursor.toString()) as Int) else 0

public actual fun MQCreateQueue(psecuritydescriptor: PSECURITY_DESCRIPTOR, pqueueprops: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQCreateQueue(psecuritydescriptor.toString(), pqueueprops.toString(), lpwcsformatname.toString(), lpdwformatnamelength.toString()) as Int) else 0

public actual fun MQDeleteQueue(lpwcsformatname: PCWSTR): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQDeleteQueue(lpwcsformatname.toString()) as Int) else 0

public actual fun MQFreeMemory(pvmemory: Long) {
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) {
        _windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQFreeMemory(pvmemory.toString())
    }
}

public actual fun MQFreeSecurityContext(hsecuritycontext: HANDLE) {
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) {
        _windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQFreeSecurityContext(hsecuritycontext.toString())
    }
}

public actual fun MQGetMachineProperties(lpwcsmachinename: PCWSTR, pguidmachineid: Long, pqmprops: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetMachineProperties(lpwcsmachinename.toString(), pguidmachineid.toString(), pqmprops.toString()) as Int) else 0

public actual fun MQGetOverlappedResult(lpoverlapped: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetOverlappedResult(lpoverlapped.toString()) as Int) else 0

public actual fun MQGetPrivateComputerInformation(lpwcscomputername: PCWSTR, pprivateprops: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetPrivateComputerInformation(lpwcscomputername.toString(), pprivateprops.toString()) as Int) else 0

public actual fun MQGetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetQueueProperties(lpwcsformatname.toString(), pqueueprops.toString()) as Int) else 0

public actual fun MQGetQueueSecurity(lpwcsformatname: PCWSTR, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetQueueSecurity(lpwcsformatname.toString(), requestedinformation.toInt(), psecuritydescriptor.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun MQGetSecurityContext(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetSecurityContext(lpcertbuffer.toString(), dwcertbufferlength.toInt(), phsecuritycontext.toString()) as Int) else 0

public actual fun MQGetSecurityContextEx(lpcertbuffer: Long, dwcertbufferlength: UInt, phsecuritycontext: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQGetSecurityContextEx(lpcertbuffer.toString(), dwcertbufferlength.toInt(), phsecuritycontext.toString()) as Int) else 0

public actual fun MQHandleToFormatName(hqueue: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQHandleToFormatName(hqueue.toString(), lpwcsformatname.toString(), lpdwformatnamelength.toString()) as Int) else 0

public actual fun MQInstanceToFormatName(pguid: Long, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQInstanceToFormatName(pguid.toString(), lpwcsformatname.toString(), lpdwformatnamelength.toString()) as Int) else 0

public actual fun MQLocateBegin(lpwcscontext: PCWSTR, prestriction: Long, pcolumns: Long, psort: Long, phenum: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQLocateBegin(lpwcscontext.toString(), prestriction.toString(), pcolumns.toString(), psort.toString(), phenum.toString()) as Int) else 0

public actual fun MQLocateEnd(henum: HANDLE): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQLocateEnd(henum.toString()) as Int) else 0

public actual fun MQLocateNext(henum: HANDLE, pcprops: Long, apropvar: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQLocateNext(henum.toString(), pcprops.toString(), apropvar.toString()) as Int) else 0

public actual fun MQMarkMessageRejected(hqueue: HANDLE, ulllookupid: ULong): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQMarkMessageRejected(hqueue.toString(), ulllookupid.toString()) as Int) else 0

public actual fun MQMgmtAction(pcomputername: PCWSTR, pobjectname: PCWSTR, paction: PCWSTR): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQMgmtAction(pcomputername.toString(), pobjectname.toString(), paction.toString()) as Int) else 0

public actual fun MQMgmtGetInfo(pcomputername: PCWSTR, pobjectname: PCWSTR, pmgmtprops: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQMgmtGetInfo(pcomputername.toString(), pobjectname.toString(), pmgmtprops.toString()) as Int) else 0

public actual fun MQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQMoveMessage(hsourcequeue.toString(), hdestinationqueue.toString(), ulllookupid.toString(), ptransaction.toString()) as Int) else 0

public actual fun MQOpenQueue(lpwcsformatname: PCWSTR, dwaccess: UInt, dwsharemode: UInt, phqueue: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQOpenQueue(lpwcsformatname.toString(), dwaccess.toInt(), dwsharemode.toInt(), phqueue.toString()) as Int) else 0

public actual fun MQPathNameToFormatName(lpwcspathname: PCWSTR, lpwcsformatname: PWSTR, lpdwformatnamelength: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQPathNameToFormatName(lpwcspathname.toString(), lpwcsformatname.toString(), lpdwformatnamelength.toString()) as Int) else 0

public actual fun MQPurgeQueue(hqueue: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQPurgeQueue(hqueue.toString()) as Int) else 0

public actual fun MQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, hcursor: HANDLE, ptransaction: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQReceiveMessage(hsource.toString(), dwtimeout.toInt(), dwaction.toInt(), pmessageprops.toString(), lpoverlapped.toString(), fnreceivecallback.toLong().toString(), hcursor.toString(), ptransaction.toString()) as Int) else 0

public actual fun MQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: Long, lpoverlapped: Long, fnreceivecallback: PMQRECEIVECALLBACK, ptransaction: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQReceiveMessageByLookupId(hsource.toString(), ulllookupid.toString(), dwlookupaction.toInt(), pmessageprops.toString(), lpoverlapped.toString(), fnreceivecallback.toLong().toString(), ptransaction.toString()) as Int) else 0

public actual fun MQRegisterCertificate(dwflags: UInt, lpcertbuffer: Long, dwcertbufferlength: UInt): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQRegisterCertificate(dwflags.toInt(), lpcertbuffer.toString(), dwcertbufferlength.toInt()) as Int) else 0

public actual fun MQSendMessage(hdestinationqueue: Long, pmessageprops: Long, ptransaction: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQSendMessage(hdestinationqueue.toString(), pmessageprops.toString(), ptransaction.toString()) as Int) else 0

public actual fun MQSetQueueProperties(lpwcsformatname: PCWSTR, pqueueprops: Long): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQSetQueueProperties(lpwcsformatname.toString(), pqueueprops.toString()) as Int) else 0

public actual fun MQSetQueueSecurity(lpwcsformatname: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): HRESULT =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_MQSetQueueSecurity(lpwcsformatname.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int) else 0
