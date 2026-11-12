package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun mQADsPathToFormatName(lpwcsadspath: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult

public expect fun mQBeginTransaction(pptransaction: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun mQCloseCursor(hcursor: Handle): Hresult

public expect fun mQCloseQueue(hqueue: Long): Hresult

public expect fun mQCreateCursor(hqueue: Long, phcursor: MutPtr<Handle>): Hresult

public expect fun mQCreateQueue(psecuritydescriptor: PsecurityDescriptor, pqueueprops: MutPtr<Mqqueueprops>, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult

public expect fun mQDeleteQueue(lpwcsformatname: Pcwstr): Hresult

public expect fun mQFreeMemory(pvmemory: ConstPtr<CVoid>)

public expect fun mQFreeSecurityContext(hsecuritycontext: Handle)

public expect fun mQGetMachineProperties(lpwcsmachinename: Pcwstr, pguidmachineid: ConstPtr<Guid>, pqmprops: MutPtr<Mqqmprops>): Hresult

public expect fun mQGetOverlappedResult(lpoverlapped: ConstPtr<Overlapped>): Hresult

public expect fun mQGetPrivateComputerInformation(lpwcscomputername: Pcwstr, pprivateprops: MutPtr<Mqprivateprops>): Hresult

public expect fun mQGetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr<Mqqueueprops>): Hresult

public expect fun mQGetQueueSecurity(lpwcsformatname: Pcwstr, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Hresult

public expect fun mQGetSecurityContext(lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt, phsecuritycontext: MutPtr<Handle>): Hresult

public expect fun mQGetSecurityContextEx(lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt, phsecuritycontext: MutPtr<Handle>): Hresult

public expect fun mQHandleToFormatName(hqueue: Long, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult

public expect fun mQInstanceToFormatName(pguid: ConstPtr<Guid>, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult

public expect fun mQLocateBegin(lpwcscontext: Pcwstr, prestriction: ConstPtr<Mqrestriction>, pcolumns: ConstPtr<Mqcolumnset>, psort: ConstPtr<Mqsortset>, phenum: MutPtr<Handle>): Hresult

public expect fun mQLocateEnd(henum: Handle): Hresult

public expect fun mQLocateNext(henum: Handle, pcprops: MutPtr<UInt>, apropvar: MutPtr<Propvariant>): Hresult

public expect fun mQMarkMessageRejected(hqueue: Handle, ulllookupid: ULong): Hresult

public expect fun mQMgmtAction(pcomputername: Pcwstr, pobjectname: Pcwstr, paction: Pcwstr): Hresult

public expect fun mQMgmtGetInfo(pcomputername: Pcwstr, pobjectname: Pcwstr, pmgmtprops: MutPtr<Mqmgmtprops>): Hresult

public expect fun mQMoveMessage(hsourcequeue: Long, hdestinationqueue: Long, ulllookupid: ULong, ptransaction: MutPtr<CVoid>): Hresult

public expect fun mQOpenQueue(lpwcsformatname: Pcwstr, dwaccess: UInt, dwsharemode: UInt, phqueue: MutPtr<Long>): Hresult

public expect fun mQPathNameToFormatName(lpwcspathname: Pcwstr, lpwcsformatname: Pwstr, lpdwformatnamelength: MutPtr<UInt>): Hresult

public expect fun mQPurgeQueue(hqueue: Long): Hresult

public expect fun mQReceiveMessage(hsource: Long, dwtimeout: UInt, dwaction: UInt, pmessageprops: MutPtr<Mqmsgprops>, lpoverlapped: MutPtr<Overlapped>, fnreceivecallback: Pmqreceivecallback, hcursor: Handle, ptransaction: MutPtr<CVoid>): Hresult

public expect fun mQReceiveMessageByLookupId(hsource: Long, ulllookupid: ULong, dwlookupaction: UInt, pmessageprops: MutPtr<Mqmsgprops>, lpoverlapped: MutPtr<Overlapped>, fnreceivecallback: Pmqreceivecallback, ptransaction: MutPtr<CVoid>): Hresult

public expect fun mQRegisterCertificate(dwflags: UInt, lpcertbuffer: ConstPtr<CVoid>, dwcertbufferlength: UInt): Hresult

public expect fun mQSendMessage(hdestinationqueue: Long, pmessageprops: ConstPtr<Mqmsgprops>, ptransaction: MutPtr<CVoid>): Hresult

public expect fun mQSetQueueProperties(lpwcsformatname: Pcwstr, pqueueprops: MutPtr<Mqqueueprops>): Hresult

public expect fun mQSetQueueSecurity(lpwcsformatname: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Hresult
