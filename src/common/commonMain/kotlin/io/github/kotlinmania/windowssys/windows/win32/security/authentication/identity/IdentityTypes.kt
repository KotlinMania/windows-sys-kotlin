package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenSource
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.CredentialTargetInformationw
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.SecHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine

public fun interface AcceptSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecHandle>, param2: MutPtr<SecBufferDesc>, param3: UInt, param4: UInt, param5: MutPtr<SecHandle>, param6: MutPtr<SecBufferDesc>, param7: MutPtr<UInt>, param8: MutPtr<Long>): Hresult
}

public typealias AcceptSecurityContextFn = AcceptSecurityContextFnFn?

public fun interface AcquireCredentialsHandleFnAFn {
    public operator fun invoke(param0: MutPtr<Byte>, param1: MutPtr<Byte>, param2: UInt, param3: MutPtr<CVoid>, param4: MutPtr<CVoid>, param5: SecGetKeyFn, param6: MutPtr<CVoid>, param7: MutPtr<SecHandle>, param8: MutPtr<Long>): Hresult
}

public typealias AcquireCredentialsHandleFnA = AcquireCredentialsHandleFnAFn?

public fun interface AcquireCredentialsHandleFnWFn {
    public operator fun invoke(param0: MutPtr<UShort>, param1: MutPtr<UShort>, param2: UInt, param3: MutPtr<CVoid>, param4: MutPtr<CVoid>, param5: SecGetKeyFn, param6: MutPtr<CVoid>, param7: MutPtr<SecHandle>, param8: MutPtr<Long>): Hresult
}

public typealias AcquireCredentialsHandleFnW = AcquireCredentialsHandleFnWFn?

public fun interface AddCredentialsFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<Byte>, param2: MutPtr<Byte>, param3: UInt, param4: MutPtr<CVoid>, param5: SecGetKeyFn, param6: MutPtr<CVoid>, param7: MutPtr<Long>): Hresult
}

public typealias AddCredentialsFnA = AddCredentialsFnAFn?

public fun interface AddCredentialsFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<UShort>, param2: MutPtr<UShort>, param3: UInt, param4: MutPtr<CVoid>, param5: SecGetKeyFn, param6: MutPtr<CVoid>, param7: MutPtr<Long>): Hresult
}

public typealias AddCredentialsFnW = AddCredentialsFnWFn?

public fun interface ApplyControlTokenFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecBufferDesc>): Hresult
}

public typealias ApplyControlTokenFn = ApplyControlTokenFnFn?

public typealias AscReqFlags = UInt

public typealias AscReqHighFlags = ULong

public fun interface ChangePasswordFnAFn {
    public operator fun invoke(param0: MutPtr<Byte>, param1: MutPtr<Byte>, param2: MutPtr<Byte>, param3: MutPtr<Byte>, param4: MutPtr<Byte>, param5: Boolean, param6: UInt, param7: MutPtr<SecBufferDesc>): Hresult
}

public typealias ChangePasswordFnA = ChangePasswordFnAFn?

public fun interface ChangePasswordFnWFn {
    public operator fun invoke(param0: MutPtr<UShort>, param1: MutPtr<UShort>, param2: MutPtr<UShort>, param3: MutPtr<UShort>, param4: MutPtr<UShort>, param5: Boolean, param6: UInt, param7: MutPtr<SecBufferDesc>): Hresult
}

public typealias ChangePasswordFnW = ChangePasswordFnWFn?

public fun interface CompleteAuthTokenFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecBufferDesc>): Hresult
}

public typealias CompleteAuthTokenFn = CompleteAuthTokenFnFn?

public typealias CredFetch = Int

public fun interface CredFreeCredentialsFnFn {
    public operator fun invoke(count: UInt, credentials: MutPtr<MutPtr<EncryptedCredentialw>>)
}

public typealias CredFreeCredentialsFn = CredFreeCredentialsFnFn?

public fun interface CredReadDomainCredentialsFnFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, credflags: UInt, targetinfo: ConstPtr<CredentialTargetInformationw>, flags: UInt, count: MutPtr<UInt>, credential: MutPtr<MutPtr<MutPtr<EncryptedCredentialw>>>): Ntstatus
}

public typealias CredReadDomainCredentialsFn = CredReadDomainCredentialsFnFn?

public fun interface CredReadFnFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, credflags: UInt, targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr<MutPtr<EncryptedCredentialw>>): Ntstatus
}

public typealias CredReadFn = CredReadFnFn?

public fun interface CredWriteFnFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, credflags: UInt, credential: ConstPtr<EncryptedCredentialw>, flags: UInt): Ntstatus
}

public typealias CredWriteFn = CredWriteFnFn?

public fun interface CrediUnmarshalandDecodeStringFnFn {
    public operator fun invoke(marshaledstring: Pcwstr, blob: MutPtr<MutPtr<UByte>>, blobsize: MutPtr<UInt>, isfailurefatal: MutPtr<UByte>): Ntstatus
}

public typealias CrediUnmarshalandDecodeStringFn = CrediUnmarshalandDecodeStringFnFn?

public fun interface DecryptMessageFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecBufferDesc>, param2: UInt, param3: MutPtr<UInt>): Hresult
}

public typealias DecryptMessageFn = DecryptMessageFnFn?

public fun interface DeleteSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>): Hresult
}

public typealias DeleteSecurityContextFn = DeleteSecurityContextFnFn?

public typealias DomainPasswordProperties = UInt

public fun interface EncryptMessageFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<SecBufferDesc>, param3: UInt): Hresult
}

public typealias EncryptMessageFn = EncryptMessageFnFn?

public fun interface EnumerateSecurityPackagesFnAFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: MutPtr<MutPtr<SecPkgInfoA>>): Hresult
}

public typealias EnumerateSecurityPackagesFnA = EnumerateSecurityPackagesFnAFn?

public fun interface EnumerateSecurityPackagesFnWFn {
    public operator fun invoke(param0: MutPtr<UInt>, param1: MutPtr<MutPtr<SecPkgInfoW>>): Hresult
}

public typealias EnumerateSecurityPackagesFnW = EnumerateSecurityPackagesFnWFn?

public typealias ExportSecurityContextFlags = UInt

public fun interface ExportSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<SecBuffer>, param3: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias ExportSecurityContextFn = ExportSecurityContextFnFn?

public typealias ExtendedNameFormat = Int

public fun interface FreeContextBufferFnFn {
    public operator fun invoke(param0: MutPtr<CVoid>): Hresult
}

public typealias FreeContextBufferFn = FreeContextBufferFnFn?

public fun interface FreeCredentialsHandleFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>): Hresult
}

public typealias FreeCredentialsHandleFn = FreeCredentialsHandleFnFn?

public fun interface ImpersonateSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>): Hresult
}

public typealias ImpersonateSecurityContextFn = ImpersonateSecurityContextFnFn?

public fun interface ImportSecurityContextFnAFn {
    public operator fun invoke(param0: MutPtr<Byte>, param1: MutPtr<SecBuffer>, param2: MutPtr<CVoid>, param3: MutPtr<SecHandle>): Hresult
}

public typealias ImportSecurityContextFnA = ImportSecurityContextFnAFn?

public fun interface ImportSecurityContextFnWFn {
    public operator fun invoke(param0: MutPtr<UShort>, param1: MutPtr<SecBuffer>, param2: MutPtr<CVoid>, param3: MutPtr<SecHandle>): Hresult
}

public typealias ImportSecurityContextFnW = ImportSecurityContextFnWFn?

public fun interface InitializeSecurityContextFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecHandle>, param2: MutPtr<Byte>, param3: UInt, param4: UInt, param5: UInt, param6: MutPtr<SecBufferDesc>, param7: UInt, param8: MutPtr<SecHandle>, param9: MutPtr<SecBufferDesc>, param10: MutPtr<UInt>, param11: MutPtr<Long>): Hresult
}

public typealias InitializeSecurityContextFnA = InitializeSecurityContextFnAFn?

public fun interface InitializeSecurityContextFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecHandle>, param2: MutPtr<UShort>, param3: UInt, param4: UInt, param5: UInt, param6: MutPtr<SecBufferDesc>, param7: UInt, param8: MutPtr<SecHandle>, param9: MutPtr<SecBufferDesc>, param10: MutPtr<UInt>, param11: MutPtr<Long>): Hresult
}

public typealias InitializeSecurityContextFnW = InitializeSecurityContextFnWFn?

public fun interface InitSecurityInterfaceAFn {
    public operator fun invoke(): MutPtr<SecurityFunctionTableA>
}

public typealias InitSecurityInterfaceA = InitSecurityInterfaceAFn?

public fun interface InitSecurityInterfaceWFn {
    public operator fun invoke(): MutPtr<SecurityFunctionTableW>
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
    public operator fun invoke(contextid: ULong, token: ConstPtr<SecBufferDesc>): Ntstatus
}

public typealias KspCompleteTokenFn = KspCompleteTokenFnFn?

public fun interface KspDeleteContextFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: MutPtr<ULong>): Ntstatus
}

public typealias KspDeleteContextFn = KspDeleteContextFnFn?

public fun interface KspGetTokenFnFn {
    public operator fun invoke(contextid: ULong, impersonationtoken: MutPtr<Handle>, rawtoken: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias KspGetTokenFn = KspGetTokenFnFn?

public fun interface KspInitContextFnFn {
    public operator fun invoke(contextid: ULong, contextdata: ConstPtr<SecBuffer>, newcontextid: MutPtr<ULong>): Ntstatus
}

public typealias KspInitContextFn = KspInitContextFnFn?

public fun interface KspInitPackageFnFn {
    public operator fun invoke(functiontable: ConstPtr<SecpkgKernelFunctions>): Ntstatus
}

public typealias KspInitPackageFn = KspInitPackageFnFn?

public fun interface KspMakeSignatureFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: ConstPtr<SecBufferDesc>, messageseqno: UInt): Ntstatus
}

public typealias KspMakeSignatureFn = KspMakeSignatureFnFn?

public fun interface KspMapHandleFnFn {
    public operator fun invoke(contextid: ULong, lsacontextid: MutPtr<ULong>): Ntstatus
}

public typealias KspMapHandleFn = KspMapHandleFnFn?

public fun interface KspQueryAttributesFnFn {
    public operator fun invoke(contextid: ULong, attribute: UInt, buffer: MutPtr<CVoid>): Ntstatus
}

public typealias KspQueryAttributesFn = KspQueryAttributesFnFn?

public fun interface KspSealMessageFnFn {
    public operator fun invoke(contextid: ULong, fqop: UInt, message: ConstPtr<SecBufferDesc>, messageseqno: UInt): Ntstatus
}

public typealias KspSealMessageFn = KspSealMessageFnFn?

public fun interface KspSerializeAuthDataFnFn {
    public operator fun invoke(pvauthdata: ConstPtr<CVoid>, size: MutPtr<UInt>, serializeddata: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias KspSerializeAuthDataFn = KspSerializeAuthDataFnFn?

public fun interface KspSetPagingModeFnFn {
    public operator fun invoke(pagingmode: Boolean): Ntstatus
}

public typealias KspSetPagingModeFn = KspSetPagingModeFnFn?

public fun interface KspUnsealMessageFnFn {
    public operator fun invoke(contextid: ULong, message: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Ntstatus
}

public typealias KspUnsealMessageFn = KspUnsealMessageFnFn?

public fun interface KspVerifySignatureFnFn {
    public operator fun invoke(contextid: ULong, message: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Ntstatus
}

public typealias KspVerifySignatureFn = KspVerifySignatureFnFn?

public fun interface LsaApPostLogonUserFn {
    public operator fun invoke(postlogonuserinfo: ConstPtr<SecpkgPostLogonUserInfo>): Ntstatus
}

public typealias LsaApPostLogonUser = LsaApPostLogonUserFn?

public typealias LsaAuthInformationAuthType = UInt

public typealias LsaForestTrustCollisionRecordType = Int

public typealias LsaForestTrustRecordType = Int

public typealias LsaHandle = Long

public typealias LsaLookupDomainInfoClass = Int

public typealias LsaTokenInformationType = Int

public fun interface MakeSignatureFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<SecBufferDesc>, param3: UInt): Hresult
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
    public operator fun invoke(type: KsecContextType): MutPtr<CVoid>
}

public typealias PksecCreateContextList = PksecCreateContextListFn?

public fun interface PksecDereferenceListEntryFn {
    public operator fun invoke(entry: ConstPtr<KsecListEntry>, delete: MutPtr<UByte>)
}

public typealias PksecDereferenceListEntry = PksecDereferenceListEntryFn?

public fun interface PksecInsertListEntryFn {
    public operator fun invoke(list: ConstPtr<CVoid>, entry: ConstPtr<KsecListEntry>)
}

public typealias PksecInsertListEntry = PksecInsertListEntryFn?

public fun interface PksecLocatePkgByIdFn {
    public operator fun invoke(packageid: UInt): MutPtr<CVoid>
}

public typealias PksecLocatePkgById = PksecLocatePkgByIdFn?

public fun interface PksecReferenceListEntryFn {
    public operator fun invoke(entry: ConstPtr<KsecListEntry>, signature: UInt, removenoref: Boolean): Ntstatus
}

public typealias PksecReferenceListEntry = PksecReferenceListEntryFn?

public fun interface PksecSerializeSchannelAuthDataFn {
    public operator fun invoke(pvauthdata: ConstPtr<CVoid>, size: MutPtr<UInt>, serializeddata: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PksecSerializeSchannelAuthData = PksecSerializeSchannelAuthDataFn?

public fun interface PksecSerializeWinntAuthDataFn {
    public operator fun invoke(pvauthdata: ConstPtr<CVoid>, size: MutPtr<UInt>, serializeddata: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PksecSerializeWinntAuthData = PksecSerializeWinntAuthDataFn?

public typealias Pku2uLogonSubmitType = Int

public fun interface PlsaAddCredentialFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, authenticationpackage: UInt, primarykeyvalue: ConstPtr<LsaString>, credentials: ConstPtr<LsaString>): Ntstatus
}

public typealias PlsaAddCredential = PlsaAddCredentialFn?

public fun interface PlsaAllocateClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, lengthrequired: UInt, clientbaseaddress: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PlsaAllocateClientBuffer = PlsaAllocateClientBufferFn?

public fun interface PlsaAllocateLsaHeapFn {
    public operator fun invoke(length: UInt): MutPtr<CVoid>
}

public typealias PlsaAllocateLsaHeap = PlsaAllocateLsaHeapFn?

public fun interface PlsaAllocatePrivateHeapFn {
    public operator fun invoke(length: ULong): MutPtr<CVoid>
}

public typealias PlsaAllocatePrivateHeap = PlsaAllocatePrivateHeapFn?

public fun interface PlsaAllocateSharedMemoryFn {
    public operator fun invoke(sharedmem: ConstPtr<CVoid>, size: UInt): MutPtr<CVoid>
}

public typealias PlsaAllocateSharedMemory = PlsaAllocateSharedMemoryFn?

public fun interface PlsaApCallPackageFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaApCallPackage = PlsaApCallPackageFn?

public fun interface PlsaApCallPackagePassthroughFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaApCallPackagePassthrough = PlsaApCallPackagePassthroughFn?

public fun interface PlsaApInitializePackageFn {
    public operator fun invoke(authenticationpackageid: UInt, lsadispatchtable: ConstPtr<LsaDispatchTable>, database: ConstPtr<LsaString>, confidentiality: ConstPtr<LsaString>, authenticationpackagename: MutPtr<MutPtr<LsaString>>): Ntstatus
}

public typealias PlsaApInitializePackage = PlsaApInitializePackageFn?

public fun interface PlsaApLogonTerminatedFn {
    public operator fun invoke(logonid: ConstPtr<Luid>)
}

public typealias PlsaApLogonTerminated = PlsaApLogonTerminatedFn?

public fun interface PlsaApLogonUserFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, logontype: SecurityLogonType, authenticationinformation: ConstPtr<CVoid>, clientauthenticationbase: ConstPtr<CVoid>, authenticationinformationlength: UInt, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebufferlength: MutPtr<UInt>, logonid: MutPtr<Luid>, substatus: MutPtr<Int>, tokeninformationtype: MutPtr<LsaTokenInformationType>, tokeninformation: MutPtr<MutPtr<CVoid>>, accountname: MutPtr<MutPtr<LsaUnicodeString>>, authenticatingauthority: MutPtr<MutPtr<LsaUnicodeString>>): Ntstatus
}

public typealias PlsaApLogonUser = PlsaApLogonUserFn?

public fun interface PlsaApLogonUserExFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, logontype: SecurityLogonType, authenticationinformation: ConstPtr<CVoid>, clientauthenticationbase: ConstPtr<CVoid>, authenticationinformationlength: UInt, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebufferlength: MutPtr<UInt>, logonid: MutPtr<Luid>, substatus: MutPtr<Int>, tokeninformationtype: MutPtr<LsaTokenInformationType>, tokeninformation: MutPtr<MutPtr<CVoid>>, accountname: MutPtr<MutPtr<LsaUnicodeString>>, authenticatingauthority: MutPtr<MutPtr<LsaUnicodeString>>, machinename: MutPtr<MutPtr<LsaUnicodeString>>): Ntstatus
}

public typealias PlsaApLogonUserEx = PlsaApLogonUserExFn?

public fun interface PlsaApLogonUserEx2Fn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbuffersize: UInt, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebuffersize: MutPtr<UInt>, logonid: MutPtr<Luid>, substatus: MutPtr<Int>, tokeninformationtype: MutPtr<LsaTokenInformationType>, tokeninformation: MutPtr<MutPtr<CVoid>>, accountname: MutPtr<MutPtr<LsaUnicodeString>>, authenticatingauthority: MutPtr<MutPtr<LsaUnicodeString>>, machinename: MutPtr<MutPtr<LsaUnicodeString>>, primarycredentials: MutPtr<SecpkgPrimaryCred>, supplementalcredentials: MutPtr<MutPtr<SecpkgSupplementalCredArray>>): Ntstatus
}

public typealias PlsaApLogonUserEx2 = PlsaApLogonUserEx2Fn?

public fun interface PlsaApLogonUserEx3Fn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbuffersize: UInt, surrogatelogon: MutPtr<SecpkgSurrogateLogon>, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebuffersize: MutPtr<UInt>, logonid: MutPtr<Luid>, substatus: MutPtr<Int>, tokeninformationtype: MutPtr<LsaTokenInformationType>, tokeninformation: MutPtr<MutPtr<CVoid>>, accountname: MutPtr<MutPtr<LsaUnicodeString>>, authenticatingauthority: MutPtr<MutPtr<LsaUnicodeString>>, machinename: MutPtr<MutPtr<LsaUnicodeString>>, primarycredentials: MutPtr<SecpkgPrimaryCred>, supplementalcredentials: MutPtr<MutPtr<SecpkgSupplementalCredArray>>): Ntstatus
}

public typealias PlsaApLogonUserEx3 = PlsaApLogonUserEx3Fn?

public fun interface PlsaApPostLogonUserSurrogateFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbuffersize: UInt, surrogatelogon: ConstPtr<SecpkgSurrogateLogon>, profilebuffer: ConstPtr<CVoid>, profilebuffersize: UInt, logonid: ConstPtr<Luid>, status: Ntstatus, substatus: Ntstatus, tokeninformationtype: LsaTokenInformationType, tokeninformation: ConstPtr<CVoid>, accountname: ConstPtr<LsaUnicodeString>, authenticatingauthority: ConstPtr<LsaUnicodeString>, machinename: ConstPtr<LsaUnicodeString>, primarycredentials: ConstPtr<SecpkgPrimaryCred>, supplementalcredentials: ConstPtr<SecpkgSupplementalCredArray>): Ntstatus
}

public typealias PlsaApPostLogonUserSurrogate = PlsaApPostLogonUserSurrogateFn?

public fun interface PlsaApPreLogonUserSurrogateFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, logontype: SecurityLogonType, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbuffersize: UInt, surrogatelogon: MutPtr<SecpkgSurrogateLogon>, substatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaApPreLogonUserSurrogate = PlsaApPreLogonUserSurrogateFn?

public fun interface PlsaAuditAccountLogonFn {
    public operator fun invoke(auditid: UInt, success: Boolean, source: ConstPtr<LsaUnicodeString>, clientname: ConstPtr<LsaUnicodeString>, mappedname: ConstPtr<LsaUnicodeString>, status: Ntstatus): Ntstatus
}

public typealias PlsaAuditAccountLogon = PlsaAuditAccountLogonFn?

public fun interface PlsaAuditLogonFn {
    public operator fun invoke(status: Ntstatus, substatus: Ntstatus, accountname: ConstPtr<LsaUnicodeString>, authenticatingauthority: ConstPtr<LsaUnicodeString>, workstationname: ConstPtr<LsaUnicodeString>, usersid: Psid, logontype: SecurityLogonType, tokensource: ConstPtr<TokenSource>, logonid: ConstPtr<Luid>)
}

public typealias PlsaAuditLogon = PlsaAuditLogonFn?

public fun interface PlsaAuditLogonExFn {
    public operator fun invoke(status: Ntstatus, substatus: Ntstatus, accountname: ConstPtr<LsaUnicodeString>, authenticatingauthority: ConstPtr<LsaUnicodeString>, workstationname: ConstPtr<LsaUnicodeString>, usersid: Psid, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokensource: ConstPtr<TokenSource>, logonid: ConstPtr<Luid>)
}

public typealias PlsaAuditLogonEx = PlsaAuditLogonExFn?

public fun interface PlsaCallbackFunctionFn {
    public operator fun invoke(argument1: ULong, argument2: ULong, inputbuffer: MutPtr<SecBuffer>, outputbuffer: MutPtr<SecBuffer>): Ntstatus
}

public typealias PlsaCallbackFunction = PlsaCallbackFunctionFn?

public fun interface PlsaCallPackageFn {
    public operator fun invoke(authenticationpackage: ConstPtr<LsaUnicodeString>, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaCallPackage = PlsaCallPackageFn?

public fun interface PlsaCallPackageexFn {
    public operator fun invoke(authenticationpackage: ConstPtr<LsaUnicodeString>, clientbufferbase: ConstPtr<CVoid>, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaCallPackageex = PlsaCallPackageexFn?

public fun interface PlsaCallPackagePassthroughFn {
    public operator fun invoke(authenticationpackage: ConstPtr<LsaUnicodeString>, clientbufferbase: ConstPtr<CVoid>, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaCallPackagePassthrough = PlsaCallPackagePassthroughFn?

public fun interface PlsaCancelNotificationFn {
    public operator fun invoke(notifyhandle: Handle): Ntstatus
}

public typealias PlsaCancelNotification = PlsaCancelNotificationFn?

public fun interface PlsaCheckProtectedUserByTokenFn {
    public operator fun invoke(usertoken: Handle, protecteduser: MutPtr<Boolean>): Ntstatus
}

public typealias PlsaCheckProtectedUserByToken = PlsaCheckProtectedUserByTokenFn?

public fun interface PlsaClientCallbackFn {
    public operator fun invoke(callback: Pcstr, argument1: ULong, argument2: ULong, input: ConstPtr<SecBuffer>, output: MutPtr<SecBuffer>): Ntstatus
}

public typealias PlsaClientCallback = PlsaClientCallbackFn?

public fun interface PlsaCloseSamUserFn {
    public operator fun invoke(userhandle: ConstPtr<CVoid>): Ntstatus
}

public typealias PlsaCloseSamUser = PlsaCloseSamUserFn?

public fun interface PlsaConvertAuthDataToTokenFn {
    public operator fun invoke(userauthdata: ConstPtr<CVoid>, userauthdatasize: UInt, impersonationlevel: SecurityImpersonationLevel, tokensource: ConstPtr<TokenSource>, logontype: SecurityLogonType, authorityname: ConstPtr<LsaUnicodeString>, token: MutPtr<Handle>, logonid: MutPtr<Luid>, accountname: MutPtr<LsaUnicodeString>, substatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaConvertAuthDataToToken = PlsaConvertAuthDataToTokenFn?

public fun interface PlsaCopyFromClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, length: UInt, buffertocopy: MutPtr<CVoid>, clientbaseaddress: ConstPtr<CVoid>): Ntstatus
}

public typealias PlsaCopyFromClientBuffer = PlsaCopyFromClientBufferFn?

public fun interface PlsaCopyToClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, length: UInt, clientbaseaddress: MutPtr<CVoid>, buffertocopy: ConstPtr<CVoid>): Ntstatus
}

public typealias PlsaCopyToClientBuffer = PlsaCopyToClientBufferFn?

public fun interface PlsaCrackSingleNameFn {
    public operator fun invoke(formatoffered: UInt, performatgc: Boolean, nameinput: ConstPtr<LsaUnicodeString>, prefix: ConstPtr<LsaUnicodeString>, requestedformat: UInt, crackedname: MutPtr<LsaUnicodeString>, dnsdomainname: MutPtr<LsaUnicodeString>, substatus: MutPtr<UInt>): Ntstatus
}

public typealias PlsaCrackSingleName = PlsaCrackSingleNameFn?

public fun interface PlsaCreateLogonSessionFn {
    public operator fun invoke(logonid: MutPtr<Luid>): Ntstatus
}

public typealias PlsaCreateLogonSession = PlsaCreateLogonSessionFn?

public fun interface PlsaCreateSharedMemoryFn {
    public operator fun invoke(maxsize: UInt, initialsize: UInt): MutPtr<CVoid>
}

public typealias PlsaCreateSharedMemory = PlsaCreateSharedMemoryFn?

public fun interface PlsaCreateThreadFn {
    public operator fun invoke(securityattributes: ConstPtr<SecurityAttributes>, stacksize: UInt, startfunction: LpthreadStartRoutine, threadparameter: ConstPtr<CVoid>, creationflags: UInt, threadid: MutPtr<UInt>): Handle
}

public typealias PlsaCreateThread = PlsaCreateThreadFn?

public fun interface PlsaCreateTokenFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, tokensource: ConstPtr<TokenSource>, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokeninformationtype: LsaTokenInformationType, tokeninformation: ConstPtr<CVoid>, tokengroups: ConstPtr<TokenGroups>, accountname: ConstPtr<LsaUnicodeString>, authorityname: ConstPtr<LsaUnicodeString>, workstation: ConstPtr<LsaUnicodeString>, profilepath: ConstPtr<LsaUnicodeString>, token: MutPtr<Handle>, substatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaCreateToken = PlsaCreateTokenFn?

public fun interface PlsaCreateTokenExFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, tokensource: ConstPtr<TokenSource>, logontype: SecurityLogonType, impersonationlevel: SecurityImpersonationLevel, tokeninformationtype: LsaTokenInformationType, tokeninformation: ConstPtr<CVoid>, tokengroups: ConstPtr<TokenGroups>, workstation: ConstPtr<LsaUnicodeString>, profilepath: ConstPtr<LsaUnicodeString>, sessioninformation: ConstPtr<CVoid>, sessioninformationtype: SecpkgSessioninfoType, token: MutPtr<Handle>, substatus: MutPtr<Int>): Ntstatus
}

public typealias PlsaCreateTokenEx = PlsaCreateTokenExFn?

public fun interface PlsaDeleteCredentialFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, authenticationpackage: UInt, primarykeyvalue: ConstPtr<LsaString>): Ntstatus
}

public typealias PlsaDeleteCredential = PlsaDeleteCredentialFn?

public fun interface PlsaDeleteLogonSessionFn {
    public operator fun invoke(logonid: ConstPtr<Luid>): Ntstatus
}

public typealias PlsaDeleteLogonSession = PlsaDeleteLogonSessionFn?

public fun interface PlsaDeleteSharedMemoryFn {
    public operator fun invoke(sharedmem: ConstPtr<CVoid>): Boolean
}

public typealias PlsaDeleteSharedMemory = PlsaDeleteSharedMemoryFn?

public fun interface PlsaDuplicateHandleFn {
    public operator fun invoke(sourcehandle: Handle, destionationhandle: MutPtr<Handle>): Ntstatus
}

public typealias PlsaDuplicateHandle = PlsaDuplicateHandleFn?

public fun interface PlsaExpandAuthDataForDomainFn {
    public operator fun invoke(userauthdata: ConstPtr<UByte>, userauthdatasize: UInt, reserved: ConstPtr<CVoid>, expandedauthdata: MutPtr<MutPtr<UByte>>, expandedauthdatasize: MutPtr<UInt>): Ntstatus
}

public typealias PlsaExpandAuthDataForDomain = PlsaExpandAuthDataForDomainFn?

public fun interface PlsaFreeClientBufferFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, clientbaseaddress: ConstPtr<CVoid>): Ntstatus
}

public typealias PlsaFreeClientBuffer = PlsaFreeClientBufferFn?

public fun interface PlsaFreeLsaHeapFn {
    public operator fun invoke(base: ConstPtr<CVoid>)
}

public typealias PlsaFreeLsaHeap = PlsaFreeLsaHeapFn?

public fun interface PlsaFreePrivateHeapFn {
    public operator fun invoke(base: ConstPtr<CVoid>)
}

public typealias PlsaFreePrivateHeap = PlsaFreePrivateHeapFn?

public fun interface PlsaFreeSharedMemoryFn {
    public operator fun invoke(sharedmem: ConstPtr<CVoid>, memory: MutPtr<CVoid>)
}

public typealias PlsaFreeSharedMemory = PlsaFreeSharedMemoryFn?

public fun interface PlsaGetAppModeInfoFn {
    public operator fun invoke(userfunction: MutPtr<UInt>, argument1: MutPtr<ULong>, argument2: MutPtr<ULong>, userdata: MutPtr<SecBuffer>, returntolsa: MutPtr<Boolean>): Ntstatus
}

public typealias PlsaGetAppModeInfo = PlsaGetAppModeInfoFn?

public fun interface PlsaGetAuthDataForUserFn {
    public operator fun invoke(name: ConstPtr<SecurityString>, nametype: SecpkgNameType, prefix: ConstPtr<SecurityString>, userauthdata: MutPtr<MutPtr<UByte>>, userauthdatasize: MutPtr<UInt>, userflatname: MutPtr<LsaUnicodeString>): Ntstatus
}

public typealias PlsaGetAuthDataForUser = PlsaGetAuthDataForUserFn?

public fun interface PlsaGetCallInfoFn {
    public operator fun invoke(info: MutPtr<SecpkgCallInfo>): Boolean
}

public typealias PlsaGetCallInfo = PlsaGetCallInfoFn?

public fun interface PlsaGetClientInfoFn {
    public operator fun invoke(clientinfo: MutPtr<SecpkgClientInfo>): Ntstatus
}

public typealias PlsaGetClientInfo = PlsaGetClientInfoFn?

public fun interface PlsaGetClientInfoExFn {
    public operator fun invoke(clientinfo: MutPtr<SecpkgClientInfoEx>, structsize: UInt): Ntstatus
}

public typealias PlsaGetClientInfoEx = PlsaGetClientInfoExFn?

public fun interface PlsaGetCredentialsFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, authenticationpackage: UInt, querycontext: MutPtr<UInt>, retrieveallcredentials: Boolean, primarykeyvalue: ConstPtr<LsaString>, primarykeylength: MutPtr<UInt>, credentials: ConstPtr<LsaString>): Ntstatus
}

public typealias PlsaGetCredentials = PlsaGetCredentialsFn?

public fun interface PlsaGetExtendedCallFlagsFn {
    public operator fun invoke(flags: MutPtr<UInt>): Ntstatus
}

public typealias PlsaGetExtendedCallFlags = PlsaGetExtendedCallFlagsFn?

public fun interface PlsaGetServiceAccountPasswordFn {
    public operator fun invoke(accountname: ConstPtr<LsaUnicodeString>, domainname: ConstPtr<LsaUnicodeString>, credfetch: CredFetch, filetimeexpiry: MutPtr<Filetime>, currentpassword: MutPtr<LsaUnicodeString>, previouspassword: MutPtr<LsaUnicodeString>, filetimecurrpwdvalidforoutbound: MutPtr<Filetime>): Ntstatus
}

public typealias PlsaGetServiceAccountPassword = PlsaGetServiceAccountPasswordFn?

public fun interface PlsaGetUserAuthDataFn {
    public operator fun invoke(userhandle: ConstPtr<CVoid>, userauthdata: MutPtr<MutPtr<UByte>>, userauthdatasize: MutPtr<UInt>): Ntstatus
}

public typealias PlsaGetUserAuthData = PlsaGetUserAuthDataFn?

public fun interface PlsaGetUserCredentialsFn {
    public operator fun invoke(userhandle: ConstPtr<CVoid>, primarycreds: MutPtr<MutPtr<CVoid>>, primarycredssize: MutPtr<UInt>, supplementalcreds: MutPtr<MutPtr<CVoid>>, supplementalcredssize: MutPtr<UInt>): Ntstatus
}

public typealias PlsaGetUserCredentials = PlsaGetUserCredentialsFn?

public fun interface PlsaImpersonateClientFn {
    public operator fun invoke(): Ntstatus
}

public typealias PlsaImpersonateClient = PlsaImpersonateClientFn?

public fun interface PlsaLocatePkgByIdFn {
    public operator fun invoke(packgeid: UInt): MutPtr<CVoid>
}

public typealias PlsaLocatePkgById = PlsaLocatePkgByIdFn?

public fun interface PlsaMapBufferFn {
    public operator fun invoke(inputbuffer: ConstPtr<SecBuffer>, outputbuffer: MutPtr<SecBuffer>): Ntstatus
}

public typealias PlsaMapBuffer = PlsaMapBufferFn?

public fun interface PlsaOpenSamUserFn {
    public operator fun invoke(name: ConstPtr<SecurityString>, nametype: SecpkgNameType, prefix: ConstPtr<SecurityString>, allowguest: Boolean, reserved: UInt, userhandle: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PlsaOpenSamUser = PlsaOpenSamUserFn?

public fun interface PlsaOpenTokenByLogonIdFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, rettokenhandle: MutPtr<Handle>): Ntstatus
}

public typealias PlsaOpenTokenByLogonId = PlsaOpenTokenByLogonIdFn?

public fun interface PlsaProtectMemoryFn {
    public operator fun invoke(buffer: MutPtr<CVoid>, buffersize: UInt)
}

public typealias PlsaProtectMemory = PlsaProtectMemoryFn?

public fun interface PlsaQueryClientRequestFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, querytype: UInt, replybuffer: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias PlsaQueryClientRequest = PlsaQueryClientRequestFn?

public fun interface PlsaRedirectedLogonCallbackFn {
    public operator fun invoke(redirectedlogonhandle: Handle, buffer: MutPtr<CVoid>, bufferlength: UInt, returnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>): Ntstatus
}

public typealias PlsaRedirectedLogonCallback = PlsaRedirectedLogonCallbackFn?

public fun interface PlsaRedirectedLogonCleanupCallbackFn {
    public operator fun invoke(redirectedlogonhandle: Handle)
}

public typealias PlsaRedirectedLogonCleanupCallback = PlsaRedirectedLogonCleanupCallbackFn?

public fun interface PlsaRedirectedLogonGetLogonCredsFn {
    public operator fun invoke(redirectedlogonhandle: Handle, logonbuffer: MutPtr<MutPtr<UByte>>, logonbufferlength: MutPtr<UInt>): Ntstatus
}

public typealias PlsaRedirectedLogonGetLogonCreds = PlsaRedirectedLogonGetLogonCredsFn?

public fun interface PlsaRedirectedLogonGetSidFn {
    public operator fun invoke(redirectedlogonhandle: Handle, sid: MutPtr<Psid>): Ntstatus
}

public typealias PlsaRedirectedLogonGetSid = PlsaRedirectedLogonGetSidFn?

public fun interface PlsaRedirectedLogonGetSuppCredsFn {
    public operator fun invoke(redirectedlogonhandle: Handle, supplementalcredentials: MutPtr<MutPtr<SecpkgSupplementalCredArray>>): Ntstatus
}

public typealias PlsaRedirectedLogonGetSuppCreds = PlsaRedirectedLogonGetSuppCredsFn?

public fun interface PlsaRedirectedLogonInitFn {
    public operator fun invoke(redirectedlogonhandle: Handle, packagename: ConstPtr<LsaUnicodeString>, sessionid: UInt, logonid: ConstPtr<Luid>): Ntstatus
}

public typealias PlsaRedirectedLogonInit = PlsaRedirectedLogonInitFn?

public fun interface PlsaRegisterCallbackFn {
    public operator fun invoke(callbackid: UInt, callback: PlsaCallbackFunction): Ntstatus
}

public typealias PlsaRegisterCallback = PlsaRegisterCallbackFn?

public fun interface PlsaRegisterNotificationFn {
    public operator fun invoke(startfunction: LpthreadStartRoutine, parameter: ConstPtr<CVoid>, notificationtype: UInt, notificationclass: UInt, notificationflags: UInt, intervalminutes: UInt, waitevent: Handle): Handle
}

public typealias PlsaRegisterNotification = PlsaRegisterNotificationFn?

public fun interface PlsaSaveSupplementalCredentialsFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, supplementalcredsize: UInt, supplementalcreds: ConstPtr<CVoid>, synchronous: Boolean): Ntstatus
}

public typealias PlsaSaveSupplementalCredentials = PlsaSaveSupplementalCredentialsFn?

public fun interface PlsaSetAppModeInfoFn {
    public operator fun invoke(userfunction: UInt, argument1: ULong, argument2: ULong, userdata: ConstPtr<SecBuffer>, returntolsa: Boolean): Ntstatus
}

public typealias PlsaSetAppModeInfo = PlsaSetAppModeInfoFn?

public fun interface PlsaUnloadPackageFn {
    public operator fun invoke(): Ntstatus
}

public typealias PlsaUnloadPackage = PlsaUnloadPackageFn?

public fun interface PlsaUpdatePrimaryCredentialsFn {
    public operator fun invoke(primarycredentials: ConstPtr<SecpkgPrimaryCred>, credentials: ConstPtr<SecpkgSupplementalCredArray>): Ntstatus
}

public typealias PlsaUpdatePrimaryCredentials = PlsaUpdatePrimaryCredentialsFn?

public typealias PolicyAuditEventType = Int

public typealias PolicyDomainInformationClass = Int

public typealias PolicyInformationClass = Int

public typealias PolicyLsaServerRole = Int

public typealias PolicyNotificationInformationClass = Int

public fun interface PsamCredentialUpdateFreeRoutineFn {
    public operator fun invoke(p: ConstPtr<CVoid>)
}

public typealias PsamCredentialUpdateFreeRoutine = PsamCredentialUpdateFreeRoutineFn?

public fun interface PsamCredentialUpdateNotifyRoutineFn {
    public operator fun invoke(clearpassword: ConstPtr<LsaUnicodeString>, oldcredentials: ConstPtr<CVoid>, oldcredentialsize: UInt, useraccountcontrol: UInt, upn: ConstPtr<LsaUnicodeString>, username: ConstPtr<LsaUnicodeString>, netbiosdomainname: ConstPtr<LsaUnicodeString>, dnsdomainname: ConstPtr<LsaUnicodeString>, newcredentials: MutPtr<MutPtr<CVoid>>, newcredentialsize: MutPtr<UInt>): Ntstatus
}

public typealias PsamCredentialUpdateNotifyRoutine = PsamCredentialUpdateNotifyRoutineFn?

public fun interface PsamCredentialUpdateRegisterMappedEntrypointsRoutineFn {
    public operator fun invoke(table: MutPtr<SamRegisterMappingTable>): Ntstatus
}

public typealias PsamCredentialUpdateRegisterMappedEntrypointsRoutine = PsamCredentialUpdateRegisterMappedEntrypointsRoutineFn?

public fun interface PsamCredentialUpdateRegisterRoutineFn {
    public operator fun invoke(credentialname: MutPtr<LsaUnicodeString>): Boolean
}

public typealias PsamCredentialUpdateRegisterRoutine = PsamCredentialUpdateRegisterRoutineFn?

public fun interface PsamInitNotificationRoutineFn {
    public operator fun invoke(): Boolean
}

public typealias PsamInitNotificationRoutine = PsamInitNotificationRoutineFn?

public fun interface PsamPasswordFilterRoutineFn {
    public operator fun invoke(accountname: ConstPtr<LsaUnicodeString>, fullname: ConstPtr<LsaUnicodeString>, password: ConstPtr<LsaUnicodeString>, setoperation: Boolean): Boolean
}

public typealias PsamPasswordFilterRoutine = PsamPasswordFilterRoutineFn?

public fun interface PsamPasswordNotificationRoutineFn {
    public operator fun invoke(username: MutPtr<LsaUnicodeString>, relativeid: UInt, newpassword: MutPtr<LsaUnicodeString>): Ntstatus
}

public typealias PsamPasswordNotificationRoutine = PsamPasswordNotificationRoutineFn?

public fun interface QueryContextAttributesExFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias QueryContextAttributesExFnA = QueryContextAttributesExFnAFn?

public fun interface QueryContextAttributesExFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias QueryContextAttributesExFnW = QueryContextAttributesExFnWFn?

public fun interface QueryContextAttributesFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>): Hresult
}

public typealias QueryContextAttributesFnA = QueryContextAttributesFnAFn?

public fun interface QueryContextAttributesFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>): Hresult
}

public typealias QueryContextAttributesFnW = QueryContextAttributesFnWFn?

public fun interface QueryCredentialsAttributesExFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias QueryCredentialsAttributesExFnA = QueryCredentialsAttributesExFnAFn?

public fun interface QueryCredentialsAttributesExFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias QueryCredentialsAttributesExFnW = QueryCredentialsAttributesExFnWFn?

public fun interface QueryCredentialsAttributesFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>): Hresult
}

public typealias QueryCredentialsAttributesFnA = QueryCredentialsAttributesFnAFn?

public fun interface QueryCredentialsAttributesFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>): Hresult
}

public typealias QueryCredentialsAttributesFnW = QueryCredentialsAttributesFnWFn?

public fun interface QuerySecurityContextTokenFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias QuerySecurityContextTokenFn = QuerySecurityContextTokenFnFn?

public fun interface QuerySecurityPackageInfoFnAFn {
    public operator fun invoke(param0: MutPtr<Byte>, param1: MutPtr<MutPtr<SecPkgInfoA>>): Hresult
}

public typealias QuerySecurityPackageInfoFnA = QuerySecurityPackageInfoFnAFn?

public fun interface QuerySecurityPackageInfoFnWFn {
    public operator fun invoke(param0: MutPtr<UShort>, param1: MutPtr<MutPtr<SecPkgInfoW>>): Hresult
}

public typealias QuerySecurityPackageInfoFnW = QuerySecurityPackageInfoFnWFn?

public fun interface RevertSecurityContextFnFn {
    public operator fun invoke(param0: MutPtr<SecHandle>): Hresult
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
    public operator fun invoke(arg: MutPtr<CVoid>, principal: MutPtr<CVoid>, keyver: UInt, key: MutPtr<MutPtr<CVoid>>, status: MutPtr<Hresult>)
}

public typealias SecGetKeyFn = SecGetKeyFnFn?

public typealias SecTrafficSecretType = Int

public fun interface SetContextAttributesFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias SetContextAttributesFnA = SetContextAttributesFnAFn?

public fun interface SetContextAttributesFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias SetContextAttributesFnW = SetContextAttributesFnWFn?

public fun interface SetCredentialsAttributesFnAFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
}

public typealias SetCredentialsAttributesFnA = SetCredentialsAttributesFnAFn?

public fun interface SetCredentialsAttributesFnWFn {
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: UInt, param2: MutPtr<CVoid>, param3: UInt): Hresult
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
    public operator fun invoke(pbcertificate: MutPtr<UByte>, cbcertificate: UInt, verifysignature: Bool, ppcertificate: MutPtr<MutPtr<X509Certificate>>): Bool
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
    public operator fun invoke(pcertificate: MutPtr<X509Certificate>)
}

public typealias SslFreeCertificateFn = SslFreeCertificateFnFn?

public typealias SchGetExtensionsOptions = Int

public typealias SecDelegationType = Int

public fun interface SpAcceptCredentialsFnFn {
    public operator fun invoke(logontype: SecurityLogonType, accountname: ConstPtr<LsaUnicodeString>, primarycredentials: ConstPtr<SecpkgPrimaryCred>, supplementalcredentials: ConstPtr<SecpkgSupplementalCred>): Ntstatus
}

public typealias SpAcceptCredentialsFn = SpAcceptCredentialsFnFn?

public fun interface SpAcceptLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, inputbuffer: ConstPtr<SecBufferDesc>, contextrequirements: UInt, targetdatarep: UInt, newcontexthandle: MutPtr<ULong>, outputbuffer: MutPtr<SecBufferDesc>, contextattributes: MutPtr<UInt>, expirationtime: MutPtr<Long>, mappedcontext: MutPtr<Boolean>, contextdata: MutPtr<SecBuffer>): Ntstatus
}

public typealias SpAcceptLsaModeContextFn = SpAcceptLsaModeContextFnFn?

public fun interface SpAcquireCredentialsHandleFnFn {
    public operator fun invoke(principalname: ConstPtr<LsaUnicodeString>, credentialuseflags: UInt, logonid: ConstPtr<Luid>, authorizationdata: ConstPtr<CVoid>, getkeyfunciton: ConstPtr<CVoid>, getkeyargument: ConstPtr<CVoid>, credentialhandle: MutPtr<ULong>, expirationtime: MutPtr<Long>): Ntstatus
}

public typealias SpAcquireCredentialsHandleFn = SpAcquireCredentialsHandleFnFn?

public fun interface SpAddCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, principalname: ConstPtr<LsaUnicodeString>, pkg: ConstPtr<LsaUnicodeString>, credentialuseflags: UInt, authorizationdata: ConstPtr<CVoid>, getkeyfunciton: ConstPtr<CVoid>, getkeyargument: ConstPtr<CVoid>, expirationtime: MutPtr<Long>): Ntstatus
}

public typealias SpAddCredentialsFn = SpAddCredentialsFnFn?

public fun interface SpApplyControlTokenFnFn {
    public operator fun invoke(contexthandle: ULong, controltoken: ConstPtr<SecBufferDesc>): Ntstatus
}

public typealias SpApplyControlTokenFn = SpApplyControlTokenFnFn?

public fun interface SpChangeAccountPasswordFnFn {
    public operator fun invoke(pdomainname: ConstPtr<LsaUnicodeString>, paccountname: ConstPtr<LsaUnicodeString>, poldpassword: ConstPtr<LsaUnicodeString>, pnewpassword: ConstPtr<LsaUnicodeString>, impersonating: Boolean, poutput: MutPtr<SecBufferDesc>): Ntstatus
}

public typealias SpChangeAccountPasswordFn = SpChangeAccountPasswordFnFn?

public fun interface SpCompleteAuthTokenFnFn {
    public operator fun invoke(contexthandle: ULong, inputbuffer: ConstPtr<SecBufferDesc>): Ntstatus
}

public typealias SpCompleteAuthTokenFn = SpCompleteAuthTokenFnFn?

public fun interface SpDeleteContextFnFn {
    public operator fun invoke(contexthandle: ULong): Ntstatus
}

public typealias SpDeleteContextFn = SpDeleteContextFnFn?

public fun interface SpDeleteCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, key: ConstPtr<SecBuffer>): Ntstatus
}

public typealias SpDeleteCredentialsFn = SpDeleteCredentialsFnFn?

public fun interface SpExchangeMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: ConstPtr<LsaUnicodeString>, contextrequirements: UInt, metadatalength: UInt, metadata: ConstPtr<UByte>, contexthandle: MutPtr<ULong>): Ntstatus
}

public typealias SpExchangeMetaDataFn = SpExchangeMetaDataFnFn?

public fun interface SpExportSecurityContextFnFn {
    public operator fun invoke(phcontext: ULong, fflags: UInt, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<Handle>): Ntstatus
}

public typealias SpExportSecurityContextFn = SpExportSecurityContextFnFn?

public fun interface SpExtractTargetInfoFnFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbufferlength: UInt, ppvtargetinfo: MutPtr<MutPtr<CVoid>>, pcbtargetinfo: MutPtr<UInt>): Ntstatus
}

public typealias SpExtractTargetInfoFn = SpExtractTargetInfoFnFn?

public fun interface SpFormatCredentialsFnFn {
    public operator fun invoke(credentials: ConstPtr<SecBuffer>, formattedcredentials: MutPtr<SecBuffer>): Ntstatus
}

public typealias SpFormatCredentialsFn = SpFormatCredentialsFnFn?

public fun interface SpFreeCredentialsHandleFnFn {
    public operator fun invoke(credentialhandle: ULong): Ntstatus
}

public typealias SpFreeCredentialsHandleFn = SpFreeCredentialsHandleFnFn?

public fun interface SpGetContextTokenFnFn {
    public operator fun invoke(contexthandle: ULong, impersonationtoken: MutPtr<Handle>): Ntstatus
}

public typealias SpGetContextTokenFn = SpGetContextTokenFnFn?

public fun interface SpGetCredUIContextFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: ConstPtr<Guid>, flatcreduicontextlength: MutPtr<UInt>, flatcreduicontext: MutPtr<MutPtr<UByte>>): Ntstatus
}

public typealias SpGetCredUIContextFn = SpGetCredUIContextFnFn?

public fun interface SpGetCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: MutPtr<SecBuffer>): Ntstatus
}

public typealias SpGetCredentialsFn = SpGetCredentialsFnFn?

public fun interface SpGetExtendedInformationFnFn {
    public operator fun invoke(cls: SecpkgExtendedInformationClass, ppinformation: MutPtr<MutPtr<SecpkgExtendedInformation>>): Ntstatus
}

public typealias SpGetExtendedInformationFn = SpGetExtendedInformationFnFn?

public fun interface SpGetInfoFnFn {
    public operator fun invoke(packageinfo: MutPtr<SecPkgInfoA>): Ntstatus
}

public typealias SpGetInfoFn = SpGetInfoFnFn?

public fun interface SpGetRemoteCredGuardLogonBufferFnFn {
    public operator fun invoke(credhandle: ULong, contexthandle: ULong, targetname: ConstPtr<LsaUnicodeString>, redirectedlogonhandle: MutPtr<Handle>, callback: MutPtr<PlsaRedirectedLogonCallback>, cleanupcallback: MutPtr<PlsaRedirectedLogonCleanupCallback>, logonbuffersize: MutPtr<UInt>, logonbuffer: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias SpGetRemoteCredGuardLogonBufferFn = SpGetRemoteCredGuardLogonBufferFnFn?

public fun interface SpGetRemoteCredGuardSupplementalCredsFnFn {
    public operator fun invoke(credhandle: ULong, targetname: ConstPtr<LsaUnicodeString>, redirectedlogonhandle: MutPtr<Handle>, callback: MutPtr<PlsaRedirectedLogonCallback>, cleanupcallback: MutPtr<PlsaRedirectedLogonCleanupCallback>, supplementalcredssize: MutPtr<UInt>, supplementalcreds: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias SpGetRemoteCredGuardSupplementalCredsFn = SpGetRemoteCredGuardSupplementalCredsFnFn?

public fun interface SpGetTbalSupplementalCredsFnFn {
    public operator fun invoke(logonid: Luid, supplementalcredssize: MutPtr<UInt>, supplementalcreds: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias SpGetTbalSupplementalCredsFn = SpGetTbalSupplementalCredsFnFn?

public fun interface SpGetUserInfoFnFn {
    public operator fun invoke(logonid: ConstPtr<Luid>, flags: UInt, userdata: MutPtr<MutPtr<SecurityUserData>>): Ntstatus
}

public typealias SpGetUserInfoFn = SpGetUserInfoFnFn?

public fun interface SpImportSecurityContextFnFn {
    public operator fun invoke(ppackedcontext: ConstPtr<SecBuffer>, token: Handle, phcontext: MutPtr<ULong>): Ntstatus
}

public typealias SpImportSecurityContextFn = SpImportSecurityContextFnFn?

public fun interface SpInitLsaModeContextFnFn {
    public operator fun invoke(credentialhandle: ULong, contexthandle: ULong, targetname: ConstPtr<LsaUnicodeString>, contextrequirements: UInt, targetdatarep: UInt, inputbuffers: ConstPtr<SecBufferDesc>, newcontexthandle: MutPtr<ULong>, outputbuffers: MutPtr<SecBufferDesc>, contextattributes: MutPtr<UInt>, expirationtime: MutPtr<Long>, mappedcontext: MutPtr<Boolean>, contextdata: MutPtr<SecBuffer>): Ntstatus
}

public typealias SpInitLsaModeContextFn = SpInitLsaModeContextFnFn?

public fun interface SpInitUserModeContextFnFn {
    public operator fun invoke(contexthandle: ULong, packedcontext: ConstPtr<SecBuffer>): Ntstatus
}

public typealias SpInitUserModeContextFn = SpInitUserModeContextFnFn?

public fun interface SpInitializeFnFn {
    public operator fun invoke(packageid: ULong, parameters: ConstPtr<SecpkgParameters>, functiontable: ConstPtr<LsaSecpkgFunctionTable>): Ntstatus
}

public typealias SpInitializeFn = SpInitializeFnFn?

public fun interface SpInstanceInitFnFn {
    public operator fun invoke(version: UInt, functiontable: ConstPtr<SecpkgDllFunctions>, userfunctions: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias SpInstanceInitFn = SpInstanceInitFnFn?

public fun interface SpLsaModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: MutPtr<UInt>, pptables: MutPtr<MutPtr<SecpkgFunctionTable>>, pctables: MutPtr<UInt>): Ntstatus
}

public typealias SpLsaModeInitializeFn = SpLsaModeInitializeFnFn?

public fun interface SpMakeSignatureFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: ConstPtr<SecBufferDesc>, messagesequencenumber: UInt): Ntstatus
}

public typealias SpMakeSignatureFn = SpMakeSignatureFnFn?

public fun interface SpMarshalAttributeDataFnFn {
    public operator fun invoke(attributeinfo: UInt, attribute: UInt, attributedatasize: UInt, attributedata: ConstPtr<UByte>, marshaledattributedatasize: MutPtr<UInt>, marshaledattributedata: MutPtr<MutPtr<UByte>>): Ntstatus
}

public typealias SpMarshalAttributeDataFn = SpMarshalAttributeDataFnFn?

public fun interface SpMarshallSupplementalCredsFnFn {
    public operator fun invoke(credentialsize: UInt, credentials: ConstPtr<UByte>, marshalledcredsize: MutPtr<UInt>, marshalledcreds: MutPtr<MutPtr<CVoid>>): Ntstatus
}

public typealias SpMarshallSupplementalCredsFn = SpMarshallSupplementalCredsFnFn?

public fun interface SpQueryContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: MutPtr<CVoid>): Ntstatus
}

public typealias SpQueryContextAttributesFn = SpQueryContextAttributesFnFn?

public fun interface SpQueryCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: MutPtr<CVoid>): Ntstatus
}

public typealias SpQueryCredentialsAttributesFn = SpQueryCredentialsAttributesFnFn?

public fun interface SpQueryMetaDataFnFn {
    public operator fun invoke(credentialhandle: ULong, targetname: ConstPtr<LsaUnicodeString>, contextrequirements: UInt, metadatalength: MutPtr<UInt>, metadata: MutPtr<MutPtr<UByte>>, contexthandle: MutPtr<ULong>): Ntstatus
}

public typealias SpQueryMetaDataFn = SpQueryMetaDataFnFn?

public fun interface SpSaveCredentialsFnFn {
    public operator fun invoke(credentialhandle: ULong, credentials: ConstPtr<SecBuffer>): Ntstatus
}

public typealias SpSaveCredentialsFn = SpSaveCredentialsFnFn?

public fun interface SpSealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, qualityofprotection: UInt, messagebuffers: ConstPtr<SecBufferDesc>, messagesequencenumber: UInt): Ntstatus
}

public typealias SpSealMessageFn = SpSealMessageFnFn?

public fun interface SpSetContextAttributesFnFn {
    public operator fun invoke(contexthandle: ULong, contextattribute: UInt, buffer: ConstPtr<CVoid>, buffersize: UInt): Ntstatus
}

public typealias SpSetContextAttributesFn = SpSetContextAttributesFnFn?

public fun interface SpSetCredentialsAttributesFnFn {
    public operator fun invoke(credentialhandle: ULong, credentialattribute: UInt, buffer: ConstPtr<CVoid>, buffersize: UInt): Ntstatus
}

public typealias SpSetCredentialsAttributesFn = SpSetCredentialsAttributesFnFn?

public fun interface SpSetExtendedInformationFnFn {
    public operator fun invoke(cls: SecpkgExtendedInformationClass, info: ConstPtr<SecpkgExtendedInformation>): Ntstatus
}

public typealias SpSetExtendedInformationFn = SpSetExtendedInformationFnFn?

public fun interface SpShutdownFnFn {
    public operator fun invoke(): Ntstatus
}

public typealias SpShutdownFn = SpShutdownFnFn?

public fun interface SpUnsealMessageFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: ConstPtr<SecBufferDesc>, messagesequencenumber: UInt, qualityofprotection: MutPtr<UInt>): Ntstatus
}

public typealias SpUnsealMessageFn = SpUnsealMessageFnFn?

public fun interface SpUpdateCredentialsFnFn {
    public operator fun invoke(contexthandle: ULong, credtype: ConstPtr<Guid>, flatcreduicontextlength: UInt, flatcreduicontext: ConstPtr<UByte>): Ntstatus
}

public typealias SpUpdateCredentialsFn = SpUpdateCredentialsFnFn?

public fun interface SpUserModeInitializeFnFn {
    public operator fun invoke(lsaversion: UInt, packageversion: MutPtr<UInt>, pptables: MutPtr<MutPtr<SecpkgUserFunctionTable>>, pctables: MutPtr<UInt>): Ntstatus
}

public typealias SpUserModeInitializeFn = SpUserModeInitializeFnFn?

public fun interface SpValidateTargetInfoFnFn {
    public operator fun invoke(clientrequest: ConstPtr<ConstPtr<CVoid>>, protocolsubmitbuffer: ConstPtr<CVoid>, clientbufferbase: ConstPtr<CVoid>, submitbufferlength: UInt, targetinfo: ConstPtr<SecpkgTargetinfo>): Ntstatus
}

public typealias SpValidateTargetInfoFn = SpValidateTargetInfoFnFn?

public fun interface SpVerifySignatureFnFn {
    public operator fun invoke(contexthandle: ULong, messagebuffers: ConstPtr<SecBufferDesc>, messagesequencenumber: UInt, qualityofprotection: MutPtr<UInt>): Ntstatus
}

public typealias SpVerifySignatureFn = SpVerifySignatureFnFn?

public fun interface SslDeserializeCertificateStoreFnFn {
    public operator fun invoke(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr<MutPtr<CertContext>>): Hresult
}

public typealias SslDeserializeCertificateStoreFn = SslDeserializeCertificateStoreFnFn?

public fun interface SslGetExtensionsFnFn {
    public operator fun invoke(clienthello: ConstPtr<UByte>, clienthellobytesize: UInt, genericextensions: MutPtr<SchExtensionData>, genericextensionscount: UByte, bytestoread: MutPtr<UInt>, flags: SchGetExtensionsOptions): Hresult
}

public typealias SslGetExtensionsFn = SslGetExtensionsFnFn?

public fun interface SslGetServerIdentityFnFn {
    public operator fun invoke(clienthello: ConstPtr<UByte>, clienthellosize: UInt, serveridentity: MutPtr<MutPtr<UByte>>, serveridentitysize: MutPtr<UInt>, flags: UInt): Hresult
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
    public operator fun invoke(param0: MutPtr<SecHandle>, param1: MutPtr<SecBufferDesc>, param2: UInt, param3: MutPtr<UInt>): Hresult
}

public typealias VerifySignatureFn = VerifySignatureFnFn?

public typealias Hmapper = Long

public typealias ETlsAlgorithmUsage = Int

public typealias ETlsHashAlgorithm = Int

public typealias ETlsSignatureAlgorithm = Int
