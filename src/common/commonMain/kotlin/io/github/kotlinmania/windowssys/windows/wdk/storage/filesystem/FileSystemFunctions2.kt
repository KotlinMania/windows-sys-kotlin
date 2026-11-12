package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenInformationClass
import io.github.kotlinmania.windowssys.windows.win32.security.TokenType
import io.github.kotlinmania.windowssys.windows.win32.security.WellKnownSidType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecGetKeyFn
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType

public expect fun rtlNtStatusToDosErrorNoTeb(status: Ntstatus): UInt

public expect fun rtlOemStringToCountedUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlOemStringToUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus

public expect fun rtlPrefixString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean

public expect fun rtlQueryPackageIdentity(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, packaged: MutPtr): Ntstatus

public expect fun rtlQueryPackageIdentityEx(tokenobject: ConstPtr, packagefullname: Pwstr, packagesize: MutPtr, appid: Pwstr, appidsize: MutPtr, dynamicid: MutPtr, flags: MutPtr): Ntstatus

public expect fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte

public expect fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte

public expect fun rtlRandom(seed: MutPtr): UInt

public expect fun rtlRandomEx(seed: MutPtr): UInt

public expect fun rtlRemoveUnicodePrefix(prefixtable: ConstPtr, prefixtableentry: ConstPtr)

public expect fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: MutPtr): Ntstatus

public expect fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: MutPtr, endofcompressedbufferplus1: ConstPtr, chunkbuffer: MutPtr, chunksize: UInt): Ntstatus

public expect fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: MutPtr)

public expect fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: MutPtr)

public expect fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: MutPtr, dacl: MutPtr, daclsize: MutPtr, sacl: MutPtr, saclsize: MutPtr, owner: Psid, ownersize: MutPtr, primarygroup: Psid, primarygroupsize: MutPtr): Ntstatus

public expect fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus

public expect fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus

public expect fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun rtlSubAuthorityCountSid(sid: Psid): MutPtr

public expect fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): MutPtr

public expect fun rtlTimeToSecondsSince1980(time: ConstPtr, elapsedseconds: MutPtr): Boolean

public expect fun rtlUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpcaseUnicodeStringToOemString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpcaseUnicodeToCustomCPN(customcp: ConstPtr, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: MutPtr, unicodestring: ConstPtr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlValidSid(sid: Psid): Boolean

public expect fun rtlValidateUnicodeString(flags: UInt, string: ConstPtr): Ntstatus

public expect fun rtlxOemStringToUnicodeSize(oemstring: ConstPtr): UInt

public expect fun rtlxUnicodeStringToOemSize(unicodestring: ConstPtr): UInt

public expect fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: ConstPtr, clienttokeninformation: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean

public expect fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: ConstPtr, clienttoken: ConstPtr, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean

public expect fun seAdjustAccessStateForAccessConstraints(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr)

public expect fun seAdjustAccessStateForTrustLabel(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: MutPtr)

public expect fun seAdjustObjectSecurity(objectname: ConstPtr, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, adjusteddescriptor: MutPtr, applyadjusteddescriptor: MutPtr): Ntstatus

public expect fun seAppendPrivileges(accessstate: MutPtr, privileges: ConstPtr): Ntstatus

public expect fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt)

public expect fun seAuditHardLinkCreation(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean)

public expect fun seAuditHardLinkCreationWithTransaction(filename: ConstPtr, linkname: ConstPtr, bsuccess: Boolean, transactionid: ConstPtr)

public expect fun seAuditTransactionStateChange(transactionid: ConstPtr, resourcemanagerid: ConstPtr, newtransactionstate: UInt)

public expect fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean

public expect fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean

public expect fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean

public expect fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, stagingenabled: MutPtr): Boolean

public expect fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean

public expect fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr): Boolean

public expect fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: MutPtr)

public expect fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, aceremoved: MutPtr)

public expect fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: ConstPtr, remotesession: Boolean, clientcontext: MutPtr): Ntstatus

public expect fun seCreateClientSecurityFromSubjectContext(subjectcontext: ConstPtr, clientsecurityqos: ConstPtr, serverisremote: Boolean, clientcontext: MutPtr): Ntstatus

public expect fun seDeleteClientSecurity(clientcontext: MutPtr)

public expect fun seDeleteObjectAuditAlarm(obj: ConstPtr, handle: Handle)

public expect fun seDeleteObjectAuditAlarmWithTransaction(obj: ConstPtr, handle: Handle, transactionid: ConstPtr)

public expect fun seExamineSacl(sacl: ConstPtr, resourcesacl: ConstPtr, token: ConstPtr, desiredaccess: UInt, accessgranted: Boolean, generateaudit: MutPtr, generatealarm: MutPtr)

public expect fun seFilterToken(existingtoken: ConstPtr, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, filteredtoken: MutPtr): Ntstatus

public expect fun seFreePrivileges(privileges: ConstPtr)

public expect fun seImpersonateClient(clientcontext: ConstPtr, serverthread: Pethread)

public expect fun seImpersonateClientEx(clientcontext: ConstPtr, serverthread: Pethread): Ntstatus

public expect fun seLocateProcessImageName(process: Peprocess, pimagefilename: MutPtr): Ntstatus

public expect fun seMarkLogonSessionForTerminationNotification(logonid: ConstPtr): Ntstatus

public expect fun seMarkLogonSessionForTerminationNotificationEx(logonid: ConstPtr, pserversilo: Pesilo): Ntstatus

public expect fun seOpenObjectAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr)

public expect fun seOpenObjectAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr)

public expect fun seOpenObjectForDeleteAuditAlarm(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: MutPtr)

public expect fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: ConstPtr, obj: ConstPtr, absoluteobjectname: ConstPtr, securitydescriptor: PsecurityDescriptor, accessstate: ConstPtr, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: ConstPtr, generateonclose: MutPtr)

public expect fun sePrivilegeCheck(requiredprivileges: MutPtr, subjectsecuritycontext: ConstPtr, accessmode: Byte): Boolean

public expect fun seQueryAuthenticationIdToken(token: ConstPtr, authenticationid: MutPtr): Ntstatus

public expect fun seQueryInformationToken(token: ConstPtr, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr): Ntstatus

public expect fun seQuerySecurityDescriptorInfo(securityinformation: ConstPtr, securitydescriptor: PsecurityDescriptor, length: MutPtr, objectssecuritydescriptor: MutPtr): Ntstatus

public expect fun seQueryServerSiloToken(token: ConstPtr, pserversilo: MutPtr): Ntstatus

public expect fun seQuerySessionIdToken(token: ConstPtr, sessionid: MutPtr): Ntstatus

public expect fun seQuerySessionIdTokenEx(token: ConstPtr, sessionid: MutPtr, isservicesession: MutPtr): Ntstatus

public expect fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus

public expect fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus

public expect fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: ConstPtr, usersid: Psid, auditparameters: ConstPtr, auditsubcategoryid: UInt): Ntstatus

public expect fun seSetAccessStateGenericMapping(accessstate: MutPtr, genericmapping: ConstPtr)

public expect fun seSetSecurityDescriptorInfo(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus

public expect fun seSetSecurityDescriptorInfoEx(obj: ConstPtr, securityinformation: ConstPtr, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: MutPtr, autoinheritflags: UInt, pooltype: PoolType, genericmapping: ConstPtr): Ntstatus

public expect fun seShouldCheckForAccessRightsFromParent(objecttype: ConstPtr, childdescriptor: PsecurityDescriptor, accessstate: ConstPtr): Boolean

public expect fun seTokenFromAccessInformation(accessinformation: ConstPtr, token: MutPtr, length: UInt, requiredlength: MutPtr): Ntstatus

public expect fun seTokenIsAdmin(token: ConstPtr): Boolean

public expect fun seTokenIsRestricted(token: ConstPtr): Boolean

public expect fun seTokenIsWriteRestricted(token: ConstPtr): Boolean

public expect fun seTokenType(token: ConstPtr): TokenType

public expect fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus

public expect fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: ConstPtr): Ntstatus

public expect fun secLookupAccountName(name: ConstPtr, sidsize: MutPtr, sid: Psid, nameuse: MutPtr, domainsize: MutPtr, referenceddomain: MutPtr): Ntstatus

public expect fun secLookupAccountSid(sid: Psid, namesize: MutPtr, namebuffer: MutPtr, domainsize: MutPtr, domainbuffer: MutPtr, nameuse: MutPtr): Ntstatus

public expect fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: MutPtr): Ntstatus

public expect fun secMakeSPN(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus

public expect fun secMakeSPNEx(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, targetinfo: MutPtr, spn: MutPtr, length: MutPtr, allocate: Boolean): Ntstatus

public expect fun secMakeSPNEx2(serviceclass: MutPtr, servicename: MutPtr, instancename: MutPtr, instanceport: UShort, referrer: MutPtr, intargetinfo: MutPtr, spn: MutPtr, totalsize: MutPtr, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus

public expect fun setContextAttributesW(phcontext: ConstPtr, ulattribute: UInt, pbuffer: ConstPtr, cbbuffer: UInt): Hresult

public expect fun sspiAcceptSecurityContextAsync(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, pinput: ConstPtr, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult

public expect fun sspiAcquireCredentialsHandleAsyncA(asynccontext: MutPtr, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult

public expect fun sspiAcquireCredentialsHandleAsyncW(asynccontext: MutPtr, pszprincipal: ConstPtr, pszpackage: ConstPtr, fcredentialuse: UInt, pvlogonid: ConstPtr, pauthdata: ConstPtr, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr, phcredential: ConstPtr, ptsexpiry: ConstPtr): Hresult

public expect fun sspiCreateAsyncContext(): MutPtr

public expect fun sspiDeleteSecurityContextAsync(asynccontext: MutPtr, phcontext: ConstPtr): Hresult

public expect fun sspiFreeAsyncContext(handle: ConstPtr)

public expect fun sspiFreeCredentialsHandleAsync(asynccontext: MutPtr, phcredential: ConstPtr): Hresult

public expect fun sspiGetAsyncCallStatus(handle: ConstPtr): Hresult

public expect fun sspiInitializeSecurityContextAsyncA(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult

public expect fun sspiInitializeSecurityContextAsyncW(asynccontext: MutPtr, phcredential: ConstPtr, phcontext: ConstPtr, psztargetname: ConstPtr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr, reserved2: UInt, phnewcontext: ConstPtr, poutput: ConstPtr, pfcontextattr: ConstPtr, ptsexpiry: ConstPtr): Hresult

public expect fun sspiReinitAsyncContext(handle: MutPtr): Ntstatus

public expect fun sspiSetAsyncNotifyCallback(context: ConstPtr, callback: SspiAsyncNotifyCallback, callbackdata: ConstPtr): Hresult

public expect fun verifySignature(phcontext: ConstPtr, pmessage: ConstPtr, messageseqno: UInt, pfqop: MutPtr): Hresult

public expect fun zwAccessCheckAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: ConstPtr, objecttypelistlength: UInt, genericmapping: ConstPtr, objectcreation: Boolean, grantedaccess: MutPtr, accessstatus: MutPtr, generateonclose: MutPtr): Ntstatus

public expect fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus

public expect fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: ConstPtr, bufferlength: UInt, previousstate: MutPtr, returnlength: MutPtr): Ntstatus

public expect fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, regionsize: MutPtr, allocationtype: UInt, protect: UInt): Ntstatus

public expect fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, allocationtype: UInt, pageprotection: UInt, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus

public expect fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: ConstPtr, iostatusblock: MutPtr): Ntstatus

public expect fun zwCloseObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus

public expect fun zwCreateDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun zwCreateEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, eventtype: EventType, initialstate: Boolean): Ntstatus

public expect fun zwCreateSectionEx(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: MutPtr, extendedparametercount: UInt): Ntstatus

public expect fun zwDeleteFile(objectattributes: ConstPtr): Ntstatus

public expect fun zwDeleteObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, generateonclose: Boolean): Ntstatus

public expect fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: MutPtr, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus

public expect fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: ConstPtr, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: MutPtr): Ntstatus

public expect fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: ConstPtr, privilegestodelete: ConstPtr, restrictedsids: ConstPtr, newtokenhandle: MutPtr): Ntstatus

public expect fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: MutPtr): Ntstatus

public expect fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: ConstPtr, parameterssize: UInt, iostatusblock: MutPtr): Ntstatus

public expect fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, iostatus: MutPtr): Ntstatus

public expect fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: MutPtr, regionsize: MutPtr, freetype: UInt): Ntstatus

public expect fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus

public expect fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus

public expect fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus

public expect fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun zwOpenDirectoryObject(directoryhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus

public expect fun zwOpenObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, objecttypename: ConstPtr, objectname: ConstPtr, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: ConstPtr, objectcreation: Boolean, accessgranted: Boolean, generateonclose: MutPtr): Ntstatus

public expect fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: MutPtr): Ntstatus

public expect fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus

public expect fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: MutPtr): Ntstatus

public expect fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: MutPtr): Ntstatus

public expect fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: MutPtr, result: MutPtr): Ntstatus

public expect fun zwPrivilegeObjectAuditAlarm(subsystemname: ConstPtr, handleid: ConstPtr, clienttoken: Handle, desiredaccess: UInt, privileges: ConstPtr, accessgranted: Boolean): Ntstatus

public expect fun zwPrivilegedServiceAuditAlarm(subsystemname: ConstPtr, servicename: ConstPtr, clienttoken: Handle, privileges: ConstPtr, accessgranted: Boolean): Ntstatus

public expect fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean): Ntstatus

public expect fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr): Ntstatus

public expect fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: MutPtr, returnlength: MutPtr): Ntstatus

public expect fun zwQueryEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean): Ntstatus

public expect fun zwQueryFullAttributesFile(objectattributes: ConstPtr, fileinformation: MutPtr): Ntstatus

public expect fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: MutPtr, tokeninformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr, objectinformationlength: UInt, returnlength: MutPtr): Ntstatus

public expect fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus

public expect fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus

public expect fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: ConstPtr, memoryinformationclass: MemoryInformationClass, memoryinformation: MutPtr, memoryinformationlength: ULong, returnlength: MutPtr): Ntstatus

public expect fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun zwSetEaFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus

public expect fun zwSetEvent(eventhandle: Handle, previousstate: MutPtr): Ntstatus

public expect fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: ConstPtr, tokeninformationlength: UInt): Ntstatus

public expect fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: ConstPtr, vminformation: ConstPtr, vminformationlength: UInt): Ntstatus

public expect fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt): Ntstatus

public expect fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: MutPtr, fsinformation: ConstPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun zwUnlockFile(filehandle: Handle, iostatusblock: MutPtr, byteoffset: ConstPtr, length: ConstPtr, key: UInt): Ntstatus
