package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus

public expect fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr): Ntstatus

public expect fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus

public expect fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, nhashes: UInt, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus

public expect fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr, cbpassword: UInt, pbsalt: ConstPtr, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus

public expect fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus

public expect fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus

public expect fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr, ppimpllist: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus

public expect fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptFreeBuffer(pvbuffer: ConstPtr)

public expect fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus

public expect fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr, dwlength: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr): Ntstatus

public expect fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr, cbsecret: UInt, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt): Ntstatus

public expect fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus

public expect fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr, cboperations: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr, ppbvalue: MutPtr): Ntstatus

public expect fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptRegisterConfigChangeNotify(phevent: MutPtr): Ntstatus

public expect fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr): Ntstatus

public expect fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus

public expect fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus

public expect fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus

public expect fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr, dwflags: UInt): Ntstatus

public expect fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr): Ntstatus

public expect fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus

public expect fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus

public expect fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus

public expect fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus

public expect fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbhash: ConstPtr, cbhash: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus

public expect fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool

public expect fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool

public expect fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool

public expect fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool

public expect fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool

public expect fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool

public expect fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr): Bool

public expect fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr): Bool

public expect fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr): Bool

public expect fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool

public expect fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool

public expect fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool

public expect fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr)

public expect fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr)

public expect fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr, ppvcontext: MutPtr): Bool

public expect fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool

public expect fun certAlgIdToOID(dwalgid: UInt): Pcstr

public expect fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr, dwflags: UInt)

public expect fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool

public expect fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr, pcertid2: ConstPtr): Bool

public expect fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr, pcertname2: ConstPtr): Bool

public expect fun certCompareIntegerBlob(pint1: ConstPtr, pint2: ConstPtr): Bool

public expect fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr, ppublickey2: ConstPtr): Bool

public expect fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool

public expect fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt): MutPtr

public expect fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr, cbctlencoded: UInt): MutPtr

public expect fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr, coptattr: UInt, rgoptattr: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pctlentry: MutPtr, pcbctlentry: MutPtr): Bool

public expect fun certCreateCertificateChainEngine(pconfig: ConstPtr, phchainengine: MutPtr): Bool

public expect fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt): MutPtr

public expect fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr): MutPtr

public expect fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr, psignaturealgorithm: ConstPtr, pstarttime: ConstPtr, pendtime: ConstPtr, pextensions: ConstPtr): MutPtr

public expect fun certDeleteCRLFromStore(pcrlcontext: ConstPtr): Bool

public expect fun certDeleteCTLFromStore(pctlcontext: ConstPtr): Bool

public expect fun certDeleteCertificateFromStore(pcertcontext: ConstPtr): Bool

public expect fun certDuplicateCRLContext(pcrlcontext: ConstPtr): MutPtr

public expect fun certDuplicateCTLContext(pctlcontext: ConstPtr): MutPtr

public expect fun certDuplicateCertificateChain(pchaincontext: ConstPtr): MutPtr

public expect fun certDuplicateCertificateContext(pcertcontext: ConstPtr): MutPtr

public expect fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore

public expect fun certEnumCRLContextProperties(pcrlcontext: ConstPtr, dwpropid: UInt): UInt

public expect fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr): MutPtr

public expect fun certEnumCTLContextProperties(pctlcontext: ConstPtr, dwpropid: UInt): UInt

public expect fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr): MutPtr

public expect fun certEnumCertificateContextProperties(pcertcontext: ConstPtr, dwpropid: UInt): UInt

public expect fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr): MutPtr

public expect fun certEnumPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumPhysicalStore): Bool

public expect fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr, ppvnextsubject: MutPtr, psubjectidentifier: MutPtr, pencodedattributes: MutPtr): Bool

public expect fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStore): Bool

public expect fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStoreLocation): Bool

public expect fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr): MutPtr

public expect fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr, pprevcrlcontext: ConstPtr): MutPtr

public expect fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr, pprevctlcontext: ConstPtr): MutPtr

public expect fun certFindCertificateInCRL(pcert: ConstPtr, pcrlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppcrlentry: MutPtr): Bool

public expect fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr, pprevcertcontext: ConstPtr): MutPtr

public expect fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr, pprevchaincontext: ConstPtr): MutPtr

public expect fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr): MutPtr

public expect fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr): MutPtr

public expect fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt): MutPtr

public expect fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pencodedattributes: MutPtr): Bool

public expect fun certFreeCRLContext(pcrlcontext: ConstPtr): Bool

public expect fun certFreeCTLContext(pctlcontext: ConstPtr): Bool

public expect fun certFreeCertificateChain(pchaincontext: ConstPtr)

public expect fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine)

public expect fun certFreeCertificateChainList(prgpselection: ConstPtr)

public expect fun certFreeCertificateContext(pcertcontext: ConstPtr): Bool

public expect fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr)

public expect fun certGetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool

public expect fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr, pprevcrlcontext: ConstPtr, pdwflags: MutPtr): MutPtr

public expect fun certGetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool

public expect fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr, ptime: ConstPtr, hadditionalstore: Hcertstore, pchainpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppchaincontext: MutPtr): Bool

public expect fun certGetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool

public expect fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr, dwflags: UInt, pusage: MutPtr, pcbusage: MutPtr): Bool

public expect fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr, pbkeyusage: MutPtr, cbkeyusage: UInt): Bool

public expect fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr, pprevissuercontext: ConstPtr, pdwflags: MutPtr): MutPtr

public expect fun certGetNameStringA(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pstr, cchnamestring: UInt): UInt

public expect fun certGetNameStringW(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pwstr, cchnamestring: UInt): UInt

public expect fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr): UInt

public expect fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): MutPtr

public expect fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool

public expect fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr): MutPtr

public expect fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr, cnumoids: MutPtr, rghoids: MutPtr, pcboids: MutPtr): Bool

public expect fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr, prdn: ConstPtr): Bool

public expect fun certIsStrongHashToSign(pstrongsignpara: ConstPtr, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr): Bool

public expect fun certIsValidCRLForCertificate(pcert: ConstPtr, pcrl: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool

public expect fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr, ptimestamp: ConstPtr, pwszfilename: Pcwstr): Bool

public expect fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt

public expect fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt

public expect fun certOIDToAlgId(pszobjid: Pcstr): UInt

public expect fun certOpenServerOcspResponse(pchaincontext: ConstPtr, dwflags: UInt, popenpara: ConstPtr): MutPtr

public expect fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr): Hcertstore

public expect fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore

public expect fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore

public expect fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pstr, csz: UInt): UInt

public expect fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pwstr, csz: UInt): UInt

public expect fun certRegisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool

public expect fun certRegisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool

public expect fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool

public expect fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore)

public expect fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool

public expect fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr, ppbdata: MutPtr, pcbdata: MutPtr, ppwszmimetype: MutPtr): Bool

public expect fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr, dwflags: UInt): Bool

public expect fun certSelectCertificateChains(pselectioncontext: ConstPtr, dwflags: UInt, pchainparameters: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, hstore: Hcertstore, pcselection: MutPtr, pprgpselection: MutPtr): Bool

public expect fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool

public expect fun certSerializeCTLStoreElement(pctlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool

public expect fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool

public expect fun certSetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool

public expect fun certSetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool

public expect fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr, pctlentry: ConstPtr, dwflags: UInt): Bool

public expect fun certSetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool

public expect fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr, pusage: ConstPtr): Bool

public expect fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool

public expect fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool

public expect fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool

public expect fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr): Bool

public expect fun certUnregisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt): Bool

public expect fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr, ccrlinfo: UInt, rgpcrlinfo: ConstPtr): Bool

public expect fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr, pcrlinfo: ConstPtr): Int

public expect fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, psubjectusage: ConstPtr, dwflags: UInt, pverifyusagepara: ConstPtr, pverifyusagestatus: MutPtr): Bool

public expect fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr, ppolicypara: ConstPtr, ppolicystatus: MutPtr): Bool

public expect fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr, dwflags: UInt, prevpara: ConstPtr, prevstatus: MutPtr): Bool

public expect fun certVerifySubjectCertificateContext(psubject: ConstPtr, pissuer: ConstPtr, pdwflags: MutPtr): Bool

public expect fun certVerifyTimeValidity(ptimetoverify: ConstPtr, pcertinfo: ConstPtr): Int

public expect fun certVerifyValidityNesting(psubjectinfo: ConstPtr, pissuerinfo: ConstPtr): Bool

public expect fun closeCryptoHandle(hcrypto: ConstPtr): Hresult

public expect fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr, dwflags: CryptAcquireFlags, pvparameters: ConstPtr, phcryptprovorncryptkey: MutPtr, pdwkeyspec: MutPtr, pfcallerfreeprovorncryptkey: MutPtr): Bool

public expect fun cryptAcquireContextA(phprov: MutPtr, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool

public expect fun cryptAcquireContextW(phprov: MutPtr, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool

public expect fun cryptBinaryToStringA(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr): Bool

public expect fun cryptBinaryToStringW(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr): Bool

public expect fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool

public expect fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr, dwflags: UInt): Bool

public expect fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr): Bool

public expect fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr): Bool

public expect fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr, pbhash: MutPtr, pcbhash: MutPtr): Bool

public expect fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencodedblob: ConstPtr, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr, pdwinnercontenttype: MutPtr, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool

public expect fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool

public expect fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool

public expect fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr): Bool

public expect fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool

public expect fun cryptDecryptMessage(pdecryptpara: ConstPtr, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr): Bool

public expect fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr): Bool

public expect fun cryptDestroyHash(hhash: ULong): Bool

public expect fun cryptDestroyKey(hkey: ULong): Bool

public expect fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr, dwflags: UInt, phhash: MutPtr): Bool

public expect fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr, dwflags: UInt, phkey: MutPtr): Bool

public expect fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool

public expect fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr, pvencoded: MutPtr, pcbencoded: MutPtr): Bool

public expect fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwbuflen: UInt): Bool

public expect fun cryptEncryptMessage(pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobeencrypted: ConstPtr, cbtobeencrypted: UInt, pbencryptedblob: MutPtr, pcbencryptedblob: MutPtr): Bool

public expect fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvarg: MutPtr, pfnenum: PfnCryptEnumKeyidProp): Bool

public expect fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool

public expect fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool

public expect fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pstr, pcbtypename: MutPtr): Bool

public expect fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pwstr, pcbtypename: MutPtr): Bool

public expect fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pstr, pcbprovname: MutPtr): Bool

public expect fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pwstr, pcbprovname: MutPtr): Bool

public expect fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr, pdwdatalen: MutPtr): Bool

public expect fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pbprivatekeyblob: MutPtr, pcbprivatekeyblob: MutPtr): Bool

public expect fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr, pcbinfo: MutPtr): Bool

public expect fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool

public expect fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool

public expect fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr, dwflags: CryptFindFlags, pvreserved: ConstPtr): Bool

public expect fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr

public expect fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr, dwgroupid: UInt): MutPtr

public expect fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, pbformat: MutPtr, pcbformat: MutPtr): Bool

public expect fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr, dwflags: UInt): Bool

public expect fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr): Bool

public expect fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr): Bool

public expect fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr, ppfnfree: MutPtr): Bool

public expect fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr): Bool

public expect fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool

public expect fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr): Bool

public expect fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr): Bool

public expect fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool

public expect fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: MutPtr, pcbdata: MutPtr): Bool

public expect fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool

public expect fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Hcertstore

public expect fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Int

public expect fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool

public expect fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr, pbvaluedata: MutPtr, pcbvaluedata: MutPtr): Bool

public expect fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr, dwflags: CryptGetUrlFlags, purlarray: MutPtr, pcburlarray: MutPtr, purlinfo: MutPtr, pcburlinfo: MutPtr, pvreserved: ConstPtr): Bool

public expect fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool

public expect fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr): Bool

public expect fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptHashData(hhash: ULong, pbdata: ConstPtr, dwdatalen: UInt, dwflags: UInt): Bool

public expect fun cryptHashMessage(phashpara: ConstPtr, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbhashedblob: MutPtr, pcbhashedblob: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool

public expect fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptImportKey(hprov: ULong, pbdata: ConstPtr, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr): Bool

public expect fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr, pvauxinfo: ConstPtr): Bool

public expect fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, phkey: MutPtr): Bool

public expect fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr, phkey: MutPtr): Bool

public expect fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr, phkey: MutPtr): Bool

public expect fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr

public expect fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool

public expect fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr, phdefaultcontext: MutPtr): Bool

public expect fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr, dwflags: UInt): Bool

public expect fun cryptMemAlloc(cbsize: UInt): MutPtr

public expect fun cryptMemFree(pv: ConstPtr)

public expect fun cryptMemRealloc(pv: ConstPtr, cbsize: UInt): MutPtr

public expect fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt

public expect fun cryptMsgClose(hcryptmsg: ConstPtr): Bool

public expect fun cryptMsgControl(hcryptmsg: ConstPtr, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool

public expect fun cryptMsgCountersign(hcryptmsg: ConstPtr, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr): Bool

public expect fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr, pbcountersignature: MutPtr, pcbcountersignature: MutPtr): Bool

public expect fun cryptMsgDuplicate(hcryptmsg: ConstPtr): MutPtr

public expect fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool

public expect fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr, csignerstore: UInt, rghsignerstore: ConstPtr, dwflags: UInt, ppsigner: MutPtr, pdwsignerindex: MutPtr): Bool

public expect fun cryptMsgGetParam(hcryptmsg: ConstPtr, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool

public expect fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr, pstreaminfo: ConstPtr): MutPtr

public expect fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr): MutPtr

public expect fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr, cbctlcontent: UInt, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool

public expect fun cryptMsgUpdate(hcryptmsg: ConstPtr, pbdata: ConstPtr, cbdata: UInt, ffinal: Bool): Bool

public expect fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr): Bool

public expect fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr, dwflags: UInt, pvextra: MutPtr): Bool

public expect fun cryptProtectData(pdatain: ConstPtr, szdatadescr: Pcwstr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool

public expect fun cryptProtectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool

public expect fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr, pdwcontenttype: MutPtr, pdwformattype: MutPtr, phcertstore: MutPtr, phmsg: MutPtr, ppvcontext: MutPtr): Bool

public expect fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool

public expect fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool

public expect fun cryptRegisterOIDInfo(pinfo: ConstPtr, dwflags: UInt): Bool

public expect fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool

public expect fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool

public expect fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool

public expect fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr, pbdata: ConstPtr, cbdata: UInt, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool

public expect fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr, pfnfree: PfnCryptAsyncParamFreeFunc): Bool

public expect fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr, dwflags: UInt): Bool

public expect fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: ConstPtr): Bool

public expect fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr, dwflags: UInt): Bool

public expect fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr, cbvaluedata: UInt): Bool

public expect fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr, dwflags: UInt): Bool

public expect fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool

public expect fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool

public expect fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool

public expect fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool

public expect fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool

public expect fun cryptSignAndEncryptMessage(psignpara: ConstPtr, pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobesignedandencrypted: ConstPtr, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr, pcbsignedandencryptedblob: MutPtr): Bool

public expect fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbsignature: MutPtr, pcbsignature: MutPtr): Bool

public expect fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool

public expect fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool

public expect fun cryptSignMessage(psignpara: ConstPtr, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool

public expect fun cryptSignMessageWithKey(psignpara: ConstPtr, pbtobesigned: ConstPtr, cbtobesigned: UInt, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool

public expect fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool

public expect fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool

public expect fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr): Bool

public expect fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool

public expect fun cryptUnprotectData(pdatain: ConstPtr, ppszdatadescr: MutPtr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool

public expect fun cryptUnprotectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool

public expect fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool

public expect fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool

public expect fun cryptUnregisterOIDInfo(pinfo: ConstPtr): Bool

public expect fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr, pdwfailurecount: MutPtr): Bool

public expect fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, ppublickey: ConstPtr): Bool

public expect fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr, dwissuertype: UInt, pvissuer: ConstPtr, dwflags: CryptVerifyCertFlags, pvextra: MutPtr): Bool

public expect fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr, pbdetachedhashblob: ConstPtr, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, ppsignercert: MutPtr): Bool

public expect fun cryptVerifyMessageHash(phashpara: ConstPtr, pbhashedblob: ConstPtr, cbhashedblob: UInt, pbtobehashed: MutPtr, pcbtobehashed: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool

public expect fun cryptVerifyMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppsignercert: MutPtr): Bool

public expect fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr, ppublickeyinfo: ConstPtr, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr): Bool

public expect fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool

public expect fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool

public expect fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr, cbtscontentinfo: UInt, pbdata: ConstPtr, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool

public expect fun cryptXmlAddObject(hsignatureorobject: ConstPtr, dwflags: UInt, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, ppobject: MutPtr): Hresult

public expect fun cryptXmlClose(hcryptxml: ConstPtr): Hresult

public expect fun cryptXmlCreateReference(hcryptxml: ConstPtr, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr, ctransform: UInt, rgtransform: ConstPtr, phreference: MutPtr): Hresult

public expect fun cryptXmlDigestReference(hreference: ConstPtr, dwflags: UInt, pdataproviderin: ConstPtr): Hresult

public expect fun cryptXmlEncode(hcryptxml: ConstPtr, dwcharset: CryptXmlCharset, rgproperty: ConstPtr, cproperty: UInt, pvcallbackstate: MutPtr, pfnwrite: PfnCryptXmlWriteCallback): Hresult

public expect fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult

public expect fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr, dwgroupid: UInt, dwflags: UInt): MutPtr

public expect fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr, dwflags: CryptXmlFlags, ppalginfo: MutPtr): Hresult

public expect fun cryptXmlGetDocContext(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult

public expect fun cryptXmlGetReference(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult

public expect fun cryptXmlGetSignature(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult

public expect fun cryptXmlGetStatus(hcryptxml: ConstPtr, pstatus: MutPtr): Hresult

public expect fun cryptXmlGetTransforms(ppconfig: MutPtr): Hresult

public expect fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr, phkey: MutPtr): Hresult

public expect fun cryptXmlOpenToDecode(pconfig: ConstPtr, dwflags: CryptXmlFlags, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phcryptxml: MutPtr): Hresult

public expect fun cryptXmlOpenToEncode(pconfig: ConstPtr, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phsignature: MutPtr): Hresult

public expect fun cryptXmlSetHMACSecret(hsignature: ConstPtr, pbsecret: ConstPtr, cbsecret: UInt): Hresult

public expect fun cryptXmlSign(hsignature: ConstPtr, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr, psignaturemethod: ConstPtr, pcanonicalization: ConstPtr): Hresult

public expect fun cryptXmlVerifySignature(hsignature: ConstPtr, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult

public expect fun decrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult

public expect fun encrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult

public expect fun findCertsByIssuer(pcertchains: MutPtr, pcbcertchains: MutPtr, pccertchains: MutPtr, pbencodedissuername: ConstPtr, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult

public expect fun freeToken(pallocmemory: ConstPtr): Bool

public expect fun generateDerivedKey(hcrypto: ConstPtr, cblabel: UInt, plabel: ConstPtr, cbnonce: UInt, pnonce: ConstPtr, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr, ppkey: MutPtr): Hresult

public expect fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr, pcbtoken: MutPtr, pptoken: MutPtr): Hresult

public expect fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getCryptoTransform(hsymmetriccrypto: ConstPtr, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr, pphtransform: MutPtr): Hresult

public expect fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getKeyedHash(hsymmetriccrypto: ConstPtr, pphhash: MutPtr): Hresult

public expect fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus

public expect fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr, securitytoken: MutPtr, phprooftokencrypto: MutPtr): Hresult

public expect fun hashCore(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr): Hresult

public expect fun hashFinal(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult

public expect fun importInformationCard(filename: Pcwstr): Hresult

public expect fun manageCardSpace(): Hresult

public expect fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult

public expect fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: MutPtr, cbclaimblob: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult

public expect fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr): Hresult

public expect fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult

public expect fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr, ppenumstate: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult

public expect fun nCryptFreeBuffer(pvinput: MutPtr): Hresult

public expect fun nCryptFreeObject(hobject: NcryptHandle): Hresult

public expect fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: ObjectSecurityInformation): Hresult

public expect fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr, dwinfotype: UInt, ppvinfo: MutPtr): Hresult

public expect fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, phkey: MutPtr, pbdata: ConstPtr, cbdata: UInt, dwflags: NcryptFlags): Hresult

public expect fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool

public expect fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult

public expect fun nCryptOpenStorageProvider(phprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr, cbdata: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbprotectedblob: MutPtr, pcbprotectedblob: MutPtr): Hresult

public expect fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult

public expect fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: NcryptFlags): Hresult

public expect fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult

public expect fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult

public expect fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr, phstream: MutPtr): Hresult

public expect fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult

public expect fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult

public expect fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr, cbdata: ULong, ffinal: Bool): Hresult

public expect fun nCryptTranslateHandle(phprovider: MutPtr, phkey: MutPtr, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult

public expect fun nCryptUnprotectSecret(phdescriptor: MutPtr, dwflags: NcryptFlags, pbprotectedblob: ConstPtr, cbprotectedblob: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbdata: MutPtr, pcbdata: MutPtr): Hresult

public expect fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: ConstPtr, cbclaimblob: UInt, poutput: MutPtr, dwflags: UInt): Hresult

public expect fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: NcryptFlags): Hresult

public expect fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, dwflags: UInt): Bool

public expect fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, pvpara: ConstPtr, dwflags: UInt): Bool

public expect fun pFXImportCertStore(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore

public expect fun pFXIsPFXBlob(ppfx: ConstPtr): Bool

public expect fun pFXVerifyPassword(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: UInt): Bool

public expect fun processPrng(pbdata: MutPtr, cbdata: ULong): Bool

public expect fun signError(): Hresult

public expect fun signHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, pcbsig: MutPtr, ppsig: MutPtr): Hresult

public expect fun signerFreeSignerContext(psignercontext: ConstPtr): Hresult

public expect fun signerSign(psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult

public expect fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult

public expect fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult

public expect fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, pdigestsigninfo: ConstPtr, preserved: ConstPtr): Hresult

public expect fun signerTimeStamp(psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult

public expect fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult

public expect fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult

public expect fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult

public expect fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult

public expect fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr, cbrandoms: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult

public expect fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult

public expect fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr, cbparams: UInt, dwflags: UInt): Hresult

public expect fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult

public expect fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult

public expect fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwflags: UInt): Hresult

public expect fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr, dwflags: UInt): Hresult

public expect fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult

public expect fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult

public expect fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult

public expect fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr, ppecccurve: MutPtr, dwflags: UInt): Hresult

public expect fun sslEnumProtocolProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult

public expect fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr, cbticketnonce: UInt, phpresharedkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr, phservertraffickey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr, cbrandoms: UInt, pbcontextvalue: ConstPtr, cbcontextvalue: UShort, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult

public expect fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslFreeBuffer(pvinput: MutPtr): Hresult

public expect fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult

public expect fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult

public expect fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult

public expect fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, dwflags: UInt): Hresult

public expect fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult

public expect fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult

public expect fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr, pszblobtype: Pcwstr, pbkeyblob: ConstPtr, cbkeyblob: UInt, dwflags: UInt): Hresult

public expect fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pbencryptedkey: ConstPtr, cbencryptedkey: UInt, dwflags: UInt): Hresult

public expect fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult

public expect fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr, cbcipherlengths: UInt, dwflags: UInt): Hresult

public expect fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr, dwflags: UInt): Hresult

public expect fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr, pcertcontext: ConstPtr, dwflags: UInt): Hresult

public expect fun sslOpenProvider(phsslprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult

public expect fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult

public expect fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Hresult

public expect fun systemPrng(pbrandomdata: MutPtr, cbrandomdata: ULong): Bool

public expect fun transformBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult

public expect fun transformFinalBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult

public expect fun verifyHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr, pfverified: MutPtr): Hresult
