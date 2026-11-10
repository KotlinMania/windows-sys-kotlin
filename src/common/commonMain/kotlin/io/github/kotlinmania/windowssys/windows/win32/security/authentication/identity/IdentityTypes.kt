package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public fun interface AcceptSecurityContextFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: UInt, param5: COpaquePointer?, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?): Hresult
}

public typealias AcceptSecurityContextFn = AcceptSecurityContextFnFn?

public fun interface AcquireCredentialsHandleFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: SecGetKeyFn, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?): Hresult
}

public typealias AcquireCredentialsHandleFnA = AcquireCredentialsHandleFnAFn?

public fun interface AcquireCredentialsHandleFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: COpaquePointer?, param4: COpaquePointer?, param5: SecGetKeyFn, param6: COpaquePointer?, param7: COpaquePointer?, param8: COpaquePointer?): Hresult
}

public typealias AcquireCredentialsHandleFnW = AcquireCredentialsHandleFnWFn?

public fun interface AddCredentialsFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: SecGetKeyFn, param6: COpaquePointer?, param7: COpaquePointer?): Hresult
}

public typealias AddCredentialsFnA = AddCredentialsFnAFn?

public fun interface AddCredentialsFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?, param5: SecGetKeyFn, param6: COpaquePointer?, param7: COpaquePointer?): Hresult
}

public typealias AddCredentialsFnW = AddCredentialsFnWFn?

public fun interface ApplyControlTokenFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias ApplyControlTokenFn = ApplyControlTokenFnFn?

public typealias AscReqFlags = UInt

public typealias AscReqHighFlags = ULong

public fun interface ChangePasswordFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: Boolean, param6: UInt, param7: COpaquePointer?): Hresult
}

public typealias ChangePasswordFnA = ChangePasswordFnAFn?

public fun interface ChangePasswordFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?, param4: COpaquePointer?, param5: Boolean, param6: UInt, param7: COpaquePointer?): Hresult
}

public typealias ChangePasswordFnW = ChangePasswordFnWFn?

public fun interface CompleteAuthTokenFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias CompleteAuthTokenFn = CompleteAuthTokenFnFn?

public typealias CredFetch = Int

public fun interface CredFreeCredentialsFnFn {
    public operator fun invoke(count: UInt, credentials: COpaquePointer?)
}

public typealias CredFreeCredentialsFn = CredFreeCredentialsFnFn?

public fun interface CredReadDomainCredentialsFnFn {
    public operator fun invoke(logonid: COpaquePointer?, credflags: UInt, targetinfo: COpaquePointer?, flags: UInt, count: COpaquePointer?, credential: COpaquePointer?): Ntstatus
}

public typealias CredReadDomainCredentialsFn = CredReadDomainCredentialsFnFn?

public fun interface CredReadFnFn {
    public operator fun invoke(logonid: COpaquePointer?, credflags: UInt, targetname: Pcwstr, type: UInt, flags: UInt, credential: COpaquePointer?): Ntstatus
}

public typealias CredReadFn = CredReadFnFn?

public fun interface CredWriteFnFn {
    public operator fun invoke(logonid: COpaquePointer?, credflags: UInt, credential: COpaquePointer?, flags: UInt): Ntstatus
}

public typealias CredWriteFn = CredWriteFnFn?

public fun interface CrediUnmarshalandDecodeStringFnFn {
    public operator fun invoke(marshaledstring: Pcwstr, blob: COpaquePointer?, blobsize: COpaquePointer?, isfailurefatal: COpaquePointer?): Ntstatus
}

public typealias CrediUnmarshalandDecodeStringFn = CrediUnmarshalandDecodeStringFnFn?

public fun interface DecryptMessageFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: COpaquePointer?): Hresult
}

public typealias DecryptMessageFn = DecryptMessageFnFn?

public fun interface DeleteSecurityContextFnFn {
    public operator fun invoke(param0: COpaquePointer?): Hresult
}

public typealias DeleteSecurityContextFn = DeleteSecurityContextFnFn?

public typealias DomainPasswordProperties = UInt

public fun interface EncryptMessageFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias EncryptMessageFn = EncryptMessageFnFn?

public fun interface EnumerateSecurityPackagesFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias EnumerateSecurityPackagesFnA = EnumerateSecurityPackagesFnAFn?

public fun interface EnumerateSecurityPackagesFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias EnumerateSecurityPackagesFnW = EnumerateSecurityPackagesFnWFn?

public typealias ExportSecurityContextFlags = UInt

public fun interface ExportSecurityContextFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: COpaquePointer?): Hresult
}

public typealias ExportSecurityContextFn = ExportSecurityContextFnFn?

public typealias ExtendedNameFormat = Int

public fun interface FreeContextBufferFnFn {
    public operator fun invoke(param0: COpaquePointer?): Hresult
}

public typealias FreeContextBufferFn = FreeContextBufferFnFn?

public fun interface FreeCredentialsHandleFnFn {
    public operator fun invoke(param0: COpaquePointer?): Hresult
}

public typealias FreeCredentialsHandleFn = FreeCredentialsHandleFnFn?

public fun interface ImpersonateSecurityContextFnFn {
    public operator fun invoke(param0: COpaquePointer?): Hresult
}

public typealias ImpersonateSecurityContextFn = ImpersonateSecurityContextFnFn?

public fun interface ImportSecurityContextFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?): Hresult
}

public typealias ImportSecurityContextFnA = ImportSecurityContextFnAFn?

public fun interface ImportSecurityContextFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: COpaquePointer?): Hresult
}

public typealias ImportSecurityContextFnW = ImportSecurityContextFnWFn?

public fun interface InitializeSecurityContextFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: UInt, param5: UInt, param6: COpaquePointer?, param7: UInt, param8: COpaquePointer?, param9: COpaquePointer?, param10: COpaquePointer?, param11: COpaquePointer?): Hresult
}

public typealias InitializeSecurityContextFnA = InitializeSecurityContextFnAFn?

public fun interface InitializeSecurityContextFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?, param3: UInt, param4: UInt, param5: UInt, param6: COpaquePointer?, param7: UInt, param8: COpaquePointer?, param9: COpaquePointer?, param10: COpaquePointer?, param11: COpaquePointer?): Hresult
}

public typealias InitializeSecurityContextFnW = InitializeSecurityContextFnWFn?

public fun interface InitSecurityInterfaceAFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias InitSecurityInterfaceA = InitSecurityInterfaceAFn?

public fun interface InitSecurityInterfaceWFn {
    public operator fun invoke(): COpaquePointer?
}

public typealias InitSecurityInterfaceW = InitSecurityInterfaceWFn?

public typealias IscReqFlags = UInt

public typealias IscReqHighFlags = ULong

public typealias KerbAddressType = UInt

public typealias KerbCertificateInfoType = Int

public typealias KerbCryptoKeyType = Int

public typealias KerbLogonSubmitType = Int

public typealias KerbProfileBufferType = Int

public typealias KerbProtocolMessageType = Int

public typealias KerbRequestFlags = UInt

public typealias KerbTicketFlags = UInt

public typealias KsecContextType = Int

public fun interface KspCompleteTokenFnFn {
    public operator fun invoke(contextid: ULong, token: COpaquePointer?): Ntstatus
}

public typealias KspCompleteTokenFn = KspCompleteTokenFnFn?

public fun interface KspDeleteContextFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: COpaquePointer?): Ntstatus
}

public typealias KspDeleteContextFn = KspDeleteContextFnFn?

public fun interface KspGetTokenFnFn {
    public operator fun invoke(contextid: ULong, impersonationtoken: COpaquePointer?, rawtoken: COpaquePointer?): Ntstatus
}

public typealias KspGetTokenFn = KspGetTokenFnFn?

public fun interface KspInitContextFnFn {
    public operator fun invoke(contextid: ULong, contextdata: COpaquePointer?, newcontextid: COpaquePointer?): Ntstatus
}

public typealias KspInitContextFn = KspInitContextFnFn?

public fun interface KspInitPackageFnFn {
    public operator fun invoke(functiontable: COpaquePointer?): Ntstatus
}

public typealias KspInitPackageFn = KspInitPackageFnFn?

public fun interface KspMakeSignatureFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: COpaquePointer?, messageseqno: UInt): Ntstatus
}

public typealias KspMakeSignatureFn = KspMakeSignatureFnFn?

public fun interface KspMapHandleFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: COpaquePointer?): Ntstatus
}

public typealias KspMapHandleFn = KspMapHandleFnFn?

public fun interface KspQueryAttributesFnFn {
    public operator fun invoke(contextid: ULong, attribute: UInt, buffer: COpaquePointer?): Ntstatus
}

public typealias KspQueryAttributesFn = KspQueryAttributesFnFn?

public fun interface KspSealMessageFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: COpaquePointer?, messageseqno: UInt): Ntstatus
}

public typealias KspSealMessageFn = KspSealMessageFnFn?

public fun interface KspSerializeAuthDataFnFn {
    public operator fun invoke(pvauthdata: COpaquePointer?, size: COpaquePointer?, serializeddata: COpaquePointer?): Ntstatus
}

public typealias KspSerializeAuthDataFn = KspSerializeAuthDataFnFn?

public fun interface KspSetPagingModeFnFn {
    public operator fun invoke(pagingmode: Boolean): Ntstatus
}

public typealias KspSetPagingModeFn = KspSetPagingModeFnFn?

public fun interface KspUnsealMessageFnFn {
    public operator fun invoke(contextid: ULong, message: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Ntstatus
}

public typealias KspUnsealMessageFn = KspUnsealMessageFnFn?

public fun interface KspVerifySignatureFnFn {
    public operator fun invoke(contextid: ULong, message: COpaquePointer?, messageseqno: UInt, pfqop: COpaquePointer?): Ntstatus
}

public typealias KspVerifySignatureFn = KspVerifySignatureFnFn?

public fun interface LsaApPostLogonUserFn {
    public operator fun invoke(postlogonuserinfo: COpaquePointer?): Ntstatus
}

public typealias LsaApPostLogonUser = LsaApPostLogonUserFn?

public typealias LsaAuthInformationAuthType = UInt

public typealias LsaForestTrustCollisionRecordType = Int

public typealias LsaForestTrustRecordType = Int

public typealias LsaHandle = Long

public typealias LsaLookupDomainInfoClass = Int

public typealias LsaTokenInformationType = Int

public fun interface MakeSignatureFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias MakeSignatureFn = MakeSignatureFnFn?

public typealias Msv10 = UInt

public typealias Msv10Avid = Int

public typealias Msv10CredentialKeyType = Int

public typealias Msv10LogonSubmitType = Int

public typealias Msv10ProfileBufferType = Int

public typealias Msv10ProtocolMessageType = Int

public typealias MsvSubauthLogonParameterControl = UInt

public typealias MsvSubAuthenticationFilter = UInt

public typealias MsvSupplementalCredentialFlags = UInt

public typealias NegotiateMessages = Int

public typealias NetlogonLogonInfoClass = Int

public fun interface PksecCreateContextListFn {
    public operator fun invoke(type: KsecContextType): COpaquePointer?
}

public typealias PksecCreateContextList = PksecCreateContextListFn?

public fun interface PksecDereferenceListEntryFn {
    public operator fun invoke(entry: COpaquePointer?, delete: COpaquePointer?)
}

public typealias PksecDereferenceListEntry = PksecDereferenceListEntryFn?

public fun interface PksecInsertListEntryFn {
    public operator fun invoke(list: COpaquePointer?, entry: COpaquePointer?)
}

public typealias PksecInsertListEntry = PksecInsertListEntryFn?

public fun interface PksecLocatePkgByIdFn {
    public operator fun invoke(packageid: UInt): COpaquePointer?
}

public typealias PksecLocatePkgById = PksecLocatePkgByIdFn?

public fun interface PksecReferenceListEntryFn {
    public operator fun invoke(entry: COpaquePointer?, signature: UInt, removenoref: Boolean): Ntstatus
}

public typealias PksecReferenceListEntry = PksecReferenceListEntryFn?

public fun interface PksecSerializeSchannelAuthDataFn {
    public operator fun invoke(pvauthdata: COpaquePointer?, size: COpaquePointer?, serializeddata: COpaquePointer?): Ntstatus
}

public typealias PksecSerializeSchannelAuthData = PksecSerializeSchannelAuthDataFn?

public fun interface PksecSerializeWinntAuthDataFn {
    public operator fun invoke(pvauthdata: COpaquePointer?, size: COpaquePointer?, serializeddata: COpaquePointer?): Ntstatus
}

public typealias PksecSerializeWinntAuthData = PksecSerializeWinntAuthDataFn?

public typealias Pku2uLogonSubmitType = Int

public fun interface PlsaAddCredentialFn {
    public operator fun invoke(logonid: COpaquePointer?, authenticationpackage: UInt, primarykeyvalue: COpaquePointer?, credentials: COpaquePointer?): Ntstatus
}

public typealias PlsaAddCredential = PlsaAddCredentialFn?

public fun interface PlsaAllocateClientBufferFn {
    public operator fun invoke(clientrequest: COpaquePointer?, lengthrequired: UInt, clientbaseaddress: COpaquePointer?): Ntstatus
}

public typealias PlsaAllocateClientBuffer = PlsaAllocateClientBufferFn?

public fun interface PlsaAllocateLsaHeapFn {
    public operator fun invoke(length: UInt): COpaquePointer?
}

public typealias PlsaAllocateLsaHeap = PlsaAllocateLsaHeapFn?

public fun interface PlsaAllocatePrivateHeapFn {
    public operator fun invoke(length: ULong): COpaquePointer?
}

public typealias PlsaAllocatePrivateHeap = PlsaAllocatePrivateHeapFn?

public fun interface PlsaAllocateSharedMemoryFn {
    public operator fun invoke(sharedmem: COpaquePointer?, size: UInt): COpaquePointer?
}

public typealias PlsaAllocateSharedMemory = PlsaAllocateSharedMemoryFn?

public fun interface PlsaApCallPackageFn {
    public operator fun invoke(clientrequest: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus
}

public typealias PlsaApCallPackage = PlsaApCallPackageFn?

public fun interface PlsaApCallPackagePassthroughFn {
    public operator fun invoke(clientrequest: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus
}

public typealias PlsaApCallPackagePassthrough = PlsaApCallPackagePassthroughFn?

public fun interface PlsaApInitializePackageFn {
    public operator fun invoke(authenticationpackageid: UInt, lsadispatchtable: COpaquePointer?, database: COpaquePointer?, confidentiality: COpaquePointer?, authenticationpackagename: COpaquePointer?): Ntstatus
}

public typealias PlsaApInitializePackage = PlsaApInitializePackageFn?

public fun interface PlsaApLogonTerminatedFn {
    public operator fun invoke(logonid: COpaquePointer?)
}

public typealias PlsaApLogonTerminated = PlsaApLogonTerminatedFn?

public fun interface PlsaApLogonUserFn {
    public operator fun invoke(clientrequest: COpaquePointer?, logontype: SecurityLogonType, authenticationinformation: COpaquePointer?, clientauthenticationbase: COpaquePointer?, authenticationinformationlength: UInt, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, substatus: COpaquePointer?, tokeninformationtype: COpaquePointer?, tokeninformation: COpaquePointer?, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?): Ntstatus
}

public typealias PlsaApLogonUser = PlsaApLogonUserFn?

public fun interface PlsaApLogonUserExFn {
    public operator fun invoke(clientrequest: COpaquePointer?, logontype: SecurityLogonType, authenticationinformation: COpaquePointer?, clientauthenticationbase: COpaquePointer?, authenticationinformationlength: UInt, profilebuffer: COpaquePointer?, profilebufferlength: COpaquePointer?, logonid: COpaquePointer?, substatus: COpaquePointer?, tokeninformationtype: COpaquePointer?, tokeninformation: COpaquePointer?, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?, machinename: COpaquePointer?): Ntstatus
}

public typealias PlsaApLogonUserEx = PlsaApLogonUserExFn?

public fun interface PlsaApLogonUserEx2Fn {
    public operator fun invoke(clientrequest: COpaquePointer?, logontype: SecurityLogonType, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbuffersize: UInt, profilebuffer: COpaquePointer?, profilebuffersize: COpaquePointer?, logonid: COpaquePointer?, substatus: COpaquePointer?, tokeninformationtype: COpaquePointer?, tokeninformation: COpaquePointer?, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?, machinename: COpaquePointer?, primarycredentials: COpaquePointer?, supplementalcredentials: COpaquePointer?): Ntstatus
}

public typealias PlsaApLogonUserEx2 = PlsaApLogonUserEx2Fn?

public fun interface PlsaApLogonUserEx3Fn {
    public operator fun invoke(clientrequest: COpaquePointer?, logontype: SecurityLogonType, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbuffersize: UInt, surrogatelogon: COpaquePointer?, profilebuffer: COpaquePointer?, profilebuffersize: COpaquePointer?, logonid: COpaquePointer?, substatus: COpaquePointer?, tokeninformationtype: COpaquePointer?, tokeninformation: COpaquePointer?, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?, machinename: COpaquePointer?, primarycredentials: COpaquePointer?, supplementalcredentials: COpaquePointer?): Ntstatus
}

public typealias PlsaApLogonUserEx3 = PlsaApLogonUserEx3Fn?

public fun interface PlsaApPostLogonUserSurrogateFn {
    public operator fun invoke(clientrequest: COpaquePointer?, logontype: SecurityLogonType, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbuffersize: UInt, surrogatelogon: COpaquePointer?, profilebuffer: COpaquePointer?, profilebuffersize: UInt, logonid: COpaquePointer?, status: Ntstatus, substatus: Ntstatus, tokeninformationtype: LsaTokenInformationType, tokeninformation: COpaquePointer?, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?, machinename: COpaquePointer?, primarycredentials: COpaquePointer?, supplementalcredentials: COpaquePointer?): Ntstatus
}

public typealias PlsaApPostLogonUserSurrogate = PlsaApPostLogonUserSurrogateFn?

public fun interface PlsaApPreLogonUserSurrogateFn {
    public operator fun invoke(clientrequest: COpaquePointer?, logontype: SecurityLogonType, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbuffersize: UInt, surrogatelogon: COpaquePointer?, substatus: COpaquePointer?): Ntstatus
}

public typealias PlsaApPreLogonUserSurrogate = PlsaApPreLogonUserSurrogateFn?

public fun interface PlsaAuditAccountLogonFn {
    public operator fun invoke(auditid: UInt, success: Boolean, source: COpaquePointer?, clientname: COpaquePointer?, mappedname: COpaquePointer?, status: Ntstatus): Ntstatus
}

public typealias PlsaAuditAccountLogon = PlsaAuditAccountLogonFn?

public fun interface PlsaAuditLogonFn {
    public operator fun invoke(status: Ntstatus, substatus: Ntstatus, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?, workstationname: COpaquePointer?, usersid: Psid, logontype: SecurityLogonType, tokensource: COpaquePointer?, logonid: COpaquePointer?)
}

public typealias PlsaAuditLogon = PlsaAuditLogonFn?

public fun interface PlsaAuditLogonExFn {
    public operator fun invoke(status: Ntstatus, substatus: Ntstatus, accountname: COpaquePointer?, authenticatingauthority: COpaquePointer?, workstationname: COpaquePointer?, usersid: Psid, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokensource: COpaquePointer?, logonid: COpaquePointer?)
}

public typealias PlsaAuditLogonEx = PlsaAuditLogonExFn?

public fun interface PlsaCallbackFunctionFn {
    public operator fun invoke(argument1: ULong, argument2: ULong, inputbuffer: COpaquePointer?, outputbuffer: COpaquePointer?): Ntstatus
}

public typealias PlsaCallbackFunction = PlsaCallbackFunctionFn?

public fun interface PlsaCallPackageFn {
    public operator fun invoke(authenticationpackage: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus
}

public typealias PlsaCallPackage = PlsaCallPackageFn?

public fun interface PlsaCallPackageexFn {
    public operator fun invoke(authenticationpackage: COpaquePointer?, clientbufferbase: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus
}

public typealias PlsaCallPackageex = PlsaCallPackageexFn?

public fun interface PlsaCallPackagePassthroughFn {
    public operator fun invoke(authenticationpackage: COpaquePointer?, clientbufferbase: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, submitbufferlength: UInt, protocolreturnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?, protocolstatus: COpaquePointer?): Ntstatus
}

public typealias PlsaCallPackagePassthrough = PlsaCallPackagePassthroughFn?

public fun interface PlsaCancelNotificationFn {
    public operator fun invoke(notifyhandle: Handle): Ntstatus
}

public typealias PlsaCancelNotification = PlsaCancelNotificationFn?

public fun interface PlsaCheckProtectedUserByTokenFn {
    public operator fun invoke(usertoken: Handle, protecteduser: COpaquePointer?): Ntstatus
}

public typealias PlsaCheckProtectedUserByToken = PlsaCheckProtectedUserByTokenFn?

public fun interface PlsaClientCallbackFn {
    public operator fun invoke(callback: Pcstr, argument1: ULong, argument2: ULong, input: COpaquePointer?, output: COpaquePointer?): Ntstatus
}

public typealias PlsaClientCallback = PlsaClientCallbackFn?

public fun interface PlsaCloseSamUserFn {
    public operator fun invoke(userhandle: COpaquePointer?): Ntstatus
}

public typealias PlsaCloseSamUser = PlsaCloseSamUserFn?

public fun interface PlsaConvertAuthDataToTokenFn {
    public operator fun invoke(userauthdata: COpaquePointer?, userauthdatasize: UInt, impersonationlevel: SecurityImpersonationLevel, tokensource: COpaquePointer?, logontype: SecurityLogonType, authorityname: COpaquePointer?, token: COpaquePointer?, logonid: COpaquePointer?, accountname: COpaquePointer?, substatus: COpaquePointer?): Ntstatus
}

public typealias PlsaConvertAuthDataToToken = PlsaConvertAuthDataToTokenFn?

public fun interface PlsaCopyFromClientBufferFn {
    public operator fun invoke(clientrequest: COpaquePointer?, length: UInt, buffertocopy: COpaquePointer?, clientbaseaddress: COpaquePointer?): Ntstatus
}

public typealias PlsaCopyFromClientBuffer = PlsaCopyFromClientBufferFn?

public fun interface PlsaCopyToClientBufferFn {
    public operator fun invoke(clientrequest: COpaquePointer?, length: UInt, clientbaseaddress: COpaquePointer?, buffertocopy: COpaquePointer?): Ntstatus
}

public typealias PlsaCopyToClientBuffer = PlsaCopyToClientBufferFn?

public fun interface PlsaCrackSingleNameFn {
    public operator fun invoke(formatoffered: UInt, performatgc: Boolean, nameinput: COpaquePointer?, prefix: COpaquePointer?, requestedformat: UInt, crackedname: COpaquePointer?, dnsdomainname: COpaquePointer?, substatus: COpaquePointer?): Ntstatus
}

public typealias PlsaCrackSingleName = PlsaCrackSingleNameFn?

public fun interface PlsaCreateLogonSessionFn {
    public operator fun invoke(logonid: COpaquePointer?): Ntstatus
}

public typealias PlsaCreateLogonSession = PlsaCreateLogonSessionFn?

public fun interface PlsaCreateSharedMemoryFn {
    public operator fun invoke(maxsize: UInt, initialsize: UInt): COpaquePointer?
}

public typealias PlsaCreateSharedMemory = PlsaCreateSharedMemoryFn?

public fun interface PlsaCreateThreadFn {
    public operator fun invoke(securityattributes: COpaquePointer?, stacksize: UInt, startfunction: LpthreadStartRoutine, threadparameter: COpaquePointer?, creationflags: UInt, threadid: COpaquePointer?): Handle
}

public typealias PlsaCreateThread = PlsaCreateThreadFn?

public fun interface PlsaCreateTokenFn {
    public operator fun invoke(logonid: COpaquePointer?, tokensource: COpaquePointer?, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokeninformationtype: LsaTokenInformationType, tokeninformation: COpaquePointer?, tokengroups: COpaquePointer?, accountname: COpaquePointer?, authorityname: COpaquePointer?, workstation: COpaquePointer?, profilepath: COpaquePointer?, token: COpaquePointer?, substatus: COpaquePointer?): Ntstatus
}

public typealias PlsaCreateToken = PlsaCreateTokenFn?

public fun interface PlsaCreateTokenExFn {
    public operator fun invoke(logonid: COpaquePointer?, tokensource: COpaquePointer?, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokeninformationtype: LsaTokenInformationType, tokeninformation: COpaquePointer?, tokengroups: COpaquePointer?, workstation: COpaquePointer?, profilepath: COpaquePointer?, sessioninformation: COpaquePointer?, sessioninformationtype: SecpkgSessioninfoType, token: COpaquePointer?, substatus: COpaquePointer?): Ntstatus
}

public typealias PlsaCreateTokenEx = PlsaCreateTokenExFn?

public fun interface PlsaDeleteCredentialFn {
    public operator fun invoke(logonid: COpaquePointer?, authenticationpackage: UInt, primarykeyvalue: COpaquePointer?): Ntstatus
}

public typealias PlsaDeleteCredential = PlsaDeleteCredentialFn?

public fun interface PlsaDeleteLogonSessionFn {
    public operator fun invoke(logonid: COpaquePointer?): Ntstatus
}

public typealias PlsaDeleteLogonSession = PlsaDeleteLogonSessionFn?

public fun interface PlsaDeleteSharedMemoryFn {
    public operator fun invoke(sharedmem: COpaquePointer?): Boolean
}

public typealias PlsaDeleteSharedMemory = PlsaDeleteSharedMemoryFn?

public fun interface PlsaDuplicateHandleFn {
    public operator fun invoke(sourcehandle: Handle, destionationhandle: COpaquePointer?): Ntstatus
}

public typealias PlsaDuplicateHandle = PlsaDuplicateHandleFn?

public fun interface PlsaExpandAuthDataForDomainFn {
    public operator fun invoke(userauthdata: COpaquePointer?, userauthdatasize: UInt, reserved: COpaquePointer?, expandedauthdata: COpaquePointer?, expandedauthdatasize: COpaquePointer?): Ntstatus
}

public typealias PlsaExpandAuthDataForDomain = PlsaExpandAuthDataForDomainFn?

public fun interface PlsaFreeClientBufferFn {
    public operator fun invoke(clientrequest: COpaquePointer?, clientbaseaddress: COpaquePointer?): Ntstatus
}

public typealias PlsaFreeClientBuffer = PlsaFreeClientBufferFn?

public fun interface PlsaFreeLsaHeapFn {
    public operator fun invoke(base: COpaquePointer?)
}

public typealias PlsaFreeLsaHeap = PlsaFreeLsaHeapFn?

public fun interface PlsaFreePrivateHeapFn {
    public operator fun invoke(base: COpaquePointer?)
}

public typealias PlsaFreePrivateHeap = PlsaFreePrivateHeapFn?

public fun interface PlsaFreeSharedMemoryFn {
    public operator fun invoke(sharedmem: COpaquePointer?, memory: COpaquePointer?)
}

public typealias PlsaFreeSharedMemory = PlsaFreeSharedMemoryFn?

public fun interface PlsaGetAppModeInfoFn {
    public operator fun invoke(userfunction: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?, userdata: COpaquePointer?, returntolsa: COpaquePointer?): Ntstatus
}

public typealias PlsaGetAppModeInfo = PlsaGetAppModeInfoFn?

public fun interface PlsaGetAuthDataForUserFn {
    public operator fun invoke(name: COpaquePointer?, nametype: SecpkgNameType, prefix: COpaquePointer?, userauthdata: COpaquePointer?, userauthdatasize: COpaquePointer?, userflatname: COpaquePointer?): Ntstatus
}

public typealias PlsaGetAuthDataForUser = PlsaGetAuthDataForUserFn?

public fun interface PlsaGetCallInfoFn {
    public operator fun invoke(info: COpaquePointer?): Boolean
}

public typealias PlsaGetCallInfo = PlsaGetCallInfoFn?

public fun interface PlsaGetClientInfoFn {
    public operator fun invoke(clientinfo: COpaquePointer?): Ntstatus
}

public typealias PlsaGetClientInfo = PlsaGetClientInfoFn?

public fun interface PlsaGetClientInfoExFn {
    public operator fun invoke(clientinfo: COpaquePointer?, structsize: UInt): Ntstatus
}

public typealias PlsaGetClientInfoEx = PlsaGetClientInfoExFn?

public fun interface PlsaGetCredentialsFn {
    public operator fun invoke(logonid: COpaquePointer?, authenticationpackage: UInt, querycontext: COpaquePointer?, retrieveallcredentials: Boolean, primarykeyvalue: COpaquePointer?, primarykeylength: COpaquePointer?, credentials: COpaquePointer?): Ntstatus
}

public typealias PlsaGetCredentials = PlsaGetCredentialsFn?

public fun interface PlsaGetExtendedCallFlagsFn {
    public operator fun invoke(flags: COpaquePointer?): Ntstatus
}

public typealias PlsaGetExtendedCallFlags = PlsaGetExtendedCallFlagsFn?

public fun interface PlsaGetServiceAccountPasswordFn {
    public operator fun invoke(accountname: COpaquePointer?, domainname: COpaquePointer?, credfetch: CredFetch, filetimeexpiry: COpaquePointer?, currentpassword: COpaquePointer?, previouspassword: COpaquePointer?, filetimecurrpwdvalidforoutbound: COpaquePointer?): Ntstatus
}

public typealias PlsaGetServiceAccountPassword = PlsaGetServiceAccountPasswordFn?

public fun interface PlsaGetUserAuthDataFn {
    public operator fun invoke(userhandle: COpaquePointer?, userauthdata: COpaquePointer?, userauthdatasize: COpaquePointer?): Ntstatus
}

public typealias PlsaGetUserAuthData = PlsaGetUserAuthDataFn?

public fun interface PlsaGetUserCredentialsFn {
    public operator fun invoke(userhandle: COpaquePointer?, primarycreds: COpaquePointer?, primarycredssize: COpaquePointer?, supplementalcreds: COpaquePointer?, supplementalcredssize: COpaquePointer?): Ntstatus
}

public typealias PlsaGetUserCredentials = PlsaGetUserCredentialsFn?

public fun interface PlsaImpersonateClientFn {
    public operator fun invoke(): Ntstatus
}

public typealias PlsaImpersonateClient = PlsaImpersonateClientFn?

public fun interface PlsaLocatePkgByIdFn {
    public operator fun invoke(packgeid: UInt): COpaquePointer?
}

public typealias PlsaLocatePkgById = PlsaLocatePkgByIdFn?

public fun interface PlsaMapBufferFn {
    public operator fun invoke(inputbuffer: COpaquePointer?, outputbuffer: COpaquePointer?): Ntstatus
}

public typealias PlsaMapBuffer = PlsaMapBufferFn?

public fun interface PlsaOpenSamUserFn {
    public operator fun invoke(name: COpaquePointer?, nametype: SecpkgNameType, prefix: COpaquePointer?, allowguest: Boolean, reserved: UInt, userhandle: COpaquePointer?): Ntstatus
}

public typealias PlsaOpenSamUser = PlsaOpenSamUserFn?

public fun interface PlsaOpenTokenByLogonIdFn {
    public operator fun invoke(logonid: COpaquePointer?, rettokenhandle: COpaquePointer?): Ntstatus
}

public typealias PlsaOpenTokenByLogonId = PlsaOpenTokenByLogonIdFn?

public fun interface PlsaProtectMemoryFn {
    public operator fun invoke(buffer: COpaquePointer?, buffersize: UInt)
}

public typealias PlsaProtectMemory = PlsaProtectMemoryFn?

public fun interface PlsaQueryClientRequestFn {
    public operator fun invoke(clientrequest: COpaquePointer?, querytype: UInt, replybuffer: COpaquePointer?): Ntstatus
}

public typealias PlsaQueryClientRequest = PlsaQueryClientRequestFn?

public fun interface PlsaRedirectedLogonCallbackFn {
    public operator fun invoke(redirectedlogonhandle: Handle, buffer: COpaquePointer?, bufferlength: UInt, returnbuffer: COpaquePointer?, returnbufferlength: COpaquePointer?): Ntstatus
}

public typealias PlsaRedirectedLogonCallback = PlsaRedirectedLogonCallbackFn?

public fun interface PlsaRedirectedLogonCleanupCallbackFn {
    public operator fun invoke(redirectedlogonhandle: Handle)
}

public typealias PlsaRedirectedLogonCleanupCallback = PlsaRedirectedLogonCleanupCallbackFn?

public fun interface PlsaRedirectedLogonGetLogonCredsFn {
    public operator fun invoke(redirectedlogonhandle: Handle, logonbuffer: COpaquePointer?, logonbufferlength: COpaquePointer?): Ntstatus
}

public typealias PlsaRedirectedLogonGetLogonCreds = PlsaRedirectedLogonGetLogonCredsFn?

public fun interface PlsaRedirectedLogonGetSidFn {
    public operator fun invoke(redirectedlogonhandle: Handle, sid: COpaquePointer?): Ntstatus
}

public typealias PlsaRedirectedLogonGetSid = PlsaRedirectedLogonGetSidFn?

public fun interface PlsaRedirectedLogonGetSuppCredsFn {
    public operator fun invoke(redirectedlogonhandle: Handle, supplementalcredentials: COpaquePointer?): Ntstatus
}

public typealias PlsaRedirectedLogonGetSuppCreds = PlsaRedirectedLogonGetSuppCredsFn?

public fun interface PlsaRedirectedLogonInitFn {
    public operator fun invoke(redirectedlogonhandle: Handle, packagename: COpaquePointer?, sessionid: UInt, logonid: COpaquePointer?): Ntstatus
}

public typealias PlsaRedirectedLogonInit = PlsaRedirectedLogonInitFn?

public fun interface PlsaRegisterCallbackFn {
    public operator fun invoke(callbackid: UInt, callback: PlsaCallbackFunction): Ntstatus
}

public typealias PlsaRegisterCallback = PlsaRegisterCallbackFn?

public fun interface PlsaRegisterNotificationFn {
    public operator fun invoke(startfunction: LpthreadStartRoutine, parameter: COpaquePointer?, notificationtype: UInt, notificationclass: UInt, notificationflags: UInt, intervalminutes: UInt, waitevent: Handle): Handle
}

public typealias PlsaRegisterNotification = PlsaRegisterNotificationFn?

public fun interface PlsaSaveSupplementalCredentialsFn {
    public operator fun invoke(logonid: COpaquePointer?, supplementalcredsize: UInt, supplementalcreds: COpaquePointer?, synchronous: Boolean): Ntstatus
}

public typealias PlsaSaveSupplementalCredentials = PlsaSaveSupplementalCredentialsFn?

public fun interface PlsaSetAppModeInfoFn {
    public operator fun invoke(userfunction: UInt, argument1: ULong, argument2: ULong, userdata: COpaquePointer?, returntolsa: Boolean): Ntstatus
}

public typealias PlsaSetAppModeInfo = PlsaSetAppModeInfoFn?

public fun interface PlsaUnloadPackageFn {
    public operator fun invoke(): Ntstatus
}

public typealias PlsaUnloadPackage = PlsaUnloadPackageFn?

public fun interface PlsaUpdatePrimaryCredentialsFn {
    public operator fun invoke(primarycredentials: COpaquePointer?, credentials: COpaquePointer?): Ntstatus
}

public typealias PlsaUpdatePrimaryCredentials = PlsaUpdatePrimaryCredentialsFn?

public typealias PolicyAuditEventType = Int

public typealias PolicyDomainInformationClass = Int

public typealias PolicyInformationClass = Int

public typealias PolicyLsaServerRole = Int

public typealias PolicyNotificationInformationClass = Int

public fun interface PsamCredentialUpdateFreeRoutineFn {
    public operator fun invoke(p: COpaquePointer?)
}

public typealias PsamCredentialUpdateFreeRoutine = PsamCredentialUpdateFreeRoutineFn?

public fun interface PsamCredentialUpdateNotifyRoutineFn {
    public operator fun invoke(clearpassword: COpaquePointer?, oldcredentials: COpaquePointer?, oldcredentialsize: UInt, useraccountcontrol: UInt, upn: COpaquePointer?, username: COpaquePointer?, netbiosdomainname: COpaquePointer?, dnsdomainname: COpaquePointer?, newcredentials: COpaquePointer?, newcredentialsize: COpaquePointer?): Ntstatus
}

public typealias PsamCredentialUpdateNotifyRoutine = PsamCredentialUpdateNotifyRoutineFn?

public fun interface PsamCredentialUpdateRegisterMappedEntrypointsRoutineFn {
    public operator fun invoke(table: COpaquePointer?): Ntstatus
}

public typealias PsamCredentialUpdateRegisterMappedEntrypointsRoutine = PsamCredentialUpdateRegisterMappedEntrypointsRoutineFn?

public fun interface PsamCredentialUpdateRegisterRoutineFn {
    public operator fun invoke(credentialname: COpaquePointer?): Boolean
}

public typealias PsamCredentialUpdateRegisterRoutine = PsamCredentialUpdateRegisterRoutineFn?

public fun interface PsamInitNotificationRoutineFn {
    public operator fun invoke(): Boolean
}

public typealias PsamInitNotificationRoutine = PsamInitNotificationRoutineFn?

public fun interface PsamPasswordFilterRoutineFn {
    public operator fun invoke(accountname: COpaquePointer?, fullname: COpaquePointer?, password: COpaquePointer?, setoperation: Boolean): Boolean
}

public typealias PsamPasswordFilterRoutine = PsamPasswordFilterRoutineFn?

public fun interface PsamPasswordNotificationRoutineFn {
    public operator fun invoke(username: COpaquePointer?, relativeid: UInt, newpassword: COpaquePointer?): Ntstatus
}

public typealias PsamPasswordNotificationRoutine = PsamPasswordNotificationRoutineFn?

public fun interface QueryContextAttributesExFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias QueryContextAttributesExFnA = QueryContextAttributesExFnAFn?

public fun interface QueryContextAttributesExFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias QueryContextAttributesExFnW = QueryContextAttributesExFnWFn?

public fun interface QueryContextAttributesFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): Hresult
}

public typealias QueryContextAttributesFnA = QueryContextAttributesFnAFn?

public fun interface QueryContextAttributesFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): Hresult
}

public typealias QueryContextAttributesFnW = QueryContextAttributesFnWFn?

public fun interface QueryCredentialsAttributesExFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias QueryCredentialsAttributesExFnA = QueryCredentialsAttributesExFnAFn?

public fun interface QueryCredentialsAttributesExFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias QueryCredentialsAttributesExFnW = QueryCredentialsAttributesExFnWFn?

public fun interface QueryCredentialsAttributesFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): Hresult
}

public typealias QueryCredentialsAttributesFnA = QueryCredentialsAttributesFnAFn?

public fun interface QueryCredentialsAttributesFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): Hresult
}

public typealias QueryCredentialsAttributesFnW = QueryCredentialsAttributesFnWFn?

public fun interface QuerySecurityContextTokenFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias QuerySecurityContextTokenFn = QuerySecurityContextTokenFnFn?

public fun interface QuerySecurityPackageInfoFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias QuerySecurityPackageInfoFnA = QuerySecurityPackageInfoFnAFn?

public fun interface QuerySecurityPackageInfoFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?): Hresult
}

public typealias QuerySecurityPackageInfoFnW = QuerySecurityPackageInfoFnWFn?

public fun interface RevertSecurityContextFnFn {
    public operator fun invoke(param0: COpaquePointer?): Hresult
}

public typealias RevertSecurityContextFn = RevertSecurityContextFnFn?

public typealias SaslAuthzidState = Int

public typealias SchannelAlertTokenAlertType = UInt

public typealias SchannelCredFlags = UInt

public typealias SchannelSessionTokenFlags = UInt

public typealias SecpkgAttr = UInt

public typealias SecpkgAttrLctStatus = Int

public typealias SecpkgCallPackageMessageType = Int

public typealias SecpkgCred = UInt

public typealias SecpkgCredClass = Int

public typealias SecpkgExtendedInformationClass = Int

public typealias SecpkgNameType = Int

public typealias SecpkgPackageChangeType = UInt

public typealias SecpkgSessioninfoType = Int

public typealias SecurityPackageOptionsType = UInt

public typealias SecApplicationProtocolNegotiationExt = Int

public typealias SecApplicationProtocolNegotiationStatus = Int

public fun interface SecGetKeyFnFn {
    public operator fun invoke(arg: COpaquePointer?, principal: COpaquePointer?, keyver: UInt, key: COpaquePointer?, status: COpaquePointer?)
}

public typealias SecGetKeyFn = SecGetKeyFnFn?

public typealias SecTrafficSecretType = Int

public fun interface SetContextAttributesFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias SetContextAttributesFnA = SetContextAttributesFnAFn?

public fun interface SetContextAttributesFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias SetContextAttributesFnW = SetContextAttributesFnWFn?

public fun interface SetCredentialsAttributesFnAFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias SetCredentialsAttributesFnA = SetCredentialsAttributesFnAFn?

public fun interface SetCredentialsAttributesFnWFn {
    public operator fun invoke(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?, param3: UInt): Hresult
}

public typealias SetCredentialsAttributesFnW = SetCredentialsAttributesFnWFn?

public typealias SeAdtParameterType = Int

public typealias Sldatatype = UInt

public typealias Slidtype = Int

public typealias Sllicensingstatus = Int

public typealias Slreferraltype = Int

public typealias SlActivationType = Int

public typealias SlGenuineState = Int

public fun interface SslCrackCertificateFnFn {
    public operator fun invoke(pbcertificate: COpaquePointer?, cbcertificate: UInt, verifysignature: Bool, ppcertificate: COpaquePointer?): Bool
}

public typealias SslCrackCertificateFn = SslCrackCertificateFnFn?

public fun interface SslEmptyCacheFnAFn {
    public operator fun invoke(psztargetname: Pcstr, dwflags: UInt): Bool
}

public typealias SslEmptyCacheFnA = SslEmptyCacheFnAFn?

public fun interface SslEmptyCacheFnWFn {
    public operator fun invoke(psztargetname: Pcwstr, dwflags: UInt): Bool
}

public typealias SslEmptyCacheFnW = SslEmptyCacheFnWFn?

public fun interface SslFreeCertificateFnFn {
    public operator fun invoke(pcertificate: COpaquePointer?)
}

public typealias SslFreeCertificateFn = SslFreeCertificateFnFn?

public typealias SchGetExtensionsOptions = Int

public typealias SecDelegationType = Int

public fun interface SpAcceptCredentialsFnFn {
    public operator fun invoke(logontype: SecurityLogonType, accountname: COpaquePointer?, primarycredentials: COpaquePointer?, supplementalcredentials: COpaquePointer?): Ntstatus
}

public typealias SpAcceptCredentialsFn = SpAcceptCredentialsFnFn?

public fun interface SpAcceptLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, inputbuffer: COpaquePointer?, contextrequirements: UInt, targetdatarep: UInt, newcontexthandle: COpaquePointer?, outputbuffer: COpaquePointer?, contextattributes: COpaquePointer?, expirationtime: COpaquePointer?, mappedcontext: COpaquePointer?, contextdata: COpaquePointer?): Ntstatus
}

public typealias SpAcceptLsaModeContextFn = SpAcceptLsaModeContextFnFn?

public fun interface SpAcquireCredentialsHandleFnFn {
    public operator fun invoke(principalname: COpaquePointer?, credentialuseflags: UInt, logonid: COpaquePointer?, authorizationdata: COpaquePointer?, getkeyfunciton: COpaquePointer?, getkeyargument: COpaquePointer?, credentialhandle: COpaquePointer?, expirationtime: COpaquePointer?): Ntstatus
}

public typealias SpAcquireCredentialsHandleFn = SpAcquireCredentialsHandleFnFn?

public fun interface SpAddCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, principalname: COpaquePointer?, pkg: COpaquePointer?, credentialuseflags: UInt, authorizationdata: COpaquePointer?, getkeyfunciton: COpaquePointer?, getkeyargument: COpaquePointer?, expirationtime: COpaquePointer?): Ntstatus
}

public typealias SpAddCredentialsFn = SpAddCredentialsFnFn?

public fun interface SpApplyControlTokenFnFn {
    public operator fun invoke(contexthandle: ULong, controltoken: COpaquePointer?): Ntstatus
}

public typealias SpApplyControlTokenFn = SpApplyControlTokenFnFn?

public fun interface SpChangeAccountPasswordFnFn {
    public operator fun invoke(pdomainname: COpaquePointer?, paccountname: COpaquePointer?, poldpassword: COpaquePointer?, pnewpassword: COpaquePointer?, impersonating: Boolean, poutput: COpaquePointer?): Ntstatus
}

public typealias SpChangeAccountPasswordFn = SpChangeAccountPasswordFnFn?

public fun interface SpCompleteAuthTokenFnFn {
    public operator fun invoke(contexthandle: ULong, inputbuffer: COpaquePointer?): Ntstatus
}

public typealias SpCompleteAuthTokenFn = SpCompleteAuthTokenFnFn?

public fun interface SpDeleteContextFnFn {
    public operator fun invoke(contexthandle: ULong): Ntstatus
}

public typealias SpDeleteContextFn = SpDeleteContextFnFn?

public fun interface SpDeleteCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, key: COpaquePointer?): Ntstatus
}

public typealias SpDeleteCredentialsFn = SpDeleteCredentialsFnFn?

public fun interface SpExchangeMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: COpaquePointer?, contextrequirements: UInt, metadatalength: UInt, metadata: COpaquePointer?, contexthandle: COpaquePointer?): Ntstatus
}

public typealias SpExchangeMetaDataFn = SpExchangeMetaDataFnFn?

public fun interface SpExportSecurityContextFnFn {
    public operator fun invoke(phcontext: ULong, fflags: UInt, ppackedcontext: COpaquePointer?, ptoken: COpaquePointer?): Ntstatus
}

public typealias SpExportSecurityContextFn = SpExportSecurityContextFnFn?

public fun interface SpExtractTargetInfoFnFn {
    public operator fun invoke(clientrequest: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbufferlength: UInt, ppvtargetinfo: COpaquePointer?, pcbtargetinfo: COpaquePointer?): Ntstatus
}

public typealias SpExtractTargetInfoFn = SpExtractTargetInfoFnFn?

public fun interface SpFormatCredentialsFnFn {
    public operator fun invoke(credentials: COpaquePointer?, formattedcredentials: COpaquePointer?): Ntstatus
}

public typealias SpFormatCredentialsFn = SpFormatCredentialsFnFn?

public fun interface SpFreeCredentialsHandleFnFn {
    public operator fun invoke(credentialhandle: ULong): Ntstatus
}

public typealias SpFreeCredentialsHandleFn = SpFreeCredentialsHandleFnFn?

public fun interface SpGetContextTokenFnFn {
    public operator fun invoke(contexthandle: ULong, impersonationtoken: COpaquePointer?): Ntstatus
}

public typealias SpGetContextTokenFn = SpGetContextTokenFnFn?

public fun interface SpGetCredUIContextFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: COpaquePointer?, flatcreduicontextlength: COpaquePointer?, flatcreduicontext: COpaquePointer?): Ntstatus
}

public typealias SpGetCredUIContextFn = SpGetCredUIContextFnFn?

public fun interface SpGetCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: COpaquePointer?): Ntstatus
}

public typealias SpGetCredentialsFn = SpGetCredentialsFnFn?

public fun interface SpGetExtendedInformationFnFn {
    public operator fun invoke(cls: SecpkgExtendedInformationClass, ppinformation: COpaquePointer?): Ntstatus
}

public typealias SpGetExtendedInformationFn = SpGetExtendedInformationFnFn?

public fun interface SpGetInfoFnFn {
    public operator fun invoke(packageinfo: COpaquePointer?): Ntstatus
}

public typealias SpGetInfoFn = SpGetInfoFnFn?

public fun interface SpGetRemoteCredGuardLogonBufferFnFn {
    public operator fun invoke(credhandle: ULong, contexthandle: ULong, targetname: COpaquePointer?, redirectedlogonhandle: COpaquePointer?, callback: COpaquePointer?, cleanupcallback: COpaquePointer?, logonbuffersize: COpaquePointer?, logonbuffer: COpaquePointer?): Ntstatus
}

public typealias SpGetRemoteCredGuardLogonBufferFn = SpGetRemoteCredGuardLogonBufferFnFn?

public fun interface SpGetRemoteCredGuardSupplementalCredsFnFn {
    public operator fun invoke(credhandle: ULong, targetname: COpaquePointer?, redirectedlogonhandle: COpaquePointer?, callback: COpaquePointer?, cleanupcallback: COpaquePointer?, supplementalcredssize: COpaquePointer?, supplementalcreds: COpaquePointer?): Ntstatus
}

public typealias SpGetRemoteCredGuardSupplementalCredsFn = SpGetRemoteCredGuardSupplementalCredsFnFn?

public fun interface SpGetTbalSupplementalCredsFnFn {
    public operator fun invoke(logonid: Luid, supplementalcredssize: COpaquePointer?, supplementalcreds: COpaquePointer?): Ntstatus
}

public typealias SpGetTbalSupplementalCredsFn = SpGetTbalSupplementalCredsFnFn?

public fun interface SpGetUserInfoFnFn {
    public operator fun invoke(logonid: COpaquePointer?, flags: UInt, userdata: COpaquePointer?): Ntstatus
}

public typealias SpGetUserInfoFn = SpGetUserInfoFnFn?

public fun interface SpImportSecurityContextFnFn {
    public operator fun invoke(ppackedcontext: COpaquePointer?, token: Handle, phcontext: COpaquePointer?): Ntstatus
}

public typealias SpImportSecurityContextFn = SpImportSecurityContextFnFn?

public fun interface SpInitLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, targetname: COpaquePointer?, contextrequirements: UInt, targetdatarep: UInt, inputbuffers: COpaquePointer?, newcontexthandle: COpaquePointer?, outputbuffers: COpaquePointer?, contextattributes: COpaquePointer?, expirationtime: COpaquePointer?, mappedcontext: COpaquePointer?, contextdata: COpaquePointer?): Ntstatus
}

public typealias SpInitLsaModeContextFn = SpInitLsaModeContextFnFn?

public fun interface SpInitUserModeContextFnFn {
    public operator fun invoke(contexthandle: ULong, packedcontext: COpaquePointer?): Ntstatus
}

public typealias SpInitUserModeContextFn = SpInitUserModeContextFnFn?

public fun interface SpInitializeFnFn {
    public operator fun invoke(packageid: ULong, parameters: COpaquePointer?, functiontable: COpaquePointer?): Ntstatus
}

public typealias SpInitializeFn = SpInitializeFnFn?

public fun interface SpInstanceInitFnFn {
    public operator fun invoke(version: UInt, functiontable: COpaquePointer?, userfunctions: COpaquePointer?): Ntstatus
}

public typealias SpInstanceInitFn = SpInstanceInitFnFn?

public fun interface SpLsaModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: COpaquePointer?, pptables: COpaquePointer?, pctables: COpaquePointer?): Ntstatus
}

public typealias SpLsaModeInitializeFn = SpLsaModeInitializeFnFn?

public fun interface SpMakeSignatureFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: COpaquePointer?, messagesequencenumber: UInt): Ntstatus
}

public typealias SpMakeSignatureFn = SpMakeSignatureFnFn?

public fun interface SpMarshalAttributeDataFnFn {
    public operator fun invoke(attributeinfo: UInt, attribute: UInt, attributedatasize: UInt, attributedata: COpaquePointer?, marshaledattributedatasize: COpaquePointer?, marshaledattributedata: COpaquePointer?): Ntstatus
}

public typealias SpMarshalAttributeDataFn = SpMarshalAttributeDataFnFn?

public fun interface SpMarshallSupplementalCredsFnFn {
    public operator fun invoke(credentialsize: UInt, credentials: COpaquePointer?, marshalledcredsize: COpaquePointer?, marshalledcreds: COpaquePointer?): Ntstatus
}

public typealias SpMarshallSupplementalCredsFn = SpMarshallSupplementalCredsFnFn?

public fun interface SpQueryContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: COpaquePointer?): Ntstatus
}

public typealias SpQueryContextAttributesFn = SpQueryContextAttributesFnFn?

public fun interface SpQueryCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: COpaquePointer?): Ntstatus
}

public typealias SpQueryCredentialsAttributesFn = SpQueryCredentialsAttributesFnFn?

public fun interface SpQueryMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: COpaquePointer?, contextrequirements: UInt, metadatalength: COpaquePointer?, metadata: COpaquePointer?, contexthandle: COpaquePointer?): Ntstatus
}

public typealias SpQueryMetaDataFn = SpQueryMetaDataFnFn?

public fun interface SpSaveCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: COpaquePointer?): Ntstatus
}

public typealias SpSaveCredentialsFn = SpSaveCredentialsFnFn?

public fun interface SpSealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: COpaquePointer?, messagesequencenumber: UInt): Ntstatus
}

public typealias SpSealMessageFn = SpSealMessageFnFn?

public fun interface SpSetContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: COpaquePointer?, buffersize: UInt): Ntstatus
}

public typealias SpSetContextAttributesFn = SpSetContextAttributesFnFn?

public fun interface SpSetCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: COpaquePointer?, buffersize: UInt): Ntstatus
}

public typealias SpSetCredentialsAttributesFn = SpSetCredentialsAttributesFnFn?

public fun interface SpSetExtendedInformationFnFn {
    public operator fun invoke(cls: SecpkgExtendedInformationClass, info: COpaquePointer?): Ntstatus
}

public typealias SpSetExtendedInformationFn = SpSetExtendedInformationFnFn?

public fun interface SpShutdownFnFn {
    public operator fun invoke(): Ntstatus
}

public typealias SpShutdownFn = SpShutdownFnFn?

public fun interface SpUnsealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: COpaquePointer?, messagesequencenumber: UInt, qualityofprotection: COpaquePointer?): Ntstatus
}

public typealias SpUnsealMessageFn = SpUnsealMessageFnFn?

public fun interface SpUpdateCredentialsFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: COpaquePointer?, flatcreduicontextlength: UInt, flatcreduicontext: COpaquePointer?): Ntstatus
}

public typealias SpUpdateCredentialsFn = SpUpdateCredentialsFnFn?

public fun interface SpUserModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: COpaquePointer?, pptables: COpaquePointer?, pctables: COpaquePointer?): Ntstatus
}

public typealias SpUserModeInitializeFn = SpUserModeInitializeFnFn?

public fun interface SpValidateTargetInfoFnFn {
    public operator fun invoke(clientrequest: COpaquePointer?, protocolsubmitbuffer: COpaquePointer?, clientbufferbase: COpaquePointer?, submitbufferlength: UInt, targetinfo: COpaquePointer?): Ntstatus
}

public typealias SpValidateTargetInfoFn = SpValidateTargetInfoFnFn?

public fun interface SpVerifySignatureFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: COpaquePointer?, messagesequencenumber: UInt, qualityofprotection: COpaquePointer?): Ntstatus
}

public typealias SpVerifySignatureFn = SpVerifySignatureFnFn?

public fun interface SslDeserializeCertificateStoreFnFn {
    public operator fun invoke(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: COpaquePointer?): Hresult
}

public typealias SslDeserializeCertificateStoreFn = SslDeserializeCertificateStoreFnFn?

public fun interface SslGetExtensionsFnFn {
    public operator fun invoke(clienthello: COpaquePointer?, clienthellobytesize: UInt, genericextensions: COpaquePointer?, genericextensionscount: UByte, bytestoread: COpaquePointer?, flags: SchGetExtensionsOptions): Hresult
}

public typealias SslGetExtensionsFn = SslGetExtensionsFnFn?

public fun interface SslGetServerIdentityFnFn {
    public operator fun invoke(clienthello: COpaquePointer?, clienthellosize: UInt, serveridentity: COpaquePointer?, serveridentitysize: COpaquePointer?, flags: UInt): Hresult
}

public typealias SslGetServerIdentityFn = SslGetServerIdentityFnFn?

public typealias TokenbindingExtensionFormat = Int

public typealias TokenbindingKeyParametersType = Int

public typealias TokenbindingType = Int

public typealias TrustedDomainTrustAttributes = UInt

public typealias TrustedDomainTrustDirection = UInt

public typealias TrustedDomainTrustType = UInt

public typealias TrustedInformationClass = Int

public fun interface VerifySignatureFnFn {
    public operator fun invoke(param0: COpaquePointer?, param1: COpaquePointer?, param2: UInt, param3: COpaquePointer?): Hresult
}

public typealias VerifySignatureFn = VerifySignatureFnFn?

public typealias Hmapper = Long

public typealias ETlsAlgorithmUsage = Int

public typealias ETlsHashAlgorithm = Int

public typealias ETlsSignatureAlgorithm = Int
