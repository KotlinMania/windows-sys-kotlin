package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

public expect fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus

public expect fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus

public expect fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus

public expect fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr<CryptContextConfig>): Ntstatus

public expect fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr<CryptContextFunctionConfig>): Ntstatus

public expect fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr<CryptContextConfig>): Ntstatus

public expect fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr<BcryptHashHandle>, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr<BcryptHashHandle>, nhashes: UInt, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pbiv: MutPtr<UByte>, cbiv: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus

public expect fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus

public expect fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr<UByte>, cbpassword: UInt, pbsalt: ConstPtr<UByte>, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus

public expect fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus

public expect fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus

public expect fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr<BcryptHashHandle>, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pbiv: MutPtr<UByte>, cbiv: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr<UInt>, ppalglist: MutPtr<MutPtr<BcryptAlgorithmIdentifier>>, dwflags: UInt): Ntstatus

public expect fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctionProviders>>): Ntstatus

public expect fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctions>>): Ntstatus

public expect fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContexts>>): Ntstatus

public expect fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr<UInt>, ppimpllist: MutPtr<MutPtr<BcryptProviderName>>, dwflags: UInt): Ntstatus

public expect fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviders>>): Ntstatus

public expect fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus

public expect fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus

public expect fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptFreeBuffer(pvbuffer: ConstPtr<CVoid>)

public expect fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr<UByte>, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus

public expect fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr<BcryptKeyHandle>, dwlength: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr<UByte>): Ntstatus

public expect fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus

public expect fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr<UByte>, cbsecret: UInt, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt): Ntstatus

public expect fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr<BcryptKeyHandle>, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus

public expect fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr<BcryptAlgHandle>, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus

public expect fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr<CVoid>, cboperations: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextConfig>>): Ntstatus

public expect fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctionConfig>>): Ntstatus

public expect fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Ntstatus

public expect fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviderReg>>): Ntstatus

public expect fun bCryptRegisterConfigChangeNotify(phevent: MutPtr<Handle>): Ntstatus

public expect fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr<CryptProviderReg>): Ntstatus

public expect fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus

public expect fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus

public expect fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviderRefs>>): Ntstatus

public expect fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr<BcryptSecretHandle>, dwflags: UInt): Ntstatus

public expect fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Ntstatus

public expect fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus

public expect fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus

public expect fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhash: ConstPtr<UByte>, cbhash: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus

public expect fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr<CrlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CrlContext>>): Bool

public expect fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr<CrlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CrlContext>>): Bool

public expect fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr<CtlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CtlContext>>): Bool

public expect fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr<CtlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CtlContext>>): Bool

public expect fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr<CertContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CertContext>>): Bool

public expect fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr<CertContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CertContext>>): Bool

public expect fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr<UByte>, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr<MutPtr<CrlContext>>): Bool

public expect fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr<UByte>, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr<MutPtr<CtlContext>>): Bool

public expect fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr<MutPtr<CertContext>>): Bool

public expect fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): Bool

public expect fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): Bool

public expect fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr<CertContext>, pszusageidentifier: Pcstr): Bool

public expect fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr<CVoid>)

public expect fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr<CertServerOcspResponseContext>)

public expect fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr<UByte>, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr<UInt>, ppvcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool

public expect fun certAlgIdToOID(dwalgid: UInt): Pcstr

public expect fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr<CVoid>, dwflags: UInt)

public expect fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool

public expect fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr<CertInfo>, pcertid2: ConstPtr<CertInfo>): Bool

public expect fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr<CryptIntegerBlob>, pcertname2: ConstPtr<CryptIntegerBlob>): Bool

public expect fun certCompareIntegerBlob(pint1: ConstPtr<CryptIntegerBlob>, pint2: ConstPtr<CryptIntegerBlob>): Bool

public expect fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr<CertPublicKeyInfo>, ppublickey2: ConstPtr<CertPublicKeyInfo>): Bool

public expect fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr<CVoid>): Bool

public expect fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr<UByte>, cbcrlencoded: UInt): MutPtr<CrlContext>

public expect fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr<UByte>, cbctlencoded: UInt): MutPtr<CtlContext>

public expect fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr<CertContext>, coptattr: UInt, rgoptattr: ConstPtr<CryptAttribute>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pctlentry: MutPtr<CtlEntry>, pcbctlentry: MutPtr<UInt>): Bool

public expect fun certCreateCertificateChainEngine(pconfig: ConstPtr<CertChainEngineConfig>, phchainengine: MutPtr<Hcertchainengine>): Bool

public expect fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): MutPtr<CertContext>

public expect fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr<CertCreateContextPara>): MutPtr<CVoid>

public expect fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr<CryptIntegerBlob>, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr<CryptKeyProvInfo>, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pstarttime: ConstPtr<Systemtime>, pendtime: ConstPtr<Systemtime>, pextensions: ConstPtr<CertExtensions>): MutPtr<CertContext>

public expect fun certDeleteCRLFromStore(pcrlcontext: ConstPtr<CrlContext>): Bool

public expect fun certDeleteCTLFromStore(pctlcontext: ConstPtr<CtlContext>): Bool

public expect fun certDeleteCertificateFromStore(pcertcontext: ConstPtr<CertContext>): Bool

public expect fun certDuplicateCRLContext(pcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext>

public expect fun certDuplicateCTLContext(pctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext>

public expect fun certDuplicateCertificateChain(pchaincontext: ConstPtr<CertChainContext>): MutPtr<CertChainContext>

public expect fun certDuplicateCertificateContext(pcertcontext: ConstPtr<CertContext>): MutPtr<CertContext>

public expect fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore

public expect fun certEnumCRLContextProperties(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt): UInt

public expect fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext>

public expect fun certEnumCTLContextProperties(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt): UInt

public expect fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext>

public expect fun certEnumCertificateContextProperties(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt): UInt

public expect fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr<CertContext>): MutPtr<CertContext>

public expect fun certEnumPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumPhysicalStore): Bool

public expect fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr<CtlContext>, ppvnextsubject: MutPtr<MutPtr<CVoid>>, psubjectidentifier: MutPtr<CryptIntegerBlob>, pencodedattributes: MutPtr<CryptIntegerBlob>): Bool

public expect fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr<CVoid>, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumSystemStore): Bool

public expect fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumSystemStoreLocation): Bool

public expect fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr<CryptAttribute>): MutPtr<CryptAttribute>

public expect fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr<CVoid>, pprevcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext>

public expect fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr<CVoid>, pprevctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext>

public expect fun certFindCertificateInCRL(pcert: ConstPtr<CertContext>, pcrlcontext: ConstPtr<CrlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppcrlentry: MutPtr<MutPtr<CrlEntry>>): Bool

public expect fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr<CVoid>, pprevcertcontext: ConstPtr<CertContext>): MutPtr<CertContext>

public expect fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr<CVoid>, pprevchaincontext: ConstPtr<CertChainContext>): MutPtr<CertChainContext>

public expect fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr<CertExtension>): MutPtr<CertExtension>

public expect fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr<CertNameInfo>): MutPtr<CertRdnAttr>

public expect fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, pctlcontext: ConstPtr<CtlContext>, dwflags: UInt): MutPtr<CtlEntry>

public expect fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr<CryptIntegerBlob>, pctlcontext: ConstPtr<CtlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pencodedattributes: MutPtr<CryptIntegerBlob>): Bool

public expect fun certFreeCRLContext(pcrlcontext: ConstPtr<CrlContext>): Bool

public expect fun certFreeCTLContext(pctlcontext: ConstPtr<CtlContext>): Bool

public expect fun certFreeCertificateChain(pchaincontext: ConstPtr<CertChainContext>)

public expect fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine)

public expect fun certFreeCertificateChainList(prgpselection: ConstPtr<ConstPtr<CertChainContext>>)

public expect fun certFreeCertificateContext(pcertcontext: ConstPtr<CertContext>): Bool

public expect fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr<CertServerOcspResponseContext>)

public expect fun certGetCRLContextProperty(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool

public expect fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr<CertContext>, pprevcrlcontext: ConstPtr<CrlContext>, pdwflags: MutPtr<UInt>): MutPtr<CrlContext>

public expect fun certGetCTLContextProperty(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool

public expect fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr<CertContext>, ptime: ConstPtr<Filetime>, hadditionalstore: Hcertstore, pchainpara: ConstPtr<CertChainPara>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppchaincontext: MutPtr<MutPtr<CertChainContext>>): Bool

public expect fun certGetCertificateContextProperty(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool

public expect fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr<CertContext>, dwflags: UInt, pusage: MutPtr<CtlUsage>, pcbusage: MutPtr<UInt>): Bool

public expect fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr<CertInfo>, pbkeyusage: MutPtr<UByte>, cbkeyusage: UInt): Bool

public expect fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr<CertContext>, pprevissuercontext: ConstPtr<CertContext>, pdwflags: MutPtr<UInt>): MutPtr<CertContext>

public expect fun certGetNameStringA(pcertcontext: ConstPtr<CertContext>, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr<CVoid>, psznamestring: Pstr, cchnamestring: UInt): UInt

public expect fun certGetNameStringW(pcertcontext: ConstPtr<CertContext>, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr<CVoid>, psznamestring: Pwstr, cchnamestring: UInt): UInt

public expect fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr<CertPublicKeyInfo>): UInt

public expect fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertServerOcspResponseContext>

public expect fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool

public expect fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr<CertInfo>): MutPtr<CertContext>

public expect fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr<ConstPtr<CertContext>>, cnumoids: MutPtr<Int>, rghoids: MutPtr<Pstr>, pcboids: MutPtr<UInt>): Bool

public expect fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr<CryptIntegerBlob>, prdn: ConstPtr<CertRdn>): Bool

public expect fun certIsStrongHashToSign(pstrongsignpara: ConstPtr<CertStrongSignPara>, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr<CertContext>): Bool

public expect fun certIsValidCRLForCertificate(pcert: ConstPtr<CertContext>, pcrl: ConstPtr<CrlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool

public expect fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr<CertChainContext>, ptimestamp: ConstPtr<Filetime>, pwszfilename: Pcwstr): Bool

public expect fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr<CryptIntegerBlob>, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt

public expect fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr<CryptIntegerBlob>, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt

public expect fun certOIDToAlgId(pszobjid: Pcstr): UInt

public expect fun certOpenServerOcspResponse(pchaincontext: ConstPtr<CertChainContext>, dwflags: UInt, popenpara: ConstPtr<CertServerOcspResponseOpenPara>): MutPtr<CVoid>

public expect fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr<CVoid>): Hcertstore

public expect fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore

public expect fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore

public expect fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr<CryptIntegerBlob>, psz: Pstr, csz: UInt): UInt

public expect fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr<CryptIntegerBlob>, psz: Pwstr, csz: UInt): UInt

public expect fun certRegisterPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr<CertPhysicalStoreInfo>, pvreserved: ConstPtr<CVoid>): Bool

public expect fun certRegisterSystemStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pstoreinfo: ConstPtr<CertSystemStoreInfo>, pvreserved: ConstPtr<CVoid>): Bool

public expect fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr<CertContext>, pszusageidentifier: Pcstr): Bool

public expect fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore)

public expect fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool

public expect fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr<CertContext>, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppbdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>, ppwszmimetype: MutPtr<Pwstr>): Bool

public expect fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr<CVoid>, dwflags: UInt): Bool

public expect fun certSelectCertificateChains(pselectioncontext: ConstPtr<Guid>, dwflags: UInt, pchainparameters: ConstPtr<CertSelectChainPara>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, hstore: Hcertstore, pcselection: MutPtr<UInt>, pprgpselection: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Bool

public expect fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr<CrlContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool

public expect fun certSerializeCTLStoreElement(pctlcontext: ConstPtr<CtlContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool

public expect fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr<CertContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool

public expect fun certSetCRLContextProperty(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool

public expect fun certSetCTLContextProperty(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool

public expect fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr<CertContext>, pctlentry: ConstPtr<CtlEntry>, dwflags: UInt): Bool

public expect fun certSetCertificateContextProperty(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool

public expect fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr<CertContext>, pusage: ConstPtr<CtlUsage>): Bool

public expect fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool

public expect fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>, ppszerror: MutPtr<Pcstr>): Bool

public expect fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>, ppszerror: MutPtr<Pcwstr>): Bool

public expect fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pwszstorename: Pcwstr): Bool

public expect fun certUnregisterSystemStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt): Bool

public expect fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr<CertInfo>, ccrlinfo: UInt, rgpcrlinfo: ConstPtr<ConstPtr<CrlInfo>>): Bool

public expect fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr<Filetime>, pcrlinfo: ConstPtr<CrlInfo>): Int

public expect fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, psubjectusage: ConstPtr<CtlUsage>, dwflags: UInt, pverifyusagepara: ConstPtr<CtlVerifyUsagePara>, pverifyusagestatus: MutPtr<CtlVerifyUsageStatus>): Bool

public expect fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr<CertChainContext>, ppolicypara: ConstPtr<CertChainPolicyPara>, ppolicystatus: MutPtr<CertChainPolicyStatus>): Bool

public expect fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr<ConstPtr<CVoid>>, dwflags: UInt, prevpara: ConstPtr<CertRevocationPara>, prevstatus: MutPtr<CertRevocationStatus>): Bool

public expect fun certVerifySubjectCertificateContext(psubject: ConstPtr<CertContext>, pissuer: ConstPtr<CertContext>, pdwflags: MutPtr<UInt>): Bool

public expect fun certVerifyTimeValidity(ptimetoverify: ConstPtr<Filetime>, pcertinfo: ConstPtr<CertInfo>): Int

public expect fun certVerifyValidityNesting(psubjectinfo: ConstPtr<CertInfo>, pissuerinfo: ConstPtr<CertInfo>): Bool

public expect fun closeCryptoHandle(hcrypto: ConstPtr<InformationcardCryptoHandle>): Hresult

public expect fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr<CertContext>, dwflags: CryptAcquireFlags, pvparameters: ConstPtr<CVoid>, phcryptprovorncryptkey: MutPtr<HcryptprovOrNcryptKeyHandle>, pdwkeyspec: MutPtr<CertKeySpec>, pfcallerfreeprovorncryptkey: MutPtr<Bool>): Bool

public expect fun cryptAcquireContextA(phprov: MutPtr<ULong>, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool

public expect fun cryptAcquireContextW(phprov: MutPtr<ULong>, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool

public expect fun cryptBinaryToStringA(pbbinary: ConstPtr<UByte>, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr<UInt>): Bool

public expect fun cryptBinaryToStringW(pbbinary: ConstPtr<UByte>, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr<UInt>): Bool

public expect fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool

public expect fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool

public expect fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr<Hcryptasync>): Bool

public expect fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr<ULong>): Bool

public expect fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr<Publickeystruc>, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pbhash: MutPtr<UByte>, pcbhash: MutPtr<UInt>): Bool

public expect fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbencodedblob: ConstPtr<UByte>, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr<UInt>, pdwinnercontenttype: MutPtr<UInt>, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool

public expect fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr<CVoid>, pcbstructinfo: MutPtr<UInt>): Bool

public expect fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr<CryptDecodePara>, pvstructinfo: MutPtr<CVoid>, pcbstructinfo: MutPtr<UInt>): Bool

public expect fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>): Bool

public expect fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbencryptedblob: ConstPtr<UByte>, cbencryptedblob: UInt, pbdecrypted: MutPtr<UByte>, pcbdecrypted: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool

public expect fun cryptDecryptMessage(pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pbencryptedblob: ConstPtr<UByte>, cbencryptedblob: UInt, pbdecrypted: MutPtr<UByte>, pcbdecrypted: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>): Bool

public expect fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr<ULong>): Bool

public expect fun cryptDestroyHash(hhash: ULong): Bool

public expect fun cryptDestroyKey(hkey: ULong): Bool

public expect fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt, phhash: MutPtr<ULong>): Bool

public expect fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt, phkey: MutPtr<ULong>): Bool

public expect fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool

public expect fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr<CryptEncodePara>, pvencoded: MutPtr<CVoid>, pcbencoded: MutPtr<UInt>): Bool

public expect fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwbuflen: UInt): Bool

public expect fun cryptEncryptMessage(pencryptpara: ConstPtr<CryptEncryptMessagePara>, crecipientcert: UInt, rgprecipientcert: ConstPtr<ConstPtr<CertContext>>, pbtobeencrypted: ConstPtr<UByte>, cbtobeencrypted: UInt, pbencryptedblob: MutPtr<UByte>, pcbencryptedblob: MutPtr<UInt>): Bool

public expect fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvarg: MutPtr<CVoid>, pfnenum: PfnCryptEnumKeyidProp): Bool

public expect fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool

public expect fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool

public expect fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, sztypename: Pstr, pcbtypename: MutPtr<UInt>): Bool

public expect fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, sztypename: Pwstr, pcbtypename: MutPtr<UInt>): Bool

public expect fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, szprovname: Pstr, pcbprovname: MutPtr<UInt>): Bool

public expect fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, szprovname: Pwstr, pcbprovname: MutPtr<UInt>): Bool

public expect fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>): Bool

public expect fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pbprivatekeyblob: MutPtr<UByte>, pcbprivatekeyblob: MutPtr<UInt>): Bool

public expect fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool

public expect fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool

public expect fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool

public expect fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr<CertContext>, dwflags: CryptFindFlags, pvreserved: ConstPtr<CVoid>): Bool

public expect fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr

public expect fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr<CVoid>, dwgroupid: UInt): MutPtr<CryptOidInfo>

public expect fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr<CVoid>, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbformat: MutPtr<CVoid>, pcbformat: MutPtr<UInt>): Bool

public expect fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr<CVoid>, dwflags: UInt): Bool

public expect fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr<ULong>): Bool

public expect fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr<UByte>): Bool

public expect fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr<MutPtr<CVoid>>, ppfnfree: MutPtr<PfnCryptAsyncParamFreeFunc>): Bool

public expect fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr<UInt>): Bool

public expect fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr<MutPtr<CVoid>>, phfuncaddr: MutPtr<MutPtr<CVoid>>): Bool

public expect fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr<UInt>): Bool

public expect fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr<UInt>): Bool

public expect fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool

public expect fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt): Hcertstore

public expect fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt): Int

public expect fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr<MutPtr<CVoid>>, phfuncaddr: MutPtr<MutPtr<CVoid>>): Bool

public expect fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr<UInt>, pbvaluedata: MutPtr<UByte>, pcbvaluedata: MutPtr<UInt>): Bool

public expect fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr<CVoid>, dwflags: CryptGetUrlFlags, purlarray: MutPtr<CryptUrlArray>, pcburlarray: MutPtr<UInt>, purlinfo: MutPtr<CryptUrlInfo>, pcburlinfo: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Bool

public expect fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool

public expect fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr<ULong>): Bool

public expect fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptHashData(hhash: ULong, pbdata: ConstPtr<UByte>, dwdatalen: UInt, dwflags: UInt): Bool

public expect fun cryptHashMessage(phashpara: ConstPtr<CryptHashMessagePara>, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr<ConstPtr<UByte>>, rgcbtobehashed: ConstPtr<UInt>, pbhashedblob: MutPtr<UByte>, pcbhashedblob: MutPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool

public expect fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptImportKey(hprov: ULong, pbdata: ConstPtr<UByte>, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr<ULong>): Bool

public expect fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr<ULong>, pvauxinfo: ConstPtr<CVoid>): Bool

public expect fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, phkey: MutPtr<ULong>): Bool

public expect fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, phkey: MutPtr<ULong>): Bool

public expect fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr<CVoid>, phkey: MutPtr<BcryptKeyHandle>): Bool

public expect fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr<CVoid>

public expect fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool

public expect fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr<CVoid>, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr<CVoid>, phdefaultcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr<CryptOidFuncEntry>, dwflags: UInt): Bool

public expect fun cryptMemAlloc(cbsize: UInt): MutPtr<CVoid>

public expect fun cryptMemFree(pv: ConstPtr<CVoid>)

public expect fun cryptMemRealloc(pv: ConstPtr<CVoid>, cbsize: UInt): MutPtr<CVoid>

public expect fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr<CVoid>, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt

public expect fun cryptMsgClose(hcryptmsg: ConstPtr<CVoid>): Bool

public expect fun cryptMsgControl(hcryptmsg: ConstPtr<CVoid>, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr<CVoid>): Bool

public expect fun cryptMsgCountersign(hcryptmsg: ConstPtr<CVoid>, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr<CmsgSignerEncodeInfo>): Bool

public expect fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr<CmsgSignerEncodeInfo>, pbcountersignature: MutPtr<UByte>, pcbcountersignature: MutPtr<UInt>): Bool

public expect fun cryptMsgDuplicate(hcryptmsg: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr<CtlInfo>, psigninfo: ConstPtr<CmsgSignedEncodeInfo>, dwflags: UInt, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool

public expect fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr<CVoid>, csignerstore: UInt, rghsignerstore: ConstPtr<Hcertstore>, dwflags: UInt, ppsigner: MutPtr<MutPtr<CertContext>>, pdwsignerindex: MutPtr<UInt>): Bool

public expect fun cryptMsgGetParam(hcryptmsg: ConstPtr<CVoid>, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool

public expect fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr<CertInfo>, pstreaminfo: ConstPtr<CmsgStreamInfo>): MutPtr<CVoid>

public expect fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr<CVoid>, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr<CmsgStreamInfo>): MutPtr<CVoid>

public expect fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr<UByte>, cbctlcontent: UInt, psigninfo: ConstPtr<CmsgSignedEncodeInfo>, dwflags: UInt, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool

public expect fun cryptMsgUpdate(hcryptmsg: ConstPtr<CVoid>, pbdata: ConstPtr<UByte>, cbdata: UInt, ffinal: Bool): Bool

public expect fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr<UByte>, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr<CertInfo>): Bool

public expect fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr<UByte>, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr<CVoid>, dwflags: UInt, pvextra: MutPtr<CVoid>): Bool

public expect fun cryptProtectData(pdatain: ConstPtr<CryptIntegerBlob>, szdatadescr: Pcwstr, poptionalentropy: ConstPtr<CryptIntegerBlob>, pvreserved: ConstPtr<CVoid>, ppromptstruct: ConstPtr<CryptprotectPromptstruct>, dwflags: UInt, pdataout: MutPtr<CryptIntegerBlob>): Bool

public expect fun cryptProtectMemory(pdatain: MutPtr<CVoid>, cbdatain: UInt, dwflags: UInt): Bool

public expect fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr<CVoid>, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr<CertQueryEncodingType>, pdwcontenttype: MutPtr<CertQueryContentType>, pdwformattype: MutPtr<CertQueryFormatType>, phcertstore: MutPtr<Hcertstore>, phmsg: MutPtr<MutPtr<CVoid>>, ppvcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool

public expect fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool

public expect fun cryptRegisterOIDInfo(pinfo: ConstPtr<CryptOidInfo>, dwflags: UInt): Bool

public expect fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool

public expect fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr<MutPtr<CVoid>>, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr<CryptCredentials>, pvverify: ConstPtr<CVoid>, pauxinfo: MutPtr<CryptRetrieveAuxInfo>): Bool

public expect fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr<MutPtr<CVoid>>, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr<CryptCredentials>, pvverify: ConstPtr<CVoid>, pauxinfo: MutPtr<CryptRetrieveAuxInfo>): Bool

public expect fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr<CryptTimestampPara>, pbdata: ConstPtr<UByte>, cbdata: UInt, pptscontext: MutPtr<MutPtr<CryptTimestampContext>>, pptssigner: MutPtr<MutPtr<CertContext>>, phstore: MutPtr<Hcertstore>): Bool

public expect fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr<CVoid>, pfnfree: PfnCryptAsyncParamFreeFunc): Bool

public expect fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool

public expect fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvdata: ConstPtr<CVoid>): Bool

public expect fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool

public expect fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr<UByte>, cbvaluedata: UInt): Bool

public expect fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool

public expect fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool

public expect fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool

public expect fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool

public expect fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool

public expect fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pvhashauxinfo: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool

public expect fun cryptSignAndEncryptMessage(psignpara: ConstPtr<CryptSignMessagePara>, pencryptpara: ConstPtr<CryptEncryptMessagePara>, crecipientcert: UInt, rgprecipientcert: ConstPtr<ConstPtr<CertContext>>, pbtobesignedandencrypted: ConstPtr<UByte>, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr<UByte>, pcbsignedandencryptedblob: MutPtr<UInt>): Bool

public expect fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr<UByte>, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pvhashauxinfo: ConstPtr<CVoid>, pbsignature: MutPtr<UByte>, pcbsignature: MutPtr<UInt>): Bool

public expect fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr<UByte>, pdwsiglen: MutPtr<UInt>): Bool

public expect fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr<UByte>, pdwsiglen: MutPtr<UInt>): Bool

public expect fun cryptSignMessage(psignpara: ConstPtr<CryptSignMessagePara>, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr<ConstPtr<UByte>>, rgcbtobesigned: ConstPtr<UInt>, pbsignedblob: MutPtr<UByte>, pcbsignedblob: MutPtr<UInt>): Bool

public expect fun cryptSignMessageWithKey(psignpara: ConstPtr<CryptKeySignMessagePara>, pbtobesigned: ConstPtr<UByte>, cbtobesigned: UInt, pbsignedblob: MutPtr<UByte>, pcbsignedblob: MutPtr<UInt>): Bool

public expect fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr<UByte>, pcbbinary: MutPtr<UInt>, pdwskip: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool

public expect fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr<UByte>, pcbbinary: MutPtr<UInt>, pdwskip: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool

public expect fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool

public expect fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool

public expect fun cryptUnprotectData(pdatain: ConstPtr<CryptIntegerBlob>, ppszdatadescr: MutPtr<Pwstr>, poptionalentropy: ConstPtr<CryptIntegerBlob>, pvreserved: ConstPtr<CVoid>, ppromptstruct: ConstPtr<CryptprotectPromptstruct>, dwflags: UInt, pdataout: MutPtr<CryptIntegerBlob>): Bool

public expect fun cryptUnprotectMemory(pdatain: MutPtr<CVoid>, cbdatain: UInt, dwflags: UInt): Bool

public expect fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool

public expect fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool

public expect fun cryptUnregisterOIDInfo(pinfo: ConstPtr<CryptOidInfo>): Bool

public expect fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr<UInt>, pdwfailurecount: MutPtr<UInt>): Bool

public expect fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr<UByte>, cbencoded: UInt, ppublickey: ConstPtr<CertPublicKeyInfo>): Bool

public expect fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, dwissuertype: UInt, pvissuer: ConstPtr<CVoid>, dwflags: CryptVerifyCertFlags, pvextra: MutPtr<CVoid>): Bool

public expect fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr<CryptHashMessagePara>, pbdetachedhashblob: ConstPtr<UByte>, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr<ConstPtr<UByte>>, rgcbtobehashed: ConstPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr<UByte>, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr<ConstPtr<UByte>>, rgcbtobesigned: ConstPtr<UInt>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool

public expect fun cryptVerifyMessageHash(phashpara: ConstPtr<CryptHashMessagePara>, pbhashedblob: ConstPtr<UByte>, cbhashedblob: UInt, pbtobehashed: MutPtr<UByte>, pcbtobehashed: MutPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool

public expect fun cryptVerifyMessageSignature(pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool

public expect fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr<CryptKeyVerifyMessagePara>, ppublickeyinfo: ConstPtr<CertPublicKeyInfo>, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>): Bool

public expect fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr<UByte>, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool

public expect fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr<UByte>, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool

public expect fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr<UByte>, cbtscontentinfo: UInt, pbdata: ConstPtr<UByte>, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr<MutPtr<CryptTimestampContext>>, pptssigner: MutPtr<MutPtr<CertContext>>, phstore: MutPtr<Hcertstore>): Bool

public expect fun cryptXmlAddObject(hsignatureorobject: ConstPtr<CVoid>, dwflags: UInt, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, ppobject: MutPtr<MutPtr<CryptXmlObject>>): Hresult

public expect fun cryptXmlClose(hcryptxml: ConstPtr<CVoid>): Hresult

public expect fun cryptXmlCreateReference(hcryptxml: ConstPtr<CVoid>, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr<CryptXmlAlgorithm>, ctransform: UInt, rgtransform: ConstPtr<CryptXmlAlgorithm>, phreference: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun cryptXmlDigestReference(hreference: ConstPtr<CVoid>, dwflags: UInt, pdataproviderin: ConstPtr<CryptXmlDataProvider>): Hresult

public expect fun cryptXmlEncode(hcryptxml: ConstPtr<CVoid>, dwcharset: CryptXmlCharset, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pvcallbackstate: MutPtr<CVoid>, pfnwrite: PfnCryptXmlWriteCallback): Hresult

public expect fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult

public expect fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr<CVoid>, dwgroupid: UInt, dwflags: UInt): MutPtr<CryptXmlAlgorithmInfo>

public expect fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr<CryptXmlAlgorithm>, dwflags: CryptXmlFlags, ppalginfo: MutPtr<MutPtr<CryptXmlAlgorithmInfo>>): Hresult

public expect fun cryptXmlGetDocContext(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlDocCtxt>>): Hresult

public expect fun cryptXmlGetReference(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlReference>>): Hresult

public expect fun cryptXmlGetSignature(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlSignature>>): Hresult

public expect fun cryptXmlGetStatus(hcryptxml: ConstPtr<CVoid>, pstatus: MutPtr<CryptXmlStatus>): Hresult

public expect fun cryptXmlGetTransforms(ppconfig: MutPtr<MutPtr<CryptXmlTransformChainConfig>>): Hresult

public expect fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr<CryptXmlKeyValue>, phkey: MutPtr<BcryptKeyHandle>): Hresult

public expect fun cryptXmlOpenToDecode(pconfig: ConstPtr<CryptXmlTransformChainConfig>, dwflags: CryptXmlFlags, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, phcryptxml: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun cryptXmlOpenToEncode(pconfig: ConstPtr<CryptXmlTransformChainConfig>, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, phsignature: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun cryptXmlSetHMACSecret(hsignature: ConstPtr<CVoid>, pbsecret: ConstPtr<UByte>, cbsecret: UInt): Hresult

public expect fun cryptXmlSign(hsignature: ConstPtr<CVoid>, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr<CVoid>, psignaturemethod: ConstPtr<CryptXmlAlgorithm>, pcanonicalization: ConstPtr<CryptXmlAlgorithm>): Hresult

public expect fun cryptXmlVerifySignature(hsignature: ConstPtr<CVoid>, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult

public expect fun decrypt(hcrypto: ConstPtr<InformationcardCryptoHandle>, foaep: Bool, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult

public expect fun encrypt(hcrypto: ConstPtr<InformationcardCryptoHandle>, foaep: Bool, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult

public expect fun findCertsByIssuer(pcertchains: MutPtr<CertChain>, pcbcertchains: MutPtr<UInt>, pccertchains: MutPtr<UInt>, pbencodedissuername: ConstPtr<UByte>, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult

public expect fun freeToken(pallocmemory: ConstPtr<GenericXmlToken>): Bool

public expect fun generateDerivedKey(hcrypto: ConstPtr<InformationcardCryptoHandle>, cblabel: UInt, plabel: ConstPtr<UByte>, cbnonce: UInt, pnonce: ConstPtr<UByte>, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr<UInt>, ppkey: MutPtr<MutPtr<UByte>>): Hresult

public expect fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptAsymmetricEncryptionFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr<CVoid>, pcbtoken: MutPtr<UInt>, pptoken: MutPtr<MutPtr<UByte>>): Hresult

public expect fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptCipherFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getCryptoTransform(hsymmetriccrypto: ConstPtr<InformationcardCryptoHandle>, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr<UByte>, pphtransform: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult

public expect fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptHashFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptKeyDerivationFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<NcryptKeyStorageFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getKeyedHash(hsymmetriccrypto: ConstPtr<InformationcardCryptoHandle>, pphhash: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult

public expect fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptRngFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<NcryptSslFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptSecretAgreementFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptSignatureFunctionTable>>, dwflags: UInt): Ntstatus

public expect fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr<PolicyElement>, securitytoken: MutPtr<MutPtr<GenericXmlToken>>, phprooftokencrypto: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult

public expect fun hashCore(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>): Hresult

public expect fun hashFinal(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult

public expect fun importInformationCard(filename: Pcwstr): Hresult

public expect fun manageCardSpace(): Hresult

public expect fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult

public expect fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbclaimblob: MutPtr<UByte>, cbclaimblob: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult

public expect fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr<NcryptDescriptorHandle>): Hresult

public expect fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult

public expect fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult

public expect fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult

public expect fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr<UInt>, ppalglist: MutPtr<MutPtr<NCryptAlgorithmName>>, dwflags: UInt): Hresult

public expect fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr<MutPtr<NCryptKeyName>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: NcryptFlags): Hresult

public expect fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr<UInt>, ppproviderlist: MutPtr<MutPtr<NCryptProviderName>>, dwflags: UInt): Hresult

public expect fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult

public expect fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult

public expect fun nCryptFreeBuffer(pvinput: MutPtr<CVoid>): Hresult

public expect fun nCryptFreeObject(hobject: NcryptHandle): Hresult

public expect fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: ObjectSecurityInformation): Hresult

public expect fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr<NcryptAllocPara>, dwinfotype: UInt, ppvinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, phkey: MutPtr<NcryptKeyHandle>, pbdata: ConstPtr<UByte>, cbdata: UInt, dwflags: NcryptFlags): Hresult

public expect fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool

public expect fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr<Handle>, dwflags: NcryptFlags): Hresult

public expect fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult

public expect fun nCryptOpenStorageProvider(phprovider: MutPtr<NcryptProvHandle>, pszprovidername: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr<UByte>, cbdata: UInt, pmempara: ConstPtr<NcryptAllocPara>, hwnd: Hwnd, ppbprotectedblob: MutPtr<MutPtr<UByte>>, pcbprotectedblob: MutPtr<UInt>): Hresult

public expect fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr<ULong>, dwflags: UInt): Hresult

public expect fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr<NcryptSecretHandle>, dwflags: NcryptFlags): Hresult

public expect fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: NcryptFlags): Hresult

public expect fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: MutPtr<UByte>, cbsignature: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult

public expect fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult

public expect fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr<NcryptProtectStreamInfo>, phstream: MutPtr<NcryptStreamHandle>): Hresult

public expect fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr<NcryptProtectStreamInfo>, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr<NcryptStreamHandle>): Hresult

public expect fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr<NcryptProtectStreamInfoEx>, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr<NcryptStreamHandle>): Hresult

public expect fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr<UByte>, cbdata: ULong, ffinal: Bool): Hresult

public expect fun nCryptTranslateHandle(phprovider: MutPtr<NcryptProvHandle>, phkey: MutPtr<NcryptKeyHandle>, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult

public expect fun nCryptUnprotectSecret(phdescriptor: MutPtr<NcryptDescriptorHandle>, dwflags: NcryptFlags, pbprotectedblob: ConstPtr<UByte>, cbprotectedblob: UInt, pmempara: ConstPtr<NcryptAllocPara>, hwnd: Hwnd, ppbdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>): Hresult

public expect fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbclaimblob: ConstPtr<UByte>, cbclaimblob: UInt, poutput: MutPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: NcryptFlags): Hresult

public expect fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: UInt): Bool

public expect fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr<CryptIntegerBlob>, szpassword: Pcwstr, pvpara: ConstPtr<CVoid>, dwflags: UInt): Bool

public expect fun pFXImportCertStore(ppfx: ConstPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore

public expect fun pFXIsPFXBlob(ppfx: ConstPtr<CryptIntegerBlob>): Bool

public expect fun pFXVerifyPassword(ppfx: ConstPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: UInt): Bool

public expect fun processPrng(pbdata: MutPtr<UByte>, cbdata: ULong): Bool

public expect fun signError(): Hresult

public expect fun signHash(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbhash: UInt, phash: ConstPtr<UByte>, hashalgoid: Pcwstr, pcbsig: MutPtr<UInt>, ppsig: MutPtr<MutPtr<UByte>>): Hresult

public expect fun signerFreeSignerContext(psignercontext: ConstPtr<SignerContext>): Hresult

public expect fun signerSign(psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>): Hresult

public expect fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult

public expect fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, preserved: ConstPtr<CVoid>): Hresult

public expect fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, pdigestsigninfo: ConstPtr<SignerDigestSignInfo>, preserved: ConstPtr<CVoid>): Hresult

public expect fun signerTimeStamp(psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>): Hresult

public expect fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult

public expect fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult

public expect fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, preserved: ConstPtr<CVoid>): Hresult

public expect fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult

public expect fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr<UByte>, cbrandoms: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Hresult

public expect fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr<NcryptHashHandle>, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult

public expect fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr<UByte>, cbparams: UInt, dwflags: UInt): Hresult

public expect fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr<NcryptHashHandle>, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult

public expect fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult

public expect fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, sequencenumber: ULong, dwflags: UInt): Hresult

public expect fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr<NcryptHashHandle>, dwflags: UInt): Hresult

public expect fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult

public expect fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr<MutPtr<NcryptSslCipherSuite>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult

public expect fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr<MutPtr<NcryptSslCipherSuiteEx>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult

public expect fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr<UInt>, ppecccurve: MutPtr<MutPtr<NcryptSslEccCurve>>, dwflags: UInt): Hresult

public expect fun sslEnumProtocolProviders(pdwprovidercount: MutPtr<UInt>, ppproviderlist: MutPtr<MutPtr<NCryptProviderName>>, dwflags: UInt): Hresult

public expect fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr<UByte>, cbticketnonce: UInt, phpresharedkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr<NcryptKeyHandle>, phservertraffickey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr<UByte>, cbrandoms: UInt, pbcontextvalue: ConstPtr<UByte>, cbcontextvalue: UShort, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Hresult

public expect fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslFreeBuffer(pvinput: MutPtr<CVoid>): Hresult

public expect fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult

public expect fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr<NcryptKeyHandle>, phwritekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult

public expect fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult

public expect fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr<MutPtr<UByte>>, pcboutput: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr<MutPtr<UByte>>, pcboutput: MutPtr<UInt>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult

public expect fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Hresult

public expect fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszblobtype: Pcwstr, pbkeyblob: ConstPtr<UByte>, cbkeyblob: UInt, dwflags: UInt): Hresult

public expect fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbencryptedkey: ConstPtr<UByte>, cbencryptedkey: UInt, dwflags: UInt): Hresult

public expect fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult

public expect fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr<NcryptSslCipherLengths>, cbcipherlengths: UInt, dwflags: UInt): Hresult

public expect fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr<NcryptSslCipherSuite>, dwflags: UInt): Hresult

public expect fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr<NcryptKeyHandle>, pcertcontext: ConstPtr<CertContext>, dwflags: UInt): Hresult

public expect fun sslOpenProvider(phsslprovider: MutPtr<NcryptProvHandle>, pszprovidername: Pcwstr, dwflags: UInt): Hresult

public expect fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: MutPtr<UByte>, cbsignature: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult

public expect fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: UInt): Hresult

public expect fun systemPrng(pbrandomdata: MutPtr<UByte>, cbrandomdata: ULong): Bool

public expect fun transformBlock(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult

public expect fun transformFinalBlock(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult

public expect fun verifyHash(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbhash: UInt, phash: ConstPtr<UByte>, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr<UByte>, pfverified: MutPtr<Bool>): Hresult
