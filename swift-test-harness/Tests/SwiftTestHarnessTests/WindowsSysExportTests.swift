import WindowsSys
import Testing

@Suite
struct WindowsSysExportTests {
    @Test
    func swiftModuleLoads() {
        #expect(Bool(true), "WindowsSys swift module imported cleanly")
    }

    @Test
    func swiftConsoleTypesWork() {
        typealias WinConsole = ExportedKotlinPackages.io.github.kotlinmania.windowssys.windows.win32.system.console
        let coord = WinConsole.COORD(X: 80, Y: 25)
        #expect(coord.X == 80)
        #expect(coord.Y == 25)
        #expect(WinConsole.CTRL_C_EVENT == 0)
        #expect(WinConsole.CTRL_BREAK_EVENT == 1)
    }
}
