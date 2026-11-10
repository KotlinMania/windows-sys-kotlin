package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun rtlOemStringToCountedUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlOemStringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlOemToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, oemstring: Pcstr, bytesinoemstring: UInt): Ntstatus

public expect fun rtlPrefixString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean

public expect fun rtlQueryPackageIdentity(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, packaged: COpaquePointer?): Ntstatus

public expect fun rtlQueryPackageIdentityEx(tokenobject: COpaquePointer?, packagefullname: Pwstr, packagesize: COpaquePointer?, appid: Pwstr, appidsize: COpaquePointer?, dynamicid: COpaquePointer?, flags: COpaquePointer?): Ntstatus

public expect fun rtlQueryProcessPlaceholderCompatibilityMode(): Byte

public expect fun rtlQueryThreadPlaceholderCompatibilityMode(): Byte

public expect fun rtlRandom(seed: COpaquePointer?): UInt

public expect fun rtlRandomEx(seed: COpaquePointer?): UInt

public expect fun rtlRemoveUnicodePrefix(prefixtable: COpaquePointer?, prefixtableentry: COpaquePointer?)

public expect fun rtlReplaceSidInSd(securitydescriptor: PsecurityDescriptor, oldsid: Psid, newsid: Psid, numchanges: COpaquePointer?): Ntstatus

public expect fun rtlReserveChunk(compressionformat: UShort, compressedbuffer: COpaquePointer?, endofcompressedbufferplus1: COpaquePointer?, chunkbuffer: COpaquePointer?, chunksize: UInt): Ntstatus

public expect fun rtlSecondsSince1970ToTime(elapsedseconds: UInt, time: COpaquePointer?)

public expect fun rtlSecondsSince1980ToTime(elapsedseconds: UInt, time: COpaquePointer?)

public expect fun rtlSelfRelativeToAbsoluteSD(selfrelativesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptor: PsecurityDescriptor, absolutesecuritydescriptorsize: COpaquePointer?, dacl: COpaquePointer?, daclsize: COpaquePointer?, sacl: COpaquePointer?, saclsize: COpaquePointer?, owner: Psid, ownersize: COpaquePointer?, primarygroup: Psid, primarygroupsize: COpaquePointer?): Ntstatus

public expect fun rtlSetGroupSecurityDescriptor(securitydescriptor: PsecurityDescriptor, group: Psid, groupdefaulted: Boolean): Ntstatus

public expect fun rtlSetOwnerSecurityDescriptor(securitydescriptor: PsecurityDescriptor, owner: Psid, ownerdefaulted: Boolean): Ntstatus

public expect fun rtlSetProcessPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun rtlSetThreadPlaceholderCompatibilityMode(mode: Byte): Byte

public expect fun rtlSubAuthorityCountSid(sid: Psid): COpaquePointer?

public expect fun rtlSubAuthoritySid(sid: Psid, subauthority: UInt): COpaquePointer?

public expect fun rtlTimeToSecondsSince1980(time: COpaquePointer?, elapsedseconds: COpaquePointer?): Boolean

public expect fun rtlUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeStringToCountedOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpcaseUnicodeStringToOemString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus

public expect fun rtlUpcaseUnicodeToCustomCPN(customcp: COpaquePointer?, customcpstring: Pstr, maxbytesincustomcpstring: UInt, bytesincustomcpstring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlUpcaseUnicodeToOemN(oemstring: Pstr, maxbytesinoemstring: UInt, bytesinoemstring: COpaquePointer?, unicodestring: COpaquePointer?, bytesinunicodestring: UInt): Ntstatus

public expect fun rtlValidSid(sid: Psid): Boolean

public expect fun rtlValidateUnicodeString(flags: UInt, string: COpaquePointer?): Ntstatus

public expect fun rtlxOemStringToUnicodeSize(oemstring: COpaquePointer?): UInt

public expect fun rtlxUnicodeStringToOemSize(unicodestring: COpaquePointer?): UInt

public expect fun seAccessCheckFromState(securitydescriptor: PsecurityDescriptor, primarytokeninformation: COpaquePointer?, clienttokeninformation: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean

public expect fun seAccessCheckFromStateEx(securitydescriptor: PsecurityDescriptor, primarytoken: COpaquePointer?, clienttoken: COpaquePointer?, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean

public expect fun seAdjustAccessStateForAccessConstraints(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?)

public expect fun seAdjustAccessStateForTrustLabel(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?)

public expect fun seAdjustObjectSecurity(objectname: COpaquePointer?, originaldescriptor: PsecurityDescriptor, proposeddescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, adjusteddescriptor: COpaquePointer?, applyadjusteddescriptor: COpaquePointer?): Ntstatus

public expect fun seAppendPrivileges(accessstate: COpaquePointer?, privileges: COpaquePointer?): Ntstatus

public expect fun seAuditFipsCryptoSelftests(bsuccess: Boolean, selftestcode: UInt)

public expect fun seAuditHardLinkCreation(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean)

public expect fun seAuditHardLinkCreationWithTransaction(filename: COpaquePointer?, linkname: COpaquePointer?, bsuccess: Boolean, transactionid: COpaquePointer?)

public expect fun seAuditTransactionStateChange(transactionid: COpaquePointer?, resourcemanagerid: COpaquePointer?, newtransactionstate: UInt)

public expect fun seAuditingAnyFileEventsWithContext(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean

public expect fun seAuditingAnyFileEventsWithContextEx(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean

public expect fun seAuditingFileEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun seAuditingFileEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean

public expect fun seAuditingFileEventsWithContextEx(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, stagingenabled: COpaquePointer?): Boolean

public expect fun seAuditingFileOrGlobalEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean

public expect fun seAuditingHardLinkEvents(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor): Boolean

public expect fun seAuditingHardLinkEventsWithContext(accessgranted: Boolean, securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?): Boolean

public expect fun seCaptureSubjectContextEx(thread: Pethread, process: Peprocess, subjectcontext: COpaquePointer?)

public expect fun seCheckForCriticalAceRemoval(currentdescriptor: PsecurityDescriptor, newdescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, aceremoved: COpaquePointer?)

public expect fun seCreateClientSecurity(clientthread: Pethread, clientsecurityqos: COpaquePointer?, remotesession: Boolean, clientcontext: COpaquePointer?): Ntstatus

public expect fun seCreateClientSecurityFromSubjectContext(subjectcontext: COpaquePointer?, clientsecurityqos: COpaquePointer?, serverisremote: Boolean, clientcontext: COpaquePointer?): Ntstatus

public expect fun seDeleteClientSecurity(clientcontext: COpaquePointer?)

public expect fun seDeleteObjectAuditAlarm(obj: COpaquePointer?, handle: Handle)

public expect fun seDeleteObjectAuditAlarmWithTransaction(obj: COpaquePointer?, handle: Handle, transactionid: COpaquePointer?)

public expect fun seExamineSacl(sacl: COpaquePointer?, resourcesacl: COpaquePointer?, token: COpaquePointer?, desiredaccess: UInt, accessgranted: Boolean, generateaudit: COpaquePointer?, generatealarm: COpaquePointer?)

public expect fun seFilterToken(existingtoken: COpaquePointer?, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, filteredtoken: COpaquePointer?): Ntstatus

public expect fun seFreePrivileges(privileges: COpaquePointer?)

public expect fun seImpersonateClient(clientcontext: COpaquePointer?, serverthread: Pethread)

public expect fun seImpersonateClientEx(clientcontext: COpaquePointer?, serverthread: Pethread): Ntstatus

public expect fun seLocateProcessImageName(process: Peprocess, pimagefilename: COpaquePointer?): Ntstatus

public expect fun seMarkLogonSessionForTerminationNotification(logonid: COpaquePointer?): Ntstatus

public expect fun seMarkLogonSessionForTerminationNotificationEx(logonid: COpaquePointer?, pserversilo: Pesilo): Ntstatus

public expect fun seOpenObjectAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?)

public expect fun seOpenObjectAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?)

public expect fun seOpenObjectForDeleteAuditAlarm(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, generateonclose: COpaquePointer?)

public expect fun seOpenObjectForDeleteAuditAlarmWithTransaction(objecttypename: COpaquePointer?, obj: COpaquePointer?, absoluteobjectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, accessstate: COpaquePointer?, objectcreated: Boolean, accessgranted: Boolean, accessmode: Byte, transactionid: COpaquePointer?, generateonclose: COpaquePointer?)

public expect fun sePrivilegeCheck(requiredprivileges: COpaquePointer?, subjectsecuritycontext: COpaquePointer?, accessmode: Byte): Boolean

public expect fun seQueryAuthenticationIdToken(token: COpaquePointer?, authenticationid: COpaquePointer?): Ntstatus

public expect fun seQueryInformationToken(token: COpaquePointer?, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?): Ntstatus

public expect fun seQuerySecurityDescriptorInfo(securityinformation: COpaquePointer?, securitydescriptor: PsecurityDescriptor, length: COpaquePointer?, objectssecuritydescriptor: COpaquePointer?): Ntstatus

public expect fun seQueryServerSiloToken(token: COpaquePointer?, pserversilo: COpaquePointer?): Ntstatus

public expect fun seQuerySessionIdToken(token: COpaquePointer?, sessionid: COpaquePointer?): Ntstatus

public expect fun seQuerySessionIdTokenEx(token: COpaquePointer?, sessionid: COpaquePointer?, isservicesession: COpaquePointer?): Ntstatus

public expect fun seRegisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus

public expect fun seRegisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus

public expect fun seReportSecurityEventWithSubCategory(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?, auditsubcategoryid: UInt): Ntstatus

public expect fun seSetAccessStateGenericMapping(accessstate: COpaquePointer?, genericmapping: COpaquePointer?)

public expect fun seSetSecurityDescriptorInfo(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus

public expect fun seSetSecurityDescriptorInfoEx(obj: COpaquePointer?, securityinformation: COpaquePointer?, modificationdescriptor: PsecurityDescriptor, objectssecuritydescriptor: COpaquePointer?, autoinheritflags: UInt, pooltype: PoolType, genericmapping: COpaquePointer?): Ntstatus

public expect fun seShouldCheckForAccessRightsFromParent(objecttype: COpaquePointer?, childdescriptor: PsecurityDescriptor, accessstate: COpaquePointer?): Boolean

public expect fun seTokenFromAccessInformation(accessinformation: COpaquePointer?, token: COpaquePointer?, length: UInt, requiredlength: COpaquePointer?): Ntstatus

public expect fun seTokenIsAdmin(token: COpaquePointer?): Boolean

public expect fun seTokenIsRestricted(token: COpaquePointer?): Boolean

public expect fun seTokenIsWriteRestricted(token: COpaquePointer?): Boolean

public expect fun seTokenType(token: COpaquePointer?): TokenType

public expect fun seUnregisterLogonSessionTerminatedRoutine(callbackroutine: PseLogonSessionTerminatedRoutine): Ntstatus

public expect fun seUnregisterLogonSessionTerminatedRoutineEx(callbackroutine: PseLogonSessionTerminatedRoutineEx, context: COpaquePointer?): Ntstatus

public expect fun secLookupAccountName(name: COpaquePointer?, sidsize: COpaquePointer?, sid: Psid, nameuse: COpaquePointer?, domainsize: COpaquePointer?, referenceddomain: COpaquePointer?): Ntstatus

public expect fun secLookupAccountSid(sid: Psid, namesize: COpaquePointer?, namebuffer: COpaquePointer?, domainsize: COpaquePointer?, domainbuffer: COpaquePointer?, nameuse: COpaquePointer?): Ntstatus

public expect fun secLookupWellKnownSid(sidtype: WellKnownSidType, sid: Psid, sidbuffersize: UInt, sidsize: COpaquePointer?): Ntstatus

public expect fun secMakeSPN(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus

public expect fun secMakeSPNEx(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, targetinfo: COpaquePointer?, spn: COpaquePointer?, length: COpaquePointer?, allocate: Boolean): Ntstatus

public expect fun secMakeSPNEx2(serviceclass: COpaquePointer?, servicename: COpaquePointer?, instancename: COpaquePointer?, instanceport: UShort, referrer: COpaquePointer?, intargetinfo: COpaquePointer?, spn: COpaquePointer?, totalsize: COpaquePointer?, allocate: Boolean, istargetinfomarshaled: Boolean): Ntstatus

public expect fun setContextAttributesW(phcontext: COpaquePointer?, ulattribute: UInt, pbuffer: COpaquePointer?, cbbuffer: UInt): Hresult

public expect fun sspiAcceptSecurityContextAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, pinput: COpaquePointer?, fcontextreq: UInt, targetdatarep: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun sspiAcquireCredentialsHandleAsyncA(asynccontext: COpaquePointer?, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun sspiAcquireCredentialsHandleAsyncW(asynccontext: COpaquePointer?, pszprincipal: COpaquePointer?, pszpackage: COpaquePointer?, fcredentialuse: UInt, pvlogonid: COpaquePointer?, pauthdata: COpaquePointer?, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: COpaquePointer?, phcredential: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun sspiCreateAsyncContext(): COpaquePointer?

public expect fun sspiDeleteSecurityContextAsync(asynccontext: COpaquePointer?, phcontext: COpaquePointer?): Hresult

public expect fun sspiFreeAsyncContext(handle: COpaquePointer?)

public expect fun sspiFreeCredentialsHandleAsync(asynccontext: COpaquePointer?, phcredential: COpaquePointer?): Hresult

public expect fun sspiGetAsyncCallStatus(handle: COpaquePointer?): Hresult

public expect fun sspiInitializeSecurityContextAsyncA(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: Pcstr, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun sspiInitializeSecurityContextAsyncW(asynccontext: COpaquePointer?, phcredential: COpaquePointer?, phcontext: COpaquePointer?, psztargetname: COpaquePointer?, fcontextreq: UInt, reserved1: UInt, targetdatarep: UInt, pinput: COpaquePointer?, reserved2: UInt, phnewcontext: COpaquePointer?, poutput: COpaquePointer?, pfcontextattr: COpaquePointer?, ptsexpiry: COpaquePointer?): Hresult

public expect fun sspiReinitAsyncContext(handle: COpaquePointer?): Ntstatus

public expect fun sspiSetAsyncNotifyCallback(context: COpaquePointer?, callback: SspiAsyncNotifyCallback, callbackdata: COpaquePointer?): Hresult

public expect fun verifySignature(phcontext: COpaquePointer?, pmessage: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Hresult

public expect fun zwAccessCheckAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, desiredaccess: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun zwAccessCheckByTypeAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun zwAccessCheckByTypeResultListAndAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun zwAccessCheckByTypeResultListAndAuditAlarmByHandle(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, principalselfsid: Psid, desiredaccess: UInt, audittype: AuditEventType, flags: UInt, objecttypelist: COpaquePointer?, objecttypelistlength: UInt, genericmapping: COpaquePointer?, objectcreation: Boolean, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?, generateonclose: COpaquePointer?): Ntstatus

public expect fun zwAdjustGroupsToken(tokenhandle: Handle, resettodefault: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus

public expect fun zwAdjustPrivilegesToken(tokenhandle: Handle, disableallprivileges: Boolean, newstate: COpaquePointer?, bufferlength: UInt, previousstate: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus

public expect fun zwAllocateVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, regionsize: COpaquePointer?, allocationtype: UInt, protect: UInt): Ntstatus

public expect fun zwAllocateVirtualMemoryEx(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, allocationtype: UInt, pageprotection: UInt, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus

public expect fun zwCancelIoFileEx(filehandle: Handle, iorequesttocancel: COpaquePointer?, iostatusblock: COpaquePointer?): Ntstatus

public expect fun zwCloseObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus

public expect fun zwCreateDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun zwCreateEvent(eventhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, eventtype: EventType, initialstate: Boolean): Ntstatus

public expect fun zwCreateSectionEx(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle, extendedparameters: COpaquePointer?, extendedparametercount: UInt): Ntstatus

public expect fun zwDeleteFile(objectattributes: COpaquePointer?): Ntstatus

public expect fun zwDeleteObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, generateonclose: Boolean): Ntstatus

public expect fun zwDuplicateObject(sourceprocesshandle: Handle, sourcehandle: Handle, targetprocesshandle: Handle, targethandle: COpaquePointer?, desiredaccess: UInt, handleattributes: UInt, options: UInt): Ntstatus

public expect fun zwDuplicateToken(existingtokenhandle: Handle, desiredaccess: UInt, objectattributes: COpaquePointer?, effectiveonly: Boolean, tokentype: TokenType, newtokenhandle: COpaquePointer?): Ntstatus

public expect fun zwFilterToken(existingtokenhandle: Handle, flags: UInt, sidstodisable: COpaquePointer?, privilegestodelete: COpaquePointer?, restrictedsids: COpaquePointer?, newtokenhandle: COpaquePointer?): Ntstatus

public expect fun zwFlushBuffersFile(filehandle: Handle, iostatusblock: COpaquePointer?): Ntstatus

public expect fun zwFlushBuffersFileEx(filehandle: Handle, flags: UInt, parameters: COpaquePointer?, parameterssize: UInt, iostatusblock: COpaquePointer?): Ntstatus

public expect fun zwFlushVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, iostatus: COpaquePointer?): Ntstatus

public expect fun zwFreeVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, regionsize: COpaquePointer?, freetype: UInt): Ntstatus

public expect fun zwFsControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fscontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus

public expect fun zwImpersonateAnonymousToken(threadhandle: Handle): Ntstatus

public expect fun zwLockFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt, failimmediately: Boolean, exclusivelock: Boolean): Ntstatus

public expect fun zwNotifyChangeKey(keyhandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun zwOpenDirectoryObject(directoryhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus

public expect fun zwOpenObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, objecttypename: COpaquePointer?, objectname: COpaquePointer?, securitydescriptor: PsecurityDescriptor, clienttoken: Handle, desiredaccess: UInt, grantedaccess: UInt, privileges: COpaquePointer?, objectcreation: Boolean, accessgranted: Boolean, generateonclose: COpaquePointer?): Ntstatus

public expect fun zwOpenProcessToken(processhandle: Handle, desiredaccess: UInt, tokenhandle: COpaquePointer?): Ntstatus

public expect fun zwOpenProcessTokenEx(processhandle: Handle, desiredaccess: UInt, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus

public expect fun zwOpenThreadToken(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, tokenhandle: COpaquePointer?): Ntstatus

public expect fun zwOpenThreadTokenEx(threadhandle: Handle, desiredaccess: UInt, openasself: Boolean, handleattributes: UInt, tokenhandle: COpaquePointer?): Ntstatus

public expect fun zwPrivilegeCheck(clienttoken: Handle, requiredprivileges: COpaquePointer?, result: COpaquePointer?): Ntstatus

public expect fun zwPrivilegeObjectAuditAlarm(subsystemname: COpaquePointer?, handleid: COpaquePointer?, clienttoken: Handle, desiredaccess: UInt, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus

public expect fun zwPrivilegedServiceAuditAlarm(subsystemname: COpaquePointer?, servicename: COpaquePointer?, clienttoken: Handle, privileges: COpaquePointer?, accessgranted: Boolean): Ntstatus

public expect fun zwQueryDirectoryFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: COpaquePointer?, restartscan: Boolean): Ntstatus

public expect fun zwQueryDirectoryFileEx(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: COpaquePointer?): Ntstatus

public expect fun zwQueryDirectoryObject(directoryhandle: Handle, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, restartscan: Boolean, context: COpaquePointer?, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, ealist: COpaquePointer?, ealistlength: UInt, eaindex: COpaquePointer?, restartscan: Boolean): Ntstatus

public expect fun zwQueryFullAttributesFile(objectattributes: COpaquePointer?, fileinformation: COpaquePointer?): Ntstatus

public expect fun zwQueryInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: COpaquePointer?, objectinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, returnsingleentry: Boolean, sidlist: COpaquePointer?, sidlistlength: UInt, startsid: Psid, restartscan: Boolean): Ntstatus

public expect fun zwQuerySecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: COpaquePointer?): Ntstatus

public expect fun zwQueryVirtualMemory(processhandle: Handle, baseaddress: COpaquePointer?, memoryinformationclass: MemoryInformationClass, memoryinformation: COpaquePointer?, memoryinformationlength: ULong, returnlength: COpaquePointer?): Ntstatus

public expect fun zwQueryVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun zwSetEaFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun zwSetEvent(eventhandle: Handle, previousstate: COpaquePointer?): Ntstatus

public expect fun zwSetInformationToken(tokenhandle: Handle, tokeninformationclass: TokenInformationClass, tokeninformation: COpaquePointer?, tokeninformationlength: UInt): Ntstatus

public expect fun zwSetInformationVirtualMemory(processhandle: Handle, vminformationclass: VirtualMemoryInformationClass, numberofentries: ULong, virtualaddresses: COpaquePointer?, vminformation: COpaquePointer?, vminformationlength: UInt): Ntstatus

public expect fun zwSetQuotaInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt): Ntstatus

public expect fun zwSetSecurityObject(handle: Handle, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus

public expect fun zwSetVolumeInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fsinformation: COpaquePointer?, length: UInt, fsinformationclass: FsInformationClass): Ntstatus

public expect fun zwUnlockFile(filehandle: Handle, iostatusblock: COpaquePointer?, byteoffset: COpaquePointer?, length: COpaquePointer?, key: UInt): Ntstatus
