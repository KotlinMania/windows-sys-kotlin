@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private object WindowsWin32SecurityCredentialsJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SecurityCredentialsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredDeleteA(targetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredDeleteW(targetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredEnumerateA(filter: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredEnumerateW(filter: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredFree(buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(maximumpersistcount: Int, maximumpersist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(targetname: Long, flags: Int, targetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(targetname: Long, flags: Int, targetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredIsProtectedA(pszprotectedcredentials: Long, pprotectiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredIsProtectedW(pszprotectedcredentials: Long, pprotectiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(credtype: Int, credential: Long, marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(credtype: Int, credential: Long, marshaledcredential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(dwflags: Int, pszusername: Long, pszpassword: Long, ppackedcredentials: Long, pcbpackedcredentials: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(dwflags: Int, pszusername: Long, pszpassword: Long, ppackedcredentials: Long, pcbpackedcredentials: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredProtectA(fasself: Int, pszcredentials: Long, cchcredentials: Int, pszprotectedcredentials: Long, pcchmaxchars: Long, protectiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredProtectW(fasself: Int, pszcredentials: Long, cchcredentials: Int, pszprotectedcredentials: Long, pcchmaxchars: Long, protectiontype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredReadA(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(targetinfo: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(targetinfo: Long, flags: Int, count: Long, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredReadW(targetname: Long, type: Int, flags: Int, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredRenameA(oldtargetname: Long, newtargetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredRenameW(oldtargetname: Long, newtargetname: Long, type: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(psztargetname: Long, pcontext: Long, dwautherror: Int, username: Long, uluserbuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(psztargetname: Long, pcontext: Long, dwautherror: Int, username: Long, uluserbuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(psztargetname: Long, bconfirm: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(psztargetname: Long, bconfirm: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(username: Long, user: Long, userbuffersize: Int, domain: Long, domainbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(username: Long, user: Long, userbuffersize: Int, domain: Long, domainbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(puiinfo: Long, psztargetname: Long, pcontext: Long, dwautherror: Int, pszusername: Long, ulusernamebuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, save: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(puiinfo: Long, psztargetname: Long, pcontext: Long, dwautherror: Int, pszusername: Long, ulusernamebuffersize: Int, pszpassword: Long, ulpasswordbuffersize: Int, save: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(puiinfo: Long, dwautherror: Int, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: Int, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(puiinfo: Long, dwautherror: Int, pulauthpackage: Long, pvinauthbuffer: Long, ulinauthbuffersize: Int, ppvoutauthbuffer: Long, puloutauthbuffersize: Long, pfsave: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(pszrealm: Long, ppszusername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(pszrealm: Long, pszusername: Long, pszpassword: Long, bpersist: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(dwflags: Int, pauthbuffer: Long, cbauthbuffer: Int, pszusername: Long, pcchlmaxusername: Long, pszdomainname: Long, pcchmaxdomainname: Long, pszpassword: Long, pcchmaxpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(dwflags: Int, pauthbuffer: Long, cbauthbuffer: Int, pszusername: Long, pcchmaxusername: Long, pszdomainname: Long, pcchmaxdomainname: Long, pszpassword: Long, pcchmaxpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(marshaledcredential: Long, credtype: Long, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(marshaledcredential: Long, credtype: Long, credential: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUnprotectA(fasself: Int, pszprotectedcredentials: Long, cchprotectedcredentials: Int, pszcredentials: Long, pcchmaxchars: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredUnprotectW(fasself: Int, pszprotectedcredentials: Long, cchprotectedcredentials: Int, pszcredentials: Long, pcchmaxchars: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredWriteA(credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(targetinfo: Long, credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(targetinfo: Long, credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsCredWriteW(credential: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(keycredentialmanagerinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(keycredentialmanagerinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: Int, isready: Long, keycredentialmanageroperationerrorstates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(hwndowner: Long, keycredentialmanageroperationtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext: Long, dwevent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardConnectA(hcontext: Long, szreader: Long, dwsharemode: Int, dwpreferredprotocols: Int, phcard: Long, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardConnectW(hcontext: Long, szreader: Long, dwsharemode: Int, dwpreferredprotocols: Int, phcard: Long, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardControl(hcard: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard: Long, dwdisposition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard: Long, dwdisposition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardEstablishContext(dwscope: Int, pvreserved1: Long, pvreserved2: Long, phcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(hcontext: Long, szcardname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(hcontext: Long, szcardname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(hcontext: Long, szreadername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(hcontext: Long, szreadername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardFreeMemory(hcontext: Long, pvmem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetAttrib(hcard: Long, dwattrid: Int, pbattr: Long, pcbattrlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long, pcchprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long, pcchprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(hcontext: Long, szreadername: Long, pdwdevicetypeid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(hcontext: Long, szreadername: Long, pdwdevicetypeid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(hcontext: Long, szcard: Long, pguidproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(hcontext: Long, szcard: Long, pguidproviderid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(hcontext: Long, szreadername: Long, szdeviceinstanceid: Long, pcchdeviceinstanceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(hcontext: Long, szreadername: Long, szdeviceinstanceid: Long, pcchdeviceinstanceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(hcontext: Long, szreadername: Long, pbicon: Long, pcbicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(hcontext: Long, szreadername: Long, pbicon: Long, pcbicon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(hcontext: Long, dwtimeout: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(hcontext: Long, dwtimeout: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(hcard: Long, pctransmitcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(hcontext: Long, szcardname: Long, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: Int, pbatr: Long, pbatrmask: Long, cbatrlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(hcontext: Long, szcardname: Long, pguidprimaryprovider: Long, rgguidinterfaces: Long, dwinterfacecount: Int, pbatr: Long, pbatrmask: Long, cbatrlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(hcontext: Long, szreadername: Long, szdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(hcontext: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(hcontext: Long, szreadername: Long, szdevicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListCardsA(hcontext: Long, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: Int, mszcards: Long, pcchcards: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListCardsW(hcontext: Long, pbatr: Long, rgquidinterfaces: Long, cguidinterfacecount: Int, mszcards: Long, pcchcards: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(hcontext: Long, szcard: Long, pguidinterfaces: Long, pcguidinterfaces: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(hcontext: Long, szcard: Long, pguidinterfaces: Long, pcguidinterfaces: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(hcontext: Long, mszgroups: Long, pcchgroups: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(hcontext: Long, mszgroups: Long, pcchgroups: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListReadersA(hcontext: Long, mszgroups: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListReadersW(hcontext: Long, mszgroups: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(hcontext: Long, szdeviceinstanceid: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(hcontext: Long, szdeviceinstanceid: Long, mszreaders: Long, pcchreaders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(hcontext: Long, mszcards: Long, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(hcontext: Long, rgatrmasks: Long, catrs: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(hcontext: Long, rgatrmasks: Long, catrs: Int, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(hcontext: Long, mszcards: Long, rgreaderstates: Long, creaders: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardReadCacheA(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardReadCacheW(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardReconnect(hcard: Long, dwsharemode: Int, dwpreferredprotocols: Int, dwinitialization: Int, pdwactiveprotocol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(hcontext: Long, szreadername: Long, szgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardSetAttrib(hcard: Long, dwattrid: Int, pbattr: Long, cbattrlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(hcontext: Long, szcardname: Long, dwproviderid: Int, szprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardState(hcard: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardStatusA(hcard: Long, mszreadernames: Long, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardStatusW(hcard: Long, mszreadernames: Long, pcchreaderlen: Long, pdwstate: Long, pdwprotocol: Long, pbatr: Long, pcbatrlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardTransmit(hcard: Long, piosendpci: Long, pbsendbuffer: Long, cbsendlength: Int, piorecvpci: Long, pbrecvbuffer: Long, pcbrecvlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(hcontext: Long, cardidentifier: Long, freshnesscounter: Int, lookupname: Long, data: Long, datalen: Int): Int
}

public actual fun credDeleteA(targetname: Pcstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredDeleteA(targetname.rawAddress, type.toInt(), flags.toInt())

public actual fun credDeleteW(targetname: Pcwstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredDeleteW(targetname.rawAddress, type.toInt(), flags.toInt())

public actual fun credEnumerateA(filter: Pcstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredEnumerateA(filter.rawAddress, flags.toInt(), count.rawAddress, credential.rawAddress)

public actual fun credEnumerateW(filter: Pcwstr, flags: CredEnumerateFlags, count: MutPtr, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredEnumerateW(filter.rawAddress, flags.toInt(), count.rawAddress, credential.rawAddress)

public actual fun credFindBestCredentialA(targetname: Pcstr, type: UInt, flags: UInt, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialA(targetname.rawAddress, type.toInt(), flags.toInt(), credential.rawAddress)

public actual fun credFindBestCredentialW(targetname: Pcwstr, type: UInt, flags: UInt, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredFindBestCredentialW(targetname.rawAddress, type.toInt(), flags.toInt(), credential.rawAddress)

public actual fun credFree(buffer: ConstPtr) {
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredFree(buffer.rawAddress)
}

public actual fun credGetSessionTypes(maximumpersistcount: UInt, maximumpersist: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredGetSessionTypes(maximumpersistcount.toInt(), maximumpersist.rawAddress)

public actual fun credGetTargetInfoA(targetname: Pcstr, flags: UInt, targetinfo: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoA(targetname.rawAddress, flags.toInt(), targetinfo.rawAddress)

public actual fun credGetTargetInfoW(targetname: Pcwstr, flags: UInt, targetinfo: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredGetTargetInfoW(targetname.rawAddress, flags.toInt(), targetinfo.rawAddress)

public actual fun credIsMarshaledCredentialA(marshaledcredential: Pcstr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialA(marshaledcredential.rawAddress)

public actual fun credIsMarshaledCredentialW(marshaledcredential: Pcwstr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredIsMarshaledCredentialW(marshaledcredential.rawAddress)

public actual fun credIsProtectedA(pszprotectedcredentials: Pcstr, pprotectiontype: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredIsProtectedA(pszprotectedcredentials.rawAddress, pprotectiontype.rawAddress)

public actual fun credIsProtectedW(pszprotectedcredentials: Pcwstr, pprotectiontype: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredIsProtectedW(pszprotectedcredentials.rawAddress, pprotectiontype.rawAddress)

public actual fun credMarshalCredentialA(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialA(credtype, credential.rawAddress, marshaledcredential.rawAddress)

public actual fun credMarshalCredentialW(credtype: CredMarshalType, credential: ConstPtr, marshaledcredential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredMarshalCredentialW(credtype, credential.rawAddress, marshaledcredential.rawAddress)

public actual fun credPackAuthenticationBufferA(dwflags: CredPackFlags, pszusername: Pcstr, pszpassword: Pcstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferA(dwflags.toInt(), pszusername.rawAddress, pszpassword.rawAddress, ppackedcredentials.rawAddress, pcbpackedcredentials.rawAddress)

public actual fun credPackAuthenticationBufferW(dwflags: CredPackFlags, pszusername: Pcwstr, pszpassword: Pcwstr, ppackedcredentials: MutPtr, pcbpackedcredentials: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredPackAuthenticationBufferW(dwflags.toInt(), pszusername.rawAddress, pszpassword.rawAddress, ppackedcredentials.rawAddress, pcbpackedcredentials.rawAddress)

public actual fun credProtectA(fasself: Bool, pszcredentials: Pcstr, cchcredentials: UInt, pszprotectedcredentials: Pstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredProtectA(fasself, pszcredentials.rawAddress, cchcredentials.toInt(), pszprotectedcredentials.rawAddress, pcchmaxchars.rawAddress, protectiontype.rawAddress)

public actual fun credProtectW(fasself: Bool, pszcredentials: Pcwstr, cchcredentials: UInt, pszprotectedcredentials: Pwstr, pcchmaxchars: MutPtr, protectiontype: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredProtectW(fasself, pszcredentials.rawAddress, cchcredentials.toInt(), pszprotectedcredentials.rawAddress, pcchmaxchars.rawAddress, protectiontype.rawAddress)

public actual fun credReadA(targetname: Pcstr, type: CredType, flags: UInt, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredReadA(targetname.rawAddress, type.toInt(), flags.toInt(), credential.rawAddress)

public actual fun credReadDomainCredentialsA(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsA(targetinfo.rawAddress, flags.toInt(), count.rawAddress, credential.rawAddress)

public actual fun credReadDomainCredentialsW(targetinfo: ConstPtr, flags: UInt, count: MutPtr, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredReadDomainCredentialsW(targetinfo.rawAddress, flags.toInt(), count.rawAddress, credential.rawAddress)

public actual fun credReadW(targetname: Pcwstr, type: CredType, flags: UInt, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredReadW(targetname.rawAddress, type.toInt(), flags.toInt(), credential.rawAddress)

public actual fun credRenameA(oldtargetname: Pcstr, newtargetname: Pcstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredRenameA(oldtargetname.rawAddress, newtargetname.rawAddress, type.toInt(), flags.toInt())

public actual fun credRenameW(oldtargetname: Pcwstr, newtargetname: Pcwstr, type: CredType, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredRenameW(oldtargetname.rawAddress, newtargetname.rawAddress, type.toInt(), flags.toInt())

public actual fun credUICmdLinePromptForCredentialsA(psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, username: Pstr, uluserbuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsA(psztargetname.rawAddress, pcontext.rawAddress, dwautherror.toInt(), username.rawAddress, uluserbuffersize.toInt(), pszpassword.rawAddress, ulpasswordbuffersize.toInt(), pfsave.rawAddress, dwflags.toInt()).toUInt()

public actual fun credUICmdLinePromptForCredentialsW(psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, username: Pwstr, uluserbuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, pfsave: MutPtr, dwflags: CreduiFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUICmdLinePromptForCredentialsW(psztargetname.rawAddress, pcontext.rawAddress, dwautherror.toInt(), username.rawAddress, uluserbuffersize.toInt(), pszpassword.rawAddress, ulpasswordbuffersize.toInt(), pfsave.rawAddress, dwflags.toInt()).toUInt()

public actual fun credUIConfirmCredentialsA(psztargetname: Pcstr, bconfirm: Bool): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsA(psztargetname.rawAddress, bconfirm).toUInt()

public actual fun credUIConfirmCredentialsW(psztargetname: Pcwstr, bconfirm: Bool): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIConfirmCredentialsW(psztargetname.rawAddress, bconfirm).toUInt()

public actual fun credUIParseUserNameA(username: Pcstr, user: Pstr, userbuffersize: UInt, domain: Pstr, domainbuffersize: UInt): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameA(username.rawAddress, user.rawAddress, userbuffersize.toInt(), domain.rawAddress, domainbuffersize.toInt()).toUInt()

public actual fun credUIParseUserNameW(username: Pcwstr, user: Pwstr, userbuffersize: UInt, domain: Pwstr, domainbuffersize: UInt): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIParseUserNameW(username.rawAddress, user.rawAddress, userbuffersize.toInt(), domain.rawAddress, domainbuffersize.toInt()).toUInt()

public actual fun credUIPromptForCredentialsA(puiinfo: ConstPtr, psztargetname: Pcstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pstr, ulusernamebuffersize: UInt, pszpassword: Pstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsA(puiinfo.rawAddress, psztargetname.rawAddress, pcontext.rawAddress, dwautherror.toInt(), pszusername.rawAddress, ulusernamebuffersize.toInt(), pszpassword.rawAddress, ulpasswordbuffersize.toInt(), save.rawAddress, dwflags.toInt()).toUInt()

public actual fun credUIPromptForCredentialsW(puiinfo: ConstPtr, psztargetname: Pcwstr, pcontext: ConstPtr, dwautherror: UInt, pszusername: Pwstr, ulusernamebuffersize: UInt, pszpassword: Pwstr, ulpasswordbuffersize: UInt, save: MutPtr, dwflags: CreduiFlags): Win32Error =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIPromptForCredentialsW(puiinfo.rawAddress, psztargetname.rawAddress, pcontext.rawAddress, dwautherror.toInt(), pszusername.rawAddress, ulusernamebuffersize.toInt(), pszpassword.rawAddress, ulpasswordbuffersize.toInt(), save.rawAddress, dwflags.toInt()).toUInt()

public actual fun credUIPromptForWindowsCredentialsA(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsA(puiinfo.rawAddress, dwautherror.toInt(), pulauthpackage.rawAddress, pvinauthbuffer.rawAddress, ulinauthbuffersize.toInt(), ppvoutauthbuffer.rawAddress, puloutauthbuffersize.rawAddress, pfsave.rawAddress, dwflags.toInt()).toUInt()

public actual fun credUIPromptForWindowsCredentialsW(puiinfo: ConstPtr, dwautherror: UInt, pulauthpackage: MutPtr, pvinauthbuffer: ConstPtr, ulinauthbuffersize: UInt, ppvoutauthbuffer: MutPtr, puloutauthbuffersize: MutPtr, pfsave: MutPtr, dwflags: CreduiwinFlags): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIPromptForWindowsCredentialsW(puiinfo.rawAddress, dwautherror.toInt(), pulauthpackage.rawAddress, pvinauthbuffer.rawAddress, ulinauthbuffersize.toInt(), ppvoutauthbuffer.rawAddress, puloutauthbuffersize.rawAddress, pfsave.rawAddress, dwflags.toInt()).toUInt()

public actual fun credUIReadSSOCredW(pszrealm: Pcwstr, ppszusername: MutPtr): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIReadSSOCredW(pszrealm.rawAddress, ppszusername.rawAddress).toUInt()

public actual fun credUIStoreSSOCredW(pszrealm: Pcwstr, pszusername: Pcwstr, pszpassword: Pcwstr, bpersist: Bool): UInt =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUIStoreSSOCredW(pszrealm.rawAddress, pszusername.rawAddress, pszpassword.rawAddress, bpersist).toUInt()

public actual fun credUnPackAuthenticationBufferA(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pstr, pcchlmaxusername: MutPtr, pszdomainname: Pstr, pcchmaxdomainname: MutPtr, pszpassword: Pstr, pcchmaxpassword: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferA(dwflags.toInt(), pauthbuffer.rawAddress, cbauthbuffer.toInt(), pszusername.rawAddress, pcchlmaxusername.rawAddress, pszdomainname.rawAddress, pcchmaxdomainname.rawAddress, pszpassword.rawAddress, pcchmaxpassword.rawAddress)

public actual fun credUnPackAuthenticationBufferW(dwflags: CredPackFlags, pauthbuffer: ConstPtr, cbauthbuffer: UInt, pszusername: Pwstr, pcchmaxusername: MutPtr, pszdomainname: Pwstr, pcchmaxdomainname: MutPtr, pszpassword: Pwstr, pcchmaxpassword: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUnPackAuthenticationBufferW(dwflags.toInt(), pauthbuffer.rawAddress, cbauthbuffer.toInt(), pszusername.rawAddress, pcchmaxusername.rawAddress, pszdomainname.rawAddress, pcchmaxdomainname.rawAddress, pszpassword.rawAddress, pcchmaxpassword.rawAddress)

public actual fun credUnmarshalCredentialA(marshaledcredential: Pcstr, credtype: MutPtr, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialA(marshaledcredential.rawAddress, credtype.rawAddress, credential.rawAddress)

public actual fun credUnmarshalCredentialW(marshaledcredential: Pcwstr, credtype: MutPtr, credential: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUnmarshalCredentialW(marshaledcredential.rawAddress, credtype.rawAddress, credential.rawAddress)

public actual fun credUnprotectA(fasself: Bool, pszprotectedcredentials: Pcstr, cchprotectedcredentials: UInt, pszcredentials: Pstr, pcchmaxchars: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUnprotectA(fasself, pszprotectedcredentials.rawAddress, cchprotectedcredentials.toInt(), pszcredentials.rawAddress, pcchmaxchars.rawAddress)

public actual fun credUnprotectW(fasself: Bool, pszprotectedcredentials: Pcwstr, cchprotectedcredentials: UInt, pszcredentials: Pwstr, pcchmaxchars: MutPtr): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredUnprotectW(fasself, pszprotectedcredentials.rawAddress, cchprotectedcredentials.toInt(), pszcredentials.rawAddress, pcchmaxchars.rawAddress)

public actual fun credWriteA(credential: ConstPtr, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredWriteA(credential.rawAddress, flags.toInt())

public actual fun credWriteDomainCredentialsA(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsA(targetinfo.rawAddress, credential.rawAddress, flags.toInt())

public actual fun credWriteDomainCredentialsW(targetinfo: ConstPtr, credential: ConstPtr, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredWriteDomainCredentialsW(targetinfo.rawAddress, credential.rawAddress, flags.toInt())

public actual fun credWriteW(credential: ConstPtr, flags: UInt): Bool =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsCredWriteW(credential.rawAddress, flags.toInt())

public actual fun getOpenCardNameA(param0: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameA(param0.rawAddress)

public actual fun getOpenCardNameW(param0: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsGetOpenCardNameW(param0.rawAddress)

public actual fun keyCredentialManagerFreeInformation(keycredentialmanagerinfo: ConstPtr) {
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerFreeInformation(keycredentialmanagerinfo.rawAddress)
}

public actual fun keyCredentialManagerGetInformation(keycredentialmanagerinfo: MutPtr): Hresult =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetInformation(keycredentialmanagerinfo.rawAddress)

public actual fun keyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype: KeyCredentialManagerOperationType, isready: MutPtr, keycredentialmanageroperationerrorstates: MutPtr): Hresult =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerGetOperationErrorStates(keycredentialmanageroperationtype, isready.rawAddress, keycredentialmanageroperationerrorstates.rawAddress)

public actual fun keyCredentialManagerShowUIOperation(hwndowner: Hwnd, keycredentialmanageroperationtype: KeyCredentialManagerOperationType): Hresult =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsKeyCredentialManagerShowUIOperation(hwndowner.rawAddress, keycredentialmanageroperationtype)

public actual fun sCardAccessStartedEvent(): Handle =
    MutPtr(WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardAccessStartedEvent())

public actual fun sCardAddReaderToGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupA(hcontext.toLong(), szreadername.rawAddress, szgroupname.rawAddress)

public actual fun sCardAddReaderToGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardAddReaderToGroupW(hcontext.toLong(), szreadername.rawAddress, szgroupname.rawAddress)

public actual fun sCardAudit(hcontext: ULong, dwevent: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardAudit(hcontext.toLong(), dwevent.toInt())

public actual fun sCardBeginTransaction(hcard: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardBeginTransaction(hcard.toLong())

public actual fun sCardCancel(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardCancel(hcontext.toLong())

public actual fun sCardConnectA(hcontext: ULong, szreader: Pcstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardConnectA(hcontext.toLong(), szreader.rawAddress, dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.rawAddress, pdwactiveprotocol.rawAddress)

public actual fun sCardConnectW(hcontext: ULong, szreader: Pcwstr, dwsharemode: UInt, dwpreferredprotocols: UInt, phcard: MutPtr, pdwactiveprotocol: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardConnectW(hcontext.toLong(), szreader.rawAddress, dwsharemode.toInt(), dwpreferredprotocols.toInt(), phcard.rawAddress, pdwactiveprotocol.rawAddress)

public actual fun sCardControl(hcard: ULong, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardControl(hcard.toLong(), dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress)

public actual fun sCardDisconnect(hcard: ULong, dwdisposition: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardDisconnect(hcard.toLong(), dwdisposition.toInt())

public actual fun sCardDlgExtendedError(): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardDlgExtendedError()

public actual fun sCardEndTransaction(hcard: ULong, dwdisposition: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardEndTransaction(hcard.toLong(), dwdisposition.toInt())

public actual fun sCardEstablishContext(dwscope: ScardScope, pvreserved1: ConstPtr, pvreserved2: ConstPtr, phcontext: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardEstablishContext(dwscope.toInt(), pvreserved1.rawAddress, pvreserved2.rawAddress, phcontext.rawAddress)

public actual fun sCardForgetCardTypeA(hcontext: ULong, szcardname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeA(hcontext.toLong(), szcardname.rawAddress)

public actual fun sCardForgetCardTypeW(hcontext: ULong, szcardname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardForgetCardTypeW(hcontext.toLong(), szcardname.rawAddress)

public actual fun sCardForgetReaderA(hcontext: ULong, szreadername: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderA(hcontext.toLong(), szreadername.rawAddress)

public actual fun sCardForgetReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupA(hcontext.toLong(), szgroupname.rawAddress)

public actual fun sCardForgetReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderGroupW(hcontext.toLong(), szgroupname.rawAddress)

public actual fun sCardForgetReaderW(hcontext: ULong, szreadername: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardForgetReaderW(hcontext.toLong(), szreadername.rawAddress)

public actual fun sCardFreeMemory(hcontext: ULong, pvmem: ConstPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardFreeMemory(hcontext.toLong(), pvmem.rawAddress)

public actual fun sCardGetAttrib(hcard: ULong, dwattrid: UInt, pbattr: MutPtr, pcbattrlen: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetAttrib(hcard.toLong(), dwattrid.toInt(), pbattr.rawAddress, pcbattrlen.rawAddress)

public actual fun sCardGetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pstr, pcchprovider: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameA(hcontext.toLong(), szcardname.rawAddress, dwproviderid.toInt(), szprovider.rawAddress, pcchprovider.rawAddress)

public actual fun sCardGetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pwstr, pcchprovider: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetCardTypeProviderNameW(hcontext.toLong(), szcardname.rawAddress, dwproviderid.toInt(), szprovider.rawAddress, pcchprovider.rawAddress)

public actual fun sCardGetDeviceTypeIdA(hcontext: ULong, szreadername: Pcstr, pdwdevicetypeid: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdA(hcontext.toLong(), szreadername.rawAddress, pdwdevicetypeid.rawAddress)

public actual fun sCardGetDeviceTypeIdW(hcontext: ULong, szreadername: Pcwstr, pdwdevicetypeid: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetDeviceTypeIdW(hcontext.toLong(), szreadername.rawAddress, pdwdevicetypeid.rawAddress)

public actual fun sCardGetProviderIdA(hcontext: ULong, szcard: Pcstr, pguidproviderid: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdA(hcontext.toLong(), szcard.rawAddress, pguidproviderid.rawAddress)

public actual fun sCardGetProviderIdW(hcontext: ULong, szcard: Pcwstr, pguidproviderid: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetProviderIdW(hcontext.toLong(), szcard.rawAddress, pguidproviderid.rawAddress)

public actual fun sCardGetReaderDeviceInstanceIdA(hcontext: ULong, szreadername: Pcstr, szdeviceinstanceid: Pstr, pcchdeviceinstanceid: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdA(hcontext.toLong(), szreadername.rawAddress, szdeviceinstanceid.rawAddress, pcchdeviceinstanceid.rawAddress)

public actual fun sCardGetReaderDeviceInstanceIdW(hcontext: ULong, szreadername: Pcwstr, szdeviceinstanceid: Pwstr, pcchdeviceinstanceid: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetReaderDeviceInstanceIdW(hcontext.toLong(), szreadername.rawAddress, szdeviceinstanceid.rawAddress, pcchdeviceinstanceid.rawAddress)

public actual fun sCardGetReaderIconA(hcontext: ULong, szreadername: Pcstr, pbicon: MutPtr, pcbicon: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconA(hcontext.toLong(), szreadername.rawAddress, pbicon.rawAddress, pcbicon.rawAddress)

public actual fun sCardGetReaderIconW(hcontext: ULong, szreadername: Pcwstr, pbicon: MutPtr, pcbicon: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetReaderIconW(hcontext.toLong(), szreadername.rawAddress, pbicon.rawAddress, pcbicon.rawAddress)

public actual fun sCardGetStatusChangeA(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeA(hcontext.toLong(), dwtimeout.toInt(), rgreaderstates.rawAddress, creaders.toInt())

public actual fun sCardGetStatusChangeW(hcontext: ULong, dwtimeout: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetStatusChangeW(hcontext.toLong(), dwtimeout.toInt(), rgreaderstates.rawAddress, creaders.toInt())

public actual fun sCardGetTransmitCount(hcard: ULong, pctransmitcount: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardGetTransmitCount(hcard.toLong(), pctransmitcount.rawAddress)

public actual fun sCardIntroduceCardTypeA(hcontext: ULong, szcardname: Pcstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeA(hcontext.toLong(), szcardname.rawAddress, pguidprimaryprovider.rawAddress, rgguidinterfaces.rawAddress, dwinterfacecount.toInt(), pbatr.rawAddress, pbatrmask.rawAddress, cbatrlen.toInt())

public actual fun sCardIntroduceCardTypeW(hcontext: ULong, szcardname: Pcwstr, pguidprimaryprovider: ConstPtr, rgguidinterfaces: ConstPtr, dwinterfacecount: UInt, pbatr: ConstPtr, pbatrmask: ConstPtr, cbatrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIntroduceCardTypeW(hcontext.toLong(), szcardname.rawAddress, pguidprimaryprovider.rawAddress, rgguidinterfaces.rawAddress, dwinterfacecount.toInt(), pbatr.rawAddress, pbatrmask.rawAddress, cbatrlen.toInt())

public actual fun sCardIntroduceReaderA(hcontext: ULong, szreadername: Pcstr, szdevicename: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderA(hcontext.toLong(), szreadername.rawAddress, szdevicename.rawAddress)

public actual fun sCardIntroduceReaderGroupA(hcontext: ULong, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupA(hcontext.toLong(), szgroupname.rawAddress)

public actual fun sCardIntroduceReaderGroupW(hcontext: ULong, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderGroupW(hcontext.toLong(), szgroupname.rawAddress)

public actual fun sCardIntroduceReaderW(hcontext: ULong, szreadername: Pcwstr, szdevicename: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIntroduceReaderW(hcontext.toLong(), szreadername.rawAddress, szdevicename.rawAddress)

public actual fun sCardIsValidContext(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardIsValidContext(hcontext.toLong())

public actual fun sCardListCardsA(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pstr, pcchcards: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListCardsA(hcontext.toLong(), pbatr.rawAddress, rgquidinterfaces.rawAddress, cguidinterfacecount.toInt(), mszcards.rawAddress, pcchcards.rawAddress)

public actual fun sCardListCardsW(hcontext: ULong, pbatr: ConstPtr, rgquidinterfaces: ConstPtr, cguidinterfacecount: UInt, mszcards: Pwstr, pcchcards: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListCardsW(hcontext.toLong(), pbatr.rawAddress, rgquidinterfaces.rawAddress, cguidinterfacecount.toInt(), mszcards.rawAddress, pcchcards.rawAddress)

public actual fun sCardListInterfacesA(hcontext: ULong, szcard: Pcstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesA(hcontext.toLong(), szcard.rawAddress, pguidinterfaces.rawAddress, pcguidinterfaces.rawAddress)

public actual fun sCardListInterfacesW(hcontext: ULong, szcard: Pcwstr, pguidinterfaces: MutPtr, pcguidinterfaces: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListInterfacesW(hcontext.toLong(), szcard.rawAddress, pguidinterfaces.rawAddress, pcguidinterfaces.rawAddress)

public actual fun sCardListReaderGroupsA(hcontext: ULong, mszgroups: Pstr, pcchgroups: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsA(hcontext.toLong(), mszgroups.rawAddress, pcchgroups.rawAddress)

public actual fun sCardListReaderGroupsW(hcontext: ULong, mszgroups: Pwstr, pcchgroups: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListReaderGroupsW(hcontext.toLong(), mszgroups.rawAddress, pcchgroups.rawAddress)

public actual fun sCardListReadersA(hcontext: ULong, mszgroups: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListReadersA(hcontext.toLong(), mszgroups.rawAddress, mszreaders.rawAddress, pcchreaders.rawAddress)

public actual fun sCardListReadersW(hcontext: ULong, mszgroups: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListReadersW(hcontext.toLong(), mszgroups.rawAddress, mszreaders.rawAddress, pcchreaders.rawAddress)

public actual fun sCardListReadersWithDeviceInstanceIdA(hcontext: ULong, szdeviceinstanceid: Pcstr, mszreaders: Pstr, pcchreaders: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdA(hcontext.toLong(), szdeviceinstanceid.rawAddress, mszreaders.rawAddress, pcchreaders.rawAddress)

public actual fun sCardListReadersWithDeviceInstanceIdW(hcontext: ULong, szdeviceinstanceid: Pcwstr, mszreaders: Pwstr, pcchreaders: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardListReadersWithDeviceInstanceIdW(hcontext.toLong(), szdeviceinstanceid.rawAddress, mszreaders.rawAddress, pcchreaders.rawAddress)

public actual fun sCardLocateCardsA(hcontext: ULong, mszcards: Pcstr, rgreaderstates: MutPtr, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsA(hcontext.toLong(), mszcards.rawAddress, rgreaderstates.rawAddress, creaders.toInt())

public actual fun sCardLocateCardsByATRA(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRA(hcontext.toLong(), rgatrmasks.rawAddress, catrs.toInt(), rgreaderstates.rawAddress, creaders.toInt())

public actual fun sCardLocateCardsByATRW(hcontext: ULong, rgatrmasks: ConstPtr, catrs: UInt, rgreaderstates: MutPtr, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsByATRW(hcontext.toLong(), rgatrmasks.rawAddress, catrs.toInt(), rgreaderstates.rawAddress, creaders.toInt())

public actual fun sCardLocateCardsW(hcontext: ULong, mszcards: Pcwstr, rgreaderstates: MutPtr, creaders: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardLocateCardsW(hcontext.toLong(), mszcards.rawAddress, rgreaderstates.rawAddress, creaders.toInt())

public actual fun sCardReadCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: MutPtr, datalen: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardReadCacheA(hcontext.toLong(), cardidentifier.rawAddress, freshnesscounter.toInt(), lookupname.rawAddress, data.rawAddress, datalen.rawAddress)

public actual fun sCardReadCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: MutPtr, datalen: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardReadCacheW(hcontext.toLong(), cardidentifier.rawAddress, freshnesscounter.toInt(), lookupname.rawAddress, data.rawAddress, datalen.rawAddress)

public actual fun sCardReconnect(hcard: ULong, dwsharemode: UInt, dwpreferredprotocols: UInt, dwinitialization: UInt, pdwactiveprotocol: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardReconnect(hcard.toLong(), dwsharemode.toInt(), dwpreferredprotocols.toInt(), dwinitialization.toInt(), pdwactiveprotocol.rawAddress)

public actual fun sCardReleaseContext(hcontext: ULong): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardReleaseContext(hcontext.toLong())

public actual fun sCardReleaseStartedEvent() {
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardReleaseStartedEvent()
}

public actual fun sCardRemoveReaderFromGroupA(hcontext: ULong, szreadername: Pcstr, szgroupname: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupA(hcontext.toLong(), szreadername.rawAddress, szgroupname.rawAddress)

public actual fun sCardRemoveReaderFromGroupW(hcontext: ULong, szreadername: Pcwstr, szgroupname: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardRemoveReaderFromGroupW(hcontext.toLong(), szreadername.rawAddress, szgroupname.rawAddress)

public actual fun sCardSetAttrib(hcard: ULong, dwattrid: UInt, pbattr: ConstPtr, cbattrlen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardSetAttrib(hcard.toLong(), dwattrid.toInt(), pbattr.rawAddress, cbattrlen.toInt())

public actual fun sCardSetCardTypeProviderNameA(hcontext: ULong, szcardname: Pcstr, dwproviderid: UInt, szprovider: Pcstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameA(hcontext.toLong(), szcardname.rawAddress, dwproviderid.toInt(), szprovider.rawAddress)

public actual fun sCardSetCardTypeProviderNameW(hcontext: ULong, szcardname: Pcwstr, dwproviderid: UInt, szprovider: Pcwstr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardSetCardTypeProviderNameW(hcontext.toLong(), szcardname.rawAddress, dwproviderid.toInt(), szprovider.rawAddress)

public actual fun sCardState(hcard: ULong, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardState(hcard.toLong(), pdwstate.rawAddress, pdwprotocol.rawAddress, pbatr.rawAddress, pcbatrlen.rawAddress)

public actual fun sCardStatusA(hcard: ULong, mszreadernames: Pstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardStatusA(hcard.toLong(), mszreadernames.rawAddress, pcchreaderlen.rawAddress, pdwstate.rawAddress, pdwprotocol.rawAddress, pbatr.rawAddress, pcbatrlen.rawAddress)

public actual fun sCardStatusW(hcard: ULong, mszreadernames: Pwstr, pcchreaderlen: MutPtr, pdwstate: MutPtr, pdwprotocol: MutPtr, pbatr: MutPtr, pcbatrlen: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardStatusW(hcard.toLong(), mszreadernames.rawAddress, pcchreaderlen.rawAddress, pdwstate.rawAddress, pdwprotocol.rawAddress, pbatr.rawAddress, pcbatrlen.rawAddress)

public actual fun sCardTransmit(hcard: ULong, piosendpci: ConstPtr, pbsendbuffer: ConstPtr, cbsendlength: UInt, piorecvpci: MutPtr, pbrecvbuffer: MutPtr, pcbrecvlength: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardTransmit(hcard.toLong(), piosendpci.rawAddress, pbsendbuffer.rawAddress, cbsendlength.toInt(), piorecvpci.rawAddress, pbrecvbuffer.rawAddress, pcbrecvlength.rawAddress)

public actual fun sCardUIDlgSelectCardA(param0: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardA(param0.rawAddress)

public actual fun sCardUIDlgSelectCardW(param0: MutPtr): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardUIDlgSelectCardW(param0.rawAddress)

public actual fun sCardWriteCacheA(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcstr, data: ConstPtr, datalen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheA(hcontext.toLong(), cardidentifier.rawAddress, freshnesscounter.toInt(), lookupname.rawAddress, data.rawAddress, datalen.toInt())

public actual fun sCardWriteCacheW(hcontext: ULong, cardidentifier: ConstPtr, freshnesscounter: UInt, lookupname: Pcwstr, data: ConstPtr, datalen: UInt): Int =
    WindowsWin32SecurityCredentialsJniBridge.windowssysWindowsWin32SecurityCredentialsSCardWriteCacheW(hcontext.toLong(), cardidentifier.rawAddress, freshnesscounter.toInt(), lookupname.rawAddress, data.rawAddress, datalen.toInt())
