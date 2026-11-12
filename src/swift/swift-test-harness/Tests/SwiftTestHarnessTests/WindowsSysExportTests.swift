#if canImport(Testing)
import Foundation
import RustLang
import Testing
import WindowsSys

@Suite("WindowsSys Swift Export Tests")
struct WindowsSysExportTests {
    @Test("Exported Win32 constants and GUID values match upstream ABI")
    func testExportedConstantsAndGuids() throws {
        typealias FoundationPkg = ExportedKotlinPackages.io.github.kotlinmania.windowssys.windows.win32.foundation
        typealias ThreadingPkg = ExportedKotlinPackages.io.github.kotlinmania.windowssys.windows.win32.system.threading
        typealias ShellPkg = ExportedKotlinPackages.io.github.kotlinmania.windowssys.windows.win32.ui.shell

        #expect(FoundationPkg.ERROR_SUCCESS == 0)
        #expect(FoundationPkg.ERROR_FILE_NOT_FOUND == 2)
        #expect(FoundationPkg.INVALID_HANDLE_VALUE.rawAddress == -1)
        #expect(ThreadingPkg.INFINITE == 0xFFFF_FFFF)
        #expect(ShellPkg.FOLDERID_DESKTOP.data1 == 0xB4BFCC3A)
        #expect(ShellPkg.FOLDERID_PROFILE.data1 == 0x5E6C858F)
    }

    @Test("Exported Win32 structs preserve raw ABI fields")
    func testExportedStructs() throws {
        typealias ConsolePkg = ExportedKotlinPackages.io.github.kotlinmania.windowssys.windows.win32.system.console
        typealias FoundationPkg = ExportedKotlinPackages.io.github.kotlinmania.windowssys.windows.win32.foundation

        let coord = ConsolePkg.Coord(x: 12, y: 34)
        #expect(coord.x == 12)
        #expect(coord.y == 34)

        let ft = FoundationPkg.Filetime(dwLowDateTime: 0x1122_3344, dwHighDateTime: 0x5566_7788)
        #expect(ft.dwLowDateTime == 0x1122_3344)
        #expect(ft.dwHighDateTime == 0x5566_7788)
    }
}
#endif
