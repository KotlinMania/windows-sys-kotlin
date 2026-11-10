@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val _windowsWin32SystemMessagequeuingNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQADsPathToFormatName((lpwcsadspath?.value ?: 0L).toString(), (lpwcsformatname?.value ?: 0L).toString(), (lpdwformatnamelength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQBeginTransaction(pptransaction: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQBeginTransaction((pptransaction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCloseCursor(hcursor: Handle): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQCloseCursor((hcursor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCloseQueue(hqueue: Long): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQCloseQueue(hqueue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCreateCursor(hqueue: Long, phcursor: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQCreateCursor(hqueue.toString(), (phcursor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQCreateQueue((psecuritydescriptor?.value ?: 0L).toString(), (pqueueprops?.value ?: 0L).toString(), (lpwcsformatname?.value ?: 0L).toString(), (lpdwformatnamelength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQDeleteQueue((lpwcsformatname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQFreeMemory(pvmemory: COpaquePointer?) {
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) {
        _windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQFreeMemory((pvmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mQFreeSecurityContext(hsecuritycontext: Handle) {
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) {
        _windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQFreeSecurityContext((hsecuritycontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: COpaquePointer?, pqmprops: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetMachineProperties((lpwcsmachinename?.value ?: 0L).toString(), (pguidmachineid?.value ?: 0L).toString(), (pqmprops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetOverlappedResult(lpoverlapped: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetOverlappedResult((lpoverlapped?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetPrivateComputerInformation((lpwcscomputername?.value ?: 0L).toString(), (pprivateprops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetQueueProperties((lpwcsformatname?.value ?: 0L).toString(), (pqueueprops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetQueueSecurity((lpwcsformatname?.value ?: 0L).toString(), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetSecurityContext(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetSecurityContext((lpcertbuffer?.value ?: 0L).toString(), dwcertbufferlength.toInt(), (phsecuritycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQGetSecurityContextEx(lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt, phsecuritycontext: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQGetSecurityContextEx((lpcertbuffer?.value ?: 0L).toString(), dwcertbufferlength.toInt(), (phsecuritycontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQHandleToFormatName(hqueue.toString(), (lpwcsformatname?.value ?: 0L).toString(), (lpdwformatnamelength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQInstanceToFormatName(pguid: COpaquePointer?, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQInstanceToFormatName((pguid?.value ?: 0L).toString(), (lpwcsformatname?.value ?: 0L).toString(), (lpdwformatnamelength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: COpaquePointer?, pcolumns: COpaquePointer?, psort: COpaquePointer?, phenum: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQLocateBegin((lpwcscontext?.value ?: 0L).toString(), (prestriction?.value ?: 0L).toString(), (pcolumns?.value ?: 0L).toString(), (psort?.value ?: 0L).toString(), (phenum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateEnd(henum: Handle): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQLocateEnd((henum?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQLocateNext(henum: Handle, pcprops: COpaquePointer?, apropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQLocateNext((henum?.value ?: 0L).toString(), (pcprops?.value ?: 0L).toString(), (apropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQMarkMessageRejected((hqueue?.value ?: 0L).toString(), ulllookupid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQMgmtAction((pcomputername?.value ?: 0L).toString(), (pobjectname?.value ?: 0L).toString(), (paction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQMgmtGetInfo((pcomputername?.value ?: 0L).toString(), (pobjectname?.value ?: 0L).toString(), (pmgmtprops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQMoveMessage(hsourcequeue.toString(), hdestinationqueue.toString(), ulllookupid.toString(), (ptransaction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQOpenQueue((lpwcsformatname?.value ?: 0L).toString(), dwaccess.toInt(), dwsharemode.toInt(), (phqueue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQPathNameToFormatName((lpwcspathname?.value ?: 0L).toString(), (lpwcsformatname?.value ?: 0L).toString(), (lpdwformatnamelength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQPurgeQueue(hqueue: Long): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQPurgeQueue(hqueue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQReceiveMessage(hsource.toString(), dwtimeout.toInt(), dwaction.toInt(), (pmessageprops?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), (hcursor?.value ?: 0L).toString(), (ptransaction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: COpaquePointer?, lpoverlapped: COpaquePointer?, fnreceivecallback: Pmqreceivecallback, ptransaction: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQReceiveMessageByLookupId(hsource.toString(), ulllookupid.toString(), dwlookupaction.toInt(), (pmessageprops?.value ?: 0L).toString(), (lpoverlapped?.value ?: 0L).toString(), 0L.toString(), (ptransaction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: COpaquePointer?, dwcertbufferlength: UInt): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQRegisterCertificate(dwflags.toInt(), (lpcertbuffer?.value ?: 0L).toString(), dwcertbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSendMessage(hdestinationqueue: Long, pmessageprops: COpaquePointer?, ptransaction: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQSendMessage(hdestinationqueue.toString(), (pmessageprops?.value ?: 0L).toString(), (ptransaction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: COpaquePointer?): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQSetQueueProperties((lpwcsformatname?.value ?: 0L).toString(), (pqueueprops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult =
    if (_windowsWin32SystemMessagequeuingNapiAddon != null) (_windowsWin32SystemMessagequeuingNapiAddon.windowssys_windows_win32_system_messagequeuing_mQSetQueueSecurity((lpwcsformatname?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
