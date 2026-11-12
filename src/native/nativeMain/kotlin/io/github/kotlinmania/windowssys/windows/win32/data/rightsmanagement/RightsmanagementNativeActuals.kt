@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMActivate
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMAddLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMAttest
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMClearAllRights
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCloseSession
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateRight
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMCreateUser
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDecode
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDecrypt
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMEncode
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMEncrypt
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetInfo
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetMetaData
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetTime
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUserRights
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMGetUsers
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMIsActivated
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMRegisterContent
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMRepair
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetMetaData
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy
import io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement.cinterop.windowssysWindowsWin32DataRightsmanagementDRMVerify
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(hlicensestorage, wszlicense.rawAddress.toCPointer<ByteVar>(), wszurl.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr<CVoid>, ctemplates: UInt, pwsztemplateids: ConstPtr<Pcwstr>, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(hclient, uflags, pvreserved.rawAddress.toCPointer<ByteVar>(), ctemplates, pwsztemplateids.rawAddress.toCPointer<ByteVar>(), wszurl.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(hsession, uflags, wszgroupidentitycredential.rawAddress.toCPointer<ByteVar>(), wszrequestedrights.rawAddress.toCPointer<ByteVar>(), wszcustomdata.rawAddress.toCPointer<ByteVar>(), wszurl.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr<DrmActservInfo>, pvcontext: MutPtr<CVoid>, hparentwnd: Hwnd): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMActivate(hclient, uflags, ulangid, pactservinfo.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), hparentwnd.rawAddress.toCPointer<ByteVar>())

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMAddLicense(hlicensestorage, uflags, wszlicense.rawAddress.toCPointer<ByteVar>())

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense, hright, huser)

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr<UInt>, wszattestedblob: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMAttest(henablingprincipal, wszdata.rawAddress.toCPointer<ByteVar>(), etype, pcattestedblob.rawAddress.toCPointer<ByteVar>(), wszattestedblob.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv, clevel)

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense)

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv)

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle)

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub)

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery)

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession)

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr<Pcwstr>, pcchain: MutPtr<UInt>, wszchain: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(ccertificates, rgwszcertificates.rawAddress.toCPointer<ByteVar>(), pcchain.rawAddress.toCPointer<ByteVar>(), wszchain.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr<Drmboundlicenseparams>, wszlicensechain: Pcwstr, phboundlicense: MutPtr<UInt>, pherrorlog: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(henv, pparams.rawAddress.toCPointer<ByteVar>(), wszlicensechain.rawAddress.toCPointer<ByteVar>(), phboundlicense.rawAddress.toCPointer<ByteVar>(), pherrorlog.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(0L.toCPointer<ByteVar>(), ucallbackversion, wszgroupidprovidertype.rawAddress.toCPointer<ByteVar>(), wszgroupid.rawAddress.toCPointer<ByteVar>(), phclient.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(hboundlicense, wszright.rawAddress.toCPointer<ByteVar>(), hauxlib, wszauxplug.rawAddress.toCPointer<ByteVar>(), phdecryptor.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(hboundlicense, wszright.rawAddress.toCPointer<ByteVar>(), hauxlib, wszauxplug.rawAddress.toCPointer<ByteVar>(), phencryptor.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr<Drmid>, wszcredentials: Pcwstr, phenablingprincipal: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(henv, hlibrary, wszobject.rawAddress.toCPointer<ByteVar>(), pidprincipal.rawAddress.toCPointer<ByteVar>(), wszcredentials.rawAddress.toCPointer<ByteVar>(), phenablingprincipal.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateIssuanceLicense(psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(psttimefrom.rawAddress.toCPointer<ByteVar>(), psttimeuntil.rawAddress.toCPointer<ByteVar>(), wszreferralinfoname.rawAddress.toCPointer<ByteVar>(), wszreferralinfourl.rawAddress.toCPointer<ByteVar>(), howner, wszissuancelicense.rawAddress.toCPointer<ByteVar>(), hboundlicense, phissuancelicense.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(henv, hdefaultlibrary, hclient, uflags, wszissuancelicense.rawAddress.toCPointer<ByteVar>(), phlicensestorage.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr<Pcwstr>, pwszextendedinfovalue: ConstPtr<Pcwstr>, phright: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateRight(wszrightname.rawAddress.toCPointer<ByteVar>(), pstfrom.rawAddress.toCPointer<ByteVar>(), pstuntil.rawAddress.toCPointer<ByteVar>(), cextendedinfo, pwszextendedinfoname.rawAddress.toCPointer<ByteVar>(), pwszextendedinfovalue.rawAddress.toCPointer<ByteVar>(), phright.rawAddress.toCPointer<ByteVar>())

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMCreateUser(wszusername.rawAddress.toCPointer<ByteVar>(), wszuserid.rawAddress.toCPointer<ByteVar>(), wszuseridtype.rawAddress.toCPointer<ByteVar>(), phuser.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr<UInt>, pbdecodeddata: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDecode(wszalgid.rawAddress.toCPointer<ByteVar>(), wszencodedstring.rawAddress.toCPointer<ByteVar>(), pudecodeddatalen.rawAddress.toCPointer<ByteVar>(), pbdecodeddata.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr<UInt>, wszcert: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(wszchain.rawAddress.toCPointer<ByteVar>(), iwhich, pccert.rawAddress.toCPointer<ByteVar>(), wszcert.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDecrypt(hcryptoprovider, iposition, cnuminbytes, pbindata.rawAddress.toCPointer<ByteVar>(), pcnumoutbytes.rawAddress.toCPointer<ByteVar>(), pboutdata.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(hsession, wszlicenseid.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(htocopy, phcopy.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(htocopy, phcopy.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(hpubin, phpubout.rawAddress.toCPointer<ByteVar>())

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(hsessionin, phsessionout.rawAddress.toCPointer<ByteVar>())

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr<UByte>, puencodedstringlen: MutPtr<UInt>, wszencodedstring: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMEncode(wszalgid.rawAddress.toCPointer<ByteVar>(), udatalen, pbdecodeddata.rawAddress.toCPointer<ByteVar>(), puencodedstringlen.rawAddress.toCPointer<ByteVar>(), wszencodedstring.rawAddress.toCPointer<ByteVar>())

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMEncrypt(hcryptoprovider, iposition, cnuminbytes, pbindata.rawAddress.toCPointer<ByteVar>(), pcnumoutbytes.rawAddress.toCPointer<ByteVar>(), pboutdata.rawAddress.toCPointer<ByteVar>())

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr<Bool>, pucertificatedatalen: MutPtr<UInt>, wszcertificatedata: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(hsession, uflags, uindex, pfsharedflag.rawAddress.toCPointer<ByteVar>(), pucertificatedatalen.rawAddress.toCPointer<ByteVar>(), wszcertificatedata.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr<UInt>, wszname: Pwstr, puvaluelength: MutPtr<UInt>, wszvalue: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(hissuancelicense, uindex, punamelength.rawAddress.toCPointer<ByteVar>(), wszname.rawAddress.toCPointer<ByteVar>(), puvaluelength.rawAddress.toCPointer<ByteVar>(), wszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(hqueryroot, wszattribute.rawAddress.toCPointer<ByteVar>(), iwhich, peencoding.rawAddress.toCPointer<ByteVar>(), pcbuffer.rawAddress.toCPointer<ByteVar>(), pbbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(hqueryroot, wszattribute.rawAddress.toCPointer<ByteVar>(), pcattributes.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(hqueryroot, wszsubobjecttype.rawAddress.toCPointer<ByteVar>(), iwhich, phsubobject.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(hqueryroot, wszsubobjecttype.rawAddress.toCPointer<ByteVar>(), pcsubobjects.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(wszchain.rawAddress.toCPointer<ByteVar>(), pccertcount.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr<DrmClientVersionInfo>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(pdrmclientversioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(handle, wszattribute.rawAddress.toCPointer<ByteVar>(), peencoding.rawAddress.toCPointer<ByteVar>(), pcbuffer.rawAddress.toCPointer<ByteVar>(), pbbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetInfo(handle, wszattribute.rawAddress.toCPointer<ByteVar>(), peencoding.rawAddress.toCPointer<ByteVar>(), pcbuffer.rawAddress.toCPointer<ByteVar>(), pbbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(hissuancelicense, pcdays.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, uflags: UInt, pudistributionpointnamelength: MutPtr<UInt>, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr<UInt>, wszdistributionpointurl: Pwstr, phowner: MutPtr<UInt>, pfofficial: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(hissuancelicense, psttimefrom.rawAddress.toCPointer<ByteVar>(), psttimeuntil.rawAddress.toCPointer<ByteVar>(), uflags, pudistributionpointnamelength.rawAddress.toCPointer<ByteVar>(), wszdistributionpointname.rawAddress.toCPointer<ByteVar>(), pudistributionpointurllength.rawAddress.toCPointer<ByteVar>(), wszdistributionpointurl.rawAddress.toCPointer<ByteVar>(), phowner.rawAddress.toCPointer<ByteVar>(), pfofficial.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr<UInt>, wszissuancelicensetemplate: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(hissuancelicense, puissuancelicensetemplatelength.rawAddress.toCPointer<ByteVar>(), wszissuancelicensetemplate.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr<UInt>, wszcontentid: Pwstr, pucontentidtypelength: MutPtr<UInt>, wszcontentidtype: Pwstr, puskuidlength: MutPtr<UInt>, wszskuid: Pwstr, puskuidtypelength: MutPtr<UInt>, wszskuidtype: Pwstr, pucontenttypelength: MutPtr<UInt>, wszcontenttype: Pwstr, pucontentnamelength: MutPtr<UInt>, wszcontentname: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetMetaData(hissuancelicense, pucontentidlength.rawAddress.toCPointer<ByteVar>(), wszcontentid.rawAddress.toCPointer<ByteVar>(), pucontentidtypelength.rawAddress.toCPointer<ByteVar>(), wszcontentidtype.rawAddress.toCPointer<ByteVar>(), puskuidlength.rawAddress.toCPointer<ByteVar>(), wszskuid.rawAddress.toCPointer<ByteVar>(), puskuidtypelength.rawAddress.toCPointer<ByteVar>(), wszskuidtype.rawAddress.toCPointer<ByteVar>(), pucontenttypelength.rawAddress.toCPointer<ByteVar>(), wszcontenttype.rawAddress.toCPointer<ByteVar>(), pucontentnamelength.rawAddress.toCPointer<ByteVar>(), wszcontentname.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr<UInt>, punamelength: MutPtr<UInt>, wszname: Pwstr, pudescriptionlength: MutPtr<UInt>, wszdescription: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(hissuancelicense, uindex, pulcid.rawAddress.toCPointer<ByteVar>(), punamelength.rawAddress.toCPointer<ByteVar>(), wszname.rawAddress.toCPointer<ByteVar>(), pudescriptionlength.rawAddress.toCPointer<ByteVar>(), wszdescription.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr<UInt>, wszownerlicense: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(hissuancelicense, puownerlicenselength.rawAddress.toCPointer<ByteVar>(), wszownerlicense.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr<Farproc>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(hlibrary, wszprocname.rawAddress.toCPointer<ByteVar>(), ppfnprocaddress.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr<UInt>, wszid: Pwstr, puidtypelength: MutPtr<UInt>, wszidtype: Pwstr, puurllength: MutPtr<UInt>, wszrl: Pwstr, pstfrequency: MutPtr<Systemtime>, punamelength: MutPtr<UInt>, wszname: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(hissuancelicense, puidlength.rawAddress.toCPointer<ByteVar>(), wszid.rawAddress.toCPointer<ByteVar>(), puidtypelength.rawAddress.toCPointer<ByteVar>(), wszidtype.rawAddress.toCPointer<ByteVar>(), puurllength.rawAddress.toCPointer<ByteVar>(), wszrl.rawAddress.toCPointer<ByteVar>(), pstfrequency.rawAddress.toCPointer<ByteVar>(), punamelength.rawAddress.toCPointer<ByteVar>(), wszname.rawAddress.toCPointer<ByteVar>(), pupublickeylength.rawAddress.toCPointer<ByteVar>(), wszpublickey.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr<UInt>, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr<UInt>, wszextendedinfovalue: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(hright, uindex, puextendedinfonamelength.rawAddress.toCPointer<ByteVar>(), wszextendedinfoname.rawAddress.toCPointer<ByteVar>(), puextendedinfovaluelength.rawAddress.toCPointer<ByteVar>(), wszextendedinfovalue.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr<UInt>, wszrightname: Pwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(hright, purightnamelength.rawAddress.toCPointer<ByteVar>(), wszrightname.rawAddress.toCPointer<ByteVar>(), pstfrom.rawAddress.toCPointer<ByteVar>(), pstuntil.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr<UInt>, wsztype: Pwstr, pupathlen: MutPtr<UInt>, wszpath: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(uflags, putypelen.rawAddress.toCPointer<ByteVar>(), wsztype.rawAddress.toCPointer<ByteVar>(), pupathlen.rawAddress.toCPointer<ByteVar>(), wszpath.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr<UInt>, wszserviceurl: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(hclient, uservicetype, uservicelocation, wszissuancelicense.rawAddress.toCPointer<ByteVar>(), puserviceurllength.rawAddress.toCPointer<ByteVar>(), wszserviceurl.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(henv, hissuancelicense, uflags, pbsymkey.rawAddress.toCPointer<ByteVar>(), cbsymkey, wszsymkeytype.rawAddress.toCPointer<ByteVar>(), wszclientlicensorcertificate.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), wszurl.rawAddress.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr<CVoid>, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(henv, hissuancelicense, uflags, pbsymkey.rawAddress.toCPointer<ByteVar>(), cbsymkey, wszsymkeytype.rawAddress.toCPointer<ByteVar>(), pvreserved.rawAddress.toCPointer<ByteVar>(), henablingprincipal, hboundlicenseclc, 0L.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr<Systemtime>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetTime(henv, etimeridtype, potimeobject.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(hqueryroot, wszattributetype.rawAddress.toCPointer<ByteVar>(), iwhich, peencoding.rawAddress.toCPointer<ByteVar>(), pcbuffer.rawAddress.toCPointer<ByteVar>(), pbbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(hqueryroot, wszattributetype.rawAddress.toCPointer<ByteVar>(), pcattributes.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(hqueryroot, wszsubobjecttype.rawAddress.toCPointer<ByteVar>(), iindex, phsubquery.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(hqueryroot, wszsubobjecttype.rawAddress.toCPointer<ByteVar>(), pcsubobjects.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr<DrmUsagepolicyType>, pfexclusion: MutPtr<Bool>, punamelength: MutPtr<UInt>, wszname: Pwstr, puminversionlength: MutPtr<UInt>, wszminversion: Pwstr, pumaxversionlength: MutPtr<UInt>, wszmaxversion: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr<UInt>, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr<UInt>, pbdigest: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(hissuancelicense, uindex, peusagepolicytype.rawAddress.toCPointer<ByteVar>(), pfexclusion.rawAddress.toCPointer<ByteVar>(), punamelength.rawAddress.toCPointer<ByteVar>(), wszname.rawAddress.toCPointer<ByteVar>(), puminversionlength.rawAddress.toCPointer<ByteVar>(), wszminversion.rawAddress.toCPointer<ByteVar>(), pumaxversionlength.rawAddress.toCPointer<ByteVar>(), wszmaxversion.rawAddress.toCPointer<ByteVar>(), pupublickeylength.rawAddress.toCPointer<ByteVar>(), wszpublickey.rawAddress.toCPointer<ByteVar>(), pudigestalgorithmlength.rawAddress.toCPointer<ByteVar>(), wszdigestalgorithm.rawAddress.toCPointer<ByteVar>(), pcbdigest.rawAddress.toCPointer<ByteVar>(), pbdigest.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr<UInt>, wszusername: Pwstr, puuseridlength: MutPtr<UInt>, wszuserid: Pwstr, puuseridtypelength: MutPtr<UInt>, wszuseridtype: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(huser, puusernamelength.rawAddress.toCPointer<ByteVar>(), wszusername.rawAddress.toCPointer<ByteVar>(), puuseridlength.rawAddress.toCPointer<ByteVar>(), wszuserid.rawAddress.toCPointer<ByteVar>(), puuseridtypelength.rawAddress.toCPointer<ByteVar>(), wszuseridtype.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUserRights(hissuancelicense, huser, uindex, phright.rawAddress.toCPointer<ByteVar>())

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMGetUsers(hissuancelicense, uindex, phuser.rawAddress.toCPointer<ByteVar>())

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr<UInt>, phdefaultlibrary: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider.rawAddress.toCPointer<ByteVar>(), wszmanifestcredentials.rawAddress.toCPointer<ByteVar>(), wszmachinecredentials.rawAddress.toCPointer<ByteVar>(), phenv.rawAddress.toCPointer<ByteVar>(), phdefaultlibrary.rawAddress.toCPointer<ByteVar>())

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr<DrmActservInfo>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMIsActivated(hclient, uflags, pactservinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(hwnd.rawAddress.toCPointer<ByteVar>(), pfprotected.rawAddress.toCPointer<ByteVar>())

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(henv, especification, wszlibraryprovider.rawAddress.toCPointer<ByteVar>(), wszcredentials.rawAddress.toCPointer<ByteVar>(), phlibrary.rawAddress.toCPointer<ByteVar>())

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(wszcertificate.rawAddress.toCPointer<ByteVar>(), phqueryroot.rawAddress.toCPointer<ByteVar>())

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister)

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(henv, hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(henv, wszrevocationlist.rawAddress.toCPointer<ByteVar>())

public actual fun dRMRepair(): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMRepair()

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(hissuancelicense, fdelete, wszname.rawAddress.toCPointer<ByteVar>(), wszvalue.rawAddress.toCPointer<ByteVar>())

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr<CVoid>, dwlen: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(eglobaloptions, pvdata.rawAddress.toCPointer<ByteVar>(), dwlen)

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense, cdays)

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetMetaData(hissuancelicense, wszcontentid.rawAddress.toCPointer<ByteVar>(), wszcontentidtype.rawAddress.toCPointer<ByteVar>(), wszskuid.rawAddress.toCPointer<ByteVar>(), wszskuidtype.rawAddress.toCPointer<ByteVar>(), wszcontenttype.rawAddress.toCPointer<ByteVar>(), wszcontentname.rawAddress.toCPointer<ByteVar>())

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(hissuancelicense, fdelete, lcid, wszname.rawAddress.toCPointer<ByteVar>(), wszdescription.rawAddress.toCPointer<ByteVar>())

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr<Systemtime>, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(hissuancelicense, fdelete, wszid.rawAddress.toCPointer<ByteVar>(), wszidtype.rawAddress.toCPointer<ByteVar>(), wszurl.rawAddress.toCPointer<ByteVar>(), pstfrequency.rawAddress.toCPointer<ByteVar>(), wszname.rawAddress.toCPointer<ByteVar>(), wszpublickey.rawAddress.toCPointer<ByteVar>())

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr<UByte>, cbdigest: UInt): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(hissuancelicense, eusagepolicytype, fdelete, fexclusion, wszname.rawAddress.toCPointer<ByteVar>(), wszminversion.rawAddress.toCPointer<ByteVar>(), wszmaxversion.rawAddress.toCPointer<ByteVar>(), wszpublickey.rawAddress.toCPointer<ByteVar>(), wszdigestalgorithm.rawAddress.toCPointer<ByteVar>(), pbdigest.rawAddress.toCPointer<ByteVar>(), cbdigest)

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr<UInt>, wszattesteddata: Pwstr, petype: MutPtr<Drmattesttype>, pcprincipal: MutPtr<UInt>, wszprincipal: Pwstr, pcmanifest: MutPtr<UInt>, wszmanifest: Pwstr): Hresult =
    windowssysWindowsWin32DataRightsmanagementDRMVerify(wszdata.rawAddress.toCPointer<ByteVar>(), pcattesteddata.rawAddress.toCPointer<ByteVar>(), wszattesteddata.rawAddress.toCPointer<ByteVar>(), petype.rawAddress.toCPointer<ByteVar>(), pcprincipal.rawAddress.toCPointer<ByteVar>(), wszprincipal.rawAddress.toCPointer<ByteVar>(), pcmanifest.rawAddress.toCPointer<ByteVar>(), wszmanifest.rawAddress.toCPointer<ByteVar>())
