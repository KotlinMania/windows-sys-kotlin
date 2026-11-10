package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

public expect fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus

public expect fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus

public expect fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus

public expect fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus

public expect fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: COpaquePointer?): Ntstatus

public expect fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus

public expect fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, nhashes: UInt, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus

public expect fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: COpaquePointer?, cbpassword: UInt, pbsalt: COpaquePointer?, cbsalt: UInt, citerations: ULong, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus

public expect fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus

public expect fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus

public expect fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: COpaquePointer?, ppimpllist: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptEnumRegisteredProviders(pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus

public expect fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptFreeBuffer(pvbuffer: COpaquePointer?)

public expect fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: COpaquePointer?, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus

public expect fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, dwlength: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptGetFipsAlgorithmMode(pfenabled: COpaquePointer?): Ntstatus

public expect fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: COpaquePointer?, cbsecret: UInt, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt): Ntstatus

public expect fun bCryptHashData(hhash: BcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptOpenAlgorithmProvider(phalgorithm: COpaquePointer?, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus

public expect fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: COpaquePointer?, cboperations: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Ntstatus

public expect fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptRegisterConfigChangeNotify(phevent: COpaquePointer?): Ntstatus

public expect fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: COpaquePointer?): Ntstatus

public expect fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus

public expect fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus

public expect fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus

public expect fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: COpaquePointer?): Ntstatus

public expect fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus

public expect fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus

public expect fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhash: COpaquePointer?, cbhash: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus

public expect fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool

public expect fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool

public expect fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool

public expect fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool

public expect fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool

public expect fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool

public expect fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: COpaquePointer?): Bool

public expect fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: COpaquePointer?, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: COpaquePointer?): Bool

public expect fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: COpaquePointer?): Bool

public expect fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool

public expect fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool

public expect fun certAddEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool

public expect fun certAddRefServerOcspResponse(hserverocspresponse: COpaquePointer?)

public expect fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?)

public expect fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: COpaquePointer?, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: COpaquePointer?, ppvcontext: COpaquePointer?): Bool

public expect fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool

public expect fun certAlgIdToOID(dwalgid: UInt): Pcstr

public expect fun certCloseServerOcspResponse(hserverocspresponse: COpaquePointer?, dwflags: UInt)

public expect fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool

public expect fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: COpaquePointer?, pcertid2: COpaquePointer?): Bool

public expect fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: COpaquePointer?, pcertname2: COpaquePointer?): Bool

public expect fun certCompareIntegerBlob(pint1: COpaquePointer?, pint2: COpaquePointer?): Bool

public expect fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: COpaquePointer?, ppublickey2: COpaquePointer?): Bool

public expect fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool

public expect fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt): COpaquePointer?

public expect fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: COpaquePointer?, cbctlencoded: UInt): COpaquePointer?

public expect fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: COpaquePointer?, coptattr: UInt, rgoptattr: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pctlentry: COpaquePointer?, pcbctlentry: COpaquePointer?): Bool

public expect fun certCreateCertificateChainEngine(pconfig: COpaquePointer?, phchainengine: COpaquePointer?): Bool

public expect fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): COpaquePointer?

public expect fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pcreatepara: COpaquePointer?): COpaquePointer?

public expect fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: COpaquePointer?, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pstarttime: COpaquePointer?, pendtime: COpaquePointer?, pextensions: COpaquePointer?): COpaquePointer?

public expect fun certDeleteCRLFromStore(pcrlcontext: COpaquePointer?): Bool

public expect fun certDeleteCTLFromStore(pctlcontext: COpaquePointer?): Bool

public expect fun certDeleteCertificateFromStore(pcertcontext: COpaquePointer?): Bool

public expect fun certDuplicateCRLContext(pcrlcontext: COpaquePointer?): COpaquePointer?

public expect fun certDuplicateCTLContext(pctlcontext: COpaquePointer?): COpaquePointer?

public expect fun certDuplicateCertificateChain(pchaincontext: COpaquePointer?): COpaquePointer?

public expect fun certDuplicateCertificateContext(pcertcontext: COpaquePointer?): COpaquePointer?

public expect fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore

public expect fun certEnumCRLContextProperties(pcrlcontext: COpaquePointer?, dwpropid: UInt): UInt

public expect fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: COpaquePointer?): COpaquePointer?

public expect fun certEnumCTLContextProperties(pctlcontext: COpaquePointer?, dwpropid: UInt): UInt

public expect fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: COpaquePointer?): COpaquePointer?

public expect fun certEnumCertificateContextProperties(pcertcontext: COpaquePointer?, dwpropid: UInt): UInt

public expect fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: COpaquePointer?): COpaquePointer?

public expect fun certEnumPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumPhysicalStore): Bool

public expect fun certEnumSubjectInSortedCTL(pctlcontext: COpaquePointer?, ppvnextsubject: COpaquePointer?, psubjectidentifier: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool

public expect fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStore): Bool

public expect fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStoreLocation): Bool

public expect fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: COpaquePointer?): COpaquePointer?

public expect fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevcrlcontext: COpaquePointer?): COpaquePointer?

public expect fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: COpaquePointer?, pprevctlcontext: COpaquePointer?): COpaquePointer?

public expect fun certFindCertificateInCRL(pcert: COpaquePointer?, pcrlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppcrlentry: COpaquePointer?): Bool

public expect fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: COpaquePointer?, pprevcertcontext: COpaquePointer?): COpaquePointer?

public expect fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevchaincontext: COpaquePointer?): COpaquePointer?

public expect fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: COpaquePointer?): COpaquePointer?

public expect fun certFindRDNAttr(pszobjid: Pcstr, pname: COpaquePointer?): COpaquePointer?

public expect fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt): COpaquePointer?

public expect fun certFindSubjectInSortedCTL(psubjectidentifier: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool

public expect fun certFreeCRLContext(pcrlcontext: COpaquePointer?): Bool

public expect fun certFreeCTLContext(pctlcontext: COpaquePointer?): Bool

public expect fun certFreeCertificateChain(pchaincontext: COpaquePointer?)

public expect fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine)

public expect fun certFreeCertificateChainList(prgpselection: COpaquePointer?)

public expect fun certFreeCertificateContext(pcertcontext: COpaquePointer?): Bool

public expect fun certFreeServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?)

public expect fun certGetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool

public expect fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: COpaquePointer?, pprevcrlcontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer?

public expect fun certGetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool

public expect fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: COpaquePointer?, ptime: COpaquePointer?, hadditionalstore: Hcertstore, pchainpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppchaincontext: COpaquePointer?): Bool

public expect fun certGetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool

public expect fun certGetEnhancedKeyUsage(pcertcontext: COpaquePointer?, dwflags: UInt, pusage: COpaquePointer?, pcbusage: COpaquePointer?): Bool

public expect fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: COpaquePointer?, pbkeyusage: COpaquePointer?, cbkeyusage: UInt): Bool

public expect fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: COpaquePointer?, pprevissuercontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer?

public expect fun certGetNameStringA(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pstr, cchnamestring: UInt): UInt

public expect fun certGetNameStringW(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pwstr, cchnamestring: UInt): UInt

public expect fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: COpaquePointer?): UInt

public expect fun certGetServerOcspResponseContext(hserverocspresponse: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer?

public expect fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool

public expect fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?): COpaquePointer?

public expect fun certGetValidUsages(ccerts: UInt, rghcerts: COpaquePointer?, cnumoids: COpaquePointer?, rghoids: COpaquePointer?, pcboids: COpaquePointer?): Bool

public expect fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: COpaquePointer?, prdn: COpaquePointer?): Bool

public expect fun certIsStrongHashToSign(pstrongsignpara: COpaquePointer?, pwszcnghashalgid: Pcwstr, psigningcert: COpaquePointer?): Bool

public expect fun certIsValidCRLForCertificate(pcert: COpaquePointer?, pcrl: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool

public expect fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: COpaquePointer?, ptimestamp: COpaquePointer?, pwszfilename: Pcwstr): Bool

public expect fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt

public expect fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt

public expect fun certOIDToAlgId(pszobjid: Pcstr): UInt

public expect fun certOpenServerOcspResponse(pchaincontext: COpaquePointer?, dwflags: UInt, popenpara: COpaquePointer?): COpaquePointer?

public expect fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: COpaquePointer?): Hcertstore

public expect fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore

public expect fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore

public expect fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pstr, csz: UInt): UInt

public expect fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pwstr, csz: UInt): UInt

public expect fun certRegisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool

public expect fun certRegisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool

public expect fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool

public expect fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore)

public expect fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool

public expect fun certRetrieveLogoOrBiometricInfo(pcertcontext: COpaquePointer?, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: COpaquePointer?, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?, ppwszmimetype: COpaquePointer?): Bool

public expect fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: COpaquePointer?, dwflags: UInt): Bool

public expect fun certSelectCertificateChains(pselectioncontext: COpaquePointer?, dwflags: UInt, pchainparameters: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, hstore: Hcertstore, pcselection: COpaquePointer?, pprgpselection: COpaquePointer?): Bool

public expect fun certSerializeCRLStoreElement(pcrlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool

public expect fun certSerializeCTLStoreElement(pctlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool

public expect fun certSerializeCertificateStoreElement(pcertcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool

public expect fun certSetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool

public expect fun certSetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool

public expect fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: COpaquePointer?, pctlentry: COpaquePointer?, dwflags: UInt): Bool

public expect fun certSetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool

public expect fun certSetEnhancedKeyUsage(pcertcontext: COpaquePointer?, pusage: COpaquePointer?): Bool

public expect fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool

public expect fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool

public expect fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool

public expect fun certUnregisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr): Bool

public expect fun certUnregisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt): Bool

public expect fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?, ccrlinfo: UInt, rgpcrlinfo: COpaquePointer?): Bool

public expect fun certVerifyCRLTimeValidity(ptimetoverify: COpaquePointer?, pcrlinfo: COpaquePointer?): Int

public expect fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, psubjectusage: COpaquePointer?, dwflags: UInt, pverifyusagepara: COpaquePointer?, pverifyusagestatus: COpaquePointer?): Bool

public expect fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: COpaquePointer?, ppolicypara: COpaquePointer?, ppolicystatus: COpaquePointer?): Bool

public expect fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: COpaquePointer?, dwflags: UInt, prevpara: COpaquePointer?, prevstatus: COpaquePointer?): Bool

public expect fun certVerifySubjectCertificateContext(psubject: COpaquePointer?, pissuer: COpaquePointer?, pdwflags: COpaquePointer?): Bool

public expect fun certVerifyTimeValidity(ptimetoverify: COpaquePointer?, pcertinfo: COpaquePointer?): Int

public expect fun certVerifyValidityNesting(psubjectinfo: COpaquePointer?, pissuerinfo: COpaquePointer?): Bool

public expect fun closeCryptoHandle(hcrypto: COpaquePointer?): Hresult

public expect fun cryptAcquireCertificatePrivateKey(pcert: COpaquePointer?, dwflags: CryptAcquireFlags, pvparameters: COpaquePointer?, phcryptprovorncryptkey: COpaquePointer?, pdwkeyspec: COpaquePointer?, pfcallerfreeprovorncryptkey: COpaquePointer?): Bool

public expect fun cryptAcquireContextA(phprov: COpaquePointer?, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool

public expect fun cryptAcquireContextW(phprov: COpaquePointer?, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool

public expect fun cryptBinaryToStringA(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: COpaquePointer?): Bool

public expect fun cryptBinaryToStringW(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: COpaquePointer?): Bool

public expect fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool

public expect fun cryptContextAddRef(hprov: ULong, pdwreserved: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptCreateAsyncHandle(dwflags: UInt, phasync: COpaquePointer?): Bool

public expect fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: COpaquePointer?): Bool

public expect fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: COpaquePointer?, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: COpaquePointer?, pbhash: COpaquePointer?, pcbhash: COpaquePointer?): Bool

public expect fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencodedblob: COpaquePointer?, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: COpaquePointer?, pdwinnercontenttype: COpaquePointer?, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool

public expect fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool

public expect fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pdecodepara: COpaquePointer?, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool

public expect fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool

public expect fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool

public expect fun cryptDecryptMessage(pdecryptpara: COpaquePointer?, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?): Bool

public expect fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: COpaquePointer?): Bool

public expect fun cryptDestroyHash(hhash: ULong): Bool

public expect fun cryptDestroyKey(hkey: ULong): Bool

public expect fun cryptDuplicateHash(hhash: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phhash: COpaquePointer?): Bool

public expect fun cryptDuplicateKey(hkey: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phkey: COpaquePointer?): Bool

public expect fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool

public expect fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, dwflags: CryptEncodeObjectFlags, pencodepara: COpaquePointer?, pvencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool

public expect fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwbuflen: UInt): Bool

public expect fun cryptEncryptMessage(pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobeencrypted: COpaquePointer?, cbtobeencrypted: UInt, pbencryptedblob: COpaquePointer?, pcbencryptedblob: COpaquePointer?): Bool

public expect fun cryptEnumKeyIdentifierProperties(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCryptEnumKeyidProp): Bool

public expect fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool

public expect fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool

public expect fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pstr, pcbtypename: COpaquePointer?): Bool

public expect fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pwstr, pcbtypename: COpaquePointer?): Bool

public expect fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pstr, pcbprovname: COpaquePointer?): Bool

public expect fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pwstr, pcbprovname: COpaquePointer?): Bool

public expect fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool

public expect fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pbprivatekeyblob: COpaquePointer?, pcbprivatekeyblob: COpaquePointer?): Bool

public expect fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool

public expect fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool

public expect fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool

public expect fun cryptFindCertificateKeyProvInfo(pcert: COpaquePointer?, dwflags: CryptFindFlags, pvreserved: COpaquePointer?): Bool

public expect fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr

public expect fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: COpaquePointer?, dwgroupid: UInt): COpaquePointer?

public expect fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: COpaquePointer?, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, pbformat: COpaquePointer?, pcbformat: COpaquePointer?): Bool

public expect fun cryptFreeOIDFunctionAddress(hfuncaddr: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool

public expect fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: COpaquePointer?): Bool

public expect fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: COpaquePointer?, ppfnfree: COpaquePointer?): Bool

public expect fun cryptGetDefaultOIDDllList(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: COpaquePointer?): Bool

public expect fun cryptGetDefaultOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool

public expect fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pstr, pcbprovname: COpaquePointer?): Bool

public expect fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pwstr, pcbprovname: COpaquePointer?): Bool

public expect fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptGetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool

public expect fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Hcertstore

public expect fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Int

public expect fun cryptGetOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool

public expect fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: COpaquePointer?, pbvaluedata: COpaquePointer?, pcbvaluedata: COpaquePointer?): Bool

public expect fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: COpaquePointer?, dwflags: CryptGetUrlFlags, purlarray: COpaquePointer?, pcburlarray: COpaquePointer?, purlinfo: COpaquePointer?, pcburlinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool

public expect fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: COpaquePointer?): Bool

public expect fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptHashData(hhash: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, dwflags: UInt): Bool

public expect fun cryptHashMessage(phashpara: COpaquePointer?, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbhashedblob: COpaquePointer?, pcbhashedblob: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool

public expect fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptImportKey(hprov: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool

public expect fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: COpaquePointer?, pvauxinfo: COpaquePointer?): Bool

public expect fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, phkey: COpaquePointer?): Bool

public expect fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool

public expect fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, dwflags: CryptImportPublicKeyFlags, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool

public expect fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): COpaquePointer?

public expect fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool

public expect fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: COpaquePointer?, dwflags: CryptDefaultContextFlags, pvreserved: COpaquePointer?, phdefaultcontext: COpaquePointer?): Bool

public expect fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptMemAlloc(cbsize: UInt): COpaquePointer?

public expect fun cryptMemFree(pv: COpaquePointer?)

public expect fun cryptMemRealloc(pv: COpaquePointer?, cbsize: UInt): COpaquePointer?

public expect fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt

public expect fun cryptMsgClose(hcryptmsg: COpaquePointer?): Bool

public expect fun cryptMsgControl(hcryptmsg: COpaquePointer?, dwflags: UInt, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool

public expect fun cryptMsgCountersign(hcryptmsg: COpaquePointer?, dwindex: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?): Bool

public expect fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?, pbcountersignature: COpaquePointer?, pcbcountersignature: COpaquePointer?): Bool

public expect fun cryptMsgDuplicate(hcryptmsg: COpaquePointer?): COpaquePointer?

public expect fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: COpaquePointer?, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool

public expect fun cryptMsgGetAndVerifySigner(hcryptmsg: COpaquePointer?, csignerstore: UInt, rghsignerstore: COpaquePointer?, dwflags: UInt, ppsigner: COpaquePointer?, pdwsignerindex: COpaquePointer?): Bool

public expect fun cryptMsgGetParam(hcryptmsg: COpaquePointer?, dwparamtype: UInt, dwindex: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool

public expect fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: COpaquePointer?, pstreaminfo: COpaquePointer?): COpaquePointer?

public expect fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, pstreaminfo: COpaquePointer?): COpaquePointer?

public expect fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: COpaquePointer?, cbctlcontent: UInt, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool

public expect fun cryptMsgUpdate(hcryptmsg: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, ffinal: Bool): Bool

public expect fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, pcicountersigner: COpaquePointer?): Bool

public expect fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: COpaquePointer?, dwflags: UInt, pvextra: COpaquePointer?): Bool

public expect fun cryptProtectData(pdatain: COpaquePointer?, szdatadescr: Pcwstr, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool

public expect fun cryptProtectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool

public expect fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: COpaquePointer?, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: COpaquePointer?, pdwcontenttype: COpaquePointer?, pdwformattype: COpaquePointer?, phcertstore: COpaquePointer?, phmsg: COpaquePointer?, ppvcontext: COpaquePointer?): Bool

public expect fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool

public expect fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool

public expect fun cryptRegisterOIDInfo(pinfo: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool

public expect fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool

public expect fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool

public expect fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool

public expect fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: COpaquePointer?, pfnfree: PfnCryptAsyncParamFreeFunc): Bool

public expect fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptSetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?): Bool

public expect fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: COpaquePointer?, cbvaluedata: UInt): Bool

public expect fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool

public expect fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool

public expect fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool

public expect fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool

public expect fun cryptSignAndEncryptMessage(psignpara: COpaquePointer?, pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobesignedandencrypted: COpaquePointer?, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: COpaquePointer?, pcbsignedandencryptedblob: COpaquePointer?): Bool

public expect fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: COpaquePointer?, cbencodedtobesigned: UInt, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbsignature: COpaquePointer?, pcbsignature: COpaquePointer?): Bool

public expect fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool

public expect fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool

public expect fun cryptSignMessage(psignpara: COpaquePointer?, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool

public expect fun cryptSignMessageWithKey(psignpara: COpaquePointer?, pbtobesigned: COpaquePointer?, cbtobesigned: UInt, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool

public expect fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool

public expect fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool

public expect fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: COpaquePointer?): Bool

public expect fun cryptUninstallDefaultContext(hdefaultcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool

public expect fun cryptUnprotectData(pdatain: COpaquePointer?, ppszdatadescr: COpaquePointer?, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool

public expect fun cryptUnprotectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool

public expect fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool

public expect fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool

public expect fun cryptUnregisterOIDInfo(pinfo: COpaquePointer?): Bool

public expect fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: COpaquePointer?, pdwfailurecount: COpaquePointer?): Bool

public expect fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, ppublickey: COpaquePointer?): Bool

public expect fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: COpaquePointer?, dwissuertype: UInt, pvissuer: COpaquePointer?, dwflags: CryptVerifyCertFlags, pvextra: COpaquePointer?): Bool

public expect fun cryptVerifyDetachedMessageHash(phashpara: COpaquePointer?, pbdetachedhashblob: COpaquePointer?, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptVerifyDetachedMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbdetachedsignblob: COpaquePointer?, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, ppsignercert: COpaquePointer?): Bool

public expect fun cryptVerifyMessageHash(phashpara: COpaquePointer?, pbhashedblob: COpaquePointer?, cbhashedblob: UInt, pbtobehashed: COpaquePointer?, pcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool

public expect fun cryptVerifyMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppsignercert: COpaquePointer?): Bool

public expect fun cryptVerifyMessageSignatureWithKey(pverifypara: COpaquePointer?, ppublickeyinfo: COpaquePointer?, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?): Bool

public expect fun cryptVerifySignatureA(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool

public expect fun cryptVerifySignatureW(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool

public expect fun cryptVerifyTimeStampSignature(pbtscontentinfo: COpaquePointer?, cbtscontentinfo: UInt, pbdata: COpaquePointer?, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool

public expect fun cryptXmlAddObject(hsignatureorobject: COpaquePointer?, dwflags: UInt, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, ppobject: COpaquePointer?): Hresult

public expect fun cryptXmlClose(hcryptxml: COpaquePointer?): Hresult

public expect fun cryptXmlCreateReference(hcryptxml: COpaquePointer?, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: COpaquePointer?, ctransform: UInt, rgtransform: COpaquePointer?, phreference: COpaquePointer?): Hresult

public expect fun cryptXmlDigestReference(hreference: COpaquePointer?, dwflags: UInt, pdataproviderin: COpaquePointer?): Hresult

public expect fun cryptXmlEncode(hcryptxml: COpaquePointer?, dwcharset: CryptXmlCharset, rgproperty: COpaquePointer?, cproperty: UInt, pvcallbackstate: COpaquePointer?, pfnwrite: PfnCryptXmlWriteCallback): Hresult

public expect fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult

public expect fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: COpaquePointer?, dwgroupid: UInt, dwflags: UInt): COpaquePointer?

public expect fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: COpaquePointer?, dwflags: CryptXmlFlags, ppalginfo: COpaquePointer?): Hresult

public expect fun cryptXmlGetDocContext(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult

public expect fun cryptXmlGetReference(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult

public expect fun cryptXmlGetSignature(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult

public expect fun cryptXmlGetStatus(hcryptxml: COpaquePointer?, pstatus: COpaquePointer?): Hresult

public expect fun cryptXmlGetTransforms(ppconfig: COpaquePointer?): Hresult

public expect fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: COpaquePointer?, phkey: COpaquePointer?): Hresult

public expect fun cryptXmlOpenToDecode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phcryptxml: COpaquePointer?): Hresult

public expect fun cryptXmlOpenToEncode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phsignature: COpaquePointer?): Hresult

public expect fun cryptXmlSetHMACSecret(hsignature: COpaquePointer?, pbsecret: COpaquePointer?, cbsecret: UInt): Hresult

public expect fun cryptXmlSign(hsignature: COpaquePointer?, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: COpaquePointer?, psignaturemethod: COpaquePointer?, pcanonicalization: COpaquePointer?): Hresult

public expect fun cryptXmlVerifySignature(hsignature: COpaquePointer?, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult

public expect fun decrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult

public expect fun encrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult

public expect fun findCertsByIssuer(pcertchains: COpaquePointer?, pcbcertchains: COpaquePointer?, pccertchains: COpaquePointer?, pbencodedissuername: COpaquePointer?, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult

public expect fun freeToken(pallocmemory: COpaquePointer?): Bool

public expect fun generateDerivedKey(hcrypto: COpaquePointer?, cblabel: UInt, plabel: COpaquePointer?, cbnonce: UInt, pnonce: COpaquePointer?, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: COpaquePointer?, ppkey: COpaquePointer?): Hresult

public expect fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getBrowserToken(dwparamtype: UInt, pparam: COpaquePointer?, pcbtoken: COpaquePointer?, pptoken: COpaquePointer?): Hresult

public expect fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getCryptoTransform(hsymmetriccrypto: COpaquePointer?, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: COpaquePointer?, pphtransform: COpaquePointer?): Hresult

public expect fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getKeyedHash(hsymmetriccrypto: COpaquePointer?, pphhash: COpaquePointer?): Hresult

public expect fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus

public expect fun getToken(cpolicychain: UInt, ppolicychain: COpaquePointer?, securitytoken: COpaquePointer?, phprooftokencrypto: COpaquePointer?): Hresult

public expect fun hashCore(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?): Hresult

public expect fun hashFinal(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult

public expect fun importInformationCard(filename: Pcwstr): Hresult

public expect fun manageCardSpace(): Hresult

public expect fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult

public expect fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult

public expect fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: COpaquePointer?): Hresult

public expect fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult

public expect fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptEnumStorageProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult

public expect fun nCryptFreeBuffer(pvinput: COpaquePointer?): Hresult

public expect fun nCryptFreeObject(hobject: NcryptHandle): Hresult

public expect fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: ObjectSecurityInformation): Hresult

public expect fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: COpaquePointer?, dwinfotype: UInt, ppvinfo: COpaquePointer?): Hresult

public expect fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, phkey: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, dwflags: NcryptFlags): Hresult

public expect fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool

public expect fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult

public expect fun nCryptOpenStorageProvider(phprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: COpaquePointer?, cbdata: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbprotectedblob: COpaquePointer?, pcbprotectedblob: COpaquePointer?): Hresult

public expect fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: NcryptFlags): Hresult

public expect fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult

public expect fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult

public expect fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: COpaquePointer?, phstream: COpaquePointer?): Hresult

public expect fun nCryptStreamOpenToUnprotect(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult

public expect fun nCryptStreamOpenToUnprotectEx(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult

public expect fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: COpaquePointer?, cbdata: ULong, ffinal: Bool): Hresult

public expect fun nCryptTranslateHandle(phprovider: COpaquePointer?, phkey: COpaquePointer?, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult

public expect fun nCryptUnprotectSecret(phdescriptor: COpaquePointer?, dwflags: NcryptFlags, pbprotectedblob: COpaquePointer?, cbprotectedblob: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?): Hresult

public expect fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, poutput: COpaquePointer?, dwflags: UInt): Hresult

public expect fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: NcryptFlags): Hresult

public expect fun pFXExportCertStore(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool

public expect fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, pvpara: COpaquePointer?, dwflags: UInt): Bool

public expect fun pFXImportCertStore(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore

public expect fun pFXIsPFXBlob(ppfx: COpaquePointer?): Bool

public expect fun pFXVerifyPassword(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool

public expect fun processPrng(pbdata: COpaquePointer?, cbdata: ULong): Bool

public expect fun signError(): Hresult

public expect fun signHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, pcbsig: COpaquePointer?, ppsig: COpaquePointer?): Hresult

public expect fun signerFreeSignerContext(psignercontext: COpaquePointer?): Hresult

public expect fun signerSign(psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult

public expect fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult

public expect fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult

public expect fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, pdigestsigninfo: COpaquePointer?, preserved: COpaquePointer?): Hresult

public expect fun signerTimeStamp(psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult

public expect fun signerTimeStampEx(dwflags: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult

public expect fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult

public expect fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult

public expect fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult

public expect fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: COpaquePointer?, cbrandoms: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult

public expect fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult

public expect fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: COpaquePointer?, cbparams: UInt, dwflags: UInt): Hresult

public expect fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult

public expect fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult

public expect fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwflags: UInt): Hresult

public expect fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult

public expect fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: COpaquePointer?, ppecccurve: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslEnumProtocolProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: COpaquePointer?, cbticketnonce: UInt, phpresharedkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: COpaquePointer?, phservertraffickey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: COpaquePointer?, cbrandoms: UInt, pbcontextvalue: COpaquePointer?, cbcontextvalue: UShort, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult

public expect fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslFreeBuffer(pvinput: COpaquePointer?): Hresult

public expect fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult

public expect fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: COpaquePointer?, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult

public expect fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult

public expect fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: COpaquePointer?, pszblobtype: Pcwstr, pbkeyblob: COpaquePointer?, cbkeyblob: UInt, dwflags: UInt): Hresult

public expect fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pbencryptedkey: COpaquePointer?, cbencryptedkey: UInt, dwflags: UInt): Hresult

public expect fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult

public expect fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: COpaquePointer?, cbcipherlengths: UInt, dwflags: UInt): Hresult

public expect fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: COpaquePointer?, pcertcontext: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslOpenProvider(phsslprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult

public expect fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult

public expect fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Hresult

public expect fun systemPrng(pbrandomdata: COpaquePointer?, cbrandomdata: ULong): Bool

public expect fun transformBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult

public expect fun transformFinalBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult

public expect fun verifyHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, cbsig: UInt, psig: COpaquePointer?, pfverified: COpaquePointer?): Hresult
