package me.superckl.recipetooltips.util;

import org.apache.logging.log4j.Level;

import me.superckl.recipetooltips.reference.ModData;
import net.minecraftforge.fml.common.FMLLog;

public class LogHelper {

	public static void log(final Level logLevel, final Object object)
	{
		FMLLog.log(ModData.NAME, logLevel, String.valueOf(object));
	}

	public static void all(final Object object)
	{
		LogHelper.log(Level.ALL, object);
	}

	public static void debug(final Object object)
	{
		LogHelper.log(Level.DEBUG, object);
	}

	public static void error(final Object object)
	{
		LogHelper.log(Level.ERROR, object);
	}

	public static void fatal(final Object object)
	{
		LogHelper.log(Level.FATAL, object);
	}

	public static void info(final Object object)
	{
		LogHelper.log(Level.INFO, object);
	}

	public static void off(final Object object)
	{
		LogHelper.log(Level.OFF, object);
	}

	public static void trace(final Object object)
	{
		LogHelper.log(Level.TRACE, object);
	}

	public static void warn(final Object object)
	{
		LogHelper.log(Level.WARN, object);
	}

}
